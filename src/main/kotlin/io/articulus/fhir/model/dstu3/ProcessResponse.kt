//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.373 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * ProcessResponse resource
 *
 * This resource provides processing status, errors and notes from the processing of a resource.
 */
open class ProcessResponse() : DomainResource() {
    val communicationRequest: List<Reference> = mutableListOf<Reference>()

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    val error: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Authoring Organization
     */
    var organization: Reference? = null

    /**
     * Processing outcome
     */
    var outcome: CodeableConcept? = null

    val processNote: List<ProcessResponseProcessNote> = mutableListOf<ProcessResponseProcessNote>()

    /**
     * Request reference
     */
    var request: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Responsible Practitioner
     */
    var requestProvider: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null
}

/**
 * Processing comments or additional requirements
 *
 * Suite of processing notes or additional requirements if the processing has been held.
 */
open class ProcessResponseProcessNote() : BackboneElement() {
    /**
     * Comment on the processing
     */
    var text: String? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null
}
