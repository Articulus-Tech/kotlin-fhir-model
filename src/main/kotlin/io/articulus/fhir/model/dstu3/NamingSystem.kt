//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.473 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * System of unique identification
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 */
open class NamingSystem() : DomainResource() {
    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the naming system
     */
    var description: String? = null

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * codesystem | identifier | root
     */
    var kind: String? = null

    /**
     * Name for this naming system (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Use this instead
     */
    var replacedBy: Reference? = null

    /**
     * Who maintains system namespace?
     */
    var responsible: String? = null

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * e.g. driver,  provider,  patient, bank etc.
     */
    var type: CodeableConcept? = null

    val uniqueId: List<NamingSystemUniqueId> = mutableListOf<NamingSystemUniqueId>()

    /**
     * How/where is it used
     */
    var usage: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()
}

/**
 * Unique identifiers used for system
 *
 * Indicates how the system may be identified when referenced in electronic exchange.
 */
open class NamingSystemUniqueId() : BackboneElement() {
    /**
     * Notes about identifier usage
     */
    var comment: String? = null

    /**
     * When is identifier valid?
     */
    var period: Period? = null

    /**
     * Is this the id that should be used for this type
     */
    var preferred: Boolean? = null

    /**
     * oid | uuid | uri | other
     */
    var type: String? = null

    /**
     * The unique identifier
     */
    var value: String? = null
}
