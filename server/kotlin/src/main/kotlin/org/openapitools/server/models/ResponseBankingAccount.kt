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

import org.openapitools.server.models.AccountDetail
import org.openapitools.server.models.Links

/**
 * 
 * @param &#x60;data&#x60; 
 * @param links 
 * @param meta 
 */
data class ResponseBankingAccount (
    val `data`: AccountDetail,
    val links: Links,
    val meta: kotlin.Any
) {

}
