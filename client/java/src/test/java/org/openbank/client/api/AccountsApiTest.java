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


package org.openbanking.client.api;

import org.openbanking.client.ApiException;
import org.openbanking.client.api.AccountsApi;
import org.openbanking.client.model.RequestAccountIds;
import org.openbanking.client.model.ResponseBankingAccount;
import org.openbanking.client.model.ResponseBankingAccounts;
import org.openbanking.client.model.ResponseBankingAccountsBalances;
import org.openbanking.client.model.ResponseBankingTransactionDetail;
import org.openbanking.client.model.ResponseBankingTransactions;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * Get Account Detail
     *
     * Obtain detailed information on a single account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountDetailTest() throws ApiException {
        String accountId = null;
        ResponseBankingAccount response = api.getAccountDetail(accountId);

        // TODO: test validations
    }
    
    /**
     * Get Transaction Detail
     *
     * Obtain detailed information on a transaction for a specific account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionDetailTest() throws ApiException {
        String accountId = null;
        String transactionId = null;
        ResponseBankingTransactionDetail response = api.getTransactionDetail(accountId, transactionId);

        // TODO: test validations
    }
    
    /**
     * Get Transactions For Account
     *
     * Obtain transactions for a specific account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsTest() throws ApiException {
        String accountId = null;
        String startTime = null;
        String endTime = null;
        String minAmount = null;
        String maxAmount = null;
        String text = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingTransactions response = api.getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get Accounts
     *
     * Obtain a list of accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountsTest() throws ApiException {
        String openStatus = null;
        String isOwned = null;
        String productCategory = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingAccounts response = api.listAccounts(openStatus, isOwned, productCategory, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get Bulk Balances
     *
     * Obtain balances for multiple, filtered accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBalancesBulkTest() throws ApiException {
        String openStatus = null;
        String isOwned = null;
        String productCategory = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingAccountsBalances response = api.listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get Balances For Specific Accounts
     *
     * Obtain balances for a specified list of accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBalancesSpecificAccountsTest() throws ApiException {
        RequestAccountIds requestAccountIds = null;
        ResponseBankingAccountsBalances response = api.listBalancesSpecificAccounts(requestAccountIds);

        // TODO: test validations
    }
    
    /**
     * Get Transactions For Multiple Accounts
     *
     * Obtain transactions for multiple, filtered accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransactionsBulkTest() throws ApiException {
        String openStatus = null;
        String isOwned = null;
        String productCategory = null;
        String startTime = null;
        String endTime = null;
        String minAmount = null;
        String maxAmount = null;
        String text = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingTransactions response = api.listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get Transactions For Specific Accounts
     *
     * Obtain transactions for a specified list of transactions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransactionsSpecificAccountsTest() throws ApiException {
        RequestAccountIds requestAccountIds = null;
        String startTime = null;
        String endTime = null;
        String minAmount = null;
        String maxAmount = null;
        String text = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingTransactions response = api.listTransactionsSpecificAccounts(requestAccountIds, startTime, endTime, minAmount, maxAmount, text, page, pageSize);

        // TODO: test validations
    }
    
}
