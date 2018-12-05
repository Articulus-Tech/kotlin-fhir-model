//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.486 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * An action that is being or was performed on a patient
 *
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
open class Procedure() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Classification of the procedure
     */
    var category: CodeableConcept? = null

    /**
     * Identification of the procedure
     */
    var code: CodeableConcept? = null

    val complication: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val complicationDetail: List<Reference> = mutableListOf<Reference>()

    /**
     * Encounter or episode associated with the procedure
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    val focalDevice: List<ProcedureFocalDevice> = mutableListOf<ProcedureFocalDevice>()

    val followUp: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Where the procedure happened
     */
    var location: Reference? = null

    /**
     * True if procedure was not performed as scheduled
     */
    var notDone: Boolean? = null

    /**
     * Reason procedure was not performed
     */
    var notDoneReason: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * The result of procedure
     */
    var outcome: CodeableConcept? = null

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * Date/Period the procedure was performed
     */
    var performedDateTime: String? = null

    /**
     * Date/Period the procedure was performed
     */
    var performedPeriod: Period? = null

    val performer: List<ProcedurePerformer> = mutableListOf<ProcedurePerformer>()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    val report: List<Reference> = mutableListOf<Reference>()

    /**
     * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * Who the procedure was performed on
     */
    var subject: Reference = Reference()

    val usedCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val usedReference: List<Reference> = mutableListOf<Reference>()
}

/**
 * The people who performed the procedure
 *
 * Limited to 'real' people rather than equipment.
 */
open class ProcedurePerformer() : BackboneElement() {
    /**
     * The reference to the practitioner
     */
    var actor: Reference = Reference()

    /**
     * Organization the device or practitioner was acting for
     */
    var onBehalfOf: Reference? = null

    /**
     * The role the actor was in
     */
    var role: CodeableConcept? = null
}

/**
 * Device changed in procedure
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 */
open class ProcedureFocalDevice() : BackboneElement() {
    /**
     * Kind of change to device
     */
    var action: CodeableConcept? = null

    /**
     * Device that was changed
     */
    var manipulated: Reference = Reference()
}
