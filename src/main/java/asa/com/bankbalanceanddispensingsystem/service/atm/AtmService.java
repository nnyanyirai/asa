package asa.com.bankbalanceanddispensingsystem.service.atm;

import asa.com.bankbalanceanddispensingsystem.models.atm.Atm;

public interface AtmService {
  Atm createATM(Atm atm);
  Iterable<Atm> getATMs();
  Atm getAtmById(Integer id);
  Atm updateATMs(Integer id, Atm atm);
  void deleteAtm(Integer id);

}
