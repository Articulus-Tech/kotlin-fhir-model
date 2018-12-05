package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MessageDefinitionDataTest : DataTests() {
    @Test
    fun `messagedefinition-example 528 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/messagedefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, MessageDefinition::class.java)
        assertTrue(stringMatch("MessageDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/MessageDe", obj.url))
        assertTrue(stringMatch("EXAMPLE", obj.name))
        assertTrue(stringMatch("Message definition base examp", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2016-11-09", obj.date))
        assertTrue(stringMatch("Health Level Seven, Int'l", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Defines a base example for ot", obj.purpose))
        assertTrue(stringMatch("http://hl7.org/fhir/message-e", obj.event.system))
        assertTrue(stringMatch("communication-request", obj.event.code))
        assertTrue(stringMatch("Notification", obj.category))
        assertEquals(false, if (obj.responseRequired != null) obj.responseRequired else false, "Field: obj.responseRequired")
    }

    fun `messagedefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
