package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.models.dto.WithdrawDto;
import asa.com.bankbalanceanddispensingsystem.service.client.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawController {
  @Autowired
  private WithdrawService withdrawService;
@PostMapping("api/v1/withdrawCash")
  public WithdrawDto withdrawCash(@RequestBody WithdrawDto drawCash){
  WithdrawDto withdrawDto = withdrawService.withdrawCash(drawCash);
  return withdrawDto;
}
}
