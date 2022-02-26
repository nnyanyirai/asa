package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientType;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientTypeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTypeController {
private final ClientTypeService clientTypeService;

  public ClientTypeController(
      ClientTypeService clientTypeService) {
    this.clientTypeService = clientTypeService;
  }
  @PostMapping("api/v1/createClientType")
  public ClientType createClientType(@RequestBody ClientType clientType){
    return clientTypeService.createClientType(clientType);
  }
  @PutMapping("api/v1/updateClientType/{id}")
  public ClientType updateClientType(@PathVariable String id, @RequestBody ClientType clientType){
    return clientTypeService.updateClientType(id, clientType);
  }
@GetMapping("api/v1/getClientTypes")
  public Iterable<ClientType> getAllClientTypes(){
    return clientTypeService.getAllClientType();
  }
@GetMapping("api/v1/getClientTypeById/{id}")
  public ClientType getClientTypeById(@PathVariable String id) {
  return clientTypeService.getClientTypeById(id);
}
@DeleteMapping("api/v1/deleteClientType/{id}")
  public void deleteClientType(@PathVariable String id){
    clientTypeService.deleteClientType(id);
}
}
