//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.198 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Structural Definition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 */
open class StructureDefinition() : DomainResource() {
    /**
     * Whether the structure is abstract
     */
    var abstract: Boolean? = null

    /**
     * Definition that this type is constrained/specialized from
     */
    var baseDefinition: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val context: List<String> = mutableListOf<String>()

    val contextInvariant: List<String> = mutableListOf<String>()

    /**
     * resource | datatype | extension
     */
    var contextType: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * specialization | constraint - How relates to base definition
     */
    var derivation: String? = null

    /**
     * Natural language description of the structure definition
     */
    var description: String? = null

    /**
     * Differential view of the structure
     */
    var differential: StructureDefinitionDifferential? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * FHIR Version this StructureDefinition targets
     */
    var fhirVersion: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val keyword: List<Coding> = mutableListOf<Coding>()

    /**
     * primitive-type | complex-type | resource | logical
     */
    var kind: String? = null

    val mapping: List<StructureDefinitionMapping> = mutableListOf<StructureDefinitionMapping>()

    /**
     * Name for this structure definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this structure definition is defined
     */
    var purpose: String? = null

    /**
     * Snapshot view of the structure
     */
    var snapshot: StructureDefinitionSnapshot? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this structure definition (human friendly)
     */
    var title: String? = null

    /**
     * Type defined or constrained by this structure
     */
    var type: String? = null

    /**
     * Logical URI to reference this structure definition (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the structure definition
     */
    var version: String? = null
}

/**
 * External specification that the content is mapped to
 *
 * An external specification that the content is mapped to.
 */
open class StructureDefinitionMapping() : BackboneElement() {
    /**
     * Versions, Issues, Scope limitations etc.
     */
    var comment: String? = null

    /**
     * Internal id when this mapping is used
     */
    var identity: String? = null

    /**
     * Names what this mapping refers to
     */
    var name: String? = null

    /**
     * Identifies what this mapping refers to
     */
    var uri: String? = null
}

/**
 * Snapshot view of the structure
 *
 * A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
 */
open class StructureDefinitionSnapshot() : BackboneElement() {
    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()
}

/**
 * Differential view of the structure
 *
 * A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
 */
open class StructureDefinitionDifferential() : BackboneElement() {
    val element: List<ElementDefinition> = mutableListOf<ElementDefinition>()
}
