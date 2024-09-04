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

// THIS IS ONLY USED WHEN COMPILED WITH 'EXTRA' AND IT IS UNCLEAR WHAT FLAG GOES
// WITH WHAT COMMAND.  ADD A GENERAL WARNING TO ALL PROPERTIES IN THIS TYPE!
interface HiddenOptionContainer {
  // ("match1", 0, "", match_file1) // unused in 2.1.9
  // ("match2", 0, "", match_file2) // unused in 2.1.9

  /**
   *
   */
  // TODO: potentially used by blastp/blastx
  @get:JsonGetter("maximumSeedFrequency")
  @set:JsonSetter("maximumSeedFrequency")
  var maximumSeedFrequency: Double

  // maximum seed frequency
  // `--seed-freq`
  // Default = `-15.0`
  // Type = `double`
  // Config Var = `max_seed_freq`
  @get:JsonGetter("seedFreq")
  @set:JsonSetter("seedFreq")
  var seedFreq: Double

  //
  // `--space-penalty`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `space_penalty`
  @get:JsonGetter("spacePenalty")
  @set:JsonSetter("spacePenalty")
  var spacePenalty: Double

  //
  // `--reverse`
  // Default = ``
  // Type = `bool`
  // Config Var = `reverse`
  @get:JsonGetter("reverse")
  @set:JsonSetter("reverse")
  var reverse: Boolean

  //
  // `--neighborhood-score`
  // Default = ``
  // Type = `int`
  // Config Var = `neighborhood_score`
  @get:JsonGetter("neighborhoodScore")
  @set:JsonSetter("neighborhoodScore")
  var neighborhoodScore: Int

  //
  // `--seed-weight` | `-w`
  // Default = `7u`
  // Type = `unsigned`
  // Config Var = `seed_weight`
  @get:JsonGetter("seedWeight")
  @set:JsonSetter("seedWeight")
  var seedWeight: UInt

  //
  // `--idl`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_left`
  @get:JsonGetter("idLeft")
  @set:JsonSetter("idLeft")
  var idLeft: UInt

  //
  // `--idr`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_right`
  @get:JsonGetter("idRight")
  @set:JsonSetter("idRight")
  var idRight: UInt

  //
  // `--idn`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_n`
  @get:JsonGetter("idN")
  @set:JsonSetter("idN")
  var idN: UInt

  //
  // `--bmatch`
  // Default = ``
  // Type = `int`
  // Config Var = `bmatch`
  @get:JsonGetter("bmatch")
  @set:JsonSetter("bmatch")
  var bmatch: Int

  //
  // `--bmismatch`
  // Default = ``
  // Type = `int`
  // Config Var = `bmismatch`
  @get:JsonGetter("bmismatch")
  @set:JsonSetter("bmismatch")
  var bmismatch: Int

  //
  // `--bcutoff`
  // Default = ``
  // Type = `int`
  // Config Var = `bcutoff`
  @get:JsonGetter("bcutoff")
  @set:JsonSetter("bcutoff")
  var bcutoff: Int

  //
  // `--ants`
  // Default = `uint64_t(100)`
  // Type = `uint64_t`
  // Config Var = `n_ants`
  @get:JsonGetter("ants")
  @set:JsonSetter("ants")
  var ants: ULong

  //
  // `--rho`
  // Default = `0.99`
  // Type = `double`
  // Config Var = `rho`
  @get:JsonGetter("rho")
  @set:JsonSetter("rho")
  var rho: Double

  //
  // `--p_best`
  // Default = `0.05`
  // Type = `double`
  // Config Var = `p_best`
  @get:JsonGetter("p_best")
  @set:JsonSetter("p_best")
  var p_best: Double

  //
  // `--d_exp`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_exp`
  @get:JsonGetter("d_exp")
  @set:JsonSetter("d_exp")
  var d_exp: Double

  //
  // `--d_new`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_new`
  @get:JsonGetter("d_new")
  @set:JsonSetter("d_new")
  var d_new: Double

  //
  // `--score-estimate-factor`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `score_estimate_factor`
  @get:JsonGetter("scoreEstimateFactor")
  @set:JsonSetter("scoreEstimateFactor")
  var scoreEstimateFactor: Double

  //
  // `--diag-min-estimate`
  // Default = `17`
  // Type = `int`
  // Config Var = `diag_min_estimate`
  @get:JsonGetter("diagMinEstimate")
  @set:JsonSetter("diagMinEstimate")
  var diagMinEstimate: Int

  //
  // `--path-cutoff`
  // Default = `0.92`
  // Type = `double`
  // Config Var = `path_cutoff`
  @get:JsonGetter("pathCutoff")
  @set:JsonSetter("pathCutoff")
  var pathCutoff: Double

  //
  // `--sw`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_smith_waterman`
  @get:JsonGetter("useSmithWaterman")
  @set:JsonSetter("useSmithWaterman")
  var useSmithWaterman: Boolean

  //
  // `--superblock`
  // Default = `128`
  // Type = `int`
  // Config Var = `superblock`
  @get:JsonGetter("superblock")
  @set:JsonSetter("superblock")
  var superblock: Int

