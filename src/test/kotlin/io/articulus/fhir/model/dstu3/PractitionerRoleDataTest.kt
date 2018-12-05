package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PractitionerRoleDataTest : DataTests() {
    @Test
    fun `practitionerrole-example 573 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/practitionerrole-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, PractitionerRole::class.java)
        assertTrue(stringMatch("PractitionerRole", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.acme.org/practitio", obj.identifier[0].system))
        assertTrue(stringMatch("23", obj.identifier[0].value))
        assertEquals(true, if (obj.active != null) obj.active else false, "Field: obj.active")
        assertTrue(stringMatch("2012-01-01", obj.period!!.start))
        assertTrue(stringMatch("2012-03-31", obj.period!!.end))
        assertTrue(stringMatch("Practitioner/example", obj.practitioner!!.reference))
        assertTrue(stringMatch("Dr Adam Careful", obj.practitioner!!.display))
        assertTrue(stringMatch("Organization/f001", obj.organization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0286", obj.code[0].coding[0].system))
        assertTrue(stringMatch("RP", obj.code[0].coding[0].code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.specialty[0].coding[0].system))
        assertTrue(stringMatch("408443003", obj.specialty[0].coding[0].code))
        assertTrue(stringMatch("General medical practice", obj.specialty[0].coding[0].display))
        assertTrue(stringMatch("Location/1", obj.location[0].reference))
        assertTrue(stringMatch("South Wing, second floor", obj.location[0].display))
        assertTrue(stringMatch("HealthcareService/example", obj.healthcareService[0].reference))
        assertTrue(stringMatch("phone", obj.telecom[0].system))
        assertTrue(stringMatch("(03) 5555 6473", obj.telecom[0].value))
        assertTrue(stringMatch("work", obj.telecom[0].use))
        assertTrue(stringMatch("email", obj.telecom[1].system))
        assertTrue(stringMatch("adam.southern@example.org", obj.telecom[1].value))
        assertTrue(stringMatch("work", obj.telecom[1].use))
        assertTrue(stringMatch("mon", obj.availableTime[0].daysOfWeek[0]))
        assertTrue(stringMatch("tue", obj.availableTime[0].daysOfWeek[1]))
        assertTrue(stringMatch("wed", obj.availableTime[0].daysOfWeek[2]))
        assertTrue(stringMatch("09:00:00", obj.availableTime[0].availableStartTime))
        assertTrue(stringMatch("16:30:00", obj.availableTime[0].availableEndTime))
        assertTrue(stringMatch("thu", obj.availableTime[1].daysOfWeek[0]))
        assertTrue(stringMatch("fri", obj.availableTime[1].daysOfWeek[1]))
        assertTrue(stringMatch("09:00:00", obj.availableTime[1].availableStartTime))
        assertTrue(stringMatch("12:00:00", obj.availableTime[1].availableEndTime))
        assertTrue(stringMatch("Adam will be on extended leav", obj.notAvailable[0].description))
        assertTrue(stringMatch("2017-05-01", obj.notAvailable[0].during!!.start))
        assertTrue(stringMatch("2017-05-20", obj.notAvailable[0].during!!.end))
        assertTrue(stringMatch("Adam is generally unavailable", obj.availabilityExceptions))
        assertTrue(stringMatch("Endpoint/example", obj.endpoint[0].reference))
    }

    fun `practitionerrole-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
