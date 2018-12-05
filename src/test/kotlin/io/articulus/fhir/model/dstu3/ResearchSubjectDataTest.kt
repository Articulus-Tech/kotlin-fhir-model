package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ResearchSubjectDataTest : DataTests() {
    @Test
    fun `researchsubject-example 584 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/researchsubject-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ResearchSubject::class.java)
        assertTrue(stringMatch("ResearchSubject", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("Subject id", obj.identifier!!.type!!.text))
        assertTrue(stringMatch("http://example.org/studysubje", obj.identifier!!.system))
        assertTrue(stringMatch("123", obj.identifier!!.value))
        assertTrue(stringMatch("candidate", obj.status))
        assertTrue(stringMatch("ResearchStudy/example", obj.study.reference))
        assertTrue(stringMatch("Patient/example", obj.individual.reference))
    }

    fun `researchsubject-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