  //
  // `--max-cells`
  // Default = `10000000u`
  // Type = `unsigned`
  // Config Var = `max_cells`
  @get:JsonGetter("maxCells")
  @set:JsonSetter("maxCells")
  var maxCells: UInt

  //
  // `--load-balancing`
  // Default = `(unsigned)Config::query_parallel`
  // Type = `unsigned`
  // Config Var = `load_balancing`
  @get:JsonGetter("loadBalancing")
  @set:JsonSetter("loadBalancing")
  var loadBalancing: UInt

  //
  // `--log-query`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_query`
  @get:JsonGetter("logQuery")
  @set:JsonSetter("logQuery")
  var logQuery: Boolean

  //
  // `--log-subject`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_subject`
  @get:JsonGetter("logSubject")
  @set:JsonSetter("logSubject")
  var logSubject: Boolean

  //
  // `--palign`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `threads_align`
  @get:JsonGetter("palign")
  @set:JsonSetter("palign")
  var palign: UInt

  //
  // `--score-ratio`
  // Default = `0.9`
  // Type = `double`
  // Config Var = `score_ratio`
  @get:JsonGetter("scoreRatio")
  @set:JsonSetter("scoreRatio")
  var scoreRatio: Double

  // trace point fetch size
  // `--fetch-size`
  // Default = `4096u`
  // Type = `unsigned`
  // Config Var = `fetch_size`
  @get:JsonGetter("fetchSize")
  @set:JsonSetter("fetchSize")
  var fetchSize: UInt

  // number of target sequences to fetch for seed extension
  // `--target-fetch-size`
  // Default = `4u`
  // Type = `unsigned`
  // Config Var = `target_fetch_size`
  @get:JsonGetter("targetFetchSize")
  @set:JsonSetter("targetFetchSize")
  var targetFetchSize: UInt

  //
  // `--rank-factor`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `rank_factor`
  @get:JsonGetter("rankFactor")
  @set:JsonSetter("rankFactor")
  var rankFactor: Double

  //
  // `--transcript-len-estimate`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `transcript_len_estimate`
  @get:JsonGetter("transcriptLenEstimate")
  @set:JsonSetter("transcriptLenEstimate")
  var transcriptLenEstimate: Double

  //
  // `--family-counts`
  // Default = ``
  // Type = `string`
  // Config Var = `family_counts_file`
  @get:JsonGetter("familyCountsFile")
  @set:JsonSetter("familyCountsFile")
  var familyCountsFile: Path

  //
  // `--radix-cluster-buffered`
  // Default = ``
  // Type = `bool`
  // Config Var = `radix_cluster_buffered`
  @get:JsonGetter("radixClusterBuffered")
  @set:JsonSetter("radixClusterBuffered")
  var radixClusterBuffered: Boolean

  //
  // `--join-split-size`
  // Default = `100000u`
  // Type = `unsigned`
  // Config Var = `join_split_size`
  @get:JsonGetter("joinSplitSize")
  @set:JsonSetter("joinSplitSize")
  var joinSplitSize: UInt

  //
  // `--join-split-key-len`
  // Default = `17u`
  // Type = `unsigned`
  // Config Var = `join_split_key_len`
  @get:JsonGetter("joinSplitKeyLen")
  @set:JsonSetter("joinSplitKeyLen")
  var joinSplitKeyLen: UInt

  //
  // `--radix-bits`
  // Default = `8u`
  // Type = `unsigned`
  // Config Var = `radix_bits`
  @get:JsonGetter("radixBits")
  @set:JsonSetter("radixBits")
  var radixBits: UInt // TODO: should this be capped/enum'd?

  //
  // `--join-ht-factor`
  // Default = `1.3`
  // Type = `double`
  // Config Var = `join_ht_factor`
  @get:JsonGetter("joinHTFactor")
  @set:JsonSetter("joinHTFactor")
  var joinHTFactor: Double

  //
  // `--sort-join`
  // Default = ``
  // Type = `bool`
  // Config Var = `sort_join`
  @get:JsonGetter("sortJoin")
  @set:JsonSetter("sortJoin")
  var sortJoin: Boolean

  //
  // `--simple-freq`
  // Default = ``
  // Type = `bool`
  // Config Var = `simple_freq`
  @get:JsonGetter("simpleFreq")
  @set:JsonSetter("simpleFreq")
  var simpleFreq: Boolean

  //
  // `--freq-treshold` // TYPO: This typo exists in the diamond cli source.
  // Default = ``
  // Type = `double`
  // Config Var = `freq_treshold`
  @get:JsonGetter("freqThreshold")
  @set:JsonSetter("freqThreshold")
  var freqThreshold: Double

  //
  // `--use-dataset-field`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_dataset_field`
  @get:JsonGetter("useDatasetField")
  @set:JsonSetter("useDatasetField")
  var useDatasetField: Boolean

  //
  // `--store-query-quality`
  // Default = ``
  // Type = `bool`
  // Config Var = `store_query_quality`
  @get:JsonGetter("storeQueryQuality")
  @set:JsonSetter("storeQueryQuality")
  var storeQueryQuality: Boolean

