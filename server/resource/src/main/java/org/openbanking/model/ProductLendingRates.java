package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * ProductLendingRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ProductLendingRates   {
  /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   */
  public enum LendingRateTypeEnum {
    FIXED("FIXED"),
    
    INTRODUCTORY("INTRODUCTORY"),
    
    DISCOUNT("DISCOUNT"),
    
    PENALTY("PENALTY"),
    
    BUNDLE_DISCOUNT("BUNDLE_DISCOUNT"),
    
    FLOATING("FLOATING"),
    
    MARKET_LINKED("MARKET_LINKED"),
    
    CASH_ADVANCE("CASH_ADVANCE"),
    
    VARIABLE("VARIABLE"),
    
    COMPARISON("COMPARISON");

    private String value;

    LendingRateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LendingRateTypeEnum fromValue(String text) {
      for (LendingRateTypeEnum b : LendingRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("lendingRateType")
  private LendingRateTypeEnum lendingRateType;

  @JsonProperty("rate")
  private String rate;

  @JsonProperty("additionalValue")
  private String additionalValue;

  @JsonProperty("additionalInfo")
  private String additionalInfo;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri;

  public ProductLendingRates lendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
    return this;
  }

  /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   * @return lendingRateType
  */
  @ApiModelProperty(required = true, value = "The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning")
  @NotNull


  public LendingRateTypeEnum getLendingRateType() {
    return lendingRateType;
  }

  public void setLendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
  }

  public ProductLendingRates rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The rate to be applied
   * @return rate
  */
  @ApiModelProperty(required = true, value = "The rate to be applied")
  @NotNull


  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public ProductLendingRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType")


  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductLendingRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the fee.
   * @return additionalInfo
  */
  @ApiModelProperty(value = "Display text providing more information on the fee.")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductLendingRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information  on this fee
   * @return additionalInfoUri
  */
  @ApiModelProperty(value = "Link to a web page with more information  on this fee")


  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLendingRates productLendingRates = (ProductLendingRates) o;
    return Objects.equals(this.lendingRateType, productLendingRates.lendingRateType) &&
        Objects.equals(this.rate, productLendingRates.rate) &&
        Objects.equals(this.additionalValue, productLendingRates.additionalValue) &&
        Objects.equals(this.additionalInfo, productLendingRates.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, productLendingRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lendingRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLendingRates {\n");
    
    sb.append("    lendingRateType: ").append(toIndentedString(lendingRateType)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
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

