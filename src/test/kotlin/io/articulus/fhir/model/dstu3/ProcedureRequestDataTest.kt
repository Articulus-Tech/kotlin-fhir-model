package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProcedureRequestDataTest : DataTests() {
    @Test
    fun `procedurerequest-example-lipid 58 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-lipid.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("lipid", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Observation", (obj.contained[0] as Observation).resourceType))
        assertTrue(stringMatch("fasting", (obj.contained[0] as Observation).id))
        assertTrue(stringMatch("final", (obj.contained[0] as Observation).status))
        assertTrue(stringMatch("http://loinc.org", (obj.contained[0] as Observation).code.coding[0].system))
        assertTrue(stringMatch("49541-6", (obj.contained[0] as Observation).code.coding[0].code))
        assertTrue(stringMatch("Fasting status - Reported", (obj.contained[0] as Observation).code.coding[0].display))
        assertTrue(stringMatch("Patient/example", (obj.contained[0] as Observation).subject!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0136", (obj.contained[0] as Observation).valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("Y", (obj.contained[0] as Observation).valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Yes", (obj.contained[0] as Observation).valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("Specimen", (obj.contained[1] as Specimen).resourceType))
        assertTrue(stringMatch("serum", (obj.contained[1] as Specimen).id))
        assertTrue(stringMatch("http://acme.org/specimens", (obj.contained[1] as Specimen).identifier[0].system))
        assertTrue(stringMatch("20150107-0012", (obj.contained[1] as Specimen).identifier[0].value))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[1] as Specimen).type!!.coding[0].system))
        assertTrue(stringMatch("119364003", (obj.contained[1] as Specimen).type!!.coding[0].code))
        assertTrue(stringMatch("Serum sample", (obj.contained[1] as Specimen).type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", (obj.contained[1] as Specimen).subject.reference))
        assertTrue(stringMatch("2015-08-16T06:40:17Z", (obj.contained[1] as Specimen).collection!!.collectedDateTime))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("PLAC", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("Placer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:1.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("2345234234234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
        assertTrue(stringMatch("http://acme.org/tests", obj.code.coding[0].system))
        assertTrue(stringMatch("LIPID", obj.code.coding[0].code))
        assertTrue(stringMatch("Lipid Panel", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2013-05-02T16:16:00-07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Organization/f001", obj.requester!!.onBehalfOf!!.reference))
        assertTrue(stringMatch("Practitioner/f202", obj.performer!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/icd-9", obj.reasonCode[0].coding[0].system))
        assertTrue(stringMatch("V173", obj.reasonCode[0].coding[0].code))
        assertTrue(stringMatch("Fam hx-ischem heart dis", obj.reasonCode[0].coding[0].display))
        assertTrue(stringMatch("#fasting", obj.supportingInfo[0].reference))
        assertTrue(stringMatch("Fasting status", obj.supportingInfo[0].display))
        assertTrue(stringMatch("#serum", obj.specimen[0].reference))
        assertTrue(stringMatch("Serum specimen", obj.specimen[0].display))
        assertTrue(stringMatch("patient is afraid of needles", obj.note[0].text))
    }

    fun `procedurerequest-example-lipid Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example4 59 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example4.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("benchpress", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("plan", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("229115003", obj.code.coding[0].code))
        assertTrue(stringMatch("Bench Press (regime/therapy) ", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertEquals(20, obj.occurrenceTiming!!.repeat!!.count)
        assertEquals(30, obj.occurrenceTiming!!.repeat!!.countMax)
        assertEquals(3, obj.occurrenceTiming!!.repeat!!.frequency)
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.occurrenceTiming!!.repeat!!.period)))
        assertTrue(stringMatch("wk", obj.occurrenceTiming!!.repeat!!.periodUnit))
        assertTrue(stringMatch("Start with 30kg and increase ", obj.note[0].text))
    }

    fun `procedurerequest-example4 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-edu 60 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-edu.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("education", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("311401005", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Patient education (procedure)", obj.category[0].coding[0].display))
        assertTrue(stringMatch("Education", obj.category[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("48023004", obj.code.coding[0].code))
        assertTrue(stringMatch("Breast self-examination techn", obj.code.coding[0].display))
        assertTrue(stringMatch("Health education - breast exa", obj.code.text))
        assertTrue(stringMatch("Jane Doe", obj.subject.display))
        assertTrue(stringMatch("2014-08-16", obj.occurrenceDateTime))
        assertTrue(stringMatch("2016-08-16", obj.authoredOn))
        assertTrue(stringMatch("Angela Care, MD", obj.requester!!.agent.display))
        assertTrue(stringMatch("Pamela Educator, RN", obj.performer!!.display))
        assertTrue(stringMatch("early detection of breast mas", obj.reasonCode[0].text))
    }

    fun `procedurerequest-example-edu Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-pt 61 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-pt.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("physical-therapy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("386053000", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Evaluation procedure (procedu", obj.category[0].coding[0].display))
        assertTrue(stringMatch("Evaluation", obj.category[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("710830005", obj.code.coding[0].code))
        assertTrue(stringMatch("Assessment of passive range o", obj.code.coding[0].display))
        assertTrue(stringMatch("Assessment of passive range o", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2016-09-27", obj.occurrenceDateTime))
        assertTrue(stringMatch("2016-09-20", obj.authoredOn))
        assertTrue(stringMatch("Ollie Ortho, MD", obj.requester!!.agent.display))
        assertTrue(stringMatch("Sawbones Orthopedic Clinic", obj.requester!!.onBehalfOf!!.display))
        assertTrue(stringMatch("Paul Therapist, PT", obj.performer!!.display))
        assertTrue(stringMatch("assessment of mobility limita", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("36701003", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Both knees (body structure)", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Both knees", obj.bodySite[0].text))
    }

    fun `procedurerequest-example-pt Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-genetics-example-1 62 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-genetics-example-1.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("og-example1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
        assertTrue(stringMatch("http://loinc.org", obj.code.coding[0].system))
        assertTrue(stringMatch("49874-1", obj.code.coding[0].code))
        assertTrue(stringMatch("ABCB4 gene mutation analysis", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2014-05-12T16:16:00-07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Practitioner/example", obj.performer!!.reference))
    }

    fun `procedurerequest-genetics-example-1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-di 63 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-di.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("di", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
        assertTrue(stringMatch("http://loinc.org", obj.code.coding[0].system))
        assertTrue(stringMatch("24627-2", obj.code.coding[0].code))
        assertTrue(stringMatch("Chest CT", obj.code.text))
        assertTrue(stringMatch("Patient/dicom", obj.subject.reference))
        assertTrue(stringMatch("2013-05-08T09:33:27+07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Adam Careful", obj.requester!!.agent.display))
        assertTrue(stringMatch("Check for metastatic disease", obj.reasonCode[0].text))
    }

    fun `procedurerequest-example-di Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-subrequest 64 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-subrequest.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("subrequest", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Protocol for alergies", obj.definition[0].display))
        assertTrue(stringMatch("Original Request", obj.basedOn[0].display))
        assertTrue(stringMatch("Previous allergy test", obj.replaces[0].display))
        assertTrue(stringMatch("A13848392", obj.requisition!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("instance-order", obj.intent))
        assertTrue(stringMatch("routine", obj.priority))
        assertTrue(stringMatch("http://loinc.org", obj.code.coding[0].system))
        assertTrue(stringMatch("35542-0", obj.code.coding[0].code))
        assertTrue(stringMatch("Peanut IgG", obj.code.text))
        assertTrue(stringMatch("Patient/dicom", obj.subject.reference))
        assertTrue(stringMatch("2013-05-08T09:33:27+07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Adam Careful", obj.requester!!.agent.display))
        assertTrue(stringMatch("Qualified nurse", obj.performerType!!.coding[0].display))
        assertTrue(stringMatch("Nurse", obj.performerType!!.text))
        assertTrue(stringMatch("Check for Peanut Allergy", obj.reasonCode[0].text))
        assertTrue(stringMatch("Right arm", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Right arm", obj.bodySite[0].text))
    }

    fun `procedurerequest-example-subrequest Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example2 65 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example2.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("physiotherapy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Provenance", (obj.contained[0] as Provenance).resourceType))
        assertTrue(stringMatch("signature", (obj.contained[0] as Provenance).id))
        assertTrue(stringMatch("ProcedureRequest/physiotherap", (obj.contained[0] as Provenance).target[0].reference))
        assertTrue(stringMatch("2017-02-01T17:23:07Z", (obj.contained[0] as Provenance).recorded))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", (obj.contained[0] as Provenance).agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("AUT", (obj.contained[0] as Provenance).agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/example", (obj.contained[0] as Provenance).agent[0].whoReference.reference))
        assertTrue(stringMatch("Dr Adam Careful", (obj.contained[0] as Provenance).agent[0].whoReference.display))
        assertTrue(stringMatch("urn:iso-astm:E1762-95:2013", (obj.contained[0] as Provenance).signature[0].type[0].system))
        assertTrue(stringMatch("1.2.840.10065.1.12.1.1", (obj.contained[0] as Provenance).signature[0].type[0].code))
        assertTrue(stringMatch("Author's Signature", (obj.contained[0] as Provenance).signature[0].type[0].display))
        assertTrue(stringMatch("2017-02-01T17:23:07Z", (obj.contained[0] as Provenance).signature[0].when_fhir))
        assertTrue(stringMatch("Practitioner/example", (obj.contained[0] as Provenance).signature[0].whoReference.reference))
        assertTrue(stringMatch("Dr Adam Careful", (obj.contained[0] as Provenance).signature[0].whoReference.display))
        assertTrue(stringMatch("application/signature+xml", (obj.contained[0] as Provenance).signature[0].contentType))
        assertTrue(stringMatch("dGhpcyBibG9iIGlzIHNuaXBwZWQ=", (obj.contained[0] as Provenance).signature[0].blob))
        assertTrue(stringMatch("Condition", (obj.contained[1] as Condition).resourceType))
        assertTrue(stringMatch("cystic-fibrosis", (obj.contained[1] as Condition).id))
        assertTrue(stringMatch("active", (obj.contained[1] as Condition).clinicalStatus))
        assertTrue(stringMatch("confirmed", (obj.contained[1] as Condition).verificationStatus))
        assertTrue(stringMatch("http://hl7.org/fhir/condition", (obj.contained[1] as Condition).category[0].coding[0].system))
        assertTrue(stringMatch("problem-list-item", (obj.contained[1] as Condition).category[0].coding[0].code))
        assertTrue(stringMatch("Problem List Item", (obj.contained[1] as Condition).category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[1] as Condition).severity!!.coding[0].system))
        assertTrue(stringMatch("255604002", (obj.contained[1] as Condition).severity!!.coding[0].code))
        assertTrue(stringMatch("Mild", (obj.contained[1] as Condition).severity!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/icd-1", (obj.contained[1] as Condition).code!!.coding[0].system))
        assertTrue(stringMatch("E84.0", (obj.contained[1] as Condition).code!!.coding[0].code))
        assertTrue(stringMatch("Cystic fibrosis with pulmonar", (obj.contained[1] as Condition).code!!.coding[0].display))
        assertTrue(stringMatch("Cystic Fibrosis", (obj.contained[1] as Condition).code!!.text))
        assertTrue(stringMatch("Patient/example", (obj.contained[1] as Condition).subject.reference))
        assertTrue(stringMatch("2012-11-12", (obj.contained[1] as Condition).onsetDateTime))
        assertTrue(stringMatch("http://hl7.org/fhir/identifie", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("PLAC", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("Placer Identifier", obj.identifier[0].type!!.coding[0].display))
        assertTrue(stringMatch("Placer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("http://goodhealth.org/placer-", obj.identifier[0].system))
        assertTrue(stringMatch("20170201-0001", obj.identifier[0].value))
        assertTrue(stringMatch("CarePlan/gpvisit", obj.basedOn[0].reference))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("34431008", obj.code.coding[0].code))
        assertTrue(stringMatch("Physiotherapy of chest (regim", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("%.2f".format(15f), "%.2f".format(obj.occurrenceTiming!!.repeat!!.duration)))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format(obj.occurrenceTiming!!.repeat!!.durationMax)))
        assertTrue(stringMatch("min", obj.occurrenceTiming!!.repeat!!.durationUnit))
        assertEquals(1, obj.occurrenceTiming!!.repeat!!.frequency)
        assertEquals(4, obj.occurrenceTiming!!.repeat!!.frequencyMax)
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.occurrenceTiming!!.repeat!!.period)))
        assertTrue(stringMatch("d", obj.occurrenceTiming!!.repeat!!.periodUnit))
        assertTrue(stringMatch("as needed to clear mucus", obj.asNeededCodeableConcept!!.text))
        assertTrue(stringMatch("2017-02-01T17:23:07Z", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.requester!!.agent.display))
        assertTrue(stringMatch("Organization/2", obj.requester!!.onBehalfOf!!.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.requester!!.onBehalfOf!!.display))
        assertTrue(stringMatch("#cystic-fibrosis", obj.reasonReference[0].reference))
        assertTrue(stringMatch("#signature", obj.relevantHistory[0].reference))
        assertTrue(stringMatch("Author's Signature", obj.relevantHistory[0].display))
    }

    fun `procedurerequest-example2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example3 66 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example3.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("do-not-turn", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://goodhealth.org/placer-", obj.identifier[0].system))
        assertTrue(stringMatch("20170201-0002", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("stat", obj.priority))
        assertEquals(true, if (obj.doNotPerform != null) obj.doNotPerform else false, "Field: obj.doNotPerform")
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("359962006", obj.code.coding[0].code))
        assertTrue(stringMatch("Turning patient in bed (proce", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2017-02-01T17:23:07Z", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.requester!!.agent.display))
        assertTrue(stringMatch("Patient has a spinal fracture", obj.reasonReference[0].display))
    }

    fun `procedurerequest-example3 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-ambulation 67 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-ambulation.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ambulation", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("45678", obj.identifier[0].value))
        assertTrue(stringMatch("Protocol for hypertension dur", obj.definition[0].display))
        assertTrue(stringMatch("CarePlan/preg", obj.basedOn[0].reference))
        assertTrue(stringMatch("Maternity care plan", obj.basedOn[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("62013009", obj.code.coding[0].code))
        assertTrue(stringMatch("Ambulating patient (procedure", obj.code.coding[0].display))
        assertTrue(stringMatch("Ambulation", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2017-03-05", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/3ad0687e-f477-46", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.requester!!.agent.display))
    }

    @Test
    fun `procedurerequest-example-ambulation 68 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-ambulation.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("Observation/blood-pressure", obj.reasonReference[0].reference))
        assertTrue(stringMatch("Blood Pressure", obj.reasonReference[0].display))
    }

    fun `procedurerequest-example-ambulation Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-implant 69 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-implant.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example-implant", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("25267002", obj.code.coding[0].code))
        assertTrue(stringMatch("Insertion of intracardiac pac", obj.code.coding[0].display))
        assertTrue(stringMatch("Implant Pacemaker", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2015-03-30", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/3ad0687e-f477-46", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.requester!!.agent.display))
        assertTrue(stringMatch("Practitioner/example", obj.performer!!.reference))
        assertTrue(stringMatch("Dr Cecil Surgeon", obj.performer!!.display))
        assertTrue(stringMatch("Bradycardia", obj.reasonCode[0].text))
    }

    fun `procedurerequest-example-implant Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-colonoscopy 70 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-colonoscopy.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("colonoscopy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("45678", obj.identifier[0].value))
        assertTrue(stringMatch("http://bumc.org/requisitions", obj.requisition!!.system))
        assertTrue(stringMatch("req12345", obj.requisition!!.value))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("73761001", obj.code.coding[0].code))
        assertTrue(stringMatch("Colonoscopy (procedure)", obj.code.coding[0].display))
        assertTrue(stringMatch("Colonoscopy", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2017-03-05", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/3ad0687e-f477-46", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.requester!!.agent.display))
        assertTrue(stringMatch("Practitioner/example", obj.performer!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.performer!!.display))
    }

    fun `procedurerequest-example-colonoscopy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-colonoscopy-bx 71 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-colonoscopy-bx.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("colon-biopsy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("http://bumc.org/requisitions", obj.requisition!!.system))
        assertTrue(stringMatch("req12345", obj.requisition!!.value))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("76164006", obj.code.coding[0].code))
        assertTrue(stringMatch("Biopsy of colon (procedure)", obj.code.coding[0].display))
        assertTrue(stringMatch("Biopsy of colon", obj.code.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2017-03-05", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/3ad0687e-f477-46", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Dr. Beverly Crusher", obj.requester!!.agent.display))
        assertTrue(stringMatch("Practitioner/example", obj.performer!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.performer!!.display))
    }

    fun `procedurerequest-example-colonoscopy-bx Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-appendectomy 72 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-appendectomy.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("appendectomy-narrative", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("Appendectomy", obj.code.text))
        assertTrue(stringMatch("Paula Patient", obj.subject.display))
    }

    fun `procedurerequest-example-appendectomy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example 73 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("103693007", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Diagnostic procedure (procedu", obj.category[0].coding[0].display))
        assertTrue(stringMatch("Diagnostics Procedure", obj.category[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("303653007", obj.code.coding[0].code))
        assertTrue(stringMatch("Computed tomography of head", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
    }

    fun `procedurerequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-ft4 74 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-ft4.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ft4", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("reflex-order", obj.intent))
        assertTrue(stringMatch("http://loinc.org", obj.code.coding[0].system))
        assertTrue(stringMatch("3024-7", obj.code.coding[0].code))
        assertTrue(stringMatch("Thyroxine (T4) free [Mass/​vo", obj.code.coding[0].display))
        assertTrue(stringMatch("Free T4", obj.code.text))
        assertTrue(stringMatch("Patient/pat2", obj.subject.reference))
        assertTrue(stringMatch("2015-08-27T09:33:27+07:00", obj.occurrenceDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.requester!!.agent.reference))
    }

    fun `procedurerequest-example-ft4 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-ob 75 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-ob.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("ob", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category[0].coding[0].system))
        assertTrue(stringMatch("386637004", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Obstetric procedure (procedur", obj.category[0].coding[0].display))
        assertTrue(stringMatch("OB", obj.category[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("22633006", obj.code.coding[0].code))
        assertTrue(stringMatch("Vaginal delivery, medical per", obj.code.coding[0].display))
        assertTrue(stringMatch("Vaginal delivery", obj.code.text))
        assertTrue(stringMatch("Jane Doe", obj.subject.display))
        assertTrue(stringMatch("2012-06-02", obj.occurrenceDateTime))
        assertTrue(stringMatch("Women’s Hospital", obj.requester!!.agent.display))
        assertTrue(stringMatch("Martha Midwife, RNP", obj.performer!!.display))
        assertTrue(stringMatch("term pregnancy, active labor", obj.reasonCode[0].text))
    }

    fun `procedurerequest-example-ob Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedurerequest-example-pgx 76 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedurerequest-example-pgx.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcedureRequest::class.java)
        assertTrue(stringMatch("ProcedureRequest", obj.resourceType))
        assertTrue(stringMatch("example-pgx", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("original-order", obj.intent))
        assertTrue(stringMatch("http://loinc.org", obj.code.coding[0].system))
        assertTrue(stringMatch("47403-1", obj.code.coding[0].code))
        assertTrue(stringMatch("CYP2D6 gene targeted mutation", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/899962", obj.subject.reference))
        assertTrue(stringMatch("2016-10-10T15:00:00-07:00", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/12345", obj.requester!!.agent.reference))
    }

    fun `procedurerequest-example-pgx Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
