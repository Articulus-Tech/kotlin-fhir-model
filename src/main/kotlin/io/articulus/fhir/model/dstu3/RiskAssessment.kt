//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.759 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Potential outcomes for a subject with likelihood
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
open class RiskAssessment() : DomainResource() {
    /**
     * Request fulfilled by this assessment
     */
    var basedOn: Reference? = null

    val basis: List<Reference> = mutableListOf<Reference>()

    /**
     * Type of assessment
     */
    var code: CodeableConcept? = null

    /**
     * Comments on the risk assessment
     */
    var comment: String? = null

    /**
     * Condition assessed
     */
    var condition: Reference? = null

    /**
     * Where was assessment performed?
     */
    var context: Reference? = null

    /**
     * Unique identifier for the assessment
     */
    var identifier: Identifier? = null

    /**
     * Evaluation mechanism
     */
    var method: CodeableConcept? = null

    /**
     * How to reduce risk
     */
    var mitigation: String? = null

    /**
     * When was assessment made?
     */
    var occurrenceDateTime: String? = null

    /**
     * When was assessment made?
     */
    var occurrencePeriod: Period? = null

    /**
     * Part of this occurrence
     */
    var parent: Reference? = null

    /**
     * Who did assessment?
     */
    var performer: Reference? = null

    val prediction: List<RiskAssessmentPrediction> = mutableListOf<RiskAssessmentPrediction>()

    /**
     * Why the assessment was necessary?
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Why the assessment was necessary?
     */
    var reasonReference: Reference? = null

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null

    /**
     * Who/what does assessment apply to?
     */
    var subject: Reference? = null
}

/**
 * Outcome predicted
 *
 * Describes the expected outcome for the subject.
 */
open class RiskAssessmentPrediction() : BackboneElement() {
    /**
     * Possible outcome for the subject
     */
    var outcome: CodeableConcept = CodeableConcept()

    /**
     * Likelihood of specified outcome
     */
    var probabilityDecimal: Float? = null

    /**
     * Likelihood of specified outcome
     */
    var probabilityRange: Range? = null

    /**
     * Likelihood of specified outcome as a qualitative value
     */
    var qualitativeRisk: CodeableConcept? = null

    /**
     * Explanation of prediction
     */
    var rationale: String? = null

    /**
     * Relative likelihood
     */
    var relativeRisk: Float? = null

    /**
     * Timeframe or age range
     */
    var whenPeriod: Period? = null

    /**
     * Timeframe or age range
     */
    var whenRange: Range? = null
}
