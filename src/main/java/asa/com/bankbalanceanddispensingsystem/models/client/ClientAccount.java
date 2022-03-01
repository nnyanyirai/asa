package asa.com.bankbalanceanddispensingsystem.models.client;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT_ACCOUNT", schema = "asa_assessment", catalog = "")
public class ClientAccount {

  private String clientAccountNumber;
  private Integer clientId;
  private String accountTypeCode;
  private String currencyCode;
  private BigDecimal displayBalance;
  private Client clientByClientId;
  private AccountType accountTypeByAccountTypeCode;
  private Currency currencyByCurrencyCode;
  private CreditCardLimit creditCardLimitByClientAccountNumber;

  @Id
  @Column(name = "CLIENT_ACCOUNT_NUMBER")
  public String getClientAccountNumber() {
    return clientAccountNumber;
  }

  public void setClientAccountNumber(String clientAccountNumber) {
    this.clientAccountNumber = clientAccountNumber;
  }


  //@Basic()
  //@Lob
  @Column(name = "CLIENT_ID",columnDefinition = "longtext",insertable = false,updatable = false)
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  //@Basic()
  //@Lob
  @Column(name = "ACCOUNT_TYPE_CODE",columnDefinition = "longtext",insertable = false,updatable = false)
  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  //@Basic()
  //@Lob
  @Column(name = "CURRENCY_CODE",columnDefinition = "longtext",insertable = false,updatable = false)
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  //@Basic
  @Column(name = "DISPLAY_BALANCE")
  public BigDecimal getDisplayBalance() {
    return displayBalance;
  }

  public void setDisplayBalance(BigDecimal displayBalance) {
    this.displayBalance = displayBalance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAccount that = (ClientAccount) o;
    return Objects.equals(clientAccountNumber, that.clientAccountNumber)
        && Objects.equals(clientId, that.clientId) && Objects
        .equals(accountTypeCode, that.accountTypeCode) && Objects
        .equals(currencyCode, that.currencyCode) && Objects
        .equals(displayBalance, that.displayBalance);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(clientAccountNumber, clientId, accountTypeCode, currencyCode, displayBalance);
  }

  @ManyToOne
  @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID", nullable = false)
  public Client getClientByClientId() {
    return clientByClientId;
  }

  public void setClientByClientId(Client clientByClientId) {
    this.clientByClientId = clientByClientId;
  }

  @ManyToOne
  @JoinColumn(name = "ACCOUNT_TYPE_CODE", referencedColumnName = "ACCOUNT_TYPE_CODE", nullable = false)
  public AccountType getAccountTypeByAccountTypeCode() {
    return accountTypeByAccountTypeCode;
  }

  public void setAccountTypeByAccountTypeCode(
      AccountType accountTypeByAccountTypeCode) {
    this.accountTypeByAccountTypeCode = accountTypeByAccountTypeCode;
  }

  @ManyToOne
  @JoinColumn(name = "CURRENCY_CODE", referencedColumnName = "CURRENCY_CODE", nullable = false)
  public Currency getCurrencyByCurrencyCode() {
    return currencyByCurrencyCode;
  }

  public void setCurrencyByCurrencyCode(
      Currency currencyByCurrencyCode) {
    this.currencyByCurrencyCode = currencyByCurrencyCode;
  }

  @OneToOne(mappedBy = "clientAccountByClientAccountNumber")
  public CreditCardLimit getCreditCardLimitByClientAccountNumber() {
    return creditCardLimitByClientAccountNumber;
  }

  public void setCreditCardLimitByClientAccountNumber(
      CreditCardLimit creditCardLimitByClientAccountNumber) {
    this.creditCardLimitByClientAccountNumber = creditCardLimitByClientAccountNumber;
  }
}
