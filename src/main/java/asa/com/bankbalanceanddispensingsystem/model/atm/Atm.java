package asa.com.bankbalanceanddispensingsystem.model.atm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
@Table(name = "ATM")
public class Atm {
    @Id
    @Column(name = "ATM_ID")
    private Integer atmId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @ManyToOne
    private AtmAllocation atmAllocation;
}
