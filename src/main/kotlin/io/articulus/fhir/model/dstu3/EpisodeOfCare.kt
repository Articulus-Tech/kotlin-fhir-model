//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.690 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
 *
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
open class EpisodeOfCare() : DomainResource() {
    val account: List<Reference> = mutableListOf<Reference>()

    /**
     * Care manager/care co-ordinator for the patient
     */
    var careManager: Reference? = null

    val diagnosis: List<EpisodeOfCareDiagnosis> = mutableListOf<EpisodeOfCareDiagnosis>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Organization that assumes care
     */
    var managingOrganization: Reference? = null

    /**
     * The patient who is the focus of this episode of care
     */
    var patient: Reference = Reference()

    /**
     * Interval during responsibility is assumed
     */
    var period: Period? = null

    val referralRequest: List<Reference> = mutableListOf<Reference>()

    /**
     * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
     */
    var status: String? = null

    val statusHistory: List<EpisodeOfCareStatusHistory> =
            mutableListOf<EpisodeOfCareStatusHistory>()

    val team: List<Reference> = mutableListOf<Reference>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Past list of status codes (the current status may be included to cover the start date of the status)
 *
 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
 */
open class EpisodeOfCareStatusHistory() : BackboneElement() {
    /**
     * Duration the EpisodeOfCare was in the specified status
     */
    var period: Period = Period()

    /**
     * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
     */
    var status: String? = null
}

/**
 * The list of diagnosis relevant to this episode of care
 *
 * The list of diagnosis relevant to this episode of care.
 */
open class EpisodeOfCareDiagnosis() : BackboneElement() {
    /**
     * Conditions/problems/diagnoses this episode of care is for
     */
    var condition: Reference = Reference()

    /**
     * Ranking of the diagnosis (for each role type)
     */
    var rank: Int? = null

    /**
     * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
     */
    var role: CodeableConcept? = null
}
