//
// RequestAccountIds.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct RequestAccountIds: Codable {


    public var data: RequestAccountIdsData

    public var meta: Meta
    public init(data: RequestAccountIdsData, meta: Meta) { 
        self.data = data
        self.meta = meta
    }

}
