package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class VisionPrescriptionDataTest : DataTests() {
    @Test
    fun `visionprescription-example-1 531 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/visionprescription-example-1.json").readTextAndClose()
        val obj = mapper.fromJson(json, VisionPrescription::class.java)
        assertTrue(stringMatch("VisionPrescription", obj.resourceType))
        assertTrue(stringMatch("33124", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.happysight.com/pre", obj.identifier[0].system))
        assertTrue(stringMatch("15014", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("Encounter/f001", obj.encounter!!.reference))
        assertTrue(stringMatch("2014-06-15", obj.dateWritten))
        assertTrue(stringMatch("Practitioner/example", obj.prescriber!!.reference))
        assertTrue(stringMatch("http://samplevisionreasoncode", obj.reasonCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("myopia", obj.reasonCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-vision", obj.dispense[0].product!!.coding[0].system))
        assertTrue(stringMatch("contact", obj.dispense[0].product!!.coding[0].code))
        assertTrue(stringMatch("right", obj.dispense[0].eye))
        assertTrue(stringMatch("%.2f".format(-2.25f), "%.2f".format(obj.dispense[0].cylinder)))
        assertEquals(160, obj.dispense[0].axis)
        assertTrue(stringMatch("%.2f".format(1.75f), "%.2f".format(obj.dispense[0].add)))
        assertTrue(stringMatch("%.2f".format(-2.75f), "%.2f".format(obj.dispense[0].power)))
        assertTrue(stringMatch("%.2f".format(8.7f), "%.2f".format(obj.dispense[0].backCurve)))
        assertTrue(stringMatch("%.2f".format(14.0f), "%.2f".format(obj.dispense[0].diameter)))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dispense[0].duration!!.value)))
        assertTrue(stringMatch("month", obj.dispense[0].duration!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dispense[0].duration!!.system))
        assertTrue(stringMatch("month", obj.dispense[0].duration!!.code))
        assertTrue(stringMatch("green", obj.dispense[0].color))
        assertTrue(stringMatch("OphthaGuard", obj.dispense[0].brand))
        assertTrue(stringMatch("Shade treatment for extreme l", obj.dispense[0].note[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-vision", obj.dispense[1].product!!.coding[0].system))
        assertTrue(stringMatch("contact", obj.dispense[1].product!!.coding[0].code))
        assertTrue(stringMatch("left", obj.dispense[1].eye))
        assertTrue(stringMatch("%.2f".format(-3.50f), "%.2f".format(obj.dispense[1].cylinder)))
        assertEquals(160, obj.dispense[1].axis)
        assertTrue(stringMatch("%.2f".format(1.75f), "%.2f".format(obj.dispense[1].add)))
    }

    @Test
    fun `visionprescription-example-1 532 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/visionprescription-example-1.json").readTextAndClose()
        val obj = mapper.fromJson(json, VisionPrescription::class.java)
        assertTrue(stringMatch("%.2f".format(-2.75f), "%.2f".format(obj.dispense[1].power)))
        assertTrue(stringMatch("%.2f".format(8.7f), "%.2f".format(obj.dispense[1].backCurve)))
        assertTrue(stringMatch("%.2f".format(14.0f), "%.2f".format(obj.dispense[1].diameter)))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dispense[1].duration!!.value)))
        assertTrue(stringMatch("month", obj.dispense[1].duration!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dispense[1].duration!!.system))
        assertTrue(stringMatch("month", obj.dispense[1].duration!!.code))
        assertTrue(stringMatch("green", obj.dispense[1].color))
        assertTrue(stringMatch("OphthaGuard", obj.dispense[1].brand))
        assertTrue(stringMatch("Shade treatment for extreme l", obj.dispense[1].note[0].text))
    }

    fun `visionprescription-example-1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `visionprescription-example 533 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/visionprescription-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, VisionPrescription::class.java)
        assertTrue(stringMatch("VisionPrescription", obj.resourceType))
        assertTrue(stringMatch("33123", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.happysight.com/pre", obj.identifier[0].system))
        assertTrue(stringMatch("15013", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("2014-06-15", obj.dateWritten))
        assertTrue(stringMatch("Practitioner/example", obj.prescriber!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-vision", obj.dispense[0].product!!.coding[0].system))
        assertTrue(stringMatch("lens", obj.dispense[0].product!!.coding[0].code))
        assertTrue(stringMatch("right", obj.dispense[0].eye))
        assertTrue(stringMatch("%.2f".format(-2.00f), "%.2f".format(obj.dispense[0].sphere)))
        assertTrue(stringMatch("%.2f".format(0.5f), "%.2f".format(obj.dispense[0].prism)))
        assertTrue(stringMatch("down", obj.dispense[0].base))
        assertTrue(stringMatch("%.2f".format(2.00f), "%.2f".format(obj.dispense[0].add)))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-vision", obj.dispense[1].product!!.coding[0].system))
        assertTrue(stringMatch("lens", obj.dispense[1].product!!.coding[0].code))
        assertTrue(stringMatch("left", obj.dispense[1].eye))
        assertTrue(stringMatch("%.2f".format(-1.00f), "%.2f".format(obj.dispense[1].sphere)))
        assertTrue(stringMatch("%.2f".format(-0.50f), "%.2f".format(obj.dispense[1].cylinder)))
        assertEquals(180, obj.dispense[1].axis)
        assertTrue(stringMatch("%.2f".format(0.5f), "%.2f".format(obj.dispense[1].prism)))
        assertTrue(stringMatch("up", obj.dispense[1].base))
        assertTrue(stringMatch("%.2f".format(2.00f), "%.2f".format(obj.dispense[1].add)))
    }

    fun `visionprescription-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
