package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.AccountType;
import asa.com.bankbalanceanddispensingsystem.service.client.AccountTypeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class AccountTypeController {
private final AccountTypeService accountTypeService;

  public AccountTypeController(
      AccountTypeService accountTypeService) {
    this.accountTypeService = accountTypeService;
  }

  @PostMapping("api/v1/createAccountType")
  public AccountType createAccountType(@RequestBody  AccountType accountType){
    return accountTypeService.createAccountType(accountType);
  }
  @PutMapping("api/v1/updateAccountType/{id}")
  public AccountType updateAccountType(@PathVariable String id, @RequestBody AccountType accountType){
    return accountTypeService.updateAccountType(id, accountType);
  }
  @GetMapping("api/v1/getAllAccountTypes")
  public Iterable<AccountType> getAllAccountTypes(){
    return accountTypeService.getAllAccountTypes();
  }
  @GetMapping("api/v1/getAccountTypeById/{id}")
  public AccountType getAccountTypeById(@PathVariable String id){
    return accountTypeService.getAccountTypeById(id);
  }
  @DeleteMapping("api/v1/deleteAccountType/{id}")
  public  void  deleteAccountType(@PathVariable String id){
    accountTypeService.deleteAccountType(id);
  }
}
