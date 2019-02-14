package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ProductBundles   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri = null;
  @JsonProperty("productIds")
  private List<String> productIds = new ArrayList<String>();
  /**
   * Name of the bundle
   **/
  public ProductBundles name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(required = true, description = "Name of the bundle")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the bundle
   **/
  public ProductBundles description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(required = true, description = "Description of the bundle")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Link to a web page with more information on the bundle criteria and benefits
   **/
  public ProductBundles additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  
  @Schema(description = "Link to a web page with more information on the bundle criteria and benefits")
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }
  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  /**
   * Array of product IDs for products included in the bundle
   **/
  public ProductBundles productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  
  @Schema(required = true, description = "Array of product IDs for products included in the bundle")
  @JsonProperty("productIds")
  public List<String> getProductIds() {
    return productIds;
  }
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBundles productBundles = (ProductBundles) o;
    return Objects.equals(name, productBundles.name) &&
        Objects.equals(description, productBundles.description) &&
        Objects.equals(additionalInfoUri, productBundles.additionalInfoUri) &&
        Objects.equals(productIds, productBundles.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, additionalInfoUri, productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBundles {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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