  //
  // `--swipe-chunk-size`
  // Default = `256u`
  // Type = `unsigned`
  // Config Var = `swipe_chunk_size`
  @get:JsonGetter("swipeChunkSize")
  @set:JsonSetter("swipeChunkSize")
  var swipeChunkSize: UInt

  //
  // `--hard-masked`
  // Default = ``
  // Type = `bool`
  // Config Var = `hardmasked`
  @get:JsonGetter("hardMasked")
  @set:JsonSetter("hardMasked")
  var hardMasked: Boolean

  //
  // `--cbs-window`
  // Default = `40`
  // Type = `int`
  // Config Var = `cbs_window`
  @get:JsonGetter("cbsWindow")
  @set:JsonSetter("cbsWindow")
  var cbsWindow: Int

  //
  // `--no-dict`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_dict`
  @get:JsonGetter("noDict")
  @set:JsonSetter("noDict")
  var noDict: Boolean

  //
  // `--upgma-edge-limit`
  // Default = `(uint64_t)10000000`
  // Type = `uint64_t`
  // Config Var = `upgma_edge_limit`
  @get:JsonGetter("upGmaEdgeLimit")
  @set:JsonSetter("upGmaEdgeLimit")
  var upGmaEdgeLimit: ULong

  //
  // `--tree`
  // Default = ``
  // Type = `string`
  // Config Var = `tree_file`
  @get:JsonGetter("tree")
  @set:JsonSetter("tree")
  var tree: Path

  //
  // `--upgma-dist`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_dist`
  @get:JsonGetter("upGmaDist")
  @set:JsonSetter("upGmaDist")
  var upGmaDist: String // TODO: what is this?

  //
  // `--upgma-input`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_input`
  @get:JsonGetter("upGmaInput")
  @set:JsonSetter("upGmaInput")
  var upGmaInput: String // TODO: what is this?

  //
  // `--log-extend`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_extend`
  @get:JsonGetter("logExtend")
  @set:JsonSetter("logExtend")
  var logExtend: Boolean

  //
  // `--chaining-maxgap`
  // Default = `2000`
  // Type = `int`
  // Config Var = `chaining_maxgap`
  @get:JsonGetter("chainingMaxGap")
  @set:JsonSetter("chainingMaxGap")
  var chainingMaxGap: Int

  // maximum tandem repeat period to consider (50)
  // `--tantan-maxRepeatOffset` // TODO: the caps are in the diamond cli source, are flag strings case sensitive?
  // Default = `15`
  // Type = `int`
  // Config Var = `tantan_maxRepeatOffset`
  @get:JsonGetter("tantanMaxRepeatOffset")
  @set:JsonSetter("tantanMaxRepeatOffset")
  var tantanMaxRepeatOffset: Int

  // use tantan masking in ungapped mode
  // `--tantan-ungapped`
  // Default = ``
  // Type = `bool`
  // Config Var = `tantan_ungapped`
  @get:JsonGetter("tantanUngapped")
  @set:JsonSetter("tantanUngapped")
  var tantanUngapped: Boolean

  //
  // `--chaining-range-cover`
  // Default = `(size_t)8`
  // Type = `size_t`
  // Config Var = `chaining_range_cover`
  @get:JsonGetter("chainingRangeCover")
  @set:JsonSetter("chainingRangeCover")
  var chainingRangeCover: ULong

  //
  // `--no-swipe-realign`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_swipe_realign`
  @get:JsonGetter("noSwipeRealign")
  @set:JsonSetter("noSwipeRealign")
  var noSwipeRealign: Boolean

  //
  // `--chaining-maxnodes`
  // Default = ``
  // Type = `size_t`
  // Config Var = `chaining_maxnodes`
  @get:JsonGetter("chainingMaxNodes")
  @set:JsonSetter("chainingMaxNodes")
  var chainingMaxNodes: ULong

  //
  // `--cutoff-score-8bit`
  // Default = `240`
  // Type = `int`
  // Config Var = `cutoff_score_8bit`
  @get:JsonGetter("cutoffScore8Bit")
  @set:JsonSetter("cutoffScore8Bit")
  var cutoffScore8Bit: Int // TODO: is this supposed to be limited to 8 bits?

  //
  // `--min-band-overlap`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `min_band_overlap`
  @get:JsonGetter("minBandOverlap")
  @set:JsonSetter("minBandOverlap")
  var minBandOverlap: Double

  //
  // `--min-realign-overhang`
  // Default = `30`
  // Type = `int`
  // Config Var = `min_realign_overhang`
  @get:JsonGetter("minRealignOverhang")
  @set:JsonSetter("minRealignOverhang")
  var minRealignOverhang: Int

  //
  // `--ungapped-window`
  // Default = `48`
  // Type = `int`
  // Config Var = `ungapped_window`
  @get:JsonGetter("ungappedWindow")
  @set:JsonSetter("ungappedWindow")
  var ungappedWindow: Int

