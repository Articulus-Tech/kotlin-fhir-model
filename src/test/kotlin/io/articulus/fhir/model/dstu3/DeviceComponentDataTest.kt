package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DeviceComponentDataTest : DataTests() {
    @Test
    fun `devicecomponent-example 517 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/devicecomponent-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceComponent::class.java)
        assertTrue(stringMatch("DeviceComponent", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("0", obj.identifier.value))
        assertTrue(stringMatch("urn:iso:std:iso:11073:10101", obj.type.coding[0].system))
        assertTrue(stringMatch("2000", obj.type.coding[0].code))
        assertTrue(stringMatch("MDC_DEV_ANALY_SAT_O2_MDS", obj.type.coding[0].display))
        assertTrue(stringMatch("2014-10-07T14:45:00Z", obj.lastSystemChange))
        assertTrue(stringMatch("Device/d1", obj.source!!.reference))
        assertTrue(stringMatch("DeviceComponent/dc1", obj.parent!!.reference))
        assertTrue(stringMatch("urn:iso:std:iso:11073:10101", obj.operationalStatus[0].coding[0].system))
        assertTrue(stringMatch("off", obj.operationalStatus[0].coding[0].code))
        assertTrue(stringMatch("Off", obj.operationalStatus[0].coding[0].display))
        assertTrue(stringMatch("urn:iso:std:iso:11073:10101", obj.parameterGroup!!.coding[0].system))
        assertTrue(stringMatch("miscellaneous", obj.parameterGroup!!.coding[0].code))
        assertTrue(stringMatch("Miscellaneous Parameter Group", obj.parameterGroup!!.coding[0].display))
        assertTrue(stringMatch("optical", obj.measurementPrinciple))
        assertTrue(stringMatch("http://tools.ietf.org/html/bc", obj.languageCode!!.coding[0].system))
        assertTrue(stringMatch("en-US", obj.languageCode!!.coding[0].code))
    }

    fun `devicecomponent-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `devicecomponent-example-prodspec 518 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/devicecomponent-example-prodspec.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceComponent::class.java)
        assertTrue(stringMatch("DeviceComponent", obj.resourceType))
        assertTrue(stringMatch("example-prodspec", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("789123", obj.identifier.value))
        assertTrue(stringMatch("urn:iso:std:iso:11073:10101", obj.type.coding[0].system))
        assertTrue(stringMatch("2000", obj.type.coding[0].code))
        assertTrue(stringMatch("MDC_DEV_ANALY_SAT_O2_MDS", obj.type.coding[0].display))
        assertTrue(stringMatch("2014-10-07T14:45:00Z", obj.lastSystemChange))
        assertTrue(stringMatch("Device/d1", obj.source!!.reference))
        assertTrue(stringMatch("off", obj.operationalStatus[0].coding[0].code))
        assertTrue(stringMatch("Off", obj.operationalStatus[0].coding[0].display))
        assertTrue(stringMatch("serial-number", obj.productionSpecification[0].specType!!.coding[0].code))
        assertTrue(stringMatch("Serial number", obj.productionSpecification[0].specType!!.coding[0].display))
        assertTrue(stringMatch("xa-12324-b", obj.productionSpecification[0].productionSpec))
        assertTrue(stringMatch("hardware-revision", obj.productionSpecification[1].specType!!.coding[0].code))
        assertTrue(stringMatch("Hardware Revision", obj.productionSpecification[1].specType!!.coding[0].display))
        assertTrue(stringMatch("1.1", obj.productionSpecification[1].productionSpec))
        assertTrue(stringMatch("software-revision", obj.productionSpecification[2].specType!!.coding[0].code))
        assertTrue(stringMatch("Software Revision", obj.productionSpecification[2].specType!!.coding[0].display))
        assertTrue(stringMatch("1.12", obj.productionSpecification[2].productionSpec))
        assertTrue(stringMatch("firmware-revision", obj.productionSpecification[3].specType!!.coding[0].code))
        assertTrue(stringMatch("Firmware Revision", obj.productionSpecification[3].specType!!.coding[0].display))
        assertTrue(stringMatch("1.0.23", obj.productionSpecification[3].productionSpec))
        assertTrue(stringMatch("http://tools.ietf.org/html/bc", obj.languageCode!!.coding[0].system))
        assertTrue(stringMatch("en-US", obj.languageCode!!.coding[0].code))
    }

    fun `devicecomponent-example-prodspec Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
