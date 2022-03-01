package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientType;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientTypeService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientTypeServiceImpl implements ClientTypeService {

    @Override
    public ClientType createClientType(ClientType clientType) {
        return null;
    }

    @Override
    public ClientType updateClientType(String Id, ClientType clientType) {
        return null;
    }

    @Override
    public Iterable<ClientType> getAllClientType() {
        return null;
    }

    @Override
    public ClientType getClientTypeById(String Id) {
        return null;
    }

    @Override
    public void deleteClientType(String Id) {

    }
}
