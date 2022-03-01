package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.Client;
import asa.com.bankbalanceanddispensingsystem.repository.client.ClientRepository;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(
        ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) {
        return null;
    }

    @Override
    public Client updateClient(Integer Id, Client client) {
        return null;
    }

    @Override
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer Id) {
        return null;
    }

    @Override
    public void deleteClient(Integer Id) {

    }
}
