package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ImagingManifestDataTest : DataTests() {
    @Test
    fun `imagingmanifest-example 474 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/imagingmanifest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImagingManifest::class.java)
        assertTrue(stringMatch("ImagingManifest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.identifier!!.value))
        assertTrue(stringMatch("Patient/dicom", obj.patient.reference))
        assertTrue(stringMatch("2014-11-20T11:01:20-08:00", obj.authoringTime))
        assertTrue(stringMatch("Practitioner/example", obj.author!!.reference))
        assertTrue(stringMatch("1 SC image (screen snapshot) ", obj.description))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].uid))
        assertTrue(stringMatch("ImagingStudy/example", obj.study[0].imagingStudy!!.reference))
        assertTrue(stringMatch("Endpoint/example-iid", obj.study[0].endpoint[0].reference))
        assertTrue(stringMatch("Endpoint/example-wadors", obj.study[0].endpoint[1].reference))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].series[0].uid))
        assertTrue(stringMatch("Endpoint/example-wadors", obj.study[0].series[0].endpoint[0].reference))
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.study[0].series[0].instance[0].sopClass))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].series[0].instance[0].uid))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].series[1].uid))
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.study[0].series[1].instance[0].sopClass))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].series[1].instance[0].uid))
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.study[0].series[1].instance[1].sopClass))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.study[0].series[1].instance[1].uid))
    }

    fun `imagingmanifest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
