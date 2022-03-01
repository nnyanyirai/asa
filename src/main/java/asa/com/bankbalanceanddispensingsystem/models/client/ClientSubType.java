package asa.com.bankbalanceanddispensingsystem.models.client;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT_SUB_TYPE", schema = "asa_assessment", catalog = "")
public class ClientSubType {

  private String clientSubTypeCode;
  private String clientTypeCode;
  private String description;
  private Collection<Client> clientsByClientSubTypeCode;
  private ClientType clientTypeByClientTypeCode;

  @Id
  @Column(name = "CLIENT_SUB_TYPE_CODE")
  public String getClientSubTypeCode() {
    return clientSubTypeCode;
  }

  public void setClientSubTypeCode(String clientSubTypeCode) {
    this.clientSubTypeCode = clientSubTypeCode;
  }

  @Basic()
  @Lob
  @Column(name = "CLIENT_TYPE_CODE",columnDefinition = "longtext",insertable = false,updatable = false)
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
    ClientSubType that = (ClientSubType) o;
    return Objects.equals(clientSubTypeCode, that.clientSubTypeCode) && Objects
        .equals(clientTypeCode, that.clientTypeCode) && Objects
        .equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSubTypeCode, clientTypeCode, description);
  }

  @OneToMany(mappedBy = "clientSubTypeByClientSubTypeCode")
  public Collection<Client> getClientsByClientSubTypeCode() {
    return clientsByClientSubTypeCode;
  }

  public void setClientsByClientSubTypeCode(
      Collection<Client> clientsByClientSubTypeCode) {
    this.clientsByClientSubTypeCode = clientsByClientSubTypeCode;
  }

  @ManyToOne
  @JoinColumn(name = "CLIENT_TYPE_CODE", referencedColumnName = "CLIENT_TYPE_CODE", nullable = false)
  public ClientType getClientTypeByClientTypeCode() {
    return clientTypeByClientTypeCode;
  }

  public void setClientTypeByClientTypeCode(
      ClientType clientTypeByClientTypeCode) {
    this.clientTypeByClientTypeCode = clientTypeByClientTypeCode;
  }
}
