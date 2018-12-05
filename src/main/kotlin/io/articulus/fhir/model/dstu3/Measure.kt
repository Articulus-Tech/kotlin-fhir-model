//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.633 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A quality measure definition
 *
 * The Measure resource provides the definition of a quality measure.
 */
open class Measure() : DomainResource() {
    /**
     * When the measure was approved by publisher
     */
    var approvalDate: String? = null

    /**
     * Summary of clinical guidelines
     */
    var clinicalRecommendationStatement: String? = null

    /**
     * opportunity | all-or-nothing | linear | weighted
     */
    var compositeScoring: CodeableConcept? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val contributor: List<Contributor> = mutableListOf<Contributor>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    val definition: List<String> = mutableListOf<String>()

    /**
     * Natural language description of the measure
     */
    var description: String? = null

    /**
     * Disclaimer for use of the measure or its referenced content
     */
    var disclaimer: String? = null

    /**
     * When the measure is expected to be used
     */
    var effectivePeriod: Period? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val group: List<MeasureGroup> = mutableListOf<MeasureGroup>()

    /**
     * Additional guidance for implementers
     */
    var guidance: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Improvement notation for the measure, e.g. higher score indicates better quality
     */
    var improvementNotation: String? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * When the measure was last reviewed
     */
    var lastReviewDate: String? = null

    val library: List<Reference> = mutableListOf<Reference>()

    /**
     * Name for this measure (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this measure is defined
     */
    var purpose: String? = null

    /**
     * How is rate aggregation performed for this measure
     */
    var rateAggregation: String? = null

    /**
     * Why does this measure exist
     */
    var rationale: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * How is risk adjustment applied for this measure
     */
    var riskAdjustment: String? = null

    /**
     * proportion | ratio | continuous-variable | cohort
     */
    var scoring: CodeableConcept? = null

    /**
     * The measure set, e.g. Preventive Care and Screening
     */
    var set: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    val supplementalData: List<MeasureSupplementalData> = mutableListOf<MeasureSupplementalData>()

    /**
     * Name for this measure (human friendly)
     */
    var title: String? = null

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Logical URI to reference this measure (globally unique)
     */
    var url: String? = null

    /**
     * Describes the clinical usage of the measure
     */
    var usage: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the measure
     */
    var version: String? = null
}

/**
 * Population criteria group
 *
 * A group of population criteria for the measure.
 */
open class MeasureGroup() : BackboneElement() {
    /**
     * Summary description
     */
    var description: String? = null

    /**
     * Unique identifier
     */
    var identifier: Identifier = Identifier()

    /**
     * Short name
     */
    var name: String? = null

    val population: List<MeasureGroupPopulation> = mutableListOf<MeasureGroupPopulation>()

    val stratifier: List<MeasureGroupStratifier> = mutableListOf<MeasureGroupStratifier>()
}

/**
 * Population criteria
 *
 * A population criteria for the measure.
 */
open class MeasureGroupPopulation() : BackboneElement() {
    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
     */
    var code: CodeableConcept? = null

    /**
     * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
     */
    var criteria: String? = null

    /**
     * The human readable description of this population criteria
     */
    var description: String? = null

    /**
     * Unique identifier
     */
    var identifier: Identifier? = null

    /**
     * Short name
     */
    var name: String? = null
}

/**
 * Stratifier criteria for the measure
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path.
 */
open class MeasureGroupStratifier() : BackboneElement() {
    /**
     * How the measure should be stratified
     */
    var criteria: String? = null

    /**
     * The identifier for the stratifier used to coordinate the reported data back to this stratifier
     */
    var identifier: Identifier? = null

    /**
     * Path to the stratifier
     */
    var path: String? = null
}

/**
 * What other data should be reported with the measure
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
 */
open class MeasureSupplementalData() : BackboneElement() {
    /**
     * Expression describing additional data to be reported
     */
    var criteria: String? = null

    /**
     * Identifier, unique within the measure
     */
    var identifier: Identifier? = null

    /**
     * Path to the supplemental data element
     */
    var path: String? = null

    val usage: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}