  //
  // `--gapped-filter-diag-score`
  // Default = `12.0`
  // Type = `double`
  // Config Var = `gapped_filter_diag_bit_score`
  @get:JsonGetter("gappedFilterDiagBitScore")
  @set:JsonSetter("gappedFilterDiagBitScore")
  var gappedFilterDiagBitScore: Double

  //
  // `--gapped-filter-window`
  // Default = `200`
  // Type = `int`
  // Config Var = `gapped_filter_window`
  @get:JsonGetter("gappedFilterWindow")
  @set:JsonSetter("gappedFilterWindow")
  var gappedFilterWindow: Int

  //
  // `--output-hits`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_hits`
  @get:JsonGetter("outputHits")
  @set:JsonSetter("outputHits")
  var outputHits: Boolean

  //
  // `--ungapped-evalue`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_`
  @get:JsonGetter("ungappedEValue")
  @set:JsonSetter("ungappedEValue")
  var ungappedEValue: Double

  //
  // `--ungapped-evalue-short`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_short_`
  @get:JsonGetter("ungappedEValueShort")
  @set:JsonSetter("ungappedEValueShort")
  var ungappedEValueShort: Double

  //
  // `--no-logfile`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_logfile`
  @get:JsonGetter("noLogFile")
  @set:JsonSetter("noLogFile")
  var noLogFile: Boolean

  //
  // `--band-bin`
  // Default = `24`
  // Type = `int`
  // Config Var = `band_bin`
  @get:JsonGetter("bandBin")
  @set:JsonSetter("bandBin")
  var bandBin: Int

  //
  // `--col-bin`
  // Default = `400`
  // Type = `int`
  // Config Var = `col_bin`
  @get:JsonGetter("colBin")
  @set:JsonSetter("colBin")
  var colBin: Int

  //
  // `--self`
  // Default = ``
  // Type = `bool`
  // Config Var = `self`
  @get:JsonGetter("self")
  @set:JsonSetter("self")
  var self: Boolean

  //
  // `--trace-pt-fetch-size`
  // Default = `(int64_t)10e9`
  // Type = `int64_t`
  // Config Var = `trace_pt_fetch_size`
  @get:JsonGetter("tracePtFetchSize")
  @set:JsonSetter("tracePtFetchSize")
  var tracePtFetchSize: Long

  //
  // `--tile-size`
  // Default = `(uint32_t)1024`
  // Type = `uint32_t`
  // Config Var = `tile_size`
  @get:JsonGetter("tileSize")
  @set:JsonSetter("tileSize")
  var tileSize: UInt

  //
  // `--short-query-ungapped-bitscore`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `short_query_ungapped_bitscore`
  @get:JsonGetter("shortQueryUngappedBitScore")
  @set:JsonSetter("shortQueryUngappedBitScore")
  var shortQueryUngappedBitScore: Double

  //
  // `--short-query-max-len`
  // Default = `60`
  // Type = `int`
  // Config Var = `short_query_max_len`
  @get:JsonGetter("shortQueryMaxLen")
  @set:JsonSetter("shortQueryMaxLen")
  var shortQueryMaxLen: Int

  //
  // `--gapped-filter-evalue1`
  // Default = `2000.0`
  // Type = `double`
  // Config Var = `gapped_filter_evalue1`
  @get:JsonGetter("gappedFilterEValue1")
  @set:JsonSetter("gappedFilterEValue1")
  var gappedFilterEValue1: Double

  //
  // `--ext-yield`
  // Default = ``
  // Type = `double`
  // Config Var = `ext_min_yield`
  @get:JsonGetter("extYield")
  @set:JsonSetter("extYield")
  var extYield: Double

  //
  // `--full-sw-len`
  // Default = ``
  // Type = `int`
  // Config Var = `full_sw_len`
  @get:JsonGetter("fullSwLen")
  @set:JsonSetter("fullSwLen")
  var fullSwLen: Int

  //
  // `--relaxed-evalue-factor`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `relaxed_evalue_factor`
  @get:JsonGetter("relaxedEValueFactor")
  @set:JsonSetter("relaxedEValueFactor")
  var relaxedEValueFactor: Double

  //
  // `--type`
  // Default = ``
  // Type = `string`
  // Config Var = `type`
  @get:JsonGetter("type")
  @set:JsonSetter("type")
  var type: String // TODO: what is this?

  //
  // `--raw`
  // Default = ``
  // Type = `bool`
  // Config Var = `raw`
  @get:JsonGetter("raw")
  @set:JsonSetter("raw")
  var raw: Boolean

  //
  // `--chaining-len-cap`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `chaining_len_cap`
  @get:JsonGetter("chainingLenCap")
  @set:JsonSetter("chainingLenCap")
  var chainingLenCap: Double

  //
  // `--chaining-min-nodes`
  // Default = `(size_t)200`
  // Type = `size_t`
  // Config Var = `chaining_min_nodes`
  @get:JsonGetter("chainingMinNodes")
  @set:JsonSetter("chainingMinNodes")
  var chainingMinNodes: ULong

