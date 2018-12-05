//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.280 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Dispensing a medication to a named patient
 *
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 */
open class MedicationDispense() : DomainResource() {
    val authorizingPrescription: List<Reference> = mutableListOf<Reference>()

    /**
     * Type of medication dispense
     */
    var category: CodeableConcept? = null

    /**
     * Encounter / Episode associated with event
     */
    var context: Reference? = null

    /**
     * Amount of medication expressed as a timing amount
     */
    var daysSupply: Quantity? = null

    /**
     * Where the medication was sent
     */
    var destination: Reference? = null

    val detectedIssue: List<Reference> = mutableListOf<Reference>()

    val dosageInstruction: List<Dosage> = mutableListOf<Dosage>()

    val eventHistory: List<Reference> = mutableListOf<Reference>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * What medication was supplied
     */
    var medicationCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * What medication was supplied
     */
    var medicationReference: Reference = Reference()

    /**
     * Whether the dispense was or was not performed
     */
    var notDone: Boolean? = null

    /**
     * Why a dispense was not performed
     */
    var notDoneReasonCodeableConcept: CodeableConcept? = null

    /**
     * Why a dispense was not performed
     */
    var notDoneReasonReference: Reference? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    val performer: List<MedicationDispensePerformer> = mutableListOf<MedicationDispensePerformer>()

    /**
     * Amount dispensed
     */
    var quantity: Quantity? = null

    val receiver: List<Reference> = mutableListOf<Reference>()

    /**
     * preparation | in-progress | on-hold | completed | entered-in-error | stopped
     */
    var status: String? = null

    /**
     * Who the dispense is for
     */
    var subject: Reference? = null

    /**
     * Whether a substitution was performed on the dispense
     */
    var substitution: MedicationDispenseSubstitution? = null

    val supportingInformation: List<Reference> = mutableListOf<Reference>()

    /**
     * Trial fill, partial fill, emergency fill, etc.
     */
    var type: CodeableConcept? = null

    /**
     * When product was given out
     */
    var whenHandedOver: String? = null

    /**
     * When product was packaged and reviewed
     */
    var whenPrepared: String? = null
}

/**
 * Who performed event
 *
 * Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication.
 */
open class MedicationDispensePerformer() : BackboneElement() {
    /**
     * Individual who was performing
     */
    var actor: Reference = Reference()

    /**
     * Organization organization was acting for
     */
    var onBehalfOf: Reference? = null
}

/**
 * Whether a substitution was performed on the dispense
 *
 * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done.
 */
open class MedicationDispenseSubstitution() : BackboneElement() {
    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val responsibleParty: List<Reference> = mutableListOf<Reference>()

    /**
     * Code signifying whether a different drug was dispensed from what was prescribed
     */
    var type: CodeableConcept? = null

    /**
     * Whether a substitution was or was not performed on the dispense
     */
    var wasSubstituted: Boolean? = null
}
