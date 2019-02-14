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


/**
 * 
 * @param name Name of the authorised entity
 * @param financialInstitution Name of the financial institution through which the direct debit will be executed
 * @param abn Australian Business Number for the authorised entity
 * @param acn Australian Business Number for the authorised entity
 * @param arbn Australian Registered Body Number for the authorised entity
 */
data class AuthorisedEntity (
    /* Name of the authorised entity */
    val name: kotlin.String,
    /* Name of the financial institution through which the direct debit will be executed */
    val financialInstitution: kotlin.String,
    /* Australian Business Number for the authorised entity */
    val abn: kotlin.String? = null,
    /* Australian Business Number for the authorised entity */
    val acn: kotlin.String? = null,
    /* Australian Registered Body Number for the authorised entity */
    val arbn: kotlin.String? = null
) {

}
