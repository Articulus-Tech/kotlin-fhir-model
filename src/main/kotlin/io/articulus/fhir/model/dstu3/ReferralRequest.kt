//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.263 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A request for referral or transfer of care
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 */
open class ReferralRequest() : DomainResource() {
    /**
     * Date of creation/activation
     */
    var authoredOn: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Originating encounter
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * A textual description of the referral
     */
    var description: String? = null

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposal | plan | order
     */
    var intent: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When the service(s) requested in the referral should occur
     */
    var occurrenceDateTime: String? = null

    /**
     * When the service(s) requested in the referral should occur
     */
    var occurrencePeriod: Period? = null

    /**
     * Urgency of referral / transfer of care request
     */
    var priority: String? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val recipient: List<Reference> = mutableListOf<Reference>()

    val relevantHistory: List<Reference> = mutableListOf<Reference>()

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * Who/what is requesting service
     */
    var requester: ReferralRequestRequester? = null

    val serviceRequested: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * The clinical specialty (discipline) that the referral is requested for
     */
    var specialty: CodeableConcept? = null

    /**
     * draft | active | suspended | cancelled | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * Patient referred to care or transfer
     */
    var subject: Reference = Reference()

    val supportingInfo: List<Reference> = mutableListOf<Reference>()

    /**
     * Referral/Transition of care request type
     */
    var type: CodeableConcept? = null
}

/**
 * Who/what is requesting service
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class ReferralRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
