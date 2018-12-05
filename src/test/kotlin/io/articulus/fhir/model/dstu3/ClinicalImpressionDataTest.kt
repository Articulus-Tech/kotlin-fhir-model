package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ClinicalImpressionDataTest : DataTests() {
    @Test
    fun `clinicalimpression-example 472 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/clinicalimpression-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ClinicalImpression::class.java)
        assertTrue(stringMatch("ClinicalImpression", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("This 26 yo male patient is br", obj.description))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2014-12-06T20:00:00+11:00", obj.effectivePeriod!!.start))
        assertTrue(stringMatch("2014-12-06T22:33:00+11:00", obj.effectivePeriod!!.end))
        assertTrue(stringMatch("2014-12-06T22:33:00+11:00", obj.date))
        assertTrue(stringMatch("Practitioner/example", obj.assessor!!.reference))
        assertTrue(stringMatch("MVA", obj.problem[0].display))
        assertTrue(stringMatch("Initial Examination", obj.investigation[0].code.text))
        assertTrue(stringMatch("deep laceration of the scalp ", obj.investigation[0].item[0].display))
        assertTrue(stringMatch("decreased level of consciousn", obj.investigation[0].item[1].display))
        assertTrue(stringMatch("disoriented to time and place", obj.investigation[0].item[2].display))
        assertTrue(stringMatch("restless", obj.investigation[0].item[3].display))
        assertTrue(stringMatch("provisional diagnoses of lace", obj.summary))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/icd-9", obj.finding[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("850.0", obj.finding[0].itemCodeableConcept.coding[0].code))
    }

    fun `clinicalimpression-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
