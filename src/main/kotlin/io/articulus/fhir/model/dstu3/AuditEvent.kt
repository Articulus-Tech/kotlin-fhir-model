//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.601 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Event record kept for security purposes
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
open class AuditEvent() : DomainResource() {
    /**
     * Type of action performed during the event
     */
    var action: String? = null

    val agent: List<AuditEventAgent> = mutableListOf<AuditEventAgent>()

    val entity: List<AuditEventEntity> = mutableListOf<AuditEventEntity>()

    /**
     * Whether the event succeeded or failed
     */
    var outcome: String? = null

    /**
     * Description of the event outcome
     */
    var outcomeDesc: String? = null

    val purposeOfEvent: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Time when the event occurred on source
     */
    var recorded: String? = null

    /**
     * Audit Event Reporter
     */
    var source: AuditEventSource = AuditEventSource()

    val subtype: List<Coding> = mutableListOf<Coding>()

    /**
     * Type/identifier of event
     */
    var type: Coding = Coding()
}

/**
 * Actor involved in the event
 *
 * An actor taking an active role in the event or activity that is logged.
 */
open class AuditEventAgent() : BackboneElement() {
    /**
     * Alternative User id e.g. authentication
     */
    var altId: String? = null

    /**
     * Where
     */
    var location: Reference? = null

    /**
     * Type of media
     */
    var media: Coding? = null

    /**
     * Human-meaningful name for the agent
     */
    var name: String? = null

    /**
     * Logical network location for application activity
     */
    var network: AuditEventAgentNetwork? = null

    val policy: List<String> = mutableListOf<String>()

    val purposeOfUse: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Direct reference to resource
     */
    var reference: Reference? = null

    /**
     * Whether user is initiator
     */
    var requestor: Boolean? = null

    val role: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Unique identifier for the user
     */
    var userId: Identifier? = null
}

/**
 * Logical network location for application activity
 *
 * Logical network location for application activity, if the activity has a network location.
 */
open class AuditEventAgentNetwork() : BackboneElement() {
    /**
     * Identifier for the network access point of the user device
     */
    var address: String? = null

    /**
     * The type of network access point
     */
    var type: String? = null
}

/**
 * Audit Event Reporter
 *
 * The system that is reporting the event.
 */
open class AuditEventSource() : BackboneElement() {
    /**
     * The identity of source detecting the event
     */
    var identifier: Identifier = Identifier()

    /**
     * Logical source location within the enterprise
     */
    var site: String? = null

    val type: List<Coding> = mutableListOf<Coding>()
}

/**
 * Data or objects used
 *
 * Specific instances of data or objects that have been accessed.
 */
open class AuditEventEntity() : BackboneElement() {
    /**
     * Descriptive text
     */
    var description: String? = null

    val detail: List<AuditEventEntityDetail> = mutableListOf<AuditEventEntityDetail>()

    /**
     * Specific instance of object
     */
    var identifier: Identifier? = null

    /**
     * Life-cycle stage for the entity
     */
    var lifecycle: Coding? = null

    /**
     * Descriptor for entity
     */
    var name: String? = null

    /**
     * Query parameters
     */
    var query: String? = null

    /**
     * Specific instance of resource
     */
    var reference: Reference? = null

    /**
     * What role the entity played
     */
    var role: Coding? = null

    val securityLabel: List<Coding> = mutableListOf<Coding>()

    /**
     * Type of entity involved
     */
    var type: Coding? = null
}

/**
 * Additional Information about the entity
 *
 * Tagged value pairs for conveying additional information about the entity.
 */
open class AuditEventEntityDetail() : BackboneElement() {
    /**
     * Name of the property
     */
    var type: String? = null

    /**
     * Property value
     */
    var value: String? = null
}
