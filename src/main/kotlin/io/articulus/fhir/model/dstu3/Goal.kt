//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.299 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Describes the intended objective(s) for a patient, group or organization
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 */
open class Goal() : DomainResource() {
    val addresses: List<Reference> = mutableListOf<Reference>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Code or text describing goal
     */
    var description: CodeableConcept = CodeableConcept()

    /**
     * Who's responsible for creating Goal?
     */
    var expressedBy: Reference? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val outcomeCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val outcomeReference: List<Reference> = mutableListOf<Reference>()

    /**
     * high-priority | medium-priority | low-priority
     */
    var priority: CodeableConcept? = null

    /**
     * When goal pursuit begins
     */
    var startCodeableConcept: CodeableConcept? = null

    /**
     * When goal pursuit begins
     */
    var startDate: String? = null

    /**
     * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
     */
    var status: String? = null

    /**
     * When goal status took effect
     */
    var statusDate: String? = null

    /**
     * Reason for current status
     */
    var statusReason: String? = null

    /**
     * Who this goal is intended for
     */
    var subject: Reference? = null

    /**
     * Target outcome for the goal
     */
    var target: GoalTarget? = null
}

/**
 * Target outcome for the goal
 *
 * Indicates what should be done by when.
 */
open class GoalTarget() : BackboneElement() {
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
     * Reach goal on or before
     */
    var dueDate: String? = null

    /**
     * Reach goal on or before
     */
    var dueDuration: Duration? = null

    /**
     * The parameter whose value is being tracked
     */
    var measure: CodeableConcept? = null
}
