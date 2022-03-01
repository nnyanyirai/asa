package asa.com.bankbalanceanddispensingsystem.models.client;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Currency {

  private String currencyCode;
  private Integer decimalPlaces;
  private String description;
  private Collection<ClientAccount> clientAccountsByCurrencyCode;
  private CurrencyConversionRate currencyConversionRateByCurrencyCode;

  @Id
  @Column(name = "CURRENCY_CODE")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Basic
  @Column(name = "DECIMAL_PLACES")
  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }

  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
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
    Currency currency = (Currency) o;
    return Objects.equals(currencyCode, currency.currencyCode) && Objects
        .equals(decimalPlaces, currency.decimalPlaces) && Objects
        .equals(description, currency.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, decimalPlaces, description);
  }

  @OneToMany(mappedBy = "currencyByCurrencyCode")
  public Collection<ClientAccount> getClientAccountsByCurrencyCode() {
    return clientAccountsByCurrencyCode;
  }

  public void setClientAccountsByCurrencyCode(
      Collection<ClientAccount> clientAccountsByCurrencyCode) {
    this.clientAccountsByCurrencyCode = clientAccountsByCurrencyCode;
  }

  @OneToOne(mappedBy = "currencyByCurrencyCode")
  public CurrencyConversionRate getCurrencyConversionRateByCurrencyCode() {
    return currencyConversionRateByCurrencyCode;
  }

  public void setCurrencyConversionRateByCurrencyCode(
      CurrencyConversionRate currencyConversionRateByCurrencyCode) {
    this.currencyConversionRateByCurrencyCode = currencyConversionRateByCurrencyCode;
  }
}
