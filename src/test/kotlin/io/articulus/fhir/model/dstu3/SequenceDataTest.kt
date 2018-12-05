package io.articulus.fhir.model.dstu3

import java.io.File
import java.lang.SuppressWarnings
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class SequenceDataTest : DataTests() {
    @Test
    fun `sequence-graphic-example-1 487 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-graphic-example-1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000002.12", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(128273724, obj.referenceSeq!!.windowStart)
        assertEquals(128273732, obj.referenceSeq!!.windowEnd)
        assertEquals(128273725, obj.variant[0].start)
        assertEquals(128273726, obj.variant[0].end)
        assertTrue(stringMatch("G", obj.variant[0].observedAllele))
        assertTrue(stringMatch("T", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("1M", obj.variant[0].cigar))
        assertTrue(stringMatch("Sequence/graphic-example-2", obj.pointer[0].reference))
    }

    fun `sequence-graphic-example-1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-fda-vcfeval 488 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-fda-vcfeval.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-vcfeval-comparison", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000001.11", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(10453, obj.referenceSeq!!.windowStart)
        assertEquals(101770080, obj.referenceSeq!!.windowEnd)
        assertEquals(13116, obj.variant[0].start)
        assertEquals(13117, obj.variant[0].end)
        assertTrue(stringMatch("T", obj.variant[0].observedAllele))
        assertTrue(stringMatch("G", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("indel", obj.quality[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/fil", obj.quality[0].standardSequence!!.coding[0].system))
        assertTrue(stringMatch("file-BkZxBZ00bpJVk2q6x43b1YBx", obj.quality[0].standardSequence!!.coding[0].code))
        assertEquals(10453, obj.quality[0].start)
        assertEquals(101770080, obj.quality[0].end)
        assertTrue(stringMatch("https://precision.fda.gov/app", obj.quality[0].method!!.coding[0].system))
        assertTrue(stringMatch("app-BxfGF8j02pBZzZxbzZxP725P", obj.quality[0].method!!.coding[0].code))
        assertTrue(stringMatch("Vcfeval + Hap.py Comparison", obj.quality[0].method!!.text))
    }

    @Test
    fun `sequence-example-fda-vcfeval 489 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-fda-vcfeval.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("%.2f".format(7749f), "%.2f".format(obj.quality[0].truthTP)))
        assertTrue(stringMatch("%.2f".format(2554f), "%.2f".format(obj.quality[0].truthFN)))
        assertTrue(stringMatch("%.2f".format(10670f), "%.2f".format(obj.quality[0].queryFP)))
        assertTrue(stringMatch("%.2f".format(2186f), "%.2f".format(obj.quality[0].gtFP)))
        assertTrue(stringMatch("%.2f".format(0.428005f), "%.2f".format(obj.quality[0].precision)))
        assertTrue(stringMatch("%.2f".format(0.752111f), "%.2f".format(obj.quality[0].recall)))
        assertTrue(stringMatch("snp", obj.quality[1].type))
        assertTrue(stringMatch("https://precision.fda.gov/fil", obj.quality[1].standardSequence!!.coding[0].system))
        assertTrue(stringMatch("file-BkZxBZ00bpJVk2q6x43b1YBx", obj.quality[1].standardSequence!!.coding[0].code))
        assertEquals(10453, obj.quality[1].start)
        assertEquals(101770080, obj.quality[1].end)
        assertTrue(stringMatch("https://precision.fda.gov/app", obj.quality[1].method!!.coding[0].system))
        assertTrue(stringMatch("app-BxfGF8j02pBZzZxbzZxP725P", obj.quality[1].method!!.coding[0].code))
        assertTrue(stringMatch("Vcfeval + Hap.py Comparison", obj.quality[1].method!!.text))
        assertTrue(stringMatch("%.2f".format(92106f), "%.2f".format(obj.quality[1].truthTP)))
        assertTrue(stringMatch("%.2f".format(1247f), "%.2f".format(obj.quality[1].truthFN)))
        assertTrue(stringMatch("%.2f".format(21744f), "%.2f".format(obj.quality[1].queryFP)))
        assertTrue(stringMatch("%.2f".format(493f), "%.2f".format(obj.quality[1].gtFP)))
        assertTrue(stringMatch("%.2f".format(0.808602f), "%.2f".format(obj.quality[1].precision)))
        assertTrue(stringMatch("%.2f".format(0.986642f), "%.2f".format(obj.quality[1].recall)))
        assertTrue(stringMatch("login", obj.repository[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/job", obj.repository[0].url))
        assertTrue(stringMatch("FDA", obj.repository[0].name))
    }

    fun `sequence-example-fda-vcfeval Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-TPMT-one 490 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-TPMT-one.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-one", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NT_007592.15", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(18130918, obj.referenceSeq!!.windowStart)
        assertEquals(18143955, obj.referenceSeq!!.windowEnd)
        assertEquals(18139214, obj.variant[0].start)
        assertEquals(18139214, obj.variant[0].end)
        assertTrue(stringMatch("A", obj.variant[0].observedAllele))
        assertTrue(stringMatch("G", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("T-C-C-C-A-C-C-C", obj.observedSeq))
    }

    fun `sequence-example-TPMT-one Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-pgx-2 491 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-pgx-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-pgx-2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NG_007726.3", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(55227970, obj.referenceSeq!!.windowStart)
        assertEquals(55227980, obj.referenceSeq!!.windowEnd)
        assertEquals(55227978, obj.variant[0].start)
        assertEquals(55227979, obj.variant[0].end)
        assertTrue(stringMatch("G", obj.variant[0].observedAllele))
        assertTrue(stringMatch("T", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("Observation/example-haplotype", obj.variant[0].variantPointer!!.reference))
        assertTrue(stringMatch("Target Haplotype Observation", obj.variant[0].variantPointer!!.display))
    }

    fun `sequence-example-pgx-2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example 492 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000009.11", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(22125500, obj.referenceSeq!!.windowStart)
        assertEquals(22125510, obj.referenceSeq!!.windowEnd)
        assertEquals(22125503, obj.variant[0].start)
        assertEquals(22125504, obj.variant[0].end)
        assertTrue(stringMatch("C", obj.variant[0].observedAllele))
        assertTrue(stringMatch("G", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("openapi", obj.repository[0].type))
        assertTrue(stringMatch("http://grch37.rest.ensembl.or", obj.repository[0].url))
        assertTrue(stringMatch("GA4GH API", obj.repository[0].name))
        assertTrue(stringMatch("3:rs1333049", obj.repository[0].variantsetId))
    }

    fun `sequence-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-fda 493 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-fda.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-example", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000001.11", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(10453, obj.referenceSeq!!.windowStart)
        assertEquals(101770080, obj.referenceSeq!!.windowEnd)
        assertEquals(13116, obj.variant[0].start)
        assertEquals(13117, obj.variant[0].end)
        assertTrue(stringMatch("T", obj.variant[0].observedAllele))
        assertTrue(stringMatch("G", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("snp", obj.quality[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/fil", obj.quality[0].standardSequence!!.coding[0].system))
        assertTrue(stringMatch("file-Bk50V4Q0qVb65P0v2VPbfYPZ", obj.quality[0].standardSequence!!.coding[0].code))
        assertEquals(10453, obj.quality[0].start)
        assertEquals(101770080, obj.quality[0].end)
        assertTrue(stringMatch("https://precision.fda.gov/job", obj.quality[0].method!!.coding[0].system))
        assertTrue(stringMatch("job-ByxYPx809jFVy21KJG74Jg3Y", obj.quality[0].method!!.coding[0].code))
        assertTrue(stringMatch("Vcfeval + Hap.py Comparison", obj.quality[0].method!!.text))
        assertTrue(stringMatch("%.2f".format(7749f), "%.2f".format(obj.quality[0].truthTP)))
        assertTrue(stringMatch("%.2f".format(7984f), "%.2f".format(obj.quality[0].queryTP)))
        assertTrue(stringMatch("%.2f".format(2554f), "%.2f".format(obj.quality[0].truthFN)))
        assertTrue(stringMatch("%.2f".format(10670f), "%.2f".format(obj.quality[0].queryFP)))
        assertTrue(stringMatch("%.2f".format(2186f), "%.2f".format(obj.quality[0].gtFP)))
        assertTrue(stringMatch("%.2f".format(0.428005f), "%.2f".format(obj.quality[0].precision)))
        assertTrue(stringMatch("%.2f".format(0.752111f), "%.2f".format(obj.quality[0].recall)))
        assertTrue(stringMatch("%.2f".format(0.545551f), "%.2f".format(obj.quality[0].fScore)))
        assertTrue(stringMatch("login", obj.repository[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/fil", obj.repository[0].url))
        assertTrue(stringMatch("FDA", obj.repository[0].name))
        assertTrue(stringMatch("file-Bx37ZK009P4bX5g3qjkFZV38", obj.repository[0].variantsetId))
    }

    fun `sequence-example-fda Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `coord-1base-example 494 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coord-1base-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("coord-1-base", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("ACGTAGTC", obj.referenceSeq!!.referenceSeqString))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(1, obj.referenceSeq!!.windowStart)
        assertEquals(8, obj.referenceSeq!!.windowEnd)
        assertEquals(2, obj.variant[0].start)
        assertEquals(3, obj.variant[0].end)
        assertTrue(stringMatch("ATG", obj.variant[0].observedAllele))
        assertTrue(stringMatch("-", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("3I", obj.variant[0].cigar))
        assertEquals(5, obj.variant[1].start)
        assertEquals(5, obj.variant[1].end)
        assertTrue(stringMatch("T", obj.variant[1].observedAllele))
        assertTrue(stringMatch("A", obj.variant[1].referenceAllele))
        assertTrue(stringMatch("3I", obj.variant[1].cigar))
        assertEquals(7, obj.variant[2].start)
        assertEquals(7, obj.variant[2].end)
        assertTrue(stringMatch("-", obj.variant[2].observedAllele))
        assertTrue(stringMatch("T", obj.variant[2].referenceAllele))
        assertTrue(stringMatch("1D", obj.variant[2].cigar))
        assertTrue(stringMatch("ACATGGTAGC", obj.observedSeq))
    }

    fun `coord-1base-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-graphic-example-4 495 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-graphic-example-4.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-4", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("http://hl7.org/fhir/chromosom", obj.referenceSeq!!.chromosome!!.coding[0].system))
        assertTrue(stringMatch("2", obj.referenceSeq!!.chromosome!!.coding[0].code))
        assertTrue(stringMatch("chromosome 2", obj.referenceSeq!!.chromosome!!.coding[0].display))
        assertTrue(stringMatch("GRCh 38", obj.referenceSeq!!.genomeBuild))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(128273736, obj.referenceSeq!!.windowStart)
        assertEquals(128273740, obj.referenceSeq!!.windowEnd)
    }

    fun `sequence-graphic-example-4 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-graphic-example-5 496 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-graphic-example-5.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-5", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000002.12", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(128273732, obj.referenceSeq!!.windowStart)
        assertEquals(128273736, obj.referenceSeq!!.windowEnd)
    }

    fun `sequence-graphic-example-5 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-TPMT-two 497 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-TPMT-two.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-TPMT-two", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NT_007592.15", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(18130918, obj.referenceSeq!!.windowStart)
        assertEquals(18143955, obj.referenceSeq!!.windowEnd)
        assertEquals(18131012, obj.variant[0].start)
        assertEquals(18131012, obj.variant[0].end)
        assertTrue(stringMatch("T", obj.variant[0].observedAllele))
        assertTrue(stringMatch("C", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("T-C-T-C-G-C-C-C", obj.observedSeq))
    }

    fun `sequence-example-TPMT-two Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-pgx-1 498 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-pgx-1.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("example-pgx-1", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NG_007726.3", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(55227970, obj.referenceSeq!!.windowStart)
        assertEquals(55227980, obj.referenceSeq!!.windowEnd)
        assertEquals(55227976, obj.variant[0].start)
        assertEquals(55227977, obj.variant[0].end)
        assertTrue(stringMatch("G", obj.variant[0].observedAllele))
        assertTrue(stringMatch("T", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("Observation/example-haplotype", obj.variant[0].variantPointer!!.reference))
        assertTrue(stringMatch("Target Haplotype Observation", obj.variant[0].variantPointer!!.display))
    }

    fun `sequence-example-pgx-1 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-example-fda-comparisons 499 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-example-fda-comparisons.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("fda-vcf-comparison", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertEquals(1, obj.coordinateSystem)
        assertTrue(stringMatch("Patient/example", obj.patient!!.reference))
        assertTrue(stringMatch("http://www.ncbi.nlm.nih.gov/n", obj.referenceSeq!!.referenceSeqId!!.coding[0].system))
        assertTrue(stringMatch("NC_000001.11", obj.referenceSeq!!.referenceSeqId!!.coding[0].code))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(10453, obj.referenceSeq!!.windowStart)
        assertEquals(101770080, obj.referenceSeq!!.windowEnd)
        assertEquals(13116, obj.variant[0].start)
        assertEquals(13117, obj.variant[0].end)
        assertTrue(stringMatch("T", obj.variant[0].observedAllele))
        assertTrue(stringMatch("G", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("unknown", obj.quality[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/fil", obj.quality[0].standardSequence!!.coding[0].system))
        assertTrue(stringMatch("file-BkZxBZ00bpJVk2q6x43b1YBx", obj.quality[0].standardSequence!!.coding[0].code))
        assertEquals(10453, obj.quality[0].start)
        assertEquals(101770080, obj.quality[0].end)
        assertTrue(stringMatch("%.2f".format(5.000f), "%.2f".format(obj.quality[0].score!!.value)))
        assertTrue(stringMatch("https://precision.fda.gov/app", obj.quality[0].method!!.coding[0].system))
        assertTrue(stringMatch("app-BqB9XZ8006ZZ2g5KzGXP3fpq", obj.quality[0].method!!.coding[0].code))
        assertTrue(stringMatch("VCF Comparison", obj.quality[0].method!!.text))
        assertTrue(stringMatch("%.2f".format(129481f), "%.2f".format(obj.quality[0].truthTP)))
        assertTrue(stringMatch("%.2f".format(3168f), "%.2f".format(obj.quality[0].truthFN)))
        assertTrue(stringMatch("%.2f".format(1507f), "%.2f".format(obj.quality[0].queryFP)))
        assertTrue(stringMatch("%.2f".format(2186f), "%.2f".format(obj.quality[0].gtFP)))
        assertTrue(stringMatch("%.2f".format(0.9885f), "%.2f".format(obj.quality[0].precision)))
        assertTrue(stringMatch("%.2f".format(0.9823f), "%.2f".format(obj.quality[0].fScore)))
        assertTrue(stringMatch("login", obj.repository[0].type))
        assertTrue(stringMatch("https://precision.fda.gov/com", obj.repository[0].url))
        assertTrue(stringMatch("FDA", obj.repository[0].name))
    }

    fun `sequence-example-fda-comparisons Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `coord-0base-example 500 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/coord-0base-example.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("coord-0-base", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("ACGTAGTC", obj.referenceSeq!!.referenceSeqString))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(0, obj.referenceSeq!!.windowStart)
        assertEquals(8, obj.referenceSeq!!.windowEnd)
        assertEquals(2, obj.variant[0].start)
        assertEquals(2, obj.variant[0].end)
        assertTrue(stringMatch("ATG", obj.variant[0].observedAllele))
        assertTrue(stringMatch("-", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("3I", obj.variant[0].cigar))
        assertEquals(4, obj.variant[1].start)
        assertEquals(5, obj.variant[1].end)
        assertTrue(stringMatch("T", obj.variant[1].observedAllele))
        assertTrue(stringMatch("A", obj.variant[1].referenceAllele))
        assertTrue(stringMatch("1M", obj.variant[1].cigar))
        assertEquals(6, obj.variant[2].start)
        assertEquals(7, obj.variant[2].end)
        assertTrue(stringMatch("-", obj.variant[2].observedAllele))
        assertTrue(stringMatch("T", obj.variant[2].referenceAllele))
        assertTrue(stringMatch("1D", obj.variant[2].cigar))
        assertTrue(stringMatch("ACATGGTAGC", obj.observedSeq))
    }

    fun `coord-0base-example Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-graphic-example-2 501 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-graphic-example-2.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-2", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("CGCCATTG", obj.referenceSeq!!.referenceSeqString))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(0, obj.referenceSeq!!.windowStart)
        assertEquals(8, obj.referenceSeq!!.windowEnd)
        assertTrue(stringMatch("Sequence/graphic-example-3", obj.pointer[0].reference))
    }

    fun `sequence-graphic-example-2 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }

    @Test
    fun `sequence-graphic-example-3 502 Test`() {
        val json = File("./src/test/resources/model/sample_data/dstu3/sequence-graphic-example-3.json").readTextAndClose()
        val obj = mapper.fromJson(json, Sequence::class.java)
        assertTrue(stringMatch("Sequence", obj.resourceType))
        assertTrue(stringMatch("graphic-example-3", obj.id))
        assertTrue(stringMatch("generated", obj.text!!.status))
        assertTrue(stringMatch("<div xmlns=\"http://www.w3.org", obj.text!!.div))
        assertTrue(stringMatch("dna", obj.type))
        assertEquals(0, obj.coordinateSystem)
        assertTrue(stringMatch("Sequence/graphic-example-5", obj.referenceSeq!!.referenceSeqPointer!!.reference))
        assertEquals(1, obj.referenceSeq!!.strand)
        assertEquals(128273732, obj.referenceSeq!!.windowStart)
        assertEquals(128273736, obj.referenceSeq!!.windowEnd)
        assertEquals(1282737234, obj.variant[0].start)
        assertEquals(128273736, obj.variant[0].end)
        assertTrue(stringMatch("GA", obj.variant[0].observedAllele))
        assertTrue(stringMatch("AT", obj.variant[0].referenceAllele))
        assertTrue(stringMatch("2M", obj.variant[0].cigar))
        assertTrue(stringMatch("Sequence/graphic-example-4", obj.pointer[0].reference))
    }

    fun `sequence-graphic-example-3 Init`(@SuppressWarnings("unused") obj: Bundle) {
        obj.identifier  // No-Op to suprress unused warnings
    }
}
