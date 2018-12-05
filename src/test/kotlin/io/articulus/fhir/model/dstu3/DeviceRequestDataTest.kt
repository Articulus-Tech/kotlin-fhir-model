package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DeviceRequestDataTest : DataTests() {
    @Test
    fun `devicerequest-example-insulinpump 388 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/devicerequest-example-insulinpump.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceRequest::class.java)
        assertTrue(stringMatch("DeviceRequest", obj.resourceType))
        assertTrue(stringMatch("insulinpump", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("ip_request1.1", obj.identifier[0].value))
        assertTrue(stringMatch("DM ambulatory protocol II", obj.definition[0].display))
        assertTrue(stringMatch("Homecare - DM follow-up", obj.basedOn[0].display))
        assertTrue(stringMatch("CGM ambulatory", obj.priorRequest[0].display))
        assertTrue(stringMatch("ip_request1", obj.groupIdentifier!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("instance-order", obj.intent.text))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("http://loinc.org", obj.codeCodeableConcept.coding[0].system))
        assertTrue(stringMatch("43148-6", obj.codeCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Insulin delivery device panel", obj.codeCodeableConcept.text))
        assertTrue(stringMatch("Patient/dicom", obj.subject.reference))
        assertTrue(stringMatch("Encounter 1", obj.context!!.display))
        assertTrue(stringMatch("2013-05-08T09:33:27+07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("2013-05-08T09:33:27+07:00", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Adam Careful", obj.requester!!.agent.display))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.requester!!.onBehalfOf!!.reference))
        assertTrue(stringMatch("Qualified nurse", obj.performerType!!.coding[0].display))
        assertTrue(stringMatch("Nurse", obj.performerType!!.text))
        assertTrue(stringMatch("Nurse Rossignol", obj.performer!!.display))
        assertTrue(stringMatch("gastroparesis", obj.reasonCode[0].text))
        assertTrue(stringMatch("Gastroparesis", obj.reasonReference[0].display))
        assertTrue(stringMatch("Previous results", obj.supportingInfo[0].display))
        assertTrue(stringMatch("this is the right device bran", obj.note[0].text))
        assertTrue(stringMatch("Request for unspecified devic", obj.relevantHistory[0].display))
    }

    fun `devicerequest-example-insulinpump Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `devicerequest-example 389 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/devicerequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceRequest::class.java)
        assertTrue(stringMatch("DeviceRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("original-order", obj.intent.coding[0].code))
        assertTrue(stringMatch("Device/example", obj.codeReference.reference))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
    }

    fun `devicerequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
