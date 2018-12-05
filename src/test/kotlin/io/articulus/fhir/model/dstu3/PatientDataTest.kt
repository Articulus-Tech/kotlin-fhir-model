package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PatientDataTest : DataTests() {
    @Test
    fun `patient-example-xds 77 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-xds.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("xds", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:1.2.3.4.5", obj.identifier[0].system))
        assertTrue(stringMatch("89765a87b", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Doe", obj.name[0].family))
        assertTrue(stringMatch("John", obj.name[0].given[0]))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1956-05-27", obj.birthDate))
        assertTrue(stringMatch("100 Main St", obj.address[0].line[0]))
        assertTrue(stringMatch("Metropolis", obj.address[0].city))
        assertTrue(stringMatch("Il", obj.address[0].state))
        assertTrue(stringMatch("44130", obj.address[0].postalCode))
        assertTrue(stringMatch("USA", obj.address[0].country))
        assertTrue(stringMatch("Organization/2", obj.managingOrganization!!.reference))
    }

    fun `patient-example-xds Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-f001-pieter 78 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-f001-pieter.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[0].system))
        assertTrue(stringMatch("738472983", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("van de Heuvel", obj.name[0].family))
        assertTrue(stringMatch("Pieter", obj.name[0].given[0]))
        assertTrue(stringMatch("MSc", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0648352638", obj.telecom[0].value))
        assertTrue(stringMatch("mobile", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("p.heuvel@gmail.com", obj.telecom[1].value))
        assertTrue(stringMatch("home", obj.telecom[1].use))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1944-11-17", obj.birthDate))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("Van Egmondkade 23", obj.address[0].line[0]))
        assertTrue(stringMatch("Amsterdam", obj.address[0].city))
        assertTrue(stringMatch("1024 RJ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Marita", obj.maritalStatus!!.coding[0].system))
        assertTrue(stringMatch("M", obj.maritalStatus!!.coding[0].code))
        assertTrue(stringMatch("Married", obj.maritalStatus!!.coding[0].display))
        assertTrue(stringMatch("Getrouwd", obj.maritalStatus!!.text))
        assertEquals(true, if (obj.multipleBirthBoolean != null) obj.multipleBirthBoolean else false, "Field: obj.multipleBirthBoolean")
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.contact[0].relationship[0].coding[0].system))
        assertTrue(stringMatch("C", obj.contact[0].relationship[0].coding[0].code))
        assertTrue(stringMatch("usual", obj.contact[0].name!!.use))
        assertTrue(stringMatch("Abels", obj.contact[0].name!!.family))
        assertTrue(stringMatch("Sarah", obj.contact[0].name!!.given[0]))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("0690383372", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("mobile", obj.contact[0].telecom[0].use))
        assertTrue(stringMatch("urn:ietf:bcp:47", obj.communication[0].language.coding[0].system))
        assertTrue(stringMatch("nl", obj.communication[0].language.coding[0].code))
        assertTrue(stringMatch("Dutch", obj.communication[0].language.coding[0].display))
        assertTrue(stringMatch("Nederlands", obj.communication[0].language.text))
        assertEquals(true, if (obj.communication[0].preferred != null) obj.communication[0].preferred else false, "Field: obj.communication[0].preferred")
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.managingOrganization!!.display))
    }

    fun `patient-example-f001-pieter Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-d 79 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-d.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat4", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("123458", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Notsowell", obj.name[0].family))
        assertTrue(stringMatch("Sandy", obj.name[0].given[0]))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1982-08-02", obj.birthDate))
        assertEquals(true, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("ACME Healthcare, Inc", obj.managingOrganization!!.display))
    }

    fun `patient-example-d Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-genetics-example1 80 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-genetics-example1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("genetics-example1", obj.id))
        assertTrue(stringMatch("2012-05-29T23:45:32Z", obj.meta!!.lastUpdated))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("SS", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/us-ss", obj.identifier[0].system))
        assertTrue(stringMatch("444222222", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Everywoman", obj.name[0].family))
        assertTrue(stringMatch("Eve", obj.name[0].given[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("555-555-2003", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1973-05-31", obj.birthDate))
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("2222 Home Street", obj.address[0].line[0]))
        assertTrue(stringMatch("Organization/hl7", obj.managingOrganization!!.reference))
    }

    fun `patient-genetics-example1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-b 81 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-b.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("123456", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Donald", obj.name[0].family))
        assertTrue(stringMatch("Duck", obj.name[0].given[0]))
        assertTrue(stringMatch("D", obj.name[0].given[1]))
        assertTrue(stringMatch("other", obj.gender))
        assertTrue(stringMatch("image/gif", obj.photo[0].contentType))
        assertTrue(stringMatch("R0lGODlhEwARAPcAAAAAAAAA/+9aA", obj.photo[0].data))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("ACME Healthcare, Inc", obj.managingOrganization!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.link[0].other.reference))
        assertTrue(stringMatch("seealso", obj.link[0].type))
    }

    fun `patient-example-b Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-c 82 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-c.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat3", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("123457", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Notsowell", obj.name[0].family))
        assertTrue(stringMatch("Simon", obj.name[0].given[0]))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1982-01-23", obj.birthDate))
        assertTrue(stringMatch("2015-02-14T13:42:00+10:00", obj.deceasedDateTime))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("ACME Healthcare, Inc", obj.managingOrganization!!.display))
    }

    fun `patient-example-c Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-ihe-pcd 83 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-ihe-pcd.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("ihe-pcd", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Internal Identifier", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("AB60001", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("BROOKS", obj.name[0].family))
        assertTrue(stringMatch("ALBERT", obj.name[0].given[0]))
    }

    fun `patient-example-ihe-pcd Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example 84 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:1.2.36.146.595.217.0.", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("2001-05-06", obj.identifier[0].period!!.start))
        assertTrue(stringMatch("Acme Healthcare", obj.identifier[0].assigner!!.display))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Chalmers", obj.name[0].family))
        assertTrue(stringMatch("Peter", obj.name[0].given[0]))
        assertTrue(stringMatch("James", obj.name[0].given[1]))
        assertTrue(stringMatch("usual", obj.name[1].use))
        assertTrue(stringMatch("Jim", obj.name[1].given[0]))
        assertTrue(stringMatch("maiden", obj.name[2].use))
        assertTrue(stringMatch("Windsor", obj.name[2].family))
        assertTrue(stringMatch("Peter", obj.name[2].given[0]))
        assertTrue(stringMatch("James", obj.name[2].given[1]))
        assertTrue(stringMatch("2002", obj.name[2].period!!.end))
        assertTrue(stringMatch("home", obj.telecom[0].use))
        assertTrue(stringMatch("phone", obj.telecom[1].system))
        assertTrue(stringMatch("(03) 5555 6473", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertEquals(1, obj.telecom[1].rank)
        assertTrue(stringMatch("phone", obj.telecom[2].system))
        assertTrue(stringMatch("(03) 3410 5613", obj.telecom[2].value))
        assertTrue(stringMatch("mobile", obj.telecom[2].use))
        assertEquals(2, obj.telecom[2].rank)
        assertTrue(stringMatch("phone", obj.telecom[3].system))
        assertTrue(stringMatch("(03) 5555 8834", obj.telecom[3].value))
        assertTrue(stringMatch("old", obj.telecom[3].use))
        assertTrue(stringMatch("2014", obj.telecom[3].period!!.end))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1974-12-25", obj.birthDate))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("both", obj.address[0].type))
        assertTrue(stringMatch("534 Erewhon St PeasantVille, ", obj.address[0].text))
        assertTrue(stringMatch("534 Erewhon St", obj.address[0].line[0]))
        assertTrue(stringMatch("PleasantVille", obj.address[0].city))
        assertTrue(stringMatch("Rainbow", obj.address[0].district))
        assertTrue(stringMatch("Vic", obj.address[0].state))
        assertTrue(stringMatch("3999", obj.address[0].postalCode))
        assertTrue(stringMatch("1974-12-25", obj.address[0].period!!.start))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.contact[0].relationship[0].coding[0].system))
        assertTrue(stringMatch("N", obj.contact[0].relationship[0].coding[0].code))
        assertTrue(stringMatch("du Marché", obj.contact[0].name!!.family))
        assertTrue(stringMatch("Bénédicte", obj.contact[0].name!!.given[0]))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("+33 (237) 998327", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("home", obj.contact[0].address!!.use))
        assertTrue(stringMatch("both", obj.contact[0].address!!.type))
        assertTrue(stringMatch("534 Erewhon St", obj.contact[0].address!!.line[0]))
        assertTrue(stringMatch("PleasantVille", obj.contact[0].address!!.city))
        assertTrue(stringMatch("Rainbow", obj.contact[0].address!!.district))
        assertTrue(stringMatch("Vic", obj.contact[0].address!!.state))
        assertTrue(stringMatch("3999", obj.contact[0].address!!.postalCode))
        assertTrue(stringMatch("1974-12-25", obj.contact[0].address!!.period!!.start))
        assertTrue(stringMatch("female", obj.contact[0].gender))
        assertTrue(stringMatch("2012", obj.contact[0].period!!.start))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
    }

    fun `patient-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-proband 85 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-proband.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("proband", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("Computer-Stored Abulatory Rec", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.6.1", obj.identifier[0].system))
        assertTrue(stringMatch("999999999", obj.identifier[0].value))
        assertTrue(stringMatch("Boston Massachesetts General ", obj.identifier[0].assigner!!.display))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1966-04-04", obj.birthDate))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
    }

    fun `patient-example-proband Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-f201-roel 86 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-f201-roel.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("BSN", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[0].system))
        assertTrue(stringMatch("123456789", obj.identifier[0].value))
        assertTrue(stringMatch("official", obj.identifier[1].use))
        assertTrue(stringMatch("BSN", obj.identifier[1].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("123456789", obj.identifier[1].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Roel", obj.name[0].text))
        assertTrue(stringMatch("Bor", obj.name[0].family))
        assertTrue(stringMatch("Roelof Olaf", obj.name[0].given[0]))
        assertTrue(stringMatch("Drs.", obj.name[0].prefix[0]))
        assertTrue(stringMatch("PDEng.", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31612345678", obj.telecom[0].value))
        assertTrue(stringMatch("mobile", obj.telecom[0].use))
        assertTrue(stringMatch("phone", obj.telecom[1].system))
        assertTrue(stringMatch("+31201234567", obj.telecom[1].value))
        assertTrue(stringMatch("home", obj.telecom[1].use))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1960-03-13", obj.birthDate))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("Bos en Lommerplein 280", obj.address[0].line[0]))
        assertTrue(stringMatch("Amsterdam", obj.address[0].city))
        assertTrue(stringMatch("1055RW", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("http://snomed.info/sct", obj.maritalStatus!!.coding[0].system))
        assertTrue(stringMatch("36629006", obj.maritalStatus!!.coding[0].code))
        assertTrue(stringMatch("Legally married", obj.maritalStatus!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Marita", obj.maritalStatus!!.coding[1].system))
        assertTrue(stringMatch("M", obj.maritalStatus!!.coding[1].code))
        assertEquals(false, if (obj.multipleBirthBoolean != null) obj.multipleBirthBoolean else false, "Field: obj.multipleBirthBoolean")
        assertTrue(stringMatch("image/jpeg", obj.photo[0].contentType))
        assertTrue(stringMatch("Binary/f006", obj.photo[0].url))
        assertTrue(stringMatch("http://snomed.info/sct", obj.contact[0].relationship[0].coding[0].system))
        assertTrue(stringMatch("127850001", obj.contact[0].relationship[0].coding[0].code))
        assertTrue(stringMatch("Wife", obj.contact[0].relationship[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.contact[0].relationship[0].coding[1].system))
        assertTrue(stringMatch("N", obj.contact[0].relationship[0].coding[1].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.contact[0].relationship[0].coding[2].system))
        assertTrue(stringMatch("WIFE", obj.contact[0].relationship[0].coding[2].code))
        assertTrue(stringMatch("usual", obj.contact[0].name!!.use))
        assertTrue(stringMatch("Ariadne Bor-Jansma", obj.contact[0].name!!.text))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("+31201234567", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("home", obj.contact[0].telecom[0].use))
        assertTrue(stringMatch("urn:ietf:bcp:47", obj.communication[0].language.coding[0].system))
        assertTrue(stringMatch("nl-NL", obj.communication[0].language.coding[0].code))
        assertTrue(stringMatch("Dutch", obj.communication[0].language.coding[0].display))
        assertEquals(true, if (obj.communication[0].preferred != null) obj.communication[0].preferred else false, "Field: obj.communication[0].preferred")
        assertTrue(stringMatch("Organization/f201", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("AUMC", obj.managingOrganization!!.display))
    }

    fun `patient-example-f201-roel Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-xcda 87 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-xcda.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("xcda", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.19.", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Levin", obj.name[0].family))
        assertTrue(stringMatch("Henry", obj.name[0].given[0]))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1932-09-24", obj.birthDate))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.managingOrganization!!.display))
    }

    fun `patient-example-xcda Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-a 88 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-a.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("pat1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("654321", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Donald", obj.name[0].family))
        assertTrue(stringMatch("Duck", obj.name[0].given[0]))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("image/gif", obj.photo[0].contentType))
        assertTrue(stringMatch("R0lGODlhEwARAPcAAAAAAAAA/+9aA", obj.photo[0].data))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.contact[0].relationship[0].coding[0].system))
        assertTrue(stringMatch("E", obj.contact[0].relationship[0].coding[0].code))
        assertTrue(stringMatch("Organization/1", obj.contact[0].organization!!.reference))
        assertTrue(stringMatch("Walt Disney Corporation", obj.contact[0].organization!!.display))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("ACME Healthcare, Inc", obj.managingOrganization!!.display))
        assertTrue(stringMatch("Patient/pat2", obj.link[0].other.reference))
        assertTrue(stringMatch("seealso", obj.link[0].type))
    }

    fun `patient-example-a Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-dicom 89 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-dicom.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("dicom", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://nema.org/fhir/extensio", obj.extension[0].url))
        assertTrue(stringMatch("%.2f".format(56f), "%.2f".format(obj.extension[0].valueQuantity!!.value)))
        assertTrue(stringMatch("Y", obj.extension[0].valueQuantity!!.unit))
        assertTrue(stringMatch("http://nema.org/fhir/extensio", obj.extension[1].url))
        assertTrue(stringMatch("%.2f".format(1.83f), "%.2f".format(obj.extension[1].valueQuantity!!.value)))
        assertTrue(stringMatch("m", obj.extension[1].valueQuantity!!.unit))
        assertTrue(stringMatch("http://nema.org/fhir/extensio", obj.extension[2].url))
        assertTrue(stringMatch("%.2f".format(72.58f), "%.2f".format(obj.extension[2].valueQuantity!!.value)))
        assertTrue(stringMatch("kg", obj.extension[2].valueQuantity!!.unit))
        assertTrue(stringMatch("http://nema.org/examples/pati", obj.identifier[0].system))
        assertTrue(stringMatch("MINT1234", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("MINT_TEST", obj.name[0].family))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
    }

    fun `patient-example-dicom Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-animal 90 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-animal.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("animal", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Dog Tag", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("http://www.maroondah.vic.gov.", obj.identifier[0].system))
        assertTrue(stringMatch("1234123", obj.identifier[0].value))
        assertTrue(stringMatch("2010-05-31", obj.identifier[0].period!!.start))
        assertTrue(stringMatch("Maroondah City Council", obj.identifier[0].assigner!!.display))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("Kenzi", obj.name[0].given[0]))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("2010-03-23", obj.birthDate))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0131", obj.contact[0].relationship[0].coding[0].system))
        assertTrue(stringMatch("C", obj.contact[0].relationship[0].coding[0].code))
        assertTrue(stringMatch("Chalmers", obj.contact[0].name!!.family))
        assertTrue(stringMatch("Peter", obj.contact[0].name!!.given[0]))
        assertTrue(stringMatch("James", obj.contact[0].name!!.given[1]))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("(03) 5555 6473", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("work", obj.contact[0].telecom[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/animal-sp", obj.animal!!.species.coding[0].system))
        assertTrue(stringMatch("canislf", obj.animal!!.species.coding[0].code))
        assertTrue(stringMatch("Dog", obj.animal!!.species.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.animal!!.breed!!.coding[0].system))
        assertTrue(stringMatch("58108001", obj.animal!!.breed!!.coding[0].code))
    }

    @Test
    fun `patient-example-animal 91 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-animal.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Golden retriever", obj.animal!!.breed!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/animal-br", obj.animal!!.breed!!.coding[1].system))
        assertTrue(stringMatch("gret", obj.animal!!.breed!!.coding[1].code))
        assertTrue(stringMatch("Golden Retriever", obj.animal!!.breed!!.coding[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/animal-ge", obj.animal!!.genderStatus!!.coding[0].system))
        assertTrue(stringMatch("neutered", obj.animal!!.genderStatus!!.coding[0].code))
        assertTrue(stringMatch("Pete's Vetinary Services", obj.managingOrganization!!.display))
    }

    fun `patient-example-animal Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-example-chinese 92 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-example-chinese.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("ch-example", obj.id))
        assertTrue(stringMatch("1", obj.meta!!.versionId))
        assertTrue(stringMatch("2016-05-16T00:55:52Z", obj.meta!!.lastUpdated))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("urn:oid:1.2.36.146.595.217.0.", obj.identifier[0].system))
        assertTrue(stringMatch("3112219680806371X", obj.identifier[0].value))
        assertTrue(stringMatch("2001-05-06", obj.identifier[0].period!!.start))
        assertTrue(stringMatch("市卫生局", obj.identifier[0].assigner!!.display))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("张无忌", obj.name[0].text))
        assertTrue(stringMatch("home", obj.telecom[0].use))
        assertTrue(stringMatch("phone", obj.telecom[1].system))
        assertTrue(stringMatch("18337177888", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1974-12-25", obj.birthDate))
        assertEquals(false, if (obj.deceasedBoolean != null) obj.deceasedBoolean else false, "Field: obj.deceasedBoolean")
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("both", obj.address[0].type))
        assertTrue(stringMatch("马当路190号", obj.address[0].line[0]))
        assertTrue(stringMatch("上海市", obj.address[0].city))
        assertTrue(stringMatch("黄埔区", obj.address[0].district))
        assertTrue(stringMatch("200000", obj.address[0].postalCode))
        assertTrue(stringMatch("1974-12-25", obj.address[0].period!!.start))
        assertTrue(stringMatch("Organization/1", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("上海东方医院", obj.managingOrganization!!.display))
    }

    fun `patient-example-chinese Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `patient-glossy-example 93 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/patient-glossy-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Patient::class.java)
        assertTrue(stringMatch("Patient", obj.resourceType))
        assertTrue(stringMatch("glossy", obj.id))
        assertTrue(stringMatch("2014-11-13T11:41:00+11:00", obj.meta!!.lastUpdated))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://example.org/StructureD", obj.extension[0].url))
        assertTrue(stringMatch("renal", obj.extension[0].valueCode))
        assertTrue(stringMatch("usual", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.identifier[0].type!!.coding[0].system))
        assertTrue(stringMatch("MR", obj.identifier[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://www.goodhealth.org/ide", obj.identifier[0].system))
        assertTrue(stringMatch("123456", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Levin", obj.name[0].family))
        assertTrue(stringMatch("Henry", obj.name[0].given[0]))
        assertTrue(stringMatch("The 7th", obj.name[0].suffix[0]))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1932-09-24", obj.birthDate))
        assertTrue(stringMatch("Practitioner/example", obj.generalPractitioner[0].reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.generalPractitioner[0].display))
        assertTrue(stringMatch("Organization/2", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.managingOrganization!!.display))
    }

    fun `patient-glossy-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
