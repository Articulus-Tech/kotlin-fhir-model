package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CompartmentDefinitionDataTest : DataTests() {
    @Test
    fun `compartmentdefinition-example 133 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/compartmentdefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, CompartmentDefinition::class.java)
        assertTrue(stringMatch("CompartmentDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Compartme", obj.url))
        assertTrue(stringMatch("EXAMPLE", obj.name))
        assertTrue(stringMatch("Base FHIR compartment definit", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2017-02-24", obj.date))
        assertTrue(stringMatch("Health Level Seven Internatio", obj.publisher))
        assertTrue(stringMatch("[string]", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("The set of resources associat", obj.description))
        assertTrue(stringMatch("Provides an example of a FHIR", obj.purpose))
        assertTrue(stringMatch("http://hl7.org/fhir/usage-con", obj.useContext[0].code.system))
        assertTrue(stringMatch("focus", obj.useContext[0].code.code))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("Device", obj.useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("US", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("United States of America (the", obj.jurisdiction[0].coding[0].display))
        assertTrue(stringMatch("Device", obj.code))
        assertEquals(true, if (obj.search != null) obj.search else false, "Field: obj.search")
        assertTrue(stringMatch("Communication", obj.resource[0].code))
        assertTrue(stringMatch("sender", obj.resource[0].param[0]))
        assertTrue(stringMatch("recipient", obj.resource[0].param[1]))
        assertTrue(stringMatch("The device used as the messag", obj.resource[0].documentation))
        assertTrue(stringMatch("CommunicationRequest", obj.resource[1].code))
        assertTrue(stringMatch("sender", obj.resource[1].param[0]))
        assertTrue(stringMatch("recipient", obj.resource[1].param[1]))
        assertTrue(stringMatch("The device used as the messag", obj.resource[1].documentation))
    }

    fun `compartmentdefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
