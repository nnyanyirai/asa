package asa.com.bankbalanceanddispensingsystem.models.atm;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Atm {

  private Integer atmId;
  private String name;
  private String location;
  private Collection<AtmAllocation> atmAllocationsByAtmId;

  @Id
  @Column(name = "ATM_ID")
  public Integer getAtmId() {
    return atmId;
  }

  public void setAtmId(Integer atmId) {
    this.atmId = atmId;
  }

  @Basic
  @Column(name = "NAME")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "LOCATION")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Atm atm = (Atm) o;
    return Objects.equals(atmId, atm.atmId) && Objects.equals(name, atm.name)
        && Objects.equals(location, atm.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atmId, name, location);
  }

  @OneToMany(mappedBy = "atmByAtmId")
  public Collection<AtmAllocation> getAtmAllocationsByAtmId() {
    return atmAllocationsByAtmId;
  }

  public void setAtmAllocationsByAtmId(
      Collection<AtmAllocation> atmAllocationsByAtmId) {
    this.atmAllocationsByAtmId = atmAllocationsByAtmId;
  }
}
