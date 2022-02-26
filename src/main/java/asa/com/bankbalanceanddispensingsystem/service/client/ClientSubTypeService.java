package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientSubType;

public interface ClientSubTypeService {
    ClientSubType createClientSubType (ClientSubType clientSubType);
    ClientSubType updateClientSubType(String Id, ClientSubType clientSubType);
    Iterable<ClientSubType> getAllClientsSubTypes();
    ClientSubType getClientSubTypesById(String Id);
    void deleteClientSubType(String Id);
}
