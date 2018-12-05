//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.295 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 */
open class AppointmentResponse() : DomainResource() {
    /**
     * Person, Location/HealthcareService or Device
     */
    var actor: Reference? = null

    /**
     * Appointment this response relates to
     */
    var appointment: Reference = Reference()

    /**
     * Additional comments
     */
    var comment: String? = null

    /**
     * Time from appointment, or requested new end time
     */
    var end: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * accepted | declined | tentative | in-process | completed | needs-action | entered-in-error
     */
    var participantStatus: String? = null

    val participantType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Time from appointment, or requested new start time
     */
    var start: String? = null
}
