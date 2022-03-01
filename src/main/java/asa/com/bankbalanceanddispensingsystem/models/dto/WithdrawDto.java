package asa.com.bankbalanceanddispensingsystem.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawDto {

  private String atmName;
  private Integer clientId;
  private String accountNumber;
  private Double amount;
}
