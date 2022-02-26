package asa.com.bankbalanceanddispensingsystem.repository.client;

import asa.com.bankbalanceanddispensingsystem.model.client.CurrencyConversionRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConversionRateRepository extends JpaRepository<CurrencyConversionRate,String> {

}
