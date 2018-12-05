//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.813 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Tracks balance, charges, for patient or cost center
 *
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
 */
open class Account() : DomainResource() {
    /**
     * Time window that transactions may be posted to this account
     */
    var active: Period? = null

    /**
     * How much is in account?
     */
    var balance: Money? = null

    val coverage: List<AccountCoverage> = mutableListOf<AccountCoverage>()

    /**
     * Explanation of purpose/use
     */
    var description: String? = null

    val guarantor: List<AccountGuarantor> = mutableListOf<AccountGuarantor>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Human-readable label
     */
    var name: String? = null

    /**
     * Who is responsible?
     */
    var owner: Reference? = null

    /**
     * Transaction window
     */
    var period: Period? = null

    /**
     * active | inactive | entered-in-error
     */
    var status: String? = null

    /**
     * What is account tied to?
     */
    var subject: Reference? = null

    /**
     * E.g. patient, expense, depreciation
     */
    var type: CodeableConcept? = null
}

/**
 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
 *
 * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account.
 */
open class AccountCoverage() : BackboneElement() {
    /**
     * The party(s) that are responsible for covering the payment of this account
     */
    var coverage: Reference = Reference()

    /**
     * The priority of the coverage in the context of this account
     */
    var priority: Int? = null
}

/**
 * Responsible for the account
 *
 * Parties financially responsible for the account.
 */
open class AccountGuarantor() : BackboneElement() {
    /**
     * Credit or other hold applied
     */
    var onHold: Boolean? = null

    /**
     * Responsible entity
     */
    var party: Reference = Reference()

    /**
     * Guarrantee account during
     */
    var period: Period? = null
}
