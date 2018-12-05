package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ConditionDataTest : DataTests() {
    @Test
    fun `condition-example-f003-abscess 371 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f003-abscess.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("439401001", obj.category[0].coding[0].code))
        assertTrue(stringMatch("diagnosis", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("371923003", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Mild to moderate", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("18099001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Retropharyngeal abscess", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("280193007", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Entire retropharyngeal area", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f003", obj.context!!.reference))
        assertTrue(stringMatch("2012-02-27", obj.onsetDateTime))
        assertTrue(stringMatch("2012-02-20", obj.assertedDate))
        assertTrue(stringMatch("Patient/f001", obj.asserter!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.asserter!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.evidence[0].code[0].coding[0].system))
        assertTrue(stringMatch("169068008", obj.evidence[0].code[0].coding[0].code))
        assertTrue(stringMatch("CT of neck", obj.evidence[0].code[0].coding[0].display))
    }

    fun `condition-example-f003-abscess Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f203-sepsis 372 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f203-sepsis.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
    }

    @Test
    fun `condition-example-f203-sepsis 373 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f203-sepsis.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("55607006", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Problem", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[1].system))
        assertTrue(stringMatch("problem-list-item", obj.category[0].coding[1].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("371924009", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Moderate to severe", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("10001005", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Bacterial sepsis", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("281158006", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Pulmonary vascular structure", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f203", obj.context!!.reference))
        assertTrue(stringMatch("Roel's encounter on March ele", obj.context!!.display))
        assertTrue(stringMatch("2013-03-08", obj.onsetDateTime))
        assertTrue(stringMatch("2013-03-11", obj.assertedDate))
        assertTrue(stringMatch("Practitioner/f201", obj.asserter!!.reference))
        assertTrue(stringMatch("DiagnosticReport/f202", obj.evidence[0].detail[0].reference))
        assertTrue(stringMatch("Diagnostic report for Roel's ", obj.evidence[0].detail[0].display))
    }

    fun `condition-example-f203-sepsis Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-stroke 374 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-stroke.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("stroke", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[0].system))
        assertTrue(stringMatch("encounter-diagnosis", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Encounter Diagnosis", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("422504002", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Ischemic stroke (disorder)", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Stroke", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2010-07-18", obj.onsetDateTime))
    }

    fun `condition-example-stroke Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-family-history 375 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-family-history.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("family-history", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[0].system))
        assertTrue(stringMatch("problem-list-item", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Problem List Item", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("312824007", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Family history of cancer of c", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
    }

    fun `condition-example-family-history Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f002-lung 376 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f002-lung.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("439401001", obj.category[0].coding[0].code))
        assertTrue(stringMatch("diagnosis", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("24484000", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Severe", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("254637007", obj.code!!.coding[0].code))
        assertTrue(stringMatch("NSCLC - Non-small cell lung c", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("51185008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Thorax", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f002", obj.context!!.reference))
        assertTrue(stringMatch("2011-05-05", obj.onsetDateTime))
        assertTrue(stringMatch("2012-06-03", obj.assertedDate))
        assertTrue(stringMatch("Patient/f001", obj.asserter!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.asserter!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.stage!!.summary!!.coding[0].system))
        assertTrue(stringMatch("258219007", obj.stage!!.summary!!.coding[0].code))
        assertTrue(stringMatch("stage II", obj.stage!!.summary!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.evidence[0].code[0].coding[0].system))
        assertTrue(stringMatch("169069000", obj.evidence[0].code[0].coding[0].code))
        assertTrue(stringMatch("CT of thorax", obj.evidence[0].code[0].coding[0].display))
    }

    fun `condition-example-f002-lung Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f205-infection 377 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f205-infection.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f205", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("differential", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("87628006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Bacterial infectious disease", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("2013-04-04", obj.assertedDate))
        assertTrue(stringMatch("Practitioner/f201", obj.asserter!!.reference))
    }

    fun `condition-example-f205-infection Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f204-renal 378 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f204-renal.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("differential", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("55607006", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Problem", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[1].system))
        assertTrue(stringMatch("problem-list-item", obj.category[0].coding[1].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("24484000", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Severe", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("36225005", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Acute renal insufficiency spe", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("181414000", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Kidney", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f203", obj.context!!.reference))
        assertTrue(stringMatch("Roel's encounter on March ele", obj.context!!.display))
        assertTrue(stringMatch("2013-03-11", obj.onsetDateTime))
        assertTrue(stringMatch("2013-03-20", obj.abatementDateTime))
        assertTrue(stringMatch("2013-03-11", obj.assertedDate))
        assertTrue(stringMatch("Practitioner/f201", obj.asserter!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.stage!!.summary!!.coding[0].system))
        assertTrue(stringMatch("14803004", obj.stage!!.summary!!.coding[0].code))
        assertTrue(stringMatch("Temporary", obj.stage!!.summary!!.coding[0].display))
        assertTrue(stringMatch("Genetic analysis master panel", obj.stage!!.assessment[0].display))
        assertTrue(stringMatch("The patient is anuric.", obj.note[0].text))
    }

    fun `condition-example-f204-renal Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example2 379 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("example2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[0].system))
        assertTrue(stringMatch("problem-list-item", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Problem List Item", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("255604002", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Mild", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("Asthma", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("approximately November 2012", obj.onsetString))
    }

    fun `condition-example2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f202-malignancy 380 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f202-malignancy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.meta!!.security[0].system))
        assertTrue(stringMatch("TBOO", obj.meta!!.security[0].code))
        assertTrue(stringMatch("taboo", obj.meta!!.security[0].display))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("resolved", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[0].system))
        assertTrue(stringMatch("encounter-diagnosis", obj.category[0].coding[0].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("24484000", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Severe", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("363346000", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Malignant neoplastic disease", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("361355005", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Entire head and neck", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("%.2f".format(52f), "%.2f".format(obj.onsetAge!!.value)))
        assertTrue(stringMatch("years", obj.onsetAge!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.onsetAge!!.system))
        assertTrue(stringMatch("a", obj.onsetAge!!.code))
        assertTrue(stringMatch("%.2f".format(54f), "%.2f".format(obj.abatementAge!!.value)))
        assertTrue(stringMatch("years", obj.abatementAge!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.abatementAge!!.system))
        assertTrue(stringMatch("a", obj.abatementAge!!.code))
        assertTrue(stringMatch("2012-12-01", obj.assertedDate))
        assertTrue(stringMatch("DiagnosticReport/f201", obj.evidence[0].detail[0].reference))
        assertTrue(stringMatch("Erasmus' diagnostic report of", obj.evidence[0].detail[0].display))
    }

    fun `condition-example-f202-malignancy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f201-fever 381 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f201-fever.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("resolved", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("55607006", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Problem", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[1].system))
        assertTrue(stringMatch("problem-list-item", obj.category[0].coding[1].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("255604002", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Mild", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("386661006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Fever", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("38266002", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Entire body as a whole", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f201", obj.context!!.reference))
        assertTrue(stringMatch("2013-04-02", obj.onsetDateTime))
        assertTrue(stringMatch("around April 9, 2013", obj.abatementString))
        assertTrue(stringMatch("2013-04-04", obj.assertedDate))
        assertTrue(stringMatch("Practitioner/f201", obj.asserter!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.evidence[0].code[0].coding[0].system))
        assertTrue(stringMatch("258710007", obj.evidence[0].code[0].coding[0].code))
        assertTrue(stringMatch("degrees C", obj.evidence[0].code[0].coding[0].display))
        assertTrue(stringMatch("Observation/f202", obj.evidence[0].detail[0].reference))
        assertTrue(stringMatch("Temperature", obj.evidence[0].detail[0].display))
    }

    fun `condition-example-f201-fever Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example 382 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", obj.category[0].coding[0].system))
        assertTrue(stringMatch("encounter-diagnosis", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Encounter Diagnosis", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[1].system))
        assertTrue(stringMatch("439401001", obj.category[0].coding[1].code))
        assertTrue(stringMatch("Diagnosis", obj.category[0].coding[1].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("24484000", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Severe", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("39065001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Burn of ear", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Burnt Ear", obj.code!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("49521004", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Left external ear structure", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Left Ear", obj.bodySite[0].text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2012-05-24", obj.onsetDateTime))
    }

    fun `condition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `condition-example-f001-heart 383 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/condition-example-f001-heart.json").readTextAndClose()
        val obj = mapper.fromJson(json, Condition::class.java)
        assertTrue(stringMatch("Condition", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.clinicalStatus))
        assertTrue(stringMatch("confirmed", obj.verificationStatus))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("439401001", obj.category[0].coding[0].code))
        assertTrue(stringMatch("diagnosis", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.severity!!.coding[0].system))
        assertTrue(stringMatch("6736007", obj.severity!!.coding[0].code))
        assertTrue(stringMatch("Moderate", obj.severity!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("368009", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Heart valve disorder", obj.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("40768004", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Left thorax", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("heart structure", obj.bodySite[0].text))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f001", obj.context!!.reference))
        assertTrue(stringMatch("2011-08-05", obj.onsetDateTime))
        assertTrue(stringMatch("2011-10-05", obj.assertedDate))
        assertTrue(stringMatch("Patient/f001", obj.asserter!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.asserter!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.evidence[0].code[0].coding[0].system))
        assertTrue(stringMatch("426396005", obj.evidence[0].code[0].coding[0].code))
        assertTrue(stringMatch("Cardiac chest pain", obj.evidence[0].code[0].coding[0].display))
    }

    fun `condition-example-f001-heart Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
