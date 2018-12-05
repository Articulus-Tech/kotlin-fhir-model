package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ConsentDataTest : DataTests() {
    @Test
    fun `consent-example-notThis 120 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-notThis.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notThis", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("deny", obj.except[0].type))
        assertTrue(stringMatch("related", obj.except[0].data[0].meaning))
        assertTrue(stringMatch("Task/f201", obj.except[0].data[0].reference.reference))
    }

    fun `consent-example-notThis Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-smartonfhir 121 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-smartonfhir.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-smartonfhir", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/xcda", obj.patient.reference))
        assertTrue(stringMatch("2016-06-23T17:02:33+10:00", obj.period!!.start))
        assertTrue(stringMatch("2016-06-23T17:32:33+10:00", obj.period!!.end))
        assertTrue(stringMatch("2016-06-23T17:02:33+10:00", obj.dateTime))
        assertTrue(stringMatch("RelatedPerson/peter", obj.consentingParty[0].reference))
        assertTrue(stringMatch("Organization/example", obj.organization[0].reference))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("permit", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[0].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/resource-", obj.except[0].class_fhir[0].system))
        assertTrue(stringMatch("MedicationRequest", obj.except[0].class_fhir[0].code))
    }

    fun `consent-example-smartonfhir Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-notAuthor 122 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-notAuthor.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notAuthor", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("deny", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("CST", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.except[0].actor[0].reference.display))
    }

    fun `consent-example-notAuthor Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-notTime 123 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-notTime.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notTime", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("deny", obj.except[0].type))
        assertTrue(stringMatch("2015-01-01", obj.except[0].period!!.start))
        assertTrue(stringMatch("2015-02-01", obj.except[0].period!!.end))
    }

    fun `consent-example-notTime Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-signature 124 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-signature.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-signature", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:2.16.840.1.113883.3.7", obj.identifier!!.system))
        assertTrue(stringMatch("494e0c7a-a69e-4fb4-9d02-6aae7", obj.identifier!!.value))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("http://hl7.org/fhir/consentca", obj.category[0].coding[0].system))
        assertTrue(stringMatch("HIPAA-Auth", obj.category[0].coding[0].code))
        assertTrue(stringMatch("Patient/72", obj.patient.reference))
        assertTrue(stringMatch("2015-10-10", obj.period!!.start))
        assertTrue(stringMatch("2016-10-10", obj.period!!.end))
        assertTrue(stringMatch("2016-05-26T00:41:10-04:00", obj.dateTime))
        assertTrue(stringMatch("Patient/72", obj.consentingParty[0].reference))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.actor[0].role.coding[0].code))
        assertTrue(stringMatch("Practitioner/13", obj.actor[0].reference.reference))
        assertTrue(stringMatch("Organization/example", obj.organization[0].reference))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("permit", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("AUT", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Practitioner/xcda-author", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("urn:ietf:bcp:13", obj.except[0].class_fhir[0].system))
        assertTrue(stringMatch("application/hl7-cda+xml", obj.except[0].class_fhir[0].code))
        assertTrue(stringMatch("http://loinc.org", obj.except[0].code[0].system))
        assertTrue(stringMatch("34133-9", obj.except[0].code[0].code))
        assertTrue(stringMatch("http://loinc.org", obj.except[0].code[1].system))
        assertTrue(stringMatch("18842-5", obj.except[0].code[1].code))
    }

    fun `consent-example-signature Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-notThem 125 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-notThem.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notThem", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("deny", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Practitioner/f204", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Fictive Nurse", obj.except[0].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[0].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[1].coding[0].system))
        assertTrue(stringMatch("correct", obj.except[0].action[1].coding[0].code))
    }

    fun `consent-example-notThem Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-grantor 126 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-grantor.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-grantor", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("permit", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("CST", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Psychiatric Hospi", obj.except[0].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[1].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[0].actor[1].role.coding[0].code))
        assertTrue(stringMatch("Patient/example", obj.except[0].actor[1].reference.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.except[0].actor[1].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[0].action[0].coding[0].code))
    }

    fun `consent-example-grantor Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-notOrg 127 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-notOrg.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-notOrg", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("deny", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Clinic", obj.except[0].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[0].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[1].coding[0].system))
        assertTrue(stringMatch("correct", obj.except[0].action[1].coding[0].code))
    }

    fun `consent-example-notOrg Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-pkb 128 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-pkb.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-pkb", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/example", obj.patient.reference))
        assertTrue(stringMatch("...example patient...", obj.patient.display))
        assertTrue(stringMatch("2016-06-16", obj.dateTime))
        assertTrue(stringMatch("Organization/pkb", obj.organization[0].reference))
        assertTrue(stringMatch("Patients Know Best", obj.organization[0].display))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("permit", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-nmt", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Non-migrated Team - Imperial ", obj.except[0].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[0].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[0].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.except[0].securityLabel[0].system))
        assertTrue(stringMatch("N", obj.except[0].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[1].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[1].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-nmt", obj.except[1].actor[0].reference.reference))
        assertTrue(stringMatch("Non-migrated Team - Imperial ", obj.except[1].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[1].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[1].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[1].securityLabel[0].system))
        assertTrue(stringMatch("PSY", obj.except[1].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[2].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[2].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[2].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-nmt", obj.except[2].actor[0].reference.reference))
        assertTrue(stringMatch("Non-migrated Team - Imperial ", obj.except[2].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[2].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[2].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[2].securityLabel[0].system))
        assertTrue(stringMatch("SOC", obj.except[2].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[3].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[3].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[3].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-core", obj.except[3].actor[0].reference.reference))
        assertTrue(stringMatch("Core Information Exchange tea", obj.except[3].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[3].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[3].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.except[3].securityLabel[0].system))
        assertTrue(stringMatch("N", obj.except[3].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[4].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[4].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[4].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-core", obj.except[4].actor[0].reference.reference))
        assertTrue(stringMatch("Core Information Exchange tea", obj.except[4].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[4].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[4].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[4].securityLabel[0].system))
        assertTrue(stringMatch("PSY", obj.except[4].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[5].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[5].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[5].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-core", obj.except[5].actor[0].reference.reference))
        assertTrue(stringMatch("Core Information Exchange tea", obj.except[5].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[5].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[5].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[5].securityLabel[0].system))
        assertTrue(stringMatch("SOC", obj.except[5].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[6].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[6].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[6].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-core", obj.except[6].actor[0].reference.reference))
        assertTrue(stringMatch("Core Information Exchange tea", obj.except[6].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[6].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[6].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[6].securityLabel[0].system))
        assertTrue(stringMatch("SEX", obj.except[6].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[7].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[7].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[7].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/tsd-park", obj.except[7].actor[0].reference.reference))
        assertTrue(stringMatch("Torbay and Source Devon Trust", obj.except[7].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[7].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[7].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.except[7].securityLabel[0].system))
        assertTrue(stringMatch("N", obj.except[7].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[8].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[8].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[8].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/tsd-park", obj.except[8].actor[0].reference.reference))
        assertTrue(stringMatch("Torbay and Source Devon Trust", obj.except[8].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[8].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[8].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[8].securityLabel[0].system))
        assertTrue(stringMatch("PSY", obj.except[8].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[9].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[9].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[9].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/tsd-park", obj.except[9].actor[0].reference.reference))
        assertTrue(stringMatch("Torbay and Source Devon Trust", obj.except[9].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[9].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[9].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[9].securityLabel[0].system))
        assertTrue(stringMatch("SOC", obj.except[9].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[10].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[10].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[10].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/tsd-park", obj.except[10].actor[0].reference.reference))
        assertTrue(stringMatch("Torbay and Source Devon Trust", obj.except[10].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[10].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[10].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.except[10].securityLabel[0].system))
        assertTrue(stringMatch("SEX", obj.except[10].securityLabel[0].code))
        assertTrue(stringMatch("permit", obj.except[11].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[11].actor[0].role.coding[0].system))
        assertTrue(stringMatch("PRCP", obj.except[11].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/ich-non", obj.except[11].actor[0].reference.reference))
        assertTrue(stringMatch("Imperial Collage Healthcare -", obj.except[11].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/consentac", obj.except[11].action[0].coding[0].system))
        assertTrue(stringMatch("access", obj.except[11].action[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Confid", obj.except[11].securityLabel[0].system))
        assertTrue(stringMatch("N", obj.except[11].securityLabel[0].code))
    }

    fun `consent-example-pkb Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example 129 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-basic", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("1964-01-01", obj.period!!.start))
        assertTrue(stringMatch("2016-01-01", obj.period!!.end))
        assertTrue(stringMatch("2016-05-11", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://goodhealth.org/consent", obj.policyRule))
    }

    fun `consent-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-Emergency 130 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-Emergency.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-Emergency", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
    }

    @Test
    fun `consent-example-Emergency 131 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-Emergency.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
        assertTrue(stringMatch("permit", obj.except[0].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[0].actor[0].role.coding[0].system))
        assertTrue(stringMatch("CST", obj.except[0].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.except[0].actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Psychiatric Hospi", obj.except[0].actor[0].reference.display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActRea", obj.except[0].purpose[0].system))
        assertTrue(stringMatch("ETREAT", obj.except[0].purpose[0].code))
        assertTrue(stringMatch("deny", obj.except[1].type))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.except[1].actor[0].role.coding[0].system))
        assertTrue(stringMatch("CST", obj.except[1].actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.except[1].actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Psychiatric Hospi", obj.except[1].actor[0].reference.display))
    }

    fun `consent-example-Emergency Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `consent-example-Out 132 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/consent-example-Out.json").readTextAndClose()
        val obj = mapper.fromJson(json, Consent::class.java)
        assertTrue(stringMatch("Consent", obj.resourceType))
        assertTrue(stringMatch("consent-example-Out", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("Patient/f001", obj.patient.reference))
        assertTrue(stringMatch("P. van de Heuvel", obj.patient.display))
        assertTrue(stringMatch("2015-11-18", obj.dateTime))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/Partic", obj.actor[0].role.coding[0].system))
        assertTrue(stringMatch("CST", obj.actor[0].role.coding[0].code))
        assertTrue(stringMatch("Organization/2.16.840.1.11388", obj.actor[0].reference.reference))
        assertTrue(stringMatch("Good Health Psychiatric Hospi", obj.actor[0].reference.display))
        assertTrue(stringMatch("Organization/Infoway", obj.organization[0].reference))
        assertTrue(stringMatch("Canada Infoway", obj.organization[0].display))
        assertTrue(stringMatch("The terms of the consent in l", obj.sourceAttachment!!.title))
        assertTrue(stringMatch("http://hl7.org/fhir/ConsentPo", obj.policyRule))
    }

    fun `consent-example-Out Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
