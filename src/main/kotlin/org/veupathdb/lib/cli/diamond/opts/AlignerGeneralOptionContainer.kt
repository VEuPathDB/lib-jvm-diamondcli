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

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import java.nio.file.Path

interface AlignerGeneralOptionContainer {
  // input query file
  // `--query` | `-q`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `query_file`
  @get:JsonGetter("query")
  @set:JsonSetter("query")
  var query: List<Path>

  // query strands to search (both/minus/plus)
  // `--strand`
  // Default = `"both"`
  // Type = `string`
  // Config Var = `query_strands`
  @get:JsonGetter("strand")
  @set:JsonSetter("strand")
  var strand: String // TODO: enum this

  // file for unaligned queries
  // `--un`
  // Default = ``
  // Type = `string`
  // Config Var = `unaligned`
  @get:JsonGetter("unalignedFile")
  @set:JsonSetter("unalignedFile")
  var unalignedFile: Path

  // file or aligned queries
  // `--al`
  // Default = ``
  // Type = `string`
  // Config Var = `aligned_file`
  @get:JsonGetter("alignedFile")
  @set:JsonSetter("alignedFile")
  var alignedFile: Path

  // format of unaligned query file (fasta/fastq)
  // `--unfmt`
  // Default = `string("fasta")`
  // Type = `string`
  // Config Var = `unfmt`
  @get:JsonGetter("unalignedFileFormat")
  @set:JsonSetter("unalignedFileFormat")
  var unalignedFileFormat: String // TODO: enum this

  // format of aligned query file (fasta/fastq)
  // `--alfmt`
  // Default = `string("fasta")`
  // Type = ``
  // Config Var = `alfmt`
  @get:JsonGetter("alignedFileFormat")
  @set:JsonSetter("alignedFileFormat")
  var alignedFileFormat: String // TODO: enum this

  // report unaligned queries (0=no, 1=yes)
  // `--unal`
  // Default = `-1`
  // Type = `int`
  // Config Var = `report_unaligned`
  @get:JsonGetter("unal")
  @set:JsonSetter("unal")
  var unal: Int // TODO: enum this

  // maximum number of HSPs per target sequence to report for each query (default=1)
  // `--max-hsps`
  // Default = `1u`
  // Type = `unsigned`
  // Config Var = `max_hsps`
  @get:JsonGetter("maxHSPs")
  @set:JsonSetter("maxHSPs")
  var maxHSPs: UInt

  // restrict hit culling to overlapping query ranges
  // `--range-culling`
  // Default = ``
  // Type = `bool`
  // Config Var = `query_range_culling`
  @get:JsonGetter("rangeCulling")
  @set:JsonSetter("rangeCulling")
  var rangeCulling: Boolean

  // compression for output files (0=none, 1=gzip, zstd)
  // `--compress`
  // Default = ``
  // Type = `string`
  // Config Var = `compression`
  @get:JsonGetter("compress")
  @set:JsonSetter("compress")
  var compress: String // TODO: enum this

  // minimum bit score to report alignments (overrides e-value setting)
  // `--min-score`
  // Default = ``
  // Type = `double`
  // Config Var = `min_bit_score`
  @get:JsonGetter("minScore")
  @set:JsonSetter("minScore")
  var minScore: Double

  // minimum identity% to report an alignment
  // `--id`
  // Default = ``
  // Type = `double`
  // Config Var = `min_id`
  @get:JsonGetter("minimumIdentityPercentage")
  @set:JsonSetter("minimumIdentityPercentage")
  var minimumIdentityPercentage: Double

  // minimum query cover% to report an alignment
  // `--query-cover`
  // Default = ``
  // Type = `double`
  // Config Var = `query_cover`
  @get:JsonGetter("minimumQueryCoverPercentage")
  @set:JsonSetter("minimumQueryCoverPercentage")
  var minimumQueryCoverPercentage: Double

  // minimum subject cover% to report an alignment
  // `--subject-cover`
  // Default = ``
  // Type = `double`
  // Config Var = `subject_cover`
  @get:JsonGetter("minimumSubjectCoverPercentage")
  @set:JsonSetter("minimumSubjectCoverPercentage")
  var minimumSubjectCoverPercentage: Double

  // exhaustive alignment against all database sequences
  // `--swipe`
  // Default = ``
  // Type = `bool`
  // Config Var = `swipe_all`
  @get:JsonGetter("swipe")
  @set:JsonSetter("swipe")
  var swipe: Boolean

  // iterated search with increasing sensitivity
  // `--iterate`
  // Default = `Option<vector<string>>(), 0`
  // Type = `Option<string_vector>` // TODO: what is this?
  // Config Var = `iterate`
  @get:JsonGetter("iterate")
  @set:JsonSetter("iterate")
  var iterate: List<String>

  // number of targets for global ranking
  // `--global-ranking` | `-g`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `global_ranking_targets`
  @get:JsonGetter("globalRanking")
  @set:JsonSetter("globalRanking")
  var globalRanking: Long

