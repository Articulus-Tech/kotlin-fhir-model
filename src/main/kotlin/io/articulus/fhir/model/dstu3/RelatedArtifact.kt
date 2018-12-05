//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.260 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Related artifacts for a knowledge resource
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 */
open class RelatedArtifact() : Element() {
    /**
     * Bibliographic citation for the artifact
     */
    var citation: String? = null

    /**
     * Brief description of the related artifact
     */
    var display: String? = null

    /**
     * What document is being referenced
     */
    var document: Attachment? = null

    /**
     * What resource is being referenced
     */
    var resource: Reference? = null

    /**
     * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
     */
    var type: String? = null

    /**
     * Where the artifact can be accessed
     */
    var url: String? = null
}
