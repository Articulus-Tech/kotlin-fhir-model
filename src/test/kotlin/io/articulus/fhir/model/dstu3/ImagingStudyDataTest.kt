package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class ImagingStudyDataTest : DataTests() {
    @Test
    fun `imagingstudy-example-xr 410 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/imagingstudy-example-xr.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImagingStudy::class.java)
        assertTrue(stringMatch("ImagingStudy", obj.resourceType))
        assertTrue(stringMatch("example-xr", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.uid))
        assertTrue(stringMatch("usual", obj.accession!!.use))
        assertTrue(stringMatch("http://hl7.org/fhir/v2/0203", obj.accession!!.type!!.coding[0].system))
        assertTrue(stringMatch("ACSN", obj.accession!!.type!!.coding[0].code))
        assertTrue(stringMatch("W12342398", obj.accession!!.value))
        assertTrue(stringMatch("Organization/dicom-organizati", obj.accession!!.assigner!!.reference))
        assertTrue(stringMatch("secondary", obj.identifier[0].use))
        assertTrue(stringMatch("55551234", obj.identifier[0].value))
        assertTrue(stringMatch("Organization/dicom-organizati", obj.identifier[0].assigner!!.reference))
        assertTrue(stringMatch("ONLINE", obj.availability))
        assertTrue(stringMatch("http://dicom.nema.org/resourc", obj.modalityList[0].system))
        assertTrue(stringMatch("DX", obj.modalityList[0].code))
        assertTrue(stringMatch("Patient/dicom", obj.patient.reference))
        assertTrue(stringMatch("Encounter/example", obj.context!!.reference))
        assertTrue(stringMatch("2017-01-01T11:01:20+03:00", obj.started))
        assertTrue(stringMatch("ProcedureRequest/example", obj.basedOn[0].reference))
        assertTrue(stringMatch("Practitioner/example", obj.referrer!!.reference))
        assertTrue(stringMatch("Practitioner/example", obj.interpreter[0].reference))
        assertTrue(stringMatch("Endpoint/example-wadors", obj.endpoint[0].reference))
        assertEquals(1, obj.numberOfSeries)
        assertEquals(2, obj.numberOfInstances)
        assertTrue(stringMatch("Procedure/example", obj.procedureReference[0].reference))
        assertTrue(stringMatch("http://www.radlex.org", obj.procedureCode[0].coding[0].system))
        assertTrue(stringMatch("RPID2589", obj.procedureCode[0].coding[0].code))
        assertTrue(stringMatch("XR Wrist 3+ Views", obj.procedureCode[0].coding[0].display))
        assertTrue(stringMatch("XR Wrist 3+ Views", obj.procedureCode[0].text))
        assertTrue(stringMatch("http://snomed.info/sct", obj.reason!!.coding[0].system))
        assertTrue(stringMatch("357009", obj.reason!!.coding[0].code))
        assertTrue(stringMatch("Closed fracture of trapezoida", obj.reason!!.coding[0].display))
    }

    @Test
    fun `imagingstudy-example-xr 411 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/imagingstudy-example-xr.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImagingStudy::class.java)
        assertTrue(stringMatch("XR Wrist 3+ Views", obj.description))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.series[0].uid))
        assertEquals(3, obj.series[0].number)
        assertTrue(stringMatch("http://dicom.nema.org/resourc", obj.series[0].modality.system))
        assertTrue(stringMatch("DX", obj.series[0].modality.code))
        assertTrue(stringMatch("XR Wrist 3+ Views", obj.series[0].description))
        assertEquals(2, obj.series[0].numberOfInstances)
        assertTrue(stringMatch("ONLINE", obj.series[0].availability))
        assertTrue(stringMatch("Endpoint/example-wadors", obj.series[0].endpoint[0].reference))
        assertTrue(stringMatch("http://snomed.info/sct", obj.series[0].bodySite!!.system))
        assertTrue(stringMatch("T-15460", obj.series[0].bodySite!!.code))
        assertTrue(stringMatch("Wrist Joint", obj.series[0].bodySite!!.display))
        assertTrue(stringMatch("http://snomed.info/sct", obj.series[0].laterality!!.system))
        assertTrue(stringMatch("419161000", obj.series[0].laterality!!.code))
        assertTrue(stringMatch("Unilateral left", obj.series[0].laterality!!.display))
        assertTrue(stringMatch("2011-01-01T11:01:20+03:00", obj.series[0].started))
        assertTrue(stringMatch("Practitioner/example", obj.series[0].performer[0].reference))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.series[0].instance[0].uid))
        assertEquals(1, obj.series[0].instance[0].number)
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.series[0].instance[0].sopClass))
        assertTrue(stringMatch("PA VIEW", obj.series[0].instance[0].title))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.series[0].instance[1].uid))
        assertEquals(2, obj.series[0].instance[1].number)
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.series[0].instance[1].sopClass))
        assertTrue(stringMatch("LL VIEW", obj.series[0].instance[1].title))
    }

    fun `imagingstudy-example-xr Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `imagingstudy-example 412 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/imagingstudy-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, ImagingStudy::class.java)
        assertTrue(stringMatch("ImagingStudy", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.uid))
        assertTrue(stringMatch("Patient/dicom", obj.patient.reference))
        assertTrue(stringMatch("2011-01-01T11:01:20+03:00", obj.started))
        assertEquals(1, obj.numberOfSeries)
        assertEquals(1, obj.numberOfInstances)
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.series[0].uid))
        assertEquals(3, obj.series[0].number)
        assertTrue(stringMatch("http://dicom.nema.org/resourc", obj.series[0].modality.system))
        assertTrue(stringMatch("CT", obj.series[0].modality.code))
        assertTrue(stringMatch("CT Surview 180", obj.series[0].description))
        assertEquals(1, obj.series[0].numberOfInstances)
        assertTrue(stringMatch("http://snomed.info/sct", obj.series[0].bodySite!!.system))
        assertTrue(stringMatch("67734004", obj.series[0].bodySite!!.code))
        assertTrue(stringMatch("Upper Trunk Structure", obj.series[0].bodySite!!.display))
        assertTrue(stringMatch("urn:oid:2.16.124.113543.6003.", obj.series[0].instance[0].uid))
        assertEquals(1, obj.series[0].instance[0].number)
        assertTrue(stringMatch("urn:oid:1.2.840.10008.5.1.4.1", obj.series[0].instance[0].sopClass))
    }

    fun `imagingstudy-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
