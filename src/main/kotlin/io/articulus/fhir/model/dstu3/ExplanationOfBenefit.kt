//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.341 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Explanation of Benefit resource
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
open class ExplanationOfBenefit() : DomainResource() {
    /**
     * Details of an accident
     */
    var accident: ExplanationOfBenefitAccident? = null

    val addItem: List<ExplanationOfBenefitAddItem> = mutableListOf<ExplanationOfBenefitAddItem>()

    val benefitBalance: List<ExplanationOfBenefitBenefitBalance> =
            mutableListOf<ExplanationOfBenefitBenefitBalance>()

    /**
     * Period for charge submission
     */
    var billablePeriod: Period? = null

    val careTeam: List<ExplanationOfBenefitCareTeam> = mutableListOf<ExplanationOfBenefitCareTeam>()

    /**
     * Claim reference
     */
    var claim: Reference? = null

    /**
     * Claim response reference
     */
    var claimResponse: Reference? = null

    /**
     * Creation date
     */
    var created: String? = null

    val diagnosis: List<ExplanationOfBenefitDiagnosis> =
            mutableListOf<ExplanationOfBenefitDiagnosis>()

    /**
     * Disposition Message
     */
    var disposition: String? = null

    /**
     * Period unable to work
     */
    var employmentImpacted: Period? = null

    /**
     * Author
     */
    var enterer: Reference? = null

    /**
     * Servicing Facility
     */
    var facility: Reference? = null

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    /**
     * Period in hospital
     */
    var hospitalization: Period? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val information: List<ExplanationOfBenefitInformation> =
            mutableListOf<ExplanationOfBenefitInformation>()

    /**
     * Insurance or medical plan
     */
    var insurance: ExplanationOfBenefitInsurance? = null

    /**
     * Insurer responsible for the EOB
     */
    var insurer: Reference? = null

    val item: List<ExplanationOfBenefitItem> = mutableListOf<ExplanationOfBenefitItem>()

    /**
     * Responsible organization for the claim
     */
    var organization: Reference? = null

    /**
     * Original prescription if superceded by fulfiller
     */
    var originalPrescription: Reference? = null

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
    var payee: ExplanationOfBenefitPayee? = null

    /**
     * Payment (if paid)
     */
    var payment: ExplanationOfBenefitPayment? = null

    /**
     * Precedence (primary, secondary, etc.)
     */
    var precedence: Int? = null

    /**
     * Prescription authorizing services or products
     */
    var prescription: Reference? = null

    val procedure: List<ExplanationOfBenefitProcedure> =
            mutableListOf<ExplanationOfBenefitProcedure>()

    val processNote: List<ExplanationOfBenefitProcessNote> =
            mutableListOf<ExplanationOfBenefitProcessNote>()

    /**
     * Responsible provider for the claim
     */
    var provider: Reference? = null

    /**
     * Treatment Referral
     */
    var referral: Reference? = null

    val related: List<ExplanationOfBenefitRelated> = mutableListOf<ExplanationOfBenefitRelated>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    val subType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Total benefit payable for the Claim
     */
    var totalBenefit: Money? = null

    /**
     * Total Cost of service from the Claim
     */
    var totalCost: Money? = null

    /**
     * Type or discipline
     */
    var type: CodeableConcept? = null

    /**
     * Unallocated deductable
     */
    var unallocDeductable: Money? = null
}

/**
 * Related Claims which may be revelant to processing this claim
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 */
open class ExplanationOfBenefitRelated() : BackboneElement() {
    /**
     * Reference to the related claim
     */
    var claim: Reference? = null

    /**
     * Related file or case reference
     */
    var reference: Identifier? = null

    /**
     * How the reference claim is related
     */
    var relationship: CodeableConcept? = null
}

/**
 * Party to be paid any benefits payable
 *
 * The party to be reimbursed for the services.
 */
open class ExplanationOfBenefitPayee() : BackboneElement() {
    /**
     * Party to receive the payable
     */
    var party: Reference? = null

