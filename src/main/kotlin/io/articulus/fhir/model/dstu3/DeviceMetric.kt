//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.666 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 */
open class DeviceMetric() : DomainResource() {
    val calibration: List<DeviceMetricCalibration> = mutableListOf<DeviceMetricCalibration>()

    /**
     * measurement | setting | calculation | unspecified
     */
    var category: String? = null

    /**
     * black | red | green | yellow | blue | magenta | cyan | white
     */
    var color: String? = null

    /**
     * Unique identifier of this DeviceMetric
     */
    var identifier: Identifier = Identifier()

    /**
     * Describes the measurement repetition time
     */
    var measurementPeriod: Timing? = null

    /**
     * on | off | standby | entered-in-error
     */
    var operationalStatus: String? = null

    /**
     * Describes the link to the parent DeviceComponent
     */
    var parent: Reference? = null

    /**
     * Describes the link to the source Device
     */
    var source: Reference? = null

    /**
     * Identity of metric, for example Heart Rate or PEEP Setting
     */
    var type: CodeableConcept = CodeableConcept()

    /**
     * Unit of Measure for the Metric
     */
    var unit: CodeableConcept? = null
}

/**
 * Describes the calibrations that have been performed or that are required to be performed
 *
 * Describes the calibrations that have been performed or that are required to be performed.
 */
open class DeviceMetricCalibration() : BackboneElement() {
    /**
     * not-calibrated | calibration-required | calibrated | unspecified
     */
    var state: String? = null

    /**
     * Describes the time last calibration has been performed
     */
    var time: String? = null

    /**
     * unspecified | offset | gain | two-point
     */
    var type: String? = null
}
