//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.755 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A homogeneous material with a definite composition
 *
 * A homogeneous material with a definite composition.
 */
open class Substance() : DomainResource() {
    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * What substance this is
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Textual description of the substance, comments
     */
    var description: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val ingredient: List<SubstanceIngredient> = mutableListOf<SubstanceIngredient>()

    val instance: List<SubstanceInstance> = mutableListOf<SubstanceInstance>()

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null
}

/**
 * If this describes a specific package/container of the substance
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
 */
open class SubstanceInstance() : BackboneElement() {
    /**
     * When no longer valid to use
     */
    var expiry: String? = null

    /**
     * Identifier of the package/container
     */
    var identifier: Identifier? = null

    /**
     * Amount of substance in the package
     */
    var quantity: Quantity? = null
}

/**
 * Composition information about the substance
 *
 * A substance can be composed of other substances.
 */
open class SubstanceIngredient() : BackboneElement() {
    /**
     * Optional amount (concentration)
     */
    var quantity: Ratio? = null

    /**
     * A component of the substance
     */
    var substanceCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * A component of the substance
     */
    var substanceReference: Reference = Reference()
}
