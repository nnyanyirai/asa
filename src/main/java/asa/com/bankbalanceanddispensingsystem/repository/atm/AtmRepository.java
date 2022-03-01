package asa.com.bankbalanceanddispensingsystem.repository.atm;


import asa.com.bankbalanceanddispensingsystem.models.atm.Atm;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtmRepository extends JpaRepository <Atm, Integer>{
  Atm findAtmByAtmId(Integer Id);
  Optional<Atm> findByName(String name);
}
