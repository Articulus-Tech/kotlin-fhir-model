//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.415 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Describes a required data item
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
open class DataRequirement() : Element() {
    val codeFilter: List<DataRequirementCodeFilter> = mutableListOf<DataRequirementCodeFilter>()

    val dateFilter: List<DataRequirementDateFilter> = mutableListOf<DataRequirementDateFilter>()

    val mustSupport: List<String> = mutableListOf<String>()

    val profile: List<String> = mutableListOf<String>()

    /**
     * The type of the required data
     */
    var type: String? = null
}

/**
 * What codes are expected
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
 */
open class DataRequirementCodeFilter() : Element() {
    /**
     * The code-valued attribute of the filter
     */
    var path: String? = null

    val valueCode: List<String> = mutableListOf<String>()

    val valueCodeableConcept: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val valueCoding: List<Coding> = mutableListOf<Coding>()

    /**
     * Valueset for the filter
     */
    var valueSetReference: Reference? = null

    /**
     * Valueset for the filter
     */
    var valueSetString: String? = null
}

/**
 * What dates/date ranges are expected
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
 */
open class DataRequirementDateFilter() : Element() {
    /**
     * The date-valued attribute of the filter
     */
    var path: String? = null

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valueDateTime: String? = null

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valueDuration: Duration? = null

    /**
     * The value of the filter, as a Period, DateTime, or Duration value
     */
    var valuePeriod: Period? = null
}
