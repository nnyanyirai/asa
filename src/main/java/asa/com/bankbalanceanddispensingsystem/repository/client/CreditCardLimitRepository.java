package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.CreditCardLimit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardLimitRepository extends JpaRepository<CreditCardLimit, String> {
}
