//
// DomesticPayeeCard.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct DomesticPayeeCard: Codable {


    /** Name of the account to pay to */
    public var cardNumber: String
    public init(cardNumber: String) { 
        self.cardNumber = cardNumber
    }

}
