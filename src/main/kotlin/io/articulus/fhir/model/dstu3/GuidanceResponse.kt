//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.398 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * The formal response to a guidance request
 *
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 */
open class GuidanceResponse() : DomainResource() {
    /**
     * Encounter or Episode during which the response was returned
     */
    var context: Reference? = null

    val dataRequirement: List<DataRequirement> = mutableListOf<DataRequirement>()

    val evaluationMessage: List<Reference> = mutableListOf<Reference>()

    /**
     * Business identifier
     */
    var identifier: Identifier? = null

    /**
     * A reference to a knowledge module
     */
    var module: Reference = Reference()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When the guidance response was processed
     */
    var occurrenceDateTime: String? = null

    /**
     * The output parameters of the evaluation, if any
     */
    var outputParameters: Reference? = null

    /**
     * Device returning the guidance
     */
    var performer: Reference? = null

    /**
     * Reason for the response
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason for the response
     */
    var reasonReference: Reference? = null

    /**
     * The id of the request associated with this response, if any
     */
    var requestId: String? = null

    /**
     * Proposed actions, if any
     */
    var result: Reference? = null

    /**
     * success | data-requested | data-required | in-progress | failure | entered-in-error
     */
    var status: String? = null

    /**
     * Patient the request was performed for
     */
    var subject: Reference? = null
}
