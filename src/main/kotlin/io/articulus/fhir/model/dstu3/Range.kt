//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.395 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Set of values bounded by low and high
 *
 * A set of ordered Quantities defined by a low and high limit.
 */
open class Range() : Element() {
    /**
     * High limit
     */
    var high: Quantity? = null

    /**
     * Low limit
     */
    var low: Quantity? = null
}
