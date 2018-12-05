package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MedicationStatementDataTest : DataTests() {
    @Test
    fun `medicationstatementexample5 103 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample5.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example005", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("CarePlan/gpvisit", obj.basedOn[0].reference))
        assertTrue(stringMatch("Encounter/f203", obj.context!!.reference))
        assertTrue(stringMatch("entered-in-error", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.medicationCodeableConcept.coding[0].system))
        assertTrue(stringMatch("27658006", obj.medicationCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Amoxicillin (product)", obj.medicationCodeableConcept.coding[0].display))
        assertTrue(stringMatch("2014-01-23", obj.effectiveDateTime))
        assertTrue(stringMatch("2015-02-22", obj.dateAsserted))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("unk", obj.taken))
        assertTrue(stringMatch("Patient indicated that they t", obj.note[0].text))
    }

    fun `medicationstatementexample5 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample4 104 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample4.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example004", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Observation/blood-pressure", obj.partOf[0].reference))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.medicationCodeableConcept.coding[0].system))
        assertTrue(stringMatch("27658006", obj.medicationCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Amoxicillin (product)", obj.medicationCodeableConcept.coding[0].display))
        assertTrue(stringMatch("2014-01-23", obj.effectiveDateTime))
        assertTrue(stringMatch("2015-02-22", obj.dateAsserted))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("y", obj.taken))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reasonCode[0].coding[0].system))
        assertTrue(stringMatch("65363002", obj.reasonCode[0].coding[0].code))
        assertTrue(stringMatch("Otitis Media", obj.reasonCode[0].coding[0].display))
        assertTrue(stringMatch("Patient indicates they miss t", obj.note[0].text))
        assertTrue(stringMatch("one capsule three times daily", obj.dosage[0].text))
        assertEquals(3, obj.dosage[0].timing!!.repeat!!.frequency)
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].timing!!.repeat!!.period)))
        assertTrue(stringMatch("d", obj.dosage[0].timing!!.repeat!!.periodUnit))
        assertEquals(false, if (obj.dosage[0].asNeededBoolean != null) obj.dosage[0].asNeededBoolean else false, "Field: obj.dosage[0].asNeededBoolean")
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].route!!.coding[0].system))
        assertTrue(stringMatch("260548002", obj.dosage[0].route!!.coding[0].code))
        assertTrue(stringMatch("Oral", obj.dosage[0].route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(3f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.numerator!!.value)))
        assertTrue(stringMatch("capsules", obj.dosage[0].maxDosePerPeriod!!.numerator!!.unit))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].maxDosePerPeriod!!.numerator!!.system))
        assertTrue(stringMatch("385055001", obj.dosage[0].maxDosePerPeriod!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dosage[0].maxDosePerPeriod!!.denominator!!.system))
        assertTrue(stringMatch("d", obj.dosage[0].maxDosePerPeriod!!.denominator!!.code))
    }

    fun `medicationstatementexample4 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample3 105 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample3.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example003", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Little Pink Pill for water re", obj.medicationCodeableConcept.text))
        assertTrue(stringMatch("2014-02-01", obj.effectiveDateTime))
        assertTrue(stringMatch("2014-02-22", obj.dateAsserted))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("y", obj.taken))
        assertTrue(stringMatch("Observation/blood-pressure", obj.reasonReference[0].reference))
        assertTrue(stringMatch("Patient can not remember the ", obj.note[0].text))
        assertEquals(1, obj.dosage[0].sequence)
        assertTrue(stringMatch("1 tablet per day", obj.dosage[0].text))
        assertEquals(false, if (obj.dosage[0].asNeededBoolean != null) obj.dosage[0].asNeededBoolean else false, "Field: obj.dosage[0].asNeededBoolean")
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].route!!.coding[0].system))
        assertTrue(stringMatch("260548002", obj.dosage[0].route!!.coding[0].code))
        assertTrue(stringMatch("Oral", obj.dosage[0].route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].doseQuantity!!.value)))
        assertTrue(stringMatch("tab", obj.dosage[0].doseQuantity!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.dosage[0].doseQuantity!!.system))
        assertTrue(stringMatch("tab", obj.dosage[0].doseQuantity!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.numerator!!.value)))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dosage[0].maxDosePerPeriod!!.denominator!!.system))
        assertTrue(stringMatch("d", obj.dosage[0].maxDosePerPeriod!!.denominator!!.code))
    }

    fun `medicationstatementexample3 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample2 106 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample2.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example002", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med0309", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("50580-506-02", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Tylenol PM", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertEquals(true, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Medication).form!!.coding[0].system))
        assertTrue(stringMatch("385057009", (obj.contained[0] as Medication).form!!.coding[0].code))
        assertTrue(stringMatch("Film-coated tablet (qualifier", (obj.contained[0] as Medication).form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("315266", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Acetaminophen 500 MG", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format((obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", (obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", (obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format((obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", (obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", (obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("901813", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Diphenhydramine Hydrochloride", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format((obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", (obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", (obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format((obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", (obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", (obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.code))
        assertTrue(stringMatch("9494788", (obj.contained[0] as Medication).package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", (obj.contained[0] as Medication).package_fhir!!.batch[0].expirationDate))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("#med0309", obj.medicationReference.reference))
        assertTrue(stringMatch("2015-01-23", obj.effectiveDateTime))
        assertTrue(stringMatch("2015-02-22", obj.dateAsserted))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("n", obj.taken))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reasonNotTaken[0].coding[0].system))
        assertTrue(stringMatch("166643006", obj.reasonNotTaken[0].coding[0].code))
        assertTrue(stringMatch("Liver enzymes abnormal", obj.reasonNotTaken[0].coding[0].display))
        assertTrue(stringMatch("Patient can not take acetamin", obj.note[0].text))
    }

    fun `medicationstatementexample2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample1 107 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample1.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example001", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med0309", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("50580-506-02", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Tylenol PM", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertEquals(true, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Medication).form!!.coding[0].system))
        assertTrue(stringMatch("385057009", (obj.contained[0] as Medication).form!!.coding[0].code))
        assertTrue(stringMatch("Film-coated tablet (qualifier", (obj.contained[0] as Medication).form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("315266", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Acetaminophen 500 MG", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format((obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", (obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", (obj.contained[0] as Medication).ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format((obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", (obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", (obj.contained[0] as Medication).ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("901813", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Diphenhydramine Hydrochloride", (obj.contained[0] as Medication).ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format((obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", (obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", (obj.contained[0] as Medication).ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format((obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", (obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", (obj.contained[0] as Medication).ingredient[1].amount!!.denominator!!.code))
        assertTrue(stringMatch("9494788", (obj.contained[0] as Medication).package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", (obj.contained[0] as Medication).package_fhir!!.batch[0].expirationDate))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://www.bmc.nl/portal/meds", obj.identifier[0].system))
        assertTrue(stringMatch("12345689", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/medicatio", obj.category!!.coding[0].system))
        assertTrue(stringMatch("inpatient", obj.category!!.coding[0].code))
        assertTrue(stringMatch("Inpatient", obj.category!!.coding[0].display))
        assertTrue(stringMatch("#med0309", obj.medicationReference.reference))
        assertTrue(stringMatch("2015-01-23", obj.effectiveDateTime))
        assertTrue(stringMatch("2015-02-22", obj.dateAsserted))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("MedicationRequest/medrx002", obj.derivedFrom[0].reference))
        assertTrue(stringMatch("n", obj.taken))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reasonCode[0].coding[0].system))
        assertTrue(stringMatch("32914008", obj.reasonCode[0].coding[0].code))
        assertTrue(stringMatch("Restless Legs", obj.reasonCode[0].coding[0].display))
        assertTrue(stringMatch("Patient indicates they miss t", obj.note[0].text))
        assertEquals(1, obj.dosage[0].sequence)
        assertTrue(stringMatch("1-2 tablets once daily at bed", obj.dosage[0].text))
        assertTrue(stringMatch("Taking at bedtime", obj.dosage[0].additionalInstruction[0].text))
        assertEquals(1, obj.dosage[0].timing!!.repeat!!.frequency)
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].timing!!.repeat!!.period)))
        assertTrue(stringMatch("d", obj.dosage[0].timing!!.repeat!!.periodUnit))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].asNeededCodeableConcept!!.coding[0].system))
        assertTrue(stringMatch("32914008", obj.dosage[0].asNeededCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Restless Legs", obj.dosage[0].asNeededCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].route!!.coding[0].system))
        assertTrue(stringMatch("26643006", obj.dosage[0].route!!.coding[0].code))
        assertTrue(stringMatch("Oral Route", obj.dosage[0].route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].doseRange!!.low!!.value)))
        assertTrue(stringMatch("TAB", obj.dosage[0].doseRange!!.low!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.dosage[0].doseRange!!.low!!.system))
        assertTrue(stringMatch("TAB", obj.dosage[0].doseRange!!.low!!.code))
    }

    @Test
    fun `medicationstatementexample1 108 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample1.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(obj.dosage[0].doseRange!!.high!!.value)))
        assertTrue(stringMatch("TAB", obj.dosage[0].doseRange!!.high!!.unit))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.dosage[0].doseRange!!.high!!.system))
        assertTrue(stringMatch("TAB", obj.dosage[0].doseRange!!.high!!.code))
    }

    fun `medicationstatementexample1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample7 109 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample7.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example007", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med0315", (obj.contained[0] as Medication).id))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).code!!.coding[0].system))
        assertTrue(stringMatch("358793", (obj.contained[0] as Medication).code!!.coding[0].code))
        assertTrue(stringMatch("Mometasone Furoate 0.05mg/Act", (obj.contained[0] as Medication).code!!.coding[0].display))
        assertEquals(false, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Medication).form!!.coding[0].system))
        assertTrue(stringMatch("385157007", (obj.contained[0] as Medication).form!!.coding[0].code))
        assertTrue(stringMatch("Nasal Spray", (obj.contained[0] as Medication).form!!.coding[0].display))
        assertTrue(stringMatch("intended", obj.status))
        assertTrue(stringMatch("#med0315", obj.medicationReference.reference))
        assertTrue(stringMatch("Patient/pat1", obj.informationSource!!.reference))
        assertTrue(stringMatch("Donald Duck", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("y", obj.taken))
        assertTrue(stringMatch("patient plans to start using ", obj.note[0].text))
    }

    fun `medicationstatementexample7 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationstatementexample6 110 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationstatementexample6.json").readTextAndClose()
        val obj = mapper.fromJson(json, MedicationStatement::class.java)
        assertTrue(stringMatch("MedicationStatement", obj.resourceType))
        assertTrue(stringMatch("example006", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://snomed.info/sct", obj.medicationCodeableConcept.coding[0].system))
        assertTrue(stringMatch("27658006", obj.medicationCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Amoxicillin (product)", obj.medicationCodeableConcept.coding[0].display))
        assertTrue(stringMatch("2014-02-01", obj.effectiveDateTime))
        assertTrue(stringMatch("2014-02-22", obj.dateAsserted))
        assertTrue(stringMatch("RelatedPerson/peter", obj.informationSource!!.reference))
        assertTrue(stringMatch("Peter Chalmers", obj.informationSource!!.display))
        assertTrue(stringMatch("Patient/pat1", obj.subject.reference))
        assertTrue(stringMatch("Donald Duck", obj.subject.display))
        assertTrue(stringMatch("n", obj.taken))
        assertTrue(stringMatch("Father indicates they miss th", obj.note[0].text))
        assertEquals(1, obj.dosage[0].sequence)
        assertTrue(stringMatch("5ml three times daily", obj.dosage[0].text))
        assertEquals(false, if (obj.dosage[0].asNeededBoolean != null) obj.dosage[0].asNeededBoolean else false, "Field: obj.dosage[0].asNeededBoolean")
        assertTrue(stringMatch("http://snomed.info/sct", obj.dosage[0].route!!.coding[0].system))
        assertTrue(stringMatch("260548002", obj.dosage[0].route!!.coding[0].code))
        assertTrue(stringMatch("Oral", obj.dosage[0].route!!.coding[0].display))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.dosage[0].doseQuantity!!.value)))
        assertTrue(stringMatch("mL", obj.dosage[0].doseQuantity!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dosage[0].doseQuantity!!.system))
        assertTrue(stringMatch("mL", obj.dosage[0].doseQuantity!!.code))
        assertTrue(stringMatch("%.2f".format(3f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.numerator!!.value)))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.dosage[0].maxDosePerPeriod!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.dosage[0].maxDosePerPeriod!!.denominator!!.system))
        assertTrue(stringMatch("d", obj.dosage[0].maxDosePerPeriod!!.denominator!!.code))
    }

    fun `medicationstatementexample6 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
