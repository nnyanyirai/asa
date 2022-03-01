package asa.com.bankbalanceanddispensingsystem.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisplayCurrencyAccountsDto {
private String accountNumber;
private String currency;
private String currencyBalance;
private String conversionRate;
private String ZarAmount;
}
