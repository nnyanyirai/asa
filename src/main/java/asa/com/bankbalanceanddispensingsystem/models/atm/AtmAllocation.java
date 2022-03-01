package asa.com.bankbalanceanddispensingsystem.models.atm;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_ALLOCATION", schema = "asa_assessment", catalog = "")
public class AtmAllocation {

  private Integer atmAllocationId;
  private Integer atmId;
  private Integer denominationId;
  private Integer count;
  private Atm atmByAtmId;
  private Denomination denominationByDenominationId;

  @Id
  @Column(name = "ATM_ALLOCATION_ID")
  public Integer getAtmAllocationId() {
    return atmAllocationId;
  }

  public void setAtmAllocationId(Integer atmAllocationId) {
    this.atmAllocationId = atmAllocationId;
  }

  @Basic
  @Column(name = "ATM_ID")
  public Integer getAtmId() {
    return atmId;
  }

  public void setAtmId(Integer atmId) {
    this.atmId = atmId;
  }

  @Basic
  @Column(name = "DENOMINATION_ID")
  public Integer getDenominationId() {
    return denominationId;
  }

  public void setDenominationId(Integer denominationId) {
    this.denominationId = denominationId;
  }

  @Basic
  @Column(name = "COUNT")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtmAllocation that = (AtmAllocation) o;
    return Objects.equals(atmAllocationId, that.atmAllocationId) && Objects
        .equals(atmId, that.atmId) && Objects.equals(denominationId, that.denominationId)
        && Objects.equals(count, that.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atmAllocationId, atmId, denominationId, count);
  }

  @ManyToOne
  @JoinColumn(name = "ATM_ID", referencedColumnName = "ATM_ID", nullable = false,insertable = false, updatable = false)
  public Atm getAtmByAtmId() {
    return atmByAtmId;
  }

  public void setAtmByAtmId(Atm atmByAtmId) {
    this.atmByAtmId = atmByAtmId;
  }

  @ManyToOne
  @JoinColumn(name = "DENOMINATION_ID",referencedColumnName = "DENOMINATION_ID", nullable = false,insertable = false, updatable = false)
  public Denomination getDenominationByDenominationId() {
    return denominationByDenominationId;
  }

  public void setDenominationByDenominationId(
      Denomination denominationByDenominationId) {
    this.denominationByDenominationId = denominationByDenominationId;
  }
}
