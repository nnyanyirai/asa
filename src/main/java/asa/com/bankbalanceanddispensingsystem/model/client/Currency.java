package asa.com.bankbalanceanddispensingsystem.model.client;

import javax.persistence.Column;
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
@Table(name = "CURRENCY")
public class Currency {
    @Id
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "DECIMAL_PLACES")
    private Integer decimalPlaces;

    @Column(name = "DESCRIPTION")
    private String description;
}
