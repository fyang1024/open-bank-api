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

import java.util.ArrayList;
import java.util.List;

/**
 * RequestAccountIdsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class RequestAccountIdsData {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "accountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = new ArrayList<String>();

  public RequestAccountIdsData accountIds(List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public RequestAccountIdsData addAccountIdsItem(String accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAccountIdsData requestAccountIdsData = (RequestAccountIdsData) o;
    return Objects.equals(this.accountIds, requestAccountIdsData.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAccountIdsData {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

