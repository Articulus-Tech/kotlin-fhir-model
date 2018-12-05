package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ServiceDefinitionDataTest : DataTests() {
    @Test
    fun `servicedefinition-example 565 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/servicedefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ServiceDefinition::class.java)
        assertTrue(stringMatch("ServiceDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("guildeline-appropriate-orderi", obj.identifier[0].value))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("Guideline Appropriate Orderin", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("2015-07-22", obj.date))
        assertTrue(stringMatch("Guideline appropriate orderin", obj.description))
        assertTrue(stringMatch("Guideline Appropriate Orderin", obj.topic[0].text))
        assertTrue(stringMatch("Appropriate Use Criteria", obj.topic[1].text))
    }

    fun `servicedefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
