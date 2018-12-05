//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.239 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * An instance of a medical-related component of a medical device
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 */
open class DeviceComponent() : DomainResource() {
    /**
     * Instance id assigned by the software stack
     */
    var identifier: Identifier = Identifier()

    /**
     * Language code for the human-readable text strings produced by the device
     */
    var languageCode: CodeableConcept? = null

    /**
     * Recent system change timestamp
     */
    var lastSystemChange: String? = null

    /**
     * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
     */
    var measurementPrinciple: String? = null

    val operationalStatus: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * Current supported parameter group
     */
    var parameterGroup: CodeableConcept? = null

    /**
     * Parent resource link
     */
    var parent: Reference? = null

    val productionSpecification: List<DeviceComponentProductionSpecification> =
            mutableListOf<DeviceComponentProductionSpecification>()

    /**
     * Top-level device resource link
     */
    var source: Reference? = null

    /**
     * What kind of component it is
     */
    var type: CodeableConcept = CodeableConcept()
}

/**
 * Specification details such as Component Revisions, or Serial Numbers
 *
 * The production specification such as component revision, serial number, etc.
 */
open class DeviceComponentProductionSpecification() : BackboneElement() {
    /**
     * Internal component unique identification
     */
    var componentId: Identifier? = null

    /**
     * A printable string defining the component
     */
    var productionSpec: String? = null

    /**
     * Type or kind of production specification, for example serial number or software revision
     */
    var specType: CodeableConcept? = null
}
