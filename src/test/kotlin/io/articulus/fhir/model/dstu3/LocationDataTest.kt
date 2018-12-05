package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class LocationDataTest : DataTests() {
    @Test
    fun `location-example 476 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[0].url))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.extension[0].valueString))
        assertTrue(stringMatch("http://hl7.org/fhir/Structure", obj.extension[1].url))
        assertTrue(stringMatch("BU MC, SW, F2", obj.extension[1].valueString))
        assertTrue(stringMatch("B1-S.F2", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("South Wing, second floor", obj.name))
        assertTrue(stringMatch("Second floor of the Old South", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("2328", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("fax", obj.telecom[1].system))
        assertTrue(stringMatch("2329", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("email", obj.telecom[2].system))
        assertTrue(stringMatch("second wing admissions", obj.telecom[2].value))
        assertTrue(stringMatch("url", obj.telecom[3].system))
        assertTrue(stringMatch("http://sampleorg.com/southwin", obj.telecom[3].value))
        assertTrue(stringMatch("work", obj.telecom[3].use))
        assertTrue(stringMatch("work", obj.address!!.use))
        assertTrue(stringMatch("Galapagosweg 91, Building A", obj.address!!.line[0]))
        assertTrue(stringMatch("Den Burg", obj.address!!.city))
        assertTrue(stringMatch("9105 PZ", obj.address!!.postalCode))
        assertTrue(stringMatch("NLD", obj.address!!.country))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("wi", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("Wing", obj.physicalType!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(-83.6945691f), "%.2f".format(obj.position!!.longitude)))
        assertTrue(stringMatch("%.2f".format(42.25475478f), "%.2f".format(obj.position!!.latitude)))
        assertTrue(stringMatch("%.2f".format(0f), "%.2f".format(obj.position!!.altitude)))
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("Endpoint/example", obj.endpoint[0].reference))
    }

    fun `location-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `location-example-room 477 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example-room.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("B1-S.F2.1.00", obj.identifier[0].value))
        assertTrue(stringMatch("suspended", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0116", obj.operationalStatus!!.system))
        assertTrue(stringMatch("H", obj.operationalStatus!!.code))
        assertTrue(stringMatch("Housekeeping", obj.operationalStatus!!.display))
        assertTrue(stringMatch("South Wing Neuro OR 1", obj.name))
        assertTrue(stringMatch("South Wing OR 5", obj.alias[0]))
        assertTrue(stringMatch("Main Wing OR 2", obj.alias[1]))
        assertTrue(stringMatch("Old South Wing, Neuro Radiolo", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.type!!.coding[0].system))
        assertTrue(stringMatch("RNEU", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Neuroradiology unit", obj.type!!.coding[0].display))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("2329", obj.telecom[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("ro", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("Room", obj.physicalType!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization!!.reference))
        assertTrue(stringMatch("Location/1", obj.partOf!!.reference))
    }

    fun `location-example-room Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `location-example-ambulance 478 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example-ambulance.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("amb", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("BUMC Ambulance", obj.name))
        assertTrue(stringMatch("Ambulance provided by Burgers", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.type!!.coding[0].system))
        assertTrue(stringMatch("AMB", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Ambulance", obj.type!!.coding[0].display))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("2329", obj.telecom[0].value))
        assertTrue(stringMatch("mobile", obj.telecom[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("ve", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("Vehicle", obj.physicalType!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization!!.reference))
    }

    fun `location-example-ambulance Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `location-example-ukpharmacy 479 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example-ukpharmacy.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("ukp", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("UK Pharmacies", obj.name))
        assertTrue(stringMatch("All Pharmacies in the United ", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.type!!.coding[0].system))
        assertTrue(stringMatch("PHARM", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Pharmacy", obj.type!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("jdn", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("Jurisdiction", obj.physicalType!!.coding[0].display))
    }

    fun `location-example-ukpharmacy Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `location-example-patients-home 480 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example-patients-home.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("ph", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient's Home", obj.name))
        assertTrue(stringMatch("Patient's Home", obj.description))
        assertTrue(stringMatch("kind", obj.mode))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.type!!.coding[0].system))
        assertTrue(stringMatch("PTRES", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Patient's Residence", obj.type!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("ho", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("House", obj.physicalType!!.coding[0].display))
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization!!.reference))
    }

    fun `location-example-patients-home Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `location-example-hl7hq 481 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/location-example-hl7hq.json").readTextAndClose()
        val obj = mapper.fromJson(json, Location::class.java)
        assertTrue(stringMatch("Location", obj.resourceType))
        assertTrue(stringMatch("hl7", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Health Level Seven Internatio", obj.name))
        assertTrue(stringMatch("HL7 Headquarters", obj.description))
        assertTrue(stringMatch("instance", obj.mode))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.type!!.coding[0].system))
        assertTrue(stringMatch("SLEEP", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Sleep disorders unit", obj.type!!.coding[0].display))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("(+1) 734-677-7777", obj.telecom[0].value))
        assertTrue(stringMatch("fax", obj.telecom[1].system))
        assertTrue(stringMatch("(+1) 734-677-6622", obj.telecom[1].value))
        assertTrue(stringMatch("email", obj.telecom[2].system))
        assertTrue(stringMatch("hq@HL7.org", obj.telecom[2].value))
        assertTrue(stringMatch("3300 Washtenaw Avenue, Suite ", obj.address!!.line[0]))
        assertTrue(stringMatch("Ann Arbor", obj.address!!.city))
        assertTrue(stringMatch("MI", obj.address!!.state))
        assertTrue(stringMatch("48104", obj.address!!.postalCode))
        assertTrue(stringMatch("USA", obj.address!!.country))
        assertTrue(stringMatch("http://hl7.org/fhir/location-", obj.physicalType!!.coding[0].system))
        assertTrue(stringMatch("bu", obj.physicalType!!.coding[0].code))
        assertTrue(stringMatch("Building", obj.physicalType!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(42.256500f), "%.2f".format(obj.position!!.longitude)))
        assertTrue(stringMatch("%.2f".format(-83.694710f), "%.2f".format(obj.position!!.latitude)))
    }

    fun `location-example-hl7hq Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
