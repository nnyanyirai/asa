package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.Currency;

public interface CurrencyService {
    Currency createCurrency (Currency currency);
    Currency updateCurrency(String Id, Currency currency);
    Iterable<Currency> getAllCurrencies();
    Currency getCurrencyById(String Id);
    void deleteCurrency(String Id);
}
