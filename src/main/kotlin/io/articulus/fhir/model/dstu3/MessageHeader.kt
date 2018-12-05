//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.513 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A resource that describes a message that is exchanged between systems
 *
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
open class MessageHeader() : DomainResource() {
    /**
     * The source of the decision
     */
    var author: Reference? = null

    val destination: List<MessageHeaderDestination> = mutableListOf<MessageHeaderDestination>()

    /**
     * The source of the data entry
     */
    var enterer: Reference? = null

    /**
     * Code for the event this message represents
     */
    var event: Coding = Coding()

    val focus: List<Reference> = mutableListOf<Reference>()

    /**
     * Cause of event
     */
    var reason: CodeableConcept? = null

    /**
     * Intended "real-world" recipient for the data
     */
    var receiver: Reference? = null

    /**
     * If this is a reply to prior message
     */
    var response: MessageHeaderResponse? = null

    /**
     * Final responsibility for event
     */
    var responsible: Reference? = null

    /**
     * Real world sender of the message
     */
    var sender: Reference? = null

    /**
     * Message source application
     */
    var source: MessageHeaderSource = MessageHeaderSource()

    /**
     * Time that the message was sent
     */
    var timestamp: String? = null
}

/**
 * Message destination application(s)
 *
 * The destination application which the message is intended for.
 */
open class MessageHeaderDestination() : BackboneElement() {
    /**
     * Actual destination address or id
     */
    var endpoint: String? = null

    /**
     * Name of system
     */
    var name: String? = null

    /**
     * Particular delivery destination within the destination
     */
    var target: Reference? = null
}

/**
 * Message source application
 *
 * The source application from which this message originated.
 */
open class MessageHeaderSource() : BackboneElement() {
    /**
     * Human contact for problems
     */
    var contact: ContactPoint? = null

    /**
     * Actual message source address or id
     */
    var endpoint: String? = null

    /**
     * Name of system
     */
    var name: String? = null

    /**
     * Name of software running the system
     */
    var software: String? = null

    /**
     * Version of software running
     */
    var version: String? = null
}

/**
 * If this is a reply to prior message
 *
 * Information about the message that this message is a response to.  Only present if this message is a response.
 */
open class MessageHeaderResponse() : BackboneElement() {
    /**
     * ok | transient-error | fatal-error
     */
    var code: String? = null

    /**
     * Specific list of hints/warnings/errors
     */
    var details: Reference? = null

    /**
     * Id of original message
     */
    var identifier: String? = null
}
