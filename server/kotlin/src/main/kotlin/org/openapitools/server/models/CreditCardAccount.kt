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
 * @param minPaymentAmount The minimum payment amount due for the next card payment
 * @param paymentDueAmount The amount due for the next card payment
 * @param paymentCurrency If absent assumes AUD
 * @param paymentDueDate Date that the next payment for the card is due
 */
data class CreditCardAccount (
    /* The minimum payment amount due for the next card payment */
    val minPaymentAmount: kotlin.String,
    /* The amount due for the next card payment */
    val paymentDueAmount: kotlin.String,
    /* Date that the next payment for the card is due */
    val paymentDueDate: kotlin.String,
    /* If absent assumes AUD */
    val paymentCurrency: kotlin.String? = null
) {

}
