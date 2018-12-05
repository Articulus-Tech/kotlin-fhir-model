package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ImmunizationDataTest : DataTests() {
    @Test
    fun `immunization-example 418 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/immunization-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier[0].value))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notGiven != null) obj.notGiven else false, "Field: obj.notGiven")
        assertTrue(stringMatch("urn:oid:1.2.36.1.2001.1005.17", obj.vaccineCode.coding[0].system))
        assertTrue(stringMatch("FLUVAX", obj.vaccineCode.coding[0].code))
        assertTrue(stringMatch("Fluvax (Influenza)", obj.vaccineCode.text))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("Encounter/example", obj.encounter!!.reference))
        assertTrue(stringMatch("2013-01-10", obj.date))
        assertEquals(true, if (obj.primarySource != null) obj.primarySource else false, "Field: obj.primarySource")
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("Organization/hl7", obj.manufacturer!!.reference))
        assertTrue(stringMatch("AAJN11K", obj.lotNumber))
        assertTrue(stringMatch("2015-02-15", obj.expirationDate))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActSit", obj.site!!.coding[0].system))
        assertTrue(stringMatch("LA", obj.site!!.coding[0].code))
        assertTrue(stringMatch("left arm", obj.site!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RouteO", obj.route!!.coding[0].system))
        assertTrue(stringMatch("IM", obj.route!!.coding[0].code))
        assertTrue(stringMatch("Injection, intramuscular", obj.route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.doseQuantity!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.doseQuantity!!.system))
        assertTrue(stringMatch("mg", obj.doseQuantity!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0443", obj.practitioner[0].role!!.coding[0].system))
        assertTrue(stringMatch("OP", obj.practitioner[0].role!!.coding[0].code))
        assertTrue(stringMatch("Practitioner/example", obj.practitioner[0].actor.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0443", obj.practitioner[1].role!!.coding[0].system))
        assertTrue(stringMatch("AP", obj.practitioner[1].role!!.coding[0].code))
        assertTrue(stringMatch("Practitioner/example", obj.practitioner[1].actor.reference))
        assertTrue(stringMatch("Notes on adminstration of vac", obj.note[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.explanation!!.reason[0].coding[0].system))
        assertTrue(stringMatch("429060002", obj.explanation!!.reason[0].coding[0].code))
        assertTrue(stringMatch("2013-01-10", obj.reaction[0].date))
        assertTrue(stringMatch("Observation/example", obj.reaction[0].detail!!.reference))
        assertEquals(true, if (obj.reaction[0].reported != null) obj.reaction[0].reported else false, "Field: obj.reaction[0].reported")
        assertEquals(1, obj.vaccinationProtocol[0].doseSequence)
        assertTrue(stringMatch("Vaccination Protocol Sequence", obj.vaccinationProtocol[0].description))
        assertTrue(stringMatch("Organization/hl7", obj.vaccinationProtocol[0].authority!!.reference))
        assertTrue(stringMatch("Vaccination Series 1", obj.vaccinationProtocol[0].series))
        assertEquals(2, obj.vaccinationProtocol[0].seriesDoses)
        assertTrue(stringMatch("http://snomed.info/sct", obj.vaccinationProtocol[0].targetDisease[0].coding[0].system))
        assertTrue(stringMatch("1857005", obj.vaccinationProtocol[0].targetDisease[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/vaccinati", obj.vaccinationProtocol[0].doseStatus.coding[0].system))
        assertTrue(stringMatch("count", obj.vaccinationProtocol[0].doseStatus.coding[0].code))
        assertTrue(stringMatch("Counts", obj.vaccinationProtocol[0].doseStatus.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/vaccinati", obj.vaccinationProtocol[0].doseStatusReason!!.coding[0].system))
        assertTrue(stringMatch("coldchbrk", obj.vaccinationProtocol[0].doseStatusReason!!.coding[0].code))
        assertTrue(stringMatch("Cold chain break", obj.vaccinationProtocol[0].doseStatusReason!!.coding[0].display))
    }

    fun `immunization-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `immunization-example-historical 419 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/immunization-example-historical.json").readTextAndClose()
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("historical", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier[0].value))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notGiven != null) obj.notGiven else false, "Field: obj.notGiven")
        assertTrue(stringMatch("urn:oid:1.2.36.1.2001.1005.17", obj.vaccineCode.coding[0].system))
        assertTrue(stringMatch("GNFLU", obj.vaccineCode.coding[0].code))
        assertTrue(stringMatch("Influenza", obj.vaccineCode.text))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("2012-01-15", obj.date))
        assertEquals(false, if (obj.primarySource != null) obj.primarySource else false, "Field: obj.primarySource")
        assertTrue(stringMatch("http://hl7.org/fhir/immunizat", obj.reportOrigin!!.coding[0].system))
        assertTrue(stringMatch("record", obj.reportOrigin!!.coding[0].code))
        assertTrue(stringMatch("Written Record", obj.reportOrigin!!.text))
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("Notes on adminstration of a h", obj.note[0].text))
    }

    fun `immunization-example-historical Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `immunization-example-refused 420 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/immunization-example-refused.json").readTextAndClose()
        val obj = mapper.fromJson(json, Immunization::class.java)
        assertTrue(stringMatch("Immunization", obj.resourceType))
        assertTrue(stringMatch("notGiven", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(true, if (obj.notGiven != null) obj.notGiven else false, "Field: obj.notGiven")
        assertTrue(stringMatch("http://hl7.org/fhir/sid/cvx", obj.vaccineCode.coding[0].system))
        assertTrue(stringMatch("01", obj.vaccineCode.coding[0].code))
        assertTrue(stringMatch("DTP", obj.vaccineCode.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("2013-01-10", obj.date))
        assertEquals(true, if (obj.primarySource != null) obj.primarySource else false, "Field: obj.primarySource")
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.explanation!!.reasonNotGiven[0].coding[0].system))
        assertTrue(stringMatch("MEDPREC", obj.explanation!!.reasonNotGiven[0].coding[0].code))
        assertTrue(stringMatch("medical precaution", obj.explanation!!.reasonNotGiven[0].coding[0].display))
    }

    fun `immunization-example-refused Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
