//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.244 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * EligibilityResponse resource
 *
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
open class EligibilityResponse() : DomainResource() {
    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    val error: List<EligibilityResponseError> = mutableListOf<EligibilityResponseError>()

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Coverage inforce indicator
     */
    var inforce: Boolean? = null

    val insurance: List<EligibilityResponseInsurance> =
            mutableListOf<EligibilityResponseInsurance>()

    /**
     * Insurer issuing the coverage
     */
    var insurer: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Eligibility reference
     */
    var request: Reference? = null

    /**
     * Responsible organization
     */
    var requestOrganization: Reference? = null

    /**
     * Responsible practitioner
     */
    var requestProvider: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null
}

/**
 * Details by insurance coverage
 *
 * The insurer may provide both the details for the requested coverage as well as details for additional coverages known to the insurer.
 */
open class EligibilityResponseInsurance() : BackboneElement() {
    val benefitBalance: List<EligibilityResponseInsuranceBenefitBalance> =
            mutableListOf<EligibilityResponseInsuranceBenefitBalance>()

    /**
     * Contract details
     */
    var contract: Reference? = null

    /**
     * Updated Coverage details
     */
    var coverage: Reference? = null
}

/**
 * Benefits by Category
 *
 * Benefits and optionally current balances by Category.
 */
open class EligibilityResponseInsuranceBenefitBalance() : BackboneElement() {
    /**
     * Type of services covered
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Description of the benefit or services covered
     */
    var description: String? = null

    /**
     * Excluded from the plan
     */
    var excluded: Boolean? = null

    val financial: List<EligibilityResponseInsuranceBenefitBalanceFinancial> =
            mutableListOf<EligibilityResponseInsuranceBenefitBalanceFinancial>()

    /**
     * Short name for the benefit
     */
    var name: String? = null

    /**
     * In or out of network
     */
    var network: CodeableConcept? = null

    /**
     * Detailed services covered within the type
     */
    var subCategory: CodeableConcept? = null

    /**
     * Annual or lifetime
     */
    var term: CodeableConcept? = null

    /**
     * Individual or family
     */
    var unit: CodeableConcept? = null
}

/**
 * Benefit Summary
 *
 * Benefits Used to date.
 */
open class EligibilityResponseInsuranceBenefitBalanceFinancial() : BackboneElement() {
    /**
     * Benefits allowed
     */
    var allowedMoney: Money? = null

    /**
     * Benefits allowed
     */
    var allowedString: String? = null

    /**
     * Benefits allowed
     */
    var allowedUnsignedInt: Int? = null

    /**
     * Deductable, visits, benefit amount
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Benefits used
     */
    var usedMoney: Money? = null

    /**
     * Benefits used
     */
    var usedUnsignedInt: Int? = null
}

/**
 * Processing errors
 *
 * Mutually exclusive with Services Provided (Item).
 */
open class EligibilityResponseError() : BackboneElement() {
    /**
     * Error code detailing processing issues
     */
    var code: CodeableConcept = CodeableConcept()
}
