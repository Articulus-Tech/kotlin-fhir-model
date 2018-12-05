//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.361 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * How the medication is/was taken or should be taken
 *
 * Indicates how the medication is/was taken or should be taken by the patient.
 */
open class Dosage() : Element() {
    val additionalInstruction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Take "as needed" (for x)
     */
    var asNeededBoolean: Boolean? = null

    /**
     * Take "as needed" (for x)
     */
    var asNeededCodeableConcept: CodeableConcept? = null

    /**
     * Amount of medication per dose
     */
    var doseQuantity: Quantity? = null

    /**
     * Amount of medication per dose
     */
    var doseRange: Range? = null

    /**
     * Upper limit on medication per administration
     */
    var maxDosePerAdministration: Quantity? = null

    /**
     * Upper limit on medication per lifetime of the patient
     */
    var maxDosePerLifetime: Quantity? = null

    /**
     * Upper limit on medication per unit of time
     */
    var maxDosePerPeriod: Ratio? = null

    /**
     * Technique for administering medication
     */
    var method: CodeableConcept? = null

    /**
     * Patient or consumer oriented instructions
     */
    var patientInstruction: String? = null

    /**
     * Amount of medication per unit of time
     */
    var rateQuantity: Quantity? = null

    /**
     * Amount of medication per unit of time
     */
    var rateRange: Range? = null

    /**
     * Amount of medication per unit of time
     */
    var rateRatio: Ratio? = null

    /**
     * How drug should enter body
     */
    var route: CodeableConcept? = null

    /**
     * The order of the dosage instructions
     */
    var sequence: Int? = null

    /**
     * Body site to administer to
     */
    var site: CodeableConcept? = null

    /**
     * Free text dosage instructions e.g. SIG
     */
    var text: String? = null

    /**
     * When medication should be administered
     */
    var timing: Timing? = null
}
