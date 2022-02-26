package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientAccountRepository;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientAccountService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientAccountServiceImpl implements ClientAccountService {
    private final ClientAccountRepository clientAccountRepository;

    public ClientAccountServiceImpl(
        ClientAccountRepository clientAccountRepository) {
        this.clientAccountRepository = clientAccountRepository;
    }

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
    public ClientAccount getClientAccountsById(Integer Id) {
        return null;
    }

    @Override
    public void deleteClientAccount(Integer Id) {

    }
}
