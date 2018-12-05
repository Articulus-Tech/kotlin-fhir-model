package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class EncounterDataTest : DataTests() {
    @Test
    fun `encounter-example-home 333 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-home.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("home", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Location", (obj.contained[0] as Location).resourceType))
        assertTrue(stringMatch("home", (obj.contained[0] as Location).id))
        assertTrue(stringMatch("Client's home", (obj.contained[0] as Location).description))
        assertTrue(stringMatch("kind", (obj.contained[0] as Location).mode))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("HH", obj.class_fhir!!.code))
        assertTrue(stringMatch("home health", obj.class_fhir!!.display))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("2015-01-17T16:00:00+10:00", obj.participant[0].period!!.start))
        assertTrue(stringMatch("2015-01-17T16:30:00+10:00", obj.participant[0].period!!.end))
        assertTrue(stringMatch("Practitioner/example", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.participant[0].individual!!.display))
        assertTrue(stringMatch("2015-01-17T16:00:00+10:00", obj.period!!.start))
        assertTrue(stringMatch("2015-01-17T16:30:00+10:00", obj.period!!.end))
        assertTrue(stringMatch("#home", obj.location[0].location.reference))
        assertTrue(stringMatch("Client's home", obj.location[0].location.display))
        assertTrue(stringMatch("completed", obj.location[0].status))
        assertTrue(stringMatch("2015-01-17T16:00:00+10:00", obj.location[0].period!!.start))
        assertTrue(stringMatch("2015-01-17T16:30:00+10:00", obj.location[0].period!!.end))
    }

    fun `encounter-example-home Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f201-20130404 334 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f201-20130404.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("temp", obj.identifier[0].use))
        assertTrue(stringMatch("Encounter_Roel_20130404", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("11429006", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Consultation", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("17621005", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Normal", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject!!.reference))
        assertTrue(stringMatch("Roel", obj.subject!!.display))
        assertTrue(stringMatch("Practitioner/f201", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("The patient had fever peaks o", obj.reason[0].text))
        assertTrue(stringMatch("Organization/f201", obj.serviceProvider!!.reference))
    }

    fun `encounter-example-f201-20130404 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f003-abscess 335 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f003-abscess.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.bmc.nl/zorgportal/", obj.identifier[0].system))
        assertTrue(stringMatch("v6751", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("270427003", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Patient-initiated encounter", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("103391001", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Non-urgent ear, nose and thro", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject!!.display))
        assertTrue(stringMatch("Practitioner/f001", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("E.M. van den Broek", obj.participant[0].individual!!.display))
        assertTrue(stringMatch("%.2f".format(90f), "%.2f".format(obj.length!!.value)))
        assertTrue(stringMatch("min", obj.length!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.length!!.system))
        assertTrue(stringMatch("min", obj.length!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.reason[0].extension[0].url))
        assertEquals(1, obj.reason[0].extension[0].valuePositiveInt)
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("18099001", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("Retropharyngeal abscess", obj.reason[0].coding[0].display))
        assertTrue(stringMatch("official", obj.hospitalization!!.preAdmissionIdentifier!!.use))
        assertTrue(stringMatch("http://www.bmc.nl/zorgportal/", obj.hospitalization!!.preAdmissionIdentifier!!.system))
        assertTrue(stringMatch("93042", obj.hospitalization!!.preAdmissionIdentifier!!.value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.admitSource!!.coding[0].system))
        assertTrue(stringMatch("305956004", obj.hospitalization!!.admitSource!!.coding[0].code))
        assertTrue(stringMatch("Referral by physician", obj.hospitalization!!.admitSource!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.dischargeDisposition!!.coding[0].system))
        assertTrue(stringMatch("306689006", obj.hospitalization!!.dischargeDisposition!!.coding[0].code))
        assertTrue(stringMatch("Discharge to home", obj.hospitalization!!.dischargeDisposition!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.serviceProvider!!.reference))
    }

    fun `encounter-example-f003-abscess Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example 336 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("in-progress", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("IMP", obj.class_fhir!!.code))
        assertTrue(stringMatch("inpatient encounter", obj.class_fhir!!.display))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
    }

    fun `encounter-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f002-lung 337 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f002-lung.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.bmc.nl/zorgportal/", obj.identifier[0].system))
        assertTrue(stringMatch("v3251", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("270427003", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Patient-initiated encounter", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("103391001", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Urgent", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject!!.display))
        assertTrue(stringMatch("Practitioner/f003", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("M.I.M Versteegh", obj.participant[0].individual!!.display))
        assertTrue(stringMatch("%.2f".format(140f), "%.2f".format(obj.length!!.value)))
        assertTrue(stringMatch("min", obj.length!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.length!!.system))
        assertTrue(stringMatch("min", obj.length!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("34068001", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("Partial lobectomy of lung", obj.reason[0].coding[0].display))
        assertTrue(stringMatch("official", obj.hospitalization!!.preAdmissionIdentifier!!.use))
        assertTrue(stringMatch("http://www.bmc.nl/zorgportal/", obj.hospitalization!!.preAdmissionIdentifier!!.system))
        assertTrue(stringMatch("98682", obj.hospitalization!!.preAdmissionIdentifier!!.value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.admitSource!!.coding[0].system))
        assertTrue(stringMatch("305997006", obj.hospitalization!!.admitSource!!.coding[0].code))
        assertTrue(stringMatch("Referral by radiologist", obj.hospitalization!!.admitSource!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.dischargeDisposition!!.coding[0].system))
        assertTrue(stringMatch("306689006", obj.hospitalization!!.dischargeDisposition!!.coding[0].code))
        assertTrue(stringMatch("Discharge to home", obj.hospitalization!!.dischargeDisposition!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.serviceProvider!!.reference))
        assertTrue(stringMatch("BMC", obj.serviceProvider!!.display))
    }

    fun `encounter-example-f002-lung Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f203-20130311 338 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f203-20130311.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("temp", obj.identifier[0].use))
        assertTrue(stringMatch("Encounter_Roel_20130311", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("arrived", obj.statusHistory[0].status))
        assertTrue(stringMatch("2013-03-08", obj.statusHistory[0].period.start))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("IMP", obj.class_fhir!!.code))
        assertTrue(stringMatch("inpatient encounter", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("183807002", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Inpatient stay for nine days", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("394849002", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("High priority", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject!!.reference))
        assertTrue(stringMatch("Roel", obj.subject!!.display))
        assertTrue(stringMatch("EpisodeOfCare/example", obj.episodeOfCare[0].reference))
        assertTrue(stringMatch("ReferralRequest/example", obj.incomingReferral[0].reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.participant[0].type[0].coding[0].system))
        assertTrue(stringMatch("PART", obj.participant[0].type[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/f201", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("Appointment/example", obj.appointment!!.reference))
        assertTrue(stringMatch("2013-03-11", obj.period!!.start))
        assertTrue(stringMatch("2013-03-20", obj.period!!.end))
        assertTrue(stringMatch("The patient seems to suffer f", obj.reason[0].text))
        assertTrue(stringMatch("Condition/stroke", obj.diagnosis[0].condition.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/diagnosis", obj.diagnosis[0].role!!.coding[0].system))
        assertTrue(stringMatch("AD", obj.diagnosis[0].role!!.coding[0].code))
        assertTrue(stringMatch("Admission diagnosis", obj.diagnosis[0].role!!.coding[0].display))
        assertEquals(1, obj.diagnosis[0].rank)
        assertTrue(stringMatch("Condition/f201", obj.diagnosis[1].condition.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/diagnosis", obj.diagnosis[1].role!!.coding[0].system))
        assertTrue(stringMatch("DD", obj.diagnosis[1].role!!.coding[0].code))
        assertTrue(stringMatch("Discharge diagnosis", obj.diagnosis[1].role!!.coding[0].display))
        assertTrue(stringMatch("Account/example", obj.account[0].reference))
        assertTrue(stringMatch("Location/2", obj.hospitalization!!.origin!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.admitSource!!.coding[0].system))
        assertTrue(stringMatch("309902002", obj.hospitalization!!.admitSource!!.coding[0].code))
        assertTrue(stringMatch("Clinical Oncology Department", obj.hospitalization!!.admitSource!!.coding[0].display))
        assertTrue(stringMatch("readmitted", obj.hospitalization!!.reAdmission!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.dietPreference[0].coding[0].system))
        assertTrue(stringMatch("276026009", obj.hospitalization!!.dietPreference[0].coding[0].code))
        assertTrue(stringMatch("Fluid balance regulation", obj.hospitalization!!.dietPreference[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Encoun", obj.hospitalization!!.specialCourtesy[0].coding[0].system))
        assertTrue(stringMatch("NRM", obj.hospitalization!!.specialCourtesy[0].coding[0].code))
        assertTrue(stringMatch("normal courtesy", obj.hospitalization!!.specialCourtesy[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/encounter", obj.hospitalization!!.specialArrangement[0].coding[0].system))
        assertTrue(stringMatch("wheel", obj.hospitalization!!.specialArrangement[0].coding[0].code))
        assertTrue(stringMatch("Wheelchair", obj.hospitalization!!.specialArrangement[0].coding[0].display))
        assertTrue(stringMatch("Location/2", obj.hospitalization!!.destination!!.reference))
        assertTrue(stringMatch("Organization/2", obj.serviceProvider!!.reference))
        assertTrue(stringMatch("Encounter/f203", obj.partOf!!.reference))
    }

    fun `encounter-example-f203-20130311 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-xcda 339 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-xcda.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("xcda", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://healthcare.example.org", obj.identifier[0].system))
        assertTrue(stringMatch("1234213.52345873", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
    }

    @Test
    fun `encounter-example-xcda 340 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-xcda.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("Patient/xcda", obj.subject!!.reference))
        assertTrue(stringMatch("Practitioner/xcda1", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("http://ihe.net/xds/connectath", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("T-D8200", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("Arm", obj.reason[0].coding[0].display))
    }

    fun `encounter-example-xcda Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f202-20130128 341 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f202-20130128.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("temp", obj.identifier[0].use))
        assertTrue(stringMatch("Encounter_Roel_20130128", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("367336001", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Chemotherapy", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("103391001", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Urgent", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f201", obj.subject!!.reference))
        assertTrue(stringMatch("Roel", obj.subject!!.display))
        assertTrue(stringMatch("Practitioner/f201", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("%.2f".format(56f), "%.2f".format(obj.length!!.value)))
        assertTrue(stringMatch("minutes", obj.length!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.length!!.system))
        assertTrue(stringMatch("min", obj.length!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.reason[0].extension[0].url))
        assertEquals(2, obj.reason[0].extension[0].valuePositiveInt)
        assertTrue(stringMatch("The patient is treated for a ", obj.reason[0].text))
        assertTrue(stringMatch("Complications from Roel's TPF", obj.diagnosis[0].condition.display))
        assertTrue(stringMatch("http://hl7.org/fhir/diagnosis", obj.diagnosis[0].role!!.coding[0].system))
        assertTrue(stringMatch("AD", obj.diagnosis[0].role!!.coding[0].code))
        assertTrue(stringMatch("Admission diagnosis", obj.diagnosis[0].role!!.coding[0].display))
        assertEquals(1, obj.diagnosis[0].rank)
        assertTrue(stringMatch("Organization/f201", obj.serviceProvider!!.reference))
    }

    fun `encounter-example-f202-20130128 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-emerg 342 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-emerg.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("emerg", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("in-progress", obj.status))
        assertTrue(stringMatch("arrived", obj.statusHistory[0].status))
        assertTrue(stringMatch("2017-02-01T07:15:00+10:00", obj.statusHistory[0].period.start))
        assertTrue(stringMatch("2017-02-01T07:35:00+10:00", obj.statusHistory[0].period.end))
        assertTrue(stringMatch("triaged", obj.statusHistory[1].status))
        assertTrue(stringMatch("2017-02-01T07:35:00+10:00", obj.statusHistory[1].period.start))
        assertTrue(stringMatch("2017-02-01T08:45:00+10:00", obj.statusHistory[1].period.end))
        assertTrue(stringMatch("in-progress", obj.statusHistory[2].status))
        assertTrue(stringMatch("2017-02-01T08:45:00+10:00", obj.statusHistory[2].period.start))
        assertTrue(stringMatch("2017-02-01T12:15:00+10:00", obj.statusHistory[2].period.end))
        assertTrue(stringMatch("onleave", obj.statusHistory[3].status))
        assertTrue(stringMatch("2017-02-01T12:15:00+10:00", obj.statusHistory[3].period.start))
        assertTrue(stringMatch("2017-02-01T12:45:00+10:00", obj.statusHistory[3].period.end))
        assertTrue(stringMatch("in-progress", obj.statusHistory[4].status))
        assertTrue(stringMatch("2017-02-01T12:45:00+10:00", obj.statusHistory[4].period.start))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("IMP", obj.class_fhir!!.code))
        assertTrue(stringMatch("inpatient encounter", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.classHistory[0].class_fhir.system))
        assertTrue(stringMatch("EMER", obj.classHistory[0].class_fhir.code))
        assertTrue(stringMatch("emergency", obj.classHistory[0].class_fhir.display))
        assertTrue(stringMatch("2017-02-01T07:15:00+10:00", obj.classHistory[0].period.start))
        assertTrue(stringMatch("2017-02-01T09:27:00+10:00", obj.classHistory[0].period.end))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.classHistory[1].class_fhir.system))
        assertTrue(stringMatch("IMP", obj.classHistory[1].class_fhir.code))
        assertTrue(stringMatch("inpatient encounter", obj.classHistory[1].class_fhir.display))
        assertTrue(stringMatch("2017-02-01T09:27:00+10:00", obj.classHistory[1].period.start))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("2017-02-01T07:15:00+10:00", obj.period!!.start))
        assertTrue(stringMatch("http://hl7.org/fhir/admit-sou", obj.hospitalization!!.admitSource!!.coding[0].system))
        assertTrue(stringMatch("emd", obj.hospitalization!!.admitSource!!.coding[0].code))
        assertTrue(stringMatch("From accident/emergency depar", obj.hospitalization!!.admitSource!!.coding[0].display))
        assertTrue(stringMatch("Emergency Waiting Room", obj.location[0].location.display))
        assertTrue(stringMatch("active", obj.location[0].status))
        assertTrue(stringMatch("2017-02-01T07:15:00+10:00", obj.location[0].period!!.start))
        assertTrue(stringMatch("2017-02-01T08:45:00+10:00", obj.location[0].period!!.end))
        assertTrue(stringMatch("Emergency", obj.location[1].location.display))
        assertTrue(stringMatch("active", obj.location[1].status))
        assertTrue(stringMatch("2017-02-01T08:45:00+10:00", obj.location[1].period!!.start))
        assertTrue(stringMatch("2017-02-01T09:27:00+10:00", obj.location[1].period!!.end))
        assertTrue(stringMatch("Ward 1, Room 42, Bed 1", obj.location[2].location.display))
        assertTrue(stringMatch("active", obj.location[2].status))
        assertTrue(stringMatch("2017-02-01T09:27:00+10:00", obj.location[2].period!!.start))
        assertTrue(stringMatch("2017-02-01T12:15:00+10:00", obj.location[2].period!!.end))
        assertTrue(stringMatch("Ward 1, Room 42, Bed 1", obj.location[3].location.display))
        assertTrue(stringMatch("reserved", obj.location[3].status))
        assertTrue(stringMatch("2017-02-01T12:15:00+10:00", obj.location[3].period!!.start))
        assertTrue(stringMatch("2017-02-01T12:45:00+10:00", obj.location[3].period!!.end))
        assertTrue(stringMatch("Ward 1, Room 42, Bed 1", obj.location[4].location.display))
        assertTrue(stringMatch("active", obj.location[4].status))
        assertTrue(stringMatch("2017-02-01T12:45:00+10:00", obj.location[4].period!!.start))
    }

    fun `encounter-example-emerg Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `encounter-example-f001-heart 343 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/encounter-example-f001-heart.json").readTextAndClose()
        val obj = mapper.fromJson(json, Encounter::class.java)
        assertTrue(stringMatch("Encounter", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.amc.nl/zorgportal/", obj.identifier[0].system))
        assertTrue(stringMatch("v1451", obj.identifier[0].value))
        assertTrue(stringMatch("finished", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.class_fhir!!.system))
        assertTrue(stringMatch("AMB", obj.class_fhir!!.code))
        assertTrue(stringMatch("ambulatory", obj.class_fhir!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("270427003", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Patient-initiated encounter", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.priority!!.coding[0].system))
        assertTrue(stringMatch("310361003", obj.priority!!.coding[0].code))
        assertTrue(stringMatch("Non-urgent cardiological admi", obj.priority!!.coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.subject!!.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject!!.display))
        assertTrue(stringMatch("Practitioner/f002", obj.participant[0].individual!!.reference))
        assertTrue(stringMatch("P. Voigt", obj.participant[0].individual!!.display))
        assertTrue(stringMatch("%.2f".format(140f), "%.2f".format(obj.length!!.value)))
        assertTrue(stringMatch("min", obj.length!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.length!!.system))
        assertTrue(stringMatch("min", obj.length!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("34068001", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("Heart valve replacement", obj.reason[0].coding[0].display))
        assertTrue(stringMatch("official", obj.hospitalization!!.preAdmissionIdentifier!!.use))
        assertTrue(stringMatch("http://www.amc.nl/zorgportal/", obj.hospitalization!!.preAdmissionIdentifier!!.system))
        assertTrue(stringMatch("93042", obj.hospitalization!!.preAdmissionIdentifier!!.value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.admitSource!!.coding[0].system))
        assertTrue(stringMatch("305956004", obj.hospitalization!!.admitSource!!.coding[0].code))
        assertTrue(stringMatch("Referral by physician", obj.hospitalization!!.admitSource!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.hospitalization!!.dischargeDisposition!!.coding[0].system))
        assertTrue(stringMatch("306689006", obj.hospitalization!!.dischargeDisposition!!.coding[0].code))
        assertTrue(stringMatch("Discharge to home", obj.hospitalization!!.dischargeDisposition!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.serviceProvider!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.serviceProvider!!.display))
    }

    fun `encounter-example-f001-heart Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
