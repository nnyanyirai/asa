package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientAccountService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientAccountController {
private ClientAccountService clientAccountService;

  public ClientAccountController(
      ClientAccountService clientAccountService) {
    this.clientAccountService = clientAccountService;
  }

  @PostMapping("api/v1/createClientAccount")
  public ClientAccount createAccount(@RequestBody ClientAccount clientAccount){
  return clientAccountService.createClientAccount(clientAccount);
}
  @PutMapping("api/v1/updateClientAccount/{id}")
  public ClientAccount updateClientAccount(@PathVariable Integer id, @RequestBody ClientAccount clientAccount){
  return clientAccountService.updateClientAccount(id, clientAccount);
}
  @GetMapping("api/v1/getAllClientAccounts")
  Iterable<ClientAccount> getAllClientAccounts(){
    return clientAccountService.getAllClientsAccounts();
  }
  @GetMapping("api/v1/getClientAccountById/{id}")
  public ClientAccount getClientAccountById(@PathVariable Integer id){
  return clientAccountService.getClientAccountsById(id);
  }
  @DeleteMapping("api/v1/deleteClientAccount/{id}")
  public  void deleteClientAccount(@PathVariable Integer id){
  clientAccountService.deleteClientAccount(id);
  }
}
