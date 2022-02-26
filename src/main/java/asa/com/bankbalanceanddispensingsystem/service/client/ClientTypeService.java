package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientType;

public interface ClientTypeService {
    ClientType createClientType (ClientType clientType);
    ClientType updateClientType(String Id, ClientType clientType);
    Iterable<ClientType> getAllClientType();
    ClientType getClientTypeById(String Id);
    void deleteClientType(String Id);
}
