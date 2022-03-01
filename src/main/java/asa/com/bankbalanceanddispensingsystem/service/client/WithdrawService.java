package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawDto;

public interface WithdrawService {
  ClientAccount withdrawCash(WithdrawDto withdrawDto);
}
