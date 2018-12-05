package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class GraphDefinitionDataTest : DataTests() {
    @Test
    fun `graphdefinition-example 567 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/graphdefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, GraphDefinition::class.java)
        assertTrue(stringMatch("GraphDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://h7.org/fhir/GraphDefin", obj.url))
        assertTrue(stringMatch("Document Generation Template", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2015-08-04", obj.date))
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Specify to include list refer", obj.description))
        assertTrue(stringMatch("Composition", obj.start))
        assertTrue(stringMatch("Composition.section.entry", obj.link[0].path))
        assertTrue(stringMatch("Link to List", obj.link[0].description))
        assertTrue(stringMatch("List", obj.link[0].target[0].type))
        assertTrue(stringMatch("Patient", obj.link[0].target[0].compartment[0].code))
        assertTrue(stringMatch("identical", obj.link[0].target[0].compartment[0].rule))
        assertTrue(stringMatch("List.entry.item", obj.link[0].target[0].link[0].path))
        assertTrue(stringMatch("Include any list entries", obj.link[0].target[0].link[0].description))
        assertTrue(stringMatch("Resource", obj.link[0].target[0].link[0].target[0].type))
        assertTrue(stringMatch("Patient", obj.link[0].target[0].link[0].target[0].compartment[0].code))
        assertTrue(stringMatch("identical", obj.link[0].target[0].link[0].target[0].compartment[0].rule))
    }

    fun `graphdefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
