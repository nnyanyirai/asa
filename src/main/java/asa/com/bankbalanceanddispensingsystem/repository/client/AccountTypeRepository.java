package asa.com.bankbalanceanddispensingsystem.repository.client;


import asa.com.bankbalanceanddispensingsystem.models.client.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, String > {
  AccountType getByAccountTypeCode(String AccountCode);
}
