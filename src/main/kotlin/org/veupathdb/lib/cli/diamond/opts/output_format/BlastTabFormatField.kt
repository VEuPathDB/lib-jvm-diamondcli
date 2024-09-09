package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.invalid

enum class BlastTabFormatField(val key: String) {
  // 0 means Query Seq - id
  QuerySequenceID("qseqid"),
  // 1 means Query GI
  QueryGI("qgi"),
  // 2 means Query accesion
  QueryAccesion("qacc"),
  // 3 means Query accesion.version
  QueryAccesionVersion("qaccver"),
  // 4 means Query sequence length
  QuerySequenceLength("qlen"),
  // 5 means Subject Seq - id
  SubjectSequenceID("sseqid"),
  // 6 means All subject Seq - id(s), separated by a ';'
  AllSubjectSequenceIDs("sallseqid"),
  // 7 means Subject GI
  SubjectGI("sgi"),
  // 8 means All subject GIs
  AllSubjectGIs("sallgi"),
  // 9 means Subject accession
  SubjectAccesion("sacc"),
  // 10 means Subject accession.version
  SubjectAccesionVersion("saccver"),
  // 11 means All subject accessions
  AllSubjectAccesions("sallacc"),
  // 12 means Subject sequence length
  SubjectSequenceLength("slen"),
  // 13 means Start of alignment in query
  QueryAlignmentStart("qstart"),
  // 14 means End of alignment in query
  QueryAlignmentEnd("qend"),
  // 15 means Start of alignment in subject
  SubjectAlignmentStart("sstart"),
  // 16 means End of alignment in subject
  SubjectAlignmentEnd("send"),
  // 17 means Aligned part of query sequence
  AlignedQuerySequence("qseq"),
  // 18 means Aligned part of subject sequence
  AlignedSubjectSequence("sseq"),
  // 19 means Expect value
  ExpectValue("evalue"),
  // 20 means Bit score
  BitScore("bitscore"),
  // 21 means Raw score
  RawScore("score"),
  // 22 means Alignment length
  AlignmentLength("length"),
  // 23 means Percentage of identical matches
  PercentIdenticalMatches("pident"),
  // 24 means Number of identical matches
  IdenticalMatches("nident"),
  // 25 means Number of mismatches
  Mismatches("mismatch"),
  // 26 means Number of positive-scoring matches
  PositiveScoringMatches("positive"),
  // 27 means Number of gap openings
  GapOpenings("gapopen"),
  // 28 means Total number of gaps
  TotalGaps("gaps"),
  // 29 means Percentage of positive-scoring matches
  PercentPositiveScoringMatches("ppos"),
  // 30 means Query and subject frames separated by a '/'
  Frames("frames"),
  // 31 means Query frame
  QueryFrame("qframe"),
  // 32 means Subject frame
  SubjectFrame("sframe"),
  // 33 means Blast traceback operations (BTOP)
  BlastTracebackOperations("btop"),
  // 34 means unique Subject Taxonomy ID(s), separated by a ';'	(in numerical order)
  SubjectTaxonomyIDs("staxids"),
  // 35 means unique Subject Scientific Name(s), separated by a ';'
  SubjectScientificNames("sscinames"),
  // 36 means unique Subject Common Name(s), separated by a ';'
  SubjectCommonNames("scomnames"),
  // 37 means unique Subject Blast Name(s), separated by a ';'	(in alphabetical order)
  SubjectBlastNames("sblastnames"),
  // 38 means unique Subject Super Kingdom(s), separated by a ';'	(in alphabetical order)
  SubjectSuperKingdoms("sskingdoms"),
  // 39 means Subject Title
  SubjectTitle("stitle"),
  // 40 means All Subject Title(s), separated by a '<>'
  AllSubjectTitles("salltitles"),
  // 41 means Subject Strand
  SubjectStrand("sstrand"),
  // 42 means Query Coverage Per Subject
  QueryCoveragePerSubject("qcovs"),
  // 43 means Query Coverage Per HSP
  QueryCoveragePerHSP("qcovhsp"),
  // 44 means Query Coverage Per Unique Subject(blastn only)
  QueryCoveragePerUniqueSubject("qcovus"),
  // 45 means Query title
  QueryTitle("qtitle"),
  // 46 -- TODO: possibly smith-waterman diff?
  SWDiff("swdiff"),
  // 47
  Time("time"),
  // 48 Subject sequence
  FullSubjectSequence("full_sseq"),
  // 49 Aligned part of query quality values
  AlignedQueryQualityValues("qqual"),
  // 50
  QueryNum("qnum"),
  // 51
  SubjectNum("snum"),
  // 52 Subject coverage per HSP
  SubjectCoveragePerHSP("scovhsp"),
  // 53 Query quality values
  FullQueryQualityValues("full_qqual"),
  // 54 Query sequence
  FullQuerySequence("full_qseq"),
  // 55 Query sequence with gaps
  QuerySequenceGapped("qseq_gapped"),
  // 56 Subject sequence with gaps
  SubjectSequenceGapped("sseq_gapped"),
  // 57 Query strand
  QueryStrand("qstrand"),
  // 58 CIGAR -- ???
  CIGAR("cigar"),
  // 59 Subject kingdoms
  SubjectKingdoms("skingdoms"),
  // 60 Subject phylums
  SubjectPhylums("sphylums"),
  // 61 Ungapped score
  UngappedScore("ungapped_score"),
  // 62 Query sequence of the mate
  FullQuerySequenceOfMate("full_qseq_mate"),
  // 63 Aligned part of query sequence (translated); needs transcript only in frameshift mode
  QuerySequenceTranslated("qseq_translated"),
  // 64
  ReducedMatchBitString("reduced_match_bitstring"),
  // 65
  NormalizedBitScoreSemiglobal("normalized_bitscore_semiglobal"),
  // 66
  HSPNum("hspnum"),
  // 67
  NormalizedBitScoreGlobal("normalized_bitscore_global"),
  // 68
  PIDENT_GLOBAL("pident_global"),
  // 69
  EXT_COUNT("ext_count"),
  // 70
  NW_SEMIGLOBAL("nw_semiglobal"),
  // 71
  APPROX_PIDENT("approx_pident"),
  // 72
  CorrectedBitScore("corrected_bitscore"),
  // 73
  NEG_EVALUE("neg_evalue"),
  // 74
  Reserved1("reserved1"),
  // 75
  Reserved2("reserved2"),
  // 76 Subject lineages
  SubjectLineages("slineages"),
  ;

  @JsonValue
  override fun toString() = key

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
      string.lowercase().let { key -> entries.find { it.key == key } }
        ?: invalid(string)
  }
}
