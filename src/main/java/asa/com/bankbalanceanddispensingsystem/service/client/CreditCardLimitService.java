package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.model.client.CreditCardLimit;

public interface CreditCardLimitService {
    CreditCardLimit createCreditCardLimit (CreditCardLimit creditCardLimit);
    CreditCardLimit updateCreditCardLimit(String Id, CreditCardLimit creditCardLimit);
    Iterable<CreditCardLimit> getAllCreditCardLimit();
    CreditCardLimit getCreditCardLimitById(String Id);
    void deleteCreditCardLimit(String Id);
}
