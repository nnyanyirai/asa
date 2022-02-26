package asa.com.bankbalanceanddispensingsystem.service.atm.impl;

import asa.com.bankbalanceanddispensingsystem.model.atm.AtmAllocation;
import asa.com.bankbalanceanddispensingsystem.service.atm.AtmAllocationService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AtmAllocationServiceImpl implements AtmAllocationService {

  @Override
  public AtmAllocation createAtmAllocation(AtmAllocation atmAllocation) {
    return null;
  }

  @Override
  public AtmAllocation getAtmAllocationById(Integer Id) {
    return null;
  }

  @Override
  public Iterable<AtmAllocation> getAllAtmAllocations() {
    return null;
  }

  @Override
  public AtmAllocation updateAtmAllocation(Integer Id, AtmAllocation atmAllocation) {
    return null;
  }

  @Override
  public void deleteAtmAllocation(Integer Id) {

  }
}
