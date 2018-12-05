package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DocumentReferenceDataTest : DataTests() {
    @Test
    fun `documentreference-example 577 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/documentreference-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DocumentReference::class.java)
        assertTrue(stringMatch("DocumentReference", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Practitioner", (obj.contained[0] as Practitioner).resourceType))
        assertTrue(stringMatch("a2", (obj.contained[0] as Practitioner).id))
        assertTrue(stringMatch("Smitty", (obj.contained[0] as Practitioner).name[0].family))
        assertTrue(stringMatch("Gerald", (obj.contained[0] as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.masterIdentifier!!.system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.masterIdentifier!!.value))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.identifier[0].system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.identifier[0].value))
        assertTrue(stringMatch("current", obj.status))
        assertTrue(stringMatch("preliminary", obj.docStatus))
        assertTrue(stringMatch("http://loinc.org", obj.type.coding[0].system))
        assertTrue(stringMatch("34108-1", obj.type.coding[0].code))
        assertTrue(stringMatch("Outpatient Note", obj.type.coding[0].display))
        assertTrue(stringMatch("http://ihe.net/xds/connectath", obj.class_fhir!!.coding[0].system))
        assertTrue(stringMatch("History and Physical", obj.class_fhir!!.coding[0].code))
        assertTrue(stringMatch("History and Physical", obj.class_fhir!!.coding[0].display))
        assertTrue(stringMatch("Patient/xcda", obj.subject!!.reference))
        assertTrue(stringMatch("2005-12-24T09:35:00+11:00", obj.created))
        assertTrue(stringMatch("2005-12-24T09:43:41+11:00", obj.indexed))
        assertTrue(stringMatch("Practitioner/xcda1", obj.author[0].reference))
        assertTrue(stringMatch("#a2", obj.author[1].reference))
        assertTrue(stringMatch("Organization/f001", obj.authenticator!!.reference))
        assertTrue(stringMatch("Organization/f001", obj.custodian!!.reference))
        assertTrue(stringMatch("appends", obj.relatesTo[0].code))
        assertTrue(stringMatch("DocumentReference/example", obj.relatesTo[0].target.reference))
        assertTrue(stringMatch("Physical", obj.description))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.securityLabel[0].coding[0].system))
        assertTrue(stringMatch("V", obj.securityLabel[0].coding[0].code))
        assertTrue(stringMatch("very restricted", obj.securityLabel[0].coding[0].display))
        assertTrue(stringMatch("application/hl7-v3+xml", obj.content[0].attachment.contentType))
        assertTrue(stringMatch("en-US", obj.content[0].attachment.language))
        assertTrue(stringMatch("http://example.org/xds/mhd/Bi", obj.content[0].attachment.url))
        assertEquals(3654, obj.content[0].attachment.size)
        assertTrue(stringMatch("2jmj7l5rSw0yVb/vlWAYkK/YBwk=", obj.content[0].attachment.hash))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.19376.1.2", obj.content[0].format!!.system))
        assertTrue(stringMatch("urn:ihe:pcc:handp:2008", obj.content[0].format!!.code))
        assertTrue(stringMatch("History and Physical Specific", obj.content[0].format!!.display))
        assertTrue(stringMatch("Encounter/xcda", obj.context!!.encounter!!.reference))
        assertTrue(stringMatch("http://ihe.net/xds/connectath", obj.context!!.event[0].coding[0].system))
        assertTrue(stringMatch("T-D8200", obj.context!!.event[0].coding[0].code))
        assertTrue(stringMatch("Arm", obj.context!!.event[0].coding[0].display))
        assertTrue(stringMatch("2004-12-23T08:00:00+11:00", obj.context!!.period!!.start))
        assertTrue(stringMatch("2004-12-23T08:01:00+11:00", obj.context!!.period!!.end))
        assertTrue(stringMatch("http://www.ihe.net/xds/connec", obj.context!!.facilityType!!.coding[0].system))
        assertTrue(stringMatch("Outpatient", obj.context!!.facilityType!!.coding[0].code))
        assertTrue(stringMatch("Outpatient", obj.context!!.facilityType!!.coding[0].display))
        assertTrue(stringMatch("http://www.ihe.net/xds/connec", obj.context!!.practiceSetting!!.coding[0].system))
        assertTrue(stringMatch("General Medicine", obj.context!!.practiceSetting!!.coding[0].code))
        assertTrue(stringMatch("General Medicine", obj.context!!.practiceSetting!!.coding[0].display))
        assertTrue(stringMatch("Patient/xcda", obj.context!!.sourcePatientInfo!!.reference))
        assertTrue(stringMatch("urn:ietf:rfc:3986", obj.context!!.related[0].identifier!!.system))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.context!!.related[0].identifier!!.value))
        assertTrue(stringMatch("Patient/xcda", obj.context!!.related[0].ref!!.reference))
    }

    fun `documentreference-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
