//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.476 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Measurements and simple assertions
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 */
open class Observation() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Observed body part
     */
    var bodySite: CodeableConcept? = null

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Type of observation (code / type)
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Comments about result
     */
    var comment: String? = null

    val component: List<ObservationComponent> = mutableListOf<ObservationComponent>()

    /**
     * Healthcare event during which this observation is made
     */
    var context: Reference? = null

    /**
     * Why the result is missing
     */
    var dataAbsentReason: CodeableConcept? = null

    /**
     * (Measurement) Device
     */
    var device: Reference? = null

    /**
     * Clinically relevant time/time-period for observation
     */
    var effectiveDateTime: String? = null

    /**
     * Clinically relevant time/time-period for observation
     */
    var effectivePeriod: Period? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * High, low, normal, etc.
     */
    var interpretation: CodeableConcept? = null

    /**
     * Date/Time this was made available
     */
    var issued: String? = null

    /**
     * How it was done
     */
    var method: CodeableConcept? = null

    val performer: List<Reference> = mutableListOf<Reference>()

    val referenceRange: List<ObservationReferenceRange> = mutableListOf<ObservationReferenceRange>()

    val related: List<ObservationRelated> = mutableListOf<ObservationRelated>()

    /**
     * Specimen used for this observation
     */
    var specimen: Reference? = null

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null

    /**
     * Who and/or what this is about
     */
    var subject: Reference? = null

    /**
     * Actual result
     */
    var valueAttachment: Attachment? = null

    /**
     * Actual result
     */
    var valueBoolean: Boolean? = null

    /**
     * Actual result
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * Actual result
     */
    var valueDateTime: String? = null

    /**
     * Actual result
     */
    var valuePeriod: Period? = null

    /**
     * Actual result
     */
    var valueQuantity: Quantity? = null

    /**
     * Actual result
     */
    var valueRange: Range? = null

    /**
     * Actual result
     */
    var valueRatio: Ratio? = null

    /**
     * Actual result
     */
    var valueSampledData: SampledData? = null

    /**
     * Actual result
     */
    var valueString: String? = null

    /**
     * Actual result
     */
    var valueTime: String? = null
}

/**
 * Provides guide for interpretation
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range.
 */
open class ObservationReferenceRange() : BackboneElement() {
    /**
     * Applicable age range, if relevant
     */
    var age: Range? = null

    val appliesTo: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * High Range, if relevant
     */
    var high: Quantity? = null

    /**
     * Low Range, if relevant
     */
    var low: Quantity? = null

    /**
     * Text based reference range in an observation
     */
    var text: String? = null

    /**
     * Reference range qualifier
     */
    var type: CodeableConcept? = null
}

/**
 * Resource related to this observation
 *
 * A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code.
 */
open class ObservationRelated() : BackboneElement() {
    /**
     * Resource that is related to this one
     */
    var target: Reference = Reference()

    /**
     * has-member | derived-from | sequel-to | replaces | qualified-by | interfered-by
     */
    var type: String? = null
}

/**
 * Component results
 *
 * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
 */
open class ObservationComponent() : BackboneElement() {
    /**
     * Type of component observation (code / type)
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Why the component result is missing
     */
    var dataAbsentReason: CodeableConcept? = null

    /**
     * High, low, normal, etc.
     */
    var interpretation: CodeableConcept? = null

    val referenceRange: List<ObservationReferenceRange> = mutableListOf<ObservationReferenceRange>()

    /**
     * Actual component result
     */
    var valueAttachment: Attachment? = null

    /**
     * Actual component result
     */
    var valueCodeableConcept: CodeableConcept? = null

    /**
     * Actual component result
     */
    var valueDateTime: String? = null

    /**
     * Actual component result
     */
    var valuePeriod: Period? = null

    /**
     * Actual component result
     */
    var valueQuantity: Quantity? = null

    /**
     * Actual component result
     */
    var valueRange: Range? = null

    /**
     * Actual component result
     */
    var valueRatio: Ratio? = null

    /**
     * Actual component result
     */
    var valueSampledData: SampledData? = null

    /**
     * Actual component result
     */
    var valueString: String? = null

    /**
     * Actual component result
     */
    var valueTime: String? = null
}
