//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.410 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A group of related requests
 *
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
open class RequestGroup() : DomainResource() {
    val action: List<RequestGroupAction> = mutableListOf<RequestGroupAction>()

    /**
     * Device or practitioner that authored the request group
     */
    var author: Reference? = null

    /**
     * When the request group was authored
     */
    var authoredOn: String? = null

    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Encounter or Episode for the request group
     */
    var context: Reference? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * Composite request this is part of
     */
    var groupIdentifier: Identifier? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * proposal | plan | order
     */
    var intent: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * routine | urgent | asap | stat
     */
    var priority: String? = null

    /**
     * Reason for the request group
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason for the request group
     */
    var reasonReference: Reference? = null

    val replaces: List<Reference> = mutableListOf<Reference>()

    /**
     * draft | active | suspended | cancelled | completed | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * Who the request group is about
     */
    var subject: Reference? = null
}

/**
 * Proposed actions, if any
 *
 * The actions, if any, produced by the evaluation of the artifact.
 */
open class RequestGroupAction() : BackboneElement() {
    val action: List<RequestGroupAction> = mutableListOf<RequestGroupAction>()

    /**
     * single | multiple
     */
    var cardinalityBehavior: String? = null

    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val condition: List<RequestGroupActionCondition> = mutableListOf<RequestGroupActionCondition>()

    /**
     * Short description of the action
     */
    var description: String? = null

    val documentation: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * visual-group | logical-group | sentence-group
     */
    var groupingBehavior: String? = null

    /**
     * User-visible label for the action (e.g. 1. or A.)
     */
    var label: String? = null

    val participant: List<Reference> = mutableListOf<Reference>()

    /**
     * yes | no
     */
    var precheckBehavior: String? = null

    val relatedAction: List<RequestGroupActionRelatedAction> =
            mutableListOf<RequestGroupActionRelatedAction>()

    /**
     * must | could | must-unless-documented
     */
    var requiredBehavior: String? = null

    /**
     * The target of the action
     */
    var resource: Reference? = null

    /**
     * any | all | all-or-none | exactly-one | at-most-one | one-or-more
     */
    var selectionBehavior: String? = null

    /**
     * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
     */
    var textEquivalent: String? = null

    /**
     * When the action should take place
     */
    var timingDateTime: String? = null

    /**
     * When the action should take place
     */
    var timingDuration: Duration? = null

    /**
     * When the action should take place
     */
    var timingPeriod: Period? = null

    /**
     * When the action should take place
     */
    var timingRange: Range? = null

    /**
     * When the action should take place
     */
    var timingTiming: Timing? = null

    /**
     * User-visible title
     */
    var title: String? = null

    /**
     * create | update | remove | fire-event
     */
    var type: Coding? = null
}

/**
 * Whether or not the action is applicable
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 */
open class RequestGroupActionCondition() : BackboneElement() {
    /**
     * Natural language description of the condition
     */
    var description: String? = null

    /**
     * Boolean-valued expression
     */
    var expression: String? = null

    /**
     * applicability | start | stop
     */
    var kind: String? = null

    /**
     * Language of the expression
     */
    var language: String? = null
}

/**
 * Relationship to another action
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 */
open class RequestGroupActionRelatedAction() : BackboneElement() {
    /**
     * What action this is related to
     */
    var actionId: String? = null

    /**
     * Time offset for the relationship
     */
    var offsetDuration: Duration? = null

    /**
     * Time offset for the relationship
     */
    var offsetRange: Range? = null

    /**
     * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
     */
    var relationship: String? = null
}
