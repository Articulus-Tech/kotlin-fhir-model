//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.712 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Contributor information
 *
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
 */
open class Contributor() : Element() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Who contributed the content
     */
    var name: String? = null

    /**
     * author | editor | reviewer | endorser
     */
    var type: String? = null
}
