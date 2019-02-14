//
// TermDepositAccount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct TermDepositAccount: Codable {

    public enum MaturityInstructions: String, Codable { 
        case rolledOver = "ROLLED_OVER"
        case paidOutAtMaturity = "PAID_OUT_AT_MATURITY"
    }
    /** The lodgement date of the original deposit */
    public var lodgementDate: String

    /** Maturity date for the term deposit */
    public var maturityDate: String

    /** Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated */
    public var maturityAmount: String?

    /** If absent assumes AUD */
    public var maturityCurrency: String?
    /** Current instructions on action to be taken at maturity */
    public var maturityInstructions: MaturityInstructions
    public init(lodgementDate: String, maturityDate: String, maturityAmount: String?, maturityCurrency: String?, maturityInstructions: MaturityInstructions) { 
        self.lodgementDate = lodgementDate
        self.maturityDate = maturityDate
        self.maturityAmount = maturityAmount
        self.maturityCurrency = maturityCurrency
        self.maturityInstructions = maturityInstructions
    }

}
