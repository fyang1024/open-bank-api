//
// EmailAddress.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct EmailAddress: Codable {

    public enum Purpose: String, Codable { 
        case work = "WORK"
        case home = "HOME"
        case other = "OTHER"
        case unspecified = "UNSPECIFIED"
    }
    /** Required for one and only one email record in the collection. Denotes the default email address */
    public var isPreferred: Bool
    /** The purpose for the email, as specified by the customer (Enumeration) */
    public var purpose: Purpose

    /** A correctly formatted email address, as defined by the addr_spec format in RFC_5322 */
    public var address: String
    public init(isPreferred: Bool, purpose: Purpose, address: String) { 
        self.isPreferred = isPreferred
        self.purpose = purpose
        self.address = address
    }

}
