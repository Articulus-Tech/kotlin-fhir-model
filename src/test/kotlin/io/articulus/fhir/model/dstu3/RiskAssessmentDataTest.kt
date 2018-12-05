package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class RiskAssessmentDataTest : DataTests() {
    @Test
    fun `riskassessment-example-population 401 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/riskassessment-example-population.json").readTextAndClose()
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("population", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
    }

    fun `riskassessment-example-population Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `riskassessment-example-cardiac 402 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/riskassessment-example-cardiac.json").readTextAndClose()
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("cardiac", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier!!.use))
        assertTrue(stringMatch("http://example.org", obj.identifier!!.system))
        assertTrue(stringMatch("risk-assessment-cardiac", obj.identifier!!.value))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("Patient/pat2", obj.subject!!.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2014-07-19T16:04:00Z", obj.occurrenceDateTime))
        assertTrue(stringMatch("http://cvdrisk.nhlbi.nih.gov/", obj.performer!!.display))
        assertTrue(stringMatch("Patient/pat2", obj.basis[0].reference))
        assertTrue(stringMatch("DiagnosticReport/lipids", obj.basis[1].reference))
        assertTrue(stringMatch("Observation/blood-pressure", obj.basis[2].reference))
        assertTrue(stringMatch("Heart Attack", obj.prediction[0].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.02f), "%.2f".format(obj.prediction[0].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(39f), "%.2f".format(obj.prediction[0].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[0].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[0].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[0].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(49f), "%.2f".format(obj.prediction[0].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[0].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[0].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[0].whenRange!!.high!!.code))
    }

    fun `riskassessment-example-cardiac Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `riskassessment-example 403 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/riskassessment-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("genetic", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("BRCAPRO", obj.method!!.coding[0].code))
        assertTrue(stringMatch("2006-01-13T23:01:00Z", obj.occurrenceDateTime))
        assertTrue(stringMatch("List/prognosis", obj.basis[0].reference))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[0].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.000168f), "%.2f".format(obj.prediction[0].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(53f), "%.2f".format(obj.prediction[0].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[0].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[0].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[0].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[1].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.000368f), "%.2f".format(obj.prediction[1].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(54f), "%.2f".format(obj.prediction[1].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[1].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[1].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[1].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(57f), "%.2f".format(obj.prediction[1].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[1].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[1].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[1].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[2].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.000594f), "%.2f".format(obj.prediction[2].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(58f), "%.2f".format(obj.prediction[2].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[2].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[2].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[2].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(62f), "%.2f".format(obj.prediction[2].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[2].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[2].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[2].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[3].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.000838f), "%.2f".format(obj.prediction[3].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(63f), "%.2f".format(obj.prediction[3].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[3].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[3].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[3].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(67f), "%.2f".format(obj.prediction[3].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[3].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[3].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[3].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[4].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.001089f), "%.2f".format(obj.prediction[4].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(68f), "%.2f".format(obj.prediction[4].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[4].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[4].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[4].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(72f), "%.2f".format(obj.prediction[4].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[4].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[4].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[4].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[5].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.001327f), "%.2f".format(obj.prediction[5].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(73f), "%.2f".format(obj.prediction[5].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[5].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[5].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[5].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(77f), "%.2f".format(obj.prediction[5].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[5].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[5].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[5].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[6].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.001530f), "%.2f".format(obj.prediction[6].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(78f), "%.2f".format(obj.prediction[6].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[6].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[6].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[6].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(82f), "%.2f".format(obj.prediction[6].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[6].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[6].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[6].whenRange!!.high!!.code))
        assertTrue(stringMatch("Breast Cancer", obj.prediction[7].outcome.text))
        assertTrue(stringMatch("%.2f".format(0.001663f), "%.2f".format(obj.prediction[7].probabilityDecimal)))
        assertTrue(stringMatch("%.2f".format(83f), "%.2f".format(obj.prediction[7].whenRange!!.low!!.value)))
        assertTrue(stringMatch("years", obj.prediction[7].whenRange!!.low!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[7].whenRange!!.low!!.system))
        assertTrue(stringMatch("a", obj.prediction[7].whenRange!!.low!!.code))
        assertTrue(stringMatch("%.2f".format(88f), "%.2f".format(obj.prediction[7].whenRange!!.high!!.value)))
        assertTrue(stringMatch("years", obj.prediction[7].whenRange!!.high!!.unit))
        assertTrue(stringMatch("http://unitsofmeasure.org", obj.prediction[7].whenRange!!.high!!.system))
        assertTrue(stringMatch("a", obj.prediction[7].whenRange!!.high!!.code))
        assertTrue(stringMatch("High degree of certainty", obj.comment))
    }

    fun `riskassessment-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `riskassessment-example-prognosis 404 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/riskassessment-example-prognosis.json").readTextAndClose()
        val obj = mapper.fromJson(json, RiskAssessment::class.java)
        assertTrue(stringMatch("RiskAssessment", obj.resourceType))
        assertTrue(stringMatch("prognosis", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("final", obj.status))
        assertTrue(stringMatch("2010-11-22", obj.occurrenceDateTime))
        assertTrue(stringMatch("Condition/stroke", obj.condition!!.reference))
        assertTrue(stringMatch("Ischemic Stroke", obj.condition!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.prediction[0].outcome.coding[0].system))
        assertTrue(stringMatch("249943000:363698007=72098002,", obj.prediction[0].outcome.coding[0].code))
        assertTrue(stringMatch("permanent weakness of the lef", obj.prediction[0].outcome.text))
        assertTrue(stringMatch("http://hl7.org/fhir/risk-prob", obj.prediction[0].qualitativeRisk!!.coding[0].system))
        assertTrue(stringMatch("moderate", obj.prediction[0].qualitativeRisk!!.coding[0].code))
        assertTrue(stringMatch("moderate likelihood", obj.prediction[0].qualitativeRisk!!.coding[0].display))
    }

    fun `riskassessment-example-prognosis Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
