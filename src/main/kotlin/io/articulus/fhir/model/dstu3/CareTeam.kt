//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.494 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Planned participants in the coordination and delivery of care for a patient or group
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 */
open class CareTeam() : DomainResource() {
    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Encounter or episode associated with CareTeam
     */
    var context: Reference? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val managingOrganization: List<Reference> = mutableListOf<Reference>()

    /**
     * Name of the team, such as crisis assessment team
     */
    var name: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val participant: List<CareTeamParticipant> = mutableListOf<CareTeamParticipant>()

    /**
     * Time period team covers
     */
    var period: Period? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    /**
     * proposed | active | suspended | inactive | entered-in-error
     */
    var status: String? = null

    /**
     * Who care team is for
     */
    var subject: Reference? = null
}

/**
 * Members of the team
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 */
open class CareTeamParticipant() : BackboneElement() {
    /**
     * Who is involved
     */
    var member: Reference? = null

    /**
     * Organization of the practitioner
     */
    var onBehalfOf: Reference? = null

    /**
     * Time period of participant
     */
    var period: Period? = null

    /**
     * Type of involvement
     */
    var role: CodeableConcept? = null
}
