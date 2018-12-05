package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ReferralRequestDataTest : DataTests() {
    @Test
    fun `referralrequest-example 448 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/referralrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ReferralRequest::class.java)
        assertTrue(stringMatch("ReferralRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://orionhealth.com/fhir/a", obj.identifier[0].system))
        assertTrue(stringMatch("ret4421", obj.identifier[0].value))
        assertTrue(stringMatch("Protocol for insertion of tym", obj.definition[0].display))
        assertTrue(stringMatch("ProcedureRequest for Myringot", obj.basedOn[0].display))
        assertTrue(stringMatch("prior ReferralRequest", obj.replaces[0].display))
        assertTrue(stringMatch("1234", obj.groupIdentifier!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("103696004", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Patient referral to specialis", obj.type!!.coding[0].display))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("http://snomed.info/sct", obj.serviceRequested[0].coding[0].system))
        assertTrue(stringMatch("172676009", obj.serviceRequested[0].coding[0].code))
        assertTrue(stringMatch("Myringotomy and insertion of ", obj.serviceRequested[0].coding[0].display))
        assertTrue(stringMatch("Insertion of grommets", obj.serviceRequested[0].text))
        assertTrue(stringMatch("https://fhir.orionhealth.com/", obj.subject.reference))
        assertTrue(stringMatch("Beverly Weaver", obj.subject.display))
        assertTrue(stringMatch("Beverly Waver's encounter on ", obj.context!!.display))
        assertTrue(stringMatch("2014-03-14", obj.occurrencePeriod!!.end))
        assertTrue(stringMatch("2014-02-14", obj.authoredOn))
        assertTrue(stringMatch("https://fhir.orionhealth.com/", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Serena Shrink", obj.requester!!.agent.display))
        assertTrue(stringMatch("http://orionhealth.com/fhir/a", obj.specialty!!.coding[0].system))
        assertTrue(stringMatch("ent", obj.specialty!!.coding[0].code))
        assertTrue(stringMatch("ENT", obj.specialty!!.coding[0].display))
        assertTrue(stringMatch("https://fhir.orionhealth.com/", obj.recipient[0].reference))
        assertTrue(stringMatch("Dr Dave", obj.recipient[0].display))
        assertTrue(stringMatch("For consideration of Grommets", obj.reasonCode[0].text))
        assertTrue(stringMatch("In the past 2 years Beverly h", obj.description))
    }

    fun `referralrequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
