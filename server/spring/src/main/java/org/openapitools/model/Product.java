package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EnumProductCategory;
import org.openapitools.model.ProductAdditionalInformation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class Product   {
  @JsonProperty("productId")
  private String productId;

  @JsonProperty("effectiveFrom")
  private String effectiveFrom;

  @JsonProperty("effectiveTo")
  private String effectiveTo;

  @JsonProperty("lastUpdated")
  private String lastUpdated;

  @JsonProperty("productCategory")
  private EnumProductCategory productCategory;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("brandName")
  private String brandName;

  @JsonProperty("applicationUri")
  private String applicationUri;

  @JsonProperty("isTailored")
  private Boolean isTailored;

  @JsonProperty("additionalInformation")
  private ProductAdditionalInformation additionalInformation = null;

  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   * @return productId
  */
  @ApiModelProperty(required = true, value = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
  @NotNull


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   * @return effectiveFrom
  */
  @ApiModelProperty(value = "The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate")


  public String getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public Product effectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

  /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   * @return effectiveTo
  */
  @ApiModelProperty(value = "The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products")


  public String getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public Product lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   * @return lastUpdated
  */
  @ApiModelProperty(required = true, value = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
  @NotNull


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Product productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the product
   * @return name
  */
  @ApiModelProperty(required = true, value = "The display name of the product")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the product
   * @return description
  */
  @ApiModelProperty(required = true, value = "A description of the product")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   * @return brand
  */
  @ApiModelProperty(required = true, value = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
  @NotNull


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * An optional display name of the brand
   * @return brandName
  */
  @ApiModelProperty(value = "An optional display name of the brand")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public Product applicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
    return this;
  }

  /**
   * A link to the an application web page where this product can be applied for.
   * @return applicationUri
  */
  @ApiModelProperty(value = "A link to the an application web page where this product can be applied for.")


  public String getApplicationUri() {
    return applicationUri;
  }

  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  public Product isTailored(Boolean isTailored) {
    this.isTailored = isTailored;
    return this;
  }

  /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   * @return isTailored
  */
  @ApiModelProperty(required = true, value = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
  @NotNull


  public Boolean getIsTailored() {
    return isTailored;
  }

  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  public Product additionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Get additionalInformation
   * @return additionalInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.effectiveFrom, product.effectiveFrom) &&
        Objects.equals(this.effectiveTo, product.effectiveTo) &&
        Objects.equals(this.lastUpdated, product.lastUpdated) &&
        Objects.equals(this.productCategory, product.productCategory) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.brandName, product.brandName) &&
        Objects.equals(this.applicationUri, product.applicationUri) &&
        Objects.equals(this.isTailored, product.isTailored) &&
        Objects.equals(this.additionalInformation, product.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, effectiveFrom, effectiveTo, lastUpdated, productCategory, name, description, brand, brandName, applicationUri, isTailored, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    applicationUri: ").append(toIndentedString(applicationUri)).append("\n");
    sb.append("    isTailored: ").append(toIndentedString(isTailored)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
