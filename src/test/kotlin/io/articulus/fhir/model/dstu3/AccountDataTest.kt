package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class AccountDataTest : DataTests() {
    @Test
    fun `account-example 548 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/account-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Account::class.java)
        assertTrue(stringMatch("Account", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("654321", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.type!!.coding[0].system))
        assertTrue(stringMatch("PBILLACCT", obj.type!!.coding[0].code))
        assertTrue(stringMatch("patient billing account", obj.type!!.coding[0].display))
        assertTrue(stringMatch("patient", obj.type!!.text))
        assertTrue(stringMatch("HACC Funded Billing for Peter", obj.name))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.subject!!.display))
        assertTrue(stringMatch("2016-01-01", obj.period!!.start))
        assertTrue(stringMatch("2016-06-30", obj.period!!.end))
        assertTrue(stringMatch("2016-01-01", obj.active!!.start))
        assertTrue(stringMatch("2016-06-30", obj.active!!.end))
        assertTrue(stringMatch("%.2f".format(-1200f), "%.2f".format(obj.balance!!.value)))
        assertTrue(stringMatch("USD", obj.balance!!.unit))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.balance!!.system))
        assertTrue(stringMatch("USD", obj.balance!!.code))
        assertTrue(stringMatch("Coverage/7546D", obj.coverage[0].coverage.reference))
        assertEquals(1, obj.coverage[0].priority)
        assertTrue(stringMatch("Organization/hl7", obj.owner!!.reference))
        assertTrue(stringMatch("Hospital charges", obj.description))
    }

    fun `account-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `account-example-with-guarantor 549 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/account-example-with-guarantor.json").readTextAndClose()
        val obj = mapper.fromJson(json, Account::class.java)
        assertTrue(stringMatch("Account", obj.resourceType))
        assertTrue(stringMatch("ewg", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:0.1.2.3.4.5.6.7", obj.identifier[0].system))
        assertTrue(stringMatch("654321", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.type!!.coding[0].system))
        assertTrue(stringMatch("PBILLACCT", obj.type!!.coding[0].code))
        assertTrue(stringMatch("patient billing account", obj.type!!.coding[0].display))
        assertTrue(stringMatch("patient", obj.type!!.text))
        assertTrue(stringMatch("Inpatient: Peter James Chalme", obj.name))
        assertTrue(stringMatch("Patient/example", obj.subject!!.reference))
        assertTrue(stringMatch("Peter James Chalmers", obj.subject!!.display))
        assertTrue(stringMatch("2016-01-01", obj.period!!.start))
        assertTrue(stringMatch("2016-06-30", obj.period!!.end))
        assertTrue(stringMatch("2016-01-01", obj.active!!.start))
        assertTrue(stringMatch("2016-06-30", obj.active!!.end))
        assertTrue(stringMatch("%.2f".format(-1200f), "%.2f".format(obj.balance!!.value)))
        assertTrue(stringMatch("USD", obj.balance!!.unit))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.balance!!.system))
        assertTrue(stringMatch("USD", obj.balance!!.code))
        assertTrue(stringMatch("Coverage/9876B1", obj.coverage[0].coverage.reference))
        assertEquals(1, obj.coverage[0].priority)
        assertTrue(stringMatch("Coverage/7546D", obj.coverage[1].coverage.reference))
        assertEquals(2, obj.coverage[1].priority)
        assertTrue(stringMatch("Organization/f001", obj.owner!!.reference))
        assertTrue(stringMatch("Burgers University Medical Ce", obj.owner!!.display))
        assertTrue(stringMatch("Hospital charges", obj.description))
        assertTrue(stringMatch("RelatedPerson/benedicte", obj.guarantor[0].party.reference))
        assertTrue(stringMatch("Bénédicte du Marché", obj.guarantor[0].party.display))
        assertEquals(false, if (obj.guarantor[0].onHold != null) obj.guarantor[0].onHold else false, "Field: obj.guarantor[0].onHold")
        assertTrue(stringMatch("2016-01-01", obj.guarantor[0].period!!.start))
    }

    fun `account-example-with-guarantor Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
