//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.185 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Base for elements defined inside a resource
 *
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 */
open class BackboneElement() : Element() {
    val modifierExtension: List<Extension> = mutableListOf<Extension>()
}
