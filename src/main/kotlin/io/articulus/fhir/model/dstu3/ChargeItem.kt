//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.447 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Item containing charge code(s) associated with the provision of healthcare provider products
 *
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 */
open class ChargeItem() : DomainResource() {
    val account: List<Reference> = mutableListOf<Reference>()

    val bodysite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * A code that identifies the charge, like a billing code
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Encounter / Episode associated with event
     */
    var context: Reference? = null

    val definition: List<String> = mutableListOf<String>()

    /**
     * Date the charge item was entered
     */
    var enteredDate: String? = null

    /**
     * Individual who was entering
     */
    var enterer: Reference? = null

    /**
     * Factor overriding the associated rules
     */
    var factorOverride: Float? = null

    /**
     * Business Identifier for item
     */
    var identifier: Identifier? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When the charged service was applied
     */
    var occurrenceDateTime: String? = null

    /**
     * When the charged service was applied
     */
    var occurrencePeriod: Period? = null

    /**
     * When the charged service was applied
     */
    var occurrenceTiming: Timing? = null

    /**
     * Reason for overriding the list price/factor
     */
    var overrideReason: String? = null

    val partOf: List<Reference> = mutableListOf<Reference>()

    val participant: List<ChargeItemParticipant> = mutableListOf<ChargeItemParticipant>()

    /**
     * Organization providing the charged sevice
     */
    var performingOrganization: Reference? = null

    /**
     * Price overriding the associated rules
     */
    var priceOverride: Money? = null

    /**
     * Quantity of which the charge item has been serviced
     */
    var quantity: Quantity? = null

    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Organization requesting the charged service
     */
    var requestingOrganization: Reference? = null

    val service: List<Reference> = mutableListOf<Reference>()

    /**
     * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * Individual service was done for/to
     */
    var subject: Reference = Reference()

    val supportingInformation: List<Reference> = mutableListOf<Reference>()
}

/**
 * Who performed charged service
 *
 * Indicates who or what performed or participated in the charged service.
 */
open class ChargeItemParticipant() : BackboneElement() {
    /**
     * Individual who was performing
     */
    var actor: Reference = Reference()

    /**
     * What type of performance was done
     */
    var role: CodeableConcept? = null
}
