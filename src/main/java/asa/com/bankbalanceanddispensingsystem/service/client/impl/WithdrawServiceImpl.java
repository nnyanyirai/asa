package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.exception.AsaException;
import asa.com.bankbalanceanddispensingsystem.models.atm.Atm;
import asa.com.bankbalanceanddispensingsystem.models.atm.AtmAllocation;
import asa.com.bankbalanceanddispensingsystem.models.atm.Denomination;
import asa.com.bankbalanceanddispensingsystem.models.client.AccountType;
import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawRequestDto;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawResponseDto;
import asa.com.bankbalanceanddispensingsystem.repository.atm.AtmAllocationRepository;
import asa.com.bankbalanceanddispensingsystem.repository.atm.AtmRepository;
import asa.com.bankbalanceanddispensingsystem.repository.atm.DenominationRepository;
import asa.com.bankbalanceanddispensingsystem.repository.client.AccountTypeRepository;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientAccountRepository;
import asa.com.bankbalanceanddispensingsystem.service.client.WithdrawService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
  public WithdrawResponseDto withdrawCash(WithdrawRequestDto withdrawRequestDto) {
    int chequeOverdraftLimit=10000;
    Optional<ClientAccount> clientAccountOptional = clientAccountRepository
        .findByClientAccountNumber(withdrawRequestDto.getAccountNumber());
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
      if ((clientAccount.getAccountTypeCode().equals("CHQ")) && (Double.parseDouble((clientAccount.getDisplayBalance()).toPlainString() + chequeOverdraftLimit) <  withdrawRequestDto
          .getAmount())){
        throw new AsaException("Insufficient funds");
      } else if (Double.parseDouble((clientAccount.getDisplayBalance()).toPlainString()) <  withdrawRequestDto
          .getAmount()){
        throw new AsaException("Insufficient funds");
      }
    }
    //denominations and ATM
    // get Atm
    Optional<Atm> atmOptional = atmRepository.findByName(withdrawRequestDto.getAtmName());
    if (!atmOptional.isPresent()){
      throw new AsaException("ATM not registered or unfunded");
    }
    Atm atm = atmOptional.get();
    Collection<AtmAllocation> atmAllocationCollection = atm.getAtmAllocationsByAtmId();

    //check denominations on an atm
    List<Denomination> denominations = new ArrayList<>();
    atmAllocationCollection.forEach(atmAllocation -> {
      Denomination denomination = atmAllocation.getDenominationByDenominationId();
      denominations.add(denomination);
    });
    denominations.sort((o1, o2) -> {
      double first = o1.getValue();
      double second = o2.getValue();
      return Double.compare(second,first);
    });

    double remaining = withdrawRequestDto.getAmount();
    Map<Integer,Integer> denominationValueCountMap = new HashMap<>();
    for (Denomination denomination : denominations) {
      //todo check if notes are enough
      int count = (int) remaining / denomination.getValue();
      remaining = remaining % denomination.getValue();
      System.out.println("inside " + remaining);
      denominationValueCountMap.put(denomination.getValue(), count);
    }
    System.out.println(denominationValueCountMap);
    System.out.println(remaining);
    double nextAvailable = 0.0;
    for (Entry<Integer, Integer> entry : denominationValueCountMap.entrySet()) {
      Integer integer1 = entry.getKey();
      Integer integer2 = entry.getValue();
      double val = integer1 * integer2;
      nextAvailable += val;
    }
    if (remaining!=0.0){
      throw new AsaException("Amount not available, would you like to draw " + nextAvailable);
    }

    //todo update ATM allocation

    //update client account
    clientAccount.setDisplayBalance(
        BigDecimal.valueOf(Double.parseDouble(clientAccount.getDisplayBalance().toPlainString()) - withdrawRequestDto
            .getAmount()));
    ClientAccount withdrawDto1 = clientAccountRepository.save(clientAccount);
    WithdrawResponseDto responseDto = new WithdrawResponseDto();
    responseDto.setAmount(withdrawRequestDto.getAmount());
    responseDto.setAtmName(atm.getName());
    responseDto.setClientId(withdrawRequestDto.getClientId());
    responseDto.setNewAccountBalance(withdrawDto1.getDisplayBalance());
    responseDto.setAccountNumber(withdrawDto1.getClientAccountNumber());
    Map<String,Integer> notesDispensed = new HashMap<>();
    for (Entry<Integer, Integer> entry : denominationValueCountMap.entrySet()) {
      Integer integer1 = entry.getKey();
      Integer integer2 = entry.getValue();
      if (integer2!=0){
        String message = "Number of R" + integer1 + " notes";
        notesDispensed.put(message,integer2);
      }
    }
    responseDto.setNotesDispensed(notesDispensed);
    return responseDto;

  }
}
