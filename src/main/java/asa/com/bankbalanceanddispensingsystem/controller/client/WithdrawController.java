package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.models.client.ClientAccount;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawRequestDto;
import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawResponseDto;
import asa.com.bankbalanceanddispensingsystem.service.client.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawController {
  @Autowired
  private WithdrawService withdrawService;
@PostMapping("api/v1/withdrawCash")
  public WithdrawResponseDto withdrawCash(@RequestBody WithdrawRequestDto drawCash){
  WithdrawResponseDto withdrawResponseDto = withdrawService.withdrawCash(drawCash);
  return withdrawResponseDto;
}
}
