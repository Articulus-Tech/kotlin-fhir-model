package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class AppointmentDataTest : DataTests() {
    @Test
    fun `appointment-example 357 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/appointment-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("booked", obj.status))
        assertTrue(stringMatch("http://example.org/service-ca", obj.serviceCategory!!.coding[0].system))
        assertTrue(stringMatch("gp", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("52", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("General Discussion", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/specialty", obj.specialty[0].coding[0].system))
        assertTrue(stringMatch("gp", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("General Practice", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/appointmen", obj.appointmentType!!.coding[0].system))
        assertTrue(stringMatch("follow", obj.appointmentType!!.coding[0].code))
        assertTrue(stringMatch("Followup", obj.appointmentType!!.coding[0].display))
        assertTrue(stringMatch("Condition/example", obj.indication[0].reference))
        assertTrue(stringMatch("Severe burn of left ear", obj.indication[0].display))
        assertEquals(5, obj.priority)
        assertTrue(stringMatch("Discussion on the results of ", obj.description))
        assertTrue(stringMatch("2013-12-10T09:00:00Z", obj.start))
        assertTrue(stringMatch("2013-12-10T11:00:00Z", obj.end))
        assertTrue(stringMatch("2013-10-10", obj.created))
        assertTrue(stringMatch("Further expand on the results", obj.comment))
        assertTrue(stringMatch("ReferralRequest/example", obj.incomingReferral[0].reference))
        assertTrue(stringMatch("Patient/example", obj.participant[0].actor!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.participant[0].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[0].required))
        assertTrue(stringMatch("accepted", obj.participant[0].status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.participant[1].type[0].coding[0].system))
        assertTrue(stringMatch("ATND", obj.participant[1].type[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/example", obj.participant[1].actor!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.participant[1].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[1].required))
        assertTrue(stringMatch("accepted", obj.participant[1].status))
        assertTrue(stringMatch("Location/1", obj.participant[2].actor!!.reference))
        assertTrue(stringMatch("South Wing, second floor", obj.participant[2].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[2].required))
        assertTrue(stringMatch("accepted", obj.participant[2].status))
    }

    fun `appointment-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `appointment-example-request 358 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/appointment-example-request.json").readTextAndClose()
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("examplereq", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/sampleappo", obj.identifier[0].system))
        assertTrue(stringMatch("123", obj.identifier[0].value))
        assertTrue(stringMatch("proposed", obj.status))
        assertTrue(stringMatch("http://example.org/service-ca", obj.serviceCategory!!.coding[0].system))
        assertTrue(stringMatch("gp", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("http://example.org/specialty", obj.specialty[0].coding[0].system))
        assertTrue(stringMatch("gp", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("General Practice", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/appointmen", obj.appointmentType!!.coding[0].system))
        assertTrue(stringMatch("wi", obj.appointmentType!!.coding[0].code))
        assertTrue(stringMatch("Walk in", obj.appointmentType!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("413095006", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("Clinical Review", obj.reason[0].text))
        assertEquals(5, obj.priority)
        assertTrue(stringMatch("Discussion on the results of ", obj.description))
        assertEquals(15, obj.minutesDuration)
        assertTrue(stringMatch("Slot/example", obj.slot[0].reference))
        assertTrue(stringMatch("2015-12-02", obj.created))
        assertTrue(stringMatch("Further expand on the results", obj.comment))
        assertTrue(stringMatch("Patient/example", obj.participant[0].actor!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.participant[0].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[0].required))
        assertTrue(stringMatch("needs-action", obj.participant[0].status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.participant[1].type[0].coding[0].system))
        assertTrue(stringMatch("ATND", obj.participant[1].type[0].coding[0].code))
        assertTrue(stringMatch("required", obj.participant[1].required))
        assertTrue(stringMatch("needs-action", obj.participant[1].status))
        assertTrue(stringMatch("Location/1", obj.participant[2].actor!!.reference))
        assertTrue(stringMatch("South Wing, second floor", obj.participant[2].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[2].required))
        assertTrue(stringMatch("accepted", obj.participant[2].status))
        assertTrue(stringMatch("2016-06-02", obj.requestedPeriod[0].start))
        assertTrue(stringMatch("2016-06-09", obj.requestedPeriod[0].end))
    }

    fun `appointment-example-request Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `appointment-example2doctors 359 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/appointment-example2doctors.json").readTextAndClose()
        val obj = mapper.fromJson(json, Appointment::class.java)
        assertTrue(stringMatch("Appointment", obj.resourceType))
        assertTrue(stringMatch("2docs", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("booked", obj.status))
        assertTrue(stringMatch("http://example.org/service-ca", obj.serviceCategory!!.coding[0].system))
        assertTrue(stringMatch("gp", obj.serviceCategory!!.coding[0].code))
        assertTrue(stringMatch("General Practice", obj.serviceCategory!!.coding[0].display))
        assertTrue(stringMatch("52", obj.serviceType[0].coding[0].code))
        assertTrue(stringMatch("General Discussion", obj.serviceType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/specialty", obj.specialty[0].coding[0].system))
        assertTrue(stringMatch("gp", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("General Practice", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/appointmen", obj.appointmentType!!.coding[0].system))
        assertTrue(stringMatch("wi", obj.appointmentType!!.coding[0].code))
        assertTrue(stringMatch("Walk in", obj.appointmentType!!.coding[0].display))
        assertEquals(5, obj.priority)
        assertTrue(stringMatch("Discussion about Peter Chalme", obj.description))
        assertTrue(stringMatch("DiagnosticReport/ultrasound", obj.supportingInformation[0].reference))
        assertTrue(stringMatch("2013-12-09T09:00:00Z", obj.start))
        assertTrue(stringMatch("2013-12-09T11:00:00Z", obj.end))
        assertTrue(stringMatch("Clarify the results of the MR", obj.comment))
        assertTrue(stringMatch("Patient/example", obj.participant[0].actor!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.participant[0].actor!!.display))
        assertTrue(stringMatch("information-only", obj.participant[0].required))
        assertTrue(stringMatch("accepted", obj.participant[0].status))
        assertTrue(stringMatch("Practitioner/example", obj.participant[1].actor!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.participant[1].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[1].required))
        assertTrue(stringMatch("accepted", obj.participant[1].status))
        assertTrue(stringMatch("Practitioner/f202", obj.participant[2].actor!!.reference))
        assertTrue(stringMatch("Luigi Maas", obj.participant[2].actor!!.display))
        assertTrue(stringMatch("required", obj.participant[2].required))
        assertTrue(stringMatch("accepted", obj.participant[2].status))
        assertTrue(stringMatch("Phone Call", obj.participant[3].actor!!.display))
        assertTrue(stringMatch("information-only", obj.participant[3].required))
        assertTrue(stringMatch("accepted", obj.participant[3].status))
    }

    fun `appointment-example2doctors Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
