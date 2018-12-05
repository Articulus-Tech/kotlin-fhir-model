package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EnrollmentRequestDataTest : DataTests() {
    @Test
    fun `enrollmentrequest-example 580 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/enrollmentrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EnrollmentRequest::class.java)
        assertTrue(stringMatch("EnrollmentRequest", obj.resourceType))
        assertTrue(stringMatch("22345", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/enroll", obj.identifier[0].system))
        assertTrue(stringMatch("EN22345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("Patient/1", obj.subject!!.reference))
        assertTrue(stringMatch("Coverage/9876B1", obj.coverage!!.reference))
    }

    fun `enrollmentrequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
