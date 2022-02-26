package asa.com.bankbalanceanddispensingsystem.model.client;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CREDIT_CARD_LIMIT")
public class CreditCardLimit {
    @Id
    @Column(name = "CLIENT_ACCOUNT_NUMBER")
    private String clientAccountNumber;

    @Column(name = "ACCOUNT_LIMIT")
    private BigDecimal accountLimit;

    @OneToOne
    private ClientAccount clientAccount;
}
