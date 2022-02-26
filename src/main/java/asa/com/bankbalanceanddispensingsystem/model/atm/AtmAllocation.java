package asa.com.bankbalanceanddispensingsystem.model.atm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ATM_ALLOCATION")
public class AtmAllocation {
    @Id
    @Column(name = "ATM_ALLOCATION_ID")
    private Integer atmAllocationId;

    @Column(name = "ATM_ID")
    private Integer atmId;

    @Column(name = "DENOMINATION_ID")
    private Integer denominationId;

    @Column(name = "COUNT")
    private Integer count;
}
