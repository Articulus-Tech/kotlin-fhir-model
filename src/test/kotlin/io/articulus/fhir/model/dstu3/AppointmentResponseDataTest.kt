package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class AppointmentResponseDataTest : DataTests() {
    @Test
    fun `appointmentresponse-example-req 321 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/appointmentresponse-example-req.json").readTextAndClose()
        val obj = mapper.fromJson(json, AppointmentResponse::class.java)
        assertTrue(stringMatch("AppointmentResponse", obj.resourceType))
        assertTrue(stringMatch("exampleresp", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/sampleappo", obj.identifier[0].system))
        assertTrue(stringMatch("response123", obj.identifier[0].value))
        assertTrue(stringMatch("Appointment/examplereq", obj.appointment.reference))
        assertTrue(stringMatch("Brian MRI results discussion", obj.appointment.display))
        assertTrue(stringMatch("2013-12-25T13:15:00Z", obj.start))
        assertTrue(stringMatch("2013-12-25T13:30:00Z", obj.end))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.participantType[0].coding[0].system))
        assertTrue(stringMatch("ATND", obj.participantType[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/example", obj.actor!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.actor!!.display))
        assertTrue(stringMatch("tentative", obj.participantStatus))
        assertTrue(stringMatch("can't we try for this time, c", obj.comment))
    }

    fun `appointmentresponse-example-req Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `appointmentresponse-example 322 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/appointmentresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, AppointmentResponse::class.java)
        assertTrue(stringMatch("AppointmentResponse", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Appointment/example", obj.appointment.reference))
        assertTrue(stringMatch("Brian MRI results discussion", obj.appointment.display))
        assertTrue(stringMatch("Patient/example", obj.actor!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.actor!!.display))
        assertTrue(stringMatch("accepted", obj.participantStatus))
    }

    fun `appointmentresponse-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
