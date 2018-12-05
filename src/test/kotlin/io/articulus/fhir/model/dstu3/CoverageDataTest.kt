package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class CoverageDataTest : DataTests() {
    @Test
    fun `coverage-example-2 384 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coverage-example-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("7546D", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://xyz.com/codes/identifi", obj.identifier[0].system))
        assertTrue(stringMatch("AB98761", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.type!!.coding[0].system))
        assertTrue(stringMatch("EHCPOL", obj.type!!.coding[0].code))
        assertTrue(stringMatch("extended healthcare", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/5", obj.subscriber!!.reference))
        assertTrue(stringMatch("AB9876", obj.subscriberId))
        assertTrue(stringMatch("Patient/5", obj.beneficiary!!.reference))
        assertTrue(stringMatch("self", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("2011-03-17", obj.period!!.start))
        assertTrue(stringMatch("2012-03-17", obj.period!!.end))
        assertTrue(stringMatch("Organization/2", obj.payor[0].reference))
        assertTrue(stringMatch("WESTAIR", obj.grouping!!.group))
        assertTrue(stringMatch("Western Airlines", obj.grouping!!.groupDisplay))
        assertTrue(stringMatch("WESTAIR", obj.grouping!!.plan))
        assertTrue(stringMatch("Western Airlines", obj.grouping!!.planDisplay))
        assertTrue(stringMatch("D15C9", obj.grouping!!.subPlan))
        assertTrue(stringMatch("Platinum", obj.grouping!!.subPlanDisplay))
        assertTrue(stringMatch("1", obj.dependent))
        assertEquals(2, obj.order)
        assertTrue(stringMatch("5", obj.network))
        assertTrue(stringMatch("Contract/563818", obj.contract[0].reference))
    }

    fun `coverage-example-2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `coverage-example-selfpay 385 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coverage-example-selfpay.json").readTextAndClose()
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("SP1234", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hospitalx.com/selfpaya", obj.identifier[0].system))
        assertTrue(stringMatch("SP12345678", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/coverage-", obj.type!!.coding[0].system))
        assertTrue(stringMatch("pay", obj.type!!.coding[0].code))
        assertTrue(stringMatch("PAY", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/5", obj.subscriber!!.reference))
        assertTrue(stringMatch("Patient/5", obj.beneficiary!!.reference))
        assertTrue(stringMatch("self", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("2012-03-17", obj.period!!.end))
        assertTrue(stringMatch("Patient/5", obj.payor[0].reference))
    }

    fun `coverage-example-selfpay Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `coverage-example-ehic 386 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coverage-example-ehic.json").readTextAndClose()
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("7547E", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://ehic.com/insurer/12345", obj.identifier[0].system))
        assertTrue(stringMatch("A123456780", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.type!!.coding[0].system))
        assertTrue(stringMatch("EHCPOL", obj.type!!.coding[0].code))
        assertTrue(stringMatch("extended healthcare", obj.type!!.coding[0].display))
        assertTrue(stringMatch("Patient/5", obj.subscriber!!.reference))
        assertTrue(stringMatch("Patient/5", obj.beneficiary!!.reference))
        assertTrue(stringMatch("self", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("2012-03-17", obj.period!!.end))
        assertTrue(stringMatch("http://ehic.com/insurer", obj.payor[0].identifier!!.system))
        assertTrue(stringMatch("123456789", obj.payor[0].identifier!!.value))
    }

    fun `coverage-example-ehic Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `coverage-example 387 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coverage-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Coverage::class.java)
        assertTrue(stringMatch("Coverage", obj.resourceType))
        assertTrue(stringMatch("9876B1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://benefitsinc.com/certif", obj.identifier[0].system))
        assertTrue(stringMatch("12345", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.type!!.coding[0].system))
        assertTrue(stringMatch("EHCPOL", obj.type!!.coding[0].code))
        assertTrue(stringMatch("extended healthcare", obj.type!!.coding[0].display))
        assertTrue(stringMatch("http://benefitsinc.com/FHIR/O", obj.policyHolder!!.reference))
        assertTrue(stringMatch("Patient/4", obj.subscriber!!.reference))
        assertTrue(stringMatch("Patient/4", obj.beneficiary!!.reference))
        assertTrue(stringMatch("self", obj.relationship!!.coding[0].code))
        assertTrue(stringMatch("2011-05-23", obj.period!!.start))
        assertTrue(stringMatch("2012-05-23", obj.period!!.end))
        assertTrue(stringMatch("Organization/2", obj.payor[0].reference))
        assertTrue(stringMatch("CBI35", obj.grouping!!.group))
        assertTrue(stringMatch("Corporate Baker's Inc. Local ", obj.grouping!!.groupDisplay))
        assertTrue(stringMatch("123", obj.grouping!!.subGroup))
        assertTrue(stringMatch("Trainee Part-time Benefits", obj.grouping!!.subGroupDisplay))
        assertTrue(stringMatch("B37FC", obj.grouping!!.plan))
        assertTrue(stringMatch("Full Coverage: Medical, Denta", obj.grouping!!.planDisplay))
        assertTrue(stringMatch("P7", obj.grouping!!.subPlan))
        assertTrue(stringMatch("Includes afterlife benefits", obj.grouping!!.subPlanDisplay))
        assertTrue(stringMatch("SILVER", obj.grouping!!.class_fhir))
        assertTrue(stringMatch("Silver: Family Plan spouse on", obj.grouping!!.classDisplay))
        assertTrue(stringMatch("Tier2", obj.grouping!!.subClass))
        assertTrue(stringMatch("Low deductable, max ${'$'}20 copay", obj.grouping!!.subClassDisplay))
        assertTrue(stringMatch("0", obj.dependent))
        assertTrue(stringMatch("9", obj.sequence))
    }

    fun `coverage-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
