package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.CurrencyConversionRate;
import asa.com.bankbalanceanddispensingsystem.service.client.CurrencyConversionRateService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CurrencyConversionRateServiceImpl implements CurrencyConversionRateService {

    @Override
    public CurrencyConversionRate createCurrencyConversionRate(
        CurrencyConversionRate currencyConversionRate) {
        return null;
    }

    @Override
    public CurrencyConversionRate updateCurrencyConversionRate(String Id,
        CurrencyConversionRate currencyConversionRate) {
        return null;
    }

    @Override
    public Iterable<CurrencyConversionRate> getAllCurrencyConversionRates() {
        return null;
    }

    @Override
    public CurrencyConversionRate getConversionRateById(String Id) {
        return null;
    }

    @Override
    public void deleteCurrencyConversionRate(String Id) {

    }
}
