package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.exception.AsaException;
import asa.com.bankbalanceanddispensingsystem.models.client.Client;
import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.DisplayCurrencyAccountsDto;
import asa.com.bankbalanceanddispensingsystem.models.dto.DisplayTransactionalBalancesDto;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientAccountRepository;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientRepository;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientAccountService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientAccountServiceImpl implements ClientAccountService {
    @Autowired
    private ClientAccountRepository clientAccountRepository;
    @Autowired
    private ClientRepository clientRepository;



    @Override
    public ClientAccount createClientAccount(ClientAccount clientAccount) {
        return null;
    }

    @Override
    public ClientAccount updateClientAccount(Integer Id, ClientAccount clientAccount) {
        return null;
    }

    @Override
    public Iterable<ClientAccount> getAllClientsAccounts() {
        return clientAccountRepository.findAll();
    }

    @Override
    public List<DisplayTransactionalBalancesDto> getClientAccountsById(Integer Id) {
        List<ClientAccount> clients = clientAccountRepository.findByClientId(Id);
        if(clients.isEmpty()){
            throw new AsaException("No accounts to display");
        }
        List<DisplayTransactionalBalancesDto> myAccounts =new ArrayList<>();
        for (ClientAccount clientAccount: clients) {

            DisplayTransactionalBalancesDto displayTransactionalBalances =new DisplayTransactionalBalancesDto();
            displayTransactionalBalances.setClientId(clientAccount.getClientId().toString());
            displayTransactionalBalances.setAccountBalance(clientAccount.getDisplayBalance().toString());
            displayTransactionalBalances.setAccountType(clientAccount.getAccountTypeByAccountTypeCode().getDescription());
            displayTransactionalBalances.setAccountNumber(clientAccount.getClientAccountNumber());
            myAccounts.add(displayTransactionalBalances);
        }
        return myAccounts;
    }
    @Override
    public List<DisplayCurrencyAccountsDto> getClientCurrencyAccountsById(Integer Id) {
        List<ClientAccount> clientsAccounts = clientAccountRepository.findByClientId(Id);
        if(clientsAccounts.isEmpty()){
            throw new AsaException("No accounts to display");
        }
        List<DisplayCurrencyAccountsDto> getCurrencyAccounts = new ArrayList<>();
            for(ClientAccount clientAccount:clientsAccounts){

                DisplayCurrencyAccountsDto displayCurrencyAccountsDto =new DisplayCurrencyAccountsDto();
                displayCurrencyAccountsDto.setCurrency(clientAccount.getCurrencyCode());
                displayCurrencyAccountsDto.setAccountNumber(clientAccount.getClientAccountNumber());
                displayCurrencyAccountsDto.setCurrencyBalance(clientAccount.getDisplayBalance().toString());
                displayCurrencyAccountsDto.setConversionRate(clientAccount.getCurrencyByCurrencyCode().getCurrencyConversionRateByCurrencyCode().getRate().toString());
                displayCurrencyAccountsDto.setZarAmount(clientAccount.getDisplayBalance().multiply(clientAccount.getCurrencyByCurrencyCode().getCurrencyConversionRateByCurrencyCode().getRate()).toString());
           getCurrencyAccounts.add(displayCurrencyAccountsDto);
            }
            //sort array by balance
        getCurrencyAccounts.sort((o1, o2) -> {
            double first = Double.parseDouble(o1.getZarAmount());
            double second = Double.parseDouble(o2.getZarAmount());
            return Double.compare(second,first);
        });
            return getCurrencyAccounts;
        }

        @Override
    public void deleteClientAccount(Integer Id) {

    }
}
