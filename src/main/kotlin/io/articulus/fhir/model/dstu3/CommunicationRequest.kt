//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.618 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A request for information to be sent to a receiver
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 */
open class CommunicationRequest() : DomainResource() {
    /**
     * When request transitioned to being actionable
     */
    var authoredOn: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Encounter or episode leading to message
     */
    var context: Reference? = null

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val medium: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When scheduled
     */
    var occurrenceDateTime: String? = null

    /**
     * When scheduled
     */
    var occurrencePeriod: Period? = null

    val payload: List<CommunicationRequestPayload> = mutableListOf<CommunicationRequestPayload>()

    /**
     * Message urgency
     */
    var priority: String? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val recipient: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Who/what is requesting service
     */
    var requester: CommunicationRequestRequester? = null

    /**
     * Message sender
     */
    var sender: Reference? = null

    /**
     * draft | active | suspended | cancelled | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * Focus of message
     */
    var subject: Reference? = null

    val topic: List<Reference> = mutableListOf<Reference>()
}

/**
 * Message payload
 *
 * Text, attachment(s), or resource(s) to be communicated to the recipient.
 */
open class CommunicationRequestPayload() : BackboneElement() {
    /**
     * Message part content
     */
    var contentAttachment: Attachment = Attachment()

    /**
     * Message part content
     */
    var contentReference: Reference = Reference()

    /**
     * Message part content
     */
    var contentString: String? = null
}

/**
 * Who/what is requesting service
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class CommunicationRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
