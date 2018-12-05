package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CompositionDataTest : DataTests() {
    @Test
    fun `composition-example 586 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/composition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Composition::class.java)
        assertTrue(stringMatch("Composition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://healthintersections.co", obj.identifier!!.system))
        assertTrue(stringMatch("1", obj.identifier!!.value))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("http://loinc.org", obj.type.coding[0].system))
        assertTrue(stringMatch("11488-4", obj.type.coding[0].code))
        assertTrue(stringMatch("Consult note", obj.type.coding[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.class_fhir!!.coding[0].system))
        assertTrue(stringMatch("LP173421-1", obj.class_fhir!!.coding[0].code))
        assertTrue(stringMatch("Report", obj.class_fhir!!.coding[0].display))
        assertTrue(stringMatch("Patient/xcda", obj.subject.reference))
        assertTrue(stringMatch("Henry Levin the 7th", obj.subject.display))
        assertTrue(stringMatch("Encounter/xcda", obj.encounter!!.reference))
        assertTrue(stringMatch("2012-01-04T09:10:14Z", obj.date))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.author[0].reference))
        assertTrue(stringMatch("Harold Hippocrates, MD", obj.author[0].display))
        assertTrue(stringMatch("Consultation Note", obj.title))
        assertTrue(stringMatch("N", obj.confidentiality))
        assertTrue(stringMatch("legal", obj.attester[0].mode[0]))
        assertTrue(stringMatch("2012-01-04T09:10:14Z", obj.attester[0].time))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.attester[0].party!!.reference))
        assertTrue(stringMatch("Harold Hippocrates, MD", obj.attester[0].party!!.display))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.custodian!!.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.custodian!!.display))
        assertTrue(stringMatch("replaces", obj.relatesTo[0].code))
        assertTrue(stringMatch("Composition/old-example", obj.relatesTo[0].targetReference.reference))
        assertTrue(stringMatch("appends", obj.relatesTo[1].code))
        assertTrue(stringMatch("http://example.org/fhir/Namin", obj.relatesTo[1].targetIdentifier.system))
        assertTrue(stringMatch("ABC123", obj.relatesTo[1].targetIdentifier.value))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.event[0].code[0].coding[0].system))
        assertTrue(stringMatch("HEALTHREC", obj.event[0].code[0].coding[0].code))
        assertTrue(stringMatch("health record", obj.event[0].code[0].coding[0].display))
        assertTrue(stringMatch("2010-07-18", obj.event[0].period!!.start))
        assertTrue(stringMatch("2012-11-12", obj.event[0].period!!.end))
        assertTrue(stringMatch("Observation/example", obj.event[0].detail[0].reference))
        assertTrue(stringMatch("History of present illness", obj.section[0].title))
        assertTrue(stringMatch("http://loinc.org", obj.section[0].code!!.coding[0].system))
        assertTrue(stringMatch("11348-0", obj.section[0].code!!.coding[0].code))
        assertTrue(stringMatch("History of past illness Narra", obj.section[0].code!!.coding[0].display))
        assertTrue(stringMatch("generated", obj.section[0].text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.section[0].text!!.div))
        assertTrue(stringMatch("snapshot", obj.section[0].mode))
        assertTrue(stringMatch("http://hl7.org/fhir/list-orde", obj.section[0].orderedBy!!.coding[0].system))
        assertTrue(stringMatch("event-date", obj.section[0].orderedBy!!.coding[0].code))
        assertTrue(stringMatch("Sorted by Event Date", obj.section[0].orderedBy!!.coding[0].display))
        assertTrue(stringMatch("Condition/stroke", obj.section[0].entry[0].reference))
        assertTrue(stringMatch("Condition/example", obj.section[0].entry[1].reference))
        assertTrue(stringMatch("Condition/example2", obj.section[0].entry[2].reference))
        assertTrue(stringMatch("History of family member dise", obj.section[1].title))
        assertTrue(stringMatch("http://loinc.org", obj.section[1].code!!.coding[0].system))
        assertTrue(stringMatch("10157-6", obj.section[1].code!!.coding[0].code))
        assertTrue(stringMatch("History of family member dise", obj.section[1].code!!.coding[0].display))
        assertTrue(stringMatch("generated", obj.section[1].text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.section[1].text!!.div))
        assertTrue(stringMatch("snapshot", obj.section[1].mode))
        assertTrue(stringMatch("http://hl7.org/fhir/list-empt", obj.section[1].emptyReason!!.coding[0].system))
        assertTrue(stringMatch("withheld", obj.section[1].emptyReason!!.coding[0].code))
        assertTrue(stringMatch("Information Withheld", obj.section[1].emptyReason!!.coding[0].display))
    }

    fun `composition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
