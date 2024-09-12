/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http: *www.apache.org/licenses/LICENSE-2.0
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
import io.foxcapades.lib.cli.builder.flag.CliFlag
import java.nio.file.Path

interface AlignerGeneralOptionContainer {
  /**
   * Input query file.
   *
   * Flag = `--query` | `-q`
   */
  @CliFlag("query", 'q')
  @get:JsonGetter("query")
  @set:JsonSetter("query")
  var query: List<Path>

  /**
   * Query strands to search.
   *
   * Flag = `--strand`
   * Default = [QueryStrand.Both]
   */
  @CliFlag("strand")
  @get:JsonGetter("strand")
  @set:JsonSetter("strand")
  var strand: QueryStrand

  /**
   * File for unaligned queries.
   *
   * Flag = `--un`
   */
  @CliFlag("un")
  @get:JsonGetter("unalignedFile")
  @set:JsonSetter("unalignedFile")
  var unalignedFile: Path

  /**
   * File or aligned queries
   *
   * Flag = `--al`
   */
  @CliFlag("al")
  @get:JsonGetter("alignedFile")
  @set:JsonSetter("alignedFile")
  var alignedFile: Path

  /**
   * Format of unaligned query file.
   *
   * Flag = `--unfmt`
   * Default = [QueryFileFormat.FASTA]
   */
  @CliFlag("unfmt")
  @get:JsonGetter("unalignedFileFormat")
  @set:JsonSetter("unalignedFileFormat")
  var unalignedFileFormat: QueryFileFormat

  /**
   * Format of aligned query file.
   *
   * Flag = `--alfmt`
   * Default = [QueryFileFormat.FASTA]
   */
  @CliFlag("alfmt")
  @get:JsonGetter("alignedFileFormat")
  @set:JsonSetter("alignedFileFormat")
  var alignedFileFormat: QueryFileFormat

  /**
   * Report unaligned queries.
   *
   * Flag = `--unal`
   */
  @CliFlag("unal")
  @get:JsonGetter("unal")
  @set:JsonSetter("unal")
  var unal: Boolean // TODO: FAKE ENUM 0 or 1 when set!

  /**
   * Maximum number of HSPs per target sequence to report for each query.
   *
   * Flag = `--max-hsps`
   * Default = `1u`
   */
  @CliFlag("max-hsps")
  @get:JsonGetter("maxHSPs")
  @set:JsonSetter("maxHSPs")
  var maxHSPs: UInt

  /**
   * Restrict hit culling to overlapping query ranges.
   *
   * Flag = `--range-culling`
   */
  @CliFlag("range-culling")
  @get:JsonGetter("rangeCulling")
  @set:JsonSetter("rangeCulling")
  var rangeCulling: Boolean

  /**
   * Compression for output files.
   *
   * Flag = `--compress`
   */
  @CliFlag("compress")
  @get:JsonGetter("compress")
  @set:JsonSetter("compress")
  var compress: Compression

  /**
   * Minimum bit score to report alignments (overrides e-value setting).
   *
   * Flag = `--min-score`
   */
  @CliFlag("min-score")
  @get:JsonGetter("minScore")
  @set:JsonSetter("minScore")
  var minScore: Double

  /**
   * Minimum identity percentage to report an alignment.
   *
   * Flag = `--id`
   */
  @CliFlag("id")
  @get:JsonGetter("minimumIdentityPercentage")
  @set:JsonSetter("minimumIdentityPercentage")
  var minimumIdentityPercentage: Double

  /**
   * Minimum query cover percentage to report an alignment.
   *
   * Flag = `--query-cover`
   */
  @CliFlag("query-cover")
  @get:JsonGetter("minimumQueryCoverPercentage")
  @set:JsonSetter("minimumQueryCoverPercentage")
  var minimumQueryCoverPercentage: Double

  /**
   * Minimum subject cover percentage to report an alignment.
   *
   * Flag = `--subject-cover`
   */
  @CliFlag("subject-cover")
  @get:JsonGetter("minimumSubjectCoverPercentage")
  @set:JsonSetter("minimumSubjectCoverPercentage")
  var minimumSubjectCoverPercentage: Double

  /**
   * Exhaustive alignment against all database sequences.
   *
   * Flag = `--swipe`
   */
  @CliFlag("swipe")
  @get:JsonGetter("swipe")
  @set:JsonSetter("swipe")
  var swipe: Boolean

  /**
   * Iterated search with increasing sensitivity.
   *
   * Flag = `--iterate`
   */
  @CliFlag("iterate")
  @get:JsonGetter("iterate")
  @set:JsonSetter("iterate")
  var iterate: List<Sensitivity>

  /**
   * Number of targets for global ranking.
   *
   * Type = `--global-ranking` | `-g`
   */
  @CliFlag("global-ranking", 'g')
  @get:JsonGetter("globalRanking")
  @set:JsonSetter("globalRanking")
  var globalRanking: Long

