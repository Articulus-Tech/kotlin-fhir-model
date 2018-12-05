//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.433 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Record of use of a device
 *
 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
 */
open class DeviceUseStatement() : DomainResource() {
    /**
     * Target body site
     */
    var bodySite: CodeableConcept? = null

    /**
     * Reference to device used
     */
    var device: Reference = Reference()

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    val indication: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * When statement was recorded
     */
    var recordedOn: String? = null

    /**
     * Who made the statement
     */
    var source: Reference? = null

    /**
     * active | completed | entered-in-error +
     */
    var status: String? = null

    /**
     * Patient using device
     */
    var subject: Reference = Reference()

    /**
     * How often  the device was used
     */
    var timingDateTime: String? = null

    /**
     * How often  the device was used
     */
    var timingPeriod: Period? = null

    /**
     * How often  the device was used
     */
    var timingTiming: Timing? = null

    /**
     * Period device was used
     */
    var whenUsed: Period? = null
}
