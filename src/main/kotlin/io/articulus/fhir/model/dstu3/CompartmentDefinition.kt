//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.323 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Compartment Definition for a resource
 *
 * A compartment definition that defines how resources are accessed on a server.
 */
open class CompartmentDefinition() : DomainResource() {
    /**
     * Patient | Encounter | RelatedPerson | Practitioner | Device
     */
    var code: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the compartment definition
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this compartment definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this compartment definition is defined
     */
    var purpose: String? = null

    val resource: List<CompartmentDefinitionResource> =
            mutableListOf<CompartmentDefinitionResource>()

    /**
     * Whether the search syntax is supported
     */
    var search: Boolean? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this compartment definition (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this compartment definition (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()
}

/**
 * How a resource is related to the compartment
 *
 * Information about how a resource is related to the compartment.
 */
open class CompartmentDefinitionResource() : BackboneElement() {
    /**
     * Name of resource type
     */
    var code: String? = null

    /**
     * Additional documentation about the resource and compartment
     */
    var documentation: String? = null

    val param: List<String> = mutableListOf<String>()
}
