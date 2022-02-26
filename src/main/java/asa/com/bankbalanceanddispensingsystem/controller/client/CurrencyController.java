package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.CreditCardLimit;
import asa.com.bankbalanceanddispensingsystem.model.client.Currency;
import asa.com.bankbalanceanddispensingsystem.service.client.CurrencyService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
private final CurrencyService currencyService;

  public CurrencyController(
      CurrencyService currencyService) {
    this.currencyService = currencyService;
  }
  @PostMapping("api/v1/createCurrency")
  public Currency createCurrency(@RequestBody Currency currency){
    return currencyService.createCurrency(currency);
  }
  @GetMapping("api/v1/getAllCurrencies")
  public Iterable<Currency> getAllCurrencies(){
    return currencyService.getAllCurrencies();
  }
  @GetMapping("api/v1/getCurrencyById/{id}")
  public Currency getCCurrencyById(@PathVariable String id){
    return currencyService.getCurrencyById(id);
  }
  @PutMapping("api/v1/updateCurrency/{id}")
  public Currency updateCurrency(@PathVariable String id, @RequestBody Currency  currency){
    return currencyService.updateCurrency(id, currency);
  }
  @DeleteMapping("api/v1/deleteCurrency/{id}")
  public void deleteCurrency(@PathVariable String id){
    currencyService.deleteCurrency(id);
  }
}
