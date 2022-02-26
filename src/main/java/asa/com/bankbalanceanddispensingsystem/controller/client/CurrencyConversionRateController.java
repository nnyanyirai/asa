package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.Currency;
import asa.com.bankbalanceanddispensingsystem.model.client.CurrencyConversionRate;
import asa.com.bankbalanceanddispensingsystem.service.client.CurrencyConversionRateService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionRateController {
private final CurrencyConversionRateService currencyConversionRateService;

  public CurrencyConversionRateController(
      CurrencyConversionRateService currencyConversionRateService) {
    this.currencyConversionRateService = currencyConversionRateService;
  }
  @PostMapping("api/v1/createCurrencyConversionRate")
  public CurrencyConversionRate createCurrency(@RequestBody CurrencyConversionRate currencyConversionRate){
    return currencyConversionRateService.createCurrencyConversionRate(currencyConversionRate);
  }
  @GetMapping("api/v1/getAllCurrencyConversionRates")
  public Iterable<CurrencyConversionRate> getAllCurrencyConversionRates(){
    return currencyConversionRateService.getAllCurrencyConversionRates();
  }
  @GetMapping("api/v1/getCurrencyConversionRateById/{id}")
  public CurrencyConversionRate getCurrencyConversionRateById(@PathVariable String id){
    return currencyConversionRateService.getConversionRateById(id);
  }
  @PutMapping("api/v1/updateCurrencyConversionRate/{id}")
  public CurrencyConversionRate updateCurrencyConversionRate(@PathVariable String id, @RequestBody CurrencyConversionRate  currencyConversionRate){
    return currencyConversionRateService.updateCurrencyConversionRate(id, currencyConversionRate);
  }
  @DeleteMapping("api/v1/deleteCurrencyConversionRate/{id}")
  public void deleteCurrencyConversionRate(@PathVariable String id){
    currencyConversionRateService.deleteCurrencyConversionRate(id);
  }
}
