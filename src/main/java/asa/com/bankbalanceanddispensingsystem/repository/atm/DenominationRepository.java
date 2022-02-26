package asa.com.bankbalanceanddispensingsystem.repository.atm;

import asa.com.bankbalanceanddispensingsystem.model.atm.Denomination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenominationRepository extends JpaRepository<Denomination, Integer> {

}
