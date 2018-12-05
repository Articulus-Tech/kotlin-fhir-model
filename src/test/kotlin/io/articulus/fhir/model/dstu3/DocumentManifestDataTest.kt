package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class DocumentManifestDataTest : DataTests() {
    @Test
    fun `documentmanifest-example 370 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/documentmanifest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, DocumentManifest::class.java)
        assertTrue(stringMatch("DocumentManifest", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Practitioner", (obj.contained[0] as Practitioner).resourceType))
        assertTrue(stringMatch("a1", (obj.contained[0] as Practitioner).id))
        assertTrue(stringMatch("Dopplemeyer", (obj.contained[0] as Practitioner).name[0].family))
        assertTrue(stringMatch("Sherry", (obj.contained[0] as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("email", (obj.contained[0] as Practitioner).telecom[0].system))
        assertTrue(stringMatch("john.doe@healthcare.example.o", (obj.contained[0] as Practitioner).telecom[0].value))
        assertTrue(stringMatch("http://example.org/documents", obj.masterIdentifier!!.system))
        assertTrue(stringMatch("23425234234-2346", obj.masterIdentifier!!.value))
        assertTrue(stringMatch("http://example.org/documents", obj.identifier[0].system))
        assertTrue(stringMatch("23425234234-2347", obj.identifier[0].value))
        assertTrue(stringMatch("current", obj.status))
        assertTrue(stringMatch("History and Physical", obj.type!!.text))
        assertTrue(stringMatch("Patient/xcda", obj.subject!!.reference))
        assertTrue(stringMatch("2004-12-25T23:50:50-05:00", obj.created))
        assertTrue(stringMatch("#a1", obj.author[0].reference))
        assertTrue(stringMatch("Practitioner/xcda1", obj.recipient[0].reference))
        assertTrue(stringMatch("urn:oid:1.3.6.1.4.1.21367.200", obj.source))
        assertTrue(stringMatch("Physical", obj.description))
        assertTrue(stringMatch("DocumentReference/example", obj.content[0].pReference.reference))
        assertTrue(stringMatch("http://example.org/documents", obj.related[0].identifier!!.system))
        assertTrue(stringMatch("23425234234-9999", obj.related[0].identifier!!.value))
        assertTrue(stringMatch("DocumentReference/example", obj.related[0].ref!!.reference))
    }

    fun `documentmanifest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
