package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.DisplayCurrencyAccountsDto;
import asa.com.bankbalanceanddispensingsystem.models.dto.DisplayTransactionalBalancesDto;
import java.util.List;

public interface ClientAccountService {
    ClientAccount createClientAccount (ClientAccount clientAccount);
    ClientAccount updateClientAccount(Integer Id, ClientAccount clientAccount);
    Iterable<ClientAccount> getAllClientsAccounts();
    List<DisplayTransactionalBalancesDto> getClientAccountsById(Integer Id);
    List<DisplayCurrencyAccountsDto> getClientCurrencyAccountsById(Integer Id);
    void deleteClientAccount(Integer Id);
}
