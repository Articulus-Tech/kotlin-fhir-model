package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MedicationDispenseDataTest : DataTests() {
    @Test
    fun `medicationdispenseexample8 510 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationdispenseexample8.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationDispense::class.java)
        assertTrue(stringMatch("MedicationDispense", obj.resourceType))
        assertTrue(stringMatch("meddisp008", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("medexample015", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("213293", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Capecitabine 500mg oral table", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertEquals(true, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("#medexample015", obj.medicationReference.reference))
        assertTrue(stringMatch("Patient/pat1", obj.subject!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject!!.display))
    }

    @Test
    fun `medicationdispenseexample8 511 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationdispenseexample8.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationDispense::class.java)
        assertTrue(stringMatch("Practitioner/f006", obj.performer[0].actor.reference))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.performer[0].onBehalfOf!!.reference))
        assertTrue(stringMatch("MedicationRequest/medrx0309", obj.authorizingPrescription[0].reference))
        assertEquals(1, obj.dosageInstruction[0].sequence)
        assertEquals(2, obj.dosageInstruction[0].timing!!.repeat!!.frequency)
        assertTrue(stringMatch("%.2f".format(21f), "%.2f".format(obj.dosageInstruction[0].timing!!.repeat!!.period)))
        assertTrue(stringMatch("d", obj.dosageInstruction[0].timing!!.repeat!!.periodUnit))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosageInstruction[0].route!!.coding[0].system))
        assertTrue(stringMatch("394899003", obj.dosageInstruction[0].route!!.coding[0].code))
        assertTrue(stringMatch("oral administration of treatm", obj.dosageInstruction[0].route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format(obj.dosageInstruction[0].doseQuantity!!.value)))
        assertTrue(stringMatch("mg", obj.dosageInstruction[0].doseQuantity!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dosageInstruction[0].doseQuantity!!.system))
        assertTrue(stringMatch("mg", obj.dosageInstruction[0].doseQuantity!!.code))
    }

    fun `medicationdispenseexample8 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
