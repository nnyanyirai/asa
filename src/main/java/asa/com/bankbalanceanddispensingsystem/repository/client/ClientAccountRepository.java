package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientAccountRepository extends JpaRepository<ClientAccount, String> {
}
