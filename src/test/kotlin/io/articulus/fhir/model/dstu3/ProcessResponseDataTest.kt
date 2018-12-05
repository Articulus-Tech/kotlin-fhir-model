package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProcessResponseDataTest : DataTests() {
    @Test
    fun `processresponse-example 405 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("881234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
        assertTrue(stringMatch("http://happyvalley.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/processou", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Adjudication processing compl", obj.disposition))
        assertTrue(stringMatch("Organization/1", obj.requestOrganization!!.reference))
    }

    fun `processresponse-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processresponse-example-error 406 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processresponse-example-error.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2349", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("ER987634", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-07-14", obj.created))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
        assertTrue(stringMatch("http://happyvalley.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/processou", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("error", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Referred to claim not found o", obj.disposition))
        assertTrue(stringMatch("http://npid.org/providerid", obj.requestProvider!!.identifier!!.system))
        assertTrue(stringMatch("AZ43258", obj.requestProvider!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.requestOrganization!!.reference))
        assertTrue(stringMatch("http://ncforms.org/formid", obj.form!!.coding[0].system))
        assertTrue(stringMatch("PRRESP/2016/01", obj.form!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/note-type", obj.processNote[0].type!!.coding[0].system))
        assertTrue(stringMatch("print", obj.processNote[0].type!!.coding[0].code))
        assertTrue(stringMatch("Please check the submitted pa", obj.processNote[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/adjudicat", obj.error[0].coding[0].system))
        assertTrue(stringMatch("a001", obj.error[0].coding[0].code))
    }

    fun `processresponse-example-error Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processresponse-example-pended 407 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processresponse-example-pended.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessResponse::class.java)
        assertTrue(stringMatch("ProcessResponse", obj.resourceType))
        assertTrue(stringMatch("SR2499", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("CommunicationRequest", (obj.contained[0] as CommunicationRequest).resourceType))
        assertTrue(stringMatch("comreq-1", (obj.contained[0] as CommunicationRequest).id))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", (obj.contained[0] as CommunicationRequest).identifier[0].system))
        assertTrue(stringMatch("ABC123", (obj.contained[0] as CommunicationRequest).identifier[0].value))
        assertTrue(stringMatch("active", (obj.contained[0] as CommunicationRequest).status))
        assertTrue(stringMatch("http://acme.org/messagetypes", (obj.contained[0] as CommunicationRequest).category[0].coding[0].system))
        assertTrue(stringMatch("SolicitedAttachmentRequest", (obj.contained[0] as CommunicationRequest).category[0].coding[0].code))
        assertTrue(stringMatch("http://www.jurisdiction.com/p", (obj.contained[0] as CommunicationRequest).recipient[0].identifier!!.system))
        assertTrue(stringMatch("3456", (obj.contained[0] as CommunicationRequest).recipient[0].identifier!!.value))
        assertTrue(stringMatch("Please provide the accident r", (obj.contained[0] as CommunicationRequest).payload[0].contentString))
        assertTrue(stringMatch("2016-06-10T11:01:10-08:00", (obj.contained[0] as CommunicationRequest).authoredOn))
        assertTrue(stringMatch("http://www.jurisdiction.com/i", (obj.contained[0] as CommunicationRequest).sender!!.identifier!!.system))
        assertTrue(stringMatch("123456", (obj.contained[0] as CommunicationRequest).sender!!.identifier!!.value))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("881222", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
        assertTrue(stringMatch("http://happyvalley.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/processou", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("pended", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Additional information requir", obj.disposition))
        assertTrue(stringMatch("Organization/1", obj.requestOrganization!!.reference))
        assertTrue(stringMatch("#comreq-1", obj.communicationRequest[0].reference))
    }

    fun `processresponse-example-pended Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
