package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TransactionDetail;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingTransactionDetailData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ResponseBankingTransactionDetailData   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("transaction")
  @Valid
  private List<TransactionDetail> transaction = null;

  public ResponseBankingTransactionDetailData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account for which transactions are provided
   * @return accountId
  **/
  @ApiModelProperty(value = "ID of the account for which transactions are provided")

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ResponseBankingTransactionDetailData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ResponseBankingTransactionDetailData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * A customer supplied nick name for the account
   * @return nickname
  **/
  @ApiModelProperty(value = "A customer supplied nick name for the account")

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public ResponseBankingTransactionDetailData transaction(List<TransactionDetail> transaction) {
    this.transaction = transaction;
    return this;
  }

  public ResponseBankingTransactionDetailData addTransactionItem(TransactionDetail transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<TransactionDetail>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<TransactionDetail> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<TransactionDetail> transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingTransactionDetailData responseBankingTransactionDetailData = (ResponseBankingTransactionDetailData) o;
    return Objects.equals(this.accountId, responseBankingTransactionDetailData.accountId) &&
        Objects.equals(this.displayName, responseBankingTransactionDetailData.displayName) &&
        Objects.equals(this.nickname, responseBankingTransactionDetailData.nickname) &&
        Objects.equals(this.transaction, responseBankingTransactionDetailData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, nickname, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionDetailData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
