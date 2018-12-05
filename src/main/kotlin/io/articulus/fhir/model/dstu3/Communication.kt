//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.552 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A record of information transmitted from a sender to a receiver
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 */
open class Communication() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Encounter or episode leading to message
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val medium: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Communication did not occur
     */
    var notDone: Boolean? = null

    /**
     * Why communication did not occur
     */
    var notDoneReason: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    val payload: List<CommunicationPayload> = mutableListOf<CommunicationPayload>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    /**
     * When received
     */
    var received: String? = null

    val recipient: List<Reference> = mutableListOf<Reference>()

    /**
     * Message sender
     */
    var sender: Reference? = null

    /**
     * When sent
     */
    var sent: String? = null

    /**
     * preparation | in-progress | suspended | aborted | completed | entered-in-error
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
 * Text, attachment(s), or resource(s) that was communicated to the recipient.
 */
open class CommunicationPayload() : BackboneElement() {
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
