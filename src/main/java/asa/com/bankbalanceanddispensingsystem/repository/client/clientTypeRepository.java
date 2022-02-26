package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientTypeRepository extends JpaRepository<ClientType,String> {
}
