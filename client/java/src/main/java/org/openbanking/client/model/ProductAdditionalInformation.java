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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProductAdditionalInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class ProductAdditionalInformation {
  public static final String SERIALIZED_NAME_OVERVIEW_URI = "overviewUri";
  @SerializedName(SERIALIZED_NAME_OVERVIEW_URI)
  private String overviewUri;

  public static final String SERIALIZED_NAME_TERMS_URI = "termsUri";
  @SerializedName(SERIALIZED_NAME_TERMS_URI)
  private String termsUri;

  public static final String SERIALIZED_NAME_ELIGIBILITY_URI = "eligibilityUri";
  @SerializedName(SERIALIZED_NAME_ELIGIBILITY_URI)
  private String eligibilityUri;

  public static final String SERIALIZED_NAME_FEES_AND_PRICING_URI = "feesAndPricingUri";
  @SerializedName(SERIALIZED_NAME_FEES_AND_PRICING_URI)
  private String feesAndPricingUri;

  public static final String SERIALIZED_NAME_BUNDLE_URI = "bundleUri";
  @SerializedName(SERIALIZED_NAME_BUNDLE_URI)
  private String bundleUri;

  public ProductAdditionalInformation overviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
    return this;
  }

   /**
   * General overview of the product
   * @return overviewUri
  **/
  @ApiModelProperty(value = "General overview of the product")
  public String getOverviewUri() {
    return overviewUri;
  }

  public void setOverviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
  }

  public ProductAdditionalInformation termsUri(String termsUri) {
    this.termsUri = termsUri;
    return this;
  }

   /**
   * Terms and conditions for the product
   * @return termsUri
  **/
  @ApiModelProperty(value = "Terms and conditions for the product")
  public String getTermsUri() {
    return termsUri;
  }

  public void setTermsUri(String termsUri) {
    this.termsUri = termsUri;
  }

  public ProductAdditionalInformation eligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
    return this;
  }

   /**
   * Eligibility rules and criteria for the product
   * @return eligibilityUri
  **/
  @ApiModelProperty(value = "Eligibility rules and criteria for the product")
  public String getEligibilityUri() {
    return eligibilityUri;
  }

  public void setEligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
  }

  public ProductAdditionalInformation feesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
    return this;
  }

   /**
   * Description of fees, pricing, discounts, exemptions and bonuses for the product
   * @return feesAndPricingUri
  **/
  @ApiModelProperty(value = "Description of fees, pricing, discounts, exemptions and bonuses for the product")
  public String getFeesAndPricingUri() {
    return feesAndPricingUri;
  }

  public void setFeesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
  }

  public ProductAdditionalInformation bundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
    return this;
  }

   /**
   * Description of a bundle that this product can be part of
   * @return bundleUri
  **/
  @ApiModelProperty(value = "Description of a bundle that this product can be part of")
  public String getBundleUri() {
    return bundleUri;
  }

  public void setBundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAdditionalInformation productAdditionalInformation = (ProductAdditionalInformation) o;
    return Objects.equals(this.overviewUri, productAdditionalInformation.overviewUri) &&
        Objects.equals(this.termsUri, productAdditionalInformation.termsUri) &&
        Objects.equals(this.eligibilityUri, productAdditionalInformation.eligibilityUri) &&
        Objects.equals(this.feesAndPricingUri, productAdditionalInformation.feesAndPricingUri) &&
        Objects.equals(this.bundleUri, productAdditionalInformation.bundleUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overviewUri, termsUri, eligibilityUri, feesAndPricingUri, bundleUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAdditionalInformation {\n");
    sb.append("    overviewUri: ").append(toIndentedString(overviewUri)).append("\n");
    sb.append("    termsUri: ").append(toIndentedString(termsUri)).append("\n");
    sb.append("    eligibilityUri: ").append(toIndentedString(eligibilityUri)).append("\n");
    sb.append("    feesAndPricingUri: ").append(toIndentedString(feesAndPricingUri)).append("\n");
    sb.append("    bundleUri: ").append(toIndentedString(bundleUri)).append("\n");
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

