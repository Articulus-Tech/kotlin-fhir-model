//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.456 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Contains a collection of resources
 *
 * A container for a collection of resources.
 */
open class Bundle() : Resource() {
    val entry: List<BundleEntry> = mutableListOf<BundleEntry>()

    /**
     * Persistent identifier for the bundle
     */
    var identifier: Identifier? = null

    val link: List<BundleLink> = mutableListOf<BundleLink>()

    /**
     * Digital Signature
     */
    var signature: Signature? = null

    /**
     * If search, the total number of matches
     */
    var total: Int? = null

    /**
     * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
     */
    var type: String? = null
}

/**
 * Links related to this Bundle
 *
 * A series of links that provide context to this bundle.
 */
open class BundleLink() : BackboneElement() {
    /**
     * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
     */
    var relation: String? = null

    /**
     * Reference details for the link
     */
    var url: String? = null
}

/**
 * Entry in the bundle - will have a resource, or information
 *
 * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
 */
open class BundleEntry() : BackboneElement() {
    /**
     * Absolute URL for resource (server address, or UUID/OID)
     */
    var fullUrl: String? = null

    val link: List<BundleLink> = mutableListOf<BundleLink>()

    /**
     * Transaction Related Information
     */
    var request: BundleEntryRequest? = null

    /**
     * A resource in the bundle
     */
    var resource: Resource? = null

    /**
     * Transaction Related Information
     */
    var response: BundleEntryResponse? = null

    /**
     * Search related information
     */
    var search: BundleEntrySearch? = null
}

/**
 * Search related information
 *
 * Information about the search process that lead to the creation of this entry.
 */
open class BundleEntrySearch() : BackboneElement() {
    /**
     * match | include | outcome - why this is in the result set
     */
    var mode: String? = null

    /**
     * Search ranking (between 0 and 1)
     */
    var score: Float? = null
}

/**
 * Transaction Related Information
 *
 * Additional information about how this entry should be processed as part of a transaction.
 */
open class BundleEntryRequest() : BackboneElement() {
    /**
     * For managing update contention
     */
    var ifMatch: String? = null

    /**
     * For managing update contention
     */
    var ifModifiedSince: String? = null

    /**
     * For conditional creates
     */
    var ifNoneExist: String? = null

    /**
     * For managing cache currency
     */
    var ifNoneMatch: String? = null

    /**
     * GET | POST | PUT | DELETE
     */
    var method: String? = null

    /**
     * URL for HTTP equivalent of this entry
     */
    var url: String? = null
}

/**
 * Transaction Related Information
 *
 * Additional information about how this entry should be processed as part of a transaction.
 */
open class BundleEntryResponse() : BackboneElement() {
    /**
     * The etag for the resource (if relevant)
     */
    var etag: String? = null

    /**
     * Server's date time modified
     */
    var lastModified: String? = null

    /**
     * The location, if the operation returns a location
     */
    var location: String? = null

    /**
     * OperationOutcome with hints and warnings (for batch/transaction)
     */
    var outcome: Resource? = null

    /**
     * Status response code (text optional)
     */
    var status: String? = null
}
