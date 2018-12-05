//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.688 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

/**
 * Definition of a parameter to a module
 *
 * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
 */
open class ParameterDefinition() : Element() {
    /**
     * A brief description of the parameter
     */
    var documentation: String? = null

    /**
     * Maximum cardinality (a number of *)
     */
    var max: String? = null

    /**
     * Minimum cardinality
     */
    var min: Int? = null

    /**
     * Name used to access the parameter value
     */
    var name: String? = null

    /**
     * What profile the value is expected to be
     */
    var profile: Reference? = null

    /**
     * What type of value
     */
    var type: String? = null

    /**
     * in | out
     */
    var use: String? = null
}
