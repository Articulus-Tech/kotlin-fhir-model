package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class StructureMapDataTest : DataTests() {
    @Test
    fun `structuremap-example 578 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/structuremap-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, StructureMap::class.java)
        assertTrue(stringMatch("StructureMap", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.url))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:37843577-95fb-4adb-84", obj.identifier[0].value))
        assertTrue(stringMatch("0.1", obj.version))
        assertTrue(stringMatch("ExampleMap", obj.name))
        assertTrue(stringMatch("Example Map", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2017-03-09", obj.date))
        assertTrue(stringMatch("HL7 FHIR Standard", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Example Structure Map", obj.description))
        assertTrue(stringMatch("http://unstats.un.org/unsd/me", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("009", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("Oceania", obj.jurisdiction[0].coding[0].display))
        assertTrue(stringMatch("Examples", obj.group[0].name))
        assertTrue(stringMatch("none", obj.group[0].typeMode))
        assertTrue(stringMatch("test -> testValue", obj.group[0].documentation))
        assertTrue(stringMatch("test", obj.group[0].input[0].name))
        assertTrue(stringMatch("source", obj.group[0].input[0].mode))
        assertTrue(stringMatch("rule1", obj.group[0].rule[0].name))
        assertTrue(stringMatch("Source", obj.group[0].rule[0].source[0].context))
        assertTrue(stringMatch("SourceClassA", obj.group[0].rule[0].source[0].type))
        assertTrue(stringMatch("test", obj.group[0].rule[0].source[0].element))
        assertTrue(stringMatch("t", obj.group[0].rule[0].source[0].variable))
        assertTrue(stringMatch("Destination", obj.group[0].rule[0].target[0].context))
        assertTrue(stringMatch("variable", obj.group[0].rule[0].target[0].contextType))
        assertTrue(stringMatch("testValue", obj.group[0].rule[0].target[0].element))
        assertTrue(stringMatch("copy", obj.group[0].rule[0].target[0].transform))
    }

    fun `structuremap-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
