package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.CreditCardLimit;
import asa.com.bankbalanceanddispensingsystem.service.client.CreditCardLimitService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CreditCardLimitServiceImpl implements CreditCardLimitService {

    @Override
    public CreditCardLimit createCreditCardLimit(CreditCardLimit creditCardLimit) {
        return null;
    }

    @Override
    public CreditCardLimit updateCreditCardLimit(String Id, CreditCardLimit creditCardLimit) {
        return null;
    }

    @Override
    public Iterable<CreditCardLimit> getAllCreditCardLimit() {
        return null;
    }

    @Override
    public CreditCardLimit getCreditCardLimitById(String Id) {
        return null;
    }

    @Override
    public void deleteCreditCardLimit(String Id) {

    }
}
