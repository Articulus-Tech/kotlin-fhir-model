//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.528 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Contact information
 *
 * Specifies contact information for a person or organization.
 */
open class ContactDetail() : Element() {
    /**
     * Name of an individual to contact
     */
    var name: String? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}
