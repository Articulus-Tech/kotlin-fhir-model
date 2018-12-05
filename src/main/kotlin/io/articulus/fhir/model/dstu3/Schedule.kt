//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.806 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A container for slots of time that may be available for booking appointments
 *
 * A container for slots of time that may be available for booking appointments.
 */
open class Schedule() : DomainResource() {
    /**
     * Whether this schedule is in active use
     */
    var active: Boolean? = null

    val actor: List<Reference> = mutableListOf<Reference>()

    /**
     * Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated
     */
    var comment: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates
     */
    var planningHorizon: Period? = null

    /**
     * A broad categorisation of the service that is to be performed during this appointment
     */
    var serviceCategory: CodeableConcept? = null

    val serviceType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}
