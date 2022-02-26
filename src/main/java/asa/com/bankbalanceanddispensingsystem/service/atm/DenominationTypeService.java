package asa.com.bankbalanceanddispensingsystem.service.atm;

import asa.com.bankbalanceanddispensingsystem.model.atm.DenominationType;

public interface DenominationTypeService {
  DenominationType createDenominationType(DenominationType denominationType);
  Iterable<DenominationType> getDenominationType();
  DenominationType getDenominationTypeById(String id);
  DenominationType updateDenominationType(String id, DenominationType denominationType);
  void deleteDenominationType(String id);
}
