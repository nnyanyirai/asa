package asa.com.bankbalanceanddispensingsystem.service.client;


import asa.com.bankbalanceanddispensingsystem.models.client.AccountType;


public interface AccountTypeService {
  AccountType createAccountType (AccountType accountType);
  AccountType updateAccountType(String Id, AccountType accountType);
  Iterable<AccountType> getAllAccountTypes();
  AccountType getAccountTypeById(String Id);
  void deleteAccountType(String Id);
}