  //
  // `--fast-tsv`
  // Default = ``
  // Type = `bool`
  // Config Var = `fast_tsv`
  @get:JsonGetter("fastTsv")
  @set:JsonSetter("fastTsv")
  var fastTsv: Boolean

  //
  // `--target-parallel-verbosity`
  // Default = `UINT_MAX`  // TODO: unsure if a default should be specified for this in flag form.  In practice, this should always be 4294967295, but this may be system dependent?
  // Type = `unsigned`
  // Config Var = `target_parallel_verbosity`
  @get:JsonGetter("targetParallelVerbosity")
  @set:JsonSetter("targetParallelVerbosity")
  var targetParallelVerbosity: UInt

  //
  // `--query-memory`
  // Default = ``
  // Type = `bool`
  // Config Var = `query_memory`
  @get:JsonGetter("queryMemory")
  @set:JsonSetter("queryMemory")
  var queryMemory: Boolean

  //
  // `--memory-intervals`
  // Default = `(size_t)2`
  // Type = `size_t`
  // Config Var = `memory_intervals`
  @get:JsonGetter("memoryIntervals")
  @set:JsonSetter("memoryIntervals")
  var memoryIntervals: ULong

  //
  // `--seed-hit-density`
  // Default = ``
  // Type = `size_t`
  // Config Var = `seedhit_density`
  @get:JsonGetter("seedHitDensity")
  @set:JsonSetter("seedHitDensity")
  var seedHitDensity: ULong

  //
  // `--chunk-size-multiplier`
  // Default = `(size_t)4`
  // Type = `size_t`
  // Config Var = `chunk_size_multiplier`
  @get:JsonGetter("chunkSizeMultiplier")
  @set:JsonSetter("chunkSizeMultiplier")
  var chunkSizeMultiplier: ULong

  //
  // `--score-drop-factor`
  // Default = `0.95`
  // Type = `double`
  // Config Var = `ranking_score_drop_factor`
  @get:JsonGetter("rankingScoreDropFactor")
  @set:JsonSetter("rankingScoreDropFactor")
  var rankingScoreDropFactor: Double

  //
  // `--left-most-interval`
  // Default = `32`
  // Type = `int`
  // Config Var = `left_most_interval`
  @get:JsonGetter("leftMostInterval")
  @set:JsonSetter("leftMostInterval")
  var leftMostInterval: Int

  //
  // `--ranking-cutoff-bitscore`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `ranking_cutoff_bitscore`
  @get:JsonGetter("rankingCutoffBitScore")
  @set:JsonSetter("rankingCutoffBitScore")
  var rankingCutoffBitScore: Double

  //
  // `--no-forward-fp`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_forward_fp`
  @get:JsonGetter("noForwardFp")
  @set:JsonSetter("noForwardFp")
  var noForwardFp: Boolean

  //
  // `--no-ref-masking`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_ref_masking`
  @get:JsonGetter("noRefMasking")
  @set:JsonSetter("noRefMasking")
  var noRefMasking: Boolean

  //
  // `--target-bias`
  // Default = ``
  // Type = `bool`
  // Config Var = `target_bias`
  @get:JsonGetter("targetBias")
  @set:JsonSetter("targetBias")
  var targetBias: Boolean

  //
  // `--output-fp`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_fp`
  @get:JsonGetter("outputFp")
  @set:JsonSetter("outputFp")
  var outputFp: Boolean

  //
  // `--family-cap`
  // Default = ``
  // Type = `int`
  // Config Var = `family_cap`
  @get:JsonGetter("familyCap")
  @set:JsonSetter("familyCap")
  var familyCap: Int

  //
  // `--cbs-matrix-scale`
  // Default = `1`
  // Type = `int`
  // Config Var = `cbs_matrix_scale`
  @get:JsonGetter("cbsMatrixScale")
  @set:JsonSetter("cbsMatrixScale")
  var cbsMatrixScale: Int

  //
  // `--query-count`
  // Default = `(size_t)1`
  // Type = `size_t`
  // Config Var = `query_count`
  @get:JsonGetter("queryCount")
  @set:JsonSetter("queryCount")
  var queryCount: ULong

  //
  // `--cbs-angle`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `cbs_angle`
  @get:JsonGetter("cbsAngle")
  @set:JsonSetter("cbsAngle")
  var cbsAngle: Double

  //
  // `--cbs-err-tolerance`
  // Default = `0.00000001`
  // Type = `double`
  // Config Var = `cbs_err_tolerance`
  @get:JsonGetter("cbsErrTolerance")
  @set:JsonSetter("cbsErrTolerance")
  var cbsErrTolerance: Double

  //
  // `--cbs-it-limit`
  // Default = `2000`
  // Type = `int`
  // Config Var = `cbs_it_limit`
  @get:JsonGetter("cbsItLimit")
  @set:JsonSetter("cbsItLimit")
  var cbsItLimit: Int

  //
  // `--hash_join_swap`
  // Default = ``
  // Type = `bool`
  // Config Var = `hash_join_swap`
  @get:JsonGetter("hashJoinSwap")
  @set:JsonSetter("hashJoinSwap")
  var hashJoinSwap: Boolean