    /**
     * organization | patient | practitioner | relatedperson
     */
    var resourceType: CodeableConcept? = null

    /**
     * Type of party: Subscriber, Provider, other
     */
    var type: CodeableConcept? = null
}

/**
 * Exceptions, special considerations, the condition, situation, prior or concurrent issues
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
 */
open class ExplanationOfBenefitInformation() : BackboneElement() {
    /**
     * General class of information
     */
    var category: CodeableConcept = CodeableConcept()

    /**
     * Type of information
     */
    var code: CodeableConcept? = null

    /**
     * Reason associated with the information
     */
    var reason: Coding? = null

    /**
     * Information instance identifier
     */
    var sequence: Int? = null

    /**
     * When it occurred
     */
    var timingDate: String? = null

    /**
     * When it occurred
     */
    var timingPeriod: Period? = null

    /**
     * Additional Data or supporting information
     */
    var valueAttachment: Attachment? = null

    /**
     * Additional Data or supporting information
     */
    var valueQuantity: Quantity? = null

    /**
     * Additional Data or supporting information
     */
    var valueReference: Reference? = null

    /**
     * Additional Data or supporting information
     */
    var valueString: String? = null
}

/**
 * Care Team members
 *
 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
 */
open class ExplanationOfBenefitCareTeam() : BackboneElement() {
    /**
     * Member of the Care Team
     */
    var provider: Reference = Reference()

    /**
     * Type, classification or Specialization
     */
    var qualification: CodeableConcept? = null

    /**
     * Billing practitioner
     */
    var responsible: Boolean? = null

    /**
     * Role on the team
     */
    var role: CodeableConcept? = null

    /**
     * Number to covey order of careteam
     */
    var sequence: Int? = null
}

/**
 * List of Diagnosis
 *
 * Ordered list of patient diagnosis for which care is sought.
 */
open class ExplanationOfBenefitDiagnosis() : BackboneElement() {
    /**
     * Patient's diagnosis
     */
    var diagnosisCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Patient's diagnosis
     */
    var diagnosisReference: Reference = Reference()

    /**
     * Package billing code
     */
    var packageCode: CodeableConcept? = null

    /**
     * Number to covey order of diagnosis
     */
    var sequence: Int? = null

    val type: List<CodeableConcept> = mutableListOf<CodeableConcept>()
}

/**
 * Procedures performed
 *
 * Ordered list of patient procedures performed to support the adjudication.
 */
open class ExplanationOfBenefitProcedure() : BackboneElement() {
    /**
     * When the procedure was performed
     */
    var date: String? = null

    /**
     * Patient's list of procedures performed
     */
    var procedureCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * Patient's list of procedures performed
     */
    var procedureReference: Reference = Reference()

    /**
     * Procedure sequence for reference
     */
    var sequence: Int? = null
}

/**
 * Insurance or medical plan
 *
 * Financial instrument by which payment information for health care.
 */
open class ExplanationOfBenefitInsurance() : BackboneElement() {
    /**
     * Insurance information
     */
    var coverage: Reference? = null

    val preAuthRef: List<String> = mutableListOf<String>()
}

/**
 * Details of an accident
 *
 * An accident which resulted in the need for healthcare services.
 */
open class ExplanationOfBenefitAccident() : BackboneElement() {
    /**
     * When the accident occurred
     */
    var date: String? = null

    /**
     * Accident Place
     */
    var locationAddress: Address? = null

    /**
     * Accident Place
     */
    var locationReference: Reference? = null

    /**
     * The nature of the accident
     */
    var type: CodeableConcept? = null
}

/**
 * Goods and Services
 *
 * First tier of goods and services.
 */
open class ExplanationOfBenefitItem() : BackboneElement() {
    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    /**
     * Service Location
     */
    var bodySite: CodeableConcept? = null

    val careTeamLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    val detail: List<ExplanationOfBenefitItemDetail> =
            mutableListOf<ExplanationOfBenefitItemDetail>()

    val diagnosisLinkId: List<Int> = mutableListOf<Int>()

