package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PractitionerDataTest : DataTests() {
    @Test
    fun `practitioner-example-f203-jvg 449 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f203-jvg.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("UZI-nummer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("12345678903", obj.identifier[0].value))
        assertTrue(stringMatch("official", obj.identifier[1].use))
        assertTrue(stringMatch("BIG-nummer", obj.identifier[1].type!!.text))
        assertTrue(stringMatch("https://www.bigregister.nl/", obj.identifier[1].system))
        assertTrue(stringMatch("12345678903", obj.identifier[1].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Juri van Gelder", obj.name[0].text))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31715269111", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.address[0].line[0]))
        assertTrue(stringMatch("Den helder", obj.address[0].city))
        assertTrue(stringMatch("2333ZA", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1983-04-20", obj.birthDate))
    }

    fun `practitioner-example-f203-jvg Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f201-ab 450 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f201-ab.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("UZI-nummer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("12345678901", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Dokter Bronsig", obj.name[0].text))
        assertTrue(stringMatch("Bronsig", obj.name[0].family))
        assertTrue(stringMatch("Arend", obj.name[0].given[0]))
        assertTrue(stringMatch("Dr.", obj.name[0].prefix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31715269111", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.address[0].line[0]))
        assertTrue(stringMatch("C4 - Automatisering", obj.address[0].line[1]))
        assertTrue(stringMatch("Den helder", obj.address[0].city))
        assertTrue(stringMatch("2333ZA", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1956-12-24", obj.birthDate))
        assertTrue(stringMatch("http://snomed.info/sct", obj.qualification[0].code.coding[0].system))
        assertTrue(stringMatch("41672002", obj.qualification[0].code.coding[0].code))
        assertTrue(stringMatch("Pulmonologist", obj.qualification[0].code.coding[0].display))
    }

    fun `practitioner-example-f201-ab Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f202-lm 451 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f202-lm.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("UZI-nummer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("12345678902", obj.identifier[0].value))
        assertTrue(stringMatch("official", obj.identifier[1].use))
        assertTrue(stringMatch("BIG-nummer", obj.identifier[1].type!!.text))
        assertTrue(stringMatch("https://www.bigregister.nl/", obj.identifier[1].system))
        assertTrue(stringMatch("12345678902", obj.identifier[1].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Luigi Maas", obj.name[0].text))
        assertTrue(stringMatch("Maas", obj.name[0].family))
        assertTrue(stringMatch("Luigi", obj.name[0].given[0]))
        assertTrue(stringMatch("Dr.", obj.name[0].prefix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31715269111", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.address[0].line[0]))
        assertTrue(stringMatch("C4 - Automatisering", obj.address[0].line[1]))
        assertTrue(stringMatch("Den helder", obj.address[0].city))
        assertTrue(stringMatch("2333ZA", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1960-06-12", obj.birthDate))
    }

    fun `practitioner-example-f202-lm Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-xcda-author 452 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-xcda-author.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("xcda-author", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Hippocrates", obj.name[0].family))
        assertTrue(stringMatch("Harold", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
    }

    fun `practitioner-example-xcda-author Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f003-mv 453 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f003-mv.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("846100293", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("243HID3RT938", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Versteegh", obj.name[0].family))
        assertTrue(stringMatch("Marc", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205562431", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("m.versteegh@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205662948", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Amsterdam", obj.address[0].city))
        assertTrue(stringMatch("1105 AZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1963-07-01", obj.birthDate))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.6.1", obj.communication[0].coding[0].system))
        assertTrue(stringMatch("nl", obj.communication[0].coding[0].code))
        assertTrue(stringMatch("Dutch", obj.communication[0].coding[0].display))
    }

    fun `practitioner-example-f003-mv Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f002-pv 454 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f002-pv.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("730291637", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("174BIP3JH438", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Voigt", obj.name[0].family))
        assertTrue(stringMatch("Pieter", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205569336", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("p.voigt@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205669382", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[0].city))
        assertTrue(stringMatch("9105 PZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1979-04-29", obj.birthDate))
    }

    fun `practitioner-example-f002-pv Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example 455 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.acme.org/practitio", obj.identifier[0].system))
        assertTrue(stringMatch("23", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("Careful", obj.name[0].family))
        assertTrue(stringMatch("Adam", obj.name[0].given[0]))
        assertTrue(stringMatch("Dr", obj.name[0].prefix[0]))
        assertTrue(stringMatch("home", obj.address[0].use))
        assertTrue(stringMatch("534 Erewhon St", obj.address[0].line[0]))
        assertTrue(stringMatch("PleasantVille", obj.address[0].city))
        assertTrue(stringMatch("Vic", obj.address[0].state))
        assertTrue(stringMatch("3999", obj.address[0].postalCode))
        assertTrue(stringMatch("http://example.org/University", obj.qualification[0].identifier[0].system))
        assertTrue(stringMatch("12345", obj.qualification[0].identifier[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0360/2", obj.qualification[0].code.coding[0].system))
        assertTrue(stringMatch("BS", obj.qualification[0].code.coding[0].code))
        assertTrue(stringMatch("Bachelor of Science", obj.qualification[0].code.coding[0].display))
        assertTrue(stringMatch("Bachelor of Science", obj.qualification[0].code.text))
        assertTrue(stringMatch("1995", obj.qualification[0].period!!.start))
        assertTrue(stringMatch("Example University", obj.qualification[0].issuer!!.display))
    }

    fun `practitioner-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f007-sh 456 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f007-sh.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f007", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("874635264", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("567IUI51C154", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Heps", obj.name[0].family))
        assertTrue(stringMatch("Simone", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("020556936", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("S.M.Heps@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205669283", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[0].city))
        assertTrue(stringMatch("9105 PZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1971-11-07", obj.birthDate))
    }

    fun `practitioner-example-f007-sh Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f204-ce 457 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f204-ce.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
    }

    @Test
    fun `practitioner-example-f204-ce 458 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f204-ce.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("UZI-nummer", obj.identifier[0].type!!.text))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("12345678904", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.name[0].use))
        assertTrue(stringMatch("Carla Espinosa", obj.name[0].text))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("+31715262169", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Walvisbaai 3", obj.address[0].line[0]))
        assertTrue(stringMatch("Den helder", obj.address[0].city))
        assertTrue(stringMatch("2333ZA", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1967-11-05", obj.birthDate))
    }

    fun `practitioner-example-f204-ce Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-xcda1 459 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-xcda1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("xcda1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://healthcare.example.org", obj.identifier[0].system))
        assertTrue(stringMatch("D234123", obj.identifier[0].value))
        assertTrue(stringMatch("Dopplemeyer", obj.name[0].family))
        assertTrue(stringMatch("Sherry", obj.name[0].given[0]))
        assertTrue(stringMatch("email", obj.telecom[0].system))
        assertTrue(stringMatch("john.doe@healthcare.example.o", obj.telecom[0].value))
    }

    fun `practitioner-example-xcda1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f005-al 460 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f005-al.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f005", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("118265112", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("191REW8WE916", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Anne", obj.name[0].family))
        assertTrue(stringMatch("Langeveld", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205563847", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("a.langeveld@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205668916", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 9", obj.address[0].line[0]))
        assertTrue(stringMatch("Amsterdam", obj.address[0].city))
        assertTrue(stringMatch("1105 AZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("female", obj.gender))
        assertTrue(stringMatch("1959-03-11", obj.birthDate))
        assertTrue(stringMatch("image/jpeg", obj.photo[0].contentType))
        assertTrue(stringMatch("/9j/4AAQSkZJRgABAQEAlgCWAAD/2", obj.photo[0].data))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.6.1", obj.communication[0].coding[0].system))
        assertTrue(stringMatch("fr", obj.communication[0].coding[0].code))
        assertTrue(stringMatch("France", obj.communication[0].coding[0].display))
    }

    fun `practitioner-example-f005-al Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f004-rb 461 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f004-rb.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f004", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("118265112", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("523ASA1LK927", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("Briet", obj.name[0].family))
        assertTrue(stringMatch("Ronald", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205569273", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("r.briet@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205664440", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Amsterdam", obj.address[0].city))
        assertTrue(stringMatch("1105 AZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1980-02-04", obj.birthDate))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.6.1", obj.communication[0].coding[0].system))
        assertTrue(stringMatch("nl", obj.communication[0].coding[0].code))
        assertTrue(stringMatch("Netherlands", obj.communication[0].coding[0].display))
        assertTrue(stringMatch("Language", obj.communication[0].text))
    }

    fun `practitioner-example-f004-rb Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f006-rvdb 462 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f006-rvdb.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f006", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("937223645", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("134IDY41W988", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("van den Berk", obj.name[0].family))
        assertTrue(stringMatch("Rob", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205569288", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("R.A.vandenberk@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205664987", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[0].city))
        assertTrue(stringMatch("9105 PZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1975-12-07", obj.birthDate))
    }

    fun `practitioner-example-f006-rvdb Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `practitioner-example-f001-evdb 463 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitioner-example-f001-evdb.json").readTextAndClose()
        val obj = mapper.fromJson(json, Practitioner::class.java)
        assertTrue(stringMatch("Practitioner", obj.resourceType))
        assertTrue(stringMatch("f001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("urn:oid:2.16.528.1.1007.3.1", obj.identifier[0].system))
        assertTrue(stringMatch("938273695", obj.identifier[0].value))
        assertTrue(stringMatch("usual", obj.identifier[1].use))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.2.4", obj.identifier[1].system))
        assertTrue(stringMatch("129IDH4OP733", obj.identifier[1].value))
        assertTrue(stringMatch("official", obj.name[0].use))
        assertTrue(stringMatch("van den broek", obj.name[0].family))
        assertTrue(stringMatch("Eric", obj.name[0].given[0]))
        assertTrue(stringMatch("MD", obj.name[0].suffix[0]))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("0205568263", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("E.M.vandenbroek@bmc.nl", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("fax", obj.telecom[2].system))
        assertTrue(stringMatch("0205664440", obj.telecom[2].value))
        assertTrue(stringMatch("work", obj.telecom[2].use))
        assertTrue(stringMatch("work", obj.address[0].use))
        assertTrue(stringMatch("Galapagosweg 91", obj.address[0].line[0]))
        assertTrue(stringMatch("Den Burg", obj.address[0].city))
        assertTrue(stringMatch("9105 PZ", obj.address[0].postalCode))
        assertTrue(stringMatch("NLD", obj.address[0].country))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("1975-12-07", obj.birthDate))
    }

    fun `practitioner-example-f001-evdb Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
