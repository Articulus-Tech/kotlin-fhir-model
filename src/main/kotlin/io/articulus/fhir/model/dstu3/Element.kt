//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.278 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Base for all elements
 *
 * Base definition for all elements in a resource.
 */
open class Element() {
    val extension: List<Extension> = mutableListOf<Extension>()

    /**
     * xml:id (or equivalent in JSON)
     */
    var id: String? = null
}
