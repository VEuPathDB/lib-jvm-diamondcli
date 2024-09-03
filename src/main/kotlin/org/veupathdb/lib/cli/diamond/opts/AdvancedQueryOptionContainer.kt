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

interface AdvancedQueryOptionContainer {
  // Seed search algorithm (0=double-indexed/1=query-indexed/ctg=contiguous-seed)
  // `--algo`
  // Default = ``
  // Type = `string`
  // Config Var = `algo_str`
  @get:JsonGetter("algo")
  @set:JsonSetter("algo")
  var algo: String

  // ignore translated sequences without an open reading frame of at least this length
  // `--min-orf` | `-l`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `run_len`
  @get:JsonGetter("minOrf")
  @set:JsonSetter("minOrf")
  var minOrf: UInt

  // cutoff for seed complexity
  // `--seed-cut`
  // Default = ``
  // Type = `double`
  // Config Var = `seed_cut_`
  @get:JsonGetter("seedCut")
  @set:JsonSetter("seedCut")
  var seedCut: Double

  // mask seeds based on frequency
  // `--freq-masking`
  // Default = ``
  // Type = `bool`
  // Config Var = `freq_masking`
  @get:JsonGetter("freqMasking")
  @set:JsonSetter("freqMasking")
  var freqMasking: Boolean

  // number of standard deviations for ignoring frequent seeds
  // `--freq-sd`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `freq_sd_`
  @get:JsonGetter("freqStandardDeviation")
  @set:JsonSetter("freqStandardDeviation")
  var freqStandardDeviation: Double

  // minimum number of identities for stage 1 hit
  // `--id2`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `min_identities_`
  @get:JsonGetter("id2")
  @set:JsonSetter("id2")
  var id2: UInt

  // only consider seed hits against longest target for identical seeds
  // `--linsearch`
  // Default = ``
  // Type = `bool`
  // Config Var = `linsearch`
  @get:JsonGetter("linsearch")
  @set:JsonSetter("linsearch")
  var linsearch: Boolean

  // only consider seed hits against longest query for identical seeds
  // `--lin-stage1`
  // Default = ``
  // Type = `bool`
  // Config Var = `lin_stage1`
  @get:JsonGetter("linStage1")
  @set:JsonSetter("linStage1")
  var linStage1: Boolean

  // xdrop for ungapped alignment
  // `--xdrop` | `-x`
  // Default = `12.3`
  // Type = `double`
  // Config Var = `ungapped_xdrop`
  @get:JsonGetter("xDrop")
  @set:JsonSetter("xDrop")
  var xDrop: Double

  // E-value threshold for gapped filter (auto)
  // `--gapped-filter-evalue`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `gapped_filter_evalue_`
  @get:JsonGetter("gappedFilterEValue")
  @set:JsonSetter("gappedFilterEValue")
  var gappedFilterEValue: Double

  // band for dynamic programming computation
  // `--band`
  // Default = ``
  // Type = `int`
  // Config Var = `padding`
  @get:JsonGetter("band")
  @set:JsonSetter("band")
  var band: Int

  // seed shapes
  // `--shape-mask`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `shape_mask`
  @get:JsonGetter("shapeMask")
  @set:JsonSetter("shapeMask")
  var shapeMask: List<String>

  // enable distributed-memory parallel processing
  // `--multiprocessing`
  // Default = ``
  // Type = `bool`
  // Config Var = `multiprocessing`
  @get:JsonGetter("multiprocessing")
  @set:JsonSetter("multiprocessing")
  var multiprocessing: Boolean

  // initialize multiprocessing run
  // `--mp-init`
  // Default = ``
  // Type = `bool`
  // Config Var = `mp_init`
  @get:JsonGetter("mpInit")
  @set:JsonSetter("mpInit")
  var mpInit: Boolean

  // enable continuation of interrupted multiprocessing run
  // `--mp-recover`
  // Default = ``
  // Type = `bool`
  // Config Var = `mp_recover`
  @get:JsonGetter("mpRecover")
  @set:JsonSetter("mpRecover")
  var mpRecover: Boolean

