package asa.com.bankbalanceanddispensingsystem.models.client;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT_TYPE", schema = "asa_assessment", catalog = "")
public class ClientType {

  private String clientTypeCode;
  private String description;
  private Collection<ClientSubType> clientSubTypesByClientTypeCode;

  @Id
  @Column(name = "CLIENT_TYPE_CODE")
  public String getClientTypeCode() {
    return clientTypeCode;
  }

  public void setClientTypeCode(String clientTypeCode) {
    this.clientTypeCode = clientTypeCode;
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
    ClientType that = (ClientType) o;
    return Objects.equals(clientTypeCode, that.clientTypeCode) && Objects
        .equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTypeCode, description);
  }

  @OneToMany(mappedBy = "clientTypeByClientTypeCode")
  public Collection<ClientSubType> getClientSubTypesByClientTypeCode() {
    return clientSubTypesByClientTypeCode;
  }

  public void setClientSubTypesByClientTypeCode(
      Collection<ClientSubType> clientSubTypesByClientTypeCode) {
    this.clientSubTypesByClientTypeCode = clientSubTypesByClientTypeCode;
  }
}
