//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.808 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Definition of an graph of resources
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
 */
open class GraphDefinition() : DomainResource() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the graph definition
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val link: List<GraphDefinitionLink> = mutableListOf<GraphDefinitionLink>()

    /**
     * Name for this graph definition (computer friendly)
     */
    var name: String? = null

    /**
     * Profile on base resource
     */
    var profile: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this graph definition is defined
     */
    var purpose: String? = null

    /**
     * Type of resource at which the graph starts
     */
    var start: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Logical URI to reference this graph definition (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the graph definition
     */
    var version: String? = null
}

/**
 * Links this graph makes rules about
 *
 * Links this graph makes rules about.
 */
open class GraphDefinitionLink() : BackboneElement() {
    /**
     * Why this link is specified
     */
    var description: String? = null

    /**
     * Maximum occurrences for this link
     */
    var max: String? = null

    /**
     * Minimum occurrences for this link
     */
    var min: Int? = null

    /**
     * Path in the resource that contains the link
     */
    var path: String? = null

    /**
     * Which slice (if profiled)
     */
    var sliceName: String? = null

    val target: List<GraphDefinitionLinkTarget> = mutableListOf<GraphDefinitionLinkTarget>()
}

/**
 * Potential target for the link
 *
 * Potential target for the link.
 */
open class GraphDefinitionLinkTarget() : BackboneElement() {
    val compartment: List<GraphDefinitionLinkTargetCompartment> =
            mutableListOf<GraphDefinitionLinkTargetCompartment>()

    val link: List<GraphDefinitionLink> = mutableListOf<GraphDefinitionLink>()

    /**
     * Profile for the target resource
     */
    var profile: String? = null

    /**
     * Type of resource this link refers to
     */
    var type: String? = null
}

/**
 * Compartment Consistency Rules
 *
 * Compartment Consistency Rules.
 */
open class GraphDefinitionLinkTargetCompartment() : BackboneElement() {
    /**
     * Identifies the compartment
     */
    var code: String? = null

    /**
     * Documentation for FHIRPath expression
     */
    var description: String? = null

    /**
     * Custom rule, as a FHIRPath expression
     */
    var expression: String? = null

    /**
     * identical | matching | different | custom
     */
    var rule: String? = null
}
