package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
