package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MedicationAdministrationDataTest : DataTests() {
    @Test
    fun `medicationadministrationexample3 367 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationadministrationexample3.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationAdministration::class.java)
        assertTrue(stringMatch("MedicationAdministration", obj.resourceType))
        assertTrue(stringMatch("medadminexample03", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med0303", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("1594660", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Alemtuzumab 10mg/ml (Lemtrada", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertTrue(stringMatch("on-hold", obj.status))
        assertTrue(stringMatch("#med0303", obj.medicationReference.reference))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("Encounter/f001", obj.context!!.reference))
        assertTrue(stringMatch("Condition/f204", obj.supportingInformation[0].reference))
        assertTrue(stringMatch("2015-01-15T14:30:00+01:00", obj.effectivePeriod.start))
        assertTrue(stringMatch("2015-01-15T14:30:00+01:00", obj.effectivePeriod.end))
        assertEquals(true, if (obj.notGiven != null) obj.notGiven else false, "Field: obj.notGiven")
        assertTrue(stringMatch("http://snomed.info/sct", obj.reasonNotGiven[0].coding[0].system))
        assertTrue(stringMatch("373147003", obj.reasonNotGiven[0].coding[0].code))
        assertTrue(stringMatch("Administration of medication ", obj.reasonNotGiven[0].coding[0].display))
        assertTrue(stringMatch("MedicationRequest/medrx0317", obj.prescription!!.reference))
        assertTrue(stringMatch("Patient started Bupropion thi", obj.note[0].text))
    }

    fun `medicationadministrationexample3 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
