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
    root.ConsumerDataStandards.LinksPaginated = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The LinksPaginated model module.
   * @module model/LinksPaginated
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>LinksPaginated</code>.
   * @alias module:model/LinksPaginated
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>LinksPaginated</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LinksPaginated} obj Optional instance to populate.
   * @return {module:model/LinksPaginated} The populated <code>LinksPaginated</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('self')) {
        obj['self'] = ApiClient.convertToType(data['self'], 'String');
      }
      if (data.hasOwnProperty('first')) {
        obj['first'] = ApiClient.convertToType(data['first'], 'String');
      }
      if (data.hasOwnProperty('prev')) {
        obj['prev'] = ApiClient.convertToType(data['prev'], 'String');
      }
      if (data.hasOwnProperty('next')) {
        obj['next'] = ApiClient.convertToType(data['next'], 'String');
      }
      if (data.hasOwnProperty('last')) {
        obj['last'] = ApiClient.convertToType(data['last'], 'String');
      }
    }
    return obj;
  }

  /**
   * Fully qualified link to this API call
   * @member {String} self
   */
  exports.prototype['self'] = undefined;
  /**
   * URI to the first page of this set. Mandatory if this response is not the first page
   * @member {String} first
   */
  exports.prototype['first'] = undefined;
  /**
   * URI to the first previous page of this set. Mandatory if this response is not the first page
   * @member {String} prev
   */
  exports.prototype['prev'] = undefined;
  /**
   * URI to the first next page of this set. Mandatory if this response is not the last page
   * @member {String} next
   */
  exports.prototype['next'] = undefined;
  /**
   * URI to the first last page of this set. Mandatory if this response is not the last page
   * @member {String} last
   */
  exports.prototype['last'] = undefined;



  return exports;
}));

