package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SubstanceDataTest : DataTests() {
    @Test
    fun `substance-example-silver-nitrate-product 360 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-silver-nitrate-product.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f204", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.org/identifiers/s", obj.identifier[0].system))
        assertTrue(stringMatch("15970", obj.identifier[0].value))
    }

    @Test
    fun `substance-example-silver-nitrate-product 361 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-silver-nitrate-product.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("http://hl7.org.fhir/substance", obj.category[0].coding[0].system))
        assertTrue(stringMatch("chemical", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Chemical", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("333346007", obj.code.coding[0].code))
        assertTrue(stringMatch("Silver nitrate 20% solution (", obj.code.coding[0].display))
        assertTrue(stringMatch("Solution for silver nitrate s", obj.description))
        assertTrue(stringMatch("http://acme.org/identifiers/s", obj.instance[0].identifier!!.system))
        assertTrue(stringMatch("AB94687", obj.instance[0].identifier!!.value))
        assertTrue(stringMatch("2018-01-01", obj.instance[0].expiry))
        assertTrue(stringMatch("%.2f".format(100f), "%.2f".format(obj.instance[0].quantity!!.value)))
        assertTrue(stringMatch("mL", obj.instance[0].quantity!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.instance[0].quantity!!.system))
        assertTrue(stringMatch("mL", obj.instance[0].quantity!!.code))
    }

    fun `substance-example-silver-nitrate-product Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `substance-example-amoxicillin-clavulanate 362 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-amoxicillin-clavulanate.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f205", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Substance", (obj.contained[0] as Substance).resourceType))
        assertTrue(stringMatch("ingr1", (obj.contained[0] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[0] as Substance).code.coding[0].system))
        assertTrue(stringMatch("372687004", (obj.contained[0] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Amoxicillin (substance)", (obj.contained[0] as Substance).code.coding[0].display))
        assertTrue(stringMatch("Substance", (obj.contained[1] as Substance).resourceType))
        assertTrue(stringMatch("ingr2", (obj.contained[1] as Substance).id))
        assertTrue(stringMatch("http://snomed.info/sct", (obj.contained[1] as Substance).code.coding[0].system))
        assertTrue(stringMatch("395938000", (obj.contained[1] as Substance).code.coding[0].code))
        assertTrue(stringMatch("Clavulanate potassium (substa", (obj.contained[1] as Substance).code.coding[0].display))
        assertTrue(stringMatch("http://hl7.org.fhir/substance", obj.category[0].coding[0].system))
        assertTrue(stringMatch("drug", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Drug or Medicament", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("392259005", obj.code.coding[0].code))
        assertTrue(stringMatch("Amoxicillin + clavulanate pot", obj.code.coding[0].display))
        assertTrue(stringMatch("Augmentin 875", obj.description))
        assertTrue(stringMatch("%.2f".format(875f), "%.2f".format(obj.ingredient[0].quantity!!.numerator!!.value)))
        assertTrue(stringMatch("mg", obj.ingredient[0].quantity!!.numerator!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].quantity!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].quantity!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1000f), "%.2f".format(obj.ingredient[0].quantity!!.denominator!!.value)))
        assertTrue(stringMatch("mg", obj.ingredient[0].quantity!!.denominator!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[0].quantity!!.denominator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[0].quantity!!.denominator!!.code))
        assertTrue(stringMatch("#ingr1", obj.ingredient[0].substanceReference.reference))
        assertTrue(stringMatch("%.2f".format(125f), "%.2f".format(obj.ingredient[1].quantity!!.numerator!!.value)))
        assertTrue(stringMatch("mg", obj.ingredient[1].quantity!!.numerator!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].quantity!!.numerator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[1].quantity!!.numerator!!.code))
        assertTrue(stringMatch("%.2f".format(1000f), "%.2f".format(obj.ingredient[1].quantity!!.denominator!!.value)))
        assertTrue(stringMatch("mg", obj.ingredient[1].quantity!!.denominator!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.ingredient[1].quantity!!.denominator!!.system))
        assertTrue(stringMatch("mg", obj.ingredient[1].quantity!!.denominator!!.code))
        assertTrue(stringMatch("#ingr2", obj.ingredient[1].substanceReference.reference))
    }

    fun `substance-example-amoxicillin-clavulanate Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `substance-example-f203-potassium 363 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-f203-potassium.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f203", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.org/identifiers/s", obj.identifier[0].system))
        assertTrue(stringMatch("1234", obj.identifier[0].value))
        assertTrue(stringMatch("http://hl7.org.fhir/substance", obj.category[0].coding[0].system))
        assertTrue(stringMatch("chemical", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Chemical", obj.category[0].coding[0].display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("88480006", obj.code.coding[0].code))
        assertTrue(stringMatch("Potassium", obj.code.coding[0].display))
    }

    fun `substance-example-f203-potassium Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `substance-example-f201-dust 364 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-f201-dust.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f201", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("406466009", obj.code.coding[0].code))
        assertTrue(stringMatch("House dust allergen", obj.code.coding[0].display))
    }

    fun `substance-example-f201-dust Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `substance-example 365 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://acme.org/identifiers/s", obj.identifier[0].system))
        assertTrue(stringMatch("1463", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org.fhir/substance", obj.category[0].coding[0].system))
        assertTrue(stringMatch("allergen", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Allergen", obj.category[0].coding[0].display))
        assertTrue(stringMatch("apitoxin (Honey Bee Venom)", obj.code.text))
    }

    fun `substance-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `substance-example-f202-staphylococcus 366 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/substance-example-f202-staphylococcus.json").readTextAndClose()
        val obj = mapper.fromJson(json, Substance::class.java)
        assertTrue(stringMatch("Substance", obj.resourceType))
        assertTrue(stringMatch("f202", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://snomed.info/sct", obj.code.coding[0].system))
        assertTrue(stringMatch("3092008", obj.code.coding[0].code))
        assertTrue(stringMatch("Staphylococcus Aureus", obj.code.coding[0].display))
    }

    fun `substance-example-f202-staphylococcus Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
