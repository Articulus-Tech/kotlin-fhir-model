//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.588 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Base Resource
 *
 * This is the base resource type for everything.
 */
open class Resource() : FhirAbstractResource() {
    /**
     * Logical id of this artifact
     */
    var id: String? = null

    /**
     * A set of rules under which this content was created
     */
    var implicitRules: String? = null

    /**
     * Language of the resource content
     */
    var language: String? = null

    /**
     * Metadata about the resource
     */
    var meta: Meta? = null
}
