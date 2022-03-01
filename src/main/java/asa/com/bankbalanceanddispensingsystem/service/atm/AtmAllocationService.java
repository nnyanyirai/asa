package asa.com.bankbalanceanddispensingsystem.service.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.AtmAllocation;

public interface AtmAllocationService {
AtmAllocation createAtmAllocation(AtmAllocation atmAllocation);
AtmAllocation getAtmAllocationById(Integer Id);
Iterable<AtmAllocation>getAllAtmAllocations();
AtmAllocation updateAtmAllocation(Integer Id, AtmAllocation atmAllocation);
void deleteAtmAllocation(Integer Id);
}
