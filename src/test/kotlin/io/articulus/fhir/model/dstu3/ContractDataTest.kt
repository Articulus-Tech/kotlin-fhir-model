package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ContractDataTest : DataTests() {
    @Test
    fun `pcd-example-notOrg 96 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/pcd-example-notOrg.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notOrg", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2015-11-18", obj.issued))
        assertTrue(stringMatch("Patient/f001", obj.subject[0].reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject[0].display))
        assertTrue(stringMatch("Organization/Infoway", obj.authority[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.authority[0].display))
        assertTrue(stringMatch("Location/Infoway", obj.domain[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.domain[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.type!!.coding[0].system))
        assertTrue(stringMatch("57016-8", obj.type!!.coding[0].code))
        assertTrue(stringMatch("http://www.infoway-inforoute.", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("Opt-In", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Default Authorization with ex", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[0].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-from", obj.term[0].type!!.coding[0].code))
        assertTrue(stringMatch("Withhold all data from specif", obj.term[0].type!!.coding[0].display))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.term[0].topic[0].reference))
        assertTrue(stringMatch("Good Health Clinic", obj.term[0].topic[0].display))
        assertTrue(stringMatch("Withhold this order and any r", obj.term[0].text))
        assertTrue(stringMatch("The terms of the consent in f", obj.friendly[0].contentAttachment.title))
        assertTrue(stringMatch("The terms of the consent in l", obj.legal[0].contentAttachment.title))
    }

    fun `pcd-example-notOrg Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `contract-example-42cfr-part2 97 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/contract-example-42cfr-part2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("C-2121", obj.id))
        assertTrue(stringMatch("1", obj.meta!!.versionId))
        assertTrue(stringMatch("2016-07-19T18:18:42.108-04:00", obj.meta!!.lastUpdated))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2031-11-01T21:18:27-04:00", obj.issued))
        assertTrue(stringMatch("Patient/f201", obj.subject[0].reference))
        assertTrue(stringMatch("http://org.mdhhs.fhir.consent", obj.type!!.coding[0].system))
        assertTrue(stringMatch("OPTIN", obj.type!!.coding[0].code))
        assertTrue(stringMatch("Opt-in consent directive", obj.type!!.text))
        assertTrue(stringMatch("http://hl7.org/fhir/consentca", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("MDHHS-5515", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Michigan MDHHS-5515 Consent t", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.securityLabel[0].system))
        assertTrue(stringMatch("R", obj.securityLabel[0].code))
        assertTrue(stringMatch("Restricted", obj.securityLabel[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.securityLabel[1].system))
        assertTrue(stringMatch("ETH", obj.securityLabel[1].code))
        assertTrue(stringMatch("substance abuse information s", obj.securityLabel[1].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.securityLabel[2].system))
        assertTrue(stringMatch("42CFRPart2", obj.securityLabel[2].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.securityLabel[3].system))
        assertTrue(stringMatch("TREAT", obj.securityLabel[3].code))
        assertTrue(stringMatch("treatment", obj.securityLabel[3].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.securityLabel[4].system))
        assertTrue(stringMatch("HPAYMT", obj.securityLabel[4].code))
        assertTrue(stringMatch("healthcare payment", obj.securityLabel[4].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.securityLabel[5].system))
        assertTrue(stringMatch("HOPERAT", obj.securityLabel[5].code))
        assertTrue(stringMatch("healthcare operations", obj.securityLabel[5].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.securityLabel[6].system))
        assertTrue(stringMatch("PERSISTLABEL", obj.securityLabel[6].code))
        assertTrue(stringMatch("persist security label", obj.securityLabel[6].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.securityLabel[7].system))
        assertTrue(stringMatch("PRIVMARK", obj.securityLabel[7].code))
        assertTrue(stringMatch("privacy mark", obj.securityLabel[7].display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.securityLabel[8].system))
        assertTrue(stringMatch("NORDSCLCD", obj.securityLabel[8].code))
        assertTrue(stringMatch("no redisclosure without conse", obj.securityLabel[8].display))
        assertTrue(stringMatch("Organization/f001", obj.agent[0].actor.reference))
        assertTrue(stringMatch("VA Ann Arbor Healthcare Syste", obj.agent[0].actor.display))
        assertTrue(stringMatch("http://org.mdhhs.fhir.consent", obj.agent[0].role[0].coding[0].system))
        assertTrue(stringMatch("IR", obj.agent[0].role[0].coding[0].code))
        assertTrue(stringMatch("Recipient", obj.agent[0].role[0].coding[0].display))
        assertTrue(stringMatch("Recipient of restricted healt", obj.agent[0].role[0].text))
        assertTrue(stringMatch("Organization/2", obj.agent[1].actor.reference))
        assertTrue(stringMatch("Community Mental Health Clini", obj.agent[1].actor.display))
        assertTrue(stringMatch("http://org.mdhhs.fhir.consent", obj.agent[1].role[0].coding[0].system))
        assertTrue(stringMatch("IS", obj.agent[1].role[0].coding[0].code))
        assertTrue(stringMatch("Sender", obj.agent[1].role[0].coding[0].display))
        assertTrue(stringMatch("Sender of restricted health i", obj.agent[1].role[0].text))
        assertTrue(stringMatch("http://org.mdhhs.fhir.consent", obj.signer[0].type.system))
        assertTrue(stringMatch("SELF", obj.signer[0].type.code))
        assertTrue(stringMatch("Patient/f201", obj.signer[0].party.reference))
        assertTrue(stringMatch("Alice Recruit", obj.signer[0].party.display))
        assertTrue(stringMatch("urn:iso-astm:E1762-95:2013", obj.signer[0].signature[0].type[0].system))
        assertTrue(stringMatch("1.2.840.10065.1.12.1.1", obj.signer[0].signature[0].type[0].code))
        assertTrue(stringMatch("2017-02-08T10:57:34+01:00", obj.signer[0].signature[0].when_fhir))
        assertTrue(stringMatch("Patient/f201", obj.signer[0].signature[0].whoReference.reference))
        assertTrue(stringMatch("application/pdf", obj.legal[0].contentAttachment.contentType))
        assertTrue(stringMatch("en-US", obj.legal[0].contentAttachment.language))
        assertTrue(stringMatch("http://org.mihin.ecms/Consent", obj.legal[0].contentAttachment.url))
        assertTrue(stringMatch("MDHHS-5515 Consent To Share Y", obj.legal[0].contentAttachment.title))
    }

    fun `contract-example-42cfr-part2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `pcd-example-notLabs 98 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/pcd-example-notLabs.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notLabs", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2014-08-17", obj.issued))
        assertTrue(stringMatch("Patient/f001", obj.subject[0].reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject[0].display))
        assertTrue(stringMatch("Organization/Infoway", obj.authority[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.authority[0].display))
        assertTrue(stringMatch("Location/Infoway", obj.domain[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.domain[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.type!!.coding[0].system))
        assertTrue(stringMatch("57016-8", obj.type!!.coding[0].code))
        assertTrue(stringMatch("http://www.infoway-inforoute.", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("Opt-In", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Default Authorization with ex", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[0].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-object-type", obj.term[0].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.term[0].subType!!.coding[0].system))
        assertTrue(stringMatch("ProcedureRequest", obj.term[0].subType!!.coding[0].code))
        assertTrue(stringMatch("Withhold orders from any prov", obj.term[0].text))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[1].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-object-type", obj.term[1].type!!.coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.term[1].subType!!.coding[0].system))
        assertTrue(stringMatch("DiagnosticReport", obj.term[1].subType!!.coding[0].code))
        assertTrue(stringMatch("Withhold order results from a", obj.term[1].text))
        assertTrue(stringMatch("The terms of the consent in f", obj.friendly[0].contentAttachment.title))
        assertTrue(stringMatch("The terms of the consent in l", obj.legal[0].contentAttachment.title))
    }

    fun `pcd-example-notLabs Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `pcd-example-notThem 99 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/pcd-example-notThem.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notThem", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2015-11-18", obj.issued))
        assertTrue(stringMatch("Patient/f001", obj.subject[0].reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject[0].display))
        assertTrue(stringMatch("Organization/2", obj.authority[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.authority[0].display))
        assertTrue(stringMatch("Location/ukp", obj.domain[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.domain[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.type!!.coding[0].system))
        assertTrue(stringMatch("57016-8", obj.type!!.coding[0].code))
        assertTrue(stringMatch("http://www.infoway-inforoute.", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("Opt-In", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Default Authorization with ex", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("Patient/f001", obj.agent[0].actor.reference))
        assertTrue(stringMatch("http://www.hl7.org/fhir/contr", obj.signer[0].type.system))
        assertTrue(stringMatch("COVPTY", obj.signer[0].type.code))
        assertTrue(stringMatch("Patient/f001", obj.signer[0].party.reference))
        assertTrue(stringMatch("urn:iso-astm:E1762-95:2013", obj.signer[0].signature[0].type[0].system))
        assertTrue(stringMatch("1.2.840.10065.1.12.1.1", obj.signer[0].signature[0].type[0].code))
        assertTrue(stringMatch("2013-06-08T10:57:34-07:00", obj.signer[0].signature[0].when_fhir))
        assertTrue(stringMatch("Patient/f001", obj.signer[0].signature[0].whoReference.reference))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[0].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-from", obj.term[0].type!!.coding[0].code))
        assertTrue(stringMatch("Withhold all data from specif", obj.term[0].type!!.coding[0].display))
        assertTrue(stringMatch("Practitioner/f204", obj.term[0].topic[0].reference))
        assertTrue(stringMatch("Fictive Nurse", obj.term[0].topic[0].display))
        assertTrue(stringMatch("Withhold this order and any r", obj.term[0].text))
        assertTrue(stringMatch("The terms of the consent in f", obj.friendly[0].contentAttachment.title))
        assertTrue(stringMatch("The terms of the consent in l", obj.legal[0].contentAttachment.title))
    }

    fun `pcd-example-notThem Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `pcd-example-notAuthor 100 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/pcd-example-notAuthor.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notAuthor", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2015-11-18", obj.issued))
        assertTrue(stringMatch("Patient/f001", obj.subject[0].reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject[0].display))
        assertTrue(stringMatch("Organization/Infoway", obj.authority[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.authority[0].display))
        assertTrue(stringMatch("Location/Infoway", obj.domain[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.domain[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.type!!.coding[0].system))
        assertTrue(stringMatch("57016-8", obj.type!!.coding[0].code))
        assertTrue(stringMatch("http://www.infoway-inforoute.", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("Opt-In", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Default Authorization with ex", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[0].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-authored-by", obj.term[0].type!!.coding[0].code))
        assertTrue(stringMatch("Withhold all data authored by", obj.term[0].type!!.coding[0].display))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.term[0].topic[0].reference))
        assertTrue(stringMatch("Good Health Clinic", obj.term[0].topic[0].display))
        assertTrue(stringMatch("Withhold all data authored by", obj.term[0].text))
        assertTrue(stringMatch("The terms of the consent in f", obj.friendly[0].contentAttachment.title))
        assertTrue(stringMatch("The terms of the consent in l", obj.legal[0].contentAttachment.title))
    }

    fun `pcd-example-notAuthor Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `contract-example 101 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/contract-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("C-123", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://happyvalley.com/contra", obj.identifier!!.system))
        assertTrue(stringMatch("12347", obj.identifier!!.value))
    }

    fun `contract-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `pcd-example-notThis 102 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/pcd-example-notThis.json").readTextAndClose()
        val obj = mapper.fromJson(json, Contract::class.java)
        assertTrue(stringMatch("Contract", obj.resourceType))
        assertTrue(stringMatch("pcd-example-notThis", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("2015-11-18", obj.issued))
        assertTrue(stringMatch("Patient/f001", obj.subject[0].reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.subject[0].display))
        assertTrue(stringMatch("Organization/Infoway", obj.authority[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.authority[0].display))
        assertTrue(stringMatch("Location/Infoway", obj.domain[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.domain[0].display))
        assertTrue(stringMatch("http://loinc.org", obj.type!!.coding[0].system))
        assertTrue(stringMatch("57016-8", obj.type!!.coding[0].code))
        assertTrue(stringMatch("http://www.infoway-inforoute.", obj.subType[0].coding[0].system))
        assertTrue(stringMatch("Opt-In", obj.subType[0].coding[0].code))
        assertTrue(stringMatch("Default Authorization with ex", obj.subType[0].coding[0].display))
        assertTrue(stringMatch("http://example.org/fhir/conse", obj.term[0].type!!.coding[0].system))
        assertTrue(stringMatch("withhold-identified-object-an", obj.term[0].type!!.coding[0].code))
        assertTrue(stringMatch("Withhold the identified objec", obj.term[0].type!!.coding[0].display))
        assertTrue(stringMatch("ProcedureRequest/example-lipi", obj.term[0].topic[0].reference))
        assertTrue(stringMatch("Withhold this order and any r", obj.term[0].text))
        assertTrue(stringMatch("The terms of the consent in f", obj.friendly[0].contentAttachment.title))
        assertTrue(stringMatch("The terms of the consent in l", obj.legal[0].contentAttachment.title))
    }

    fun `pcd-example-notThis Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
