package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class BodySiteDataTest : DataTests() {
    @Test
    fun `bodysite-example-fetus 555 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/bodysite-example-fetus.json").readTextAndClose()
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("fetus", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodhealth.org/bodysit", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("83418008", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Entire fetus (body structure)", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Fetus", obj.code!!.text))
        assertTrue(stringMatch("EDD 1/1/2017 confirmation by ", obj.description))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
    }

    fun `bodysite-example-fetus Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `bodysite-example-tumor 556 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/bodysite-example-tumor.json").readTextAndClose()
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("tumor", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodhealth.org/bodysit", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("4147007", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Mass (morphologic abnormality", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Splenic mass", obj.code!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.qualifier[0].coding[0].system))
        assertTrue(stringMatch("78961009", obj.qualifier[0].coding[0].code))
        assertTrue(stringMatch("Splenic structure (body struc", obj.qualifier[0].coding[0].display))
        assertTrue(stringMatch("Splenic mass", obj.qualifier[0].text))
        assertTrue(stringMatch("7 cm maximum diameter", obj.description))
        assertTrue(stringMatch("application/dicom", obj.image[0].contentType))
        assertTrue(stringMatch("http://imaging.acme.com/wado/", obj.image[0].url))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
    }

    fun `bodysite-example-tumor Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `bodysite-example-skin-patch 557 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/bodysite-example-skin-patch.json").readTextAndClose()
        val obj = mapper.fromJson(json, BodySite::class.java)
        assertTrue(stringMatch("BodySite", obj.resourceType))
        assertTrue(stringMatch("skin-patch", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodhealth.org/bodysit", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertEquals(false, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("39937001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Skin structure (body structur", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Skin patch", obj.code!!.text))
        assertTrue(stringMatch("inner surface (volar) of the ", obj.description))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
    }

    fun `bodysite-example-skin-patch Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
