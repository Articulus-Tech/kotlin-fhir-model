//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.665 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Resource for non-supported content
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
 */
open class Basic() : DomainResource() {
    /**
     * Who created
     */
    var author: Reference? = null

    /**
     * Kind of Resource
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * When created
     */
    var created: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Identifies the focus of this resource
     */
    var subject: Reference? = null
}
