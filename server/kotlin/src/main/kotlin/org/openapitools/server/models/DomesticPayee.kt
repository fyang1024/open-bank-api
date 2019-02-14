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

import org.openapitools.server.models.DomesticPayeeAccount
import org.openapitools.server.models.DomesticPayeeCard
import org.openapitools.server.models.DomesticPayeePayId

/**
 * 
 * @param payeeAccountUType Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
 * @param account 
 * @param card 
 * @param payId 
 */
data class DomesticPayee (
    /* Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP */
    val payeeAccountUType: DomesticPayee.PayeeAccountUType,
    val account: DomesticPayeeAccount? = null,
    val card: DomesticPayeeCard? = null,
    val payId: DomesticPayeePayId? = null
) {

    /**
    * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
    * Values: account,card,payId
    */
    enum class PayeeAccountUType(val value: kotlin.String){
    
        account("account"),
    
        card("card"),
    
        payId("payId");
    
    }

}
