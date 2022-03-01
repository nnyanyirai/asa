package asa.com.bankbalanceanddispensingsystem.repository.client;


import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientAccountRepository extends JpaRepository<ClientAccount, Integer> {
  List<ClientAccount> findByClientId(Integer id);
  Optional<ClientAccount> findByClientAccountNumber(String accountNumber);
}
