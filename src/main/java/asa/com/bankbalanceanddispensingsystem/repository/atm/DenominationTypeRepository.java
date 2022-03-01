package asa.com.bankbalanceanddispensingsystem.repository.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.DenominationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenominationTypeRepository extends JpaRepository<DenominationType,Integer> {
}
