//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.709 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A slot of time on a schedule that may be available for booking appointments
 *
 * A slot of time on a schedule that may be available for booking appointments.
 */
open class Slot() : DomainResource() {
    /**
     * The style of appointment or patient that may be booked in the slot (not service type)
     */
    var appointmentType: CodeableConcept? = null

    /**
     * Comments on the slot to describe any extended information. Such as custom constraints on the slot
     */
    var comment: String? = null

    /**
     * Date/Time that the slot is to conclude
     */
    var end: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * This slot has already been overbooked, appointments are unlikely to be accepted for this time
     */
    var overbooked: Boolean? = null

    /**
     * The schedule resource that this slot defines an interval of status information
     */
    var schedule: Reference = Reference()

    /**
     * A broad categorisation of the service that is to be performed during this appointment
     */
    var serviceCategory: CodeableConcept? = null

    val serviceType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Date/Time that the slot is to begin
     */
    var start: String? = null

    /**
     * busy | free | busy-unavailable | busy-tentative | entered-in-error
     */
    var status: String? = null
}
