//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.533 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A clinical assessment performed when planning treatments and management strategies for a patient
 *
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
open class ClinicalImpression() : DomainResource() {
    val action: List<Reference> = mutableListOf<Reference>()

    /**
     * The clinician performing the assessment
     */
    var assessor: Reference? = null

    /**
     * Kind of assessment performed
     */
    var code: CodeableConcept? = null

    /**
     * Encounter or Episode created from
     */
    var context: Reference? = null

    /**
     * When the assessment was documented
     */
    var date: String? = null

    /**
     * Why/how the assessment was performed
     */
    var description: String? = null

    /**
     * Time of assessment
     */
    var effectiveDateTime: String? = null

    /**
     * Time of assessment
     */
    var effectivePeriod: Period? = null

    val finding: List<ClinicalImpressionFinding> = mutableListOf<ClinicalImpressionFinding>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val investigation: List<ClinicalImpressionInvestigation> =
            mutableListOf<ClinicalImpressionInvestigation>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Reference to last assessment
     */
    var previous: Reference? = null

    val problem: List<Reference> = mutableListOf<Reference>()

    val prognosisCodeableConcept: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val prognosisReference: List<Reference> = mutableListOf<Reference>()

    val protocol: List<String> = mutableListOf<String>()

    /**
     * draft | completed | entered-in-error
     */
    var status: String? = null

    /**
     * Patient or group assessed
     */
    var subject: Reference = Reference()

    /**
     * Summary of the assessment
     */
    var summary: String? = null
}

/**
 * One or more sets of investigations (signs, symptions, etc.)
 *
 * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
 */
open class ClinicalImpressionInvestigation() : BackboneElement() {
    /**
     * A name/code for the set
     */
    var code: CodeableConcept = CodeableConcept()

    val item: List<Reference> = mutableListOf<Reference>()
}

/**
 * Possible or likely findings and diagnoses
 *
 * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
 */
open class ClinicalImpressionFinding() : BackboneElement() {
    /**
     * Which investigations support finding
     */
    var basis: String? = null

    /**
     * What was found
     */
    var itemCodeableConcept: CodeableConcept = CodeableConcept()

    /**
     * What was found
     */
    var itemReference: Reference = Reference()
}
