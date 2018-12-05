package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ProcessRequestDataTest : DataTests() {
    @Test
    fun `processrequest-example-poll-exclusive 182 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-exclusive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1113", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("113", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("Communication", obj.exclude[0]))
    }

    @Test
    fun `processrequest-example-poll-exclusive 183 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-exclusive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("PaymentReconciliation", obj.exclude[1]))
    }

    fun `processrequest-example-poll-exclusive Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-poll-eob 184 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-eob.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1115", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://www.phr.com/patient/12", obj.identifier[0].system))
        assertTrue(stringMatch("115", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("ExplanationOfBenefit", obj.include[0]))
    }

    fun `processrequest-example-poll-eob Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-poll-specific 185 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-specific.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1111", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("111", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("http://ninsurers.org/payorid", obj.target!!.identifier!!.system))
        assertTrue(stringMatch("WI12345", obj.target!!.identifier!!.value))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("http://npid.org/providerid", obj.provider!!.identifier!!.system))
        assertTrue(stringMatch("AF12345", obj.provider!!.identifier!!.value))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://benefitco.com/oralheal", obj.request!!.reference))
    }

    fun `processrequest-example-poll-specific Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-poll-inclusive 186 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-inclusive.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1112", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("112", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("PaymentReconciliation", obj.include[0]))
    }

    fun `processrequest-example-poll-inclusive Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-poll-payrec 187 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-poll-payrec.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1114", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("114", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("PaymentReconciliation", obj.include[0]))
        assertTrue(stringMatch("2014-08-10", obj.period!!.start))
        assertTrue(stringMatch("2014-08-20", obj.period!!.end))
    }

    fun `processrequest-example-poll-payrec Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example 188 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("1110", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("110", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("poll", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
    }

    fun `processrequest-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-reverse 189 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-reverse.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87654", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("76543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("cancel", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.request!!.reference))
        assertEquals(false, if (obj.nullify != null) obj.nullify else false, "Field: obj.nullify")
    }

    fun `processrequest-example-reverse Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-reprocess 190 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-reprocess.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("44654", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("44543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("reprocess", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.request!!.reference))
        assertTrue(stringMatch("ABC12345G", obj.reference))
        assertEquals(1, obj.item[0].sequenceLinkId)
    }

    fun `processrequest-example-reprocess Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `processrequest-example-status 191 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/processrequest-example-status.json").readTextAndClose()
        val obj = mapper.fromJson(json, ProcessRequest::class.java)
        assertTrue(stringMatch("ProcessRequest", obj.resourceType))
        assertTrue(stringMatch("87655", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/proces", obj.identifier[0].system))
        assertTrue(stringMatch("1776543", obj.identifier[0].value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("status", obj.action))
        assertTrue(stringMatch("2014-08-16", obj.created))
        assertTrue(stringMatch("Organization/1", obj.organization!!.reference))
        assertTrue(stringMatch("http://happyvalley.com/claim/", obj.request!!.reference))
        assertTrue(stringMatch("http://BenefitsInc.com/fhir/c", obj.response!!.reference))
    }

    fun `processrequest-example-status Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