  //
  // `--deque_bucket_size`
  // Default = `(size_t)524288`
  // Type = `size_t`
  // Config Var = `deque_bucket_size`
  @get:JsonGetter("dequeBucketSize")
  @set:JsonSetter("dequeBucketSize")
  var dequeBucketSize: ULong

  //
  // `--query-match-distance-threshold`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `query_match_distance_threshold`
  @get:JsonGetter("queryMatchDistanceThreshold")
  @set:JsonSetter("queryMatchDistanceThreshold")
  var queryMatchDistanceThreshold: Double

  //
  // `--length-ratio-threshold`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `length_ratio_threshold`
  @get:JsonGetter("lengthRatioThreshold")
  @set:JsonSetter("lengthRatioThreshold")
  var lengthRatioThreshold: Double

  //
  // `--max-swipe-dp`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `max_swipe_dp`
  @get:JsonGetter("maxSwipeDp")
  @set:JsonSetter("maxSwipeDp")
  var maxSwipeDp: Long

  //
  // `--short-seqids`
  // Default = ``
  // Type = `bool`
  // Config Var = `short_seqids`
  @get:JsonGetter("shortSeqIDs")
  @set:JsonSetter("shortSeqIDs")
  var shortSeqIDs: Boolean

  //
  // `--no-reextend`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reextend`
  @get:JsonGetter("noReextend")
  @set:JsonSetter("noReextend")
  var noReextend: Boolean

  //
  // `--no-reorder`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reorder`
  @get:JsonGetter("noReorder")
  @set:JsonSetter("noReorder")
  var noReorder: Boolean

  //
  // `--file1`
  // Default = ``
  // Type = `string`
  // Config Var = `file1`
  @get:JsonGetter("file1")
  @set:JsonSetter("file1")
  var file1: String // TODO: me thinks this might need to be Path

  //
  // `--file2`
  // Default = ``
  // Type = `string`
  // Config Var = `file2`
  @get:JsonGetter("file2")
  @set:JsonSetter("file2")
  var file2: String // TODO: me thinks this might need to be Path

  //
  // `--key2`
  // Default = ``
  // Type = `size_t`
  // Config Var = `key2`
  @get:JsonGetter("key2")
  @set:JsonSetter("key2")
  var key2: ULong

  //
  // `--motif-mask-file`
  // Default = ``
  // Type = `string`
  // Config Var = `motif_mask_file`
  @get:JsonGetter("motifMaskFile")
  @set:JsonSetter("motifMaskFile")
  var motifMaskFile: String // TODO: me thinks this might need to be Path

  //
  // `--max-motif-len`
  // Default = `30`
  // Type = `Loc -> int32_t`
  // Config Var = `max_motif_len`
  @get:JsonGetter("maxMotifLen")
  @set:JsonSetter("maxMotifLen")
  var maxMotifLen: Int

  //
  // `--chaining-stacked-hsp-ratio`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `chaining_stacked_hsp_ratio`
  @get:JsonGetter("chainingStackedHSPRatio")
  @set:JsonSetter("chainingStackedHSPRatio")
  var chainingStackedHSPRatio: Double

  //
  // `--swipe-task-size`
  // Default = `(int64_t)100000000`
  // Type = `int64_t`
  // Config Var = `swipe_task_size`
  @get:JsonGetter("swipeTaskSize")
  @set:JsonSetter("swipeTaskSize")
  var swipeTaskSize: Long

  //
  // `--minimizer-window`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `minimizer_window_`
  @get:JsonGetter("minimizerWindow")
  @set:JsonSetter("minimizerWindow")
  var minimizerWindow: Int

  //
  // `--min_task_trace_pts`
  // Default = `(int64_t)1024`
  // Type = `int64_t`
  // Config Var = `min_task_trace_pts`
  @get:JsonGetter("minTaskTracePts")
  @set:JsonSetter("minTaskTracePts")
  var minTaskTracePts: Long

  //
  // `--sketch-size`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `sketch_size`
  @get:JsonGetter("sketchSize")
  @set:JsonSetter("sketchSize")
  var sketchSize: Int

  //
  // `--oid-list`
  // Default = ``
  // Type = `string`
  // Config Var = `oid_list`
  @get:JsonGetter("oidList")
  @set:JsonSetter("oidList")
  var oidList: String // TODO: what is this

  //
  // `--bootstrap-block`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `bootstrap_block`
  @get:JsonGetter("bootstrapBlock")
  @set:JsonSetter("bootstrapBlock")
  var bootstrapBlock: Long

  //
  // `--centroid-factor`
  // Default = `(int64_t)3`
  // Type = `int64_t`
  // Config Var = `centroid_factor`
  @get:JsonGetter("centroidFactor")
  @set:JsonSetter("centroidFactor")
  var centroidFactor: Long

  //
  // `--timeout`
  // Default = ``
  // Type = `int`
  // Config Var = `timeout`
  @get:JsonGetter("timeout")
  @set:JsonSetter("timeout")
  var timeout: Int

