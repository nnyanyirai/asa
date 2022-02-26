package asa.com.bankbalanceanddispensingsystem.controller.atm;

import asa.com.bankbalanceanddispensingsystem.model.atm.Denomination;
import asa.com.bankbalanceanddispensingsystem.service.atm.DenominationService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenominationController {
private final DenominationService denominationService;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  public DenominationController(
      DenominationService denominationService) {
    this.denominationService = denominationService;
  }
  @PostMapping("api/v1/createDenomination")
  public Denomination createATM(@RequestBody Denomination denomination){
    return denominationService.createDenomination(denomination);
  }
  @PutMapping("api/v1/updateDenomination/{id}")
  public Denomination updateDenomination(@PathVariable Integer id,@RequestBody Denomination denomination){
    return denominationService.updateDenominations(id, denomination);
  }
  @GetMapping("api/v1/getDenomination")
  public Iterable <Denomination>getDenomination(){
    return denominationService.getDenominations();
  }
  @GetMapping("api/v1/getDenominationById/{id}")
  public Denomination getDenominationById(@PathVariable Integer id){
    return denominationService.getDenominationById(id);
  }
  @DeleteMapping("api/v1/deleteDenomination/{id}")
  public void deleteDenomination(@PathVariable Integer id){
    denominationService.deleteDenomination(id);
  }
}
