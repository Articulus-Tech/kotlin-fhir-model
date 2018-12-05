//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.512 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * A ratio of two Quantity values - a numerator and a denominator
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 */
open class Ratio() : Element() {
    /**
     * Denominator value
     */
    var denominator: Quantity? = null

    /**
     * Numerator value
     */
    var numerator: Quantity? = null
}
