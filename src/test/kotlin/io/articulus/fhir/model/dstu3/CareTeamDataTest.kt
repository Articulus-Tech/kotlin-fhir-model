package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CareTeamDataTest : DataTests() {
    @Test
    fun `careteam-example 475 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/careteam-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, CareTeam::class.java)
        assertTrue(stringMatch("CareTeam", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Practitioner", (obj.contained[0] as Practitioner).resourceType))
        assertTrue(stringMatch("pr1", (obj.contained[0] as Practitioner).id))
        assertTrue(stringMatch("Dietician", (obj.contained[0] as Practitioner).name[0].family))
        assertTrue(stringMatch("Dorothy", (obj.contained[0] as Practitioner).name[0].given[0]))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/care-team", obj.category[0].coding[0].system))
        assertTrue(stringMatch("encounter", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Peter James Charlmers Care Pl", obj.name))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.subject!!.display))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2013-01-01", obj.period!!.end))
        assertTrue(stringMatch("responsiblePerson", obj.participant[0].role!!.text))
        assertTrue(stringMatch("Patient/example", obj.participant[0].member!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.participant[0].member!!.display))
        assertTrue(stringMatch("adviser", obj.participant[1].role!!.text))
        assertTrue(stringMatch("#pr1", obj.participant[1].member!!.reference))
        assertTrue(stringMatch("Dorothy Dietition", obj.participant[1].member!!.display))
        assertTrue(stringMatch("Organization/f001", obj.participant[1].onBehalfOf!!.reference))
        assertTrue(stringMatch("2013-01-01", obj.participant[1].period!!.end))
        assertTrue(stringMatch("Organization/f001", obj.managingOrganization[0].reference))
    }

    fun `careteam-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
