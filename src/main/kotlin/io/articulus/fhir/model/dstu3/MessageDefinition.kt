//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.492 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A resource that defines a type of message that can be exchanged between systems
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 */
open class MessageDefinition() : DomainResource() {
    val allowedResponse: List<MessageDefinitionAllowedResponse> =
            mutableListOf<MessageDefinitionAllowedResponse>()

    /**
     * Definition this one is based on
     */
    var base: Reference? = null

    /**
     * Consequence | Currency | Notification
     */
    var category: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the message definition
     */
    var description: String? = null

    /**
     * Event type
     */
    var event: Coding = Coding()

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val focus: List<MessageDefinitionFocus> = mutableListOf<MessageDefinitionFocus>()

    /**
     * Additional identifier for the message definition
     */
    var identifier: Identifier? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this message definition (computer friendly)
     */
    var name: String? = null

    val parent: List<Reference> = mutableListOf<Reference>()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this message definition is defined
     */
    var purpose: String? = null

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Is a response required?
     */
    var responseRequired: Boolean? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this message definition (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this message definition (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the message definition
     */
    var version: String? = null
}

/**
 * Resource(s) that are the subject of the event
 *
 * Identifies the resource (or resources) that are being addressed by the event.  For example, the Encounter for an admit message or two Account records for a merge.
 */
open class MessageDefinitionFocus() : BackboneElement() {
    /**
     * Type of resource
     */
    var code: String? = null

    /**
     * Maximum number of focuses of this type
     */
    var max: String? = null

    /**
     * Minimum number of focuses of this type
     */
    var min: Int? = null

    /**
     * Profile that must be adhered to by focus
     */
    var profile: Reference? = null
}

/**
 * Responses to this message
 *
 * Indicates what types of messages may be sent as an application-level response to this message.
 */
open class MessageDefinitionAllowedResponse() : BackboneElement() {
    /**
     * Reference to allowed message definition response
     */
    var message: Reference = Reference()

    /**
     * When should this response be used
     */
    var situation: String? = null
}
