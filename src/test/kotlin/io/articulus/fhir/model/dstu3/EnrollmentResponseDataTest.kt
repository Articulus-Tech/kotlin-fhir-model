package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EnrollmentResponseDataTest : DataTests() {
    @Test
    fun `enrollmentresponse-example 550 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/enrollmentresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, EnrollmentResponse::class.java)
        assertTrue(stringMatch("EnrollmentResponse", obj.resourceType))
        assertTrue(stringMatch("ER2500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("781234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Dependant added to policy.", obj.disposition))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
    }

    fun `enrollmentresponse-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
