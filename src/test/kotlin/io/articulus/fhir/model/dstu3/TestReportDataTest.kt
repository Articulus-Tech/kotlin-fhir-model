package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class TestReportDataTest : DataTests() {
    @Test
    fun `testreport-example 5 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/testreport-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, TestReport::class.java)
        assertTrue(stringMatch("TestReport", obj.resourceType))
        assertTrue(stringMatch("testreport-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier!!.system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier!!.value))
        assertTrue(stringMatch("TestReport Example for TestSc", obj.name))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("TestScript/testscript-example", obj.testScript.reference))
        assertTrue(stringMatch("pass", obj.result))
        assertTrue(stringMatch("%.2f".format(100.0f), "%.2f".format(obj.score)))
        assertTrue(stringMatch("HL7 Execution Engine", obj.tester))
        assertTrue(stringMatch("2016-10-07T08:25:34-05:00", obj.issued))
        assertTrue(stringMatch("test-engine", obj.participant[0].type))
        assertTrue(stringMatch("http://projectcrucible.org", obj.participant[0].uri))
        assertTrue(stringMatch("Crucible", obj.participant[0].display))
        assertTrue(stringMatch("server", obj.participant[1].type))
        assertTrue(stringMatch("http://fhir3.healthintersecti", obj.participant[1].uri))
        assertTrue(stringMatch("HealthIntersections STU3", obj.participant[1].display))
        assertTrue(stringMatch("pass", obj.setup!!.action[0].operation!!.result))
        assertTrue(stringMatch("DELETE Patient", obj.setup!!.action[0].operation!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.setup!!.action[0].operation!!.detail))
        assertTrue(stringMatch("pass", obj.setup!!.action[1].assert_fhir!!.result))
        assertTrue(stringMatch("HTTP 204", obj.setup!!.action[1].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.setup!!.action[1].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.setup!!.action[2].operation!!.result))
        assertTrue(stringMatch("POST Patient/fixture-patient-", obj.setup!!.action[2].operation!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.setup!!.action[2].operation!!.detail))
        assertTrue(stringMatch("pass", obj.setup!!.action[3].assert_fhir!!.result))
        assertTrue(stringMatch("HTTP 201", obj.setup!!.action[3].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.setup!!.action[3].assert_fhir!!.detail))
        assertTrue(stringMatch("01-ReadPatient", obj.test[0].id))
        assertTrue(stringMatch("Read Patient", obj.test[0].name))
        assertTrue(stringMatch("Read a Patient and validate r", obj.test[0].description))
        assertTrue(stringMatch("pass", obj.test[0].action[0].operation!!.result))
        assertTrue(stringMatch("GET Patient/fixture-patient-c", obj.test[0].action[0].operation!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[0].operation!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[1].assert_fhir!!.result))
        assertTrue(stringMatch("HTTP 200", obj.test[0].action[1].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[1].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[2].assert_fhir!!.result))
        assertTrue(stringMatch("Last-Modified Present", obj.test[0].action[2].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[2].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[3].assert_fhir!!.result))
        assertTrue(stringMatch("Response is Patient", obj.test[0].action[3].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[3].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[4].assert_fhir!!.result))
        assertTrue(stringMatch("Response validates", obj.test[0].action[4].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[4].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[5].assert_fhir!!.result))
        assertTrue(stringMatch("Patient.name.family 'Chalmers", obj.test[0].action[5].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[5].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[6].assert_fhir!!.result))
        assertTrue(stringMatch("Patient.name.given 'Peter'", obj.test[0].action[6].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[6].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[7].assert_fhir!!.result))
        assertTrue(stringMatch("Patient.name.family 'Chalmers", obj.test[0].action[7].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[7].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[8].assert_fhir!!.result))
        assertTrue(stringMatch("Patient.name.family 'Chalmers", obj.test[0].action[8].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[8].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.test[0].action[9].assert_fhir!!.result))
        assertTrue(stringMatch("Patient expected values.", obj.test[0].action[9].assert_fhir!!.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.test[0].action[9].assert_fhir!!.detail))
        assertTrue(stringMatch("pass", obj.teardown!!.action[0].operation.result))
        assertTrue(stringMatch("DELETE Patient/fixture-patien", obj.teardown!!.action[0].operation.message))
        assertTrue(stringMatch("http://projectcrucible.org/pe", obj.teardown!!.action[0].operation.detail))
    }

    fun `testreport-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
