//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.418 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Information about patient's relatives, relevant for patient
 *
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
open class FamilyMemberHistory() : DomainResource() {
    /**
     * (approximate) age
     */
    var ageAge: Age? = null

    /**
     * (approximate) age
     */
    var ageRange: Range? = null

    /**
     * (approximate) age
     */
    var ageString: String? = null

    /**
     * (approximate) date of birth
     */
    var bornDate: String? = null

    /**
     * (approximate) date of birth
     */
    var bornPeriod: Period? = null

    /**
     * (approximate) date of birth
     */
    var bornString: String? = null

    val condition: List<FamilyMemberHistoryCondition> =
            mutableListOf<FamilyMemberHistoryCondition>()

    /**
     * When history was captured/updated
     */
    var date: String? = null

    /**
     * Dead? How old/when?
     */
    var deceasedAge: Age? = null

    /**
     * Dead? How old/when?
     */
    var deceasedBoolean: Boolean? = null

    /**
     * Dead? How old/when?
     */
    var deceasedDate: String? = null

    /**
     * Dead? How old/when?
     */
    var deceasedRange: Range? = null

    /**
     * Dead? How old/when?
     */
    var deceasedString: String? = null

    val definition: List<Reference> = mutableListOf<Reference>()

    /**
     * Age is estimated?
     */
    var estimatedAge: Boolean? = null

    /**
     * male | female | other | unknown
     */
    var gender: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * The family member described
     */
    var name: String? = null

    /**
     * The taking of a family member's history did not occur
     */
    var notDone: Boolean? = null

    /**
     * subject-unknown | withheld | unable-to-obtain | deferred
     */
    var notDoneReason: CodeableConcept? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Patient history is about
     */
    var patient: Reference = Reference()

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val reasonReference: List<Reference> = mutableListOf<Reference>()

    /**
     * Relationship to the subject
     */
    var relationship: CodeableConcept = CodeableConcept()

    /**
     * partial | completed | entered-in-error | health-unknown
     */
    var status: String? = null
}

/**
 * Condition that the related person had
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
 */
open class FamilyMemberHistoryCondition() : BackboneElement() {
    /**
     * Condition suffered by relation
     */
    var code: CodeableConcept = CodeableConcept()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When condition first manifested
     */
    var onsetAge: Age? = null

    /**
     * When condition first manifested
     */
    var onsetPeriod: Period? = null

    /**
     * When condition first manifested
     */
    var onsetRange: Range? = null

    /**
     * When condition first manifested
     */
    var onsetString: String? = null

    /**
     * deceased | permanent disability | etc.
     */
    var outcome: CodeableConcept? = null
}
