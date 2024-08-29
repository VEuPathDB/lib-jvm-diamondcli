/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond.opts

interface AlignerGeneralOptionContainer {
  ("query", 'q', "input query file", query_file)
  ("strand", 0, "query strands to search (both/minus/plus)", query_strands, string("both"))
  ("un", 0, "file for unaligned queries", unaligned)
  ("al", 0, "file or aligned queries", aligned_file)
  ("unfmt", 0, "format of unaligned query file (fasta/fastq)", unfmt, string("fasta"))
  ("alfmt", 0, "format of aligned query file (fasta/fastq)", alfmt, string("fasta"))
  ("unal", 0, "report unaligned queries (0=no, 1=yes)", report_unaligned, -1)
  ("max-hsps", 0, "maximum number of HSPs per target sequence to report for each query (default=1)", max_hsps, 1u)
  ("range-culling", 0, "restrict hit culling to overlapping query ranges", query_range_culling)
  ("compress", 0, "compression for output files (0=none, 1=gzip, zstd)", compression)
  ("min-score", 0, "minimum bit score to report alignments (overrides e-value setting)", min_bit_score)
  ("id", 0, "minimum identity% to report an alignment", min_id)
  ("query-cover", 0, "minimum query cover% to report an alignment", query_cover)
  ("subject-cover", 0, "minimum subject cover% to report an alignment", subject_cover)
  ("swipe", 0, "exhaustive alignment against all database sequences", swipe_all)
  ("iterate", 0, "iterated search with increasing sensitivity", iterate, Option<vector<string>>(), 0)
  ("global-ranking", 'g', "number of targets for global ranking", global_ranking_targets)
  ("block-size", 'b', "sequence block size in billions of letters (default=2.0)", chunk_size)
  ("index-chunks", 'c', "number of chunks for index processing (default=4)", lowmem_)
  ("parallel-tmpdir", 0, "directory for temporary files used by multiprocessing", parallel_tmpdir)
  ("gapopen", 0, "gap open penalty", gap_open, -1)
  ("gapextend", 0, "gap extension penalty", gap_extend, -1)
  ("matrix", 0, "score matrix for protein alignment (default=BLOSUM62)", matrix, string("blosum62"))
  ("custom-matrix", 0, "file containing custom scoring matrix", matrix_file)
  ("frameshift", 'F', "frame shift penalty (default=disabled)", frame_shift)
  ("long-reads", 0, "short for --range-culling --top 10 -F 15", long_reads)
  ("query-gencode", 0, "genetic code to use to translate query (see user manual)", query_gencode, 1u)
  ("salltitles", 0, "include full subject titles in DAA file", salltitles)
  ("sallseqid", 0, "include all subject ids in DAA file", sallseqid)
  ("no-self-hits", 0, "suppress reporting of identical self hits", no_self_hits)
  ("taxonlist", 0, "restrict search to list of taxon ids (comma-separated)", taxonlist)
  ("taxon-exclude", 0, "exclude list of taxon ids (comma-separated)", taxon_exclude)
  ("seqidlist", 0, "filter the database by list of accessions", seqidlist)
  ("skip-missing-seqids", 0, "ignore accessions missing in the database", skip_missing_seqids);

}