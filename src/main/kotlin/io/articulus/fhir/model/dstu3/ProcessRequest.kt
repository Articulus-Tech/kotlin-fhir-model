//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.393 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Request to perform some action on or in regards to an existing resource
 *
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 */
open class ProcessRequest() : DomainResource() {
    /**
     * cancel | poll | reprocess | status
     */
    var action: String? = null

    /**
     * Creation date
     */
    var created: String? = null

    val exclude: List<String> = mutableListOf<String>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val include: List<String> = mutableListOf<String>()

    val item: List<ProcessRequestItem> = mutableListOf<ProcessRequestItem>()

    /**
     * Remove history
     */
    var nullify: Boolean? = null

    /**
     * Responsible organization
     */
    var organization: Reference? = null

    /**
     * Selection period
     */
    var period: Period? = null

    /**
     * Responsible practitioner
     */
    var provider: Reference? = null

    /**
     * Reference number/string
     */
    var reference: String? = null

    /**
     * Reference to the Request resource
     */
    var request: Reference? = null

    /**
     * Reference to the Response resource
     */
    var response: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null

    /**
     * Party which is the target of the request
     */
    var target: Reference? = null
}

/**
 * Items to re-adjudicate
 *
 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
 */
open class ProcessRequestItem() : BackboneElement() {
    /**
     * Service instance
     */
    var sequenceLinkId: Int? = null
}
