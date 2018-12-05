//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.660 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Medical care, research study or other healthcare event causing physical injury
 *
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 */
open class AdverseEvent() : DomainResource() {
    /**
     * AE | PAE An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
     */
    var category: String? = null

    /**
     * When the event occurred
     */
    var date: String? = null

    /**
     * Description of the adverse event
     */
    var description: String? = null

    /**
     * Who  was involved in the adverse event or the potential adverse event
     */
    var eventParticipant: Reference? = null

    /**
     * Business identifier for the event
     */
    var identifier: Identifier? = null

    /**
     * Location where adverse event occurred
     */
    var location: Reference? = null

    /**
     * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
     */
    var outcome: CodeableConcept? = null

    val reaction: List<Reference> = mutableListOf<Reference>()

    /**
     * Who recorded the adverse event
     */
    var recorder: Reference? = null

    val referenceDocument: List<Reference> = mutableListOf<Reference>()

    /**
     * Mild | Moderate | Severe
     */
    var seriousness: CodeableConcept? = null

    val study: List<Reference> = mutableListOf<Reference>()

    /**
     * Subject or group impacted by event
     */
    var subject: Reference? = null

    val subjectMedicalHistory: List<Reference> = mutableListOf<Reference>()

    val suspectEntity: List<AdverseEventSuspectEntity> = mutableListOf<AdverseEventSuspectEntity>()

    /**
     * actual | potential
     */
    var type: CodeableConcept? = null
}

/**
 * The suspected agent causing the adverse event
 *
 * Describes the entity that is suspected to have caused the adverse event.
 */
open class AdverseEventSuspectEntity() : BackboneElement() {
    /**
     * causality1 | causality2
     */
    var causality: String? = null

    /**
     * assess1 | assess2
     */
    var causalityAssessment: CodeableConcept? = null

    /**
     * AdverseEvent.suspectEntity.causalityAuthor
     */
    var causalityAuthor: Reference? = null

    /**
     * method1 | method2
     */
    var causalityMethod: CodeableConcept? = null

    /**
     * AdverseEvent.suspectEntity.causalityProductRelatedness
     */
    var causalityProductRelatedness: String? = null

    /**
     * result1 | result2
     */
    var causalityResult: CodeableConcept? = null

    /**
     * Refers to the specific entity that caused the adverse event
     */
    var instance: Reference = Reference()
}
