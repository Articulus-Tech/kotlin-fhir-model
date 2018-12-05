//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.734 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * A measured or measurable amount
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 */
open class Quantity() : Element() {
    /**
     * Coded form of the unit
     */
    var code: String? = null

    /**
     * < | <= | >= | > - how to understand the value
     */
    var comparator: String? = null

    /**
     * System that defines coded unit form
     */
    var system: String? = null

    /**
     * Unit representation
     */
    var unit: String? = null

    /**
     * Numerical value (with implicit precision)
     */
    var value: Float? = null
}
