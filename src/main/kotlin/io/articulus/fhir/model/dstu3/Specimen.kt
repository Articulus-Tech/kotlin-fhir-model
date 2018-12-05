//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.728 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Sample for analysis
 *
 * A sample to be used for analysis.
 */
open class Specimen() : DomainResource() {
    /**
     * Identifier assigned by the lab
     */
    var accessionIdentifier: Identifier? = null

    /**
     * Collection details
     */
    var collection: SpecimenCollection? = null

    val container: List<SpecimenContainer> = mutableListOf<SpecimenContainer>()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    val parent: List<Reference> = mutableListOf<Reference>()

    val processing: List<SpecimenProcessing> = mutableListOf<SpecimenProcessing>()

    /**
     * The time when specimen was received for processing
     */
    var receivedTime: String? = null

    val request: List<Reference> = mutableListOf<Reference>()

    /**
     * available | unavailable | unsatisfactory | entered-in-error
     */
    var status: String? = null

    /**
     * Where the specimen came from. This may be from the patient(s) or from the environment or a device
     */
    var subject: Reference = Reference()

    /**
     * Kind of material that forms the specimen
     */
    var type: CodeableConcept? = null
}

/**
 * Collection details
 *
 * Details concerning the specimen collection.
 */
open class SpecimenCollection() : BackboneElement() {
    /**
     * Anatomical collection site
     */
    var bodySite: CodeableConcept? = null

    /**
     * Collection time
     */
    var collectedDateTime: String? = null

    /**
     * Collection time
     */
    var collectedPeriod: Period? = null

    /**
     * Who collected the specimen
     */
    var collector: Reference? = null

    /**
     * Technique used to perform collection
     */
    var method: CodeableConcept? = null

    /**
     * The quantity of specimen collected
     */
    var quantity: Quantity? = null
}

/**
 * Processing and processing step details
 *
 * Details concerning processing and processing steps for the specimen.
 */
open class SpecimenProcessing() : BackboneElement() {
    val additive: List<Reference> = mutableListOf<Reference>()

    /**
     * Textual description of procedure
     */
    var description: String? = null

    /**
     * Indicates the treatment step  applied to the specimen
     */
    var procedure: CodeableConcept? = null

    /**
     * Date and time of specimen processing
     */
    var timeDateTime: String? = null

    /**
     * Date and time of specimen processing
     */
    var timePeriod: Period? = null
}

/**
 * Direct container of specimen (tube/slide, etc.)
 *
 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
 */
open class SpecimenContainer() : BackboneElement() {
    /**
     * Additive associated with container
     */
    var additiveCodeableConcept: CodeableConcept? = null

    /**
     * Additive associated with container
     */
    var additiveReference: Reference? = null

    /**
     * Container volume or size
     */
    var capacity: Quantity? = null

    /**
     * Textual description of the container
     */
    var description: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Quantity of specimen within container
     */
    var specimenQuantity: Quantity? = null

    /**
     * Kind of container directly associated with specimen
     */
    var type: CodeableConcept? = null
}
