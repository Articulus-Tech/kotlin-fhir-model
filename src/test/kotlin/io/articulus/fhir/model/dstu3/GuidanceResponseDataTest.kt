package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class GuidanceResponseDataTest : DataTests() {
    @Test
    fun `guidanceresponse-example 576 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/guidanceresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, GuidanceResponse::class.java)
        assertTrue(stringMatch("GuidanceResponse", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Parameters", (obj.contained[0] as Parameters).resourceType))
        assertTrue(stringMatch("outputParameters1", (obj.contained[0] as Parameters).id))
        assertTrue(stringMatch("score", (obj.contained[0] as Parameters).parameter[0].name))
        assertTrue(stringMatch("%.2f".format(7f), "%.2f".format((obj.contained[0] as Parameters).parameter[0].valueDecimal)))
        assertTrue(stringMatch("item-assessed", (obj.contained[0] as Parameters).parameter[1].name))
        assertTrue(stringMatch("http://www.ama-assn.org/go/cp", (obj.contained[0] as Parameters).parameter[1].valueCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("70450", (obj.contained[0] as Parameters).parameter[1].valueCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("CT, head, wo iv contrast", (obj.contained[0] as Parameters).parameter[1].valueCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("device", (obj.contained[0] as Parameters).parameter[2].name))
        assertTrue(stringMatch("Device/software", (obj.contained[0] as Parameters).parameter[2].valueReference!!.reference))
        assertTrue(stringMatch("guideline-followed", (obj.contained[0] as Parameters).parameter[3].name))
        assertTrue(stringMatch("http://someguidelineprovider.", (obj.contained[0] as Parameters).parameter[3].valueUri))
        assertTrue(stringMatch("guidanceRequest1", obj.requestId))
        assertTrue(stringMatch("http://example.org", obj.identifier!!.system))
        assertTrue(stringMatch("guidanceResponse1", obj.identifier!!.value))
        assertTrue(stringMatch("ServiceDefinition/example", obj.module.reference))
        assertTrue(stringMatch("success", obj.status))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2017-03-10T16:02:00Z", obj.occurrenceDateTime))
        assertTrue(stringMatch("Device/software", obj.performer!!.reference))
        assertTrue(stringMatch("Guideline Appropriate Orderin", obj.reasonCodeableConcept!!.text))
        assertTrue(stringMatch("#outputParameters1", obj.outputParameters!!.reference))
    }

    fun `guidanceresponse-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
