package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ParametersDataTest : DataTests() {
    @Test
    fun `parameters-example 355 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/parameters-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Parameters::class.java)
        assertTrue(stringMatch("Parameters", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("start", obj.parameter[0].name))
        assertTrue(stringMatch("2010-01-01", obj.parameter[0].valueDate))
        assertTrue(stringMatch("end", obj.parameter[1].name))
        assertTrue(stringMatch("Binary", (obj.parameter[1].resource!! as Binary).resourceType))
        assertTrue(stringMatch("text/plain", (obj.parameter[1].resource!! as Binary).contentType))
        assertTrue(stringMatch("VGhpcyBpcyBhIHRlc3QgZXhhbXBsZ", (obj.parameter[1].resource!! as Binary).content))
    }

    fun `parameters-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
