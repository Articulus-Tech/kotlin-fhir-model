package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SupplyDeliveryDataTest : DataTests() {
    @Test
    fun `supplydelivery-example 581 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/supplydelivery-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, SupplyDelivery::class.java)
        assertTrue(stringMatch("SupplyDelivery", obj.resourceType))
        assertTrue(stringMatch("simpledelivery", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Order10284", obj.identifier!!.value))
        assertTrue(stringMatch("SupplyRequest/simpleorder", obj.basedOn[0].reference))
        assertTrue(stringMatch("Central Supply Restock", obj.partOf[0].display))
        assertTrue(stringMatch("completed", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/supply-it", obj.type!!.coding[0].system))
        assertTrue(stringMatch("device", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Blood collect tubes blue cap", obj.type!!.text))
        assertTrue(stringMatch("%.2f".format(10f), "%.2f".format(obj.suppliedItem!!.quantity!!.value)))
        assertTrue(stringMatch("BlueTubes", obj.suppliedItem!!.itemCodeableConcept!!.coding[0].code))
        assertTrue(stringMatch("Blood collect tubes blue cap", obj.suppliedItem!!.itemCodeableConcept!!.coding[0].display))
        assertTrue(stringMatch("2016-12-31", obj.occurrenceDateTime))
        assertTrue(stringMatch("Vendor1", obj.supplier!!.display))
        assertTrue(stringMatch("Location 1", obj.destination!!.display))
    }

    fun `supplydelivery-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `supplydelivery-example-pumpdelivery 582 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/supplydelivery-example-pumpdelivery.json").readTextAndClose()
        val obj = mapper.fromJson(json, SupplyDelivery::class.java)
        assertTrue(stringMatch("SupplyDelivery", obj.resourceType))
        assertTrue(stringMatch("pumpdelivery", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
    }

    @Test
    fun `supplydelivery-example-pumpdelivery 583 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/supplydelivery-example-pumpdelivery.json").readTextAndClose()
        val obj = mapper.fromJson(json, SupplyDelivery::class.java)
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("98398459409", obj.identifier!!.value))
        assertTrue(stringMatch("SupplierDeliveryNr", obj.identifier!!.assigner!!.display))
        assertTrue(stringMatch("in-progress", obj.status))
        assertTrue(stringMatch("Mr. Belpit", obj.patient!!.display))
        assertTrue(stringMatch("ACME distribution", obj.supplier!!.display))
        assertTrue(stringMatch("Home care dept", obj.destination!!.display))
        assertTrue(stringMatch("Nurse Smith", obj.receiver[0].display))
    }

    fun `supplydelivery-example-pumpdelivery Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
