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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ConsumerDataStandards);
  }
}(this, function(expect, ConsumerDataStandards) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ConsumerDataStandards.AccountFeatures();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AccountFeatures', function() {
    it('should create an instance of AccountFeatures', function() {
      // uncomment below and update the code to test AccountFeatures
      //var instance = new ConsumerDataStandards.AccountFeatures();
      //expect(instance).to.be.a(ConsumerDataStandards.AccountFeatures);
    });

    it('should have the property featureType (base name: "featureType")', function() {
      // uncomment below and update the code to test the property featureType
      //var instance = new ConsumerDataStandards.AccountFeatures();
      //expect(instance).to.be();
    });

    it('should have the property additionalValue (base name: "additionalValue")', function() {
      // uncomment below and update the code to test the property additionalValue
      //var instance = new ConsumerDataStandards.AccountFeatures();
      //expect(instance).to.be();
    });

  });

}));