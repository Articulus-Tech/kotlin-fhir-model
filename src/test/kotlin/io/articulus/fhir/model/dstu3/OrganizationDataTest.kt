package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class OrganizationDataTest : DataTests() {
    @Test
    fun `organization-example 344 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("hl7", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[0].url))
        assertTrue(stringMatch("HL7 International", obj.extension[0].valueString))
        assertTrue(stringMatch("Health Level Seven Internatio", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("(+1) 734-677-7777", obj.telecom[0].value))
        assertTrue(stringMatch("fax", obj.telecom[1].system))
        assertTrue(stringMatch("(+1) 734-677-6622", obj.telecom[1].value))
        assertTrue(stringMatch("email", obj.telecom[2].system))
        assertTrue(stringMatch("hq@HL7.org", obj.telecom[2].value))
        assertTrue(stringMatch("3300 Washtenaw Avenue, Suite ", obj.address[0].line[0]))
        assertTrue(stringMatch("Ann Arbor", obj.address[0].city))
        assertTrue(stringMatch("MI", obj.address[0].state))
        assertTrue(stringMatch("48104", obj.address[0].postalCode))
        assertTrue(stringMatch("USA", obj.address[0].country))
        assertTrue(stringMatch("Endpoint/example", obj.endpoint[0].reference))
    }

    fun `organization-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-mmanu 345 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-mmanu.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("mmanu", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Acme Corporation", obj.name))
        assertTrue(stringMatch("Swizterland", obj.address[0].country))
    }

    fun `organization-example-mmanu Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-gastro 346 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-gastro.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.acme.org.au/units", obj.identifier[0].system))
        assertTrue(stringMatch("Gastro", obj.identifier[0].value))
        assertTrue(stringMatch("Gastroenterology", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+1 555 234 3523", obj.telecom[0].value))
        assertTrue(stringMatch("mobile", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("gastro@acme.org", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("Organization/1", obj.partOf!!.reference))
        assertTrue(stringMatch("ACME Healthcare, Inc", obj.partOf!!.display))
    }

    fun `organization-example-gastro Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-lab 347 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-lab.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("1832473e-2fe0-452d-abe9-3cdb9", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.acme.org.au/units", obj.identifier[0].system))
        assertTrue(stringMatch("ClinLab", obj.identifier[0].value))
        assertTrue(stringMatch("Clinical Lab", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+1 555 234 1234", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("contact@labs.acme.org", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
    }

    fun `organization-example-lab Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-f002-burgers-card 348 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-f002-burgers-card.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("http://hl7.org/fhir/organizat", obj.type[0].coding[0].system))
        assertTrue(stringMatch("dept", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Hospital Department", obj.type[0].coding[0].display))
        assertTrue(stringMatch("Burgers UMC Cardiology unit", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("022-655 2320", obj.telecom[0].value))
        assertTrue(stringMatch("South Wing, floor 2", obj.address[0].line[0]))
        assertTrue(stringMatch("Organization/f001", obj.partOf!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/contacten", obj.contact[0].purpose!!.coding[0].system))
        assertTrue(stringMatch("ADMIN", obj.contact[0].purpose!!.coding[0].code))
        assertTrue(stringMatch("mevr. D. de Haan", obj.contact[0].name!!.text))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("022-655 2321", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("email", obj.contact[0].telecom[1].system))
        assertTrue(stringMatch("cardio@burgersumc.nl", obj.contact[0].telecom[1].value))
        assertTrue(stringMatch("fax", obj.contact[0].telecom[2].system))
        assertTrue(stringMatch("022-655 2322", obj.contact[0].telecom[2].value))
        assertTrue(stringMatch("South Wing, floor 2", obj.contact[0].address!!.line[0]))
    }

    fun `organization-example-f002-burgers-card Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-f201-aumc 349 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-f201-aumc.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.zorgkaartnederland", obj.identifier[0].system))
        assertTrue(stringMatch("Artis University Medical Cent", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("405608006", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Academic Medical Center", obj.type[0].coding[0].display))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.type[0].coding[1].system))
        assertTrue(stringMatch("V6", obj.type[0].coding[1].code))
        assertTrue(stringMatch("University Medical Hospital", obj.type[0].coding[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/organizat", obj.type[0].coding[2].system))
        assertTrue(stringMatch("prov", obj.type[0].coding[2].code))
        assertTrue(stringMatch("Healthcare Provider", obj.type[0].coding[2].display))
        assertTrue(stringMatch("Artis University Medical Cent", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31715269111", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Helder", obj.address[0].city))
        assertTrue(stringMatch("2333ZA", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("official", obj.contact[0].name!!.use))
        assertTrue(stringMatch("Professor Brand", obj.contact[0].name!!.text))
        assertTrue(stringMatch("Brand", obj.contact[0].name!!.family))
        assertTrue(stringMatch("Ronald", obj.contact[0].name!!.given[0]))
        assertTrue(stringMatch("Prof.Dr.", obj.contact[0].name!!.prefix[0]))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("+31715269702", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("work", obj.contact[0].telecom[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.contact[0].address!!.line[0]))
        assertTrue(stringMatch("Gebouw 2", obj.contact[0].address!!.line[1]))
        assertTrue(stringMatch("Den helder", obj.contact[0].address!!.city))
        assertTrue(stringMatch("2333ZA", obj.contact[0].address!!.postalCode))
        assertTrue(stringMatch("NLD", obj.contact[0].address!!.country))
    }

    fun `organization-example-f201-aumc Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-good-health-care 350 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-good-health-care.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("2.16.840.1.113883.19.5", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("2.16.840.1.113883.19.5", obj.identifier[0].value))
        assertTrue(stringMatch("Good Health Clinic", obj.name))
    }

    fun `organization-example-good-health-care Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-f001-burgers 351 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-f001-burgers.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1", obj.identifier[0].system))
        assertTrue(stringMatch("91654", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("17-0112278", obj.identifier[1].value))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.type[0].coding[0].system))
        assertTrue(stringMatch("V6", obj.type[0].coding[0].code))
        assertTrue(stringMatch("University Medical Hospital", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/organizat", obj.type[0].coding[1].system))
        assertTrue(stringMatch("prov", obj.type[0].coding[1].code))
        assertTrue(stringMatch("Healthcare Provider", obj.type[0].coding[1].display))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("022-655 2300", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[0].city))
        assertTrue(stringMatch("9105 PZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("work", obj.address[1].use))
        assertTrue(stringMatch("PO Box 2311", obj.address[1].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[1].city))
        assertTrue(stringMatch("9100 AA", obj.address[1].postalCode))
        assertTrue(stringMatch("NLD", obj.address[1].country))
        assertTrue(stringMatch("http://hl7.org/fhir/contacten", obj.contact[0].purpose!!.coding[0].system))
        assertTrue(stringMatch("PRESS", obj.contact[0].purpose!!.coding[0].code))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("022-655 2334", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/contacten", obj.contact[1].purpose!!.coding[0].system))
        assertTrue(stringMatch("PATINF", obj.contact[1].purpose!!.coding[0].code))
        assertTrue(stringMatch("phone", obj.contact[1].telecom[0].system))
        assertTrue(stringMatch("022-655 2335", obj.contact[1].telecom[0].value))
    }

    fun `organization-example-f001-burgers Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-insurer 352 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-insurer.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("666666", obj.identifier[0].value))
        assertTrue(stringMatch("XYZ Insurance", obj.name))
        assertTrue(stringMatch("ABC Insurance", obj.alias[0]))
    }

    fun `organization-example-insurer Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-f203-bumc 353 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-f203-bumc.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("Zorginstelling naam", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("http://www.zorgkaartnederland", obj.identifier[0].system))
        assertTrue(stringMatch("Blijdorp MC", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("http://snomed.info/sct", obj.type[0].coding[0].system))
        assertTrue(stringMatch("405608006", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Academic Medical Center", obj.type[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/organizat", obj.type[0].coding[1].system))
        assertTrue(stringMatch("prov", obj.type[0].coding[1].code))
        assertTrue(stringMatch("Blijdorp Medisch Centrum (BUM", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31107040704", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("apenrots 230", obj.address[0].line[0]))
        assertTrue(stringMatch("Blijdorp", obj.address[0].city))
        assertTrue(stringMatch("3056BE", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
    }

    fun `organization-example-f203-bumc Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `organization-example-f003-burgers-ENT 354 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/organization-example-f003-burgers-ENT.json").readTextAndClose()
        val obj = mapper.fromJson(json, Organization::class.java)
        assertTrue(stringMatch("Organization", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("http://hl7.org/fhir/organizat", obj.type[0].coding[0].system))
        assertTrue(stringMatch("dept", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Hospital Department", obj.type[0].coding[0].display))
        assertTrue(stringMatch("Burgers UMC Ear,Nose,Throat u", obj.name))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("022-655 6780", obj.telecom[0].value))
        assertTrue(stringMatch("West Wing, floor 5", obj.address[0].line[0]))
        assertTrue(stringMatch("Organization/f001", obj.partOf!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/contacten", obj.contact[0].purpose!!.coding[0].system))
        assertTrue(stringMatch("ADMIN", obj.contact[0].purpose!!.coding[0].code))
        assertTrue(stringMatch("mr. F. de Hond", obj.contact[0].name!!.text))
        assertTrue(stringMatch("phone", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("022-655 7654", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("email", obj.contact[0].telecom[1].system))
        assertTrue(stringMatch("KNO@burgersumc.nl", obj.contact[0].telecom[1].value))
        assertTrue(stringMatch("fax", obj.contact[0].telecom[2].system))
        assertTrue(stringMatch("022-655 0998", obj.contact[0].telecom[2].value))
        assertTrue(stringMatch("West Wing, floor 5", obj.contact[0].address!!.line[0]))
    }

    fun `organization-example-f003-burgers-ENT Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
