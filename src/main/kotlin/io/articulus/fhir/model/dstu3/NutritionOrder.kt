//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.481 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Diet, formula or nutritional supplement request
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
open class NutritionOrder() : DomainResource() {
    val allergyIntolerance: List<Reference> = mutableListOf<Reference>()

    /**
     * Date and time the nutrition order was requested
     */
    var dateTime: String? = null

    /**
     * The encounter associated with this nutrition order
     */
    var encounter: Reference? = null

    /**
     * Enteral formula components
     */
    var enteralFormula: NutritionOrderEnteralFormula? = null

    val excludeFoodModifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val foodPreferenceModifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Oral diet components
     */
    var oralDiet: NutritionOrderOralDiet? = null

    /**
     * Who ordered the diet, formula or nutritional supplement
     */
    var orderer: Reference? = null

    /**
     * The person who requires the diet, formula or nutritional supplement
     */
    var patient: Reference = Reference()

    /**
     * proposed | draft | planned | requested | active | on-hold | completed | cancelled | entered-in-error
     */
    var status: String? = null

    val supplement: List<NutritionOrderSupplement> = mutableListOf<NutritionOrderSupplement>()
}

/**
 * Oral diet components
 *
 * Diet given orally in contrast to enteral (tube) feeding.
 */
open class NutritionOrderOralDiet() : BackboneElement() {
    val fluidConsistencyType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Instructions or additional information about the oral diet
     */
    var instruction: String? = null

    val nutrient: List<NutritionOrderOralDietNutrient> =
            mutableListOf<NutritionOrderOralDietNutrient>()

    val schedule: List<Timing> = mutableListOf<Timing>()

    val texture: List<NutritionOrderOralDietTexture> =
            mutableListOf<NutritionOrderOralDietTexture>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Required  nutrient modifications
 *
 * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
 */
open class NutritionOrderOralDietNutrient() : BackboneElement() {
    /**
     * Quantity of the specified nutrient
     */
    var amount: Quantity? = null

    /**
     * Type of nutrient that is being modified
     */
    var modifier: CodeableConcept? = null
}

/**
 * Required  texture modifications
 *
 * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
 */
open class NutritionOrderOralDietTexture() : BackboneElement() {
    /**
     * Concepts that are used to identify an entity that is ingested for nutritional purposes
     */
    var foodType: CodeableConcept? = null

    /**
     * Code to indicate how to alter the texture of the foods, e.g. pureed
     */
    var modifier: CodeableConcept? = null
}

/**
 * Supplement components
 *
 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
 */
open class NutritionOrderSupplement() : BackboneElement() {
    /**
     * Instructions or additional information about the oral supplement
     */
    var instruction: String? = null

    /**
     * Product or brand name of the nutritional supplement
     */
    var productName: String? = null

    /**
     * Amount of the nutritional supplement
     */
    var quantity: Quantity? = null

    val schedule: List<Timing> = mutableListOf<Timing>()

    /**
     * Type of supplement product requested
     */
    var type: CodeableConcept? = null
}

/**
 * Enteral formula components
 *
 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
 */
open class NutritionOrderEnteralFormula() : BackboneElement() {
    /**
     * Product or brand name of the modular additive
     */
    var additiveProductName: String? = null

    /**
     * Type of modular component to add to the feeding
     */
    var additiveType: CodeableConcept? = null

    val administration: List<NutritionOrderEnteralFormulaAdministration> =
            mutableListOf<NutritionOrderEnteralFormulaAdministration>()

    /**
     * Formula feeding instructions expressed as text
     */
    var administrationInstruction: String? = null

    /**
     * Product or brand name of the enteral or infant formula
     */
    var baseFormulaProductName: String? = null

    /**
     * Type of enteral or infant formula
     */
    var baseFormulaType: CodeableConcept? = null

    /**
     * Amount of energy per specified volume that is required
     */
    var caloricDensity: Quantity? = null

    /**
     * Upper limit on formula volume per unit of time
     */
    var maxVolumeToDeliver: Quantity? = null

    /**
     * How the formula should enter the patient's gastrointestinal tract
     */
    var routeofAdministration: CodeableConcept? = null
}

/**
 * Formula feeding instruction as structured data
 *
 * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
 */
open class NutritionOrderEnteralFormulaAdministration() : BackboneElement() {
    /**
     * The volume of formula to provide
     */
    var quantity: Quantity? = null

    /**
     * Speed with which the formula is provided per period of time
     */
    var rateQuantity: Quantity? = null

    /**
     * Speed with which the formula is provided per period of time
     */
    var rateRatio: Ratio? = null

    /**
     * Scheduled frequency of enteral feeding
     */
    var schedule: Timing? = null
}
