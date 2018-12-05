package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class OperationDefinitionDataTest : DataTests() {
    @Test
    fun `operationdefinition-example 575 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/operationdefinition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, OperationDefinition::class.java)
        assertTrue(stringMatch("OperationDefinition", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://h7.org/fhir/OperationD", obj.url))
        assertTrue(stringMatch("B", obj.version))
        assertTrue(stringMatch("Populate Questionnaire", obj.name))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("operation", obj.kind))
        assertTrue(stringMatch("2015-08-04", obj.date))
        assertTrue(stringMatch("Acme Healthcare Services", obj.publisher))
        assertTrue(stringMatch("System Administrator", obj.contact[0].name))
        assertTrue(stringMatch("email", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("beep@coyote.acme.com", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Limited implementation of the", obj.description))
        assertTrue(stringMatch("http://build.fhir.org/codesys", obj.useContext[0].code.system))
        assertTrue(stringMatch("venue", obj.useContext[0].code.code))
        assertTrue(stringMatch("Clinical Venue", obj.useContext[0].code.display))
        assertTrue(stringMatch("http://hl7.org/fhir/v3/ActCod", obj.useContext[0].valueCodeableConcept.coding[0].system))
        assertTrue(stringMatch("IMP", obj.useContext[0].valueCodeableConcept.coding[0].code))
        assertTrue(stringMatch("inpatient encounter", obj.useContext[0].valueCodeableConcept.coding[0].display))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("GB", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("United Kingdom of Great Brita", obj.jurisdiction[0].coding[0].display))
        assertTrue(stringMatch("populate", obj.code))
        assertTrue(stringMatch("Only implemented for Labs and", obj.comment))
        assertTrue(stringMatch("OperationDefinition/Questionn", obj.base!!.reference))
        assertTrue(stringMatch("Questionnaire", obj.resource[0]))
        assertEquals(false, if (obj.system != null) obj.system else false, "Field: obj.system")
        assertEquals(false, if (obj.type != null) obj.type else false, "Field: obj.type")
        assertEquals(true, if (obj.instance != null) obj.instance else false, "Field: obj.instance")
        assertTrue(stringMatch("subject", obj.parameter[0].name))
        assertTrue(stringMatch("in", obj.parameter[0].use))
        assertEquals(1, obj.parameter[0].min)
        assertTrue(stringMatch("1", obj.parameter[0].max))
        assertTrue(stringMatch("The resource that is to be th", obj.parameter[0].documentation))
        assertTrue(stringMatch("Reference", obj.parameter[0].type))
        assertTrue(stringMatch("local", obj.parameter[1].name))
        assertTrue(stringMatch("in", obj.parameter[1].use))
        assertEquals(0, obj.parameter[1].min)
        assertTrue(stringMatch("1", obj.parameter[1].max))
        assertTrue(stringMatch("If the *local* parameter is s", obj.parameter[1].documentation))
        assertTrue(stringMatch("Reference", obj.parameter[1].type))
        assertTrue(stringMatch("return", obj.parameter[2].name))
        assertTrue(stringMatch("out", obj.parameter[2].use))
        assertEquals(1, obj.parameter[2].min)
        assertTrue(stringMatch("1", obj.parameter[2].max))
        assertTrue(stringMatch("The partially (or fully)-popu", obj.parameter[2].documentation))
        assertTrue(stringMatch("QuestionnaireResponse", obj.parameter[2].type))
        assertTrue(stringMatch("subject", obj.overload[0].parameterName[0]))
        assertTrue(stringMatch("local", obj.overload[0].parameterName[1]))
        assertTrue(stringMatch("subject", obj.overload[1].parameterName[0]))
        assertTrue(stringMatch("local defaults to false when ", obj.overload[1].comment))
    }

    fun `operationdefinition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
