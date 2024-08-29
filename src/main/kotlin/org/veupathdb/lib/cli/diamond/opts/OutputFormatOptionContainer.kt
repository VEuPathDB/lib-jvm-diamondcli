package org.veupathdb.lib.cli.diamond.opts

interface OutputFormatOptionContainer {
  ("outfmt", 'f', "output format\n\
  \t0   = BLAST pairwise\n\
  \t5   = BLAST XML\n\
  \t6   = BLAST tabular\n\
  \t100 = DIAMOND alignment archive (DAA)\n\
  \t101 = SAM\n\
  \t102 = Taxonomic classification\n\
  \t103 = PAF\n\
  \t104 = JSON (flat)\n\n\
  \tValues 6 and 104 may be followed by a space-separated list of these keywords:\n\n\
  \tqseqid means Query Seq - id\n\
  \tqlen means Query sequence length\n\
  \tsseqid means Subject Seq - id\n\
  \tsallseqid means All subject Seq - id(s), separated by a ';'\n\
  \tslen means Subject sequence length\n\
  \tqstart means Start of alignment in query\n\
  \tqend means End of alignment in query\n\
  \tsstart means Start of alignment in subject\n\
  \tsend means End of alignment in subject\n\
  \tqseq means Aligned part of query sequence\n\
  \tqseq_gapped means Aligned part of query sequence (with gaps)\n\
  \tqseq_translated means Aligned part of query sequence (translated)\n\
  \tfull_qseq means Query sequence\n\
  \tfull_qseq_mate means Query sequence of the mate\n\
  \tsseq means Aligned part of subject sequence\n\
  \tsseq_gapped means Aligned part of subject sequence (with gaps)\n\
  \tfull_sseq means Subject sequence\n\
  \tevalue means Expect value\n\
  \tbitscore means Bit score\n\
  \tcorrected_bitscore means Bit score corrected for edge effects\n\
  \tscore means Raw score\n\
  \tlength means Alignment length\n\
  \tpident means Percentage of identical matches\n\
  \tapprox_pident means Approximate percentage of identical matches\n\
  \tnident means Number of identical matches\n\
  \tmismatch means Number of mismatches\n\
  \tpositive means Number of positive - scoring matches\n\
  \tgapopen means Number of gap openings\n\
  \tgaps means Total number of gaps\n\
  \tppos means Percentage of positive - scoring matches\n\
  \tqframe means Query frame\n\
  \tbtop means Blast traceback operations(BTOP)\n\
  \tcigar means CIGAR string\n\
  \tstaxids means unique Subject Taxonomy ID(s), separated by a ';' (in numerical order)\n\
  \tsscinames means unique Subject Scientific Name(s), separated by a ';'\n\
  \tsskingdoms means unique Subject Super Kingdom(s), separated by a ';'\n\
  \tskingdoms means unique Subject Kingdom(s), separated by a ';'\n\
  \tsphylums means unique Subject Phylum(s), separated by a ';'\n\
  \tstitle means Subject Title\n\
  \tsalltitles means All Subject Title(s), separated by a '<>'\n\
  \tqcovhsp means Query Coverage Per HSP\n\
  \tscovhsp means Subject Coverage Per HSP\n\
  \tqtitle means Query title\n\
  \tqqual means Query quality values for the aligned part of the query\n\
  \tfull_qqual means Query quality values\n\
  \tqstrand means Query strand\n\
  \n\tDefault: qseqid sseqid pident length mismatch gapopen qstart qend sstart send evalue bitscore", output_format)
  ("include-lineage", 0, "Include lineage in the taxonomic classification format", include_lineage)
}