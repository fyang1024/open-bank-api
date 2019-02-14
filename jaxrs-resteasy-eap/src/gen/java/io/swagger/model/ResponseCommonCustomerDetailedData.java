package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.OrganisationDetail;
import io.swagger.model.PersonDetail;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class ResponseCommonCustomerDetailedData   {
  /**
   * The type of customer object that is present
   */
  public enum CustomerUTypeEnum {
    PERSON("person"),

        ORGANISATION("organisation");
    private String value;

    CustomerUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CustomerUTypeEnum customerUType = null;
  private PersonDetail person = null;
  private OrganisationDetail organisation = null;

  /**
   * The type of customer object that is present
   **/
  
  @Schema(description = "The type of customer object that is present")
  @JsonProperty("customerUType")
  public CustomerUTypeEnum getCustomerUType() {
    return customerUType;
  }
  public void setCustomerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("person")
  public PersonDetail getPerson() {
    return person;
  }
  public void setPerson(PersonDetail person) {
    this.person = person;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("organisation")
  public OrganisationDetail getOrganisation() {
    return organisation;
  }
  public void setOrganisation(OrganisationDetail organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCommonCustomerDetailedData responseCommonCustomerDetailedData = (ResponseCommonCustomerDetailedData) o;
    return Objects.equals(customerUType, responseCommonCustomerDetailedData.customerUType) &&
        Objects.equals(person, responseCommonCustomerDetailedData.person) &&
        Objects.equals(organisation, responseCommonCustomerDetailedData.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerUType, person, organisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomerDetailedData {\n");
    
    sb.append("    customerUType: ").append(toIndentedString(customerUType)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}