  //
  // `--resume`
  // Default = ``
  // Type = `string`
  // Config Var = `resume`
  @get:JsonGetter("resume")
  @set:JsonSetter("resume")
  var resume: String // TODO: what is this?

  //
  // `--target_hard_cap`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `target_hard_cap`
  @get:JsonGetter("targetHardCap")
  @set:JsonSetter("targetHardCap")
  var targetHardCap: Long

  //
  // `--mapany`  // map any?
  // Default = ``
  // Type = `bool`
  // Config Var = `mapany`
  @get:JsonGetter("mapAny")
  @set:JsonSetter("mapAny")
  var mapAny: Boolean

  //
  // `--neighbors`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `neighbors`
  @get:JsonGetter("neighbors")
  @set:JsonSetter("neighbors")
  var neighbors: String // TODO: what is this?

  //
  // `--reassign-overlap`
  // Default = `0.3`
  // Type = `double`
  // Config Var = `reassign_overlap`
  @get:JsonGetter("reassignOverlap")
  @set:JsonSetter("reassignOverlap")
  var reassignOverlap: Double

  //
  // `--reassign-ratio`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `reassign_ratio`
  @get:JsonGetter("reassignRatio")
  @set:JsonSetter("reassignRatio")
  var reassignRatio: Double

  //
  // `--reassign-max`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `reassign_max`
  @get:JsonGetter("reassignMax")
  @set:JsonSetter("reassignMax")
  var reassignMax: Long

  //
  // `--add-self-aln`
  // Default = ``
  // Type = `bool`
  // Config Var = `add_self_aln`
  @get:JsonGetter("addSelfAln")
  @set:JsonSetter("addSelfAln")
  var addSelfAln: Boolean

  //
  // `--weighted-gvc`
  // Default = ``
  // Type = `bool`
  // Config Var = `weighted_gvc`
  @get:JsonGetter("weightedGVC")
  @set:JsonSetter("weightedGVC")
  var weightedGVC: Boolean

  //
  // `--hamming-ext`
  // Default = ``
  // Type = `bool`
  // Config Var = `hamming_ext`
  @get:JsonGetter("hammingExt")
  @set:JsonSetter("hammingExt")
  var hammingExt: Boolean

  //
  // `--diag-filter-id`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_id`
  @get:JsonGetter("diagFilterID")
  @set:JsonSetter("diagFilterID")
  var diagFilterID: Double

  //
  // `--diag-filter-cov`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_cov`
  @get:JsonGetter("diagFilterCov")
  @set:JsonSetter("diagFilterCov")
  var diagFilterCov: Double

  //
  // `--strict-gvc`
  // Default = ``
  // Type = `bool`
  // Config Var = `strict_gvc`
  @get:JsonGetter("strictGVC")
  @set:JsonSetter("strictGVC")
  var strictGVC: Boolean

  // type of sequences in database file (nucl/prot)
  // `--dbtype`
  // Default = `string("prot")`
  // Type = `string`
  // Config Var = `dbstring`
  @get:JsonGetter("dbType")
  @set:JsonSetter("dbType")
  var dbType: String // TODO: enum this

  // Clustering similarity measure (default='normalized_bitscore_global')
  // `--cluster-similarity`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_similarity`
  @get:JsonGetter("clusterSimilarity")
  @set:JsonSetter("clusterSimilarity")
  var clusterSimilarity: String // TODO: enum this

  // Threshold for the similarity measure (default=50%)
  // `--cluster-threshold`
  // Default = ``
  // Type = `Option<double>`
  // Config Var = `cluster_threshold`
  @get:JsonGetter("clusterThreshold")
  @set:JsonSetter("clusterThreshold")
  var clusterThreshold: Double

  // Filename for dumping the graph or reading the graph if cluster-restart
  // `--cluster-graph-file`
  // Default = ``
  // Type = `string`
  // Config Var = `cluster_graph_file`
  @get:JsonGetter("clusterGraphFile")
  @set:JsonSetter("clusterGraphFile")
  var clusterGraphFile: Path

  // Restart clustering from dumped graph
  // `--cluster-restart`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_restart`
  @get:JsonGetter("clusterRestart")
  @set:JsonSetter("clusterRestart")
  var clusterRestart: Boolean

  // MCL expansion coefficient (default=2)
  // `--mcl-expansion`
  // Default = `(uint32_t)2`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_expansion`
  @get:JsonGetter("mclExpansion")
  @set:JsonSetter("mclExpansion")
  var mclExpansion: UInt

  // MCL inflation coefficient (default=2.0)
  // `--mcl-inflation`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `cluster_mcl_inflation`
  @get:JsonGetter("mclInflation")
  @set:JsonSetter("mclInflation")
  var mclInflation: Double

  // MCL chunk size per thread (default=100)
  // `--mcl-chunk-size`
  // Default = `(uint32_t)1`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_chunk_size`
  @get:JsonGetter("mclChunkSize")
  @set:JsonSetter("mclChunkSize")
  var mclChunkSize: UInt

  // MCL maximum iterations (default=100)
  // `--mcl-max-iterations`
  // Default = `(uint32_t)100`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_max_iter`
  @get:JsonGetter("mclMaxIterations")
  @set:JsonSetter("mclMaxIterations")
  var mclMaxIterations: UInt

