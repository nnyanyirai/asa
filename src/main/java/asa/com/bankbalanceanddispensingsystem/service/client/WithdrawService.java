package asa.com.bankbalanceanddispensingsystem.service.client;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawRequestDto;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawResponseDto;

public interface WithdrawService {
  WithdrawResponseDto withdrawCash(WithdrawRequestDto withdrawRequestDto);
}
