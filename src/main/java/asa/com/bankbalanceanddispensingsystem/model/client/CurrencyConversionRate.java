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
@Table(name = "CURRENCY_CONVERSION_RATE")
public class CurrencyConversionRate {
    @Id
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "CONVERSION_INDICATOR")
    private String conversionIndicator;

    @Column(name = "RATE")
    private BigDecimal rate;

    @OneToOne
    private Currency clientCurrency;
}
