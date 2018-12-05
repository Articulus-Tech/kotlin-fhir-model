//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.461 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 */
open class Address() : Element() {
    /**
     * Name of city, town etc.
     */
    var city: String? = null

    /**
     * Country (e.g. can be ISO 3166 2 or 3 letter code)
     */
    var country: String? = null

    /**
     * District name (aka county)
     */
    var district: String? = null

    val line: List<String> = mutableListOf<String>()

    /**
     * Time period when address was/is in use
     */
    var period: Period? = null

    /**
     * Postal code for area
     */
    var postalCode: String? = null

    /**
     * Sub-unit of country (abbreviations ok)
     */
    var state: String? = null

    /**
     * Text representation of the address
     */
    var text: String? = null

    /**
     * postal | physical | both
     */
    var type: String? = null

    /**
     * home | work | temp | old - purpose of this address
     */
    var use: String? = null
}
