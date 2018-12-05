//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.288 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Results of a measure evaluation
 *
 * The MeasureReport resource contains the results of evaluating a measure.
 */
open class MeasureReport() : DomainResource() {
    /**
     * When the report was generated
     */
    var date: String? = null

    /**
     * What data was evaluated to produce the measure score
     */
    var evaluatedResources: Reference? = null

    val group: List<MeasureReportGroup> = mutableListOf<MeasureReportGroup>()

    /**
     * Additional identifier for the Report
     */
    var identifier: Identifier? = null

    /**
     * What measure was evaluated
     */
    var measure: Reference = Reference()

    /**
     * What patient the report is for
     */
    var patient: Reference? = null

    /**
     * What period the report covers
     */
    var period: Period = Period()

    /**
     * Who is reporting the data
     */
    var reportingOrganization: Reference? = null

    /**
     * complete | pending | error
     */
    var status: String? = null

    /**
     * individual | patient-list | summary
     */
    var type: String? = null
}

/**
 * Measure results for each group
 *
 * The results of the calculation, one for each population group in the measure.
 */
open class MeasureReportGroup() : BackboneElement() {
    /**
     * What group of the measure
     */
    var identifier: Identifier = Identifier()

    /**
     * What score this group achieved
     */
    var measureScore: Float? = null

    val population: List<MeasureReportGroupPopulation> =
            mutableListOf<MeasureReportGroupPopulation>()

    val stratifier: List<MeasureReportGroupStratifier> =
            mutableListOf<MeasureReportGroupStratifier>()
}

/**
 * The populations in the group
 *
 * The populations that make up the population group, one for each type of population appropriate for the measure.
 */
open class MeasureReportGroupPopulation() : BackboneElement() {
    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
     */
    var code: CodeableConcept? = null

    /**
     * Size of the population
     */
    var count: Int? = null

    /**
     * Population identifier as defined in the measure
     */
    var identifier: Identifier? = null

    /**
     * For patient-list reports, the patients in this population
     */
    var patients: Reference? = null
}

/**
 * Stratification results
 *
 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
 */
open class MeasureReportGroupStratifier() : BackboneElement() {
    /**
     * What stratifier of the group
     */
    var identifier: Identifier? = null

    val stratum: List<MeasureReportGroupStratifierStratum> =
            mutableListOf<MeasureReportGroupStratifierStratum>()
}

/**
 * Stratum results, one for each unique value in the stratifier
 *
 * This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
 */
open class MeasureReportGroupStratifierStratum() : BackboneElement() {
    /**
     * What score this stratum achieved
     */
    var measureScore: Float? = null

    val population: List<MeasureReportGroupStratifierStratumPopulation> =
            mutableListOf<MeasureReportGroupStratifierStratumPopulation>()

    /**
     * The stratum value, e.g. male
     */
    var value: String? = null
}

/**
 * Population results in this stratum
 *
 * The populations that make up the stratum, one for each type of population appropriate to the measure.
 */
open class MeasureReportGroupStratifierStratumPopulation() : BackboneElement() {
    /**
     * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
     */
    var code: CodeableConcept? = null

    /**
     * Size of the population
     */
    var count: Int? = null

    /**
     * Population identifier as defined in the measure
     */
    var identifier: Identifier? = null

    /**
     * For patient-list reports, the patients in this population
     */
    var patients: Reference? = null
}
