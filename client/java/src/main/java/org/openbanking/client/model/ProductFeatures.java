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
 * ProductFeatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class ProductFeatures {
  /**
   * The type of feature described
   */
  @JsonAdapter(FeatureTypeEnum.Adapter.class)
  public enum FeatureTypeEnum {
    CARD_ACCESS("CARD_ACCESS"),
    
    ADDITIONAL_CARDS("ADDITIONAL_CARDS"),
    
    UNLIMITED_TXNS("UNLIMITED_TXNS"),
    
    FREE_TXNS("FREE_TXNS"),
    
    FREE_TXNS_ALLOWANCE("FREE_TXNS_ALLOWANCE"),
    
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    OFFSET("OFFSET"),
    
    OVERDRAFT("OVERDRAFT"),
    
    REDRAW("REDRAW"),
    
    INSURANCE("INSURANCE"),
    
    BALANCE_TRANSFERS("BALANCE_TRANSFERS"),
    
    INTEREST_FREE("INTEREST_FREE"),
    
    INTEREST_FREE_TRANSFERS("INTEREST_FREE_TRANSFERS"),
    
    DIGITAL_WALLET("DIGITAL_WALLET"),
    
    DIGITAL_BANKING("DIGITAL_BANKING"),
    
    NPP_PAYID("NPP_PAYID"),
    
    NPP_ENABLED("NPP_ENABLED"),
    
    DONATE_INTEREST("DONATE_INTEREST"),
    
    BILL_PAYMENT("BILL_PAYMENT");

    private String value;

    FeatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeatureTypeEnum fromValue(String text) {
      for (FeatureTypeEnum b : FeatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FeatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeatureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "featureType";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  private FeatureTypeEnum featureType;

  public static final String SERIALIZED_NAME_ADDITIONAL_VALUE = "additionalValue";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_VALUE)
  private String additionalValue;

  public ProductFeatures featureType(FeatureTypeEnum featureType) {
    this.featureType = featureType;
    return this;
  }

   /**
   * The type of feature described
   * @return featureType
  **/
  @ApiModelProperty(required = true, value = "The type of feature described")
  public FeatureTypeEnum getFeatureType() {
    return featureType;
  }

  public void setFeatureType(FeatureTypeEnum featureType) {
    this.featureType = featureType;
  }

  public ProductFeatures additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

   /**
   * Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType
   * @return additionalValue
  **/
  @ApiModelProperty(value = "Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFeatures productFeatures = (ProductFeatures) o;
    return Objects.equals(this.featureType, productFeatures.featureType) &&
        Objects.equals(this.additionalValue, productFeatures.additionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureType, additionalValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFeatures {\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
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

