package asa.com.bankbalanceanddispensingsystem.service.atm.impl;

import asa.com.bankbalanceanddispensingsystem.models.atm.DenominationType;
import asa.com.bankbalanceanddispensingsystem.service.atm.DenominationTypeService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DenominationTypeServiceImpl implements DenominationTypeService {

  @Override
  public DenominationType createDenominationType(DenominationType denominationType) {
    return null;
  }

  @Override
  public Iterable<DenominationType> getDenominationType() {
    return null;
  }

  @Override
  public DenominationType getDenominationTypeById(String id) {
    return null;
  }

  @Override
  public DenominationType updateDenominationType(String id, DenominationType denominationType) {
    return null;
  }

  @Override
  public void deleteDenominationType(String id) {

  }
}
