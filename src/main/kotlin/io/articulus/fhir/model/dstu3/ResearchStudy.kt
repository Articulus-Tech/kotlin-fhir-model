//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.489 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
open class ResearchStudy() : DomainResource() {
    val arm: List<ResearchStudyArm> = mutableListOf<ResearchStudyArm>()

    val category: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val contact: List<ContactDetail> = mutableListOf<ContactDetail>()

    /**
     * What this is study doing
     */
    var description: String? = null

    val enrollment: List<Reference> = mutableListOf<Reference>()

    val focus: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val jurisdiction: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val keyword: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val partOf: List<Reference> = mutableListOf<Reference>()

    /**
     * When the study began and ended
     */
    var period: Period? = null

    /**
     * The individual responsible for the study
     */
    var principalInvestigator: Reference? = null

    val protocol: List<Reference> = mutableListOf<Reference>()

    /**
     * Reason for terminating study early
     */
    var reasonStopped: CodeableConcept? = null

    val relatedArtifact: List<RelatedArtifact> = mutableListOf<RelatedArtifact>()

    val site: List<Reference> = mutableListOf<Reference>()

    /**
     * Organization responsible for the study
     */
    var sponsor: Reference? = null

    /**
     * draft | in-progress | suspended | stopped | completed | entered-in-error
     */
    var status: String? = null

    /**
     * Name for this study
     */
    var title: String? = null
}

/**
 * Defined path through the study for a subject
 *
 * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
 */
open class ResearchStudyArm() : BackboneElement() {
    /**
     * Categorization of study arm
     */
    var code: CodeableConcept? = null

    /**
     * Short explanation of study path
     */
    var description: String? = null

    /**
     * Label for study arm
     */
    var name: String? = null
}
