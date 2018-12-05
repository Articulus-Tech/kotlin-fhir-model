//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.579 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A request for a procedure or diagnostic to be performed
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 */
open class ProcedureRequest() : DomainResource() {
    /**
     * Preconditions for procedure or diagnostic
     */
    var asNeededBoolean: Boolean? = null

    /**
     * Preconditions for procedure or diagnostic
     */
    var asNeededCodeableConcept: CodeableConcept? = null

    /**
     * Date request signed
     */
    var authoredOn: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * What is being requested/ordered
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Encounter or Episode during which request was created
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * True if procedure should not be performed
     */
    var doNotPerform: Boolean? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposal | plan | order +
     */
    var intent: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When procedure should occur
     */
    var occurrenceDateTime: String? = null

    /**
     * When procedure should occur
     */
    var occurrencePeriod: Period? = null

    /**
     * When procedure should occur
     */
    var occurrenceTiming: Timing? = null

    /**
     * Requested perfomer
     */
    var performer: Reference? = null

    /**
     * Performer role
     */
    var performerType: CodeableConcept? = null

    /**
     * routine | urgent | asap | stat
     */
    var priority: String? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Who/what is requesting procedure or diagnostic
     */
    var requester: ProcedureRequestRequester? = null

    /**
     * Composite Request ID
     */
    var requisition: Identifier? = null

    val specimen: List<Reference> = mutableListOf<Reference>()

    /**
     * draft | active | suspended | completed | entered-in-error | cancelled
     */
    var status: String? = null

    /**
     * Individual the service is ordered for
     */
    var subject: Reference = Reference()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who/what is requesting procedure or diagnostic
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class ProcedureRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
