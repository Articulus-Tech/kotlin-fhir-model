package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MessageHeaderDataTest : DataTests() {
    @Test
    fun `messageheader-example 356 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/messageheader-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, MessageHeader::class.java)
        assertTrue(stringMatch("MessageHeader", obj.resourceType))
        assertTrue(stringMatch("1cbdfb97-5859-48a4-8301-d54ea", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/message-e", obj.event.system))
        assertTrue(stringMatch("admin-notify", obj.event.code))
        assertTrue(stringMatch("Acme Message Gateway", obj.destination[0].name))
        assertTrue(stringMatch("Device/example", obj.destination[0].target!!.reference))
        assertTrue(stringMatch("llp:10.11.12.14:5432", obj.destination[0].endpoint))
        assertTrue(stringMatch("Organization/1", obj.sender!!.reference))
        assertTrue(stringMatch("2012-01-04T09:10:14Z", obj.timestamp))
        assertTrue(stringMatch("Practitioner/example", obj.enterer!!.reference))
        assertTrue(stringMatch("Practitioner/example", obj.author!!.reference))
        assertTrue(stringMatch("Acme Central Patient Registry", obj.source.name))
        assertTrue(stringMatch("FooBar Patient Manager", obj.source.software))
        assertTrue(stringMatch("3.1.45.AABB", obj.source.version))
        assertTrue(stringMatch("phone", obj.source.contact!!.system))
        assertTrue(stringMatch("+1 (555) 123 4567", obj.source.contact!!.value))
        assertTrue(stringMatch("llp:10.11.12.13:5432", obj.source.endpoint))
        assertTrue(stringMatch("http://hl7.org/fhir/message-r", obj.reason!!.coding[0].system))
        assertTrue(stringMatch("admit", obj.reason!!.coding[0].code))
        assertTrue(stringMatch("5015fe84-8e76-4526-89d8-44b32", obj.response!!.identifier))
        assertTrue(stringMatch("ok", obj.response!!.code))
        assertTrue(stringMatch("Patient/example", obj.focus[0].reference))
    }

    fun `messageheader-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
