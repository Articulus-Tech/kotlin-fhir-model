//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.753 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * PaymentReconciliation resource
 *
 * This resource provides payment details and claim references supporting a bulk payment.
 */
open class PaymentReconciliation() : DomainResource() {
    /**
     * Creation date
     */
    var created: String? = null

    val detail: List<PaymentReconciliationDetail> = mutableListOf<PaymentReconciliationDetail>()

    /**
     * Disposition Message
     */
    var disposition: String? = null

    /**
     * Printed Form Identifier
     */
    var form: CodeableConcept? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Insurer
     */
    var organization: Reference? = null

    /**
     * complete | error | partial
     */
    var outcome: CodeableConcept? = null

    /**
     * Period covered
     */
    var period: Period? = null

    val processNote: List<PaymentReconciliationProcessNote> =
            mutableListOf<PaymentReconciliationProcessNote>()

    /**
     * Claim reference
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

    /**
     * Total amount of Payment
     */
    var total: Money? = null
}

/**
 * List of settlements
 *
 * List of individual settlement amounts and the corresponding transaction.
 */
open class PaymentReconciliationDetail() : BackboneElement() {
    /**
     * Amount being paid
     */
    var amount: Money? = null

    /**
     * Invoice date
     */
    var date: String? = null

    /**
     * Organization which is receiving the payment
     */
    var payee: Reference? = null

    /**
     * Claim
     */
    var request: Reference? = null

    /**
     * Claim Response
     */
    var response: Reference? = null

    /**
     * Organization which submitted the claim
     */
    var submitter: Reference? = null

    /**
     * Type code
     */
    var type: CodeableConcept = CodeableConcept()
}

/**
 * Processing comments
 *
 * Suite of notes.
 */
open class PaymentReconciliationProcessNote() : BackboneElement() {
    /**
     * Comment on the processing
     */
    var text: String? = null

    /**
     * display | print | printoper
     */
    var type: CodeableConcept? = null
}
