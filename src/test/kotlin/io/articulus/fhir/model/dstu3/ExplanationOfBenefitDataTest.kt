package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ExplanationOfBenefitDataTest : DataTests() {
    @Test
    fun `explanationofbenefit-example 506 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/explanationofbenefit-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ExplanationOfBenefit::class.java)
        assertTrue(stringMatch("ExplanationOfBenefit", obj.resourceType))
        assertTrue(stringMatch("EB3500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("987654321", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/ex-claimt", obj.type!!.coding[0].system))
        assertTrue(stringMatch("oral", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Patient/pat1", obj.patient!!.reference))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Practitioner/1", obj.enterer!!.reference))
        assertTrue(stringMatch("Practitioner/1", obj.provider!!.reference))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
        assertTrue(stringMatch("Location/1", obj.facility!!.reference))
        assertTrue(stringMatch("Claim/100150", obj.claim!!.reference))
        assertTrue(stringMatch("ClaimResponse/R3500", obj.claimResponse!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("Claim settled as per contract", obj.disposition))
        assertTrue(stringMatch("http://hl7.org/fhir/payeetype", obj.payee!!.type!!.coding[0].system))
        assertTrue(stringMatch("provider", obj.payee!!.type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.payee!!.resourceType!!.coding[0].system))
        assertTrue(stringMatch("organization", obj.payee!!.resourceType!!.coding[0].code))
        assertTrue(stringMatch("Organization/2", obj.payee!!.party!!.reference))
        assertEquals(1, obj.careTeam[0].sequence)
        assertTrue(stringMatch("Practitioner/example", obj.careTeam[0].provider.reference))
        assertTrue(stringMatch("Coverage/9876B1", obj.insurance!!.coverage!!.reference))
        assertEquals(1, obj.item[0].sequence)
        assertEquals(1, obj.item[0].careTeamLinkId[0])
        assertTrue(stringMatch("http://hl7.org/fhir/service-u", obj.item[0].service!!.coding[0].system))
        assertTrue(stringMatch("1200", obj.item[0].service!!.coding[0].code))
        assertTrue(stringMatch("2014-08-16", obj.item[0].servicedDate))
        assertTrue(stringMatch("%.2f".format(135.57f), "%.2f".format(obj.item[0].unitPrice!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].unitPrice!!.system))
        assertTrue(stringMatch("USD", obj.item[0].unitPrice!!.code))
        assertTrue(stringMatch("%.2f".format(135.57f), "%.2f".format(obj.item[0].net!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].net!!.system))
        assertTrue(stringMatch("USD", obj.item[0].net!!.code))
        assertTrue(stringMatch("Encounter/example", obj.item[0].encounter[0].reference))
        assertTrue(stringMatch("eligible", obj.item[0].adjudication[0].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(120.00f), "%.2f".format(obj.item[0].adjudication[0].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].adjudication[0].amount!!.system))
        assertTrue(stringMatch("USD", obj.item[0].adjudication[0].amount!!.code))
        assertTrue(stringMatch("eligpercent", obj.item[0].adjudication[1].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(0.80f), "%.2f".format(obj.item[0].adjudication[1].value)))
        assertTrue(stringMatch("benefit", obj.item[0].adjudication[2].category.coding[0].code))
        assertTrue(stringMatch("%.2f".format(96.00f), "%.2f".format(obj.item[0].adjudication[2].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.item[0].adjudication[2].amount!!.system))
        assertTrue(stringMatch("USD", obj.item[0].adjudication[2].amount!!.code))
        assertTrue(stringMatch("%.2f".format(135.57f), "%.2f".format(obj.totalCost!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.totalCost!!.system))
        assertTrue(stringMatch("USD", obj.totalCost!!.code))
        assertTrue(stringMatch("%.2f".format(96.00f), "%.2f".format(obj.totalBenefit!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.totalBenefit!!.system))
        assertTrue(stringMatch("USD", obj.totalBenefit!!.code))
    }

    fun `explanationofbenefit-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
