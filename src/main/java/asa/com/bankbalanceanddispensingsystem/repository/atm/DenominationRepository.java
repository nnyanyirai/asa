package asa.com.bankbalanceanddispensingsystem.repository.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.Denomination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenominationRepository extends JpaRepository<Denomination, Integer> {
Denomination findByDenominationId(Integer id);
}
