package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ImplementationGuideDataTest : DataTests() {
    @Test
    fun `implementationguide-example 390 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/implementationguide-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImplementationGuide::class.java)
        assertTrue(stringMatch("ImplementationGuide", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/us/daf", obj.url))
        assertTrue(stringMatch("0", obj.version))
        assertTrue(stringMatch("Data Access Framework (DAF)", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(false, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2015-01-01", obj.date))
        assertTrue(stringMatch("ONC / HL7 Joint project", obj.publisher))
        assertTrue(stringMatch("ONC", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://www.healthit.gov", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("HL7", obj.contact[1].name))
        assertTrue(stringMatch("url", obj.contact[1].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[1].telecom[0].value))
        assertTrue(stringMatch("The Data Access Framework (DA", obj.description))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("US", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("Published by ONC under the st", obj.copyright))
        assertTrue(stringMatch("1.0.0", obj.fhirVersion))
        assertTrue(stringMatch("reference", obj.dependency[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/Implement", obj.dependency[0].uri))
        assertTrue(stringMatch("test", obj.package_fhir[0].name))
        assertTrue(stringMatch("Base package (not broken up i", obj.package_fhir[0].description))
        assertEquals(true, if (obj.package_fhir[0].resource[0].example != null) obj.package_fhir[0].resource[0].example else false, "Field: obj.package_fhir[0].resource[0].example")
        assertTrue(stringMatch("Test Example", obj.package_fhir[0].resource[0].name))
        assertTrue(stringMatch("A test example to show how a ", obj.package_fhir[0].resource[0].description))
        assertTrue(stringMatch("daf-tst", obj.package_fhir[0].resource[0].acronym))
        assertTrue(stringMatch("test.html", obj.package_fhir[0].resource[0].sourceUri))
        assertTrue(stringMatch("StructureDefinition/daf-patie", obj.package_fhir[0].resource[0].exampleFor!!.reference))
        assertTrue(stringMatch("Patient", obj.global_fhir[0].type))
        assertTrue(stringMatch("StructureDefinition/daf-patie", obj.global_fhir[0].profile.reference))
        assertTrue(stringMatch("http://h7.org/fhir/fhir.css", obj.binary[0]))
        assertTrue(stringMatch("patient-example.html", obj.page!!.source))
        assertTrue(stringMatch("Example Patient Page", obj.page!!.title))
        assertTrue(stringMatch("page", obj.page!!.kind))
        assertTrue(stringMatch("list.html", obj.page!!.page[0].source))
        assertTrue(stringMatch("Value Set Page", obj.page!!.page[0].title))
        assertTrue(stringMatch("list", obj.page!!.page[0].kind))
        assertTrue(stringMatch("ValueSet", obj.page!!.page[0].type[0]))
        assertTrue(stringMatch("test", obj.page!!.page[0].package_fhir[0]))
        assertTrue(stringMatch("text/html", obj.page!!.page[0].format))
    }

    fun `implementationguide-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
