package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CodeSystemDataTest : DataTests() {
    @Test
    fun `codesystem-list-example-codes 435 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/codesystem-list-example-codes.json").readTextAndClose()
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("list-example-codes", obj.id))
        assertTrue(stringMatch("2017-04-19T07:44:43.294+10:00", obj.meta!!.lastUpdated))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.meta!!.profile[0]))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[0].url))
        assertTrue(stringMatch("Informative", obj.extension[0].valueString))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[1].url))
        assertEquals(1, obj.extension[1].valueInteger)
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[2].url))
        assertTrue(stringMatch("fhir", obj.extension[2].valueCode))
        assertTrue(stringMatch("http://hl7.org/fhir/list-exam", obj.url))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier!!.system))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.4.6", obj.identifier!!.value))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Example Use Codes for List", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Example use codes for the Lis", obj.description))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: obj.caseSensitive")
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.valueSet))
        assertTrue(stringMatch("complete", obj.content))
        assertTrue(stringMatch("alerts", obj.concept[0].code))
        assertTrue(stringMatch("Alerts", obj.concept[0].display))
        assertTrue(stringMatch("A list of alerts for the pati", obj.concept[0].definition))
        assertTrue(stringMatch("adverserxns", obj.concept[1].code))
        assertTrue(stringMatch("Adverse Reactions", obj.concept[1].display))
        assertTrue(stringMatch("A list of part adverse reacti", obj.concept[1].definition))
        assertTrue(stringMatch("allergies", obj.concept[2].code))
        assertTrue(stringMatch("Allergies", obj.concept[2].display))
        assertTrue(stringMatch("A list of Allergies for the p", obj.concept[2].definition))
        assertTrue(stringMatch("medications", obj.concept[3].code))
        assertTrue(stringMatch("Medication List", obj.concept[3].display))
        assertTrue(stringMatch("A list of medication statemen", obj.concept[3].definition))
        assertTrue(stringMatch("problems", obj.concept[4].code))
        assertTrue(stringMatch("Problem List", obj.concept[4].display))
        assertTrue(stringMatch("A list of problems that the p", obj.concept[4].definition))
        assertTrue(stringMatch("worklist", obj.concept[5].code))
        assertTrue(stringMatch("Worklist", obj.concept[5].display))
        assertTrue(stringMatch("A list of items that constitu", obj.concept[5].definition))
        assertTrue(stringMatch("waiting", obj.concept[6].code))
        assertTrue(stringMatch("Waiting List", obj.concept[6].display))
        assertTrue(stringMatch("A list of items waiting for a", obj.concept[6].definition))
        assertTrue(stringMatch("protocols", obj.concept[7].code))
        assertTrue(stringMatch("Protocols", obj.concept[7].display))
        assertTrue(stringMatch("A set of protocols to be foll", obj.concept[7].definition))
        assertTrue(stringMatch("plans", obj.concept[8].code))
        assertTrue(stringMatch("Care Plans", obj.concept[8].display))
        assertTrue(stringMatch("A set of care plans that appl", obj.concept[8].definition))
    }

    fun `codesystem-list-example-codes Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `codesystem-example-summary 436 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/codesystem-example-summary.json").readTextAndClose()
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("summary", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
    }

    @Test
    fun `codesystem-example-summary 437 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/codesystem-example-summary.json").readTextAndClose()
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("http://hl7.org/fhir/CodeSyste", obj.url))
        assertTrue(stringMatch("Code system summary example f", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("This is an example code syste", obj.description))
        assertTrue(stringMatch("http://example.org/CodeSystem", obj.useContext[0].code.system))
        assertTrue(stringMatch("species", obj.useContext[0].code.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("337915000", obj.useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Homo sapiens (organism)", obj.useContext[0].valueCodeableConcept.coding[0].display))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("CA", obj.jurisdiction[0].coding[0].code))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: obj.caseSensitive")
        assertTrue(stringMatch("not-present", obj.content))
        assertEquals(92, obj.count)
    }

    fun `codesystem-example-summary Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `codesystem-example 438 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/codesystem-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, CodeSystem::class.java)
        assertTrue(stringMatch("CodeSystem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.meta!!.profile[0]))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/CodeSyste", obj.url))
        assertTrue(stringMatch("http://acme.com/identifiers/c", obj.identifier!!.system))
        assertTrue(stringMatch("internal-cholesterol-inl", obj.identifier!!.value))
        assertTrue(stringMatch("20160128", obj.version))
        assertTrue(stringMatch("ACME Codes for Cholesterol in", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2016-01-28", obj.date))
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("This is an example code syste", obj.description))
        assertEquals(true, if (obj.caseSensitive != null) obj.caseSensitive else false, "Field: obj.caseSensitive")
        assertTrue(stringMatch("complete", obj.content))
        assertTrue(stringMatch("chol-mmol", obj.concept[0].code))
        assertTrue(stringMatch("SChol (mmol/L)", obj.concept[0].display))
        assertTrue(stringMatch("Serum Cholesterol, in mmol/L", obj.concept[0].definition))
        assertTrue(stringMatch("http://acme.com/config/fhir/c", obj.concept[0].designation[0].use!!.system))
        assertTrue(stringMatch("internal-label", obj.concept[0].designation[0].use!!.code))
        assertTrue(stringMatch("From ACME POC Testing", obj.concept[0].designation[0].value))
        assertTrue(stringMatch("chol-mass", obj.concept[1].code))
        assertTrue(stringMatch("SChol (mg/L)", obj.concept[1].display))
        assertTrue(stringMatch("Serum Cholesterol, in mg/L", obj.concept[1].definition))
        assertTrue(stringMatch("http://acme.com/config/fhir/c", obj.concept[1].designation[0].use!!.system))
        assertTrue(stringMatch("internal-label", obj.concept[1].designation[0].use!!.code))
        assertTrue(stringMatch("From Paragon Labs", obj.concept[1].designation[0].value))
        assertTrue(stringMatch("chol", obj.concept[2].code))
        assertTrue(stringMatch("SChol", obj.concept[2].display))
        assertTrue(stringMatch("Serum Cholesterol", obj.concept[2].definition))
        assertTrue(stringMatch("http://acme.com/config/fhir/c", obj.concept[2].designation[0].use!!.system))
        assertTrue(stringMatch("internal-label", obj.concept[2].designation[0].use!!.code))
        assertTrue(stringMatch("Obdurate Labs uses this with ", obj.concept[2].designation[0].value))
    }

    fun `codesystem-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
