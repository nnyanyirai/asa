package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientSubType;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientSubTypeService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientSubTypeServiceImpl implements ClientSubTypeService {


    @Override
    public ClientSubType createClientSubType(ClientSubType clientSubType) {
        return null;
    }

    @Override
    public ClientSubType updateClientSubType(String Id, ClientSubType clientSubType) {
        return null;
    }

    @Override
    public Iterable<ClientSubType> getAllClientsSubTypes() {
        return null;
    }

    @Override
    public ClientSubType getClientSubTypesById(String Id) {
        return null;
    }

    @Override
    public void deleteClientSubType(String Id) {

    }
}
