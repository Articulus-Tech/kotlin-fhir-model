package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class PaymentReconciliationDataTest : DataTests() {
    @Test
    fun `paymentreconciliation-example 560 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/paymentreconciliation-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, PaymentReconciliation::class.java)
        assertTrue(stringMatch("PaymentReconciliation", obj.resourceType))
        assertTrue(stringMatch("ER2500", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.identifier[0].system))
        assertTrue(stringMatch("781234", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-08-16", obj.period!!.start))
        assertTrue(stringMatch("2014-08-31", obj.period!!.end))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/2", obj.organization!!.reference))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.request!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/remittanc", obj.outcome!!.coding[0].system))
        assertTrue(stringMatch("complete", obj.outcome!!.coding[0].code))
        assertTrue(stringMatch("2014 August mid-month settlem", obj.disposition))
        assertTrue(stringMatch("Practitioner/example", obj.requestProvider!!.reference))
        assertTrue(stringMatch("Organization/1", obj.requestOrganization!!.reference))
        assertTrue(stringMatch("http://hl7.org/fhir/payment-t", obj.detail[0].type.coding[0].system))
        assertTrue(stringMatch("payment", obj.detail[0].type.coding[0].code))
        assertTrue(stringMatch("http://happyvalleyclinic.com/", obj.detail[0].request!!.identifier!!.system))
        assertTrue(stringMatch("AB12345", obj.detail[0].request!!.identifier!!.value))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.detail[0].response!!.identifier!!.system))
        assertTrue(stringMatch("CR20140815-AB12345", obj.detail[0].response!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.detail[0].submitter!!.reference))
        assertTrue(stringMatch("Organization/1", obj.detail[0].payee!!.reference))
        assertTrue(stringMatch("2014-08-16", obj.detail[0].date))
        assertTrue(stringMatch("%.2f".format(1000.00f), "%.2f".format(obj.detail[0].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.detail[0].amount!!.system))
        assertTrue(stringMatch("USD", obj.detail[0].amount!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/payment-t", obj.detail[1].type.coding[0].system))
        assertTrue(stringMatch("payment", obj.detail[1].type.coding[0].code))
        assertTrue(stringMatch("http://www.BenefitsInc.com/fh", obj.detail[1].request!!.reference))
        assertTrue(stringMatch("2014-08-12", obj.detail[1].date))
        assertTrue(stringMatch("%.2f".format(4000.00f), "%.2f".format(obj.detail[1].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.detail[1].amount!!.system))
        assertTrue(stringMatch("USD", obj.detail[1].amount!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/payment-t", obj.detail[2].type.coding[0].system))
        assertTrue(stringMatch("advance", obj.detail[2].type.coding[0].code))
        assertTrue(stringMatch("2014-08-16", obj.detail[2].date))
        assertTrue(stringMatch("%.2f".format(-1500.00f), "%.2f".format(obj.detail[2].amount!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.detail[2].amount!!.system))
        assertTrue(stringMatch("USD", obj.detail[2].amount!!.code))
        assertTrue(stringMatch("http://ncforms.org/formid", obj.form!!.coding[0].system))
        assertTrue(stringMatch("PAYREC/2016/01B", obj.form!!.coding[0].code))
        assertTrue(stringMatch("%.2f".format(3500.00f), "%.2f".format(obj.total!!.value)))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.total!!.system))
        assertTrue(stringMatch("USD", obj.total!!.code))
        assertTrue(stringMatch("http://hl7.org/fhir/note-type", obj.processNote[0].type!!.coding[0].system))
        assertTrue(stringMatch("display", obj.processNote[0].type!!.coding[0].code))
        assertTrue(stringMatch("Due to the year end holiday t", obj.processNote[0].text))
    }

    fun `paymentreconciliation-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
