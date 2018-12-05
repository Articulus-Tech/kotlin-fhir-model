package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class FamilyMemberHistoryDataTest : DataTests() {
    @Test
    fun `familymemberhistory-example 94 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/familymemberhistory-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, FamilyMemberHistory::class.java)
        assertTrue(stringMatch("FamilyMemberHistory", obj.resourceType))
        assertTrue(stringMatch("father", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("Family Member History Questio", obj.definition[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertEquals(false, if (obj.notDone != null) obj.notDone else false, "Field: obj.notDone")
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("Peter Patient", obj.patient.display))
        assertTrue(stringMatch("2011-03-18", obj.date))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.relationship.coding[0].system))
        assertTrue(stringMatch("FTH", obj.relationship.coding[0].code))
        assertTrue(stringMatch("father", obj.relationship.coding[0].display))
        assertTrue(stringMatch("male", obj.gender))
        assertTrue(stringMatch("http://snomed.info/sct", obj.condition[0].code.coding[0].system))
        assertTrue(stringMatch("315619001", obj.condition[0].code.coding[0].code))
        assertTrue(stringMatch("Myocardial Infarction", obj.condition[0].code.coding[0].display))
        assertTrue(stringMatch("Heart Attack", obj.condition[0].code.text))
        assertTrue(stringMatch("%.2f".format(74f), "%.2f".format(obj.condition[0].onsetAge!!.value)))
        assertTrue(stringMatch("yr", obj.condition[0].onsetAge!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.condition[0].onsetAge!!.system))
        assertTrue(stringMatch("a", obj.condition[0].onsetAge!!.code))
        assertTrue(stringMatch("Was fishing at the time. At l", obj.condition[0].note[0].text))
    }

    fun `familymemberhistory-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `familymemberhistory-example-mother 95 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/familymemberhistory-example-mother.json").readTextAndClose()
        val obj = mapper.fromJson(json, FamilyMemberHistory::class.java)
        assertTrue(stringMatch("FamilyMemberHistory", obj.resourceType))
        assertTrue(stringMatch("mother", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("Patient/100", obj.patient.reference))
        assertTrue(stringMatch("Peter Patient", obj.patient.display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/RoleCo", obj.relationship.coding[0].system))
        assertTrue(stringMatch("MTH", obj.relationship.coding[0].code))
        assertTrue(stringMatch("mother", obj.relationship.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.condition[0].code.coding[0].system))
        assertTrue(stringMatch("371041009", obj.condition[0].code.coding[0].code))
        assertTrue(stringMatch("Embolic Stroke", obj.condition[0].code.coding[0].display))
        assertTrue(stringMatch("Stroke", obj.condition[0].code.text))
        assertTrue(stringMatch("%.2f".format(56f), "%.2f".format(obj.condition[0].onsetAge!!.value)))
        assertTrue(stringMatch("yr", obj.condition[0].onsetAge!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.condition[0].onsetAge!!.system))
        assertTrue(stringMatch("a", obj.condition[0].onsetAge!!.code))
    }

    fun `familymemberhistory-example-mother Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
