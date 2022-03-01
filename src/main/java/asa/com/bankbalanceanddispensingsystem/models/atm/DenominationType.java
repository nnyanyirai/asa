package asa.com.bankbalanceanddispensingsystem.models.atm;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DENOMINATION_TYPE", schema = "asa_assessment", catalog = "")
public class DenominationType {

  private String denominationTypeCode;
  private String description;
  private Collection<Denomination> denominationsByDenominationTypeCode;

  @Id
  @Column(name = "DENOMINATION_TYPE_CODE")
  public String getDenominationTypeCode() {
    return denominationTypeCode;
  }

  public void setDenominationTypeCode(String denominationTypeCode) {
    this.denominationTypeCode = denominationTypeCode;
  }

  @Basic
  @Column(name = "DESCRIPTION")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DenominationType that = (DenominationType) o;
    return Objects.equals(denominationTypeCode, that.denominationTypeCode)
        && Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominationTypeCode, description);
  }

  @OneToMany(mappedBy = "denominationTypeByDenominationTypeCode")
  public Collection<Denomination> getDenominationsByDenominationTypeCode() {
    return denominationsByDenominationTypeCode;
  }

  public void setDenominationsByDenominationTypeCode(
      Collection<Denomination> denominationsByDenominationTypeCode) {
    this.denominationsByDenominationTypeCode = denominationsByDenominationTypeCode;
  }
}
