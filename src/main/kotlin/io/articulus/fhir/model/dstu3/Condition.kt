//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.630 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Detailed information about conditions, problems or diagnoses
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
open class Condition() : DomainResource() {
    /**
     * If/when in resolution/remission
     */
    var abatementAge: Age? = null

    /**
     * If/when in resolution/remission
     */
    var abatementBoolean: Boolean? = null

    /**
     * If/when in resolution/remission
     */
    var abatementDateTime: String? = null

    /**
     * If/when in resolution/remission
     */
    var abatementPeriod: Period? = null

    /**
     * If/when in resolution/remission
     */
    var abatementRange: Range? = null

    /**
     * If/when in resolution/remission
     */
    var abatementString: String? = null

    /**
     * Date record was believed accurate
     */
    var assertedDate: String? = null

    /**
     * Person who asserts this condition
     */
    var asserter: Reference? = null

    val bodySite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * active | recurrence | inactive | remission | resolved
     */
    var clinicalStatus: String? = null

    /**
     * Identification of the condition, problem or diagnosis
     */
    var code: CodeableConcept? = null

    /**
     * Encounter or episode when condition first asserted
     */
    var context: Reference? = null

    val evidence: List<ConditionEvidence> = mutableListOf<ConditionEvidence>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetAge: Age? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetDateTime: String? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetPeriod: Period? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetRange: Range? = null

    /**
     * Estimated or actual date,  date-time, or age
     */
    var onsetString: String? = null

    /**
     * Subjective severity of condition
     */
    var severity: CodeableConcept? = null

    /**
     * Stage/grade, usually assessed formally
     */
    var stage: ConditionStage? = null

    /**
     * Who has the condition?
     */
    var subject: Reference = Reference()

    /**
     * provisional | differential | confirmed | refuted | entered-in-error | unknown
     */
    var verificationStatus: String? = null
}

/**
 * Stage/grade, usually assessed formally
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 */
open class ConditionStage() : BackboneElement() {
    val assessment: List<Reference> = mutableListOf<Reference>()

    /**
     * Simple summary (disease specific)
     */
    var summary: CodeableConcept? = null
}

/**
 * Supporting evidence
 *
 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
 */
open class ConditionEvidence() : BackboneElement() {
    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val detail: List<Reference> = mutableListOf<Reference>()
}
