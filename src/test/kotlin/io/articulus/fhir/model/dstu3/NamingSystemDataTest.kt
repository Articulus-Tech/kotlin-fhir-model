package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class NamingSystemDataTest : DataTests() {
    @Test
    fun `namingsystem-example-id 541 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/namingsystem-example-id.json").readTextAndClose()
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example-id", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Austalian Healthcare Identifi", obj.name))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("identifier", obj.kind))
        assertTrue(stringMatch("2015-08-31", obj.date))
        assertTrue(stringMatch("HL7 Australia on behalf of NE", obj.publisher))
        assertTrue(stringMatch("HL7 Australia FHIR Team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7-australia.wikispac", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("HI Service Operator / NEHTA", obj.responsible))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.type!!.coding[0].system))
        assertTrue(stringMatch("NI", obj.type!!.coding[0].code))
        assertTrue(stringMatch("National unique individual id", obj.type!!.coding[0].display))
        assertTrue(stringMatch("IHI", obj.type!!.text))
        assertTrue(stringMatch("Australian HI Identifier as e", obj.description))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("AU", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("Used in Australia for identif", obj.usage))
        assertTrue(stringMatch("oid", obj.uniqueId[0].type))
        assertTrue(stringMatch("1.2.36.1.2001.1003.0", obj.uniqueId[0].value))
        assertTrue(stringMatch("This value is used in Austral", obj.uniqueId[0].comment))
        assertTrue(stringMatch("uri", obj.uniqueId[1].type))
        assertTrue(stringMatch("http://ns.electronichealth.ne", obj.uniqueId[1].value))
        assertEquals(true, if (obj.uniqueId[1].preferred != null) obj.uniqueId[1].preferred else false, "Field: obj.uniqueId[1].preferred")
        assertTrue(stringMatch("2015-08-21", obj.uniqueId[1].period!!.start))
    }

    fun `namingsystem-example-id Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `namingsystem-example-replaced 542 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/namingsystem-example-replaced.json").readTextAndClose()
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example-replaced", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("SNOMED CT Spanish", obj.name))
        assertTrue(stringMatch("retired", obj.status))
        assertTrue(stringMatch("codesystem", obj.kind))
        assertTrue(stringMatch("2005-01-25", obj.date))
        assertTrue(stringMatch("Not HL7!", obj.publisher))
        assertTrue(stringMatch("This was a wrong registration", obj.description))
        assertTrue(stringMatch("oid", obj.uniqueId[0].type))
        assertTrue(stringMatch("2.16.840.1.113883.6.96.1", obj.uniqueId[0].value))
        assertTrue(stringMatch("NamingSystem/example", obj.replacedBy!!.reference))
    }

    fun `namingsystem-example-replaced Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `namingsystem-example 543 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/namingsystem-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, NamingSystem::class.java)
        assertTrue(stringMatch("NamingSystem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("SNOMED CT", obj.name))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("codesystem", obj.kind))
        assertTrue(stringMatch("2014-12-13", obj.date))
        assertTrue(stringMatch("HL7 International on behalf o", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("IHTSDO & affiliates", obj.responsible))
        assertTrue(stringMatch("SNOMED CT is a concept-based,", obj.description))
        assertTrue(stringMatch("oid", obj.uniqueId[0].type))
        assertTrue(stringMatch("2.16.840.1.113883.6.96", obj.uniqueId[0].value))
        assertTrue(stringMatch("uri", obj.uniqueId[1].type))
        assertTrue(stringMatch("http://snomed.info/sct", obj.uniqueId[1].value))
        assertEquals(true, if (obj.uniqueId[1].preferred != null) obj.uniqueId[1].preferred else false, "Field: obj.uniqueId[1].preferred")
    }

    fun `namingsystem-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
