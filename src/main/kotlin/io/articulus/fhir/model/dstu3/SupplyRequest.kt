//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.254 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Request for a medication, substance or device
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 */
open class SupplyRequest() : DomainResource() {
    /**
     * When the request was made
     */
    var authoredOn: String? = null

    /**
     * The kind of supply (central, non-stock, etc.)
     */
    var category: CodeableConcept? = null

    /**
     * The origin of the supply
     */
    var deliverFrom: Reference? = null

    /**
     * The destination of the supply
     */
    var deliverTo: Reference? = null

    /**
     * Unique identifier
     */
    var identifier: Identifier? = null

    /**
     * When the request should be fulfilled
     */
    var occurrenceDateTime: String? = null

    /**
     * When the request should be fulfilled
     */
    var occurrencePeriod: Period? = null

    /**
     * When the request should be fulfilled
     */
    var occurrenceTiming: Timing? = null

    /**
     * The item being requested
     */
    var orderedItem: SupplyRequestOrderedItem? = null

    /**
     * routine | urgent | asap | stat
     */
    var priority: String? = null

    /**
     * Why the supply item was requested
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Why the supply item was requested
     */
    var reasonReference: Reference? = null

    /**
     * Who/what is requesting service
     */
    var requester: SupplyRequestRequester? = null

    /**
     * draft | active | suspended +
     */
    var status: String? = null

    val supplier: List<Reference> = mutableListOf<Reference>()
}

/**
 * The item being requested
 *
 * The item being requested.
 */
open class SupplyRequestOrderedItem() : BackboneElement() {
    /**
     * Medication, Substance, or Device requested to be supplied
     */
    var itemCodeableConcept: CodeableConcept? = null

    /**
     * Medication, Substance, or Device requested to be supplied
     */
    var itemReference: Reference? = null

    /**
     * The requested amount of the item indicated
     */
    var quantity: Quantity = Quantity()
}

/**
 * Who/what is requesting service
 *
 * The individual who initiated the request and has responsibility for its activation.
 */
open class SupplyRequestRequester() : BackboneElement() {
    /**
     * Individual making the request
     */
    var agent: Reference = Reference()

    /**
     * Organization agent is acting for
     */
    var onBehalfOf: Reference? = null
}
