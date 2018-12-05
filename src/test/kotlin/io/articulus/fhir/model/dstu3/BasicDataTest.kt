package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class BasicDataTest : DataTests() {
    @Test
    fun `basic-example2 503 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/basic-example2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("classModel", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.extension[0].url))
        assertTrue(stringMatch("name", obj.extension[0].extension[0].url))
        assertTrue(stringMatch("Class1", obj.extension[0].extension[0].valueString))
        assertTrue(stringMatch("attribute", obj.extension[0].extension[1].url))
        assertTrue(stringMatch("name", obj.extension[0].extension[1].extension[0].url))
        assertTrue(stringMatch("attribute1", obj.extension[0].extension[1].extension[0].valueString))
        assertTrue(stringMatch("minOccurs", obj.extension[0].extension[1].extension[1].url))
        assertEquals(1, obj.extension[0].extension[1].extension[1].valueInteger)
        assertTrue(stringMatch("maxOccurs", obj.extension[0].extension[1].extension[2].url))
        assertTrue(stringMatch("*", obj.extension[0].extension[1].extension[2].valueCode))
        assertTrue(stringMatch("attribute", obj.extension[0].extension[2].url))
        assertTrue(stringMatch("name", obj.extension[0].extension[2].extension[0].url))
        assertTrue(stringMatch("attribute2", obj.extension[0].extension[2].extension[0].valueString))
        assertTrue(stringMatch("minOccurs", obj.extension[0].extension[2].extension[1].url))
        assertEquals(0, obj.extension[0].extension[2].extension[1].valueInteger)
        assertTrue(stringMatch("maxOccurs", obj.extension[0].extension[2].extension[2].url))
        assertEquals(1, obj.extension[0].extension[2].extension[2].valueInteger)
        assertTrue(stringMatch("http://example.org/do-not-use", obj.code.coding[0].system))
        assertTrue(stringMatch("UMLCLASSMODEL", obj.code.coding[0].code))
    }

    fun `basic-example2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `basic-example-narrative 504 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/basic-example-narrative.json").readTextAndClose()
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("basic-example-narrative", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Example Narrative Tester", obj.code.text))
    }

    fun `basic-example-narrative Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `basic-example 505 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/basic-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Basic::class.java)
        assertTrue(stringMatch("Basic", obj.resourceType))
        assertTrue(stringMatch("referral", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.extension[0].url))
        assertTrue(stringMatch("Practitioner/f201", obj.extension[0].valueReference!!.reference))
        assertTrue(stringMatch("Dokter Bronsig", obj.extension[0].valueReference!!.display))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.extension[1].url))
        assertTrue(stringMatch("The patient had fever peaks o", obj.extension[1].valueString))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.extension[2].url))
        assertTrue(stringMatch("Encounter/f201", obj.extension[2].valueReference!!.reference))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.modifierExtension[0].url))
        assertTrue(stringMatch("http://snomed.info/sct", obj.modifierExtension[0].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("11429006", obj.modifierExtension[0].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Consultation", obj.modifierExtension[0].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.modifierExtension[1].url))
        assertTrue(stringMatch("2013-04-01", obj.modifierExtension[1].valuePeriod!!.start))
        assertTrue(stringMatch("2013-04-15", obj.modifierExtension[1].valuePeriod!!.end))
        assertTrue(stringMatch("http://example.org/do-not-use", obj.modifierExtension[2].url))
        assertTrue(stringMatch("complete", obj.modifierExtension[2].valueCode))
        assertTrue(stringMatch("http://goodhealth.org/basic/i", obj.identifier[0].system))
        assertTrue(stringMatch("19283746", obj.identifier[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/basic-res", obj.code.coding[0].system))
        assertTrue(stringMatch("referral", obj.code.coding[0].code))
        assertTrue(stringMatch("Patient/f201", obj.subject!!.reference))
        assertTrue(stringMatch("Roel", obj.subject!!.display))
        assertTrue(stringMatch("2013-05-14", obj.created))
        assertTrue(stringMatch("Practitioner/example", obj.author!!.reference))
    }

    fun `basic-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
