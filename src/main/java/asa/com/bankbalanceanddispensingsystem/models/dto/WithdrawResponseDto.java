package asa.com.bankbalanceanddispensingsystem.models.dto;

import java.math.BigDecimal;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawResponseDto {

  private String atmName;
  private Integer clientId;
  private String accountNumber;
  private BigDecimal newAccountBalance;
  private Double amount;
  private Map<String,Integer> notesDispensed;
}
