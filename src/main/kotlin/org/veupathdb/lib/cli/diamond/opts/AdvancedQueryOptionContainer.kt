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
import org.veupathdb.lib.cli.diamond.opts.fields.DNAExtensionAlgorithm
import org.veupathdb.lib.cli.diamond.opts.fields.SeedSearchAlgorithm
import java.nio.file.Path

interface AdvancedQueryOptionContainer {
  /**
   * Seed search algorithm (0=double-indexed/1=query-indexed/ctg=contiguous-seed)
   *
   * Flag: `--algo`
   */
  @CliFlag("algo")
  @get:JsonGetter("algo")
  @set:JsonSetter("algo")
  var algo: SeedSearchAlgorithm?

  /**
   * Ignore translated sequences without an open reading frame of at least this
   * length.
   *
   * Flag: `--min-orf` | `-l`
   */
  @CliFlag("min-orf", 'l')
  @get:JsonGetter("minOrf")
  @set:JsonSetter("minOrf")
  var minOrf: UInt?

  /**
   * Cutoff for seed complexity.
   *
   * Flag: `--seed-cut`
   */
  @CliFlag("seed-cut")
  @get:JsonGetter("seedCut")
  @set:JsonSetter("seedCut")
  var seedCut: Double?

  /**
   * Mask seeds based on frequency
   *
   * Flag: `--freq-masking`
   */
  @CliFlag("freq-masking")
  @get:JsonGetter("freqMasking")
  @set:JsonSetter("freqMasking")
  var freqMasking: Boolean?

  /**
   * Number of standard deviations for ignoring frequent seeds.
   *
   * Flag: `--freq-sd`
   *
   * Default: `0.0`
   */
  @CliFlag("freq-sd")
  @get:JsonGetter("freqStandardDeviation")
  @set:JsonSetter("freqStandardDeviation")
  var freqStandardDeviation: Double?

  /**
   * Minimum number of identities for stage 1 hit.
   *
   * Flag: `--id2`
   */
  @CliFlag("id2")
  @get:JsonGetter("id2")
  @set:JsonSetter("id2")
  var id2: UInt?

  /**
   * Only consider seed hits against longest target for identical seeds.
   *
   * Flag: `--linsearch`
   */
  @CliFlag("linsearch")
  @get:JsonGetter("linsearch")
  @set:JsonSetter("linsearch")
  var linsearch: Boolean?

  /**
   * Only consider seed hits against longest query for identical seeds.
   *
   * Flag: `--lin-stage1`
   */
  @CliFlag("lin-stage1")
  @get:JsonGetter("linStage1")
  @set:JsonSetter("linStage1")
  var linStage1: Boolean?

  /**
   * xDrop for ungapped alignment.
   *
   * Flag: `--xdrop` | `-x`
   *
   * Default: `12.3`
   */
  @CliFlag("xdrop", 'x')
  @get:JsonGetter("xDrop")
  @set:JsonSetter("xDrop")
  var xDrop: Double?

  /**
   * E-value threshold for gapped filter (auto)
   *
   * Flag: `--gapped-filter-evalue`
   *
   * Default: `-1.0`
   */
  @CliFlag("gapped-filter-evalue")
  @get:JsonGetter("gappedFilterEValue")
  @set:JsonSetter("gappedFilterEValue")
  var gappedFilterEValue: Double?

  /**
   * Band for dynamic programming computation
   *
   * Flag: `--band`
   */
  @CliFlag("band")
  @get:JsonGetter("band")
  @set:JsonSetter("band")
  var band: Int?

  /**
   * Seed shapes
   *
   * Flag: `--shape-mask`
   */
  @CliFlag("shape-mask")
  @get:JsonGetter("shapeMask")
  @set:JsonSetter("shapeMask")
  var shapeMask: List<String>?

  /**
   * enable distributed-memory parallel processing
   *
   * Flag: `--multiprocessing`
   */
  @CliFlag("multiprocessing")
  @get:JsonGetter("multiprocessing")
  @set:JsonSetter("multiprocessing")
  var multiprocessing: Boolean?

  /**
   * Initialize multiprocessing run.
   *
   * Flag: `--mp-init`
   */
  @CliFlag("mp-init")
  @get:JsonGetter("mpInit")
  @set:JsonSetter("mpInit")
  var mpInit: Boolean?

