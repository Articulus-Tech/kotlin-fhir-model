//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.810 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Details and position information for a physical place
 *
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 */
open class Location() : DomainResource() {
    /**
     * Physical location
     */
    var address: Address? = null

    val alias: List<String> = mutableListOf<String>()

    /**
     * Additional details about the location that could be displayed as further information to identify the location beyond its name
     */
    var description: String? = null

    val endpoint: List<Reference> = mutableListOf<Reference>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Organization responsible for provisioning and upkeep
     */
    var managingOrganization: Reference? = null

    /**
     * instance | kind
     */
    var mode: String? = null

    /**
     * Name of the location as used by humans
     */
    var name: String? = null

    /**
     * The Operational status of the location (typically only for a bed/room)
     */
    var operationalStatus: Coding? = null

    /**
     * Another Location this one is physically part of
     */
    var partOf: Reference? = null

    /**
     * Physical form of the location
     */
    var physicalType: CodeableConcept? = null

    /**
     * The absolute geographic location
     */
    var position: LocationPosition? = null

    /**
     * active | suspended | inactive
     */
    var status: String? = null

    val telecom: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Type of function performed
     */
    var type: CodeableConcept? = null
}

/**
 * The absolute geographic location
 *
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
 */
open class LocationPosition() : BackboneElement() {
    /**
     * Altitude with WGS84 datum
     */
    var altitude: Float? = null

    /**
     * Latitude with WGS84 datum
     */
    var latitude: Float? = null

    /**
     * Longitude with WGS84 datum
     */
    var longitude: Float? = null
}
