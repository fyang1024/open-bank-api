/**
* Consumer Data Standards
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
*
* OpenAPI spec version: 1-oas3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.basicAuthentication
import io.ktor.auth.oauth
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import kotlinx.coroutines.experimental.asCoroutineDispatcher

import org.openapitools.server.ApplicationAuthProviders
import org.openapitools.server.Paths
import org.openapitools.server.ApplicationExecutors
import org.openapitools.server.HTTP.client
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.infrastructure.apiKeyAuth

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288
import org.openapitools.server.delete

import org.openapitools.server.models.ResponseCommonCustomer
import org.openapitools.server.models.ResponseCommonCustomerDetailed

fun Route.CustomerApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.getCustomer> {  it: Paths.getCustomer ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "data" : {
            "person" : {
              "middleNames" : [ "middleNames", "middleNames" ],
              "firstName" : "firstName",
              "lastName" : "lastName",
              "occupationCode" : "occupationCode",
              "prefix" : "prefix",
              "suffix" : "suffix",
              "lastUpdateTime" : "lastUpdateTime"
            },
            "organisation" : {
              "agentRole" : "agentRole",
              "agentLastName" : "agentLastName",
              "establishmentDate" : "establishmentDate",
              "businessName" : "businessName",
              "registeredCountry" : "registeredCountry",
              "abn" : "abn",
              "acn" : "acn",
              "industryCode" : "industryCode",
              "organisationType" : "SOLE_TRADER",
              "legalName" : "legalName",
              "isACNCRegistered" : true,
              "agentFirstName" : "agentFirstName",
              "shortName" : "shortName",
              "lastUpdateTime" : "lastUpdateTime"
            },
            "customerUType" : "person"
          },
          "meta" : "{}",
          "links" : {
            "self" : "self"
          }
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getCustomerDetail> {  it: Paths.getCustomerDetail ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "data" : {
            "customerUType" : "person"
          },
          "meta" : "{}",
          "links" : {
            "self" : "self"
          }
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    
}