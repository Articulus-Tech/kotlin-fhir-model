package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DeviceMetricDataTest : DataTests() {
    @Test
    fun `devicemetric-example 369 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/devicemetric-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DeviceMetric::class.java)
        assertTrue(stringMatch("DeviceMetric", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodcare.org/devicemet", obj.identifier.system))
        assertTrue(stringMatch("345675", obj.identifier.value))
        assertTrue(stringMatch("https://rtmms.nist.gov", obj.type.coding[0].system))
        assertTrue(stringMatch("150456", obj.type.coding[0].code))
        assertTrue(stringMatch("MDC_PULS_OXIM_SAT_O2", obj.type.coding[0].display))
        assertTrue(stringMatch("https://rtmms.nist.gov", obj.unit!!.coding[0].system))
        assertTrue(stringMatch("262688", obj.unit!!.coding[0].code))
        assertTrue(stringMatch("MDC_DIM_PERCENT", obj.unit!!.coding[0].display))
        assertTrue(stringMatch("Device/dev1", obj.source!!.reference))
        assertTrue(stringMatch("DeviceComponent/dc102", obj.parent!!.reference))
        assertTrue(stringMatch("on", obj.operationalStatus))
        assertTrue(stringMatch("blue", obj.color))
        assertTrue(stringMatch("measurement", obj.category))
        assertEquals(1, obj.measurementPeriod!!.repeat!!.frequency)
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.measurementPeriod!!.repeat!!.period)))
        assertTrue(stringMatch("s", obj.measurementPeriod!!.repeat!!.periodUnit))
        assertTrue(stringMatch("two-point", obj.calibration[0].type))
        assertTrue(stringMatch("calibrated", obj.calibration[0].state))
        assertTrue(stringMatch("2016-12-28T09:03:04-05:00", obj.calibration[0].time))
    }

    fun `devicemetric-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