  // MCL switch to sparse matrix computation (default=0.8)
  // `--mcl-sparsity-switch`
  // Default = `0.8`
  // Type = `double`
  // Config Var = `cluster_mcl_sparsity_switch`
  @get:JsonGetter("mclSparsitySwitch")
  @set:JsonSetter("mclSparsitySwitch")
  var mclSparsitySwitch: Double

  // Do not symmetrize the transistion matrix before clustering
  // `--mcl-nonsymmetric`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_nonsymmetric`
  @get:JsonGetter("mclNonSymmetric")
  @set:JsonSetter("mclNonSymmetric")
  var mclNonSymmetric: Boolean

  // Some stats about the connected components in MCL
  // `--mcl-stats`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_stats`
  @get:JsonGetter("mclStats")
  @set:JsonSetter("mclStats")
  var mclStats: Boolean

  // Clustering algorithm ('mcl')
  // `--cluster-algo`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_algo`
  @get:JsonGetter("clusterAlgo")
  @set:JsonSetter("clusterAlgo")
  var clusterAlgo: String // TODO: enum this

  //
  // `--approx-backtrace`
  // Default = ``
  // Type = `bool`
  // Config Var = `approx_backtrace`
  @get:JsonGetter("approxBacktrace")
  @set:JsonSetter("approxBacktrace")
  var approxBacktrace: Boolean

  //
  // `--prefix-scan`
  // Default = ``
  // Type = `bool`
  // Config Var = `prefix_scan`
  @get:JsonGetter("prefixScan")
  @set:JsonSetter("prefixScan")
  var prefixScan: Boolean

  //
  // `--narrow-band-cov`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_cov`
  @get:JsonGetter("narrowBandCov")
  @set:JsonSetter("narrowBandCov")
  var narrowBandCov: Double

  //
  // `--narrow-band-factor`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_factor`
  @get:JsonGetter("narrowBandFactor")
  @set:JsonSetter("narrowBandFactor")
  var narrowBandFactor: Double

  //
  // `--anchor-window`
  // Default = `12`
  // Type = `Loc -> int32_t`
  // Config Var = `anchor_window`
  @get:JsonGetter("anchorWindow")
  @set:JsonSetter("anchorWindow")
  var anchorWindow: Int

  //
  // `--anchor-score`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `anchor_score`
  @get:JsonGetter("anchorScore")
  @set:JsonSetter("anchorScore")
  var anchorScore: Double

  //
  // `--classic-band`
  // Default = ``
  // Type = `boolean`
  // Config Var = `classic_band`
  @get:JsonGetter("classicBand")
  @set:JsonSetter("classicBand")
  var classicBand: Boolean

  //
  // `--no_8bit_extension`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_8bit_extension`
  @get:JsonGetter("no8BitExtension")
  @set:JsonSetter("no8BitExtension")
  var no8BitExtension: Boolean

  //
  // `--anchored-swipe`
  // Default = ``
  // Type = `bool`
  // Config Var = `anchored_swipe`
  @get:JsonGetter("anchoredSwipe")
  @set:JsonSetter("anchoredSwipe")
  var anchoredSwipe: Boolean

  //
  // `--no_chaining_merge_hsps`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_chaining_merge_hsps`
  @get:JsonGetter("noChainingMergeHSPs")
  @set:JsonSetter("noChainingMergeHSPs")
  var noChainingMergeHSPs: Boolean

  //
  // `--pipeline-short`
  // Default = ``
  // Type = `bool`
  // Config Var = `pipeline_short`
  @get:JsonGetter("pipelineShort")
  @set:JsonSetter("pipelineShort")
  var pipelineShort: Boolean

  //
  // `--graph-algo`
  // Default = `string("gvc")`
  // Type = `string`
  // Config Var = `graph_algo`
  @get:JsonGetter("graphAlgo")
  @set:JsonSetter("graphAlgo")
  var graphAlgo: String // TODO: enum this

  //
  // `--tsv-read-size`
  // Default = `int64_t(GIGABYTES)` // 1073741824
  // Type = `int64_t`
  // Config Var = `tsv_read_size`
  @get:JsonGetter("tsvReadSize")
  @set:JsonSetter("tsvReadSize")
  var tsvReadSize: Long

  //
  // `--min-len-ratio`
  // Default = ``
  // Type = `double`
  // Config Var = `min_length_ratio`
  @get:JsonGetter("minLenRatio")
  @set:JsonSetter("minLenRatio")
  var minLenRatio: Double

  //
  // `--max-indirection`
  // Default = ``
  // Type = `int`
  // Config Var = `max_indirection`
  @get:JsonGetter("maxIndirection")
  @set:JsonSetter("maxIndirection")
  var maxIndirection: Int

  //
  // `--aln-out`
  // Default = ``
  // Type = `string`
  // Config Var = `aln_out`
  @get:JsonGetter("alnOut")
  @set:JsonSetter("alnOut")
  var alnOut: String // TODO: what is this?
}
