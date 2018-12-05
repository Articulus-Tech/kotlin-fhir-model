package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SpecimenDataTest : DataTests() {
    @Test
    fun `specimen-example-isolate 444 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/specimen-example-isolate.json").readTextAndClose()
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("isolate", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Specimen", (obj.contained[0] as Specimen).resourceType))
        assertTrue(stringMatch("stool", (obj.contained[0] as Specimen).id))
        assertTrue(stringMatch("http://lab.acme.org/specimens", (obj.contained[0] as Specimen).accessionIdentifier!!.system))
        assertTrue(stringMatch("X352356", (obj.contained[0] as Specimen).accessionIdentifier!!.value))
        assertTrue(stringMatch("unavailable", (obj.contained[0] as Specimen).status))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Specimen).type!!.coding[0].system))
        assertTrue(stringMatch("119339001", (obj.contained[0] as Specimen).type!!.coding[0].code))
        assertTrue(stringMatch("Stool specimen", (obj.contained[0] as Specimen).type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", (obj.contained[0] as Specimen).subject.reference))
        assertTrue(stringMatch("2015-08-16T07:03:00Z", (obj.contained[0] as Specimen).receivedTime))
        assertTrue(stringMatch("Patient", (obj.contained[0] as Specimen).collection!!.collector!!.display))
        assertTrue(stringMatch("2011-08-16T06:15:00Z", (obj.contained[0] as Specimen).collection!!.collectedDateTime))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0488", (obj.contained[0] as Specimen).collection!!.method!!.coding[0].system))
        assertTrue(stringMatch("LNV", (obj.contained[0] as Specimen).collection!!.method!!.coding[0].code))
        assertTrue(stringMatch("http://lab.acme.org/specimens", obj.accessionIdentifier!!.system))
        assertTrue(stringMatch("X352356-ISO1", obj.accessionIdentifier!!.value))
        assertTrue(stringMatch("available", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("429951000124103", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Bacterial isolate specimen", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2015-08-18T07:03:00Z", obj.receivedTime))
        assertTrue(stringMatch("#stool", obj.parent[0].reference))
        assertTrue(stringMatch("Practitioner/f202", obj.collection!!.collector!!.reference))
        assertTrue(stringMatch("2015-08-16T07:03:00Z", obj.collection!!.collectedDateTime))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0488", obj.collection!!.method!!.coding[0].system))
        assertTrue(stringMatch("BAP", obj.collection!!.method!!.coding[0].code))
        assertTrue(stringMatch("Patient dropped off specimen", obj.note[0].text))
    }

    fun `specimen-example-isolate Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `specimen-example-urine 445 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/specimen-example-urine.json").readTextAndClose()
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("vma-urine", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://lab.acme.org/specimens", obj.accessionIdentifier!!.system))
        assertTrue(stringMatch("X352356", obj.accessionIdentifier!!.value))
        assertTrue(stringMatch("available", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0487", obj.type!!.coding[0].system))
        assertTrue(stringMatch("RANDU", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Urine, Random", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("2015-08-18T07:03:00Z", obj.receivedTime))
        assertTrue(stringMatch("Practitioner/f202", obj.collection!!.collector!!.reference))
        assertTrue(stringMatch("2015-08-18T07:03:00Z", obj.collection!!.collectedDateTime))
        assertTrue(stringMatch("Acidify to pH < 3.0 with 6 N ", obj.processing[0].description))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0373", obj.processing[0].procedure!!.coding[0].system))
        assertTrue(stringMatch("ACID", obj.processing[0].procedure!!.coding[0].code))
        assertTrue(stringMatch("6 N HCl", obj.processing[0].additive[0].display))
        assertTrue(stringMatch("2015-08-18T08:10:00Z", obj.processing[0].timeDateTime))
        assertTrue(stringMatch("Non-sterile specimen containe", obj.container[0].type!!.text))
        assertTrue(stringMatch("%.2f".format(50f), "%.2f".format(obj.container[0].capacity!!.value)))
        assertTrue(stringMatch("mls", obj.container[0].capacity!!.unit))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.container[0].specimenQuantity!!.value)))
        assertTrue(stringMatch("mls", obj.container[0].specimenQuantity!!.unit))
    }

    fun `specimen-example-urine Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `specimen-example-serum 446 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/specimen-example-serum.json").readTextAndClose()
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("sst", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.com/labs/accessio", obj.accessionIdentifier!!.system))
        assertTrue(stringMatch("20150816-00124", obj.accessionIdentifier!!.value))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("119364003", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Serum sample", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/pat2", obj.subject.reference))
        assertTrue(stringMatch("ProcedureRequest/ft4", obj.request[0].reference))
        assertTrue(stringMatch("Practitioner/f202", obj.collection!!.collector!!.reference))
        assertTrue(stringMatch("2015-08-16T06:40:17Z", obj.collection!!.collectedDateTime))
        assertTrue(stringMatch("http://acme.com/labs", obj.container[0].type!!.coding[0].system))
        assertTrue(stringMatch("SST", obj.container[0].type!!.coding[0].code))
        assertTrue(stringMatch("Serum Separator Tube", obj.container[0].type!!.coding[0].display))
    }

    fun `specimen-example-serum Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `specimen-example 447 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/specimen-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Specimen::class.java)
        assertTrue(stringMatch("Specimen", obj.resourceType))
        assertTrue(stringMatch("101", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("hep", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Entity", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("HEPL", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("http://ehr.acme.org/identifie", obj.identifier[0].system))
        assertTrue(stringMatch("23234352356", obj.identifier[0].value))
        assertTrue(stringMatch("http://lab.acme.org/specimens", obj.accessionIdentifier!!.system))
        assertTrue(stringMatch("X352356", obj.accessionIdentifier!!.value))
        assertTrue(stringMatch("available", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.type!!.coding[0].system))
        assertTrue(stringMatch("122555007", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Venous blood specimen", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Peter Patient", obj.subject.display))
        assertTrue(stringMatch("2011-03-04T07:03:00Z", obj.receivedTime))
        assertTrue(stringMatch("ProcedureRequest/example", obj.request[0].reference))
        assertTrue(stringMatch("Practitioner/example", obj.collection!!.collector!!.reference))
        assertTrue(stringMatch("2011-05-30T06:15:00Z", obj.collection!!.collectedDateTime))
        assertTrue(stringMatch("%.2f".format(6f), "%.2f".format(obj.collection!!.quantity!!.value)))
        assertTrue(stringMatch("mL", obj.collection!!.quantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0488", obj.collection!!.method!!.coding[0].system))
        assertTrue(stringMatch("LNV", obj.collection!!.method!!.coding[0].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.collection!!.bodySite!!.coding[0].system))
        assertTrue(stringMatch("49852007", obj.collection!!.bodySite!!.coding[0].code))
        assertTrue(stringMatch("Structure of median cubital v", obj.collection!!.bodySite!!.coding[0].display))
        assertTrue(stringMatch("Right median cubital vein", obj.collection!!.bodySite!!.text))
        assertTrue(stringMatch("48736-15394-75465", obj.container[0].identifier[0].value))
        assertTrue(stringMatch("Green Gel tube", obj.container[0].description))
        assertTrue(stringMatch("Vacutainer", obj.container[0].type!!.text))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.container[0].capacity!!.value)))
        assertTrue(stringMatch("mL", obj.container[0].capacity!!.unit))
        assertTrue(stringMatch("%.2f".format(6f), "%.2f".format(obj.container[0].specimenQuantity!!.value)))
        assertTrue(stringMatch("mL", obj.container[0].specimenQuantity!!.unit))
        assertTrue(stringMatch("#hep", obj.container[0].additiveReference!!.reference))
        assertTrue(stringMatch("Specimen is grossly lipemic", obj.note[0].text))
    }

    fun `specimen-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
