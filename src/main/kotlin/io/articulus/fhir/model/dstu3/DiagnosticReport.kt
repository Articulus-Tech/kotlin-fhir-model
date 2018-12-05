//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.496 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
 *
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
open class DiagnosticReport() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Service category
     */
    var category: CodeableConcept? = null

    /**
     * Name/Code for this diagnostic report
     */
    var code: CodeableConcept = CodeableConcept()

    val codedDiagnosis: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Clinical Interpretation of test results
     */
    var conclusion: String? = null

    /**
     * Health care event when test ordered
     */
    var context: Reference? = null

    /**
     * Clinically relevant time/time-period for report
     */
    var effectiveDateTime: String? = null

    /**
     * Clinically relevant time/time-period for report
     */
    var effectivePeriod: Period? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val image: List<DiagnosticReportImage> = mutableListOf<DiagnosticReportImage>()

    val imagingStudy: List<Reference> = mutableListOf<Reference>()

    /**
     * DateTime this version was released
     */
    var issued: String? = null

    val performer: List<DiagnosticReportPerformer> = mutableListOf<DiagnosticReportPerformer>()

    val presentedForm: List<Attachment> = mutableListOf<Attachment>()

    val result: List<Reference> = mutableListOf<Reference>()

    val specimen: List<Reference> = mutableListOf<Reference>()

    /**
     * registered | partial | preliminary | final +
     */
    var status: String? = null

    /**
     * The subject of the report - usually, but not always, the patient
     */
    var subject: Reference? = null
}

/**
 * Participants in producing the report
 *
 * Indicates who or what participated in producing the report.
 */
open class DiagnosticReportPerformer() : BackboneElement() {
    /**
     * Practitioner or Organization  participant
     */
    var actor: Reference = Reference()

    /**
     * Type of performer
     */
    var role: CodeableConcept? = null
}

/**
 * Key images associated with this report
 *
 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
 */
open class DiagnosticReportImage() : BackboneElement() {
    /**
     * Comment about the image (e.g. explanation)
     */
    var comment: String? = null

    /**
     * Reference to the image source
     */
    var link: Reference = Reference()
}
