//
// AccountLendingRates.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct AccountLendingRates: Codable {

    public enum LendingRateType: String, Codable { 
        case fixed = "FIXED"
        case introductory = "INTRODUCTORY"
        case discount = "DISCOUNT"
        case penalty = "PENALTY"
        case bundleDiscount = "BUNDLE_DISCOUNT"
        case floating = "FLOATING"
        case marketLinked = "MARKET_LINKED"
        case cashAdvance = "CASH_ADVANCE"
        case variable = "VARIABLE"
        case comparison = "COMPARISON"
    }    /** The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning */
    public var lendingRateType: LendingRateType

    /** The rate to be applied */
    public var rate: String

    /** Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType */
    public var additionalValue: String?

    /** Display text providing more information on the fee. */
    public var additionalInfo: String?

    /** Link to a web page with more information  on this fee */
    public var additionalInfoUri: String?
    public init(lendingRateType: LendingRateType, rate: String, additionalValue: String?, additionalInfo: String?, additionalInfoUri: String?) { 
        self.lendingRateType = lendingRateType
        self.rate = rate
        self.additionalValue = additionalValue
        self.additionalInfo = additionalInfo
        self.additionalInfoUri = additionalInfoUri
    }

}
