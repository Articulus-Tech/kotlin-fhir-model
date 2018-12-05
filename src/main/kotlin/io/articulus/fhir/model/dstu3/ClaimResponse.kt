//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.376 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Remittance resource
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
open class ClaimResponse() : DomainResource() {
    val addItem: List<ClaimResponseAddItem> = mutableListOf<ClaimResponseAddItem>()

    val communicationRequest: List<Reference> = mutableListOf<Reference>()

    /**
     * Creation date
     */
    var created: String? = null

    /**
     * Disposition Message
     */
    var disposition: String? = null

    val error: List<ClaimResponseError> = mutableListOf<ClaimResponseError>()

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val insurance: List<ClaimResponseInsurance> = mutableListOf<ClaimResponseInsurance>()

    /**
     * Insurance issuing organization
     */
    var insurer: Reference? = null

    val item: List<ClaimResponseItem> = mutableListOf<ClaimResponseItem>()

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * The subject of the Products and Services
     */
    var patient: Reference? = null

    /**
     * Party to be paid any benefits payable
     */
    var payeeType: CodeableConcept? = null

    /**
     * Payment details, if paid
     */
    var payment: ClaimResponsePayment? = null

    val processNote: List<ClaimResponseProcessNote> = mutableListOf<ClaimResponseProcessNote>()

    /**
     * Id of resource triggering adjudication
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
     * Funds reserved status
     */
    var reserved: Coding? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Total benefit payable for the Claim
     */
    var totalBenefit: Money? = null

    /**
     * Total Cost of service from the Claim
     */
    var totalCost: Money? = null

    /**
     * Unallocated deductible
     */
    var unallocDeductable: Money? = null
}

/**
 * Line items
 *
 * The first tier service adjudications for submitted services.
 */
open class ClaimResponseItem() : BackboneElement() {
    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val detail: List<ClaimResponseItemDetail> = mutableListOf<ClaimResponseItemDetail>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null
}

/**
 * Adjudication details
 *
 * The adjudication results.
 */
open class ClaimResponseItemAdjudication() : BackboneElement() {
    /**
     * Monetary amount
     */
    var amount: Money? = null

    /**
     * Adjudication category such as co-pay, eligible, benefit, etc.
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Explanation of Adjudication outcome
     */
    var reason: CodeableConcept? = null

    /**
     * Non-monetary value
     */
    var value: Float? = null
}

/**
 * Detail line items
 *
 * The second tier service adjudications for submitted services.
 */
open class ClaimResponseItemDetail() : BackboneElement() {
    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null

    val subDetail: List<ClaimResponseItemDetailSubDetail> =
            mutableListOf<ClaimResponseItemDetailSubDetail>()
}

/**
 * Subdetail line items
 *
 * The third tier service adjudications for submitted services.
 */
open class ClaimResponseItemDetailSubDetail() : BackboneElement() {
    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null
}

/**
 * Insurer added line items
 *
 * The first tier service adjudications for payor added services.
 */
open class ClaimResponseAddItem() : BackboneElement() {
    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    val detail: List<ClaimResponseAddItemDetail> = mutableListOf<ClaimResponseAddItemDetail>()

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    val sequenceLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Group, Service or Product
     */
    var service: CodeableConcept? = null
}

/**
 * Added items details
 *
 * The second tier service adjudications for payor added services.
 */
open class ClaimResponseAddItemDetail() : BackboneElement() {
    val adjudication: List<ClaimResponseItemAdjudication> =
            mutableListOf<ClaimResponseItemAdjudication>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Professional fee or Product charge
     */
    var fee: Money? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val noteNumber: List<Int> = mutableListOf<Int>()

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Service or Product
     */
    var service: CodeableConcept? = null
}

/**
 * Processing errors
 *
 * Mutually exclusive with Services Provided (Item).
 */
open class ClaimResponseError() : BackboneElement() {
    /**
     * Error code detailing processing issues
     */
    var code: CodeableConcept = CodeableConcept()

    /**
     * Detail sequence number
     */
    var detailSequenceLinkId: Int? = null

    /**
     * Item sequence number
     */
    var sequenceLinkId: Int? = null

    /**
     * Subdetail sequence number
     */
    var subdetailSequenceLinkId: Int? = null
}

/**
 * Payment details, if paid
 *
 * Payment details for the claim if the claim has been paid.
 */
open class ClaimResponsePayment() : BackboneElement() {
    /**
     * Payment adjustment for non-Claim issues
     */
    var adjustment: Money? = null

    /**
     * Explanation for the non-claim adjustment
     */
    var adjustmentReason: CodeableConcept? = null

    /**
     * Payable amount after adjustment
     */
    var amount: Money? = null

    /**
     * Expected data of Payment
     */
    var date: String? = null

    /**
     * Identifier of the payment instrument
     */
    var identifier: Identifier? = null

    /**
     * Partial or Complete
     */
    var type: CodeableConcept? = null
}

/**
 * Processing notes
 *
 * Note text.
 */
open class ClaimResponseProcessNote() : BackboneElement() {
    /**
     * Language if different from the resource
     */
    var language: CodeableConcept? = null

    /**
     * Sequence Number for this note
     */
    var number: Int? = null

    /**
     * Note explanatory text
     */
    var text: String? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null
}

/**
 * Insurance or medical plan
 *
 * Financial instrument by which payment information for health care.
 */
open class ClaimResponseInsurance() : BackboneElement() {
    /**
     * Business agreement
     */
    var businessArrangement: String? = null

    /**
     * Adjudication results
     */
    var claimResponse: Reference? = null

    /**
     * Insurance information
     */
    var coverage: Reference = Reference()

    /**
     * Is the focal Coverage
     */
    var focal: Boolean? = null

    val preAuthRef: List<String> = mutableListOf<String>()

    /**
     * Service instance identifier
     */
    var sequence: Int? = null
}
