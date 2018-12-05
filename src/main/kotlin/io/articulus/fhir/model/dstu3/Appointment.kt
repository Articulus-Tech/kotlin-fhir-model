//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.524 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
open class Appointment() : DomainResource() {
    /**
     * The style of appointment or patient that has been booked in the slot (not service type)
     */
    var appointmentType: CodeableConcept? = null

    /**
     * Additional comments
     */
    var comment: String? = null

    /**
     * The date that this appointment was initially created
     */
    var created: String? = null

    /**
     * Shown on a subject line in a meeting request, or appointment list
     */
    var description: String? = null

    /**
     * When appointment is to conclude
     */
    var end: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val incomingReferral: List<Reference> = mutableListOf<Reference>()

    val indication: List<Reference> = mutableListOf<Reference>()

    /**
     * Can be less than start/end (e.g. estimate)
     */
    var minutesDuration: Int? = null

    val participant: List<AppointmentParticipant> = mutableListOf<AppointmentParticipant>()

    /**
     * Used to make informed decisions if needing to re-prioritize
     */
    var priority: Int? = null

    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val requestedPeriod: List<Period> = mutableListOf<Period>()

    /**
     * A broad categorisation of the service that is to be performed during this appointment
     */
    var serviceCategory: CodeableConcept? = null

    val serviceType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val slot: List<Reference> = mutableListOf<Reference>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * When appointment is to take place
     */
    var start: String? = null

    /**
     * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error
     */
    var status: String? = null

    val supportingInformation: List<Reference> = mutableListOf<Reference>()
}

/**
 * Participants involved in appointment
 *
 * List of participants involved in the appointment.
 */
open class AppointmentParticipant() : BackboneElement() {
    /**
     * Person, Location/HealthcareService or Device
     */
    var actor: Reference? = null

    /**
     * required | optional | information-only
     */
    var required: String? = null

    /**
     * accepted | declined | tentative | needs-action
     */
    var status: String? = null

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}
