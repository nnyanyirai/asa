package asa.com.bankbalanceanddispensingsystem.models.client;

import java.sql.Date;
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

@Entity
public class Client {

  private Integer clientId;
  private String title;
  private String name;
  private String surname;
  private Date dob;
  private String clientSubTypeCode;
  private ClientSubType clientSubTypeByClientSubTypeCode;
  private Collection<ClientAccount> clientAccountsByClientId;

  @Id
  @Column(name = "CLIENT_ID")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  @Basic
  @Column(name = "TITLE")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
  @Column(name = "SURNAME")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Basic
  @Column(name = "DOB")
  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  @Basic()
  @Lob
  @Column(name = "CLIENT_SUB_TYPE_CODE",columnDefinition = "longtext",insertable = false,updatable = false)
  public String getClientSubTypeCode() {
    return clientSubTypeCode;
  }

  public void setClientSubTypeCode(String clientSubTypeCode) {
    this.clientSubTypeCode = clientSubTypeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(clientId, client.clientId) && Objects
        .equals(title, client.title) && Objects.equals(name, client.name)
        && Objects.equals(surname, client.surname) && Objects
        .equals(dob, client.dob) && Objects
        .equals(clientSubTypeCode, client.clientSubTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, title, name, surname, dob, clientSubTypeCode);
  }

  @ManyToOne
  @JoinColumn(name = "CLIENT_SUB_TYPE_CODE", referencedColumnName = "CLIENT_SUB_TYPE_CODE", nullable = false)
  public ClientSubType getClientSubTypeByClientSubTypeCode() {
    return clientSubTypeByClientSubTypeCode;
  }

  public void setClientSubTypeByClientSubTypeCode(
      ClientSubType clientSubTypeByClientSubTypeCode) {
    this.clientSubTypeByClientSubTypeCode = clientSubTypeByClientSubTypeCode;
  }

  @OneToMany(mappedBy = "clientByClientId")
  public Collection<ClientAccount> getClientAccountsByClientId() {
    return clientAccountsByClientId;
  }

  public void setClientAccountsByClientId(
      Collection<ClientAccount> clientAccountsByClientId) {
    this.clientAccountsByClientId = clientAccountsByClientId;
  }
}
