package asa.com.bankbalanceanddispensingsystem.controller.atm;

import asa.com.bankbalanceanddispensingsystem.model.atm.DenominationType;
import asa.com.bankbalanceanddispensingsystem.service.atm.DenominationTypeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenominationTypeController {
private final DenominationTypeService denominationTypeService;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  public DenominationTypeController(
      DenominationTypeService denominationTypeService) {
    this.denominationTypeService = denominationTypeService;
  }
  @PostMapping("api/v1/createDenominationType")
  public DenominationType createDenominationType(@RequestBody DenominationType denominationType){
    return denominationTypeService.createDenominationType(denominationType);
  }
@PutMapping("api/v1/updateDenominationType/{id}")
public DenominationType updateDenominationType(@PathVariable String id, @RequestBody DenominationType denominationType){
    return denominationTypeService.updateDenominationType(id, denominationType);
}
  @GetMapping("api/v1/getDenominationType")
  public Iterable <DenominationType>getDenominationType(){
    return denominationTypeService.getDenominationType();
  }
  @GetMapping("api/v1/getDenominationTypeById/{id}")
  public DenominationType getDenominationById(@PathVariable String id){
    return denominationTypeService.getDenominationTypeById(id);
  }
  @DeleteMapping("api/v1/deleteDenominationType/{id}")
  public void deleteDenominationType(@PathVariable String id){
    denominationTypeService.deleteDenominationType(id);
  }
}
