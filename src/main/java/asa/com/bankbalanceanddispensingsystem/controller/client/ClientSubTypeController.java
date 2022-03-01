package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientSubType;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientSubTypeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientSubTypeController {
private final ClientSubTypeService clientSubTypeService;

  public ClientSubTypeController(
      ClientSubTypeService clientSubTypeService) {
    this.clientSubTypeService = clientSubTypeService;
  }
  @PostMapping("api/v1/createClientSubType")
  public ClientSubType createClientSubType(@RequestBody ClientSubType clientSubType){
    return clientSubTypeService.createClientSubType(clientSubType);
  }
  @PutMapping("api/v1/updateClientSubType/{id}")
  public ClientSubType updateClientSubType(@PathVariable  String id, @RequestBody ClientSubType clientSubType){
    return clientSubTypeService.updateClientSubType(id,clientSubType);
  }
  @GetMapping("api/v1/getAllClientSubTypes")
  public Iterable<ClientSubType> getAllClientSubTypes(){
    return clientSubTypeService.getAllClientsSubTypes();
  }
  @GetMapping("api/v1/getClientSubTypeById/{id}")
  public ClientSubType getClientSubTypeById(@PathVariable String id){
    return clientSubTypeService.getClientSubTypesById(id);
  }
  @DeleteMapping("api/v1/deleteClientSubType/{id}")
  public void deleteClientSubType(@PathVariable String id){
     clientSubTypeService.deleteClientSubType(id);
  }
}
