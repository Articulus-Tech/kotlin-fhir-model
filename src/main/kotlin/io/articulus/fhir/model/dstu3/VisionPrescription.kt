//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.439 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Prescription for vision correction products for a patient
 *
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 */
open class VisionPrescription() : DomainResource() {
    /**
     * When prescription was authorized
     */
    var dateWritten: String? = null

    val dispense: List<VisionPrescriptionDispense> = mutableListOf<VisionPrescriptionDispense>()

    /**
     * Created during encounter / admission / stay
     */
    var encounter: Reference? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Who prescription is for
     */
    var patient: Reference? = null

    /**
     * Who authorizes the vision product
     */
    var prescriber: Reference? = null

    /**
     * Reason or indication for writing the prescription
     */
    var reasonCodeableConcept: CodeableConcept? = null

    /**
     * Reason or indication for writing the prescription
     */
    var reasonReference: Reference? = null

    /**
     * active | cancelled | draft | entered-in-error
     */
    var status: String? = null
}

/**
 * Vision supply authorization
 *
 * Deals with details of the dispense part of the supply specification.
 */
open class VisionPrescriptionDispense() : BackboneElement() {
    /**
     * Lens add
     */
    var add: Float? = null

    /**
     * Lens axis
     */
    var axis: Int? = null

    /**
     * Contact lens back curvature
     */
    var backCurve: Float? = null

    /**
     * up | down | in | out
     */
    var base: String? = null

    /**
     * Brand required
     */
    var brand: String? = null

    /**
     * Color required
     */
    var color: String? = null

    /**
     * Lens cylinder
     */
    var cylinder: Float? = null

    /**
     * Contact lens diameter
     */
    var diameter: Float? = null

    /**
     * Lens wear duration
     */
    var duration: Quantity? = null

    /**
     * right | left
     */
    var eye: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Contact lens power
     */
    var power: Float? = null

    /**
     * Lens prism
     */
    var prism: Float? = null

    /**
     * Product to be supplied
     */
    var product: CodeableConcept? = null

    /**
     * Lens sphere
     */
    var sphere: Float? = null
}
