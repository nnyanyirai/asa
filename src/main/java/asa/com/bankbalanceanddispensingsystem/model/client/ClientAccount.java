package asa.com.bankbalanceanddispensingsystem.model.client;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENT_ACCOUNT")
public class ClientAccount {
    @Id
    @Column(name = "CLIENT_ACCOUNT_NUMBER")
    private String clientAccountNumber;

    @Column(name = "CLIENT_ID")
    private Integer clientId;

    @Column(name = "ACCOUNT_TYPE_CODE")
    private String accountTypeCode;

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "DISPLAY_BALANCE")
    private BigDecimal displayBalance;

//    @ManyToOne
//    private Client client;
//
//    @ManyToOne
//    private Currency currency;
//
//    @ManyToOne
//    private AccountType accountType;
}
