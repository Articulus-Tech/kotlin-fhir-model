package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class LibraryDataTest : DataTests() {
    @Test
    fun `library-predecessor-example 534 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/library-predecessor-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("library-fhir-helpers-predeces", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("FHIRHelpers", obj.identifier[0].value))
        assertTrue(stringMatch("1.6", obj.version))
        assertTrue(stringMatch("FHIR Helpers", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("logic-library", obj.type.coding[0].code))
        assertTrue(stringMatch("2016-11-14", obj.date))
        assertTrue(stringMatch("FHIR Helpers", obj.description))
        assertTrue(stringMatch("FHIR Helpers", obj.topic[0].text))
        assertTrue(stringMatch("depends-on", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("Library/fhir-model-definition", obj.relatedArtifact[0].resource!!.reference))
        assertTrue(stringMatch("successor", obj.relatedArtifact[1].type))
        assertTrue(stringMatch("Library/library-fhir-helpers", obj.relatedArtifact[1].resource!!.reference))
        assertTrue(stringMatch("text/cql", obj.content[0].contentType))
        assertTrue(stringMatch("bGlicmFyeSBGSElSSGVscGVycyB2Z", obj.content[0].data))
        assertTrue(stringMatch("library-fhir-helpers-content.", obj.content[0].url))
        assertTrue(stringMatch("FHIR Helpers", obj.content[0].title))
    }

    fun `library-predecessor-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `library-cms146-example 535 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/library-cms146-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("library-cms146-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("CMS146", obj.identifier[0].value))
        assertTrue(stringMatch("2.0.0", obj.version))
        assertTrue(stringMatch("Appropriate Testing for Child", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("logic-library", obj.type.coding[0].code))
        assertTrue(stringMatch("2015-07-22", obj.date))
        assertTrue(stringMatch("Logic for CMS 146: Appropriat", obj.description))
        assertTrue(stringMatch("depends-on", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("Library/library-quick-model-d", obj.relatedArtifact[0].resource!!.reference))
        assertTrue(stringMatch("Patient", obj.dataRequirement[0].type))
        assertTrue(stringMatch("Condition", obj.dataRequirement[1].type))
        assertTrue(stringMatch("category", obj.dataRequirement[1].codeFilter[0].path))
        assertTrue(stringMatch("diagnosis", obj.dataRequirement[1].codeFilter[0].valueCode[0]))
        assertTrue(stringMatch("clinicalStatus", obj.dataRequirement[1].codeFilter[1].path))
        assertTrue(stringMatch("confirmed", obj.dataRequirement[1].codeFilter[1].valueCode[0]))
        assertTrue(stringMatch("code", obj.dataRequirement[1].codeFilter[2].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[1].codeFilter[2].valueSetString))
        assertTrue(stringMatch("Condition", obj.dataRequirement[2].type))
        assertTrue(stringMatch("category", obj.dataRequirement[2].codeFilter[0].path))
        assertTrue(stringMatch("diagnosis", obj.dataRequirement[2].codeFilter[0].valueCode[0]))
        assertTrue(stringMatch("clinicalStatus", obj.dataRequirement[2].codeFilter[1].path))
        assertTrue(stringMatch("confirmed", obj.dataRequirement[2].codeFilter[1].valueCode[0]))
        assertTrue(stringMatch("code", obj.dataRequirement[2].codeFilter[2].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[2].codeFilter[2].valueSetString))
        assertTrue(stringMatch("Encounter", obj.dataRequirement[3].type))
        assertTrue(stringMatch("status", obj.dataRequirement[3].codeFilter[0].path))
        assertTrue(stringMatch("finished", obj.dataRequirement[3].codeFilter[0].valueCode[0]))
        assertTrue(stringMatch("class", obj.dataRequirement[3].codeFilter[1].path))
        assertTrue(stringMatch("ambulatory", obj.dataRequirement[3].codeFilter[1].valueCode[0]))
        assertTrue(stringMatch("type", obj.dataRequirement[3].codeFilter[2].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[3].codeFilter[2].valueSetString))
        assertTrue(stringMatch("DiagnosticReport", obj.dataRequirement[4].type))
        assertTrue(stringMatch("diagnosis", obj.dataRequirement[4].codeFilter[0].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[4].codeFilter[0].valueSetString))
        assertTrue(stringMatch("Medication", obj.dataRequirement[5].type))
        assertTrue(stringMatch("code", obj.dataRequirement[5].codeFilter[0].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[5].codeFilter[0].valueSetString))
        assertTrue(stringMatch("MedicationRequest", obj.dataRequirement[6].type))
        assertTrue(stringMatch("status", obj.dataRequirement[6].codeFilter[0].path))
        assertTrue(stringMatch("active", obj.dataRequirement[6].codeFilter[0].valueCode[0]))
        assertTrue(stringMatch("medication.code", obj.dataRequirement[6].codeFilter[1].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[6].codeFilter[1].valueSetString))
        assertTrue(stringMatch("MedicationStatement", obj.dataRequirement[7].type))
        assertTrue(stringMatch("status", obj.dataRequirement[7].codeFilter[0].path))
        assertTrue(stringMatch("completed", obj.dataRequirement[7].codeFilter[0].valueCode[0]))
        assertTrue(stringMatch("medication.code", obj.dataRequirement[7].codeFilter[1].path))
        assertTrue(stringMatch("2.16.840.1.113883.3.464.1003.", obj.dataRequirement[7].codeFilter[1].valueSetString))
        assertTrue(stringMatch("text/cql", obj.content[0].contentType))
        assertTrue(stringMatch("library-cms146-example-conten", obj.content[0].url))
    }

    fun `library-cms146-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `library-example 536 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/library-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("ChalmydiaScreening_Common", obj.identifier[0].value))
        assertTrue(stringMatch("2.0.0", obj.version))
        assertTrue(stringMatch("Chlamydia Screening Common Li", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("logic-library", obj.type.coding[0].code))
        assertTrue(stringMatch("2015-07-22", obj.date))
        assertTrue(stringMatch("Common Logic for adherence to", obj.description))
        assertTrue(stringMatch("Chlamydia Screening", obj.topic[0].text))
        assertTrue(stringMatch("depends-on", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("Library/library-quick-model-d", obj.relatedArtifact[0].resource!!.reference))
        assertTrue(stringMatch("Condition", obj.dataRequirement[0].type))
        assertTrue(stringMatch("code", obj.dataRequirement[0].codeFilter[0].path))
        assertTrue(stringMatch("Other Female Reproductive Con", obj.dataRequirement[0].codeFilter[0].valueSetString))
        assertTrue(stringMatch("text/cql", obj.content[0].contentType))
        assertTrue(stringMatch("library-example-content.cql", obj.content[0].url))
    }

    fun `library-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `library-composition-example 537 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/library-composition-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Library::class.java)
        assertTrue(stringMatch("Library", obj.resourceType))
        assertTrue(stringMatch("composition-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://example.org", obj.identifier[0].system))
        assertTrue(stringMatch("Zika Artifacts", obj.identifier[0].value))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("Zika Artifacts", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("asset-collection", obj.type.coding[0].code))
        assertTrue(stringMatch("2017-03-10", obj.date))
        assertTrue(stringMatch("Artifacts required for implem", obj.description))
        assertTrue(stringMatch("Zika Virus Management", obj.topic[0].text))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("ActivityDefinition/administer", obj.relatedArtifact[0].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[1].type))
        assertTrue(stringMatch("ActivityDefinition/order-seru", obj.relatedArtifact[1].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[2].type))
        assertTrue(stringMatch("ActivityDefinition/provide-mo", obj.relatedArtifact[2].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[3].type))
        assertTrue(stringMatch("Library/zika-virus-interventi", obj.relatedArtifact[3].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[4].type))
        assertTrue(stringMatch("PlanDefinition/zika-virus-int", obj.relatedArtifact[4].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[5].type))
        assertTrue(stringMatch("Questionnaire/zika-virus-expo", obj.relatedArtifact[5].resource!!.reference))
        assertTrue(stringMatch("derived-from", obj.relatedArtifact[6].type))
        assertTrue(stringMatch("https://www.cdc.gov/mmwr/volu", obj.relatedArtifact[6].url))
    }

    fun `library-composition-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
