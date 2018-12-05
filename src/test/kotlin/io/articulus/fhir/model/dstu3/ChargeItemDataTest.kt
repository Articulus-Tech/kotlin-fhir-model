package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ChargeItemDataTest : DataTests() {
    @Test
    fun `chargeitem-example 566 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/chargeitem-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ChargeItem::class.java)
        assertTrue(stringMatch("ChargeItem", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://myHospital.org/ChargeI", obj.identifier!!.system))
        assertTrue(stringMatch("654321", obj.identifier!!.value))
        assertTrue(stringMatch("http://www.kbv.de/tools/ebm/h", obj.definition[0]))
        assertTrue(stringMatch("billable", obj.status))
        assertTrue(stringMatch("01510", obj.code.coding[0].code))
        assertTrue(stringMatch("Zusatzpauschale für Beobachtu", obj.code.coding[0].display))
        assertTrue(stringMatch("Patient/example", obj.subject.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2017-01-25T08:00:00+01:00", obj.occurrencePeriod!!.start))
        assertTrue(stringMatch("2017-01-25T12:35:00+01:00", obj.occurrencePeriod!!.end))
        assertTrue(stringMatch("http://snomed.info/sct", obj.participant[0].role!!.coding[0].system))
        assertTrue(stringMatch("17561000", obj.participant[0].role!!.coding[0].code))
        assertTrue(stringMatch("Cardiologist", obj.participant[0].role!!.coding[0].display))
        assertTrue(stringMatch("Practitioner/example", obj.participant[0].actor.reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.participant[1].role!!.coding[0].system))
        assertTrue(stringMatch("224542009", obj.participant[1].role!!.coding[0].code))
        assertTrue(stringMatch("Coronary Care Nurse", obj.participant[1].role!!.coding[0].display))
        assertTrue(stringMatch("Practitioner/example", obj.participant[1].actor.reference))
        assertTrue(stringMatch("http://myhospital/NamingSyste", obj.performingOrganization!!.identifier!!.system))
        assertTrue(stringMatch("CARD_INTERMEDIATE_CARE", obj.performingOrganization!!.identifier!!.value))
        assertTrue(stringMatch("http://myhospital/NamingSyste", obj.requestingOrganization!!.identifier!!.system))
        assertTrue(stringMatch("CARD_U1", obj.requestingOrganization!!.identifier!!.value))
        assertTrue(stringMatch("%.2f".format(1f), "%.2f".format(obj.quantity!!.value)))
        assertTrue(stringMatch("%.2f".format(0.8f), "%.2f".format(obj.factorOverride)))
        assertTrue(stringMatch("%.2f".format(40f), "%.2f".format(obj.priceOverride!!.value)))
        assertTrue(stringMatch("EUR", obj.priceOverride!!.unit))
        assertTrue(stringMatch("urn:iso:std:iso:4217", obj.priceOverride!!.system))
        assertTrue(stringMatch("EUR", obj.priceOverride!!.code))
        assertTrue(stringMatch("Patient is Cardiologist's gol", obj.overrideReason))
        assertTrue(stringMatch("Practitioner/example", obj.enterer!!.reference))
        assertTrue(stringMatch("2017-01-25T23:55:04+01:00", obj.enteredDate))
        assertTrue(stringMatch("http://hl7.org/fhir/sid/icd-1", obj.reason[0].coding[0].system))
        assertTrue(stringMatch("123456", obj.reason[0].coding[0].code))
        assertTrue(stringMatch("DIAG-1", obj.reason[0].coding[0].display))
        assertTrue(stringMatch("Procedure/example", obj.service[0].reference))
        assertTrue(stringMatch("Account/example", obj.account[0].reference))
        assertTrue(stringMatch("Practitioner/example", obj.note[0].authorReference!!.reference))
        assertTrue(stringMatch("2017-01-25T23:55:04+01:00", obj.note[0].time))
        assertTrue(stringMatch("The code is only applicable f", obj.note[0].text))
    }

    fun `chargeitem-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
