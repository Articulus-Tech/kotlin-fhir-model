//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.550 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Search Parameter for a resource
 *
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 */
open class SearchParameter() : DomainResource() {
    val base: List<String> = mutableListOf<String>()

    val chain: List<String> = mutableListOf<String>()

    /**
     * Code used in URL
     */
    var code: String? = null

    val comparator: List<String> = mutableListOf<String>()

    val component: List<SearchParameterComponent> = mutableListOf<SearchParameterComponent>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Original Definition for the search parameter
     */
    var derivedFrom: String? = null

    /**
     * Natural language description of the search parameter
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * FHIRPath expression that extracts the values
     */
    var expression: String? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val modifier: List<String> = mutableListOf<String>()

    /**
     * Name for this search parameter (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this search parameter is defined
     */
    var purpose: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    val target: List<String> = mutableListOf<String>()

    /**
     * number | date | string | token | reference | composite | quantity | uri
     */
    var type: String? = null

    /**
     * Logical URI to reference this search parameter (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the search parameter
     */
    var version: String? = null

    /**
     * XPath that extracts the values
     */
    var xpath: String? = null

    /**
     * normal | phonetic | nearby | distance | other
     */
    var xpathUsage: String? = null
}

/**
 * For Composite resources to define the parts
 *
 * Used to define the parts of a composite search parameter.
 */
open class SearchParameterComponent() : BackboneElement() {
    /**
     * Defines how the part works
     */
    var definition: Reference = Reference()

    /**
     * Subexpression relative to main expression
     */
    var expression: String? = null
}
