package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MedicationRequestDataTest : DataTests() {
    @Test
    fun `medicationrequestexample1 544 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationrequestexample1.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationRequest::class.java)
        assertTrue(stringMatch("MedicationRequest", obj.resourceType))
        assertTrue(stringMatch("medrx0311", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med0316", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("317935006", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Chlorthalidone 50mg tablet (p", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertEquals(false, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Medication).form!!.coding[0].system))
        assertTrue(stringMatch("385055001", (obj.contained[0] as Medication).form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", (obj.contained[0] as Medication).form!!.coding[0].display))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.bmc.nl/portal/pres", obj.identifier[0].system))
        assertTrue(stringMatch("12345689", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("#med0316", obj.medicationReference.reference))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("Encounter/f001", obj.context!!.reference))
        assertTrue(stringMatch("encounter who leads to this p", obj.context!!.display))
        assertTrue(stringMatch("2015-01-15", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/f007", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Patrick Pump", obj.requester!!.agent.display))
        assertTrue(stringMatch("Organization/f002", obj.requester!!.onBehalfOf!!.reference))
        assertTrue(stringMatch("Condition/f201", obj.reasonReference[0].reference))
        assertTrue(stringMatch("condition for prescribing thi", obj.reasonReference[0].display))
        assertTrue(stringMatch("Chlorthalidone increases urni", obj.note[0].text))
        assertEquals(1, obj.dosageInstruction[0].sequence)
        assertTrue(stringMatch("One tablet daily", obj.dosageInstruction[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosageInstruction[0].additionalInstruction[0].coding[0].system))
        assertTrue(stringMatch("311504000", obj.dosageInstruction[0].additionalInstruction[0].coding[0].code))
        assertTrue(stringMatch("With or after food", obj.dosageInstruction[0].additionalInstruction[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/GTSAbb", obj.dosageInstruction[0].timing!!.code!!.coding[0].system))
        assertTrue(stringMatch("QD", obj.dosageInstruction[0].timing!!.code!!.coding[0].code))
        assertTrue(stringMatch("QD", obj.dosageInstruction[0].timing!!.code!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosageInstruction[0].route!!.coding[0].system))
        assertTrue(stringMatch("26643006", obj.dosageInstruction[0].route!!.coding[0].code))
        assertTrue(stringMatch("Oral Route", obj.dosageInstruction[0].route!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosageInstruction[0].method!!.coding[0].system))
        assertTrue(stringMatch("421521009", obj.dosageInstruction[0].method!!.coding[0].code))
        assertTrue(stringMatch("Swallow - dosing instruction ", obj.dosageInstruction[0].method!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosageInstruction[0].doseQuantity!!.value)))
        assertTrue(stringMatch("TAB", obj.dosageInstruction[0].doseQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.dosageInstruction[0].doseQuantity!!.system))
        assertTrue(stringMatch("TAB", obj.dosageInstruction[0].doseQuantity!!.code))
        assertTrue(stringMatch("2015-01-15", obj.dispenseRequest!!.validityPeriod!!.start))
        assertTrue(stringMatch("2016-01-15", obj.dispenseRequest!!.validityPeriod!!.end))
        assertEquals(1, obj.dispenseRequest!!.numberOfRepeatsAllowed)
        assertTrue(stringMatch("%.2f".format(30f), "%.2f".format(obj.dispenseRequest!!.quantity!!.value)))
        assertTrue(stringMatch("TAB", obj.dispenseRequest!!.quantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.dispenseRequest!!.quantity!!.system))
        assertTrue(stringMatch("TAB", obj.dispenseRequest!!.quantity!!.code))
        assertTrue(stringMatch("%.2f".format(30f), "%.2f".format(obj.dispenseRequest!!.expectedSupplyDuration!!.value)))
        assertTrue(stringMatch("days", obj.dispenseRequest!!.expectedSupplyDuration!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dispenseRequest!!.expectedSupplyDuration!!.system))
        assertTrue(stringMatch("d", obj.dispenseRequest!!.expectedSupplyDuration!!.code))
        assertEquals(true, if (obj.substitution!!.allowed != null) obj.substitution!!.allowed else false, "Field: obj.substitution!!.allowed")
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.substitution!!.reason!!.coding[0].system))
        assertTrue(stringMatch("CT", obj.substitution!!.reason!!.coding[0].code))
        assertTrue(stringMatch("continuing therapy", obj.substitution!!.reason!!.coding[0].display))
    }

    fun `medicationrequestexample1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationrequestexample2 545 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationrequestexample2.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationRequest::class.java)
        assertTrue(stringMatch("MedicationRequest", obj.resourceType))
        assertTrue(stringMatch("medrx002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.bmc.nl/portal/pres", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("order", obj.intent))
        assertTrue(stringMatch("Medication/med0316", obj.medicationReference.reference))
        assertTrue(stringMatch("prescribed medication", obj.medicationReference.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("Encounter/f001", obj.context!!.reference))
        assertTrue(stringMatch("encounter that leads to this ", obj.context!!.display))
        assertTrue(stringMatch("2015-03-01", obj.authoredOn))
        assertTrue(stringMatch("Practitioner/f007", obj.requester!!.agent.reference))
        assertTrue(stringMatch("Patrick Pump", obj.requester!!.agent.display))
        assertTrue(stringMatch("Organization/f002", obj.requester!!.onBehalfOf!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reasonCode[0].coding[0].system))
        assertTrue(stringMatch("59621000", obj.reasonCode[0].coding[0].code))
        assertTrue(stringMatch("Essential hypertension (disor", obj.reasonCode[0].coding[0].display))
        assertEquals(1, obj.dosageInstruction[0].sequence)
        assertTrue(stringMatch("Take one tablet daily as dire", obj.dosageInstruction[0].text))
    }

    fun `medicationrequestexample2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
