//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.435 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * The technical details of an endpoint that can be used for electronic services
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 */
open class Endpoint() : DomainResource() {
    /**
     * The technical base address for connecting to this endpoint
     */
    var address: String? = null

    /**
     * Protocol/Profile/Standard to be used with this endpoint connection
     */
    var connectionType: Coding = Coding()

    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    val header: List<String> = mutableListOf<String>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
     */
    var managingOrganization: Reference? = null

    /**
     * A name that this endpoint can be identified by
     */
    var name: String? = null

    val payloadMimeType: List<String> = mutableListOf<String>()

    val payloadType: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Interval the endpoint is expected to be operational
     */
    var period: Period? = null

    /**
     * active | suspended | error | off | entered-in-error | test
     */
    var status: String? = null
}
