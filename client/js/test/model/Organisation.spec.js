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
    instance = new ConsumerDataStandards.Organisation();
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

  describe('Organisation', function() {
    it('should create an instance of Organisation', function() {
      // uncomment below and update the code to test Organisation
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be.a(ConsumerDataStandards.Organisation);
    });

    it('should have the property lastUpdateTime (base name: "lastUpdateTime")', function() {
      // uncomment below and update the code to test the property lastUpdateTime
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property agentFirstName (base name: "agentFirstName")', function() {
      // uncomment below and update the code to test the property agentFirstName
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property agentLastName (base name: "agentLastName")', function() {
      // uncomment below and update the code to test the property agentLastName
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property agentRole (base name: "agentRole")', function() {
      // uncomment below and update the code to test the property agentRole
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property businessName (base name: "businessName")', function() {
      // uncomment below and update the code to test the property businessName
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property legalName (base name: "legalName")', function() {
      // uncomment below and update the code to test the property legalName
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property shortName (base name: "shortName")', function() {
      // uncomment below and update the code to test the property shortName
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property abn (base name: "abn")', function() {
      // uncomment below and update the code to test the property abn
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property acn (base name: "acn")', function() {
      // uncomment below and update the code to test the property acn
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property isACNCRegistered (base name: "isACNCRegistered")', function() {
      // uncomment below and update the code to test the property isACNCRegistered
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property industryCode (base name: "industryCode")', function() {
      // uncomment below and update the code to test the property industryCode
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property organisationType (base name: "organisationType")', function() {
      // uncomment below and update the code to test the property organisationType
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property registeredCountry (base name: "registeredCountry")', function() {
      // uncomment below and update the code to test the property registeredCountry
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

    it('should have the property establishmentDate (base name: "establishmentDate")', function() {
      // uncomment below and update the code to test the property establishmentDate
      //var instance = new ConsumerDataStandards.Organisation();
      //expect(instance).to.be();
    });

  });

}));