  // sequence block size in billions of letters (default=2.0)
  // `--block-size` | `-b`
  // Default = ``
  // Type = `uint32_t`
  // Config Var = `chunk_size`
  @get:JsonGetter("blockSize")
  @set:JsonSetter("blockSize")
  var blockSize: UInt

  // number of chunks for index processing (default=4)
  // `--index-chunks` | `-c`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `lowmem_`
  @get:JsonGetter("indexChunks")
  @set:JsonSetter("indexChunks")
  var indexChunks: UInt

  // directory for temporary files used by multiprocessing
  // `--parallel-tmpdir`
  // Default = ``
  // Type = `string`
  // Config Var = `parallel_tmpdir`
  @get:JsonGetter("parallelTmpDir")
  @set:JsonSetter("parallelTmpDir")
  var parallelTmpDir: Path

  // gap open penalty
  // `--gapopen`
  // Default = `-1`
  // Type = `int`
  // Config Var = `gap_open`
  @get:JsonGetter("gapopen")
  @set:JsonSetter("gapopen")
  var gapopen: Int

  // gap extension penalty
  // `--gapextend`
  // Default = `-1`
  // Type = `int`
  // Config Var = `gap_extend`
  @get:JsonGetter("gapextend")
  @set:JsonSetter("gapextend")
  var gapextend: Int

  // score matrix for protein alignment (default=BLOSUM62)
  // `--matrix`
  // Default = `string("blosum62")`
  // Type = `string`
  // Config Var = `matrix`
  @get:JsonGetter("matrix")
  @set:JsonSetter("matrix")
  var matrix: String // TODO: enum this

  // file containing custom scoring matrix
  // `--custom-matrix`
  // Default = ``
  // Type = `string`
  // Config Var = `matrix_file`
  @get:JsonGetter("customMatrix")
  @set:JsonSetter("customMatrix")
  var customMatrix: Path

  // frame shift penalty (default=disabled)
  // `--frameshift` | `-F`
  // Default = ``
  // Type = `int`
  // Config Var = `frame_shift`
  @get:JsonGetter("frameshift")
  @set:JsonSetter("frameshift")
  var frameshift: Int

  // short for --range-culling --top 10 -F 15
  // `--long-reads`
  // Default = ``
  // Type = ``
  // Config Var = `long_reads`
  @get:JsonGetter("longReads")
  @set:JsonSetter("longReads")
  var longReads: Boolean // TODO: conflict detection!

  // genetic code to use to translate query (see user manual)
  // `--query-gencode`
  // Default = `1u`
  // Type = `unsigned`
  // Config Var = `query_gencode`
  @get:JsonGetter("queryGenCode")
  @set:JsonSetter("queryGenCode")
  var queryGenCode: UInt // TODO: enum this

  // include full subject titles in DAA file
  // `--salltitles`
  // Default = ``
  // Type = `bool`
  // Config Var = `salltitles`
  @get:JsonGetter("includeFullSubjectTitles")
  @set:JsonSetter("includeFullSubjectTitles")
  var includeFullSubjectTitles: Boolean

  // include all subject ids in DAA file
  // `--sallseqid`
  // Default = ``
  // Type = `bool`
  // Config Var = `sallseqid`
  @get:JsonGetter("includeAllSubjectIDs")
  @set:JsonSetter("includeAllSubjectIDs")
  var includeAllSubjectIDs: Boolean

  // suppress reporting of identical self hits
  // `--no-self-hits`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_self_hits`
  @get:JsonGetter("noSelfHits")
  @set:JsonSetter("noSelfHits")
  var noSelfHits: Boolean

  // restrict search to list of taxon ids (comma-separated)
  // `--taxonlist`
  // Default = ``
  // Type = `string`
  // Config Var = `taxonlist`
  @get:JsonGetter("taxonList")
  @set:JsonSetter("taxonList")
  var taxonList: List<String>

  // exclude list of taxon ids (comma-separated)
  // `--taxon-exclude`
  // Default = ``
  // Type = `string`
  // Config Var = `taxon_exclude`
  @get:JsonGetter("taxonExclude")
  @set:JsonSetter("taxonExclude")
  var taxonExclude: List<String>

  // filter the database by list of accessions
  // `--seqidlist`
  // Default = ``
  // Type = `std::string`
  // Config Var = `seqidlist`
  @get:JsonGetter("seqIdList")
  @set:JsonSetter("seqIdList")
  var seqIdList: Any // TODO: what is this? a file? a list?

  // ignore accessions missing in the database
  // `--skip-missing-seqids`
  // Default = ``
  // Type = `bool`
  // Config Var = `skip_missing_seqids`
  @get:JsonGetter("skipMissingSeqIDs")
  @set:JsonSetter("skipMissingSeqIDs")
  var skipMissingSeqIDs: Boolean
}
