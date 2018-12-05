//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.703 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Determine insurance validity and scope of coverage
 *
 * The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 */
open class EligibilityRequest() : DomainResource() {
    /**
     * Type of services covered
     */
    var benefitCategory: CodeableConcept? = null

    /**
     * Detailed services covered within the type
     */
    var benefitSubCategory: CodeableConcept? = null

    /**
     * Business agreement
     */
    var businessArrangement: String? = null

    /**
     * Insurance or medical plan
     */
    var coverage: Reference? = null

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Author
     */
    var enterer: Reference? = null

    /**
     * Servicing Facility
     */
    var facility: Reference? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Target
     */
    var insurer: Reference? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * The subject of the Products and Services
     */
    var patient: Reference? = null

    /**
     * Desired processing priority
     */
    var priority: CodeableConcept? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Estimated date or dates of Service
     */
    var servicedDate: String? = null

    /**
     * Estimated date or dates of Service
     */
    var servicedPeriod: Period? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null
}