  // process only a single query chunk as specified
  // `--mp-query-chunk`
  // Default = `-1`
  // Type = `int`
  // Config Var = `mp_query_chunk`
  @get:JsonGetter("mpQueryChunk")
  @set:JsonSetter("mpQueryChunk")
  var mpQueryChunk: Int

  // minimum range overlap with higher scoring hit to delete a hit (default=50%)
  // `--culling-overlap`
  // Default = `50.0`
  // Type = `double`
  // Config Var = `inner_culling_overlap`
  @get:JsonGetter("cullingOverlap")
  @set:JsonSetter("cullingOverlap")
  var cullingOverlap: Double

  // maximum number of targets to report per species
  // `--taxon-k`
  // Default = `(uint64_t)0`
  // Type = `uint64_t`
  // Config Var = `taxon_k`
  @get:JsonGetter("taxonK")
  @set:JsonSetter("taxonK")
  var taxonK: ULong

  // percentage of query range to be covered for range culling (default=50%)
  // `--range-cover`
  // Default = `50.0`
  // Type = `double`
  // Config Var = `query_range_cover`
  @get:JsonGetter("rangeCover")
  @set:JsonSetter("rangeCover")
  var rangeCover: Double

  // Use gnl|BL_ORD_ID| style format in XML output
  // `--xml-blord-format`
  // Default = ``
  // Type = `bool`
  // Config Var = `xml_blord_format`
  @get:JsonGetter("xmlBlordFormat")
  @set:JsonSetter("xmlBlordFormat")
  var xmlBlordFormat: Boolean

  // add the query length to the SAM format (tag ZQ)
  // `--sam-query-len`
  // Default = ``
  // Type = `bool`
  // Config Var = `sam_qlen_field`
  @get:JsonGetter("samQueryLen")
  @set:JsonSetter("samQueryLen")
  var samQueryLen: Boolean

  // Set the match score of stop codons against each other.
  // `--stop-match-score`
  // Default = `1`
  // Type = `int`
  // Config Var = `stop_match_score`
  @get:JsonGetter("stopMatchScore")
  @set:JsonSetter("stopMatchScore")
  var stopMatchScore: Int

  // Enable target-indexed mode
  // `--target-indexed`
  // Default = ``
  // Type = `bool`
  // Config Var = `target_indexed`
  @get:JsonGetter("targetIndexed")
  @set:JsonSetter("targetIndexed")
  var targetIndexed: Boolean

  // TODO: What is this?
  // `--unaligned-targets`
  // Default = ``
  // Type = `string`
  // Config Var = `unaligned_targets`
  @get:JsonGetter("unalignedTargets")
  @set:JsonSetter("unalignedTargets")
  var unalignedTargets: String

  // TODO: What is this?
  // `--cut-bar`
  // Default = ``
  // Type = `bool`
  // Config Var = `cut_bar`
  @get:JsonGetter("cutBar")
  @set:JsonSetter("cutBar")
  var cutBar: Boolean

  // TODO: What is this?
  // `--check-multi-target`
  // Default = ``
  // Type = `bool`
  // Config Var = `check_multi_target`
  @get:JsonGetter("checkMultiTarget")
  @set:JsonSetter("checkMultiTarget")
  var checkMultiTarget: Boolean

  // TODO: What is this?
  // `--roc-file`
  // Default = ``
  // Type = `string`
  // Config Var = `roc_file`
  @get:JsonGetter("rocFile")
  @set:JsonSetter("rocFile")
  var rocFile: Path

  // TODO: What is this?
  // `--family-map`
  // Default = ``
  // Type = `string`
  // Config Var = `family_map`
  @get:JsonGetter("familyMap")
  @set:JsonSetter("familyMap")
  var familyMap: String // TODO: is this a file?

  // TODO: What is this?
  // `--family-map-query`
  // Default = ``
  // Type = `string`
  // Config Var = `family_map_query`
  @get:JsonGetter("familyMapQuery")
  @set:JsonSetter("familyMapQuery")
  var familyMapQuery: String // TODO: how is this used?

  // TODO: What is this?
  // `--query-parallel-limit`
  // Default = `3000000u`
  // Type = `unsigned`
  // Config Var = `query_parallel_limit`
  @get:JsonGetter("queryParallelLimit")
  @set:JsonSetter("queryParallelLimit")
  var queryParallelLimit: UInt