  /**
   * Enable continuation of interrupted multiprocessing run.
   *
   * Flag: `--mp-recover`
   */
  @CliFlag("mp-recover")
  @get:JsonGetter("mpRecover")
  @set:JsonSetter("mpRecover")
  var mpRecover: Boolean?

  /**
   * Process only a single query chunk as specified
   *
   * Flag: `--mp-query-chunk`
   *
   * Default: `-1`
   */
  @CliFlag("mp-query-chunk")
  @get:JsonGetter("mpQueryChunk")
  @set:JsonSetter("mpQueryChunk")
  var mpQueryChunk: Int?

  /**
   * Minimum range overlap with higher scoring hit to delete a hit (default=50%)
   *
   * Flag: `--culling-overlap`
   *
   * Default: `50.0`
   */
  @CliFlag("culling-overlap")
  @get:JsonGetter("cullingOverlap")
  @set:JsonSetter("cullingOverlap")
  var cullingOverlap: Double?

  /**
   * Maximum number of targets to report per species.
   *
   * Flag: `--taxon-k`
   *
   * Default: `0`
   */
  @CliFlag("taxon-k")
  @get:JsonGetter("taxonK")
  @set:JsonSetter("taxonK")
  var taxonK: ULong?

  /**
   * Percentage of query range to be covered for range culling.
   *
   * Flag: `--range-cover`
   *
   * Default: `50.0`
   */
  @CliFlag("range-cover")
  @get:JsonGetter("rangeCover")
  @set:JsonSetter("rangeCover")
  var rangeCover: Double?

  /**
   * Use gnl|BL_ORD_ID| style format in XML output.
   *
   * Flag: `--xml-blord-format`
   */
  @CliFlag("xml-blord-format")
  @get:JsonGetter("xmlBlOrdFormat")
  @set:JsonSetter("xmlBlOrdFormat")
  var xmlBlOrdFormat: Boolean?

  /**
   * Add the query length to the SAM format (tag ZQ).
   *
   * Flag: `--sam-query-len`
   */
  @CliFlag("sam-query-len")
  @get:JsonGetter("samQueryLen")
  @set:JsonSetter("samQueryLen")
  var samQueryLen: Boolean?

  /**
   * Set the match score of stop codons against each other.
   *
   * Flag: `--stop-match-score`
   *
   * Default: `1`
   */
  @CliFlag("stop-match-score")
  @get:JsonGetter("stopMatchScore")
  @set:JsonSetter("stopMatchScore")
  var stopMatchScore: Int?

  /**
   * Enable target-indexed mode.
   *
   * Flag: `--target-indexed`
   */
  @CliFlag("target-indexed")
  @get:JsonGetter("targetIndexed")
  @set:JsonSetter("targetIndexed")
  var targetIndexed: Boolean?

  /**
   * Flag: `--unaligned-targets`
   */
  @CliFlag("unaligned-targets")
  @get:JsonGetter("unalignedTargets")
  @set:JsonSetter("unalignedTargets")
  var unalignedTargets: Path?

  /**
   * Flag: `--cut-bar`
   */
  @CliFlag("cut-bar")
  @get:JsonGetter("cutBar")
  @set:JsonSetter("cutBar")
  var cutBar: Boolean?

  /**
   * Flag: `--check-multi-target`
   */
  @CliFlag("check-multi-target")
  @get:JsonGetter("checkMultiTarget")
  @set:JsonSetter("checkMultiTarget")
  var checkMultiTarget: Boolean?

  /**
   * Flag: `--roc-file`
   */
  @CliFlag("roc-file")
  @get:JsonGetter("rocFile")
  @set:JsonSetter("rocFile")
  var rocFile: Path?

  /**
   * Flag: `--family-map`
   */
  @CliFlag("family-map")
  @get:JsonGetter("familyMap")
  @set:JsonSetter("familyMap")
  var familyMap: Path?

  /**
   * File: `--family-map-query`
   */
  @CliFlag("family-map-query")
  @get:JsonGetter("familyMapQuery")
  @set:JsonSetter("familyMapQuery")
  var familyMapQuery: Path?

  /**
   * Flag: `--query-parallel-limit`
   *
   * Default: `3000000u`
   */
  @CliFlag("query-parallel-limit")
  @get:JsonGetter("queryParallelLimit")
  @set:JsonSetter("queryParallelLimit")
  var queryParallelLimit: UInt?

