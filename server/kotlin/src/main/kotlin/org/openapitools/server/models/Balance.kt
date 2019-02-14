/**
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
package org.openapitools.server.models

import org.openapitools.server.models.CurrencyAmount
import org.openapitools.server.models.DepositBalance
import org.openapitools.server.models.LendingBalance

/**
 * 
 * @param accountId A unique ID of the account adhering to the standards for ID permanence
 * @param balanceUType The type of balance object provided for the account
 * @param deposit 
 * @param lending 
 * @param purses 
 */
data class Balance (
    /* A unique ID of the account adhering to the standards for ID permanence */
    val accountId: kotlin.String,
    /* The type of balance object provided for the account */
    val balanceUType: Balance.BalanceUType,
    val deposit: DepositBalance? = null,
    val lending: LendingBalance? = null,
    val purses: kotlin.Array<CurrencyAmount>? = null
) {

    /**
    * The type of balance object provided for the account
    * Values: deposit,lending,purses
    */
    enum class BalanceUType(val value: kotlin.String){
    
        deposit("deposit"),
    
        lending("lending"),
    
        purses("purses");
    
    }

}
