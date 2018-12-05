//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.670 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Key Object Selection
 *
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
open class ImagingManifest() : DomainResource() {
    /**
     * Author (human or machine)
     */
    var author: Reference? = null

    /**
     * Time when the selection of instances was made
     */
    var authoringTime: String? = null

    /**
     * Description text
     */
    var description: String? = null

    /**
     * SOP Instance UID
     */
    var identifier: Identifier? = null

    /**
     * Patient of the selected objects
     */
    var patient: Reference = Reference()

    val study: List<ImagingManifestStudy> = mutableListOf<ImagingManifestStudy>()
}

/**
 * Study identity of the selected instances
 *
 * Study identity and locating information of the DICOM SOP instances in the selection.
 */
open class ImagingManifestStudy() : BackboneElement() {
    val endpoint: List<Reference> = mutableListOf<Reference>()

    /**
     * Reference to ImagingStudy
     */
    var imagingStudy: Reference? = null

    val series: List<ImagingManifestStudySeries> = mutableListOf<ImagingManifestStudySeries>()

    /**
     * Study instance UID
     */
    var uid: String? = null
}

/**
 * Series identity of the selected instances
 *
 * Series identity and locating information of the DICOM SOP instances in the selection.
 */
open class ImagingManifestStudySeries() : BackboneElement() {
    val endpoint: List<Reference> = mutableListOf<Reference>()

    val instance: List<ImagingManifestStudySeriesInstance> =
            mutableListOf<ImagingManifestStudySeriesInstance>()

    /**
     * Series instance UID
     */
    var uid: String? = null
}

/**
 * The selected instance
 *
 * Identity and locating information of the selected DICOM SOP instances.
 */
open class ImagingManifestStudySeriesInstance() : BackboneElement() {
    /**
     * SOP class UID of instance
     */
    var sopClass: String? = null

    /**
     * Selected instance UID
     */
    var uid: String? = null
}
