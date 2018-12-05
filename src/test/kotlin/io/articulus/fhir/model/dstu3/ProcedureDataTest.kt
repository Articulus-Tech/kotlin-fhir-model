package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProcedureDataTest : DataTests() {
    @Test
    fun `procedure-example-f201-tpf 306 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-f201-tpf.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("367336001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Chemotherapy", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject.reference))
        assertTrue(stringMatch("Roel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f202", obj.context!!.reference))
        assertTrue(stringMatch("Roel's encounter on January 2", obj.context!!.display))
        assertTrue(stringMatch("2013-01-28T13:31:00+01:00", obj.performedPeriod!!.start))
        assertTrue(stringMatch("2013-01-28T14:27:00+01:00", obj.performedPeriod!!.end))
        assertTrue(stringMatch("http://snomed.info/sct", obj.performer[0].role!!.coding[0].system))
        assertTrue(stringMatch("310512001", obj.performer[0].role!!.coding[0].code))
        assertTrue(stringMatch("Medical oncologist", obj.performer[0].role!!.coding[0].display))
        assertTrue(stringMatch("Practitioner/f201", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dokter Bronsig", obj.performer[0].actor.display))
        assertTrue(stringMatch("DiagnosticReport/f201", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("272676008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Sphenoid bone", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Eerste neo-adjuvante TPF-kuur", obj.note[0].text))
    }

    fun `procedure-example-f201-tpf Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-ambulation 307 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-ambulation.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("ambulation", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("Protocol for hypertension dur", obj.definition[0].display))
        assertTrue(stringMatch("CarePlan/preg", obj.basedOn[0].reference))
        assertTrue(stringMatch("Maternity care plan", obj.basedOn[0].display))
        assertTrue(stringMatch("suspended", obj.status))
        assertEquals(true, if (obj.notDone != null) obj.notDone else false, "Field: obj.notDone")
        assertTrue(stringMatch("http://snomed.info/sct", obj.notDoneReason!!.coding[0].system))
        assertTrue(stringMatch("398254007", obj.notDoneReason!!.coding[0].code))
        assertTrue(stringMatch("  Pre-eclampsia (disorder)", obj.notDoneReason!!.coding[0].display))
        assertTrue(stringMatch("Pre-eclampsia", obj.notDoneReason!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("62013009", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Ambulating patient (procedure", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Ambulation", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Practitioner/f204", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Carla Espinosa", obj.performer[0].actor.display))
        assertTrue(stringMatch("Organization/f001", obj.performer[0].onBehalfOf!!.reference))
        assertTrue(stringMatch("University Medical Hospital", obj.performer[0].onBehalfOf!!.display))
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.location!!.display))
        assertTrue(stringMatch("Observation/blood-pressure", obj.reasonReference[0].reference))
        assertTrue(stringMatch("Blood Pressure", obj.reasonReference[0].display))
    }

    fun `procedure-example-ambulation Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-implant 308 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-implant.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("example-implant", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("25267002", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Insertion of intracardiac pac", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Implant Pacemaker", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2015-04-05", obj.performedDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dr Cecil Surgeon", obj.performer[0].actor.display))
        assertTrue(stringMatch("Bradycardia", obj.reasonCode[0].text))
        assertTrue(stringMatch("ROS 5 days  - 2013-04-10", obj.followUp[0].text))
        assertTrue(stringMatch("Routine Appendectomy. Appendi", obj.note[0].text))
        assertTrue(stringMatch("http://hl7.org/fhir/device-ac", obj.focalDevice[0].action!!.coding[0].system))
        assertTrue(stringMatch("implanted", obj.focalDevice[0].action!!.coding[0].code))
        assertTrue(stringMatch("Device/example-pacemaker", obj.focalDevice[0].manipulated.reference))
    }

    fun `procedure-example-implant Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-colon-biopsy 309 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-colon-biopsy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("colon-biopsy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("Procedure/colonoscopy", obj.partOf[0].reference))
        assertTrue(stringMatch("Colonoscopy", obj.partOf[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: obj.notDone")
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("76164006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Biopsy of colon (procedure)", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Biopsy of colon", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Practitioner/example", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.performer[0].actor.display))
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.location!!.display))
    }

    fun `procedure-example-colon-biopsy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-f004-tracheotomy 310 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-f004-tracheotomy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f004", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("48387007", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Tracheotomy", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f003", obj.context!!.reference))
        assertTrue(stringMatch("2013-03-22T09:30:10+01:00", obj.performedPeriod!!.start))
        assertTrue(stringMatch("2013-03-22T10:30:10+01:00", obj.performedPeriod!!.end))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.performer[0].role!!.coding[0].system))
        assertTrue(stringMatch("01.000", obj.performer[0].role!!.coding[0].code))
        assertTrue(stringMatch("Arts", obj.performer[0].role!!.coding[0].display))
        assertTrue(stringMatch("Care role", obj.performer[0].role!!.text))
        assertTrue(stringMatch("Practitioner/f005", obj.performer[0].actor.reference))
        assertTrue(stringMatch("A. Langeveld", obj.performer[0].actor.display))
        assertTrue(stringMatch("ensure breathing during surge", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("83030008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Retropharyngeal area", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("removal of the retropharyngea", obj.outcome!!.text))
        assertTrue(stringMatch("DiagnosticReport/f001", obj.report[0].reference))
        assertTrue(stringMatch("???????????", obj.report[0].display))
        assertTrue(stringMatch("described in care plan", obj.followUp[0].text))
    }

    fun `procedure-example-f004-tracheotomy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-education 311 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-education.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("education", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("ProcedureRequest/education", obj.basedOn[0].reference))
        assertTrue(stringMatch("Order for health education", obj.basedOn[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category!!.coding[0].system))
        assertTrue(stringMatch("311401005", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Patient education (procedure)", obj.category!!.coding[0].display))
        assertTrue(stringMatch("Education", obj.category!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("48023004", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Breast self-examination techn", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Health education - breast exa", obj.code!!.text))
        assertTrue(stringMatch("Jane Doe", obj.subject.display))
        assertTrue(stringMatch("2014-08-16", obj.performedDateTime))
        assertTrue(stringMatch("Pamela Educator, RN", obj.performer[0].actor.display))
        assertTrue(stringMatch("Southside Community Health Ce", obj.location!!.display))
        assertTrue(stringMatch("early detection of breast mas", obj.reasonCode[0].text))
    }

    fun `procedure-example-education Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-colonoscopy 312 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-colonoscopy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("colonoscopy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: obj.notDone")
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("73761001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Colonoscopy (procedure)", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Colonoscopy", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Practitioner/example", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.performer[0].actor.display))
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.location!!.display))
        assertTrue(stringMatch("Perforated intestine conditio", obj.complicationDetail[0].display))
        assertTrue(stringMatch("Colonoscope device", obj.usedReference[0].display))
    }

    fun `procedure-example-colonoscopy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-physical-therapy 313 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-physical-therapy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("physical-therapy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("ProcedureRequest/physical-the", obj.basedOn[0].reference))
        assertTrue(stringMatch("Order for the assessment of p", obj.basedOn[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category!!.coding[0].system))
        assertTrue(stringMatch("386053000", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Evaluation procedure (procedu", obj.category!!.coding[0].display))
        assertTrue(stringMatch("Evaluation", obj.category!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("710830005", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Assessment of passive range o", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Assessment of passive range o", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2016-09-27", obj.performedDateTime))
        assertTrue(stringMatch("Paul Therapist, PT", obj.performer[0].actor.display))
        assertTrue(stringMatch("Sawbones Orthopedic Clinic", obj.location!!.display))
        assertTrue(stringMatch("assessment of mobility limita", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("36701003", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Both knees (body structure)", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Both knees", obj.bodySite[0].text))
    }

    fun `procedure-example-physical-therapy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-f003-abscess 314 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-f003-abscess.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("172960003", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Incision of retropharyngeal a", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f003", obj.context!!.reference))
        assertTrue(stringMatch("2013-03-24T09:30:10+01:00", obj.performedPeriod!!.start))
        assertTrue(stringMatch("2013-03-24T10:30:10+01:00", obj.performedPeriod!!.end))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.performer[0].role!!.coding[0].system))
        assertTrue(stringMatch("01.000", obj.performer[0].role!!.coding[0].code))
        assertTrue(stringMatch("Arts", obj.performer[0].role!!.coding[0].display))
        assertTrue(stringMatch("Care role", obj.performer[0].role!!.text))
        assertTrue(stringMatch("Practitioner/f001", obj.performer[0].actor.reference))
        assertTrue(stringMatch("E.M.J.M. van den broek", obj.performer[0].actor.display))
        assertTrue(stringMatch("abcess in retropharyngeal are", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("83030008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Retropharyngeal area", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("removal of the retropharyngea", obj.outcome!!.text))
        assertTrue(stringMatch("DiagnosticReport/f001", obj.report[0].reference))
        assertTrue(stringMatch("Lab results blood test", obj.report[0].display))
        assertTrue(stringMatch("described in care plan", obj.followUp[0].text))
    }

    fun `procedure-example-f003-abscess Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example 315 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("80146002", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Appendectomy (Procedure)", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Appendectomy", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2013-04-05", obj.performedDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dr Cecil Surgeon", obj.performer[0].actor.display))
        assertTrue(stringMatch("Generalized abdominal pain 24", obj.reasonCode[0].text))
        assertTrue(stringMatch("ROS 5 days  - 2013-04-10", obj.followUp[0].text))
        assertTrue(stringMatch("Routine Appendectomy. Appendi", obj.note[0].text))
    }

    fun `procedure-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-appendectomy-narrative 316 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-appendectomy-narrative.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("appendectomy-narrative", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
    }

    fun `procedure-example-appendectomy-narrative Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-f001-heart 317 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-f001-heart.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("34068001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Heart valve replacement", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f001", obj.context!!.reference))
        assertTrue(stringMatch("2011-06-26", obj.performedPeriod!!.start))
        assertTrue(stringMatch("2011-06-27", obj.performedPeriod!!.end))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.performer[0].role!!.coding[0].system))
        assertTrue(stringMatch("01.000", obj.performer[0].role!!.coding[0].code))
        assertTrue(stringMatch("Arts", obj.performer[0].role!!.coding[0].display))
        assertTrue(stringMatch("Care role", obj.performer[0].role!!.text))
        assertTrue(stringMatch("Practitioner/f002", obj.performer[0].actor.reference))
        assertTrue(stringMatch("P. Voigt", obj.performer[0].actor.display))
        assertTrue(stringMatch("Heart valve disorder", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("17401000", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Heart valve structure", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("improved blood circulation", obj.outcome!!.text))
        assertTrue(stringMatch("DiagnosticReport/f001", obj.report[0].reference))
        assertTrue(stringMatch("Lab results blood test", obj.report[0].display))
        assertTrue(stringMatch("described in care plan", obj.followUp[0].text))
    }

    fun `procedure-example-f001-heart Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-f002-lung 318 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-f002-lung.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("359615001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Partial lobectomy of lung", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject.display))
        assertTrue(stringMatch("Encounter/f002", obj.context!!.reference))
        assertTrue(stringMatch("2013-03-08T09:00:10+01:00", obj.performedPeriod!!.start))
        assertTrue(stringMatch("2013-03-08T09:30:10+01:00", obj.performedPeriod!!.end))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.performer[0].role!!.coding[0].system))
        assertTrue(stringMatch("01.000", obj.performer[0].role!!.coding[0].code))
        assertTrue(stringMatch("Arts", obj.performer[0].role!!.coding[0].display))
        assertTrue(stringMatch("Care role", obj.performer[0].role!!.text))
        assertTrue(stringMatch("Practitioner/f003", obj.performer[0].actor.reference))
        assertTrue(stringMatch("M.I.M. Versteegh", obj.performer[0].actor.display))
        assertTrue(stringMatch("Malignant tumor of lung", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("39607008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Lung structure", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("improved blood circulation", obj.outcome!!.text))
        assertTrue(stringMatch("DiagnosticReport/f001", obj.report[0].reference))
        assertTrue(stringMatch("Lab results blood test", obj.report[0].display))
        assertTrue(stringMatch("described in care plan", obj.followUp[0].text))
    }

    fun `procedure-example-f002-lung Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-biopsy 319 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-biopsy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("biopsy", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category!!.coding[0].system))
        assertTrue(stringMatch("103693007", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Diagnostic procedure (procedu", obj.category!!.coding[0].display))
        assertTrue(stringMatch("Diagnostic procedure", obj.category!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("90105005", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Biopsy of soft tissue of fore", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Biopsy of suspected melanoma ", obj.code!!.text))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2014-02-03", obj.performedDateTime))
        assertTrue(stringMatch("Practitioner/example", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Dr Bert Biopser", obj.performer[0].actor.display))
        assertTrue(stringMatch("Dark lesion l) forearm. getti", obj.reasonCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.bodySite[0].coding[0].system))
        assertTrue(stringMatch("368225008", obj.bodySite[0].coding[0].code))
        assertTrue(stringMatch("Entire Left Forearm", obj.bodySite[0].coding[0].display))
        assertTrue(stringMatch("Left forearm", obj.bodySite[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.complication[0].coding[0].system))
        assertTrue(stringMatch("67750007", obj.complication[0].coding[0].code))
        assertTrue(stringMatch("Ineffective airway clearance ", obj.complication[0].coding[0].display))
        assertTrue(stringMatch("Ineffective airway clearance", obj.complication[0].text))
        assertTrue(stringMatch("Review in clinic", obj.followUp[0].text))
        assertTrue(stringMatch("Standard Biopsy", obj.note[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.usedCode[0].coding[0].system))
        assertTrue(stringMatch("79068005", obj.usedCode[0].coding[0].code))
        assertTrue(stringMatch("Needle, device (physical obje", obj.usedCode[0].coding[0].display))
        assertTrue(stringMatch("30-guage needle", obj.usedCode[0].text))
    }

    fun `procedure-example-biopsy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `procedure-example-ob 320 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/procedure-example-ob.json").readTextAndClose()
        val obj = mapper.fromJson(json, Procedure::class.java)
        assertTrue(stringMatch("Procedure", obj.resourceType))
        assertTrue(stringMatch("ob", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.category!!.coding[0].system))
        assertTrue(stringMatch("386637004", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Obstetric procedure (procedur", obj.category!!.coding[0].display))
        assertTrue(stringMatch("OB", obj.category!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("22633006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Vaginal delivery, medical per", obj.code!!.coding[0].display))
        assertTrue(stringMatch("Vaginal delivery", obj.code!!.text))
        assertTrue(stringMatch("Jane Doe", obj.subject.display))
        assertTrue(stringMatch("2012-06-02", obj.performedDateTime))
        assertTrue(stringMatch("Martha Midwife, RNP", obj.performer[0].actor.display))
        assertTrue(stringMatch("Women’s Hospital", obj.location!!.display))
        assertTrue(stringMatch("term pregnancy, active labor", obj.reasonCode[0].text))
        assertTrue(stringMatch("delivery of healthy male infa", obj.outcome!!.text))
    }

    fun `procedure-example-ob Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