  // TODO: What is this?
  // `--log-evalue-scale`
  // Default = `1.0 / std::log(2.0)`
  // Type = `double`
  // Config Var = `log_evalue_scale`
  @get:JsonGetter("logEValueScale")
  @set:JsonSetter("logEValueScale")
  var logEValueScale: Double

  // TODO: What is this?
  // `--bootstrap`
  // Default = ``
  // Type = `bool`
  // Config Var = `bootstrap`
  @get:JsonGetter("bootstrap")
  @set:JsonSetter("bootstrap")
  var bootstrap: Boolean

  // TODO: What is this?
  // `--heartbeat`
  // Default = ``
  // Type = `bool`
  // Config Var = `heartbeat`
  @get:JsonGetter("heartbeat")
  @set:JsonSetter("heartbeat")
  var heartbeat: Boolean

  // TODO: What is this?
  // `--mp-self`
  // Default = ``
  // Type = `bool`
  // Config Var = `mp_self`
  @get:JsonGetter("mpSelf")
  @set:JsonSetter("mpSelf")
  var mpSelf: Boolean

  // zdrop for gapped dna alignment
  // `--zdrop` | `-z`
  // Default = `40`
  // Type = `int`
  // Config Var = `zdrop`
  @get:JsonGetter("zDrop")
  @set:JsonSetter("zDrop")
  var zDrop: Int

  // filter out top FLOAT fraction of repetitive minimizers
  // `--repetition-cutoff`
  // Default = `0.0002`
  // Type = `double`
  // Config Var = `repetitive_cutoff`
  @get:JsonGetter("repetitionCutoff")
  @set:JsonSetter("repetitionCutoff")
  var repetitionCutoff: Double

  // extension algorithm (wfa, ksw=default)
  // `--extension`
  // Default = `"ksw"`
  // Type = `string`
  // Config Var = `dna_extension_string`
  @get:JsonGetter("extension")
  @set:JsonSetter("extension")
  var extension: String

  // use chaining without extension
  // `--chaining-out`
  // Default = ``
  // Type = `bool`
  // Config Var = `chaining_out`
  @get:JsonGetter("chainingOut")
  @set:JsonSetter("chainingOut")
  var chainingOut: Boolean

  // use chaining with extension
  // `--align-long-reads`
  // Default = ``
  // Type = `bool`
  // Config Var = `align_long_reads`
  @get:JsonGetter("alignLongReads")
  @set:JsonSetter("alignLongReads")
  var alignLongReads: Boolean

  // scaling factor for the chaining gap penalty
  // `--chain-pen-gap-scale`
  // Default = `0.8`
  // Type = `double`
  // Config Var = `chain_pen_gap_scale`
  @get:JsonGetter("chainPenGapScale")
  @set:JsonSetter("chainPenGapScale")
  var chainPenGapScale: Double

  // scaling factor for the chaining skip penalty
  // `--chain-pen-skip-scalee` // THIS TYPO EXISTS IN THE DIAMOND SOURCE CODE!
  // Default = `0.0`
  // Type = `double`
  // Config Var = `chain_pen_skip_scale`
  @get:JsonGetter("chainPenSkipScale")
  @set:JsonSetter("chainPenSkipScale")
  var chainPenSkipScale: Double

  // blastn mismatch penalty
  // `--penalty`
  // Default = `-3`
  // Type = `int`
  // Config Var = `mismatch_penalty`
  @get:JsonGetter("penalty")
  @set:JsonSetter("penalty")
  var penalty: Int

  // blastn match reward
  // `--reward`
  // Default = `2`
  // Type = `int`
  // Config Var = `match_reward`
  @get:JsonGetter("reward")
  @set:JsonSetter("reward")
  var reward: Int

  // TODO: What is this?
  // `--query-or-subject-cover`
  // Default = ``
  // Type = `double`
  // Config Var = `query_or_target_cover`
  @get:JsonGetter("queryOrSubjectCover")
  @set:JsonSetter("queryOrSubjectCover")
  var queryOrSubjectCover: Double
}
