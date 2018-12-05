//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.556 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A set of codes drawn from one or more code systems
 *
 * A value set specifies a set of codes drawn from one or more code systems.
 */
open class ValueSet() : DomainResource() {
    /**
     * Definition of the content of the value set (CLD)
     */
    var compose: ValueSetCompose? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the value set
     */
    var description: String? = null

    /**
     * Used when the value set is "expanded"
     */
    var expansion: ValueSetExpansion? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    /**
     * Whether this is intended to be used with an extensible binding
     */
    var extensible: Boolean? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Indicates whether or not any change to the content logical definition may occur
     */
    var immutable: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Name for this value set (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this value set is defined
     */
    var purpose: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this value set (human friendly)
     */
    var title: String? = null

    /**
     * Logical URI to reference this value set (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the value set
     */
    var version: String? = null
}

/**
 * Definition of the content of the value set (CLD)
 *
 * A set of criteria that define the content logical definition of the value set by including or excluding codes from outside this value set. This I also known as the "Content Logical Definition" (CLD).
 */
open class ValueSetCompose() : BackboneElement() {
    val exclude: List<ValueSetComposeInclude> = mutableListOf<ValueSetComposeInclude>()

    /**
     * Whether inactive codes are in the value set
     */
    var inactive: Boolean? = null

    val include: List<ValueSetComposeInclude> = mutableListOf<ValueSetComposeInclude>()

    /**
     * Fixed date for version-less references (transitive)
     */
    var lockedDate: String? = null
}

/**
 * Include one or more codes from a code system or other value set(s)
 *
 * Include one or more codes from a code system or other value set(s).
 */
open class ValueSetComposeInclude() : BackboneElement() {
    val concept: List<ValueSetComposeIncludeConcept> =
            mutableListOf<ValueSetComposeIncludeConcept>()

    val filter: List<ValueSetComposeIncludeFilter> = mutableListOf<ValueSetComposeIncludeFilter>()

    /**
     * The system the codes come from
     */
    var system: String? = null

    val valueSet: List<String> = mutableListOf<String>()

    /**
     * Specific version of the code system referred to
     */
    var version: String? = null
}

/**
 * A concept defined in the system
 *
 * Specifies a concept to be included or excluded.
 */
open class ValueSetComposeIncludeConcept() : BackboneElement() {
    /**
     * Code or expression from system
     */
    var code: String? = null

    val designation: List<ValueSetComposeIncludeConceptDesignation> =
            mutableListOf<ValueSetComposeIncludeConceptDesignation>()

    /**
     * Text to display for this code for this value set in this valueset
     */
    var display: String? = null
}

/**
 * Additional representations for this concept
 *
 * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
 */
open class ValueSetComposeIncludeConceptDesignation() : BackboneElement() {
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
 * Select codes/concepts by their properties (including relationships)
 *
 * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
 */
open class ValueSetComposeIncludeFilter() : BackboneElement() {
    /**
     * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
     */
    var op: String? = null

    /**
     * A property defined by the code system
     */
    var property: String? = null

    /**
     * Code from the system, or regex criteria, or boolean value for exists
     */
    var value: String? = null
}

/**
 * Used when the value set is "expanded"
 *
 * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
 */
open class ValueSetExpansion() : BackboneElement() {
    val contains: List<ValueSetExpansionContains> = mutableListOf<ValueSetExpansionContains>()

    /**
     * Uniquely identifies this expansion
     */
    var identifier: String? = null

    /**
     * Offset at which this resource starts
     */
    var offset: Int? = null

    val parameter: List<ValueSetExpansionParameter> = mutableListOf<ValueSetExpansionParameter>()

    /**
     * Time ValueSet expansion happened
     */
    var timestamp: String? = null

    /**
     * Total number of codes in the expansion
     */
    var total: Int? = null
}

/**
 * Parameter that controlled the expansion process
 *
 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
 */
open class ValueSetExpansionParameter() : BackboneElement() {
    /**
     * Name as assigned by the server
     */
    var name: String? = null

    /**
     * Value of the named parameter
     */
    var valueBoolean: Boolean? = null

    /**
     * Value of the named parameter
     */
    var valueCode: String? = null

    /**
     * Value of the named parameter
     */
    var valueDecimal: Float? = null

    /**
     * Value of the named parameter
     */
    var valueInteger: Int? = null

    /**
     * Value of the named parameter
     */
    var valueString: String? = null

    /**
     * Value of the named parameter
     */
    var valueUri: String? = null
}

/**
 * Codes in the value set
 *
 * The codes that are contained in the value set expansion.
 */
open class ValueSetExpansionContains() : BackboneElement() {
    /**
     * If user cannot select this entry
     */
    var abstract: Boolean? = null

    /**
     * Code - if blank, this is not a selectable code
     */
    var code: String? = null

    val contains: List<ValueSetExpansionContains> = mutableListOf<ValueSetExpansionContains>()

    val designation: List<ValueSetComposeIncludeConceptDesignation> =
            mutableListOf<ValueSetComposeIncludeConceptDesignation>()

    /**
     * User display for the concept
     */
    var display: String? = null

    /**
     * If concept is inactive in the code system
     */
    var inactive: Boolean? = null

    /**
     * System value for the code
     */
    var system: String? = null

    /**
     * Version in which this code/display is defined
     */
    var version: String? = null
}
