//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.609 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Information about the success/failure of an action
 *
 * A collection of error, warning or information messages that result from a system action.
 */
open class OperationOutcome() : DomainResource() {
    val issue: List<OperationOutcomeIssue> = mutableListOf<OperationOutcomeIssue>()
}

/**
 * A single issue associated with the action
 *
 * An error, warning or information message that results from a system action.
 */
open class OperationOutcomeIssue() : BackboneElement() {
    /**
     * Error or warning code
     */
    var code: String? = null

    /**
     * Additional details about the error
     */
    var details: CodeableConcept? = null

    /**
     * Additional diagnostic information about the issue
     */
    var diagnostics: String? = null

    val expression: List<String> = mutableListOf<String>()

    val location: List<String> = mutableListOf<String>()

    /**
     * fatal | error | warning | information
     */
    var severity: String? = null
}
