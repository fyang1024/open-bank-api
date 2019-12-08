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
    define(['ApiClient', 'model/LinksPaginated', 'model/MetaPaginated', 'model/ResponseBankingAccountsData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LinksPaginated'), require('./MetaPaginated'), require('./ResponseBankingAccountsData'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ResponseBankingAccounts = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.LinksPaginated, root.ConsumerDataStandards.MetaPaginated, root.ConsumerDataStandards.ResponseBankingAccountsData);
  }
}(this, function(ApiClient, LinksPaginated, MetaPaginated, ResponseBankingAccountsData) {
  'use strict';



  /**
   * The ResponseBankingAccounts model module.
   * @module model/ResponseBankingAccounts
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ResponseBankingAccounts</code>.
   * @alias module:model/ResponseBankingAccounts
   * @class
   * @param data {module:model/ResponseBankingAccountsData} 
   * @param links {module:model/LinksPaginated} 
   * @param meta {module:model/MetaPaginated} 
   */
  var exports = function(data, links, meta) {
    var _this = this;

    _this['data'] = data;
    _this['links'] = links;
    _this['meta'] = meta;
  };

  /**
   * Constructs a <code>ResponseBankingAccounts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResponseBankingAccounts} obj Optional instance to populate.
   * @return {module:model/ResponseBankingAccounts} The populated <code>ResponseBankingAccounts</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('data')) {
        obj['data'] = ResponseBankingAccountsData.constructFromObject(data['data']);
      }
      if (data.hasOwnProperty('links')) {
        obj['links'] = LinksPaginated.constructFromObject(data['links']);
      }
      if (data.hasOwnProperty('meta')) {
        obj['meta'] = MetaPaginated.constructFromObject(data['meta']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/ResponseBankingAccountsData} data
   */
  exports.prototype['data'] = undefined;
  /**
   * @member {module:model/LinksPaginated} links
   */
  exports.prototype['links'] = undefined;
  /**
   * @member {module:model/MetaPaginated} meta
   */
  exports.prototype['meta'] = undefined;



  return exports;
}));

