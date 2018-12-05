//
//  Generated from FHIR Version 3.0.1.11917 on 2018-12-05T09:46:12.358 
//
//   2018, Articulus
//  
package io.articulus.fhir.model.dstu3

import kotlin.collections.List

/**
 * Item used in healthcare
 *
 * This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
 */
open class Device() : DomainResource() {
    val contact: List<ContactPoint> = mutableListOf<ContactPoint>()

    /**
     * Date and time of expiry of this device (if applicable)
     */
    var expirationDate: String? = null

    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * Where the resource is found
     */
    var location: Reference? = null

    /**
     * Lot number of manufacture
     */
    var lotNumber: String? = null

    /**
     * Date when the device was made
     */
    var manufactureDate: String? = null

    /**
     * Name of device manufacturer
     */
    var manufacturer: String? = null

    /**
     * Model id assigned by the manufacturer
     */
    var model: String? = null

    val note: List<Annotation> = mutableListOf<Annotation>()

    /**
     * Organization responsible for device
     */
    var owner: Reference? = null

    /**
     * Patient to whom Device is affixed
     */
    var patient: Reference? = null

    val safety: List<CodeableConcept> = mutableListOf<CodeableConcept>()

    /**
     * active | inactive | entered-in-error | unknown
     */
    var status: String? = null

    /**
     * What kind of device this is
     */
    var type: CodeableConcept? = null

    /**
     * Unique Device Identifier (UDI) Barcode string
     */
    var udi: DeviceUdi? = null

    /**
     * Network address to contact device
     */
    var url: String? = null

    /**
     * Version number (i.e. software)
     */
    var version: String? = null
}

/**
 * Unique Device Identifier (UDI) Barcode string
 *
 * [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
 */
open class DeviceUdi() : BackboneElement() {
    /**
     * UDI Machine Readable Barcode String
     */
    var carrierAIDC: String? = null

    /**
     * UDI Human Readable Barcode String
     */
    var carrierHRF: String? = null

    /**
     * Mandatory fixed portion of UDI
     */
    var deviceIdentifier: String? = null

    /**
     * barcode | rfid | manual +
     */
    var entryType: String? = null

    /**
     * UDI Issuing Organization
     */
    var issuer: String? = null

    /**
     * Regional UDI authority
     */
    var jurisdiction: String? = null

    /**
     * Device Name as appears on UDI label
     */
    var name: String? = null
}
