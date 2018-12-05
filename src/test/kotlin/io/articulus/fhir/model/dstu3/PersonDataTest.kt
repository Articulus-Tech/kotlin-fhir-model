package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PersonDataTest : DataTests() {
    @Test
    fun `person-example-f002-ariadne 413 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/person-example-f002-ariadne.json").readTextAndClose()
        val obj = mapper.fromJson(json, Person::class.java)
        assertTrue(stringMatch("Person", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("Ariadne Bor-Jansma", obj.name[0].text))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31201234567", obj.telecom[0].value))
        assertTrue(stringMatch("home", obj.telecom[0].use))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1963", obj.birthDate))
        assertTrue(stringMatch("image/jpeg", obj.photo!!.contentType))
        assertTrue(stringMatch("/9j/4AAQSkZJRgABAQEAlgCWAAD/2", obj.photo!!.data))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("RelatedPerson/f002", obj.link[0].target.reference))
        assertTrue(stringMatch("Ariadne Bor-Jansma", obj.link[0].target.display))
    }

    fun `person-example-f002-ariadne Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `person-example 414 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/person-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Person::class.java)
        assertTrue(stringMatch("Person", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:1.2.36.146.595.217.0.", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("2001-05-06", obj.identifier[0].period!!.start))
        assertTrue(stringMatch("Acme Healthcare", obj.identifier[0].assigner!!.display))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Chalmers", obj.name[0].family))
        assertTrue(stringMatch("Peter", obj.name[0].given[0]))
        assertTrue(stringMatch("James", obj.name[0].given[1]))
        assertTrue(stringMatch("usual", obj.name[1].use))
        assertTrue(stringMatch("Jim", obj.name[1].given[0]))
        assertTrue(stringMatch("home", obj.telecom[0].use))
        assertTrue(stringMatch("phone", obj.telecom[1].system))
        assertTrue(stringMatch("(03) 5555 6473", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("email", obj.telecom[2].system))
        assertTrue(stringMatch("Jim@example.org", obj.telecom[2].value))
        assertTrue(stringMatch("home", obj.telecom[2].use))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1974-12-25", obj.birthDate))
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("534 Erewhon St", obj.address[0].line[0]))
        assertTrue(stringMatch("PleasantVille", obj.address[0].city))
        assertTrue(stringMatch("Vic", obj.address[0].state))
        assertTrue(stringMatch("3999", obj.address[0].postalCode))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("RelatedPerson/peter", obj.link[0].target.reference))
        assertTrue(stringMatch("Peter Chalmers", obj.link[0].target.display))
        assertTrue(stringMatch("Patient/example", obj.link[1].target.reference))
        assertTrue(stringMatch("Peter Chalmers", obj.link[1].target.display))
    }

    fun `person-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
