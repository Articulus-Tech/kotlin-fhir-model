package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class FlagDataTest : DataTests() {
    @Test
    fun `flag-example 546 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/flag-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Flag::class.java)
        assertTrue(stringMatch("Flag", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("inactive", obj.status))
        assertTrue(stringMatch("http://example.org/local", obj.category!!.coding[0].system))
        assertTrue(stringMatch("admin", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Admin", obj.category!!.coding[0].display))
        assertTrue(stringMatch("admin", obj.category!!.text))
        assertTrue(stringMatch("http://example.org/local", obj.code.coding[0].system))
        assertTrue(stringMatch("bigdog", obj.code.coding[0].code))
        assertTrue(stringMatch("Big dog", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient has a big dog at his ", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Peter Patient", obj.subject.display))
        assertTrue(stringMatch("2015-01-17", obj.period!!.start))
        assertTrue(stringMatch("2016-12-01", obj.period!!.end))
        assertTrue(stringMatch("Practitioner/example", obj.author!!.reference))
        assertTrue(stringMatch("Nancy Nurse", obj.author!!.display))
    }

    fun `flag-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `flag-example-encounter 547 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/flag-example-encounter.json").readTextAndClose()
        val obj = mapper.fromJson(json, Flag::class.java)
        assertTrue(stringMatch("Flag", obj.resourceType))
        assertTrue(stringMatch("example-encounter", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://example.org/local", obj.category!!.coding[0].system))
        assertTrue(stringMatch("infection", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Infection Control Level", obj.category!!.coding[0].display))
        assertTrue(stringMatch("http://example.org/local/if1", obj.code.coding[0].system))
        assertTrue(stringMatch("l3", obj.code.coding[0].code))
        assertTrue(stringMatch("Follow Level 3 Protocol", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Peter Patient", obj.subject.display))
        assertTrue(stringMatch("Encounter/example", obj.encounter!!.reference))
    }

    fun `flag-example-encounter Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
