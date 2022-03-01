package asa.com.bankbalanceanddispensingsystem.service.atm;


import asa.com.bankbalanceanddispensingsystem.models.atm.Denomination;

public interface DenominationService {
  Denomination createDenomination(Denomination denomination);
  Iterable<Denomination> getDenominations();
  Denomination getDenominationById(Integer id);
  Denomination updateDenominations(Integer id, Denomination denomination);
  void deleteDenomination(Integer id);
}
