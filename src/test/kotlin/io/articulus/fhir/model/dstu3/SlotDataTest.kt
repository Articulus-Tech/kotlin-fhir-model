package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SlotDataTest : DataTests() {
    @Test
    fun `slot-example-busy 421 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/slot-example-busy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/identifier", obj.identifier[0].system))
        assertTrue(stringMatch("123132", obj.identifier[0].value))
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("Schedule/example", obj.schedule.reference))
        assertTrue(stringMatch("busy", obj.status))
        assertTrue(stringMatch("2013-12-25T09:00:00Z", obj.start))
        assertTrue(stringMatch("2013-12-25T09:15:00Z", obj.end))
        assertEquals(true, if (obj.overbooked != null) obj.overbooked else false, "Field: obj.overbooked")
        assertTrue(stringMatch("Assessments should be perform", obj.comment))
    }

    fun `slot-example-busy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `slot-example 422 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/slot-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("57", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("Immunization", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("408480009", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("Clinical immunology", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0276", obj.appointmentType!!.coding[0].system))
        assertTrue(stringMatch("WALKIN", obj.appointmentType!!.coding[0].code))
        assertTrue(stringMatch("A previously unscheduled walk", obj.appointmentType!!.coding[0].display))
        assertTrue(stringMatch("Schedule/example", obj.schedule.reference))
        assertTrue(stringMatch("free", obj.status))
        assertTrue(stringMatch("2013-12-25T09:15:00Z", obj.start))
        assertTrue(stringMatch("2013-12-25T09:30:00Z", obj.end))
        assertTrue(stringMatch("Assessments should be perform", obj.comment))
    }

    fun `slot-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `slot-example-unavailable 423 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/slot-example-unavailable.json").readTextAndClose()
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("3", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("Schedule/example", obj.schedule.reference))
        assertTrue(stringMatch("busy-unavailable", obj.status))
        assertTrue(stringMatch("2013-12-25T09:30:00Z", obj.start))
        assertTrue(stringMatch("2013-12-25T09:45:00Z", obj.end))
        assertTrue(stringMatch("Dr Careful is out of the offi", obj.comment))
    }

    fun `slot-example-unavailable Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `slot-example-tentative 424 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/slot-example-tentative.json").readTextAndClose()
        val obj = mapper.fromJson(json, Slot::class.java)
        assertTrue(stringMatch("Slot", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("17", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("Schedule/example", obj.schedule.reference))
        assertTrue(stringMatch("busy-tentative", obj.status))
        assertTrue(stringMatch("2013-12-25T09:45:00Z", obj.start))
        assertTrue(stringMatch("2013-12-25T10:00:00Z", obj.end))
        assertTrue(stringMatch("Dr Careful is out of the offi", obj.comment))
    }

    fun `slot-example-tentative Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
