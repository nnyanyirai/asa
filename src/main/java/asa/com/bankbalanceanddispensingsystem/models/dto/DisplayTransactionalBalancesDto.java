package asa.com.bankbalanceanddispensingsystem.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisplayTransactionalBalancesDto {
private String clientId;
private String accountNumber;
private String accountType;
private String accountBalance;
}
