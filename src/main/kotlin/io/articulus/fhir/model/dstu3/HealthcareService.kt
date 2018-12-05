//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.219 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * The details of a healthcare service available at a location
 *
 * The details of a healthcare service available at a location.
 */
open class HealthcareService() : DomainResource() {
    /**
     * Whether this healthcareservice is in active use
     */
    var active: Boolean? = null

    /**
     * If an appointment is required for access to this service
     */
    var appointmentRequired: Boolean? = null

    /**
     * Description of availability exceptions
     */
    var availabilityExceptions: String? = null

    val availableTime: List<HealthcareServiceAvailableTime> =
            mutableListOf<HealthcareServiceAvailableTime>()

    /**
     * Broad category of service being performed or delivered
     */
    var category: CodeableConcept? = null

    val characteristic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Additional description and/or any specific issues not covered elsewhere
     */
    var comment: String? = null

    val coverageArea: List<Reference> = mutableListOf<Reference>()

    /**
     * Specific eligibility requirements required to use the service
     */
    var eligibility: CodeableConcept? = null

    /**
     * Describes the eligibility conditions for the service
     */
    var eligibilityNote: String? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()

    /**
     * Extra details about the service that can't be placed in the other fields
     */
    var extraDetails: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val location: List<Reference> = mutableListOf<Reference>()

    /**
     * Description of service as presented to a consumer while searching
     */
    var name: String? = null

    val notAvailable: List<HealthcareServiceNotAvailable> =
            mutableListOf<HealthcareServiceNotAvailable>()

    /**
     * Facilitates quick identification of the service
     */
    var photo: Attachment? = null

    val programName: List<String> = mutableListOf<String>()

    /**
     * Organization that provides this service
     */
    var providedBy: Reference? = null

    val referralMethod: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val serviceProvisionCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val specialty: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Times the Service Site is available
 *
 * A collection of times that the Service Site is available.
 */
open class HealthcareServiceAvailableTime() : BackboneElement() {
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
open class HealthcareServiceNotAvailable() : BackboneElement() {
    /**
     * Reason presented to the user explaining why time not available
     */
    var description: String? = null

    /**
     * Service not availablefrom this date
     */
    var during: Period? = null
}
