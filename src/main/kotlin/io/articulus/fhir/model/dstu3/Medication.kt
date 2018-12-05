//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.762 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * Definition of a Medication
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
open class Medication() : DomainResource() {
    /**
     * Codes that identify this medication
     */
    var code: CodeableConcept? = null

    /**
     * powder | tablets | capsule +
     */
    var form: CodeableConcept? = null

    val image: List<Attachment> = mutableListOf<Attachment>()

    val ingredient: List<MedicationIngredient> = mutableListOf<MedicationIngredient>()

    /**
     * True if a brand
     */
    var isBrand: Boolean? = null

    /**
     * True if medication does not require a prescription
     */
    var isOverTheCounter: Boolean? = null

    /**
     * Manufacturer of the item
     */
    var manufacturer: Reference? = null

    /**
     * Details about packaged medications
     */
    @SerializedName("package")
    var package_fhir: MedicationPackage? = null

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null
}

/**
 * Active or inactive ingredient
 *
 * Identifies a particular constituent of interest in the product.
 */
open class MedicationIngredient() : BackboneElement() {
    /**
     * Quantity of ingredient present
     */
    var amount: Ratio? = null

    /**
     * Active ingredient indicator
     */
    var isActive: Boolean? = null

    /**
     * The product contained
     */
    var itemCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * The product contained
     */
    var itemReference: Reference = Reference()
}

/**
 * Details about packaged medications
 *
 * Information that only applies to packages (not products).
 */
open class MedicationPackage() : BackboneElement() {
    val batch: List<MedicationPackageBatch> = mutableListOf<MedicationPackageBatch>()

    /**
     * E.g. box, vial, blister-pack
     */
    var container: CodeableConcept? = null

    val content: List<MedicationPackageContent> = mutableListOf<MedicationPackageContent>()
}

/**
 * What is  in the package
 *
 * A set of components that go to make up the described item.
 */
open class MedicationPackageContent() : BackboneElement() {
    /**
     * Quantity present in the package
     */
    var amount: Quantity? = null

    /**
     * The item in the package
     */
    var itemCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * The item in the package
     */
    var itemReference: Reference = Reference()
}

/**
 * Identifies a single production run
 *
 * Information about a group of medication produced or packaged from one production run.
 */
open class MedicationPackageBatch() : BackboneElement() {
    /**
     * When batch will expire
     */
    var expirationDate: String? = null

    /**
     * Identifier assigned to batch
     */
    var lotNumber: String? = null
}
