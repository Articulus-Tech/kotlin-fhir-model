//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.400 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Defines behaviour and contraints on the ValueSet Expansion operation
 *
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
open class ExpansionProfile() : DomainResource() {
    /**
     * Include or exclude inactive concepts in the expansion
     */
    var activeOnly: Boolean? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the expansion profile
     */
    var description: String? = null

    /**
     * When the expansion profile imposes designation contraints
     */
    var designation: ExpansionProfileDesignation? = null

    /**
     * Specify the language for the display element of codes in the value set expansion
     */
    var displayLanguage: String? = null

    /**
     * Nested codes in the expansion or not
     */
    var excludeNested: Boolean? = null

    /**
     * Include or exclude codes which cannot be rendered in user interfaces in the value set expansion
     */
    var excludeNotForUI: Boolean? = null

    /**
     * Include or exclude codes which are post coordinated expressions in the value set expansion
     */
    var excludePostCoordinated: Boolean? = null

    /**
     * Systems/Versions to be exclude
     */
    var excludedSystem: ExpansionProfileExcludedSystem? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val fixedVersion: List<ExpansionProfileFixedVersion> =
            mutableListOf<ExpansionProfileFixedVersion>()

    /**
     * Additional identifier for the expansion profile
     */
    var identifier: Identifier? = null

    /**
     * Include or exclude the value set definition in the expansion
     */
    var includeDefinition: Boolean? = null

    /**
     * Whether the expansion should include concept designations
     */
    var includeDesignations: Boolean? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Controls behaviour of the value set expand operation when value sets are too large to be completely expanded
     */
    var limitedExpansion: Boolean? = null

    /**
     * Name for this expansion profile (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Logical URI to reference this expansion profile (globally unique)
     */
    var url: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the expansion profile
     */
    var version: String? = null
}

/**
 * Fix use of a code system to a particular version
 *
 * Fix use of a particular code system to a particular version.
 */
open class ExpansionProfileFixedVersion() : BackboneElement() {
    /**
     * default | check | override
     */
    var mode: String? = null

    /**
     * System to have its version fixed
     */
    var system: String? = null

    /**
     * Specific version of the code system referred to
     */
    var version: String? = null
}

/**
 * Systems/Versions to be exclude
 *
 * Code system, or a particular version of a code system to be excluded from value set expansions.
 */
open class ExpansionProfileExcludedSystem() : BackboneElement() {
    /**
     * The specific code system to be excluded
     */
    var system: String? = null

    /**
     * Specific version of the code system referred to
     */
    var version: String? = null
}

/**
 * When the expansion profile imposes designation contraints
 *
 * A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
 */
open class ExpansionProfileDesignation() : BackboneElement() {
    /**
     * Designations to be excluded
     */
    var exclude: ExpansionProfileDesignationExclude? = null

    /**
     * Designations to be included
     */
    var include: ExpansionProfileDesignationInclude? = null
}

/**
 * Designations to be included
 *
 * Designations to be included.
 */
open class ExpansionProfileDesignationInclude() : BackboneElement() {
    val designation: List<ExpansionProfileDesignationIncludeDesignation> =
            mutableListOf<ExpansionProfileDesignationIncludeDesignation>()
}

/**
 * The designation to be included
 *
 * A data group for each designation to be included.
 */
open class ExpansionProfileDesignationIncludeDesignation() : BackboneElement() {
    /**
     * Human language of the designation to be included
     */
    var language: String? = null

    /**
     * What kind of Designation to include
     */
    var use: Coding? = null
}

/**
 * Designations to be excluded
 *
 * Designations to be excluded.
 */
open class ExpansionProfileDesignationExclude() : BackboneElement() {
    val designation: List<ExpansionProfileDesignationExcludeDesignation> =
            mutableListOf<ExpansionProfileDesignationExcludeDesignation>()
}

/**
 * The designation to be excluded
 *
 * A data group for each designation to be excluded.
 */
open class ExpansionProfileDesignationExcludeDesignation() : BackboneElement() {
    /**
     * Human language of the designation to be excluded
     */
    var language: String? = null

    /**
     * What kind of Designation to exclude
     */
    var use: Coding? = null
}
