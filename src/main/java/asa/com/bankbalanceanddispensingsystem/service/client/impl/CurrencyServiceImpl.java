package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.Currency;
import asa.com.bankbalanceanddispensingsystem.service.client.CurrencyService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public Currency createCurrency(Currency currency) {
        return null;
    }

    @Override
    public Currency updateCurrency(String Id, Currency currency) {
        return null;
    }

    @Override
    public Iterable<Currency> getAllCurrencies() {
        return null;
    }

    @Override
    public Currency getCurrencyById(String Id) {
        return null;
    }

    @Override
    public void deleteCurrency(String Id) {

    }
}
