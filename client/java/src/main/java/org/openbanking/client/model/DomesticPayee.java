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
 * DomesticPayee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class DomesticPayee {
  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   */
  @JsonAdapter(PayeeAccountUTypeEnum.Adapter.class)
  public enum PayeeAccountUTypeEnum {
    ACCOUNT("account"),
    
    CARD("card"),
    
    PAYID("payId");

    private String value;

    PayeeAccountUTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayeeAccountUTypeEnum fromValue(String text) {
      for (PayeeAccountUTypeEnum b : PayeeAccountUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PayeeAccountUTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayeeAccountUTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayeeAccountUTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PayeeAccountUTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYEE_ACCOUNT_U_TYPE = "payeeAccountUType";
  @SerializedName(SERIALIZED_NAME_PAYEE_ACCOUNT_U_TYPE)
  private PayeeAccountUTypeEnum payeeAccountUType;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private DomesticPayeeAccount account = null;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private DomesticPayeeCard card = null;

  public static final String SERIALIZED_NAME_PAY_ID = "payId";
  @SerializedName(SERIALIZED_NAME_PAY_ID)
  private DomesticPayeePayId payId = null;

  public DomesticPayee payeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
    return this;
  }

   /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   * @return payeeAccountUType
  **/
  @ApiModelProperty(required = true, value = "Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP")
  public PayeeAccountUTypeEnum getPayeeAccountUType() {
    return payeeAccountUType;
  }

  public void setPayeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
  }

  public DomesticPayee account(DomesticPayeeAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public DomesticPayeeAccount getAccount() {
    return account;
  }

  public void setAccount(DomesticPayeeAccount account) {
    this.account = account;
  }

  public DomesticPayee card(DomesticPayeeCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public DomesticPayeeCard getCard() {
    return card;
  }

  public void setCard(DomesticPayeeCard card) {
    this.card = card;
  }

  public DomesticPayee payId(DomesticPayeePayId payId) {
    this.payId = payId;
    return this;
  }

   /**
   * Get payId
   * @return payId
  **/
  @ApiModelProperty(value = "")
  public DomesticPayeePayId getPayId() {
    return payId;
  }

  public void setPayId(DomesticPayeePayId payId) {
    this.payId = payId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticPayee domesticPayee = (DomesticPayee) o;
    return Objects.equals(this.payeeAccountUType, domesticPayee.payeeAccountUType) &&
        Objects.equals(this.account, domesticPayee.account) &&
        Objects.equals(this.card, domesticPayee.card) &&
        Objects.equals(this.payId, domesticPayee.payId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeAccountUType, account, card, payId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticPayee {\n");
    sb.append("    payeeAccountUType: ").append(toIndentedString(payeeAccountUType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    payId: ").append(toIndentedString(payId)).append("\n");
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

