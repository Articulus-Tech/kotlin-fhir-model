//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.520 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

/**
 * A reference to a document
 *
 * A reference to a document.
 */
open class DocumentReference() : DomainResource() {
    /**
     * Who/what authenticated the document
     */
    var authenticator: Reference? = null

    val author: List<Reference> = mutableListOf<Reference>()

    /**
     * Categorization of document
     */
    @SerializedName("class")
    var class_fhir: CodeableConcept? = null

    val content: List<DocumentReferenceContent> = mutableListOf<DocumentReferenceContent>()

    /**
     * Clinical context of document
     */
    var context: DocumentReferenceContext? = null

    /**
     * Document creation time
     */
    var created: String? = null

    /**
     * Organization which maintains the document
     */
    var custodian: Reference? = null

    /**
     * Human-readable description (title)
     */
    var description: String? = null

    /**
     * preliminary | final | appended | amended | entered-in-error
     */
    var docStatus: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * When this document reference was created
     */
    var indexed: String? = null

    /**
     * Master Version Specific Identifier
     */
    var masterIdentifier: Identifier? = null

    val relatesTo: List<DocumentReferenceRelatesTo> = mutableListOf<DocumentReferenceRelatesTo>()

    val securityLabel: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * current | superseded | entered-in-error
     */
    var status: String? = null

    /**
     * Who/what is the subject of the document
     */
    var subject: Reference? = null

    /**
     * Kind of document (LOINC if possible)
     */
    var type: CodeableConcept = CodeableConcept()
}

/**
 * Relationships to other documents
 *
 * Relationships that this document has with other document references that already exist.
 */
open class DocumentReferenceRelatesTo() : BackboneElement() {
    /**
     * replaces | transforms | signs | appends
     */
    var code: String? = null

    /**
     * Target of the relationship
     */
    var target: Reference = Reference()
}

/**
 * Document referenced
 *
 * The document and format referenced. There may be multiple content element repetitions, each with a different format.
 */
open class DocumentReferenceContent() : BackboneElement() {
    /**
     * Where to access the document
     */
    var attachment: Attachment = Attachment()

    /**
     * Format/content rules for the document
     */
    var format: Coding? = null
}

/**
 * Clinical context of document
 *
 * The clinical context in which the document was prepared.
 */
open class DocumentReferenceContext() : BackboneElement() {
    /**
     * Context of the document  content
     */
    var encounter: Reference? = null

    val event: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Kind of facility where patient was seen
     */
    var facilityType: CodeableConcept? = null

    /**
     * Time of service that is being documented
     */
    var period: Period? = null

    /**
     * Additional details about where the content was created (e.g. clinical specialty)
     */
    var practiceSetting: CodeableConcept? = null

    val related: List<DocumentReferenceContextRelated> =
            mutableListOf<DocumentReferenceContextRelated>()

    /**
     * Patient demographics from source
     */
    var sourcePatientInfo: Reference? = null
}

/**
 * Related identifiers or resources
 *
 * Related identifiers or resources associated with the DocumentReference.
 */
open class DocumentReferenceContextRelated() : BackboneElement() {
    /**
     * Identifier of related objects or events
     */
    var identifier: Identifier? = null

    /**
     * Related Resource
     */
    var ref: Reference? = null
}
