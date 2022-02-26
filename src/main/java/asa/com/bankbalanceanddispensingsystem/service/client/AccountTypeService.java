package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.model.client.AccountType;
import asa.com.bankbalanceanddispensingsystem.model.client.ClientAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeService {
  AccountType createAccountType (AccountType accountType);
  AccountType updateAccountType(String Id, AccountType accountType);
  Iterable<AccountType> getAllAccountTypes();
  AccountType getAccountTypeById(String Id);
  void deleteAccountType(String Id);
}
