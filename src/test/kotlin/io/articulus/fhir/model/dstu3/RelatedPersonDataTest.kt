package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class RelatedPersonDataTest : DataTests() {
    @Test
    fun `relatedperson-example-peter 430 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/relatedperson-example-peter.json").readTextAndClose()
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("peter", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Patient/animal", obj.patient.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.relationship!!.coding[0].system))
        assertTrue(stringMatch("C", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Chalmers", obj.name[0].family))
        assertTrue(stringMatch("Peter", obj.name[0].given[0]))
        assertTrue(stringMatch("James", obj.name[0].given[1]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("(03) 5555 6473", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("534 Erewhon St", obj.address[0].line[0]))
        assertTrue(stringMatch("PleasantVille", obj.address[0].city))
        assertTrue(stringMatch("Vic", obj.address[0].state))
        assertTrue(stringMatch("3999", obj.address[0].postalCode))
        assertTrue(stringMatch("image/jpeg", obj.photo[0].contentType))
        assertTrue(stringMatch("Binary/f012", obj.photo[0].url))
        assertTrue(stringMatch("2012-03-11", obj.period!!.start))
    }

    fun `relatedperson-example-peter Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `relatedperson-example-f001-sarah 431 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/relatedperson-example-f001-sarah.json").readTextAndClose()
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("BSN", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[0].system))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.relationship!!.coding[0].system))
        assertTrue(stringMatch("SIGOTHR", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("Abels", obj.name[0].family))
        assertTrue(stringMatch("Sarah", obj.name[0].given[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0690383372", obj.telecom[0].value))
        assertTrue(stringMatch("mobile", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("s.abels@kpn.nl", obj.telecom[1].value))
        assertTrue(stringMatch("home", obj.telecom[1].use))
        assertTrue(stringMatch("female", obj.gender))
    }

    fun `relatedperson-example-f001-sarah Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `relatedperson-example 432 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/relatedperson-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("benedicte", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("INSEE", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:1.2.250.1.61", obj.identifier[0].system))
        assertTrue(stringMatch("272117510400399", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.relationship!!.coding[0].system))
        assertTrue(stringMatch("N", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.relationship!!.coding[1].system))
        assertTrue(stringMatch("WIFE", obj.relationship!!.coding[1].code))
        assertTrue(stringMatch("du Marché", obj.name[0].family))
        assertTrue(stringMatch("Bénédicte", obj.name[0].given[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+33 (237) 998327", obj.telecom[0].value))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("43, Place du Marché Sainte Ca", obj.address[0].line[0]))
        assertTrue(stringMatch("Paris", obj.address[0].city))
        assertTrue(stringMatch("75004", obj.address[0].postalCode))
        assertTrue(stringMatch("FRA", obj.address[0].country))
        assertTrue(stringMatch("image/jpeg", obj.photo[0].contentType))
        assertTrue(stringMatch("Binary/f016", obj.photo[0].url))
    }

    fun `relatedperson-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `relatedperson-example-f002-ariadne 433 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/relatedperson-example-f002-ariadne.json").readTextAndClose()
        val obj = mapper.fromJson(json, RelatedPerson::class.java)
        assertTrue(stringMatch("RelatedPerson", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Patient/f201", obj.patient.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.relationship!!.coding[0].system))
        assertTrue(stringMatch("SIGOTHR", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("Ariadne Bor-Jansma", obj.name[0].text))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31201234567", obj.telecom[0].value))
        assertTrue(stringMatch("home", obj.telecom[0].use))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1963", obj.birthDate))
        assertTrue(stringMatch("image/jpeg", obj.photo[0].contentType))
        assertTrue(stringMatch("/9j/4AAQSkZJRgABAQEAlgCWAAD/2", obj.photo[0].data))
        assertTrue(stringMatch("1975", obj.period!!.start))
    }

    fun `relatedperson-example-f002-ariadne Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
