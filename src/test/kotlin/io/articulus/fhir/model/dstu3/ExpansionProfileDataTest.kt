package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ExpansionProfileDataTest : DataTests() {
    @Test
    fun `expansionprofile-example 434 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/expansionprofile-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ExpansionProfile::class.java)
        assertTrue(stringMatch("ExpansionProfile", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Expansion", obj.url))
        assertTrue(stringMatch("http://example.org/profiles", obj.identifier!!.system))
        assertTrue(stringMatch("example", obj.identifier!!.value))
        assertTrue(stringMatch("0.1", obj.version))
        assertTrue(stringMatch("Example Expansion Profile", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2016-12-23", obj.date))
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("exanple ExpansionProfile for ", obj.description))
        assertTrue(stringMatch("http://unstats.un.org/unsd/me", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("001", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("World", obj.jurisdiction[0].coding[0].display))
        assertEquals(true, if (obj.excludeNested != null) obj.excludeNested else false, "Field: obj.excludeNested")
    }

    fun `expansionprofile-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
