package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProvenanceDataTest : DataTests() {
    @Test
    fun `provenance-example-sig 439 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/provenance-example-sig.json").readTextAndClose()
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("signature", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("DocumentReference/example", obj.target[0].reference))
        assertTrue(stringMatch("2015-08-27T08:39:24+10:00", obj.recorded))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.reason[0].system))
        assertTrue(stringMatch("TREAT", obj.reason[0].code))
        assertTrue(stringMatch("treatment", obj.reason[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Docume", obj.activity!!.system))
        assertTrue(stringMatch("AU", obj.activity!!.code))
        assertTrue(stringMatch("authenticated", obj.activity!!.display))
        assertTrue(stringMatch("http://www.hl7.org/fhir/contr", obj.agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("VERF", obj.agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("mailto://hhd@ssa.gov", obj.agent[0].whoUri))
        assertTrue(stringMatch("urn:iso-astm:E1762-95:2013", obj.signature[0].type[0].system))
        assertTrue(stringMatch("1.2.840.10065.1.12.1.5", obj.signature[0].type[0].code))
        assertTrue(stringMatch("Verification Signature", obj.signature[0].type[0].display))
        assertTrue(stringMatch("2015-08-27T08:39:24+10:00", obj.signature[0].when_fhir))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.signature[0].whoReference.reference))
        assertTrue(stringMatch("application/signature+xml", obj.signature[0].contentType))
        assertTrue(stringMatch("Li4u", obj.signature[0].blob))
    }

    fun `provenance-example-sig Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `provenance-example-cwl 440 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/provenance-example-cwl.json").readTextAndClose()
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example-cwl", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Sequence/example-pgx-1", obj.target[0].reference))
        assertTrue(stringMatch("2016-11-30", obj.period!!.start))
        assertTrue(stringMatch("2016-12-01T08:12:14+10:00", obj.recorded))
        assertTrue(stringMatch("profiling Short Tandem Repeat", obj.reason[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("AUT", obj.agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("Patient/example", obj.agent[0].whoReference.reference))
        assertTrue(stringMatch("source", obj.entity[0].role))
        assertTrue(stringMatch("https://github.com/common-wor", obj.entity[0].whatIdentifier.type!!.coding[0].system))
        assertTrue(stringMatch("CWL", obj.entity[0].whatIdentifier.type!!.coding[0].code))
        assertTrue(stringMatch("lobSTR", obj.entity[0].whatIdentifier.type!!.coding[0].display))
        assertTrue(stringMatch("https://github.com/common-wor", obj.entity[0].whatIdentifier.value))
    }

    fun `provenance-example-cwl Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `provenance-example-biocompute-object 441 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/provenance-example-biocompute-object.json").readTextAndClose()
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example-biocompute-object", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Sequence/example", obj.target[0].reference))
        assertTrue(stringMatch("2017-06-06", obj.period!!.start))
        assertTrue(stringMatch("2016-06-09T08:12:14+10:00", obj.recorded))
        assertTrue(stringMatch("antiviral resistance detectio", obj.reason[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("AUT", obj.agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/example", obj.agent[0].whoReference.reference))
        assertTrue(stringMatch("source", obj.entity[0].role))
        assertTrue(stringMatch("https://hive.biochemistry.gwu", obj.entity[0].whatIdentifier.type!!.coding[0].system))
        assertTrue(stringMatch("biocompute", obj.entity[0].whatIdentifier.type!!.coding[0].code))
        assertTrue(stringMatch("obj.1001", obj.entity[0].whatIdentifier.type!!.coding[0].display))
        assertTrue(stringMatch("https://hive.biochemistry.gwu", obj.entity[0].whatIdentifier.value))
    }

    fun `provenance-example-biocompute-object Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `provenance-example 442 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/provenance-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Provenance::class.java)
        assertTrue(stringMatch("Provenance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Procedure/example/_history/1", obj.target[0].reference))
        assertTrue(stringMatch("2015-06-27", obj.period!!.start))
        assertTrue(stringMatch("2015-06-28", obj.period!!.end))
        assertTrue(stringMatch("2015-06-27T08:39:24+10:00", obj.recorded))
        assertTrue(stringMatch("http://acme.com/fhir/Consent/", obj.policy[0]))
        assertTrue(stringMatch("Location/1", obj.location!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason[0].system))
        assertTrue(stringMatch("3457005", obj.reason[0].code))
        assertTrue(stringMatch("Referral", obj.reason[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("AUT", obj.agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.agent[0].whoReference.reference))
        assertTrue(stringMatch("#a1", obj.agent[0].onBehalfOfUri))
        assertTrue(stringMatch("used", obj.agent[0].relatedAgentType!!.text))
        assertTrue(stringMatch("a1", obj.agent[1].id))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.agent[1].role[0].coding[0].system))
        assertTrue(stringMatch("DEV", obj.agent[1].role[0].coding[0].code))
        assertTrue(stringMatch("Device/software", obj.agent[1].whoReference.reference))
        assertTrue(stringMatch("source", obj.entity[0].role))
        assertTrue(stringMatch("DocumentReference/example", obj.entity[0].whatReference.reference))
        assertTrue(stringMatch("CDA Document in XDS repositor", obj.entity[0].whatReference.display))
    }

    fun `provenance-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
