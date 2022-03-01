package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.exception.AsaException;
import asa.com.bankbalanceanddispensingsystem.models.atm.Atm;
import asa.com.bankbalanceanddispensingsystem.models.atm.AtmAllocation;
import asa.com.bankbalanceanddispensingsystem.models.atm.Denomination;
import asa.com.bankbalanceanddispensingsystem.models.client.AccountType;
import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawDto;
import asa.com.bankbalanceanddispensingsystem.repository.atm.AtmAllocationRepository;
import asa.com.bankbalanceanddispensingsystem.repository.atm.AtmRepository;
import asa.com.bankbalanceanddispensingsystem.repository.atm.DenominationRepository;
import asa.com.bankbalanceanddispensingsystem.repository.client.AccountTypeRepository;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientAccountRepository;
import asa.com.bankbalanceanddispensingsystem.service.client.WithdrawService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WithdrawServiceImpl implements WithdrawService {

  @Autowired
  private ClientAccountRepository clientAccountRepository;

  @Autowired
  private AtmRepository atmRepository;

  @Autowired
  private AtmAllocationRepository atmAllocationRepository;

   @Autowired
  private AccountTypeRepository accountTypeRepository;

   @Autowired
  private DenominationRepository denominationRepository;

  //inject clientAccount
  // client account
  //client Balance
//
  @Override
  public ClientAccount withdrawCash(WithdrawDto withdrawDto) {
    int chequeOverdraftLimit=10000;
    Optional<ClientAccount> clientAccountOptional = clientAccountRepository
        .findByClientAccountNumber(withdrawDto.getAccountNumber());
    if (!clientAccountOptional.isPresent()){
      throw new AsaException("Client Account does not exist");
    }

    ClientAccount clientAccount = clientAccountOptional.get();
//    check if account is transactional
    Optional<AccountType> optionalAccountType = Optional
        .ofNullable(accountTypeRepository.getByAccountTypeCode(clientAccount.getAccountTypeCode()));
    if (!optionalAccountType.isPresent()){
      throw new AsaException("Account type code does not exist");
    }
    AccountType accountType=optionalAccountType.get();

    if(accountType.getTransactional()){
      // checking for cheque and balance
      if ((clientAccount.getAccountTypeCode().equals("CHQ")) && (Double.parseDouble((clientAccount.getDisplayBalance()).toPlainString() + chequeOverdraftLimit) <  withdrawDto.getAmount())){
        throw new AsaException("Insufficient funds");
      } else if (Double.parseDouble((clientAccount.getDisplayBalance()).toPlainString()) <  withdrawDto.getAmount()){
        throw new AsaException("Insufficient funds");
      }
    }
    //denominations and ATM
    // get Atm
    Optional<Atm> atmOptional = atmRepository.findByName(withdrawDto.getAtmName());
    if (!atmOptional.isPresent()){
      throw new AsaException("atm not valid");
    }
    Atm atm = atmOptional.get();
    Collection<AtmAllocation> atmAllocationCollection = atm.getAtmAllocationsByAtmId();

    //check denominations on an atm
    List<Denomination> denominations = new ArrayList<>();
    atmAllocationCollection.forEach(atmAllocation -> {
      Denomination denomination = atmAllocation.getDenominationByDenominationId();
      denominations.add(denomination);
    });

    // get value of atm denomination(value * denomination)

    // withdraw process
    clientAccount.setDisplayBalance(
        BigDecimal.valueOf(Double.parseDouble(clientAccount.getDisplayBalance().toPlainString()) - withdrawDto.getAmount()));
    ClientAccount withdrawDto1 = clientAccountRepository.save(clientAccount);
    return withdrawDto1;

  }
}
