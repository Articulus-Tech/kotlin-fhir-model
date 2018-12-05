package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class OperationOutcomeDataTest : DataTests() {
    @Test
    fun `operationoutcome-example-validationfail 327 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example-validationfail.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("validationfail", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("error", obj.issue[0].severity))
        assertTrue(stringMatch("structure", obj.issue[0].code))
        assertTrue(stringMatch("Error parsing resource XML (U", obj.issue[0].details!!.text))
        assertTrue(stringMatch("/f:Patient/f:identifier", obj.issue[0].location[0]))
        assertTrue(stringMatch("Patient.identifier", obj.issue[0].expression[0]))
    }

    fun `operationoutcome-example-validationfail Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `operationoutcome-example-break-the-glass 328 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example-break-the-glass.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("break-the-glass", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("information", obj.issue[0].severity))
        assertTrue(stringMatch("suppressed", obj.issue[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.issue[0].details!!.coding[0].system))
        assertTrue(stringMatch("ETREAT", obj.issue[0].details!!.coding[0].code))
        assertTrue(stringMatch("Emergency Treatment", obj.issue[0].details!!.coding[0].display))
        assertTrue(stringMatch("Additional information may be", obj.issue[0].details!!.text))
    }

    fun `operationoutcome-example-break-the-glass Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `operationoutcome-example-searchfail 329 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example-searchfail.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("searchfail", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("fatal", obj.issue[0].severity))
        assertTrue(stringMatch("code-invalid", obj.issue[0].code))
        assertTrue(stringMatch("The \"name\" parameter has the ", obj.issue[0].details!!.text))
        assertTrue(stringMatch("http.name:exact", obj.issue[0].location[0]))
    }

    fun `operationoutcome-example-searchfail Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `operationoutcome-example-exception 330 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example-exception.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("exception", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("error", obj.issue[0].severity))
        assertTrue(stringMatch("exception", obj.issue[0].code))
        assertTrue(stringMatch("SQL Link Communication Error ", obj.issue[0].details!!.text))
    }

    fun `operationoutcome-example-exception Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `operationoutcome-example 331 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("error", obj.issue[0].severity))
        assertTrue(stringMatch("code-invalid", obj.issue[0].code))
        assertTrue(stringMatch("The code \"W\" is not known and", obj.issue[0].details!!.text))
        assertTrue(stringMatch("Acme.Interop.FHIRProcessors.P", obj.issue[0].diagnostics))
        assertTrue(stringMatch("/f:Person/f:gender", obj.issue[0].location[0]))
        assertTrue(stringMatch("Person.gender", obj.issue[0].expression[0]))
    }

    fun `operationoutcome-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `operationoutcome-example-allok 332 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationoutcome-example-allok.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationOutcome::class.java)
        assertTrue(stringMatch("OperationOutcome", obj.resourceType))
        assertTrue(stringMatch("allok", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("information", obj.issue[0].severity))
        assertTrue(stringMatch("informational", obj.issue[0].code))
        assertTrue(stringMatch("All OK", obj.issue[0].details!!.text))
    }

    fun `operationoutcome-example-allok Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
