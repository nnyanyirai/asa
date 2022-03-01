package asa.com.bankbalanceanddispensingsystem.repository.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.AtmAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtmAllocationRepository extends JpaRepository<AtmAllocation,Integer> {
AtmAllocation findByDenominationId(Integer denominationId);
}
