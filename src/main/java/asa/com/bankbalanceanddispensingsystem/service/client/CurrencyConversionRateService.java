package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.CurrencyConversionRate;

public interface CurrencyConversionRateService {
    CurrencyConversionRate createCurrencyConversionRate (
        CurrencyConversionRate currencyConversionRate);
    CurrencyConversionRate updateCurrencyConversionRate(String Id, CurrencyConversionRate currencyConversionRate);
    Iterable<CurrencyConversionRate> getAllCurrencyConversionRates();
    CurrencyConversionRate getConversionRateById(String Id);
    void deleteCurrencyConversionRate(String Id);
}
