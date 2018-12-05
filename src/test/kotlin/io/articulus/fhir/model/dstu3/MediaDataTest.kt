package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MediaDataTest : DataTests() {
    @Test
    fun `media-example 178 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/media-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("photo", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/media-sub", obj.subtype!!.coding[0].system))
        assertTrue(stringMatch("diagram", obj.subtype!!.coding[0].code))
        assertTrue(stringMatch("Patient/xcda", obj.subject!!.reference))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.operator!!.reference))
        assertTrue(stringMatch("Acme Camera", obj.device!!.display))
        assertEquals(145, obj.height)
        assertEquals(126, obj.width)
        assertEquals(1, obj.frames)
        assertTrue(stringMatch("a1", obj.content.id))
        assertTrue(stringMatch("image/gif", obj.content.contentType))
        assertTrue(stringMatch("R0lGODlhfgCRAPcAAAAAAIAAAACAA", obj.content.data))
        assertTrue(stringMatch("2009-09-03", obj.content.creation))
    }

    fun `media-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `media-example-dicom 179 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/media-example-dicom.json").readTextAndClose()
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("1.2.840.113619075792384034087", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://nema.org/fhir/extensio", obj.extension[0].url))
        assertTrue(stringMatch("urn:oid:1.2.840.10008.1.2.1", obj.extension[0].valueUri))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("InstanceUID", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.2.840.1136190757923", obj.identifier[0].value))
        assertTrue(stringMatch("accessionNo", obj.identifier[1].type!!.text))
        assertTrue(stringMatch("http://acme-imaging.com/acces", obj.identifier[1].system))
        assertTrue(stringMatch("1234567", obj.identifier[1].value))
        assertTrue(stringMatch("studyId", obj.identifier[2].type!!.text))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[2].system))
        assertTrue(stringMatch("urn:oid:1.2.840.113619.2.21.8", obj.identifier[2].value))
        assertTrue(stringMatch("seriesId", obj.identifier[3].type!!.text))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[3].system))
        assertTrue(stringMatch("urn:oid:1.2.840.113619.2.21.3", obj.identifier[3].value))
        assertTrue(stringMatch("photo", obj.type))
        assertTrue(stringMatch("http://dicom.nema.org/resourc", obj.subtype!!.coding[0].system))
        assertTrue(stringMatch("US", obj.subtype!!.coding[0].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.view!!.coding[0].system))
        assertTrue(stringMatch("399067008", obj.view!!.coding[0].code))
        assertTrue(stringMatch("Lateral projection", obj.view!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("G.E. Medical Systems", obj.device!!.display))
        assertEquals(480, obj.height)
        assertEquals(640, obj.width)
        assertTrue(stringMatch("application/dicom", obj.content.contentType))
        assertTrue(stringMatch("http://imaging.acme.com/wado/", obj.content.url))
    }

    fun `media-example-dicom Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `media-example-xray 180 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/media-example-xray.json").readTextAndClose()
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("xray", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://someclinic.org/fhir/Na", obj.basedOn[0].identifier!!.system))
        assertTrue(stringMatch("111222", obj.basedOn[0].identifier!!.value))
        assertTrue(stringMatch("XYZ Medical Clinic", obj.basedOn[0].identifier!!.assigner!!.display))
        assertTrue(stringMatch("photo", obj.type))
        assertTrue(stringMatch("http://snomed.info/sct", obj.subtype!!.coding[0].system))
        assertTrue(stringMatch("39714003", obj.subtype!!.coding[0].code))
        assertTrue(stringMatch("Skeletal X-ray of wrist and h", obj.subtype!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2016-03-15", obj.occurrenceDateTime))
        assertTrue(stringMatch("http://snomed.info.sct", obj.bodySite!!.coding[0].system))
        assertTrue(stringMatch("85151006", obj.bodySite!!.coding[0].code))
        assertTrue(stringMatch("Structure of left hand (body ", obj.bodySite!!.coding[0].display))
        assertEquals(432, obj.height)
        assertEquals(640, obj.width)
        assertTrue(stringMatch("a1", obj.content.id))
        assertTrue(stringMatch("image/jpeg", obj.content.contentType))
        assertTrue(stringMatch("http://someimagingcenter.org/", obj.content.url))
        assertTrue(stringMatch("2016-03-15", obj.content.creation))
    }

    fun `media-example-xray Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `media-example-sound 181 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/media-example-sound.json").readTextAndClose()
        val obj = mapper.fromJson(json, Media::class.java)
        assertTrue(stringMatch("Media", obj.resourceType))
        assertTrue(stringMatch("sound", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("video", obj.type))
        assertTrue(stringMatch("Patient/xcda", obj.subject!!.reference))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.operator!!.reference))
        assertEquals(65, obj.duration)
        assertTrue(stringMatch("a1", obj.content.id))
        assertTrue(stringMatch("audio/mpeg", obj.content.contentType))
        assertTrue(stringMatch("dG9vIGJpZyB0b28gaW5jbHVkZSB0a", obj.content.data))
    }

    fun `media-example-sound Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
