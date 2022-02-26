package asa.com.bankbalanceanddispensingsystem.model.atm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DENOMINATION_TYPE")
public class DenominationType {
    @Id
    @Column(name = "DENOMINATION_TYPE_CODE")
    private String denominationTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;
}
