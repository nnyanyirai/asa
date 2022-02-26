package asa.com.bankbalanceanddispensingsystem.service.atm;

import asa.com.bankbalanceanddispensingsystem.model.atm.Atm;
import asa.com.bankbalanceanddispensingsystem.model.atm.Denomination;

public interface DenominationService {
  Denomination createDenomination(Denomination denomination);
  Iterable<Denomination> getDenominations();
  Denomination getDenominationById(Integer id);
  Denomination updateDenominations(Integer id, Denomination denomination);
  void deleteDenomination(Integer id);
}
