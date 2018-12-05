package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ValueSetDataTest : DataTests() {
    @Test
    fun `valueset-example 208 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-extensional", obj.id))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.meta!!.profile[0]))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("http://acme.com/identifiers/v", obj.identifier[0].system))
        assertTrue(stringMatch("loinc-cholesterol-int", obj.identifier[0].value))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol i", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2015-06-22", obj.date))
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("This is an example value set ", obj.description))
        assertTrue(stringMatch("This content from LOINC ® is ", obj.copyright))
        assertTrue(stringMatch("2012-06-13", obj.compose!!.lockedDate))
        assertEquals(true, if (obj.compose!!.inactive != null) obj.compose!!.inactive else false, "Field: obj.compose!!.inactive")
        assertTrue(stringMatch("http://loinc.org", obj.compose!!.include[0].system))
        assertTrue(stringMatch("2.36", obj.compose!!.include[0].version))
        assertTrue(stringMatch("14647-2", obj.compose!!.include[0].concept[0].code))
        assertTrue(stringMatch("Cholesterol [Moles/Volume]", obj.compose!!.include[0].concept[0].display))
        assertTrue(stringMatch("2093-3", obj.compose!!.include[0].concept[1].code))
        assertTrue(stringMatch("Cholesterol [Mass/Volume]", obj.compose!!.include[0].concept[1].display))
        assertTrue(stringMatch("35200-5", obj.compose!!.include[0].concept[2].code))
        assertTrue(stringMatch("Cholesterol [Mass Or Moles/Vo", obj.compose!!.include[0].concept[2].display))
        assertTrue(stringMatch("9342-7", obj.compose!!.include[0].concept[3].code))
        assertTrue(stringMatch("Cholesterol [Percentile]", obj.compose!!.include[0].concept[3].display))
    }

    fun `valueset-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `valueset-example-expansion 209 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-example-expansion.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-expansion", obj.id))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.meta!!.profile[0]))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol i", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2015-06-22", obj.date))
        assertTrue(stringMatch("FHIR Project team", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("This is an example value set ", obj.description))
        assertTrue(stringMatch("This content from LOINC® is c", obj.copyright))
        assertTrue(stringMatch("http://loinc.org", obj.compose!!.include[0].system))
        assertTrue(stringMatch("parent", obj.compose!!.include[0].filter[0].property))
        assertTrue(stringMatch("=", obj.compose!!.include[0].filter[0].op))
        assertTrue(stringMatch("LP43571-6", obj.compose!!.include[0].filter[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.expansion!!.extension[0].url))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.expansion!!.extension[0].valueUri))
        assertTrue(stringMatch("urn:uuid:42316ff8-2714-4680-9", obj.expansion!!.identifier))
        assertTrue(stringMatch("2015-06-22T13:56:07Z", obj.expansion!!.timestamp))
        assertEquals(8, obj.expansion!!.total)
        assertEquals(0, obj.expansion!!.offset)
        assertTrue(stringMatch("version", obj.expansion!!.parameter[0].name))
        assertTrue(stringMatch("2.50", obj.expansion!!.parameter[0].valueString))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[0].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[0].version))
        assertTrue(stringMatch("14647-2", obj.expansion!!.contains[0].code))
        assertTrue(stringMatch("Cholesterol [Moles/volume] in", obj.expansion!!.contains[0].display))
        assertEquals(true, if (obj.expansion!!.contains[1].abstract != null) obj.expansion!!.contains[1].abstract else false, "Field: obj.expansion!!.contains[1].abstract")
        assertTrue(stringMatch("Cholesterol codes", obj.expansion!!.contains[1].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[1].contains[0].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[1].contains[0].version))
        assertTrue(stringMatch("2093-3", obj.expansion!!.contains[1].contains[0].code))
        assertTrue(stringMatch("Cholesterol [Mass/volume] in ", obj.expansion!!.contains[1].contains[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[1].contains[1].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[1].contains[1].version))
        assertTrue(stringMatch("48620-9", obj.expansion!!.contains[1].contains[1].code))
        assertTrue(stringMatch("Cholesterol [Mass/volume] in ", obj.expansion!!.contains[1].contains[1].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[1].contains[2].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[1].contains[2].version))
        assertTrue(stringMatch("9342-7", obj.expansion!!.contains[1].contains[2].code))
        assertTrue(stringMatch("Cholesterol [Percentile]", obj.expansion!!.contains[1].contains[2].display))
        assertEquals(true, if (obj.expansion!!.contains[2].abstract != null) obj.expansion!!.contains[2].abstract else false, "Field: obj.expansion!!.contains[2].abstract")
        assertTrue(stringMatch("Cholesterol Ratios", obj.expansion!!.contains[2].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[2].contains[0].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[2].contains[0].version))
        assertTrue(stringMatch("2096-6", obj.expansion!!.contains[2].contains[0].code))
        assertTrue(stringMatch("Cholesterol/Triglyceride [Mas", obj.expansion!!.contains[2].contains[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[2].contains[1].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[2].contains[1].version))
        assertTrue(stringMatch("35200-5", obj.expansion!!.contains[2].contains[1].code))
        assertTrue(stringMatch("Cholesterol/Triglyceride [Mas", obj.expansion!!.contains[2].contains[1].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[2].contains[2].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[2].contains[2].version))
        assertTrue(stringMatch("48089-7", obj.expansion!!.contains[2].contains[2].code))
        assertTrue(stringMatch("Cholesterol/Apolipoprotein B ", obj.expansion!!.contains[2].contains[2].display))
        assertTrue(stringMatch("http://loinc.org", obj.expansion!!.contains[2].contains[3].system))
        assertTrue(stringMatch("2.50", obj.expansion!!.contains[2].contains[3].version))
        assertTrue(stringMatch("55838-7", obj.expansion!!.contains[2].contains[3].code))
        assertTrue(stringMatch("Cholesterol/Phospholipid [Mol", obj.expansion!!.contains[2].contains[3].display))
    }

    fun `valueset-example-expansion Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `valueset-example-inactive 210 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-example-inactive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("inactive", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("Example-inactive", obj.name))
        assertTrue(stringMatch("Example with inactive codes", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("HL7 v3 ActMood Prdicate codes", obj.description))
        assertEquals(true, if (obj.compose!!.inactive != null) obj.compose!!.inactive else false, "Field: obj.compose!!.inactive")
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.compose!!.include[0].system))
        assertTrue(stringMatch("concept", obj.compose!!.include[0].filter[0].property))
        assertTrue(stringMatch("descendent-of", obj.compose!!.include[0].filter[0].op))
        assertTrue(stringMatch("_ActMoodPredicate", obj.compose!!.include[0].filter[0].value))
        assertTrue(stringMatch("urn:uuid:46c00b3f-003a-4f31-9", obj.expansion!!.identifier))
        assertTrue(stringMatch("2017-02-26T10:00:00Z", obj.expansion!!.timestamp))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.expansion!!.contains[0].system))
        assertEquals(true, if (obj.expansion!!.contains[0].inactive != null) obj.expansion!!.contains[0].inactive else false, "Field: obj.expansion!!.contains[0].inactive")
        assertTrue(stringMatch("CRT", obj.expansion!!.contains[0].code))
        assertTrue(stringMatch("criterion", obj.expansion!!.contains[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.expansion!!.contains[1].system))
        assertTrue(stringMatch("EXPEC", obj.expansion!!.contains[1].code))
        assertTrue(stringMatch("expectation", obj.expansion!!.contains[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.expansion!!.contains[1].contains[0].system))
        assertTrue(stringMatch("GOL", obj.expansion!!.contains[1].contains[0].code))
        assertTrue(stringMatch("goal", obj.expansion!!.contains[1].contains[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.expansion!!.contains[1].contains[1].system))
        assertTrue(stringMatch("RSK", obj.expansion!!.contains[1].contains[1].code))
        assertTrue(stringMatch("risk", obj.expansion!!.contains[1].contains[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActMoo", obj.expansion!!.contains[2].system))
        assertTrue(stringMatch("OPT", obj.expansion!!.contains[2].code))
        assertTrue(stringMatch("option", obj.expansion!!.contains[2].display))
    }

    fun `valueset-example-inactive Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `valueset-example-yesnodontknow 211 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-example-yesnodontknow.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("yesnodontknow", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("Yes/No/Don't Know", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("For Capturing simple yes-no-d", obj.description))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.compose!!.include[0].valueSet[0]))
        assertTrue(stringMatch("http://hl7.org/fhir/data-abse", obj.compose!!.include[1].system))
        assertTrue(stringMatch("asked", obj.compose!!.include[1].concept[0].code))
        assertTrue(stringMatch("Don't know", obj.compose!!.include[1].concept[0].display))
        assertTrue(stringMatch("urn:uuid:bf99fe50-2c2b-41ad-b", obj.expansion!!.identifier))
        assertTrue(stringMatch("2015-07-14T10:00:00Z", obj.expansion!!.timestamp))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0136", obj.expansion!!.contains[0].system))
        assertTrue(stringMatch("Y", obj.expansion!!.contains[0].code))
        assertTrue(stringMatch("Yes", obj.expansion!!.contains[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0136", obj.expansion!!.contains[1].system))
        assertTrue(stringMatch("N", obj.expansion!!.contains[1].code))
        assertTrue(stringMatch("No", obj.expansion!!.contains[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/data-abse", obj.expansion!!.contains[2].system))
        assertTrue(stringMatch("asked", obj.expansion!!.contains[2].code))
        assertTrue(stringMatch("Don't know", obj.expansion!!.contains[2].display))
    }

    fun `valueset-example-yesnodontknow Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `valueset-list-example-codes 212 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-list-example-codes.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
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
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.4.6", obj.identifier[0].value))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Example Use Codes for List", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2017-04-19T07:44:43+10:00", obj.date))
        assertTrue(stringMatch("FHIR Project", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Example use codes for the Lis", obj.description))
        assertEquals(true, if (obj.immutable != null) obj.immutable else false, "Field: obj.immutable")
        assertTrue(stringMatch("http://hl7.org/fhir/list-exam", obj.compose!!.include[0].system))
    }

    fun `valueset-list-example-codes Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `valueset-example-intensional 213 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/valueset-example-intensional.json").readTextAndClose()
        val obj = mapper.fromJson(json, ValueSet::class.java)
        assertTrue(stringMatch("ValueSet", obj.resourceType))
        assertTrue(stringMatch("example-intensional", obj.id))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.meta!!.profile[0]))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/ValueSet/", obj.url))
        assertTrue(stringMatch("http://acme.com/identifiers/v", obj.identifier[0].system))
        assertTrue(stringMatch("loinc-cholesterol-ext", obj.identifier[0].value))
        assertTrue(stringMatch("20150622", obj.version))
        assertTrue(stringMatch("LOINC Codes for Cholesterol i", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2015-06-22", obj.date))
        assertTrue(stringMatch("HL7 International", obj.publisher))
        assertTrue(stringMatch("FHIR project team", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("This is an example value set ", obj.description))
        assertTrue(stringMatch("This content from LOINCÂ® is ", obj.copyright))
        assertTrue(stringMatch("http://loinc.org", obj.compose!!.include[0].system))
        assertTrue(stringMatch("parent", obj.compose!!.include[0].filter[0].property))
        assertTrue(stringMatch("=", obj.compose!!.include[0].filter[0].op))
        assertTrue(stringMatch("LP43571-6", obj.compose!!.include[0].filter[0].value))
        assertTrue(stringMatch("http://loinc.org", obj.compose!!.exclude[0].system))
        assertTrue(stringMatch("5932-9", obj.compose!!.exclude[0].concept[0].code))
        assertTrue(stringMatch("Cholesterol [Presence] in Blo", obj.compose!!.exclude[0].concept[0].display))
    }

    fun `valueset-example-intensional Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
