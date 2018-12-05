//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.364 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Clinical issue with action
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 */
open class DetectedIssue() : DomainResource() {
    /**
     * The provider or device that identified the issue
     */
    var author: Reference? = null

    /**
     * Issue Category, e.g. drug-drug, duplicate therapy, etc.
     */
    var category: CodeableConcept? = null

    /**
     * When identified
     */
    var date: String? = null

    /**
     * Description and context
     */
    var detail: String? = null

    /**
     * Unique id for the detected issue
     */
    var identifier: Identifier? = null

    val implicated: List<Reference> = mutableListOf<Reference>()

    val mitigation: List<DetectedIssueMitigation> = mutableListOf<DetectedIssueMitigation>()

    /**
     * Associated patient
     */
    var patient: Reference? = null

    /**
     * Authority for issue
     */
    var reference: String? = null

    /**
     * high | moderate | low
     */
    var severity: String? = null

    /**
     * registered | preliminary | final | amended +
     */
    var status: String? = null
}

/**
 * Step taken to address
 *
 * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
 */
open class DetectedIssueMitigation() : BackboneElement() {
    /**
     * What mitigation?
     */
    var action: CodeableConcept = CodeableConcept()

    /**
     * Who is committing?
     */
    var author: Reference? = null

    /**
     * Date committed
     */
    var date: String? = null
}
