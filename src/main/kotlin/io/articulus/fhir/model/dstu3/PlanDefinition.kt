//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.421 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * The definition of a plan for a series of actions, independent of any specific patient or context
 *
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
open class PlanDefinition() : DomainResource() {
    val action: List<PlanDefinitionAction> = mutableListOf<PlanDefinitionAction>()

    /**
     * When the plan definition was approved by publisher
     */
    var approvalDate: String? = null

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    val contributor: List<Contributor> = mutableListOf<Contributor>()

    /**
     * Use and/or publishing restrictions
     */
    var copyright: String? = null

    /**
     * Date this was last changed
     */
    var date: String? = null

    /**
     * Natural language description of the plan definition
     */
    var description: String? = null

    /**
     * When the plan definition is expected to be used
     */
    var effectivePeriod: Period? = null

    /**
     * For testing purposes, not real usage
     */
    var experimental: Boolean? = null

    val goal: List<PlanDefinitionGoal> = mutableListOf<PlanDefinitionGoal>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * When the plan definition was last reviewed
     */
    var lastReviewDate: String? = null

    val library: List<Reference> = mutableListOf<Reference>()

    /**
     * Name for this plan definition (computer friendly)
     */
    var name: String? = null

    /**
     * Name of the publisher (organization or individual)
     */
    var publisher: String? = null

    /**
     * Why this plan definition is defined
     */
    var purpose: String? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * draft | active | retired | unknown
     */
    var status: String? = null

    /**
     * Name for this plan definition (human friendly)
     */
    var title: String? = null

    val topic: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * order-set | protocol | eca-rule
     */
    var type: CodeableConcept? = null

    /**
     * Logical URI to reference this plan definition (globally unique)
     */
    var url: String? = null

    /**
     * Describes the clinical usage of the asset
     */
    var usage: String? = null

    val useContext: List<UsageContext> = mutableListOf<UsageContext>()

    /**
     * Business version of the plan definition
     */
    var version: String? = null
}

/**
 * What the plan is trying to accomplish
 *
 * Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 */
open class PlanDefinitionGoal() : BackboneElement() {
    val addresses: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * E.g. Treatment, dietary, behavioral, etc
     */
    var category: CodeableConcept? = null

    /**
     * Code or text describing the goal
     */
    var description: CodeableConcept = CodeableConcept()

    val documentation: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    /**
     * high-priority | medium-priority | low-priority
     */
    var priority: CodeableConcept? = null

    /**
     * When goal pursuit begins
     */
    var start: CodeableConcept? = null

    val target: List<PlanDefinitionGoalTarget> = mutableListOf<PlanDefinitionGoalTarget>()
}

/**
 * Target outcome for the goal
 *
 * Indicates what should be done and within what timeframe.
 */
open class PlanDefinitionGoalTarget() : BackboneElement() {
    /**
     * The target value to be achieved
     */
    var detailCodeableConcept: CodeableConcept? = null

    /**
     * The target value to be achieved
     */
    var detailQuantity: Quantity? = null

    /**
     * The target value to be achieved
     */
    var detailRange: Range? = null

    /**
     * Reach goal within
     */
    var due: Duration? = null

    /**
     * The parameter whose value is to be tracked
     */
    var measure: CodeableConcept? = null
}

/**
 * Action defined by the plan
 *
 * An action to be taken as part of the plan.
 */
open class PlanDefinitionAction() : BackboneElement() {
    val action: List<PlanDefinitionAction> = mutableListOf<PlanDefinitionAction>()

    /**
     * single | multiple
     */
    var cardinalityBehavior: String? = null

    val code: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val condition: List<PlanDefinitionActionCondition> =
            mutableListOf<PlanDefinitionActionCondition>()

    /**
     * Description of the activity to be performed
     */
    var definition: Reference? = null

    /**
     * Short description of the action
     */
    var description: String? = null

    val documentation: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val dynamicValue: List<PlanDefinitionActionDynamicValue> =
            mutableListOf<PlanDefinitionActionDynamicValue>()

    val goalId: List<String> = mutableListOf<String>()

    /**
     * visual-group | logical-group | sentence-group
     */
    var groupingBehavior: String? = null

    val input: List<DataRequirement> = mutableListOf<DataRequirement>()

    /**
     * User-visible label for the action (e.g. 1. or A.)
     */
    var label: String? = null

    val output: List<DataRequirement> = mutableListOf<DataRequirement>()

    val participant: List<PlanDefinitionActionParticipant> =
            mutableListOf<PlanDefinitionActionParticipant>()

    /**
     * yes | no
     */
    var precheckBehavior: String? = null

    val reason: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val relatedAction: List<PlanDefinitionActionRelatedAction> =
            mutableListOf<PlanDefinitionActionRelatedAction>()

    /**
     * must | could | must-unless-documented
     */
    var requiredBehavior: String? = null

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
     * Transform to apply the template
     */
    var transform: Reference? = null

    val triggerDefinition: List<TriggerDefinition> = mutableListOf<TriggerDefinition>()

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
open class PlanDefinitionActionCondition() : BackboneElement() {
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
open class PlanDefinitionActionRelatedAction() : BackboneElement() {
    /**
     * What action is this related to
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

/**
 * Who should participate in the action
 *
 * Indicates who should participate in performing the action described.
 */
open class PlanDefinitionActionParticipant() : BackboneElement() {
    /**
     * E.g. Nurse, Surgeon, Parent, etc
     */
    var role: CodeableConcept? = null

    /**
     * patient | practitioner | related-person
     */
    var type: String? = null
}

/**
 * Dynamic aspects of the definition
 *
 * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
 */
open class PlanDefinitionActionDynamicValue() : BackboneElement() {
    /**
     * Natural language description of the dynamic value
     */
    var description: String? = null

    /**
     * An expression that provides the dynamic value for the customization
     */
    var expression: String? = null

    /**
     * Language of the expression
     */
    var language: String? = null

    /**
     * The path to the element to be set dynamically
     */
    var path: String? = null
}
