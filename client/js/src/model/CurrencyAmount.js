/**
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 4.0.0-beta2
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.CurrencyAmount = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The CurrencyAmount model module.
   * @module model/CurrencyAmount
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>CurrencyAmount</code>.
   * @alias module:model/CurrencyAmount
   * @class
   * @param amount {String} The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   */
  var exports = function(amount) {
    var _this = this;

    _this['amount'] = amount;
  };

  /**
   * Constructs a <code>CurrencyAmount</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencyAmount} obj Optional instance to populate.
   * @return {module:model/CurrencyAmount} The populated <code>CurrencyAmount</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
    }
    return obj;
  }

  /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   * @member {String} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * If not present assumes AUD
   * @member {String} currency
   */
  exports.prototype['currency'] = undefined;



  return exports;
}));


