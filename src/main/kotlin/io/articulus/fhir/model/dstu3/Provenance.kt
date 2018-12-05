//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.716 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Who, What, When for a set of resources
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
open class Provenance() : DomainResource() {
    /**
     * Activity that occurred
     */
    var activity: Coding? = null

    val agent: List<ProvenanceAgent> = mutableListOf<ProvenanceAgent>()

    val entity: List<ProvenanceEntity> = mutableListOf<ProvenanceEntity>()

    /**
     * Where the activity occurred, if relevant
     */
    var location: Reference? = null

    /**
     * When the activity occurred
     */
    var period: Period? = null

    val policy: List<String> = mutableListOf<String>()

    val reason: List<Coding> = mutableListOf<Coding>()

    /**
     * When the activity was recorded / updated
     */
    var recorded: String? = null

    val signature: List<Signature> = mutableListOf<Signature>()

    val target: List<Reference> = mutableListOf<Reference>()
}

/**
 * Actor involved
 *
 * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
 */
open class ProvenanceAgent() : BackboneElement() {
    /**
     * Who the agent is representing
     */
    var onBehalfOfReference: Reference? = null

    /**
     * Who the agent is representing
     */
    var onBehalfOfUri: String? = null

    /**
     * Type of relationship between agents
     */
    var relatedAgentType: CodeableConcept? = null

    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Who participated
     */
    var whoReference: Reference = Reference()

    /**
     * Who participated
     */
    var whoUri: String? = null
}

/**
 * An entity used in this activity
 *
 * An entity used in this activity.
 */
open class ProvenanceEntity() : BackboneElement() {
    val agent: List<ProvenanceAgent> = mutableListOf<ProvenanceAgent>()

    /**
     * derivation | revision | quotation | source | removal
     */
    var role: String? = null

    /**
     * Identity of entity
     */
    var whatIdentifier: Identifier = Identifier()

    /**
     * Identity of entity
     */
    var whatReference: Reference = Reference()

    /**
     * Identity of entity
     */
    var whatUri: String? = null
}
