//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.731 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * Insurance or medical plan or a payment agreement
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 */
open class Coverage() : DomainResource() {
    /**
     * Plan Beneficiary
     */
    var beneficiary: Reference? = null

    val contract: List<Reference> = mutableListOf<Reference>()

    /**
     * Dependent number
     */
    var dependent: String? = null

    /**
     * Additional coverage classifications
     */
    var grouping: CoverageGrouping? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Insurer network
     */
    var network: String? = null

    /**
     * Relative order of the coverage
     */
    var order: Int? = null

    val payor: List<Reference> = mutableListOf<Reference>()

    /**
     * Coverage start and end dates
     */
    var period: Period? = null

    /**
     * Owner of the policy
     */
    var policyHolder: Reference? = null

    /**
     * Beneficiary relationship to the Subscriber
     */
    var relationship: CodeableConcept? = null

    /**
     * The plan instance or sequence counter
     */
    var sequence: String? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Subscriber to the policy
     */
    var subscriber: Reference? = null

    /**
     * ID assigned to the Subscriber
     */
    var subscriberId: String? = null

    /**
     * Type of coverage such as medical or accident
     */
    var type: CodeableConcept? = null
}

/**
 * Additional coverage classifications
 *
 * A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan.
 */
open class CoverageGrouping() : BackboneElement() {
    /**
     * Display text for the class
     */
    var classDisplay: String? = null

    /**
     * An identifier for the class
     */
    @SerializedName("class")
    var class_fhir: String? = null

    /**
     * An identifier for the group
     */
    var group: String? = null

    /**
     * Display text for an identifier for the group
     */
    var groupDisplay: String? = null

    /**
     * An identifier for the plan
     */
    var plan: String? = null

    /**
     * Display text for the plan
     */
    var planDisplay: String? = null

    /**
     * An identifier for the subsection of the class
     */
    var subClass: String? = null

    /**
     * Display text for the subsection of the subclass
     */
    var subClassDisplay: String? = null

    /**
     * An identifier for the subsection of the group
     */
    var subGroup: String? = null

    /**
     * Display text for the subsection of the group
     */
    var subGroupDisplay: String? = null

    /**
     * An identifier for the subsection of the plan
     */
    var subPlan: String? = null

    /**
     * Display text for the subsection of the plan
     */
    var subPlanDisplay: String? = null
}
