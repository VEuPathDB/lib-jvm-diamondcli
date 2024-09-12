package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class FormatField(
  override val cliValue: String,

  @get:JsonValue
  val jsonValue: String,
) : CliSerializable {
  // 0 means Query Seq - id
  QuerySequenceID("qseqid", "query-sequence-id"),
  // 1 means Query GI
  QueryGI("qgi", "query-gi"),
  // 2 means Query accesion
  QueryAccesion("qacc", "query-accesion"),
  // 3 means Query accesion.version
  QueryAccesionVersion("qaccver", "query-accesion-version"),
  // 4 means Query sequence length
  QuerySequenceLength("qlen", "query-length"),
  // 5 means Subject Seq - id
  SubjectSequenceID("sseqid", "subject-sequence-id"),
  // 6 means All subject Seq - id(s), separated by a ';'
  AllSubjectSequenceIDs("sallseqid", "all-subject-sequence-ids"),
  // 7 means Subject GI
  SubjectGI("sgi", "subject-gi"),
  // 8 means All subject GIs
  AllSubjectGIs("sallgi", "allSubjectGIs"),
  // 9 means Subject accession
  SubjectAccesion("sacc", "subjectAccesion"),
  // 10 means Subject accession.version
  SubjectAccesionVersion("saccver", "subjectAccesionVersion"),
  // 11 means All subject accessions
  AllSubjectAccesions("sallacc", "allSubjectAccesions"),
  // 12 means Subject sequence length
  SubjectSequenceLength("slen", "subjectSequenceLength"),
  // 13 means Start of alignment in query
  QueryAlignmentStart("qstart", "queryAlignmentStart"),
  // 14 means End of alignment in query
  QueryAlignmentEnd("qend", "queryAlignmentEnd"),
  // 15 means Start of alignment in subject
  SubjectAlignmentStart("sstart", "subjectAlignmentStart"),
  // 16 means End of alignment in subject
  SubjectAlignmentEnd("send", "subjectAlignmentEnd"),
  // 17 means Aligned part of query sequence
  AlignedQuerySequence("qseq", "alignedQuerySequence"),
  // 18 means Aligned part of subject sequence
  AlignedSubjectSequence("sseq", "alignedSubjectSequence"),
  // 19 means Expect value
  ExpectValue("evalue", "expect-value"),
  // 20 means Bit score
  BitScore("bitscore", "bit-score"),
  // 21 means Raw score
  RawScore("score", "raw-score"),
  // 22 means Alignment length
  AlignmentLength("length", "alignment-length"),
  // 23 means Percentage of identical matches
  PercentIdenticalMatches("pident", "percent-identical-matches"),
  // 24 means Number of identical matches
  IdenticalMatches("nident", "identical-matches"),
  // 25 means Number of mismatches
  Mismatches("mismatch", "mismatches"),
  // 26 means Number of positive-scoring matches
  PositiveScoringMatches("positive", "positive-scoring-matches"),
  // 27 means Number of gap openings
  GapOpenings("gapopen", "gap-openings"),
  // 28 means Total number of gaps
  TotalGaps("gaps", "total-gaps"),
  // 29 means Percentage of positive-scoring matches
  PercentPositiveScoringMatches("ppos", "percent-positive-scoring-matches"),
  // 30 means Query and subject frames separated by a '/'
  Frames("frames", "frames"),
  // 31 means Query frame
  QueryFrame("qframe", "query-frame"),
  // 32 means Subject frame
  SubjectFrame("sframe", "subject-frame"),
  // 33 means Blast traceback operations (BTOP)
  BlastTracebackOperations("btop", "blast-traceback-operations"),
  // 34 means unique Subject Taxonomy ID(s), separated by a ';'	(in numerical order)
  SubjectTaxonomyIDs("staxids", "subject-taxonomy-ids"),
  // 35 means unique Subject Scientific Name(s), separated by a ';'
  SubjectScientificNames("sscinames", "subject-scientific-names"),
  // 36 means unique Subject Common Name(s), separated by a ';'
  SubjectCommonNames("scomnames", "subject-common-names"),
  // 37 means unique Subject Blast Name(s), separated by a ';'	(in alphabetical order)
  SubjectBlastNames("sblastnames", "subject-blast-names"),
  // 38 means unique Subject Super Kingdom(s), separated by a ';'	(in alphabetical order)
  SubjectSuperKingdoms("sskingdoms", "subject-super-kingdoms"),
  // 39 means Subject Title
  SubjectTitle("stitle", "subjectTitle"),
  // 40 means All Subject Title(s), separated by a '<>'
  AllSubjectTitles("salltitles", "all-subject-titles"),
  // 41 means Subject Strand
  SubjectStrand("sstrand", "subject-strand"),
  // 42 means Query Coverage Per Subject
  QueryCoveragePerSubject("qcovs", "query-coverage-per-subject"),
  // 43 means Query Coverage Per HSP
  QueryCoveragePerHSP("qcovhsp", "query-coverage-per-hsp"),
  // 44 means Query Coverage Per Unique Subject(blastn only)
  QueryCoveragePerUniqueSubject("qcovus", "query-coverage-per-unique-subject"),
  // 45 means Query title
  QueryTitle("qtitle", "query-title"),
  // 46 -- TODO: possibly smith-waterman diff?
  SWDiff("swdiff", "sw-diff"),
  // 47
  Time("time", "time"),
  // 48 Subject sequence
  FullSubjectSequence("full_sseq", "full-subject-sequence"),
  // 49 Aligned part of query quality values
  AlignedQueryQualityValues("qqual", "aligned-query-quality-values"),
  // 50
  QueryNum("qnum", "query-num"),
  // 51
  SubjectNum("snum", "subject-num"),
  // 52 Subject coverage per HSP
  SubjectCoveragePerHSP("scovhsp", "subject-coverage-per-hsp"),
  // 53 Query quality values
  FullQueryQualityValues("full_qqual", "full-query-quality-values"),
  // 54 Query sequence
  FullQuerySequence("full_qseq", "full-query-sequence"),
  // 55 Query sequence with gaps
  QuerySequenceGapped("qseq_gapped", "query-sequence-gapped"),
  // 56 Subject sequence with gaps
  SubjectSequenceGapped("sseq_gapped", "subject-sequence-gapped"),
  // 57 Query strand
  QueryStrand("qstrand", "query-strand"),
  // 58 CIGAR -- ???
  CIGAR("cigar", "cigar"),
  // 59 Subject kingdoms
  SubjectKingdoms("skingdoms", "subject-kingdoms"),
  // 60 Subject phylums
  SubjectPhylums("sphylums", "subject-phylums"),
  // 61 Ungapped score
  UngappedScore("ungapped_score", "ungapped-score"),
  // 62 Query sequence of the mate
  FullQuerySequenceOfMate("full_qseq_mate", "full-query-sequence-of-mate"),
  // 63 Aligned part of query sequence (translated); needs transcript only in frameshift mode
  QuerySequenceTranslated("qseq_translated", "query-sequence-translated"),
  // 64
  ReducedMatchBitString("reduced_match_bitstring", "reduced-match-bit-string"),
  // 65
  NormalizedBitScoreSemiglobal("normalized_bitscore_semiglobal", "normalized-bit-score-semiglobal"),
  // 66
  HSPNum("hspnum", "hsp-num"),
  // 67
  NormalizedBitScoreGlobal("normalized_bitscore_global", "normalized-bit-score-global"),
  // 68
  PIDENT_GLOBAL("pident_global", "pident-global"),
  // 69
  EXT_COUNT("ext_count", "ext-count"),
  // 70
  NW_SEMIGLOBAL("nw_semiglobal", "nw-semiglobal"),
  // 71
  APPROX_PIDENT("approx_pident", "approx-pident"),
  // 72
  CorrectedBitScore("corrected_bitscore", "corrected-bit-score"),
  // 73
  NEG_EVALUE("neg_evalue", "neg_evalue"),
  // 74
  Reserved1("reserved1", "reserved1"),
  // 75
  Reserved2("reserved2", "reserved2"),
  // 76 Subject lineages
  SubjectLineages("slineages", "subject-lineages"),
  ;

  @JsonValue
  override fun toString() = cliValue

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isTextual -> fromString(json.textValue())
        else           -> invalid(json)
      }

    @JvmStatic
    fun fromString(string: String) =
      formatFieldCache()?.let { it[string.lowercase()] ?: invalid(string) }
        ?: string.lowercase().let { key -> entries.find { it.jsonValue == key || it.cliValue == key } }
        ?: invalid(string)
  }
}
