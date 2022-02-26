package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.CreditCardLimit;
import asa.com.bankbalanceanddispensingsystem.service.client.CreditCardLimitService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardLimitController {
private final CreditCardLimitService creditCardLimitService;

  public CreditCardLimitController(
      CreditCardLimitService creditCardLimitService) {
    this.creditCardLimitService = creditCardLimitService;
  }
@PostMapping("api/v1/createCreditCardLimit")
  public CreditCardLimit createCreditCardLimit(@RequestBody CreditCardLimit creditCardLimit){
    return creditCardLimitService.createCreditCardLimit(creditCardLimit);
}
@GetMapping("api/v1/getAllCreditCardLimits")
  public Iterable<CreditCardLimit> getAllCreditCardLimits(){
    return creditCardLimitService.getAllCreditCardLimit();
}
@GetMapping("api/v1/getCreditCardLimitsById/{id}")
  public CreditCardLimit getCreditCardLimitById(@PathVariable String id){
    return creditCardLimitService.getCreditCardLimitById(id);
}
@PutMapping("api/v1/updateCreditCardLimit/{id}")
  public CreditCardLimit updateCreditCardLimit(@PathVariable String id, @RequestBody CreditCardLimit  creditCardLimit){
    return creditCardLimitService.updateCreditCardLimit(id, creditCardLimit);
}
@DeleteMapping("api/v1/deleteCreditCardLimit/{id}")
  public void deleteCreditCardLimit(@PathVariable String id){
    creditCardLimitService.deleteCreditCardLimit(id);
}
}
