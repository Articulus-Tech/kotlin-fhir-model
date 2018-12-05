package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ClaimResponseDataTest : DataTests() {
    @Test
    fun `claimresponse-example 538 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/claimresponse-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ClaimResponse::class.java)
        assertTrue(stringMatch("ClaimResponse", obj.resourceType))
        assertTrue(stringMatch("R3500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("R3500", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/1", obj.patient!!.reference))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("http://www.jurisdiction.org/i", obj.insurer!!.identifier!!.system))
        assertTrue(stringMatch("555123", obj.insurer!!.identifier!!.value))
        assertTrue(stringMatch("Practitioner/1", obj.requestProvider!!.reference))
        assertTrue(stringMatch("Organization/1", obj.requestOrganization!!.reference))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Claim settled as per contract", obj.disposition))
        assertTrue(stringMatch("http://hl7.org/fhir/payeetype", obj.payeeType!!.coding[0].system))
        assertTrue(stringMatch("provider", obj.payeeType!!.coding[0].code))
        assertEquals(1, obj.item[0].sequenceLinkId)
        assertTrue(stringMatch("eligible", obj.item[0].adjudication[0].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(135.57f), "%.2f".format(obj.item[0].adjudication[0].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].adjudication[0].amount!!.system))
        assertTrue(stringMatch("USD", obj.item[0].adjudication[0].amount!!.code))
        assertTrue(stringMatch("copay", obj.item[0].adjudication[1].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(10.00f), "%.2f".format(obj.item[0].adjudication[1].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].adjudication[1].amount!!.system))
        assertTrue(stringMatch("USD", obj.item[0].adjudication[1].amount!!.code))
        assertTrue(stringMatch("eligpercent", obj.item[0].adjudication[2].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(80.00f), "%.2f".format(obj.item[0].adjudication[2].value)))
        assertTrue(stringMatch("benefit", obj.item[0].adjudication[3].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(100.47f), "%.2f".format(obj.item[0].adjudication[3].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].adjudication[3].amount!!.system))
        assertTrue(stringMatch("USD", obj.item[0].adjudication[3].amount!!.code))
        assertTrue(stringMatch("%.2f".format(135.57f), "%.2f".format(obj.totalCost!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.totalCost!!.system))
        assertTrue(stringMatch("USD", obj.totalCost!!.code))
        assertTrue(stringMatch("%.2f".format(100.47f), "%.2f".format(obj.totalBenefit!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.totalBenefit!!.system))
        assertTrue(stringMatch("USD", obj.totalBenefit!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-paymen", obj.payment!!.type!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.payment!!.type!!.coding[0].code))
        assertTrue(stringMatch("2014-08-31", obj.payment!!.date))
        assertTrue(stringMatch("%.2f".format(100.47f), "%.2f".format(obj.payment!!.amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.payment!!.amount!!.system))
        assertTrue(stringMatch("USD", obj.payment!!.amount!!.code))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.payment!!.identifier!!.system))
        assertTrue(stringMatch("201408-2-1569478", obj.payment!!.identifier!!.value))
    }

    fun `claimresponse-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
