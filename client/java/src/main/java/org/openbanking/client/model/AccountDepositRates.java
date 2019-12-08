/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountDepositRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class AccountDepositRates {
  /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   */
  @JsonAdapter(DepositRateTypeEnum.Adapter.class)
  public enum DepositRateTypeEnum {
    FIXED("FIXED"),
    
    BONUS("BONUS"),
    
    BUNDLE_BONUS("BUNDLE_BONUS"),
    
    VARIABLE("VARIABLE"),
    
    INTRODUCTORY("INTRODUCTORY");

    private String value;

    DepositRateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepositRateTypeEnum fromValue(String text) {
      for (DepositRateTypeEnum b : DepositRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<DepositRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepositRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepositRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepositRateTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_DEPOSIT_RATE_TYPE = "depositRateType";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_RATE_TYPE)
  private DepositRateTypeEnum depositRateType;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_ADDITIONAL_VALUE = "additionalValue";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_VALUE)
  private String additionalValue;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO_URI = "additionalInfoUri";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO_URI)
  private String additionalInfoUri;

  public AccountDepositRates depositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
    return this;
  }

   /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   * @return depositRateType
  **/
  @ApiModelProperty(required = true, value = "The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning")
  public DepositRateTypeEnum getDepositRateType() {
    return depositRateType;
  }

  public void setDepositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
  }

  public AccountDepositRates rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The rate to be applied
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The rate to be applied")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public AccountDepositRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

   /**
   * Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
   * @return additionalValue
  **/
  @ApiModelProperty(value = "Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public AccountDepositRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Display text providing more information on the fee
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Display text providing more information on the fee")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AccountDepositRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

   /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  **/
  @ApiModelProperty(value = "Link to a web page with more information on this fee")
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
    AccountDepositRates accountDepositRates = (AccountDepositRates) o;
    return Objects.equals(this.depositRateType, accountDepositRates.depositRateType) &&
        Objects.equals(this.rate, accountDepositRates.rate) &&
        Objects.equals(this.additionalValue, accountDepositRates.additionalValue) &&
        Objects.equals(this.additionalInfo, accountDepositRates.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, accountDepositRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDepositRates {\n");
    sb.append("    depositRateType: ").append(toIndentedString(depositRateType)).append("\n");
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
