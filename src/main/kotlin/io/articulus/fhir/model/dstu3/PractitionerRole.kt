//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.721 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Roles/organizations the practitioner is associated with
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 */
open class PractitionerRole() : DomainResource() {
    /**
     * Whether this practitioner's record is in active use
     */
    var active: Boolean? = null

    /**
     * Description of availability exceptions
     */
    var availabilityExceptions: String? = null

    val availableTime: List<PractitionerRoleAvailableTime> =
            mutableListOf<PractitionerRoleAvailableTime>()

    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val endpoint: List<Reference> = mutableListOf<Reference>()

    val healthcareService: List<Reference> = mutableListOf<Reference>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val location: List<Reference> = mutableListOf<Reference>()

    val notAvailable: List<PractitionerRoleNotAvailable> =
            mutableListOf<PractitionerRoleNotAvailable>()

    /**
     * Organization where the roles are available
     */
    var organization: Reference? = null

    /**
     * The period during which the practitioner is authorized to perform in these role(s)
     */
    var period: Period? = null

    /**
     * Practitioner that is able to provide the defined services for the organation
     */
    var practitioner: Reference? = null

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()
}

/**
 * Times the Service Site is available
 *
 * A collection of times that the Service Site is available.
 */
open class PractitionerRoleAvailableTime() : BackboneElement() {
    /**
     * Always available? e.g. 24 hour service
     */
    var allDay: Boolean? = null

    /**
     * Closing time of day (ignored if allDay = true)
     */
    var availableEndTime: String? = null

    /**
     * Opening time of day (ignored if allDay = true)
     */
    var availableStartTime: String? = null

    val daysOfWeek: List<String> = mutableListOf<String>()
}

/**
 * Not available during this time due to provided reason
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 */
open class PractitionerRoleNotAvailable() : BackboneElement() {
    /**
     * Reason presented to the user explaining why time not available
     */
    var description: String? = null

    /**
     * Service not availablefrom this date
     */
    var during: Period? = null
}
