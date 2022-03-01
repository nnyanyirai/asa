package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.Client;

public interface ClientService {
    Client createClient (Client client);
    Client updateClient(Integer Id, Client client);
    Iterable<Client> getAllClients();
    Client getClientById(Integer Id);
    void deleteClient(Integer Id);
}
