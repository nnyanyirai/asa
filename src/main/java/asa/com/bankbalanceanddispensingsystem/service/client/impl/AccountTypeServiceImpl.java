package asa.com.bankbalanceanddispensingsystem.service.client.impl;

import asa.com.bankbalanceanddispensingsystem.models.client.AccountType;
import asa.com.bankbalanceanddispensingsystem.service.client.AccountTypeService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountTypeServiceImpl implements AccountTypeService {

  @Override
  public AccountType createAccountType(AccountType accountType) {
    return null;
  }

  @Override
  public AccountType updateAccountType(String Id, AccountType accountType) {
    return null;
  }

  @Override
  public Iterable<AccountType> getAllAccountTypes() {
    return null;
  }

  @Override
  public AccountType getAccountTypeById(String Id) {
    return null;
  }

  @Override
  public void deleteAccountType(String Id) {

  }
}