    val encounter: List<Reference> = mutableListOf<Reference>()

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    val informationLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Place of service
     */
    var locationAddress: Address? = null

    /**
     * Place of service
     */
    var locationCodeableConcept: CodeableConcept? = null

    /**
     * Place of service
     */
    var locationReference: Reference? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Total item cost
     */
    var net: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val procedureLinkId: List<Int> = mutableListOf<Int>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Service instance
     */
    var sequence: Int? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    /**
     * Date or dates of Service
     */
    var servicedDate: String? = null

    /**
     * Date or dates of Service
     */
    var servicedPeriod: Period? = null

    val subSite: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val udi: List<Reference> = mutableListOf<Reference>()

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null
}

/**
 * Adjudication details
 *
 * The adjudications results.
 */
open class ExplanationOfBenefitItemAdjudication() : BackboneElement() {
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
     * Non-monitory value
     */
    var value: Float? = null
}

/**
 * Additional items
 *
 * Second tier of goods and services.
 */
open class ExplanationOfBenefitItemDetail() : BackboneElement() {
    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Total additional item cost
     */
    var net: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Service instance
     */
    var sequence: Int? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    val subDetail: List<ExplanationOfBenefitItemDetailSubDetail> =
            mutableListOf<ExplanationOfBenefitItemDetailSubDetail>()

    /**
     * Group or type of product or service
     */
    var type: CodeableConcept = CodeableConcept()

    val udi: List<Reference> = mutableListOf<Reference>()

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null
}

/**
 * Additional items
 *
 * Third tier of goods and services.
 */
open class ExplanationOfBenefitItemDetailSubDetail() : BackboneElement() {
    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    /**
     * Price scaling factor
     */
    var factor: Float? = null

    val modifier: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Net additional item cost
     */
    var net: Money? = null

    val noteNumber: List<Int> = mutableListOf<Int>()

    val programCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Count of Products or Services
     */
    var quantity: Quantity? = null

    /**
     * Revenue or cost center code
     */
    var revenue: CodeableConcept? = null

    /**
     * Service instance
     */
    var sequence: Int? = null

    /**
     * Billing Code
     */
    var service: CodeableConcept? = null

    /**
     * Type of product or service
     */
    var type: CodeableConcept = CodeableConcept()

    val udi: List<Reference> = mutableListOf<Reference>()

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null
}

/**
 * Insurer added line items
 *
 * The first tier service adjudications for payor added services.
 */
open class ExplanationOfBenefitAddItem() : BackboneElement() {
    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    val detail: List<ExplanationOfBenefitAddItemDetail> =
            mutableListOf<ExplanationOfBenefitAddItemDetail>()

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
     * Billing Code
     */
    var service: CodeableConcept? = null
}

/**
 * Added items details
 *
 * The second tier service adjudications for payor added services.
 */
open class ExplanationOfBenefitAddItemDetail() : BackboneElement() {
    val adjudication: List<ExplanationOfBenefitItemAdjudication> =
            mutableListOf<ExplanationOfBenefitItemAdjudication>()

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
     * Billing Code
     */
    var service: CodeableConcept? = null
}

/**
 * Payment (if paid)
 *
 * Payment details for the claim if the claim has been paid.
 */
open class ExplanationOfBenefitPayment() : BackboneElement() {
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
     * Expected date of Payment
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
open class ExplanationOfBenefitProcessNote() : BackboneElement() {
    /**
     * Language if different from the resource
     */
    var language: CodeableConcept? = null

    /**
     * Sequence number for this note
     */
    var number: Int? = null

    /**
     * Note explanitory text
     */
    var text: String? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null
}

/**
 * Balance by Benefit Category
 *
 * Balance by Benefit Category.
 */
open class ExplanationOfBenefitBenefitBalance() : BackboneElement() {
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

    val financial: List<ExplanationOfBenefitBenefitBalanceFinancial> =
            mutableListOf<ExplanationOfBenefitBenefitBalanceFinancial>()

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
open class ExplanationOfBenefitBenefitBalanceFinancial() : BackboneElement() {
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
