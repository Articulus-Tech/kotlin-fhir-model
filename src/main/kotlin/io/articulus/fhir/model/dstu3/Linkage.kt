//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.403 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Links records for 'same' item
 *
 * Identifies two or more records (resource instances) that are referring to the same real-world "occurrence".
 */
open class Linkage() : DomainResource() {
    /**
     * Whether this linkage assertion is active or not
     */
    var active: Boolean? = null

    /**
     * Who is responsible for linkages
     */
    var author: Reference? = null

    val item: List<LinkageItem> = mutableListOf<LinkageItem>()
}

/**
 * Item to be linked
 *
 * Identifies one of the records that is considered to refer to the same real-world occurrence as well as how the items hould be evaluated within the collection of linked items.
 */
open class LinkageItem() : BackboneElement() {
    /**
     * Resource being linked
     */
    var resource: Reference = Reference()

    /**
     * source | alternate | historical
     */
    var type: String? = null
}