  /**
   * Sequence block size in billions of letters.
   *
   * Flag = `--block-size` | `-b`
   * Default = `2.0`
   */
  @CliFlag("block-size", 'b')
  @get:JsonGetter("blockSize")
  @set:JsonSetter("blockSize")
  var blockSize: Double

  /**
   * Number of chunks for index processing.
   *
   * Flag = `--index-chunks` | `-c`
   * Default = `4`
   */
  @CliFlag("index-chunks", 'c')
  @get:JsonGetter("indexChunks")
  @set:JsonSetter("indexChunks")
  var indexChunks: UInt

  /**
   * Directory for temporary files used by multiprocessing.
   *
   * Flag = `--parallel-tmpdir`
   */
  @CliFlag("parallel-tmpdir")
  @get:JsonGetter("parallelTmpDir")
  @set:JsonSetter("parallelTmpDir")
  var parallelTmpDir: Path

  /**
   * Gap open penalty.
   *
   * Flag = `--gapopen`
   * Default = `-1`
   */
  @CliFlag("gapopen")
  @get:JsonGetter("gapopen")
  @set:JsonSetter("gapopen")
  var gapOpenPenalty: Int

  /**
   * Gap extension penalty.
   *
   * Flag = `--gapextend`
   * Default = `-1`
   */
  @CliFlag("gapextend")
  @get:JsonGetter("gapextend")
  @set:JsonSetter("gapextend")
  var gapExtendPenalty: Int

  /**
   * Score matrix for protein alignment.
   *
   * Flag = `--matrix`
   * Default = [ScoreMatrix.BLOSUM62]
   */
  @CliFlag("matrix")
  @get:JsonGetter("matrix")
  @set:JsonSetter("matrix")
  var matrix: ScoreMatrix

  /**
   * File containing custom scoring matrix.
   *
   * Flag = `--custom-matrix`
   */
  @CliFlag("custom-matrix")
  @get:JsonGetter("customMatrix")
  @set:JsonSetter("customMatrix")
  var customMatrix: Path

  /**
   * Frame shift penalty (default=disabled)
   *
   * Flag = `--frameshift` | `-F`
   */
  @CliFlag("frameshift", 'F')
  @get:JsonGetter("frameshift")
  @set:JsonSetter("frameshift")
  var frameShiftPenalty: Int

  /**
   * Short for `--range-culling --top 10 -F 15`.
   *
   * TODO: conflict detection!
   *
   * Flag = `--long-reads`
   */
  @CliFlag("long-reads")
  @get:JsonGetter("longReads")
  @set:JsonSetter("longReads")
  var longReads: Boolean

  /**
   * Genetic code to use to translate query.
   *
   * Flag = `--query-gencode`
   * Default = [TranslatorGenCode.Standard]
   */
  @CliFlag("query-gencode")
  @get:JsonGetter("queryGenCode")
  @set:JsonSetter("queryGenCode")
  var queryGenCode: TranslatorGenCode

  /**
   * Include full subject titles in DAA file.
   *
   * Flag = `--salltitles`
   */
  @CliFlag("salltitles")
  @get:JsonGetter("includeFullSubjectTitles")
  @set:JsonSetter("includeFullSubjectTitles")
  var includeFullSubjectTitles: Boolean

  /**
   * Include all subject ids in DAA file
   *
   * Flag = `--sallseqid`
   */
  @CliFlag("sallseqid")
  @get:JsonGetter("includeAllSubjectIDs")
  @set:JsonSetter("includeAllSubjectIDs")
  var includeAllSubjectIDs: Boolean

  /**
   * Suppress reporting of identical self hits.
   *
   * Flag = `--no-self-hits`
   */
  @CliFlag("no-self-hits")
  @get:JsonGetter("noSelfHits")
  @set:JsonSetter("noSelfHits")
  var noSelfHits: Boolean

  /**
   * Restrict search to list of taxon ids.
   *
   * Flag = `--taxonlist`
   */
  @CliFlag("taxonlist")
  @get:JsonGetter("taxonList")
  @set:JsonSetter("taxonList")
  var taxonList: List<String>

  /**
   * Exclude list of taxon ids.
   *
   * TODO: comma separated list on serialization!
   *
   * Flag = `--taxon-exclude`
   */
  @CliFlag("taxon-exclude")
  @get:JsonGetter("taxonExclude")
  @set:JsonSetter("taxonExclude")
  var taxonExclude: List<String>

  /**
   * Filter the database by list of accessions.
   *
   * Flag = `--seqidlist`
   */
  @CliFlag("seqidlist")
  @get:JsonGetter("seqIdList")
  @set:JsonSetter("seqIdList")
  var seqIdList: Path

  /**
   * Ignore accessions missing in the database.
   *
   * Flag = `--skip-missing-seqids`
   */
  @CliFlag("skip-missing-seqids")
  @get:JsonGetter("skipMissingSeqIDs")
  @set:JsonSetter("skipMissingSeqIDs")
  var skipMissingSeqIDs: Boolean
}

