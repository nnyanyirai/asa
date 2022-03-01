package asa.com.bankbalanceanddispensingsystem.controller.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.AtmAllocation;
import asa.com.bankbalanceanddispensingsystem.service.atm.AtmAllocationService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtmAllocationController {
private final AtmAllocationService atmAllocationService;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  public AtmAllocationController(
      AtmAllocationService atmAllocationService) {
    this.atmAllocationService = atmAllocationService;
  }
  @PostMapping("api/v1/createAtmAllocation")
  public AtmAllocation createAtmAllocation(@RequestBody AtmAllocation atmAllocation){
    return atmAllocationService.createAtmAllocation(atmAllocation);
  }
  @PutMapping("api/v1/updateAtmAllocation/{id}")
  public AtmAllocation updateAtmAllocation(@PathVariable Integer id,@RequestBody AtmAllocation atmAllocation){
    return atmAllocationService.updateAtmAllocation(id, atmAllocation);
  }
  @GetMapping("api/v1/getAtmAllocations")
  public Iterable <AtmAllocation>getAtmAllocation(){
    return atmAllocationService.getAllAtmAllocations();
  }
  @GetMapping("api/v1/getAtmAllocationById/{id}")
  public AtmAllocation getAtmAllocationById(@PathVariable Integer id){
    return atmAllocationService.getAtmAllocationById(id);
  }
  @DeleteMapping("api/v1/deleteAtmAllocationService/{id}")
  public void deleteAtmAllocation(@PathVariable Integer id){
    atmAllocationService.deleteAtmAllocation(id);
  }
}
