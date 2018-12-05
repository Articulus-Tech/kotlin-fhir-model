//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.405 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A server push subscription criteria
 *
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 */
open class Subscription() : DomainResource() {
    /**
     * The channel on which to report matches to the criteria
     */
    var channel: SubscriptionChannel = SubscriptionChannel()

    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Rule for server push criteria
     */
    var criteria: String? = null

    /**
     * When to automatically delete the subscription
     */
    var end: String? = null

    /**
     * Latest error note
     */
    var error: String? = null

    /**
     * Description of why this subscription was created
     */
    var reason: String? = null

    /**
     * requested | active | error | off
     */
    var status: String? = null

    val tag: List<Coding> = mutableListOf<Coding>()
}

/**
 * The channel on which to report matches to the criteria
 *
 * Details where to send notifications when resources are received that meet the criteria.
 */
open class SubscriptionChannel() : BackboneElement() {
    /**
     * Where the channel points to
     */
    var endpoint: String? = null

    val header: List<String> = mutableListOf<String>()

    /**
     * Mimetype to send, or omit for no payload
     */
    var payload: String? = null

    /**
     * rest-hook | websocket | email | sms | message
     */
    var type: String? = null
}
