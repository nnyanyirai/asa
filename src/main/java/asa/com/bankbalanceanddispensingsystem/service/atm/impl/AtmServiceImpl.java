package asa.com.bankbalanceanddispensingsystem.service.atm.impl;

import asa.com.bankbalanceanddispensingsystem.model.atm.Atm;
import asa.com.bankbalanceanddispensingsystem.service.atm.AtmService;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AtmServiceImpl implements AtmService {

  @Override
  public Atm createATM(Atm atm) {
    return null;
  }

  @Override
  public Iterable<Atm> getATMs() {
    return null;
  }

  @Override
  public Atm getAtmById(Integer id) {
    return null;
  }

  @Override
  public Atm updateATMs(Integer id, Atm atm) {
    return null;
  }

  @Override
  public void deleteAtm(Integer id) {

  }
}
