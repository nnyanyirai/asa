package asa.com.bankbalanceanddispensingsystem.models.atm;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Denomination {

  private Integer denominationId;
  private Integer value;
  private String denominationTypeCode;
  private Collection<AtmAllocation> atmAllocationsByDenominationId;
  private DenominationType denominationTypeByDenominationTypeCode;

  @Id
  @Column(name = "DENOMINATION_ID")
  public Integer getDenominationId() {
    return denominationId;
  }

  public void setDenominationId(Integer denominationId) {
    this.denominationId = denominationId;
  }

  @Basic
  @Column(name = "VALUE")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Basic
  @Column(name = "DENOMINATION_TYPE_CODE")
  public String getDenominationTypeCode() {
    return denominationTypeCode;
  }

  public void setDenominationTypeCode(String denominationTypeCode) {
    this.denominationTypeCode = denominationTypeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Denomination that = (Denomination) o;
    return Objects.equals(denominationId, that.denominationId) && Objects
        .equals(value, that.value) && Objects
        .equals(denominationTypeCode, that.denominationTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominationId, value, denominationTypeCode);
  }

  @OneToMany(mappedBy = "denominationByDenominationId")
  public Collection<AtmAllocation> getAtmAllocationsByDenominationId() {
    return atmAllocationsByDenominationId;
  }

  public void setAtmAllocationsByDenominationId(
      Collection<AtmAllocation> atmAllocationsByDenominationId) {
    this.atmAllocationsByDenominationId = atmAllocationsByDenominationId;
  }

  @ManyToOne
  @JoinColumn(name = "DENOMINATION_TYPE_CODE",referencedColumnName = "DENOMINATION_TYPE_CODE", nullable = false,insertable = false, updatable = false)
  public DenominationType getDenominationTypeByDenominationTypeCode() {
    return denominationTypeByDenominationTypeCode;
  }

  public void setDenominationTypeByDenominationTypeCode(
      DenominationType denominationTypeByDenominationTypeCode) {
    this.denominationTypeByDenominationTypeCode = denominationTypeByDenominationTypeCode;
  }
}
