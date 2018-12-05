//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.460 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Text node with attribution
 *
 * A  text note which also  contains information about who made the statement and when.
 */
open class Annotation() : Element() {
    /**
     * Individual responsible for the annotation
     */
    var authorReference: Reference? = null

    /**
     * Individual responsible for the annotation
     */
    var authorString: String? = null

    /**
     * The annotation  - text content
     */
    var text: String? = null

    /**
     * When the annotation was made
     */
    var time: String? = null
}
