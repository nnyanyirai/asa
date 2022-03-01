package asa.com.bankbalanceanddispensingsystem.controller.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.Atm;
import asa.com.bankbalanceanddispensingsystem.service.atm.AtmService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class AtmController {
private final AtmService atmService;

  public AtmController(AtmService atmService) {
    this.atmService = atmService;
  }
  @PostMapping("api/v1/createATM")
  public Atm createATM(@RequestBody Atm atm){
    return atmService.createATM(atm);
  }
  @PutMapping("api/v1/updateATM/{id}")
  public Atm updateATM(@PathVariable Integer id,@RequestBody Atm atm){
    return atmService.updateATMs(id, atm);
  }
  @GetMapping("api/v1/getAtm")
  public Iterable <Atm>getAtm(){
    return atmService.getATMs();
  }
  @GetMapping("api/v1/getAtmById/{id}")
  public Atm getAtmById(@PathVariable Integer id){
    return atmService.getAtmById(id);
  }
  @DeleteMapping("api/v1/deleteAtm/{id}")
public void deleteAtm(@PathVariable Integer id){
    atmService.deleteAtm(id);
  }
}
