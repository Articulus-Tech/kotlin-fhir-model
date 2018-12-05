//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.543 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Claim, Pre-determination or Pre-authorization
 *
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
open class Claim() : DomainResource() {
    /**
     * Details about an accident
     */
    var accident: ClaimAccident? = null

    /**
     * Period for charge submission
     */
    var billablePeriod: Period? = null

    val careTeam: List<ClaimCareTeam> = mutableListOf<ClaimCareTeam>()

    /**
     * Creation date
     */
    var created: String? = null

    val diagnosis: List<ClaimDiagnosis> = mutableListOf<ClaimDiagnosis>()

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
     * Funds requested to be reserved
     */
    var fundsReserve: CodeableConcept? = null

    /**
     * Period in hospital
     */
    var hospitalization: Period? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val information: List<ClaimInformation> = mutableListOf<ClaimInformation>()

    val insurance: List<ClaimInsurance> = mutableListOf<ClaimInsurance>()

    /**
     * Target
     */
    var insurer: Reference? = null

    val item: List<ClaimItem> = mutableListOf<ClaimItem>()

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Original prescription if superceded by fulfiller
     */
    var originalPrescription: Reference? = null

    /**
     * The subject of the Products and Services
     */
    var patient: Reference? = null

    /**
     * Party to be paid any benefits payable
     */
    var payee: ClaimPayee? = null

    /**
     * Prescription authorizing services or products
     */
    var prescription: Reference? = null

    /**
     * Desired processing priority
     */
    var priority: CodeableConcept? = null

    val procedure: List<ClaimProcedure> = mutableListOf<ClaimProcedure>()

    /**
     * Responsible provider
     */
    var provider: Reference? = null

    /**
     * Treatment Referral
     */
    var referral: Reference? = null

    val related: List<ClaimRelated> = mutableListOf<ClaimRelated>()

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    val subType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Total claim cost
     */
    var total: Money? = null

    /**
     * Type or discipline
     */
    var type: CodeableConcept? = null

    /**
     * complete | proposed | exploratory | other
     */
    var use: String? = null
}

/**
 * Related Claims which may be revelant to processing this claimn
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 */
open class ClaimRelated() : BackboneElement() {
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
open class ClaimPayee() : BackboneElement() {
    /**
     * Party to receive the payable
     */
    var party: Reference? = null

    /**
     * organization | patient | practitioner | relatedperson
     */
    var resourceType: Coding? = null

    /**
     * Type of party: Subscriber, Provider, other
     */
    var type: CodeableConcept = CodeableConcept()
}

/**
 * Members of the care team
 *
 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
 */
open class ClaimCareTeam() : BackboneElement() {
    /**
     * Provider individual or organization
     */
    var provider: Reference = Reference()

    /**
     * Type, classification or Specialization
     */
    var qualification: CodeableConcept? = null

    /**
     * Billing provider
     */
    var responsible: Boolean? = null

    /**
     * Role on the team
     */
    var role: CodeableConcept? = null

    /**
     * Number to covey order of careTeam
     */
    var sequence: Int? = null
}

/**
 * Exceptions, special considerations, the condition, situation, prior or concurrent issues
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
 */
open class ClaimInformation() : BackboneElement() {
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
    var reason: CodeableConcept? = null

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
 * List of Diagnosis
 *
 * List of patient diagnosis for which care is sought.
 */
open class ClaimDiagnosis() : BackboneElement() {
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
open class ClaimProcedure() : BackboneElement() {
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
open class ClaimInsurance() : BackboneElement() {
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

/**
 * Details about an accident
 *
 * An accident which resulted in the need for healthcare services.
 */
open class ClaimAccident() : BackboneElement() {
    /**
     * When the accident occurred
     * see information codes
     * see information codes
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
open class ClaimItem() : BackboneElement() {
    /**
     * Service Location
     */
    var bodySite: CodeableConcept? = null

    val careTeamLinkId: List<Int> = mutableListOf<Int>()

    /**
     * Type of service or product
     */
    var category: CodeableConcept? = null

    val detail: List<ClaimItemDetail> = mutableListOf<ClaimItemDetail>()

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
 * Additional items
 *
 * Second tier of goods and services.
 */
open class ClaimItemDetail() : BackboneElement() {
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

    val subDetail: List<ClaimItemDetailSubDetail> = mutableListOf<ClaimItemDetailSubDetail>()

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
open class ClaimItemDetailSubDetail() : BackboneElement() {
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

    val udi: List<Reference> = mutableListOf<Reference>()

    /**
     * Fee, charge or cost per point
     */
    var unitPrice: Money? = null
}
