//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.628 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Concept - reference to a terminology or just  text
 *
 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
 */
open class CodeableConcept() : Element() {
    val coding: List<Coding> = mutableListOf<Coding>()

    /**
     * Plain text representation of the concept
     */
    var text: String? = null
}
