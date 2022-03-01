package asa.com.bankbalanceanddispensingsystem.models.client;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_CARD_LIMIT", schema = "asa_assessment", catalog = "")
public class CreditCardLimit {

  private String clientAccountNumber;
  private BigDecimal accountLimit;
  private ClientAccount clientAccountByClientAccountNumber;

  @Id
  @Column(name = "CLIENT_ACCOUNT_NUMBER")
  public String getClientAccountNumber() {
    return clientAccountNumber;
  }

  public void setClientAccountNumber(String clientAccountNumber) {
    this.clientAccountNumber = clientAccountNumber;
  }

  @Basic
  @Column(name = "ACCOUNT_LIMIT")
  public BigDecimal getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(BigDecimal accountLimit) {
    this.accountLimit = accountLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardLimit that = (CreditCardLimit) o;
    return Objects.equals(clientAccountNumber, that.clientAccountNumber)
        && Objects.equals(accountLimit, that.accountLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAccountNumber, accountLimit);
  }

  @OneToOne
  @JoinColumn(name = "CLIENT_ACCOUNT_NUMBER", referencedColumnName = "CLIENT_ACCOUNT_NUMBER", nullable = false)
  public ClientAccount getClientAccountByClientAccountNumber() {
    return clientAccountByClientAccountNumber;
  }

  public void setClientAccountByClientAccountNumber(
      ClientAccount clientAccountByClientAccountNumber) {
    this.clientAccountByClientAccountNumber = clientAccountByClientAccountNumber;
  }
}
