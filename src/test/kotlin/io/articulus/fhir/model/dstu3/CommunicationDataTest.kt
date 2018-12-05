package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CommunicationDataTest : DataTests() {
    @Test
    fun `communication-example-fm-attachment 507 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communication-example-fm-attachment.json").readTextAndClose()
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("fm-attachment", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.providerco.com/com", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://acme.org/messagetypes", obj.category[0].coding[0].system))
        assertTrue(stringMatch("SolicitedAttachment", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Patient/1", obj.subject!!.reference))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", obj.recipient[0].identifier!!.system))
        assertTrue(stringMatch("123456", obj.recipient[0].identifier!!.value))
        assertTrue(stringMatch("http://happyvalley.com/claim", obj.topic[0].identifier!!.system))
        assertTrue(stringMatch("12345", obj.topic[0].identifier!!.value))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.topic[1].identifier!!.system))
        assertTrue(stringMatch("R3500", obj.topic[1].identifier!!.value))
        assertTrue(stringMatch("2016-06-12T18:01:10-08:00", obj.sent))
        assertTrue(stringMatch("http://www.jurisdiction.com/p", obj.sender!!.identifier!!.system))
        assertTrue(stringMatch("3456", obj.sender!!.identifier!!.value))
        assertTrue(stringMatch("application/pdf", obj.payload[0].contentAttachment.contentType))
        assertTrue(stringMatch("SGVsbG8=", obj.payload[0].contentAttachment.data))
        assertTrue(stringMatch("accident notes 20100201.pdf", obj.payload[0].contentAttachment.title))
        assertTrue(stringMatch("2010-02-01T11:50:23-05:00", obj.payload[0].contentAttachment.creation))
        assertTrue(stringMatch("application/pdf", obj.payload[1].contentAttachment.contentType))
        assertTrue(stringMatch("http://happyvalley.com/docs/A", obj.payload[1].contentAttachment.url))
        assertEquals(104274, obj.payload[1].contentAttachment.size)
        assertTrue(stringMatch("SGVsbG8gdGhlcmU=", obj.payload[1].contentAttachment.hash))
        assertTrue(stringMatch("2010-02-01T10:57:34+01:00", obj.payload[1].contentAttachment.creation))
    }

    fun `communication-example-fm-attachment Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `communication-example-fm-solicited-attachment 508 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communication-example-fm-solicited-attachment.json").readTextAndClose()
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("fm-solicited", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("provider", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/p", (obj.contained[0] as Organization).identifier[0].system))
        assertTrue(stringMatch("3456", (obj.contained[0] as Organization).identifier[0].value))
        assertTrue(stringMatch("Organization", (obj.contained[1] as Organization).resourceType))
        assertTrue(stringMatch("payor", (obj.contained[1] as Organization).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", (obj.contained[1] as Organization).identifier[0].system))
        assertTrue(stringMatch("123456", (obj.contained[1] as Organization).identifier[0].value))
        assertTrue(stringMatch("CommunicationRequest", (obj.contained[2] as CommunicationRequest).resourceType))
        assertTrue(stringMatch("request", (obj.contained[2] as CommunicationRequest).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", (obj.contained[2] as CommunicationRequest).identifier[0].system))
        assertTrue(stringMatch("ABC123", (obj.contained[2] as CommunicationRequest).identifier[0].value))
        assertTrue(stringMatch("completed", (obj.contained[2] as CommunicationRequest).status))
        assertTrue(stringMatch("Patient/1", (obj.contained[2] as CommunicationRequest).subject!!.reference))
        assertTrue(stringMatch("http://www.providerco.com/com", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("#request", obj.basedOn[0].reference))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://acme.org/messagetypes", obj.category[0].coding[0].system))
        assertTrue(stringMatch("SolicitedAttachment", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Patient/1", obj.subject!!.reference))
        assertTrue(stringMatch("#payor", obj.recipient[0].reference))
        assertTrue(stringMatch("2016-06-12T18:01:10-08:00", obj.sent))
        assertTrue(stringMatch("#provider", obj.sender!!.reference))
        assertTrue(stringMatch("application/pdf", obj.payload[0].contentAttachment.contentType))
        assertTrue(stringMatch("SGVsbG8=", obj.payload[0].contentAttachment.data))
        assertTrue(stringMatch("accident notes 20100201.pdf", obj.payload[0].contentAttachment.title))
        assertTrue(stringMatch("2010-02-01T11:50:23-05:00", obj.payload[0].contentAttachment.creation))
        assertTrue(stringMatch("application/pdf", obj.payload[1].contentAttachment.contentType))
        assertTrue(stringMatch("http://happyvalley.com/docs/A", obj.payload[1].contentAttachment.url))
        assertEquals(104274, obj.payload[1].contentAttachment.size)
        assertTrue(stringMatch("SGVsbG8gdGhlcmU=", obj.payload[1].contentAttachment.hash))
        assertTrue(stringMatch("2010-02-01T10:57:34+01:00", obj.payload[1].contentAttachment.creation))
    }

    fun `communication-example-fm-solicited-attachment Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `communication-example 509 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communication-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Communication::class.java)
        assertTrue(stringMatch("Communication", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Paging System", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:1.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("2345678901", obj.identifier[0].value))
        assertTrue(stringMatch("Hyperkalemia", obj.definition[0].display))
        assertTrue(stringMatch("Serum Potassium Observation", obj.partOf[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://acme.org/messagetypes", obj.category[0].coding[0].system))
        assertTrue(stringMatch("Alert", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Alert", obj.category[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.medium[0].coding[0].system))
        assertTrue(stringMatch("WRITTEN", obj.medium[0].coding[0].code))
        assertTrue(stringMatch("written", obj.medium[0].coding[0].display))
        assertTrue(stringMatch("written", obj.medium[0].text))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Practitioner/example", obj.recipient[0].reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2014-12-12T18:01:10-08:00", obj.sent))
        assertTrue(stringMatch("2014-12-12T18:01:11-08:00", obj.received))
        assertTrue(stringMatch("Device/f001", obj.sender!!.reference))
        assertTrue(stringMatch("Patient 1 has a very high ser", obj.payload[0].contentString))
        assertTrue(stringMatch("Serum Potassium Observation", obj.payload[1].contentReference.display))
    }

    fun `communication-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