  /**
   * Flag: `--log-evalue-scale`
   *
   * Default: `1.0 / std::log(2.0)`
   */
  @CliFlag("log-evalue-scale")
  @get:JsonGetter("logEValueScale")
  @set:JsonSetter("logEValueScale")
  var logEValueScale: Double?

  /**
   * Flag: `--bootstrap`
   */
  @CliFlag("bootstrap")
  @get:JsonGetter("bootstrap")
  @set:JsonSetter("bootstrap")
  var bootstrap: Boolean?

  /**
   * Flag: `--heartbeat`
   */
  @CliFlag("heartbeat")
  @get:JsonGetter("heartbeat")
  @set:JsonSetter("heartbeat")
  var heartbeat: Boolean?

  /**
   * Flag: `--mp-self`
   */
  @CliFlag("mp-self")
  @get:JsonGetter("mpSelf")
  @set:JsonSetter("mpSelf")
  var mpSelf: Boolean?

  /**
   * zDrop for gapped dna alignment
   *
   * Flag: `--zdrop` | `-z`
   *
   * Default: `40`
   */
  @CliFlag("zdrop", 'z')
  @get:JsonGetter("zDrop")
  @set:JsonSetter("zDrop")
  var zDrop: Int?

  /**
   * Filter out top FLOAT fraction of repetitive minimizers.
   *
   * Flag: `--repetition-cutoff`
   *
   * Default: `0.0002`
   */
  @CliFlag("repetition-cutoff")
  @get:JsonGetter("repetitionCutoff")
  @set:JsonSetter("repetitionCutoff")
  var repetitionCutoff: Double?

  /**
   * Extension algorithm (wfa, ksw=default)
   *
   * Flag: `--extension`
   *
   * Default: `"ksw"`
   */
  @CliFlag("extension")
  @get:JsonGetter("extension")
  @set:JsonSetter("extension")
  var extension: DNAExtensionAlgorithm?

  /**
   * Use chaining without extension
   *
   * Flag: `--chaining-out`
   */
  @CliFlag("chaining-out")
  @get:JsonGetter("chainingOut")
  @set:JsonSetter("chainingOut")
  var chainingOut: Boolean?

  /**
   * Use chaining with extension.
   *
   * Flag: `--align-long-reads`
   */
  @CliFlag("align-long-reads")
  @get:JsonGetter("alignLongReads")
  @set:JsonSetter("alignLongReads")
  var alignLongReads: Boolean?

  /**
   * Scaling factor for the chaining gap penalty.
   *
   * Flag: `--chain-pen-gap-scale`
   *
   * Default: `0.8`
   */
  @CliFlag("chain-pen-gap-scale")
  @get:JsonGetter("chainPenGapScale")
  @set:JsonSetter("chainPenGapScale")
  var chainPenGapScale: Double?

  /**
   * Scaling factor for the chaining skip penalty.
   *
   * FLAG NAME TYPO EXISTS IN THE DIAMOND SOURCE CODE!
   *
   * Flag: `--chain-pen-skip-scalee`
   *
   * Default: `0.0`
   */
  @CliFlag("chain-pen-skip-scalee") // TYPO "scalee" EXISTS IN THE DIAMOND SOURCE CODE!
  @get:JsonGetter("chainPenSkipScale")
  @set:JsonSetter("chainPenSkipScale")
  var chainPenSkipScale: Double?

  /**
   * BlastN mismatch penalty
   *
   * Flag: `--penalty`
   *
   * Default: `-3`
   */
  @CliFlag("penalty")
  @get:JsonGetter("penalty")
  @set:JsonSetter("penalty")
  var penalty: Int?

  /**
   * BlastN match reward
   *
   * Flag: `--reward`
   *
   * Default: `2`
   */
  @CliFlag("reward")
  @get:JsonGetter("reward")
  @set:JsonSetter("reward")
  var reward: Int?

  /**
   * Flag: `--query-or-subject-cover`
   */
  @CliFlag("query-or-subject-cover")
  @get:JsonGetter("queryOrSubjectCover")
  @set:JsonSetter("queryOrSubjectCover")
  var queryOrSubjectCover: Double?
}
