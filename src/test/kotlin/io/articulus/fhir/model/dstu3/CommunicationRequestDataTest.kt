package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CommunicationRequestDataTest : DataTests() {
    @Test
    fun `communicationrequest-example 469 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communicationrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, CommunicationRequest::class.java)
        assertTrue(stringMatch("CommunicationRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
    }

    fun `communicationrequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `communicationrequest-example-fm-solicit-attachment 470 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communicationrequest-example-fm-solicit-attachment.json").readTextAndClose()
        val obj = mapper.fromJson(json, CommunicationRequest::class.java)
        assertTrue(stringMatch("CommunicationRequest", obj.resourceType))
        assertTrue(stringMatch("fm-solicit", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
    }

    @Test
    fun `communicationrequest-example-fm-solicit-attachment 471 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/communicationrequest-example-fm-solicit-attachment.json").readTextAndClose()
        val obj = mapper.fromJson(json, CommunicationRequest::class.java)
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("provider", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/p", (obj.contained[0] as Organization).identifier[0].system))
        assertTrue(stringMatch("3456", (obj.contained[0] as Organization).identifier[0].value))
        assertTrue(stringMatch("Organization", (obj.contained[1] as Organization).resourceType))
        assertTrue(stringMatch("payor", (obj.contained[1] as Organization).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", (obj.contained[1] as Organization).identifier[0].system))
        assertTrue(stringMatch("123456", (obj.contained[1] as Organization).identifier[0].value))
        assertTrue(stringMatch("Practitioner", (obj.contained[2] as Practitioner).resourceType))
        assertTrue(stringMatch("requester", (obj.contained[2] as Practitioner).id))
        assertTrue(stringMatch("6789", (obj.contained[2] as Practitioner).identifier[0].value))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", obj.identifier[0].system))
        assertTrue(stringMatch("ABC123", obj.identifier[0].value))
        assertTrue(stringMatch("EligibilityRequest", obj.basedOn[0].display))
        assertTrue(stringMatch("prior CommunicationRequest", obj.replaces[0].display))
        assertTrue(stringMatch("12345", obj.groupIdentifier!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://acme.org/messagetypes", obj.category[0].coding[0].system))
        assertTrue(stringMatch("SolicitedAttachmentRequest", obj.category[0].coding[0].code))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.medium[0].coding[0].system))
        assertTrue(stringMatch("WRITTEN", obj.medium[0].coding[0].code))
        assertTrue(stringMatch("written", obj.medium[0].coding[0].display))
        assertTrue(stringMatch("written", obj.medium[0].text))
        assertTrue(stringMatch("#provider", obj.recipient[0].reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("Please provide the accident r", obj.payload[0].contentString))
        assertTrue(stringMatch("2016-06-10T11:01:10-08:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("2016-06-10T11:01:10-08:00", obj.authoredOn))
        assertTrue(stringMatch("#payor", obj.sender!!.reference))
        assertTrue(stringMatch("#requester", obj.requester!!.agent.reference))
    }

    fun `communicationrequest-example-fm-solicit-attachment Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
