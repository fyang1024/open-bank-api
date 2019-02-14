package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrencyAmount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class CurrencyAmount   {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public CurrencyAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking")
  @NotNull

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CurrencyAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * If not present assumes AUD
   * @return currency
  **/
  @ApiModelProperty(value = "If not present assumes AUD")

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyAmount currencyAmount = (CurrencyAmount) o;
    return Objects.equals(this.amount, currencyAmount.amount) &&
        Objects.equals(this.currency, currencyAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
