package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SearchParameterDataTest : DataTests() {
    @Test
    fun `searchparameter-example-extension 391 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/searchparameter-example-extension.json").readTextAndClose()
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example-extension", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/SearchPar", obj.url))
        assertTrue(stringMatch("Example Search Parameter on a", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("Health Level Seven Internatio", obj.publisher))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("part-agree", obj.code))
        assertTrue(stringMatch("Patient", obj.base[0]))
        assertTrue(stringMatch("reference", obj.type))
        assertTrue(stringMatch("Search by url for a participa", obj.description))
        assertTrue(stringMatch("DocumentReference.extension('", obj.expression))
        assertTrue(stringMatch("f:DocumentReference/f:extensi", obj.xpath))
        assertTrue(stringMatch("normal", obj.xpathUsage))
        assertTrue(stringMatch("DocumentReference", obj.target[0]))
    }

    fun `searchparameter-example-extension Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `searchparameter-example-reference 392 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/searchparameter-example-reference.json").readTextAndClose()
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example-reference", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/SearchPar", obj.url))
        assertTrue(stringMatch("Example Search Parameter", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2013-10-23", obj.date))
        assertTrue(stringMatch("Health Level Seven Internatio", obj.publisher))
        assertTrue(stringMatch("[string]", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Need to search Condition by s", obj.purpose))
        assertTrue(stringMatch("subject", obj.code))
        assertTrue(stringMatch("Condition", obj.base[0]))
        assertTrue(stringMatch("reference", obj.type))
        assertTrue(stringMatch("Search by condition subject", obj.description))
        assertTrue(stringMatch("Condition.subject", obj.expression))
        assertTrue(stringMatch("normal", obj.xpathUsage))
        assertTrue(stringMatch("Organization", obj.target[0]))
        assertTrue(stringMatch("missing", obj.modifier[0]))
        assertTrue(stringMatch("name", obj.chain[0]))
        assertTrue(stringMatch("identifier", obj.chain[1]))
    }

    fun `searchparameter-example-reference Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `searchparameter-example 393 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/searchparameter-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("SearchParameter", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/SearchPar", obj.url))
        assertTrue(stringMatch("1", obj.version))
        assertTrue(stringMatch("ID-SEARCH-PARAMETER", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2013-10-23", obj.date))
        assertTrue(stringMatch("Health Level Seven Internatio", obj.publisher))
        assertTrue(stringMatch("[string]", obj.contact[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://hl7.org/fhir", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("http://hl7.org/fhir/usage-con", obj.useContext[0].code.system))
        assertTrue(stringMatch("focus", obj.useContext[0].code.code))
        assertTrue(stringMatch("http://hl7.org/fhir/variant-s", obj.useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("positive", obj.useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
    }

    @Test
    fun `searchparameter-example 394 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/searchparameter-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, SearchParameter::class.java)
        assertTrue(stringMatch("US", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("United States of America (the", obj.jurisdiction[0].coding[0].display))
        assertTrue(stringMatch("Need to search by identifier ", obj.purpose))
        assertTrue(stringMatch("_id", obj.code))
        assertTrue(stringMatch("Resource", obj.base[0]))
        assertTrue(stringMatch("token", obj.type))
        assertTrue(stringMatch("http://hl7.org/fhir/SearchPar", obj.derivedFrom))
        assertTrue(stringMatch("Search by resource identifier", obj.description))
        assertTrue(stringMatch("id", obj.expression))
        assertTrue(stringMatch("f:*/f:id", obj.xpath))
        assertTrue(stringMatch("normal", obj.xpathUsage))
        assertTrue(stringMatch("eq", obj.comparator[0]))
    }

    fun `searchparameter-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
