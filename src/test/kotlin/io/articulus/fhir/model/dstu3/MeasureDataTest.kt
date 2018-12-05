package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class MeasureDataTest : DataTests() {
    @Test
    fun `measure-component-b-example 482 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/measure-component-b-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("component-b-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Screening for Depression", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("proportion", obj.scoring!!.coding[0].code))
        assertTrue(stringMatch("Main", obj.group[0].identifier.value))
        assertTrue(stringMatch("initial-population", obj.group[0].population[0].code!!.coding[0].code))
        assertTrue(stringMatch("Initial Population", obj.group[0].population[0].criteria))
        assertTrue(stringMatch("denominator", obj.group[0].population[1].code!!.coding[0].code))
        assertTrue(stringMatch("Denominator", obj.group[0].population[1].criteria))
        assertTrue(stringMatch("numerator", obj.group[0].population[2].code!!.coding[0].code))
        assertTrue(stringMatch("Numerator", obj.group[0].population[2].criteria))
    }

    fun `measure-component-b-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `measure-predecessor-example 483 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/measure-predecessor-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("measure-predecessor-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("exclusive-breastfeeding-measu", obj.identifier[0].value))
        assertTrue(stringMatch("3.0.1", obj.version))
        assertTrue(stringMatch("Exclusive Breastfeeding Measu", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertTrue(stringMatch("2014-03-08", obj.date))
        assertTrue(stringMatch("Exclusive breastfeeding measu", obj.description))
        assertTrue(stringMatch("Measure of newborns who were ", obj.purpose))
        assertTrue(stringMatch("Exclusive Breastfeeding", obj.topic[0].text))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("American Academy of Pediatric", obj.relatedArtifact[0].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[1].type))
        assertTrue(stringMatch("American College of Obstetric", obj.relatedArtifact[1].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[2].type))
        assertTrue(stringMatch("California Department of Publ", obj.relatedArtifact[2].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[3].type))
        assertTrue(stringMatch("Centers for Disease Control a", obj.relatedArtifact[3].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[4].type))
        assertTrue(stringMatch("Centers for Disease Control a", obj.relatedArtifact[4].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[5].type))
        assertTrue(stringMatch("Ip, S., Chung, M., Raman, G.,", obj.relatedArtifact[5].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[6].type))
        assertTrue(stringMatch("Kramer, M.S. & Kakuma, R. (20", obj.relatedArtifact[6].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[7].type))
        assertTrue(stringMatch("Petrova, A., Hegyi, T., & Meh", obj.relatedArtifact[7].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[8].type))
        assertTrue(stringMatch("Shealy, K.R., Li, R., Benton-", obj.relatedArtifact[8].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[9].type))
        assertTrue(stringMatch("Taveras, E.M., Li, R., Grumme", obj.relatedArtifact[9].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[10].type))
        assertTrue(stringMatch("US Department of Health and H", obj.relatedArtifact[10].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[11].type))
        assertTrue(stringMatch("World Health Organization. (1", obj.relatedArtifact[11].citation))
        assertTrue(stringMatch("successor", obj.relatedArtifact[12].type))
        assertTrue(stringMatch("Measure/measure-exclusive-bre", obj.relatedArtifact[12].resource!!.reference))
        assertTrue(stringMatch("Library/library-exclusive-bre", obj.library[0].reference))
        assertTrue(stringMatch("These performance measures ar", obj.disclaimer))
        assertTrue(stringMatch("proportion", obj.scoring!!.coding[0].code))
        assertTrue(stringMatch("process", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Exclusive breast milk feeding", obj.rationale))
        assertTrue(stringMatch("Exclusive breast milk feeding", obj.clinicalRecommendationStatement))
        assertTrue(stringMatch("Improvement noted as an incre", obj.improvementNotation))
        assertTrue(stringMatch("A discharge to a designated c", obj.guidance))
        assertTrue(stringMatch("Population Group 1", obj.group[0].identifier.value))
        assertTrue(stringMatch("initial-population-1-identifi", obj.group[0].population[0].identifier!!.value))
        assertTrue(stringMatch("initial-population", obj.group[0].population[0].code!!.coding[0].code))
        assertTrue(stringMatch("InitialPopulation1", obj.group[0].population[0].criteria))
        assertTrue(stringMatch("denominator-1-identifier", obj.group[0].population[1].identifier!!.value))
        assertTrue(stringMatch("denominator", obj.group[0].population[1].code!!.coding[0].code))
        assertTrue(stringMatch("Denominator1", obj.group[0].population[1].criteria))
        assertTrue(stringMatch("denominator-exclusions-1-iden", obj.group[0].population[2].identifier!!.value))
        assertTrue(stringMatch("denominator-exclusions", obj.group[0].population[2].code!!.coding[0].code))
        assertTrue(stringMatch("DenominatorExclusions1", obj.group[0].population[2].criteria))
        assertTrue(stringMatch("numerator-1-identifier", obj.group[0].population[3].identifier!!.value))
        assertTrue(stringMatch("numerator", obj.group[0].population[3].code!!.coding[0].code))
        assertTrue(stringMatch("Numerator1", obj.group[0].population[3].criteria))
        assertTrue(stringMatch("Population Group 2", obj.group[1].identifier.value))
        assertTrue(stringMatch("initial-population-2-identifi", obj.group[1].population[0].identifier!!.value))
        assertTrue(stringMatch("initial-population", obj.group[1].population[0].code!!.coding[0].code))
        assertTrue(stringMatch("InitialPopulation2", obj.group[1].population[0].criteria))
        assertTrue(stringMatch("denominator-2-identifier", obj.group[1].population[1].identifier!!.value))
        assertTrue(stringMatch("denominator", obj.group[1].population[1].code!!.coding[0].code))
        assertTrue(stringMatch("Denominator2", obj.group[1].population[1].criteria))
        assertTrue(stringMatch("denominator-exclusions-2-iden", obj.group[1].population[2].identifier!!.value))
        assertTrue(stringMatch("denominator-exclusion", obj.group[1].population[2].code!!.coding[0].code))
        assertTrue(stringMatch("DenominatorExclusions2", obj.group[1].population[2].criteria))
        assertTrue(stringMatch("numerator-2-identifier", obj.group[1].population[3].identifier!!.value))
        assertTrue(stringMatch("numerator", obj.group[1].population[3].code!!.coding[0].code))
        assertTrue(stringMatch("Numerator2", obj.group[1].population[3].criteria))
    }

    fun `measure-predecessor-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `measure-cms146-example 484 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/measure-cms146-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("measure-cms146-example", obj.id))
        assertTrue(stringMatch("additional", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("http://hl7.org/fhir/Measure/m", obj.url))
        assertTrue(stringMatch("official", obj.identifier[0].use))
        assertTrue(stringMatch("http://hl7.org/fhir/cqi/ecqm/", obj.identifier[0].system))
        assertTrue(stringMatch("146", obj.identifier[0].value))
        assertTrue(stringMatch("official", obj.identifier[1].use))
        assertTrue(stringMatch("http://hl7.org/fhir/cqi/ecqm/", obj.identifier[1].system))
        assertTrue(stringMatch("0002", obj.identifier[1].value))
        assertTrue(stringMatch("1.0.0", obj.version))
        assertTrue(stringMatch("CMS146", obj.name))
        assertTrue(stringMatch("Appropriate Testing for Child", obj.title))
        assertTrue(stringMatch("active", obj.status))
        assertEquals(true, if (obj.experimental != null) obj.experimental else false, "Field: obj.experimental")
        assertTrue(stringMatch("2017-03-10", obj.date))
        assertTrue(stringMatch("National Committee for Qualit", obj.publisher))
        assertTrue(stringMatch("Percentage of children 3-18 y", obj.description))
        assertTrue(stringMatch("Measure of children with a gr", obj.purpose))
        assertTrue(stringMatch("2016-01-01", obj.approvalDate))
        assertTrue(stringMatch("2016-09-01", obj.lastReviewDate))
        assertTrue(stringMatch("2017-01-01", obj.effectivePeriod!!.start))
        assertTrue(stringMatch("2017-12-31", obj.effectivePeriod!!.end))
        assertTrue(stringMatch("program", obj.useContext[0].code.code))
        assertTrue(stringMatch("eligibile-provider", obj.useContext[0].valueCodeableConcept.text))
        assertTrue(stringMatch("urn:iso:std:iso:3166", obj.jurisdiction[0].coding[0].system))
        assertTrue(stringMatch("US", obj.jurisdiction[0].coding[0].code))
        assertTrue(stringMatch("http://hl7.org/fhir/c80-doc-t", obj.topic[0].coding[0].system))
        assertTrue(stringMatch("57024-2", obj.topic[0].coding[0].code))
        assertTrue(stringMatch("author", obj.contributor[0].type))
        assertTrue(stringMatch("National Committee for Qualit", obj.contributor[0].name))
        assertTrue(stringMatch("url", obj.contact[0].telecom[0].system))
        assertTrue(stringMatch("http://www.ncqa.org/", obj.contact[0].telecom[0].value))
        assertTrue(stringMatch("Physician Performance Measure", obj.copyright))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("Linder, J.A., D.W. Bates, G.M", obj.relatedArtifact[0].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[1].type))
        assertTrue(stringMatch("Infectious Diseases Society o", obj.relatedArtifact[1].citation))
        assertTrue(stringMatch("documentation", obj.relatedArtifact[2].type))
        assertTrue(stringMatch("Roberts, R.R., B. Hota, I. Ah", obj.relatedArtifact[2].citation))
        assertTrue(stringMatch("Library/library-cms146-exampl", obj.library[0].reference))
        assertTrue(stringMatch("These performance Measures ar", obj.disclaimer))
        assertTrue(stringMatch("proportion", obj.scoring!!.coding[0].code))
        assertTrue(stringMatch("process", obj.type[0].coding[0].code))
        assertTrue(stringMatch("Group A streptococcal bacteri", obj.rationale))
        assertTrue(stringMatch("The Infectious Diseases Socie", obj.clinicalRecommendationStatement))
        assertTrue(stringMatch("Higher score indicates better", obj.improvementNotation))
        assertTrue(stringMatch("This is an episode of care me", obj.guidance))
        assertTrue(stringMatch("CMS146-group-1", obj.group[0].identifier.value))
        assertTrue(stringMatch("initial-population-identifier", obj.group[0].population[0].identifier!!.value))
        assertTrue(stringMatch("initial-population", obj.group[0].population[0].code!!.coding[0].code))
        assertTrue(stringMatch("CMS146.InInitialPopulation", obj.group[0].population[0].criteria))
        assertTrue(stringMatch("numerator-identifier", obj.group[0].population[1].identifier!!.value))
        assertTrue(stringMatch("numerator", obj.group[0].population[1].code!!.coding[0].code))
        assertTrue(stringMatch("CMS146.InNumerator", obj.group[0].population[1].criteria))
        assertTrue(stringMatch("denominator-identifier", obj.group[0].population[2].identifier!!.value))
        assertTrue(stringMatch("denominator", obj.group[0].population[2].code!!.coding[0].code))
        assertTrue(stringMatch("CMS146.InDenominator", obj.group[0].population[2].criteria))
        assertTrue(stringMatch("denominator-exclusions-identi", obj.group[0].population[3].identifier!!.value))
        assertTrue(stringMatch("denominator-exclusion", obj.group[0].population[3].code!!.coding[0].code))
        assertTrue(stringMatch("CMS146.InDenominatorExclusion", obj.group[0].population[3].criteria))
        assertTrue(stringMatch("stratifier-ages-up-to-9", obj.group[0].stratifier[0].identifier!!.value))
        assertTrue(stringMatch("CMS146.AgesUpToNine", obj.group[0].stratifier[0].criteria))
        assertTrue(stringMatch("stratifier-ages-10-plus", obj.group[0].stratifier[1].identifier!!.value))
        assertTrue(stringMatch("CMS146.AgesTenPlus", obj.group[0].stratifier[1].criteria))
        assertTrue(stringMatch("stratifier-ages-up-to-9", obj.group[0].stratifier[2].identifier!!.value))
        assertTrue(stringMatch("Patient.gender", obj.group[0].stratifier[2].path))
        assertTrue(stringMatch("supplemental-data-gender", obj.supplementalData[0].identifier!!.value))
        assertTrue(stringMatch("Patient.gender", obj.supplementalData[0].path))
        assertTrue(stringMatch("supplemental-data-deceased", obj.supplementalData[1].identifier!!.value))
        assertTrue(stringMatch("deceasedBoolean", obj.supplementalData[1].path))
    }

    fun `measure-cms146-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `measure-component-a-example 485 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/measure-component-a-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("component-a-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Screening for Alcohol Misuse", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("proportion", obj.scoring!!.coding[0].code))
        assertTrue(stringMatch("Main", obj.group[0].identifier.value))
        assertTrue(stringMatch("initial-population", obj.group[0].population[0].code!!.coding[0].code))
        assertTrue(stringMatch("Initial Population", obj.group[0].population[0].criteria))
        assertTrue(stringMatch("denominator", obj.group[0].population[1].code!!.coding[0].code))
        assertTrue(stringMatch("Denominator", obj.group[0].population[1].criteria))
        assertTrue(stringMatch("numerator", obj.group[0].population[2].code!!.coding[0].code))
        assertTrue(stringMatch("Numerator", obj.group[0].population[2].criteria))
    }

    fun `measure-component-a-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `measure-composite-example 486 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/measure-composite-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Measure::class.java)
        assertTrue(stringMatch("Measure", obj.resourceType))
        assertTrue(stringMatch("composite-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Behavioral Assessment Composi", obj.title))
        assertTrue(stringMatch("draft", obj.status))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[0].type))
        assertTrue(stringMatch("Measure/component-a-example", obj.relatedArtifact[0].resource!!.reference))
        assertTrue(stringMatch("composed-of", obj.relatedArtifact[1].type))
        assertTrue(stringMatch("Measure/component-b-example", obj.relatedArtifact[1].resource!!.reference))
        assertTrue(stringMatch("proportion", obj.scoring!!.coding[0].code))
        assertTrue(stringMatch("opportunity", obj.compositeScoring!!.coding[0].code))
    }

    fun `measure-composite-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
