package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DeviceDataTest : DataTests() {
    @Test
    fun `device-example-software 111 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-software.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("software", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/ehr/client-id", obj.identifier[0].system))
        assertTrue(stringMatch("goodhealth", obj.identifier[0].value))
        assertTrue(stringMatch("EHR", obj.type!!.text))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("10.23-23423", obj.version))
        assertTrue(stringMatch("url", obj.contact[0].system))
        assertTrue(stringMatch("http://acme.com", obj.contact[0].value))
        assertTrue(stringMatch("http://acme.com/goodhealth/eh", obj.url))
    }

    fun `device-example-software Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-udi3 112 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-udi3.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi3", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SNO", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("XYZ456789012345678", obj.identifier[0].value))
        assertTrue(stringMatch("FHIR® Ulltra Implantable", obj.udi!!.name))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.jurisdiction))
        assertTrue(stringMatch("+H123PARTNO1234567890120/${'$'}${'$'}42", obj.udi!!.carrierHRF))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.issuer))
        assertTrue(stringMatch("manual", obj.udi!!.entryType))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("LOT123456789012345", obj.lotNumber))
        assertTrue(stringMatch("GlobalMed, Inc", obj.manufacturer))
        assertTrue(stringMatch("2013-02-02", obj.manufactureDate))
        assertTrue(stringMatch("2020-02-02", obj.expirationDate))
        assertTrue(stringMatch("Ultra Implantable", obj.model))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
    }

    fun `device-example-udi3 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-udi2 113 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-udi2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[0].url))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.extension[0].valueIdentifier!!.system))
        assertTrue(stringMatch("A99971312345600", obj.extension[0].valueIdentifier!!.value))
        assertTrue(stringMatch("A9999XYZ100T0474", obj.udi!!.deviceIdentifier))
        assertTrue(stringMatch("Bone,Putty Demineralized", obj.udi!!.name))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.jurisdiction))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.issuer))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("2013-02-01", obj.manufactureDate))
        assertTrue(stringMatch("2014-02-01", obj.expirationDate))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
    }

    fun `device-example-udi2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-f001-feedingtube 114 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-f001-feedingtube.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http:/goodhealthhospital/iden", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("25062003", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Feeding tube, device", obj.type!!.coding[0].display))
        assertTrue(stringMatch("2015-08-08", obj.manufactureDate))
        assertTrue(stringMatch("2020-08-08", obj.expirationDate))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.owner!!.reference))
        assertTrue(stringMatch("Central Supply", obj.location!!.display))
    }

    fun `device-example-f001-feedingtube Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-pacemaker 115 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-pacemaker.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-pacemaker", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/devices/pacem", obj.identifier[0].system))
        assertTrue(stringMatch("1234-5678-90AB-CDEF", obj.identifier[0].value))
        assertTrue(stringMatch("http://acme.com/devices", obj.type!!.coding[0].system))
        assertTrue(stringMatch("octane2014", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Performance pace maker for hi", obj.type!!.coding[0].display))
        assertTrue(stringMatch("1234-5678", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("PM/Octane 2014", obj.model))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("phone", obj.contact[0].system))
        assertTrue(stringMatch("ext 4352", obj.contact[0].value))
    }

    fun `device-example-pacemaker Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-udi4 116 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-udi4.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi4", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.jurisdiction))
        assertTrue(stringMatch("=)1TE123456A&)RZ12345678", obj.udi!!.carrierHRF))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.issuer))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("RZ12345678", obj.lotNumber))
        assertTrue(stringMatch("GlobalMed, Inc", obj.manufacturer))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
    }

    fun `device-example-udi4 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-ihe-pcd 117 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-ihe-pcd.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("ihe-pcd", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SNO", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("Serial Number", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("AMID-123-456", obj.identifier[0].value))
        assertTrue(stringMatch("Vital Signs Monitor", obj.type!!.text))
        assertTrue(stringMatch("12345", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("A.1.1", obj.model))
    }

    fun `device-example-ihe-pcd Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example 118 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodcare.org/devices/i", obj.identifier[0].system))
        assertTrue(stringMatch("345675", obj.identifier[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[1].type!!.coding[0].system))
        assertTrue(stringMatch("SNO", obj.identifier[1].type!!.coding[0].code))
        assertTrue(stringMatch("Serial Number", obj.identifier[1].type!!.text))
        assertTrue(stringMatch("AMID-342135-8464", obj.identifier[1].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("86184003", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Electrocardiographic monitor ", obj.type!!.coding[0].display))
        assertTrue(stringMatch("ECG", obj.type!!.text))
        assertTrue(stringMatch("43453424", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("AB 45-J", obj.model))
        assertTrue(stringMatch("phone", obj.contact[0].system))
        assertTrue(stringMatch("ext 4352", obj.contact[0].value))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.note[0].authorReference!!.reference))
        assertTrue(stringMatch("2015-06-28T14:03:32+10:00", obj.note[0].time))
        assertTrue(stringMatch("QA Checked", obj.note[0].text))
    }

    fun `device-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `device-example-udi1 119 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/device-example-udi1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Device::class.java)
        assertTrue(stringMatch("Device", obj.resourceType))
        assertTrue(stringMatch("example-udi1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/devices/pacem", obj.identifier[0].system))
        assertTrue(stringMatch("1234-5678-90AB-CDEF", obj.identifier[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[1].type!!.coding[0].system))
        assertTrue(stringMatch("SNO", obj.identifier[1].type!!.coding[0].code))
        assertTrue(stringMatch("10987654d321", obj.identifier[1].value))
        assertTrue(stringMatch("00844588003288", obj.udi!!.deviceIdentifier))
        assertTrue(stringMatch("FHIR® Hip System", obj.udi!!.name))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.jurisdiction))
        assertTrue(stringMatch("{01}00844588003288{17}141120{", obj.udi!!.carrierHRF))
        assertTrue(stringMatch("XWQyMDExMDg1NzY3NDAwMjAxNzE3M", obj.udi!!.carrierAIDC))
        assertTrue(stringMatch("http://hl7.org/fhir/NamingSys", obj.udi!!.issuer))
        assertTrue(stringMatch("barcode", obj.udi!!.entryType))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("468063009", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Coated femoral stem prosthesi", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Coated femoral stem prosthesi", obj.type!!.text))
        assertTrue(stringMatch("7654321D", obj.lotNumber))
        assertTrue(stringMatch("Acme Devices, Inc", obj.manufacturer))
        assertTrue(stringMatch("2014-11-20", obj.expirationDate))
        assertTrue(stringMatch("PM/Octane 2014", obj.model))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.3.2", obj.safety[0].coding[0].system))
        assertTrue(stringMatch("mr-unsafe", obj.safety[0].coding[0].code))
        assertTrue(stringMatch("MR Unsafe", obj.safety[0].coding[0].display))
        assertTrue(stringMatch("MR Unsafe", obj.safety[0].text))
    }

    fun `device-example-udi1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
