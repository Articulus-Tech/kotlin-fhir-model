package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SubscriptionDataTest : DataTests() {
    @Test
    fun `subscription-example-error 558 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/subscription-example-error.json").readTextAndClose()
        val obj = mapper.fromJson(json, Subscription::class.java)
        assertTrue(stringMatch("Subscription", obj.resourceType))
        assertTrue(stringMatch("example-error", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("error", obj.status))
        assertTrue(stringMatch("phone", obj.contact[0].system))
        assertTrue(stringMatch("ext 4123", obj.contact[0].value))
        assertTrue(stringMatch("2021-01-01T00:00:00Z", obj.end))
        assertTrue(stringMatch("Monitor new neonatal function", obj.reason))
        assertTrue(stringMatch("Observation?code=http://loinc", obj.criteria))
        assertTrue(stringMatch("Socket Error 10060 - can't co", obj.error))
        assertTrue(stringMatch("rest-hook", obj.channel.type))
        assertTrue(stringMatch("https://biliwatch.com/custome", obj.channel.endpoint))
        assertTrue(stringMatch("application/fhir+json", obj.channel.payload))
        assertTrue(stringMatch("Authorization: Bearer secret-", obj.channel.header[0]))
        assertTrue(stringMatch("http://example.org/fhir/cs/in", obj.tag[0].system))
        assertTrue(stringMatch("bili-done", obj.tag[0].code))
    }

    fun `subscription-example-error Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `subscription-example 559 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/subscription-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Subscription::class.java)
        assertTrue(stringMatch("Subscription", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("requested", obj.status))
        assertTrue(stringMatch("phone", obj.contact[0].system))
        assertTrue(stringMatch("ext 4123", obj.contact[0].value))
        assertTrue(stringMatch("2021-01-01T00:00:00Z", obj.end))
        assertTrue(stringMatch("Monitor new neonatal function", obj.reason))
        assertTrue(stringMatch("Observation?code=http://loinc", obj.criteria))
        assertTrue(stringMatch("rest-hook", obj.channel.type))
        assertTrue(stringMatch("https://biliwatch.com/custome", obj.channel.endpoint))
        assertTrue(stringMatch("application/fhir+json", obj.channel.payload))
        assertTrue(stringMatch("Authorization: Bearer secret-", obj.channel.header[0]))
        assertTrue(stringMatch("http://example.org/fhir/cs/in", obj.tag[0].system))
        assertTrue(stringMatch("bili-done", obj.tag[0].code))
    }

    fun `subscription-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
