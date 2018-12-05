package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DeviceUseStatementDataTest : DataTests() {
    @Test
    fun `deviceusestatement-example 574 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/deviceusestatement-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceUseStatement::class.java)
        assertTrue(stringMatch("DeviceUseStatement", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http:goodhealth.org/identifie", obj.identifier[0].system))
        assertTrue(stringMatch("51ebb7a9-4e3a-4360-9a05-0cc2d", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Device/example", obj.device.reference))
    }

    fun `deviceusestatement-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
