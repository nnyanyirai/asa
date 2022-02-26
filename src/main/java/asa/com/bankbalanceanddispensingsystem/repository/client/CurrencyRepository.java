package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, String> {
}
