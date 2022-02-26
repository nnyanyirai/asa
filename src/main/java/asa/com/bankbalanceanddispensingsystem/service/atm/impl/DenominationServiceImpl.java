package asa.com.bankbalanceanddispensingsystem.service.atm.impl;

import asa.com.bankbalanceanddispensingsystem.model.atm.Denomination;
import asa.com.bankbalanceanddispensingsystem.service.atm.DenominationService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DenominationServiceImpl implements DenominationService {

  @Override
  public Denomination createDenomination(Denomination denomination) {
    return null;
  }

  @Override
  public Iterable<Denomination> getDenominations() {
    return null;
  }

  @Override
  public Denomination getDenominationById(Integer id) {
    return null;
  }

  @Override
  public Denomination updateDenominations(Integer id, Denomination denomination) {
    return null;
  }

  @Override
  public void deleteDenomination(Integer id) {

  }
}
