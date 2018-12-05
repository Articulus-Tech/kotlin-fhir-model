//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.231 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Medical device request
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 */
open class DeviceRequest() : DomainResource() {
    /**
     * When recorded
     */
    var authoredOn: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Device requested
     */
    var codeCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Device requested
     */
    var codeReference: Reference = Reference()

    /**
     * Encounter or Episode motivating request
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * Identifier of composite request
     */
    var groupIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposal | plan | original-order | encoded | reflex-order
     */
    var intent: CodeableConcept = CodeableConcept()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Desired time or schedule for use
     */
    var occurrenceDateTime: String? = null

    /**
     * Desired time or schedule for use
     */
    var occurrencePeriod: Period? = null

    /**
     * Desired time or schedule for use
     */
    var occurrenceTiming: Timing? = null

    /**
     * Requested Filler
     */
    var performer: Reference? = null

    /**
     * Fille role
     */
    var performerType: CodeableConcept? = null

    val priorRequest: List<Reference> = mutableListOf<Reference>()

    /**
     * Indicates how quickly the {{title}} should be addressed with respect to other requests
     */
    var priority: String? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()

    /**
     * Who/what is requesting diagnostics
     */
    var requester: DeviceRequestRequester? = null

    /**
     * draft | active | suspended | completed | entered-in-error | cancelled
     */
    var status: String? = null

    /**
     * Focus of request
     */
    var subject: Reference = Reference()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/what is requesting diagnostics
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class DeviceRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
