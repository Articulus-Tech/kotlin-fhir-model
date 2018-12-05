//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.706 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 */
open class Media() : DomainResource() {
    val basedOn: List<Reference> = mutableListOf<Reference>()

    /**
     * Body part in media
     */
    var bodySite: CodeableConcept? = null

    /**
     * Actual Media - reference or data
     */
    var content: Attachment = Attachment()

    /**
     * Encounter / Episode associated with media
     */
    var context: Reference? = null

    /**
     * Observing Device
     */
    var device: Reference? = null

    /**
     * Length in seconds (audio / video)
     */
    var duration: Int? = null

    /**
     * Number of frames if > 1 (photo)
     */
    var frames: Int? = null

    /**
     * Height of the image in pixels (photo/video)
     */
    var height: Int? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When Media was collected
     */
    var occurrenceDateTime: String? = null

    /**
     * When Media was collected
     */
    var occurrencePeriod: Period? = null

    /**
     * The person who generated the image
     */
    var operator: Reference? = null

    val reasonCode: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Who/What this Media is a record of
     */
    var subject: Reference? = null

    /**
     * The type of acquisition equipment/process
     */
    var subtype: CodeableConcept? = null

    /**
     * photo | video | audio
     */
    var type: String? = null

    /**
     * Imaging view, e.g. Lateral or Antero-posterior
     */
    var view: CodeableConcept? = null

    /**
     * Width of the image in pixels (photo/video)
     */
    var width: Int? = null
}
