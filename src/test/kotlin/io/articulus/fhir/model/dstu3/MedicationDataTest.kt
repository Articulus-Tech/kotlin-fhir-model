package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MedicationDataTest : DataTests() {
    @Test
    fun `medicationexample0307 281 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0307.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0307", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org3", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Novo Nordisk", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("0169-7501-11", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Novolog 100u/ml", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org3", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("325072002", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Insulin Aspart (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("U", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("415818006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Vial", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("325072002", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Insulin Aspart (substance)", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("mL", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("12345", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2019-10-31", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0307 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0311 282 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0311.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0311", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub03", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("116602009", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Prednisone (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("373994007", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Prednisone 5mg tablet (Produc", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub03", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0311 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0310 283 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0310.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0310", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
    }

    @Test
    fun `medicationexample0310 284 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0310.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub03", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("55452001", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Oxycodone (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("430127000", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Oral Form Oxycodone (product)", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub03", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0310 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0306 285 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0306.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0306", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org3", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Seattle Genetics Inc", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("51144-050-01", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Adcetris", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org3", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("421637006", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Lyophilized powder for inject", obj.form!!.coding[0].display))
        assertTrue(stringMatch("12345", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2019-10-31", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0306 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0301 286 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0301.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0301", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org4", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Pfizer Laboratories Div Pfize", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("0069-2587-10", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Vancomycin Hydrochloride (VAN", obj.code!!.coding[0].display))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertEquals(false, if (obj.isOverTheCounter != null) obj.isOverTheCounter else false, "Field: obj.isOverTheCounter")
        assertTrue(stringMatch("#org4", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection Solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("66955", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Vancomycin Hydrochloride", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertEquals(true, if (obj.ingredient[0].isActive != null) obj.ingredient[0].isActive else false, "Field: obj.ingredient[0].isActive")
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("415818006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Vial", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("324337001", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Vancomycin 500mg powder for i", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("mL", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
        assertTrue(stringMatch("application/pdf", obj.image[0].contentType))
        assertTrue(stringMatch("https://www.drugs.com/images/", obj.image[0].url))
        assertTrue(stringMatch("Vancomycin Image", obj.image[0].title))
    }

    fun `medicationexample0301 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0317 287 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0317.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0317", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection Solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("Injection Solution (qualifier", obj.form!!.text))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("204520", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Potassium Chloride", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mEq", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("313002", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Sodium Chloride 0.9% injectab", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(0.9f), "%.2f".format(obj.ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[1].amount!!.denominator!!.code))
    }

    fun `medicationexample0317 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample1 288 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("medicationexample1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Amoxicillin 250mg/5ml Suspens", obj.code!!.text))
    }

    fun `medicationexample1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample15 289 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample15.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("medexample015", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org2", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Gene Inc", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("Substance", (obj.contained[1] as Substance).resourceType))
        assertTrue(stringMatch("sub04", (obj.contained[1] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[1] as Substance).code.coding[0].system))
        assertTrue(stringMatch("386906001", (obj.contained[1] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Capecitabine (substance)", (obj.contained[1] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.code!!.coding[0].system))
        assertTrue(stringMatch("213293", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Capecitabine 500mg oral table", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org2", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub04", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("419672006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Bottle - unit of produce usag", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("134622004", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Capecitabine 500mg tablets (p", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample15 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0321 290 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0321.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0321", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub03", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("386906001", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Capecitabine (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("108761006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Capecitabine (product)", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub03", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0321 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0320 291 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0320.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0320", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub03", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("387531004", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Azithromycin (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("324252006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Azithromycin 250mg capsule (p", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub03", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(250f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0320 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0316 292 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0316.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0316", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub04", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("387324004", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Chlorthalidone (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("317935006", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Chlorthalidone 50mg tablet (p", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub04", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(50f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0316 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0315 293 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0315.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0315", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.code!!.coding[0].system))
        assertTrue(stringMatch("358793", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Mometasone Furoate 0.05mg/Act", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385157007", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Nasal Spray", obj.form!!.coding[0].display))
    }

    fun `medicationexample0315 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0303 294 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0303.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0303", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org6", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Genzyme", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.code!!.coding[0].system))
        assertTrue(stringMatch("1594660", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Alemtuzumab 10mg/ml (Lemtrada", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org6", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("129472003", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Alemtuzamab (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(12f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1.2f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("415818006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Vial", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("408596005", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Alemtuzumab 30mg/3mL infusion", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(3f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("mL", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0303 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0319 295 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0319.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0319", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385101003", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Ointment", obj.form!!.coding[0].display))
        assertTrue(stringMatch("Ointment", obj.form!!.text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("387253001", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Salicyclic Acid (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("396458002", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Hydrocortisone (substance)", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[1].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[2].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("126066007", obj.ingredient[2].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("White Petrolatum (substance)", obj.ingredient[2].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(94f), "%.2f".format(obj.ingredient[2].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[2].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[2].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.ingredient[2].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[2].amount!!.denominator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[2].amount!!.denominator!!.code))
    }

    fun `medicationexample0319 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0318 296 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0318.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0318", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385221006", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection emulsion", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("0338-1134-03", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Clinimix 4.25/10 sulfite-free", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("0409-5779-01", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("TPN Electrolytes SODIUM CHLOR", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.ingredient[2].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("0338-0519-02", obj.ingredient[2].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Intralipid 20% IV Fat Emulsio", obj.ingredient[2].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("470037004", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Intravenous Fluid container, ", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("123455", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2016-07-09", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0318 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0302 297 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0302.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0302", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org7", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Wyeth Pharmaceuticals Inc", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("0206-8862-02", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Zosyn (piperacillin/tazobacta", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org7", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("203134", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Piperacillin Sodium", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(4f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(20f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("221167", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Tazobactam Sodium", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(0.5f), "%.2f".format(obj.ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("g", obj.ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(20f), "%.2f".format(obj.ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[1].amount!!.denominator!!.code))
    }

    fun `medicationexample0302 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0314 298 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0314.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0314", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.code!!.coding[0].system))
        assertTrue(stringMatch("308047", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Alprazolam 0.25mg Oral Tablet", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("386983007", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Alprazolam (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(0.25f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0314 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0309 299 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0309.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0309", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org2", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Johnson and Johnson Consume I", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("50580-506-02", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Tylenol PM", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org2", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385057009", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Film-coated tablet (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("315266", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Acetaminophen 500 MG", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(500f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("901813", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Diphenhydramine Hydrochloride", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format(obj.ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", obj.ingredient[1].amount!!.denominator!!.code))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0309 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0313 300 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0313.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0313", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("400621001", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Lorazepam 2mg/ml injection so", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385219001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Injection solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("387106007", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Lorazepam (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0313 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0305 301 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0305.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0305", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org5", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Aton Pharma Inc", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("2501-813-16", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Timoptic 5mg/ml solution", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org5", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("75359005", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Opthalmic Solution (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("75359005", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Timolol Maleate (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("419672006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Bottle - unit of product usag", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("376877002", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Timolol maleate 0.5% opthalmi", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("mL", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0305 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0304 302 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0304.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0304", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Organization", (obj.contained[0] as Organization).resourceType))
        assertTrue(stringMatch("org6", (obj.contained[0] as Organization).id))
        assertTrue(stringMatch("Aspen Global Inc", (obj.contained[0] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("76388-713-25", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Myleran 2mg tablet, film coat", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org6", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385057009", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Film-coated tablet (qualifier", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("387138002", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Busulfan (substance)", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(2f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("Tab", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("419672006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Bottle - unit of product usag", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("76388-713-25", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Myleran 2mg tablet, film coat", obj.package_fhir!!.content[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(25f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("Tab", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("9494788", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2017-05-22", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0304 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0312 303 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0312.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0312", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("sub02", (obj.contained[0] as Substance).id))
    }

    @Test
    fun `medicationexample0312 304 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0312.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("387048002", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Nystatin (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code!!.coding[0].system))
        assertTrue(stringMatch("324689003", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Nystatin 100,000 units/ml ora", obj.code!!.coding[0].display))
        assertEquals(false, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("387048002", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Oral suspension (qualifier va", obj.form!!.coding[0].display))
        assertTrue(stringMatch("#sub02", obj.ingredient[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(100000f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("IU", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("mL", obj.ingredient[0].amount!!.denominator!!.code))
    }

    fun `medicationexample0312 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `medicationexample0308 305 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/medicationexample0308.json").readTextAndClose()
        val obj = mapper.fromJson(json, Medication::class.java)
        assertTrue(stringMatch("Medication", obj.resourceType))
        assertTrue(stringMatch("med0308", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Medication", (obj.contained[0] as Medication).resourceType))
        assertTrue(stringMatch("med500", (obj.contained[0] as Medication).id))
        assertEquals(false, if ((obj.contained[0] as Medication).isBrand != null) (obj.contained[0] as Medication).isBrand else false, "Field: (obj.contained[0] as Medication).isBrand")
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("1049221", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Acetaminophen 325mg/Oxycodone", (obj.contained[0] as Medication).ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("Organization", (obj.contained[1] as Organization).resourceType))
        assertTrue(stringMatch("org1", (obj.contained[1] as Organization).id))
        assertTrue(stringMatch("Stat Rx USA LLC", (obj.contained[1] as Organization).name))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/ndc", obj.code!!.coding[0].system))
        assertTrue(stringMatch("16590-619-30", obj.code!!.coding[0].code))
        assertTrue(stringMatch("Percocet tablet", obj.code!!.coding[0].display))
        assertEquals(true, if (obj.isBrand != null) obj.isBrand else false, "Field: obj.isBrand")
        assertTrue(stringMatch("#org1", obj.manufacturer!!.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.form!!.coding[0].system))
        assertTrue(stringMatch("385055001", obj.form!!.coding[0].code))
        assertTrue(stringMatch("Tablet dose form (qualifier v", obj.form!!.coding[0].display))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[0].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("82063", obj.ingredient[0].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Oxycodone HCl", obj.ingredient[0].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(5f), "%.2f".format(obj.ingredient[0].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[0].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[0].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[0].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://www.nlm.nih.gov/resear", obj.ingredient[1].itemCodeableConcept.coding[0].system))
        assertTrue(stringMatch("161", obj.ingredient[1].itemCodeableConcept.coding[0].code))
        assertTrue(stringMatch("Acetaminophen", obj.ingredient[1].itemCodeableConcept.coding[0].display))
        assertTrue(stringMatch("%.2f".format(325f), "%.2f".format(obj.ingredient[1].amount!!.numerator!!.value)))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].amount!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[1].amount!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.ingredient[1].amount!!.denominator!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.ingredient[1].amount!!.denominator!!.system))
        assertTrue(stringMatch("TAB", obj.ingredient[1].amount!!.denominator!!.code))
        assertTrue(stringMatch("http://snomed.info/sct", obj.package_fhir!!.container!!.coding[0].system))
        assertTrue(stringMatch("419672006", obj.package_fhir!!.container!!.coding[0].code))
        assertTrue(stringMatch("Bottle - unit of product usag", obj.package_fhir!!.container!!.coding[0].display))
        assertTrue(stringMatch("#med500", obj.package_fhir!!.content[0].itemReference.reference))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.package_fhir!!.content[0].amount!!.value)))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ordera", obj.package_fhir!!.content[0].amount!!.system))
        assertTrue(stringMatch("TAB", obj.package_fhir!!.content[0].amount!!.code))
        assertTrue(stringMatch("658484", obj.package_fhir!!.batch[0].lotNumber))
        assertTrue(stringMatch("2020-07-31", obj.package_fhir!!.batch[0].expirationDate))
    }

    fun `medicationexample0308 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
