//
// ResponseBankingTransactionDetail.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct ResponseBankingTransactionDetail: Codable {


    public var data: ResponseBankingTransactionDetailData

    public var links: Links

    public var meta: Meta
    public init(data: ResponseBankingTransactionDetailData, links: Links, meta: Meta) { 
        self.data = data
        self.links = links
        self.meta = meta
    }

}
