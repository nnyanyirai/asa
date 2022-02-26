package asa.com.bankbalanceanddispensingsystem.model.atm;

import asa.com.bankbalanceanddispensingsystem.model.client.ClientSubType;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DENOMINATION")
public class Denomination {
    @Id
    @Column(name = "DENOMINATION_ID")
    private Integer denominationId;

    @Column(name = "VALUE")
    private BigDecimal value;

    @Column(name = "DENOMINATION_TYPE_CODE")
    private String denominationTypeCode;
    @ManyToOne
    private DenominationType denominationType;

    @ManyToOne
    private AtmAllocation atmAllocation;
}
