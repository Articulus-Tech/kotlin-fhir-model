//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.593 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A set of codes drawn from one or more code systems
 *
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
open class CodeSystem() : DomainResource() {
    /**
     * If code comparison is case sensitive
     */
    var caseSensitive: Boolean? = null

    /**
     * If code system defines a post-composition grammar
     */
    var compositional: Boolean? = null

    val concept: List<CodeSystemConcept> = mutableListOf<CodeSystemConcept>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * not-present | example | fragment | complete
     */
    var content: String? = null

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Total concepts in the code system
     */
    var count: Int? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the code system
     */
    var description: String? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val filter: List<CodeSystemFilter> = mutableListOf<CodeSystemFilter>()

    /**
     * grouped-by | is-a | part-of | classified-with
     */
    var hierarchyMeaning: String? = null

    /**
     * Additional identifier for the code system
     */
    var identifier: Identifier? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this code system (computer friendly)
     */
    var name: String? = null

    val property: List<CodeSystemProperty> = mutableListOf<CodeSystemProperty>()

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this code system is defined
     */
    var purpose: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this code system (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this code system (globally unique) (Coding.system)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Canonical URL for value set with entire code system
     */
    var valueSet: String? = null

    /**
     * Business version of the code system (Coding.version)
     */
    var version: String? = null

    /**
     * If definitions are not stable
     */
    var versionNeeded: Boolean? = null
}

/**
 * Filter that can be used in a value set
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 */
open class CodeSystemFilter() : BackboneElement() {
    /**
     * Code that identifies the filter
     */
    var code: String? = null

    /**
     * How or why the filter is used
     */
    var description: String? = null

    val operator: List<String> = mutableListOf<String>()

    /**
     * What to use for the value
     */
    var value: String? = null
}

/**
 * Additional information supplied about each concept
 *
 * A property defines an additional slot through which additional information can be provided about a concept.
 */
open class CodeSystemProperty() : BackboneElement() {
    /**
     * Identifies the property on the concepts, and when referred to in operations
     */
    var code: String? = null

    /**
     * Why the property is defined, and/or what it conveys
     */
    var description: String? = null

    /**
     * code | Coding | string | integer | boolean | dateTime
     */
    var type: String? = null

    /**
     * Formal identifier for the property
     */
    var uri: String? = null
}

/**
 * Concepts in the code system
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
 */
open class CodeSystemConcept() : BackboneElement() {
    /**
     * Code that identifies concept
     */
    var code: String? = null

    val concept: List<CodeSystemConcept> = mutableListOf<CodeSystemConcept>()

    /**
     * Formal definition
     */
    var definition: String? = null

    val designation: List<CodeSystemConceptDesignation> =
            mutableListOf<CodeSystemConceptDesignation>()

    /**
     * Text to display to the user
     */
    var display: String? = null

    val property: List<CodeSystemConceptProperty> = mutableListOf<CodeSystemConceptProperty>()
}

/**
 * Additional representations for the concept
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
 */
open class CodeSystemConceptDesignation() : BackboneElement() {
    /**
     * Human language of the designation
     */
    var language: String? = null

    /**
     * Details how this designation would be used
     */
    var use: Coding? = null

    /**
     * The text value for this designation
     */
    var value: String? = null
}

/**
 * Property value for the concept
 *
 * A property value for this concept.
 */
open class CodeSystemConceptProperty() : BackboneElement() {
    /**
     * Reference to CodeSystem.property.code
     */
    var code: String? = null

    /**
     * Value of the property for this concept
     */
    var valueBoolean: Boolean? = null

    /**
     * Value of the property for this concept
     */
    var valueCode: String? = null

    /**
     * Value of the property for this concept
     */
    var valueCoding: Coding = Coding()

    /**
     * Value of the property for this concept
     */
    var valueDateTime: String? = null

    /**
     * Value of the property for this concept
     */
    var valueInteger: Int? = null

    /**
     * Value of the property for this concept
     */
    var valueString: String? = null
}
