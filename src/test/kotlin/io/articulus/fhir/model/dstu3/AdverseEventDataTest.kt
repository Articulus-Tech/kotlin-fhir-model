package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class AdverseEventDataTest : DataTests() {
    @Test
    fun `adverseevent-example 579 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/adverseevent-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, AdverseEvent::class.java)
        assertTrue(stringMatch("AdverseEvent", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/ids/patients/", obj.identifier!!.system))
        assertTrue(stringMatch("49476534", obj.identifier!!.value))
        assertTrue(stringMatch("AE", obj.category))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("304386008", obj.type!!.coding[0].code))
        assertTrue(stringMatch("O/E - itchy rash", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("2017-01-29T12:34:56+00:00", obj.date))
        assertTrue(stringMatch("http://hl7.org/fhir/adverse-e", obj.seriousness!!.coding[0].system))
        assertTrue(stringMatch("Mild", obj.seriousness!!.coding[0].code))
        assertTrue(stringMatch("Mild", obj.seriousness!!.coding[0].display))
        assertTrue(stringMatch("Practitioner/example", obj.recorder!!.reference))
        assertTrue(stringMatch("This was a mild rash on the l", obj.description))
        assertTrue(stringMatch("Medication/example", obj.suspectEntity[0].instance.reference))
    }

    fun `adverseevent-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
