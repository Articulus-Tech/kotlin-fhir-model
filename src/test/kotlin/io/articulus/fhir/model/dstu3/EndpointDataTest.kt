package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EndpointDataTest : DataTests() {
    @Test
    fun `endpoint-example-iid 415 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/endpoint-example-iid.json").readTextAndClose()
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example-iid", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/endpoint-", obj.connectionType.system))
        assertTrue(stringMatch("ihe-iid", obj.connectionType.code))
        assertTrue(stringMatch("PACS Hospital Invoke Image Di", obj.name))
        assertTrue(stringMatch("DICOM IID", obj.payloadType[0].text))
        assertTrue(stringMatch("https://pacs.hospital.org/IHE", obj.address))
    }

    fun `endpoint-example-iid Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `endpoint-example-wadors 416 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/endpoint-example-wadors.json").readTextAndClose()
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example-wadors", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/endpoint-", obj.connectionType.system))
        assertTrue(stringMatch("dicom-wado-rs", obj.connectionType.code))
        assertTrue(stringMatch("PACS Hospital DICOM WADO-RS e", obj.name))
        assertTrue(stringMatch("DICOM WADO-RS", obj.payloadType[0].text))
        assertTrue(stringMatch("application/dicom", obj.payloadMimeType[0]))
        assertTrue(stringMatch("https://pacs.hospital.org/wad", obj.address))
    }

    fun `endpoint-example-wadors Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `endpoint-example 417 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/endpoint-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Endpoint::class.java)
        assertTrue(stringMatch("Endpoint", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/enpoint-id", obj.identifier[0].system))
        assertTrue(stringMatch("epcp12", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/endpoint-", obj.connectionType.system))
        assertTrue(stringMatch("hl7-fhir-rest", obj.connectionType.code))
        assertTrue(stringMatch("Health Intersections CarePlan", obj.name))
        assertTrue(stringMatch("Organization/hl7", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("email", obj.contact[0].system))
        assertTrue(stringMatch("endpointmanager@example.org", obj.contact[0].value))
        assertTrue(stringMatch("work", obj.contact[0].use))
        assertTrue(stringMatch("2014-09-01", obj.period!!.start))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.payloadType[0].coding[0].system))
        assertTrue(stringMatch("CarePlan", obj.payloadType[0].coding[0].code))
        assertTrue(stringMatch("application/fhir+xml", obj.payloadMimeType[0]))
        assertTrue(stringMatch("http://fhir3.healthintersecti", obj.address))
        assertTrue(stringMatch("bearer-code BASGS534s4", obj.header[0]))
    }

    fun `endpoint-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
