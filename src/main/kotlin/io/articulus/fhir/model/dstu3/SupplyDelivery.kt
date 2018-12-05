//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.430 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Delivery of bulk Supplies
 *
 * Record of delivery of what is supplied.
 */
open class SupplyDelivery() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Where the Supply was sent
     */
    var destination: Reference? = null

    /**
     * External identifier
     */
    var identifier: Identifier? = null

    /**
     * When event occurred
     */
    var occurrenceDateTime: String? = null

    /**
     * When event occurred
     */
    var occurrencePeriod: Period? = null

    /**
     * When event occurred
     */
    var occurrenceTiming: Timing? = null

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * Patient for whom the item is supplied
     */
    var patient: Reference? = null

    val receiver: List<Reference> = mutableListOf<Reference>()

    /**
     * in-progress | completed | abandoned | entered-in-error
     */
    var status: String? = null

    /**
     * The item that is delivered or supplied
     */
    var suppliedItem: SupplyDeliverySuppliedItem? = null

    /**
     * Dispenser
     */
    var supplier: Reference? = null

    /**
     * Category of dispense event
     */
    var type: CodeableConcept? = null
}

/**
 * The item that is delivered or supplied
 *
 * The item that is being delivered or has been supplied.
 */
open class SupplyDeliverySuppliedItem() : BackboneElement() {
    /**
     * Medication, Substance, or Device supplied
     */
    var itemCodeableConcept: CodeableConcept? = null

    /**
     * Medication, Substance, or Device supplied
     */
    var itemReference: Reference? = null

    /**
     * Amount dispensed
     */
    var quantity: Quantity? = null
}
