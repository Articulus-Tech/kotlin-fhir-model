package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class AllergyIntoleranceDataTest : DataTests() {
    @Test
    fun `allergyintolerance-example 473 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/allergyintolerance-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, AllergyIntolerance::class.java)
        assertTrue(stringMatch("AllergyIntolerance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/ids/patients/", obj.identifier[0].system))
        assertTrue(stringMatch("49476534", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("allergy", obj.type))
        assertTrue(stringMatch("food", obj.category[0]))
        assertTrue(stringMatch("high", obj.criticality))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("227493005", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Cashew nuts", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("2004", obj.onsetDateTime))
        assertTrue(stringMatch("2014-10-09T14:58:00+11:00", obj.assertedDate))
        assertTrue(stringMatch("Practitioner/example", obj.recorder!!.reference))
        assertTrue(stringMatch("Patient/example", obj.asserter!!.reference))
        assertTrue(stringMatch("2012-06", obj.lastOccurrence))
        assertTrue(stringMatch("The criticality is high becas", obj.note[0].text))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.reaction[0].substance!!.coding[0].system))
        assertTrue(stringMatch("1160593", obj.reaction[0].substance!!.coding[0].code))
        assertTrue(stringMatch("cashew nut allergenic extract", obj.reaction[0].substance!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reaction[0].manifestation[0].coding[0].system))
        assertTrue(stringMatch("39579001", obj.reaction[0].manifestation[0].coding[0].code))
        assertTrue(stringMatch("Anaphylactic reaction", obj.reaction[0].manifestation[0].coding[0].display))
        assertTrue(stringMatch("Challenge Protocol. Severe re", obj.reaction[0].description))
        assertTrue(stringMatch("2012-06-12", obj.reaction[0].onset))
        assertTrue(stringMatch("severe", obj.reaction[0].severity))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reaction[0].exposureRoute!!.coding[0].system))
        assertTrue(stringMatch("34206005", obj.reaction[0].exposureRoute!!.coding[0].code))
        assertTrue(stringMatch("Subcutaneous route", obj.reaction[0].exposureRoute!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reaction[1].manifestation[0].coding[0].system))
        assertTrue(stringMatch("64305001", obj.reaction[1].manifestation[0].coding[0].code))
        assertTrue(stringMatch("Urticaria", obj.reaction[1].manifestation[0].coding[0].display))
        assertTrue(stringMatch("2004", obj.reaction[1].onset))
        assertTrue(stringMatch("moderate", obj.reaction[1].severity))
        assertTrue(stringMatch("The patient reports that the ", obj.reaction[1].note[0].text))
    }

    fun `allergyintolerance-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
