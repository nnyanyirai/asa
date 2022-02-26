package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientAccount;

public interface ClientAccountService {
    ClientAccount createClientAccount (ClientAccount clientAccount);
    ClientAccount updateClientAccount(Integer Id, ClientAccount clientAccount);
    Iterable<ClientAccount> getAllClientsAccounts();
    ClientAccount getClientAccountsById(Integer Id);
    void deleteClientAccount(Integer Id);
}
