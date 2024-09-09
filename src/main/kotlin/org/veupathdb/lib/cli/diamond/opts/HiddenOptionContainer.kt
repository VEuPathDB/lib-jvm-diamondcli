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
import io.foxcapades.lib.cli.wrapper.meta.CliFlag
import org.veupathdb.lib.cli.diamond.DiamondHidden
import java.nio.file.Path

// THIS IS ONLY USED WHEN COMPILED WITH 'EXTRA' AND IT IS UNCLEAR WHAT FLAG GOES
// WITH WHAT COMMAND.  ADD A GENERAL WARNING TO ALL PROPERTIES IN THIS TYPE!
interface HiddenOptionContainer {
  // ("match1", 0, "", match_file1) // unused in 2.1.9
  // ("match2", 0, "", match_file2) // unused in 2.1.9

  // maximum seed frequency
  // `--seed-freq`
  // Default = `-15.0`
  // Type = `double`
  // Config Var = `max_seed_freq`
  // TODO: potentially used by blastp/blastx
  @DiamondHidden
  @CliFlag("seed-freq")
  @get:JsonGetter("maximumSeedFrequency")
  @set:JsonSetter("maximumSeedFrequency")
  var maximumSeedFrequency: Double

  //
  // `--space-penalty`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `space_penalty`
  @DiamondHidden
  @CliFlag("space-penalty")
  @get:JsonGetter("spacePenalty")
  @set:JsonSetter("spacePenalty")
  var spacePenalty: Double

  //
  // `--reverse`
  // Default = ``
  // Type = `bool`
  // Config Var = `reverse`
  @DiamondHidden
  @CliFlag("reverse")
  @get:JsonGetter("reverse")
  @set:JsonSetter("reverse")
  var reverse: Boolean

  //
  // `--neighborhood-score`
  // Default = ``
  // Type = `int`
  // Config Var = `neighborhood_score`
  @DiamondHidden
  @CliFlag("neighborhood-score")
  @get:JsonGetter("neighborhoodScore")
  @set:JsonSetter("neighborhoodScore")
  var neighborhoodScore: Int

  //
  // `--seed-weight` | `-w`
  // Default = `7u`
  // Type = `unsigned`
  // Config Var = `seed_weight`
  @DiamondHidden
  @CliFlag("seed-weight", 'w')
  @get:JsonGetter("seedWeight")
  @set:JsonSetter("seedWeight")
  var seedWeight: UInt

  //
  // `--idl`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_left`
  @DiamondHidden
  @CliFlag("idl")
  @get:JsonGetter("idLeft")
  @set:JsonSetter("idLeft")
  var idLeft: UInt

  //
  // `--idr`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_right`
  @DiamondHidden
  @CliFlag("idr")
  @get:JsonGetter("idRight")
  @set:JsonSetter("idRight")
  var idRight: UInt

  //
  // `--idn`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_n`
  @DiamondHidden
  @CliFlag("idn")
  @get:JsonGetter("idN")
  @set:JsonSetter("idN")
  var idN: UInt

  //
  // `--bmatch`
  // Default = ``
  // Type = `int`
  // Config Var = `bmatch`
  @DiamondHidden
  @CliFlag("bmatch")
  @get:JsonGetter("bMatch")
  @set:JsonSetter("bMatch")
  var bMatch: Int

  //
  // `--bmismatch`
  // Default = ``
  // Type = `int`
  // Config Var = `bmismatch`
  @DiamondHidden
  @CliFlag("bmismatch")
  @get:JsonGetter("bMismatch")
  @set:JsonSetter("bMismatch")
  var bMismatch: Int

  //
  // `--bcutoff`
  // Default = ``
  // Type = `int`
  // Config Var = `bcutoff`
  @DiamondHidden
  @CliFlag("cutoff")
  @get:JsonGetter("bCutoff")
  @set:JsonSetter("bCutoff")
  var bCutoff: Int

  //
  // `--ants`
  // Default = `uint64_t(100)`
  // Type = `uint64_t`
  // Config Var = `n_ants`
  @DiamondHidden
  @CliFlag("ants")
  @get:JsonGetter("ants")
  @set:JsonSetter("ants")
  var ants: ULong

  //
  // `--rho`
  // Default = `0.99`
  // Type = `double`
  // Config Var = `rho`
  @DiamondHidden
  @CliFlag("rho")
  @get:JsonGetter("rho")
  @set:JsonSetter("rho")
  var rho: Double

  //
  // `--p_best`
  // Default = `0.05`
  // Type = `double`
  // Config Var = `p_best`
  @DiamondHidden
  @CliFlag("p_best")
  @get:JsonGetter("pBest")
  @set:JsonSetter("pBest")
  var pBest: Double

  //
  // `--d_exp`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_exp`
  @DiamondHidden
  @CliFlag("d_exp")
  @get:JsonGetter("dExp")
  @set:JsonSetter("dExp")
  var dExp: Double

  //
  // `--d_new`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_new`
  @DiamondHidden
  @CliFlag("d_new")
  @get:JsonGetter("dNew")
  @set:JsonSetter("dNew")
  var dNew: Double

  //
  // `--score-estimate-factor`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `score_estimate_factor`
  @DiamondHidden
  @CliFlag("score-estimate-factor")
  @get:JsonGetter("scoreEstimateFactor")
  @set:JsonSetter("scoreEstimateFactor")
  var scoreEstimateFactor: Double

  //
  // `--diag-min-estimate`
  // Default = `17`
  // Type = `int`
  // Config Var = `diag_min_estimate`
  @DiamondHidden
  @CliFlag("diag-min-estimate")
  @get:JsonGetter("diagMinEstimate")
  @set:JsonSetter("diagMinEstimate")
  var diagMinEstimate: Int

  //
  // `--path-cutoff`
  // Default = `0.92`
  // Type = `double`
  // Config Var = `path_cutoff`
  @DiamondHidden
  @CliFlag("path-cutoff")
  @get:JsonGetter("pathCutoff")
  @set:JsonSetter("pathCutoff")
  var pathCutoff: Double

  //
  // `--sw`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_smith_waterman`
  @DiamondHidden
  @CliFlag("sw")
  @get:JsonGetter("useSmithWaterman")
  @set:JsonSetter("useSmithWaterman")
  var useSmithWaterman: Boolean

  //
  // `--superblock`
  // Default = `128`
  // Type = `int`
  // Config Var = `superblock`
  @DiamondHidden
  @CliFlag("superblock")
  @get:JsonGetter("superblock")
  @set:JsonSetter("superblock")
  var superblock: Int

  //
  // `--max-cells`
  // Default = `10000000u`
  // Type = `unsigned`
  // Config Var = `max_cells`
  @DiamondHidden
  @CliFlag("max-cells")
  @get:JsonGetter("maxCells")
  @set:JsonSetter("maxCells")
  var maxCells: UInt

  //
  // `--load-balancing`
  // Default = `(unsigned)Config::query_parallel`
  // Type = `unsigned`
  // Config Var = `load_balancing`
  @DiamondHidden
  @CliFlag("load-balancing")
  @get:JsonGetter("loadBalancing")
  @set:JsonSetter("loadBalancing")
  var loadBalancing: UInt

  //
  // `--log-query`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_query`
  @DiamondHidden
  @CliFlag("log-query")
  @get:JsonGetter("logQuery")
  @set:JsonSetter("logQuery")
  var logQuery: Boolean

  //
  // `--log-subject`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_subject`
  @DiamondHidden
  @CliFlag("log-subject")
  @get:JsonGetter("logSubject")
  @set:JsonSetter("logSubject")
  var logSubject: Boolean

  //
  // `--palign`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `threads_align`
  @DiamondHidden
  @CliFlag("palign")
  @get:JsonGetter("pAlign")
  @set:JsonSetter("pAlign")
  var pAlign: UInt

  //
  // `--score-ratio`
  // Default = `0.9`
  // Type = `double`
  // Config Var = `score_ratio`
  @DiamondHidden
  @CliFlag("score-ratio")
  @get:JsonGetter("scoreRatio")
  @set:JsonSetter("scoreRatio")
  var scoreRatio: Double

  // trace point fetch size
  // `--fetch-size`
  // Default = `4096u`
  // Type = `unsigned`
  // Config Var = `fetch_size`
  @DiamondHidden
  @CliFlag("fetch-size")
  @get:JsonGetter("fetchSize")
  @set:JsonSetter("fetchSize")
  var fetchSize: UInt

  // number of target sequences to fetch for seed extension
  // `--target-fetch-size`
  // Default = `4u`
  // Type = `unsigned`
  // Config Var = `target_fetch_size`
  @DiamondHidden
  @CliFlag("target-fetch-size")
  @get:JsonGetter("targetFetchSize")
  @set:JsonSetter("targetFetchSize")
  var targetFetchSize: UInt

  //
  // `--rank-factor`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `rank_factor`
  @DiamondHidden
  @CliFlag("rank-factor")
  @get:JsonGetter("rankFactor")
  @set:JsonSetter("rankFactor")
  var rankFactor: Double

  //
  // `--transcript-len-estimate`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `transcript_len_estimate`
  @DiamondHidden
  @CliFlag("transcript-len-estimate")
  @get:JsonGetter("transcriptLenEstimate")
  @set:JsonSetter("transcriptLenEstimate")
  var transcriptLenEstimate: Double

  //
  // `--family-counts`
  // Default = ``
  // Type = `string`
  // Config Var = `family_counts_file`
  @DiamondHidden
  @CliFlag("family-counts")
  @get:JsonGetter("familyCountsFile")
  @set:JsonSetter("familyCountsFile")
  var familyCountsFile: Path

  //
  // `--radix-cluster-buffered`
  // Default = ``
  // Type = `bool`
  // Config Var = `radix_cluster_buffered`
  @DiamondHidden
  @CliFlag("radix-cluster-buffered")
  @get:JsonGetter("radixClusterBuffered")
  @set:JsonSetter("radixClusterBuffered")
  var radixClusterBuffered: Boolean

  //
  // `--join-split-size`
  // Default = `100000u`
  // Type = `unsigned`
  // Config Var = `join_split_size`
  @DiamondHidden
  @CliFlag("join-split-size")
  @get:JsonGetter("joinSplitSize")
  @set:JsonSetter("joinSplitSize")
  var joinSplitSize: UInt

  //
  // `--join-split-key-len`
  // Default = `17u`
  // Type = `unsigned`
  // Config Var = `join_split_key_len`
  @DiamondHidden
  @CliFlag("join-split-key-len")
  @get:JsonGetter("joinSplitKeyLen")
  @set:JsonSetter("joinSplitKeyLen")
  var joinSplitKeyLen: UInt

  //
  // `--radix-bits`
  // Default = `8u`
  // Type = `unsigned`
  // Config Var = `radix_bits`
  @DiamondHidden
  @CliFlag("radix-bits")
  @get:JsonGetter("radixBits")
  @set:JsonSetter("radixBits")
  var radixBits: UInt // TODO: should this be capped/enum'd?

  //
  // `--join-ht-factor`
  // Default = `1.3`
  // Type = `double`
  // Config Var = `join_ht_factor`
  @DiamondHidden
  @CliFlag("join-ht-factor")
  @get:JsonGetter("joinHTFactor")
  @set:JsonSetter("joinHTFactor")
  var joinHTFactor: Double

  //
  // `--sort-join`
  // Default = ``
  // Type = `bool`
  // Config Var = `sort_join`
  @DiamondHidden
  @CliFlag("sort-join")
  @get:JsonGetter("sortJoin")
  @set:JsonSetter("sortJoin")
  var sortJoin: Boolean

  //
  // `--simple-freq`
  // Default = ``
  // Type = `bool`
  // Config Var = `simple_freq`
  @DiamondHidden
  @CliFlag("simple-freq")
  @get:JsonGetter("simpleFreq")
  @set:JsonSetter("simpleFreq")
  var simpleFreq: Boolean

  //
  // `--freq-treshold` // TYPO: This typo exists in the diamond cli source.
  // Default = ``
  // Type = `double`
  // Config Var = `freq_treshold`
  @DiamondHidden
  @CliFlag("freq-treshold") // TYPO: This typo exists in the diamond cli source.
  @get:JsonGetter("freqThreshold")
  @set:JsonSetter("freqThreshold")
  var freqThreshold: Double

  //
  // `--use-dataset-field`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_dataset_field`
  @DiamondHidden
  @CliFlag("use-dataset-field")
  @get:JsonGetter("useDatasetField")
  @set:JsonSetter("useDatasetField")
  var useDatasetField: Boolean

  //
  // `--store-query-quality`
  // Default = ``
  // Type = `bool`
  // Config Var = `store_query_quality`
  @DiamondHidden
  @CliFlag("store-query-quality")
  @get:JsonGetter("storeQueryQuality")
  @set:JsonSetter("storeQueryQuality")
  var storeQueryQuality: Boolean

  //
  // `--swipe-chunk-size`
  // Default = `256u`
  // Type = `unsigned`
  // Config Var = `swipe_chunk_size`
  @DiamondHidden
  @CliFlag("swipe-chunk-size")
  @get:JsonGetter("swipeChunkSize")
  @set:JsonSetter("swipeChunkSize")
  var swipeChunkSize: UInt

  //
  // `--hard-masked`
  // Default = ``
  // Type = `bool`
  // Config Var = `hardmasked`
  @DiamondHidden
  @CliFlag("hard-masked")
  @get:JsonGetter("hardMasked")
  @set:JsonSetter("hardMasked")
  var hardMasked: Boolean

  //
  // `--cbs-window`
  // Default = `40`
  // Type = `int`
  // Config Var = `cbs_window`
  @DiamondHidden
  @CliFlag("cbs-window")
  @get:JsonGetter("cbsWindow")
  @set:JsonSetter("cbsWindow")
  var cbsWindow: Int

  //
  // `--no-dict`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_dict`
  @DiamondHidden
  @CliFlag("no-dict")
  @get:JsonGetter("noDict")
  @set:JsonSetter("noDict")
  var noDict: Boolean

  //
  // `--upgma-edge-limit`
  // Default = `(uint64_t)10000000`
  // Type = `uint64_t`
  // Config Var = `upgma_edge_limit`
  @DiamondHidden
  @CliFlag("upgma-edge-limit")
  @get:JsonGetter("upGmaEdgeLimit")
  @set:JsonSetter("upGmaEdgeLimit")
  var upGmaEdgeLimit: ULong

  //
  // `--tree`
  // Default = ``
  // Type = `string`
  // Config Var = `tree_file`
  @DiamondHidden
  @CliFlag("tree")
  @get:JsonGetter("tree")
  @set:JsonSetter("tree")
  var tree: Path

  //
  // `--upgma-dist`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_dist`
  @DiamondHidden
  @CliFlag("upgma-dist")
  @get:JsonGetter("upGmaDist")
  @set:JsonSetter("upGmaDist")
  var upGmaDist: String // TODO: what is this?

  //
  // `--upgma-input`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_input`
  @DiamondHidden
  @CliFlag("upgma-input")
  @get:JsonGetter("upGmaInput")
  @set:JsonSetter("upGmaInput")
  var upGmaInput: String // TODO: what is this?

  //
  // `--log-extend`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_extend`
  @DiamondHidden
  @CliFlag("log-extend")
  @get:JsonGetter("logExtend")
  @set:JsonSetter("logExtend")
  var logExtend: Boolean

  //
  // `--chaining-maxgap`
  // Default = `2000`
  // Type = `int`
  // Config Var = `chaining_maxgap`
  @DiamondHidden
  @CliFlag("chaining-maxgap")
  @get:JsonGetter("chainingMaxGap")
  @set:JsonSetter("chainingMaxGap")
  var chainingMaxGap: Int

  // maximum tandem repeat period to consider (50)
  // `--tantan-maxRepeatOffset` // TODO: the caps are in the diamond cli source, are flag strings case sensitive?
  // Default = `15`
  // Type = `int`
  // Config Var = `tantan_maxRepeatOffset`
  @DiamondHidden
  @CliFlag("tantan-maxRepeatOffset") // NOTE: Capitalization is present in DIAMOND CLI source code
  @get:JsonGetter("tantanMaxRepeatOffset")
  @set:JsonSetter("tantanMaxRepeatOffset")
  var tantanMaxRepeatOffset: Int

  // use tantan masking in ungapped mode
  // `--tantan-ungapped`
  // Default = ``
  // Type = `bool`
  // Config Var = `tantan_ungapped`
  @DiamondHidden
  @CliFlag("tantan-ungapped")
  @get:JsonGetter("tantanUngapped")
  @set:JsonSetter("tantanUngapped")
  var tantanUngapped: Boolean

  //
  // `--chaining-range-cover`
  // Default = `(size_t)8`
  // Type = `size_t`
  // Config Var = `chaining_range_cover`
  @DiamondHidden
  @CliFlag("chaining-range-cover")
  @get:JsonGetter("chainingRangeCover")
  @set:JsonSetter("chainingRangeCover")
  var chainingRangeCover: ULong

  //
  // `--no-swipe-realign`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_swipe_realign`
  @DiamondHidden
  @CliFlag("no-swipe-realign")
  @get:JsonGetter("noSwipeRealign")
  @set:JsonSetter("noSwipeRealign")
  var noSwipeRealign: Boolean

  //
  // `--chaining-maxnodes`
  // Default = ``
  // Type = `size_t`
  // Config Var = `chaining_maxnodes`
  @DiamondHidden
  @CliFlag("chaining-maxnodes")
  @get:JsonGetter("chainingMaxNodes")
  @set:JsonSetter("chainingMaxNodes")
  var chainingMaxNodes: ULong

  //
  // `--cutoff-score-8bit`
  // Default = `240`
  // Type = `int`
  // Config Var = `cutoff_score_8bit`
  @DiamondHidden
  @CliFlag("cutoff-score-8bit")
  @get:JsonGetter("cutoffScore8Bit")
  @set:JsonSetter("cutoffScore8Bit")
  var cutoffScore8Bit: Int // TODO: is this supposed to be limited to 8 bits?

  //
  // `--min-band-overlap`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `min_band_overlap`
  @DiamondHidden
  @CliFlag("min-band-overlap")
  @get:JsonGetter("minBandOverlap")
  @set:JsonSetter("minBandOverlap")
  var minBandOverlap: Double

  //
  // `--min-realign-overhang`
  // Default = `30`
  // Type = `int`
  // Config Var = `min_realign_overhang`
  @DiamondHidden
  @CliFlag("min-realign-overhang")
  @get:JsonGetter("minRealignOverhang")
  @set:JsonSetter("minRealignOverhang")
  var minRealignOverhang: Int

  //
  // `--ungapped-window`
  // Default = `48`
  // Type = `int`
  // Config Var = `ungapped_window`
  @DiamondHidden
  @CliFlag("ungapped-window")
  @get:JsonGetter("ungappedWindow")
  @set:JsonSetter("ungappedWindow")
  var ungappedWindow: Int

  //
  // `--gapped-filter-diag-score`
  // Default = `12.0`
  // Type = `double`
  // Config Var = `gapped_filter_diag_bit_score`
  @DiamondHidden
  @CliFlag("gapped-filter-diag-score")
  @get:JsonGetter("gappedFilterDiagBitScore")
  @set:JsonSetter("gappedFilterDiagBitScore")
  var gappedFilterDiagBitScore: Double

  //
  // `--gapped-filter-window`
  // Default = `200`
  // Type = `int`
  // Config Var = `gapped_filter_window`
  @DiamondHidden
  @CliFlag("gapped-filter-window")
  @get:JsonGetter("gappedFilterWindow")
  @set:JsonSetter("gappedFilterWindow")
  var gappedFilterWindow: Int

  //
  // `--output-hits`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_hits`
  @DiamondHidden
  @CliFlag("output-hits")
  @get:JsonGetter("outputHits")
  @set:JsonSetter("outputHits")
  var outputHits: Boolean

  //
  // `--ungapped-evalue`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_`
  @DiamondHidden
  @CliFlag("ungapped-evalue")
  @get:JsonGetter("ungappedEValue")
  @set:JsonSetter("ungappedEValue")
  var ungappedEValue: Double

  //
  // `--ungapped-evalue-short`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_short_`
  @DiamondHidden
  @CliFlag("ungapped-evalue-short")
  @get:JsonGetter("ungappedEValueShort")
  @set:JsonSetter("ungappedEValueShort")
  var ungappedEValueShort: Double

  //
  // `--no-logfile`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_logfile`
  @DiamondHidden
  @CliFlag("no-logfile")
  @get:JsonGetter("noLogFile")
  @set:JsonSetter("noLogFile")
  var noLogFile: Boolean

  //
  // `--band-bin`
  // Default = `24`
  // Type = `int`
  // Config Var = `band_bin`
  @DiamondHidden
  @CliFlag("band-bin")
  @get:JsonGetter("bandBin")
  @set:JsonSetter("bandBin")
  var bandBin: Int

  //
  // `--col-bin`
  // Default = `400`
  // Type = `int`
  // Config Var = `col_bin`
  @DiamondHidden
  @CliFlag("col-bin")
  @get:JsonGetter("colBin")
  @set:JsonSetter("colBin")
  var colBin: Int

  //
  // `--self`
  // Default = ``
  // Type = `bool`
  // Config Var = `self`
  @DiamondHidden
  @CliFlag("self")
  @get:JsonGetter("self")
  @set:JsonSetter("self")
  var self: Boolean

  //
  // `--trace-pt-fetch-size`
  // Default = `(int64_t)10e9`
  // Type = `int64_t`
  // Config Var = `trace_pt_fetch_size`
  @DiamondHidden
  @CliFlag("trace-pt-fetch-size")
  @get:JsonGetter("tracePtFetchSize")
  @set:JsonSetter("tracePtFetchSize")
  var tracePtFetchSize: Long

  //
  // `--tile-size`
  // Default = `(uint32_t)1024`
  // Type = `uint32_t`
  // Config Var = `tile_size`
  @DiamondHidden
  @CliFlag("tile-size")
  @get:JsonGetter("tileSize")
  @set:JsonSetter("tileSize")
  var tileSize: UInt

  //
  // `--short-query-ungapped-bitscore`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `short_query_ungapped_bitscore`
  @DiamondHidden
  @CliFlag("short-query-ungapped-bitscore")
  @get:JsonGetter("shortQueryUngappedBitScore")
  @set:JsonSetter("shortQueryUngappedBitScore")
  var shortQueryUngappedBitScore: Double

  //
  // `--short-query-max-len`
  // Default = `60`
  // Type = `int`
  // Config Var = `short_query_max_len`
  @DiamondHidden
  @CliFlag("short-query-max-len")
  @get:JsonGetter("shortQueryMaxLen")
  @set:JsonSetter("shortQueryMaxLen")
  var shortQueryMaxLen: Int

  //
  // `--gapped-filter-evalue1`
  // Default = `2000.0`
  // Type = `double`
  // Config Var = `gapped_filter_evalue1`
  @DiamondHidden
  @CliFlag("gapped-filter-evalue1")
  @get:JsonGetter("gappedFilterEValue1")
  @set:JsonSetter("gappedFilterEValue1")
  var gappedFilterEValue1: Double

  //
  // `--ext-yield`
  // Default = ``
  // Type = `double`
  // Config Var = `ext_min_yield`
  @DiamondHidden
  @CliFlag("ext-yield")
  @get:JsonGetter("extYield")
  @set:JsonSetter("extYield")
  var extYield: Double

  //
  // `--full-sw-len`
  // Default = ``
  // Type = `int`
  // Config Var = `full_sw_len`
  @DiamondHidden
  @CliFlag("full-sw-len")
  @get:JsonGetter("fullSwLen")
  @set:JsonSetter("fullSwLen")
  var fullSwLen: Int

  //
  // `--relaxed-evalue-factor`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `relaxed_evalue_factor`
  @DiamondHidden
  @CliFlag("relaxed-evalue-factor")
  @get:JsonGetter("relaxedEValueFactor")
  @set:JsonSetter("relaxedEValueFactor")
  var relaxedEValueFactor: Double

  //
  // `--type`
  // Default = ``
  // Type = `string`
  // Config Var = `type`
  @DiamondHidden
  @CliFlag("type")
  @get:JsonGetter("type")
  @set:JsonSetter("type")
  var type: String // TODO: what is this?

  //
  // `--raw`
  // Default = ``
  // Type = `bool`
  // Config Var = `raw`
  @DiamondHidden
  @CliFlag("raw")
  @get:JsonGetter("raw")
  @set:JsonSetter("raw")
  var raw: Boolean

  //
  // `--chaining-len-cap`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `chaining_len_cap`
  @DiamondHidden
  @CliFlag("chaining-len-cap")
  @get:JsonGetter("chainingLenCap")
  @set:JsonSetter("chainingLenCap")
  var chainingLenCap: Double

  //
  // `--chaining-min-nodes`
  // Default = `(size_t)200`
  // Type = `size_t`
  // Config Var = `chaining_min_nodes`
  @DiamondHidden
  @CliFlag("chaining-min-nodes")
  @get:JsonGetter("chainingMinNodes")
  @set:JsonSetter("chainingMinNodes")
  var chainingMinNodes: ULong

  //
  // `--fast-tsv`
  // Default = ``
  // Type = `bool`
  // Config Var = `fast_tsv`
  @DiamondHidden
  @CliFlag("fast-tsv")
  @get:JsonGetter("fastTsv")
  @set:JsonSetter("fastTsv")
  var fastTsv: Boolean

  //
  // `--target-parallel-verbosity`
  // Default = `UINT_MAX`  // TODO: unsure if a default should be specified for this in flag form.  In practice, this should always be 4294967295, but this may be system dependent?
  // Type = `unsigned`
  // Config Var = `target_parallel_verbosity`
  @DiamondHidden
  @CliFlag("target-parallel-verbosity")
  @get:JsonGetter("targetParallelVerbosity")
  @set:JsonSetter("targetParallelVerbosity")
  var targetParallelVerbosity: UInt

  //
  // `--query-memory`
  // Default = ``
  // Type = `bool`
  // Config Var = `query_memory`
  @DiamondHidden
  @CliFlag("query-memory")
  @get:JsonGetter("queryMemory")
  @set:JsonSetter("queryMemory")
  var queryMemory: Boolean

  //
  // `--memory-intervals`
  // Default = `(size_t)2`
  // Type = `size_t`
  // Config Var = `memory_intervals`
  @DiamondHidden
  @CliFlag("memory-intervals")
  @get:JsonGetter("memoryIntervals")
  @set:JsonSetter("memoryIntervals")
  var memoryIntervals: ULong

  //
  // `--seed-hit-density`
  // Default = ``
  // Type = `size_t`
  // Config Var = `seedhit_density`
  @DiamondHidden
  @CliFlag("seed-hit-density")
  @get:JsonGetter("seedHitDensity")
  @set:JsonSetter("seedHitDensity")
  var seedHitDensity: ULong

  //
  // `--chunk-size-multiplier`
  // Default = `(size_t)4`
  // Type = `size_t`
  // Config Var = `chunk_size_multiplier`
  @DiamondHidden
  @CliFlag("chunk-size-multiplier")
  @get:JsonGetter("chunkSizeMultiplier")
  @set:JsonSetter("chunkSizeMultiplier")
  var chunkSizeMultiplier: ULong

  //
  // `--score-drop-factor`
  // Default = `0.95`
  // Type = `double`
  // Config Var = `ranking_score_drop_factor`
  @DiamondHidden
  @CliFlag("score-drop-factor")
  @get:JsonGetter("rankingScoreDropFactor")
  @set:JsonSetter("rankingScoreDropFactor")
  var rankingScoreDropFactor: Double

  //
  // `--left-most-interval`
  // Default = `32`
  // Type = `int`
  // Config Var = `left_most_interval`
  @DiamondHidden
  @CliFlag("left-most-interval")
  @get:JsonGetter("leftMostInterval")
  @set:JsonSetter("leftMostInterval")
  var leftMostInterval: Int

  //
  // `--ranking-cutoff-bitscore`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `ranking_cutoff_bitscore`
  @DiamondHidden
  @CliFlag("ranking-cutoff-bitscore")
  @get:JsonGetter("rankingCutoffBitScore")
  @set:JsonSetter("rankingCutoffBitScore")
  var rankingCutoffBitScore: Double

  //
  // `--no-forward-fp`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_forward_fp`
  @DiamondHidden
  @CliFlag("no-forward-fp")
  @get:JsonGetter("noForwardFp")
  @set:JsonSetter("noForwardFp")
  var noForwardFp: Boolean

  //
  // `--no-ref-masking`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_ref_masking`
  @DiamondHidden
  @CliFlag("no-ref-masking")
  @get:JsonGetter("noRefMasking")
  @set:JsonSetter("noRefMasking")
  var noRefMasking: Boolean

  //
  // `--target-bias`
  // Default = ``
  // Type = `bool`
  // Config Var = `target_bias`
  @DiamondHidden
  @CliFlag("target-bias")
  @get:JsonGetter("targetBias")
  @set:JsonSetter("targetBias")
  var targetBias: Boolean

  //
  // `--output-fp`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_fp`
  @DiamondHidden
  @CliFlag("output-fp")
  @get:JsonGetter("outputFp")
  @set:JsonSetter("outputFp")
  var outputFp: Boolean

  //
  // `--family-cap`
  // Default = ``
  // Type = `int`
  // Config Var = `family_cap`
  @DiamondHidden
  @CliFlag("family-cap")
  @get:JsonGetter("familyCap")
  @set:JsonSetter("familyCap")
  var familyCap: Int

  //
  // `--cbs-matrix-scale`
  // Default = `1`
  // Type = `int`
  // Config Var = `cbs_matrix_scale`
  @DiamondHidden
  @CliFlag("cbs-matrix-scale")
  @get:JsonGetter("cbsMatrixScale")
  @set:JsonSetter("cbsMatrixScale")
  var cbsMatrixScale: Int

  //
  // `--query-count`
  // Default = `(size_t)1`
  // Type = `size_t`
  // Config Var = `query_count`
  @DiamondHidden
  @CliFlag("query-count")
  @get:JsonGetter("queryCount")
  @set:JsonSetter("queryCount")
  var queryCount: ULong

  //
  // `--cbs-angle`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `cbs_angle`
  @DiamondHidden
  @CliFlag("cbs-angle")
  @get:JsonGetter("cbsAngle")
  @set:JsonSetter("cbsAngle")
  var cbsAngle: Double

  //
  // `--cbs-err-tolerance`
  // Default = `0.00000001`
  // Type = `double`
  // Config Var = `cbs_err_tolerance`
  @DiamondHidden
  @CliFlag("cbs-err-tolerance")
  @get:JsonGetter("cbsErrTolerance")
  @set:JsonSetter("cbsErrTolerance")
  var cbsErrTolerance: Double

  //
  // `--cbs-it-limit`
  // Default = `2000`
  // Type = `int`
  // Config Var = `cbs_it_limit`
  @DiamondHidden
  @CliFlag("cbs-it-limit")
  @get:JsonGetter("cbsItLimit")
  @set:JsonSetter("cbsItLimit")
  var cbsItLimit: Int

  //
  // `--hash_join_swap`
  // Default = ``
  // Type = `bool`
  // Config Var = `hash_join_swap`
  @DiamondHidden
  @CliFlag("hash_join_swap")
  @get:JsonGetter("hashJoinSwap")
  @set:JsonSetter("hashJoinSwap")
  var hashJoinSwap: Boolean

  //
  // `--deque_bucket_size`
  // Default = `(size_t)524288`
  // Type = `size_t`
  // Config Var = `deque_bucket_size`
  @DiamondHidden
  @CliFlag("deque_bucket_size")
  @get:JsonGetter("dequeBucketSize")
  @set:JsonSetter("dequeBucketSize")
  var dequeBucketSize: ULong

  //
  // `--query-match-distance-threshold`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `query_match_distance_threshold`
  @DiamondHidden
  @CliFlag("query-match-distance-threshold")
  @get:JsonGetter("queryMatchDistanceThreshold")
  @set:JsonSetter("queryMatchDistanceThreshold")
  var queryMatchDistanceThreshold: Double

  //
  // `--length-ratio-threshold`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `length_ratio_threshold`
  @DiamondHidden
  @CliFlag("length-ratio-threshold")
  @get:JsonGetter("lengthRatioThreshold")
  @set:JsonSetter("lengthRatioThreshold")
  var lengthRatioThreshold: Double

  //
  // `--max-swipe-dp`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `max_swipe_dp`
  @DiamondHidden
  @CliFlag("max-swipe-dp")
  @get:JsonGetter("maxSwipeDp")
  @set:JsonSetter("maxSwipeDp")
  var maxSwipeDp: Long

  //
  // `--short-seqids`
  // Default = ``
  // Type = `bool`
  // Config Var = `short_seqids`
  @DiamondHidden
  @CliFlag("short-seqids")
  @get:JsonGetter("shortSeqIDs")
  @set:JsonSetter("shortSeqIDs")
  var shortSeqIDs: Boolean

  //
  // `--no-reextend`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reextend`
  @DiamondHidden
  @CliFlag("no-reextend")
  @get:JsonGetter("noReextend")
  @set:JsonSetter("noReextend")
  var noReextend: Boolean

  //
  // `--no-reorder`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reorder`
  @DiamondHidden
  @CliFlag("no-reorder")
  @get:JsonGetter("noReorder")
  @set:JsonSetter("noReorder")
  var noReorder: Boolean

  //
  // `--file1`
  // Default = ``
  // Type = `string`
  // Config Var = `file1`
  @DiamondHidden
  @CliFlag("file1")
  @get:JsonGetter("file1")
  @set:JsonSetter("file1")
  var file1: String // TODO: me thinks this might need to be Path

  //
  // `--file2`
  // Default = ``
  // Type = `string`
  // Config Var = `file2`
  @DiamondHidden
  @CliFlag("file2")
  @get:JsonGetter("file2")
  @set:JsonSetter("file2")
  var file2: String // TODO: me thinks this might need to be Path

  //
  // `--key2`
  // Default = ``
  // Type = `size_t`
  // Config Var = `key2`
  @DiamondHidden
  @CliFlag("key2")
  @get:JsonGetter("key2")
  @set:JsonSetter("key2")
  var key2: ULong

  //
  // `--motif-mask-file`
  // Default = ``
  // Type = `string`
  // Config Var = `motif_mask_file`
  @DiamondHidden
  @CliFlag("motif-mask-file")
  @get:JsonGetter("motifMaskFile")
  @set:JsonSetter("motifMaskFile")
  var motifMaskFile: String // TODO: me thinks this might need to be Path

  //
  // `--max-motif-len`
  // Default = `30`
  // Type = `Loc -> int32_t`
  // Config Var = `max_motif_len`
  @DiamondHidden
  @CliFlag("max-motif-len")
  @get:JsonGetter("maxMotifLen")
  @set:JsonSetter("maxMotifLen")
  var maxMotifLen: Int

  //
  // `--chaining-stacked-hsp-ratio`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `chaining_stacked_hsp_ratio`
  @DiamondHidden
  @CliFlag("chaining-stacked-hsp-ratio")
  @get:JsonGetter("chainingStackedHSPRatio")
  @set:JsonSetter("chainingStackedHSPRatio")
  var chainingStackedHSPRatio: Double

  //
  // `--swipe-task-size`
  // Default = `(int64_t)100000000`
  // Type = `int64_t`
  // Config Var = `swipe_task_size`
  @DiamondHidden
  @CliFlag("swipe-task-size")
  @get:JsonGetter("swipeTaskSize")
  @set:JsonSetter("swipeTaskSize")
  var swipeTaskSize: Long

  //
  // `--minimizer-window`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `minimizer_window_`
  @DiamondHidden
  @CliFlag("minimizer-window")
  @get:JsonGetter("minimizerWindow")
  @set:JsonSetter("minimizerWindow")
  var minimizerWindow: Int

  //
  // `--min_task_trace_pts`
  // Default = `(int64_t)1024`
  // Type = `int64_t`
  // Config Var = `min_task_trace_pts`
  @DiamondHidden
  @CliFlag("min_task_trace_pts")
  @get:JsonGetter("minTaskTracePts")
  @set:JsonSetter("minTaskTracePts")
  var minTaskTracePts: Long

  //
  // `--sketch-size`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `sketch_size`
  @DiamondHidden
  @CliFlag("sketch-size")
  @get:JsonGetter("sketchSize")
  @set:JsonSetter("sketchSize")
  var sketchSize: Int

  //
  // `--oid-list`
  // Default = ``
  // Type = `string`
  // Config Var = `oid_list`
  @DiamondHidden
  @CliFlag("oid-list")
  @get:JsonGetter("oidList")
  @set:JsonSetter("oidList")
  var oidList: String // TODO: what is this

  //
  // `--bootstrap-block`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `bootstrap_block`
  @DiamondHidden
  @CliFlag("bootstrap-block")
  @get:JsonGetter("bootstrapBlock")
  @set:JsonSetter("bootstrapBlock")
  var bootstrapBlock: Long

  //
  // `--centroid-factor`
  // Default = `(int64_t)3`
  // Type = `int64_t`
  // Config Var = `centroid_factor`
  @DiamondHidden
  @CliFlag("centroid-factor")
  @get:JsonGetter("centroidFactor")
  @set:JsonSetter("centroidFactor")
  var centroidFactor: Long

  //
  // `--timeout`
  // Default = ``
  // Type = `int`
  // Config Var = `timeout`
  @DiamondHidden
  @CliFlag("timeout")
  @get:JsonGetter("timeout")
  @set:JsonSetter("timeout")
  var timeout: Int

  //
  // `--resume`
  // Default = ``
  // Type = `string`
  // Config Var = `resume`
  @DiamondHidden
  @CliFlag("resume")
  @get:JsonGetter("resume")
  @set:JsonSetter("resume")
  var resume: String // TODO: what is this?

  //
  // `--target_hard_cap`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `target_hard_cap`
  @DiamondHidden
  @CliFlag("target_hard_cap")
  @get:JsonGetter("targetHardCap")
  @set:JsonSetter("targetHardCap")
  var targetHardCap: Long

  //
  // `--mapany`  // map any?
  // Default = ``
  // Type = `bool`
  // Config Var = `mapany`
  @DiamondHidden
  @CliFlag("mapany")
  @get:JsonGetter("mapAny")
  @set:JsonSetter("mapAny")
  var mapAny: Boolean

  //
  // `--neighbors`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `neighbors`
  @DiamondHidden
  @CliFlag("neighbors")
  @get:JsonGetter("neighbors")
  @set:JsonSetter("neighbors")
  var neighbors: String // TODO: what is this?

  //
  // `--reassign-overlap`
  // Default = `0.3`
  // Type = `double`
  // Config Var = `reassign_overlap`
  @DiamondHidden
  @CliFlag("reassign-overlap")
  @get:JsonGetter("reassignOverlap")
  @set:JsonSetter("reassignOverlap")
  var reassignOverlap: Double

  //
  // `--reassign-ratio`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `reassign_ratio`
  @DiamondHidden
  @CliFlag("reassign-ratio")
  @get:JsonGetter("reassignRatio")
  @set:JsonSetter("reassignRatio")
  var reassignRatio: Double

  //
  // `--reassign-max`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `reassign_max`
  @DiamondHidden
  @CliFlag("reassign-max")
  @get:JsonGetter("reassignMax")
  @set:JsonSetter("reassignMax")
  var reassignMax: Long

  //
  // `--add-self-aln`
  // Default = ``
  // Type = `bool`
  // Config Var = `add_self_aln`
  @DiamondHidden
  @CliFlag("add-self-aln")
  @get:JsonGetter("addSelfAln")
  @set:JsonSetter("addSelfAln")
  var addSelfAln: Boolean

  //
  // `--weighted-gvc`
  // Default = ``
  // Type = `bool`
  // Config Var = `weighted_gvc`
  @DiamondHidden
  @CliFlag("weighted-gvc")
  @get:JsonGetter("weightedGVC")
  @set:JsonSetter("weightedGVC")
  var weightedGVC: Boolean

  //
  // `--hamming-ext`
  // Default = ``
  // Type = `bool`
  // Config Var = `hamming_ext`
  @DiamondHidden
  @CliFlag("hamming-ext")
  @get:JsonGetter("hammingExt")
  @set:JsonSetter("hammingExt")
  var hammingExt: Boolean

  //
  // `--diag-filter-id`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_id`
  @DiamondHidden
  @CliFlag("diag-filter-id")
  @get:JsonGetter("diagFilterID")
  @set:JsonSetter("diagFilterID")
  var diagFilterID: Double

  //
  // `--diag-filter-cov`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_cov`
  @DiamondHidden
  @CliFlag("diag-filter-cov")
  @get:JsonGetter("diagFilterCov")
  @set:JsonSetter("diagFilterCov")
  var diagFilterCov: Double

  //
  // `--strict-gvc`
  // Default = ``
  // Type = `bool`
  // Config Var = `strict_gvc`
  @DiamondHidden
  @CliFlag("strict-gvc")
  @get:JsonGetter("strictGVC")
  @set:JsonSetter("strictGVC")
  var strictGVC: Boolean

  // type of sequences in database file (nucl/prot)
  // `--dbtype`
  // Default = `string("prot")`
  // Type = `string`
  // Config Var = `dbstring`
  @DiamondHidden
  @CliFlag("dbtype")
  @get:JsonGetter("dbType")
  @set:JsonSetter("dbType")
  var dbType: String // TODO: enum this

  // Clustering similarity measure (default='normalized_bitscore_global')
  // `--cluster-similarity`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_similarity`
  @DiamondHidden
  @CliFlag("cluster-similarity")
  @get:JsonGetter("clusterSimilarity")
  @set:JsonSetter("clusterSimilarity")
  var clusterSimilarity: String // TODO: enum this

  // Threshold for the similarity measure (default=50%)
  // `--cluster-threshold`
  // Default = ``
  // Type = `Option<double>`
  // Config Var = `cluster_threshold`
  @DiamondHidden
  @CliFlag("cluster-threshold")
  @get:JsonGetter("clusterThreshold")
  @set:JsonSetter("clusterThreshold")
  var clusterThreshold: Double

  // Filename for dumping the graph or reading the graph if cluster-restart
  // `--cluster-graph-file`
  // Default = ``
  // Type = `string`
  // Config Var = `cluster_graph_file`
  @DiamondHidden
  @CliFlag("cluster-graph-file")
  @get:JsonGetter("clusterGraphFile")
  @set:JsonSetter("clusterGraphFile")
  var clusterGraphFile: Path

  // Restart clustering from dumped graph
  // `--cluster-restart`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_restart`
  @DiamondHidden
  @CliFlag("cluster-restart")
  @get:JsonGetter("clusterRestart")
  @set:JsonSetter("clusterRestart")
  var clusterRestart: Boolean

  // MCL expansion coefficient (default=2)
  // `--mcl-expansion`
  // Default = `(uint32_t)2`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_expansion`
  @DiamondHidden
  @CliFlag("mcl-expansion")
  @get:JsonGetter("mclExpansion")
  @set:JsonSetter("mclExpansion")
  var mclExpansion: UInt

  // MCL inflation coefficient (default=2.0)
  // `--mcl-inflation`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `cluster_mcl_inflation`
  @DiamondHidden
  @CliFlag("mcl-inflation")
  @get:JsonGetter("mclInflation")
  @set:JsonSetter("mclInflation")
  var mclInflation: Double

  // MCL chunk size per thread (default=100)
  // `--mcl-chunk-size`
  // Default = `(uint32_t)1`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_chunk_size`
  @DiamondHidden
  @CliFlag("mcl-chunk-size")
  @get:JsonGetter("mclChunkSize")
  @set:JsonSetter("mclChunkSize")
  var mclChunkSize: UInt

  // MCL maximum iterations (default=100)
  // `--mcl-max-iterations`
  // Default = `(uint32_t)100`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_max_iter`
  @DiamondHidden
  @CliFlag("mcl-max-iterations")
  @get:JsonGetter("mclMaxIterations")
  @set:JsonSetter("mclMaxIterations")
  var mclMaxIterations: UInt

  // MCL switch to sparse matrix computation (default=0.8)
  // `--mcl-sparsity-switch`
  // Default = `0.8`
  // Type = `double`
  // Config Var = `cluster_mcl_sparsity_switch`
  @DiamondHidden
  @CliFlag("mcl-sparsity-switch")
  @get:JsonGetter("mclSparsitySwitch")
  @set:JsonSetter("mclSparsitySwitch")
  var mclSparsitySwitch: Double

  // Do not symmetrize the transistion matrix before clustering
  // `--mcl-nonsymmetric`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_nonsymmetric`
  @DiamondHidden
  @CliFlag("mcl-nonsymmetric")
  @get:JsonGetter("mclNonSymmetric")
  @set:JsonSetter("mclNonSymmetric")
  var mclNonSymmetric: Boolean

  // Some stats about the connected components in MCL
  // `--mcl-stats`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_stats`
  @DiamondHidden
  @CliFlag("mcl-stats")
  @get:JsonGetter("mclStats")
  @set:JsonSetter("mclStats")
  var mclStats: Boolean

  // Clustering algorithm ('mcl')
  // `--cluster-algo`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_algo`
  @DiamondHidden
  @CliFlag("cluster-algo")
  @get:JsonGetter("clusterAlgo")
  @set:JsonSetter("clusterAlgo")
  var clusterAlgo: String // TODO: enum this

  //
  // `--approx-backtrace`
  // Default = ``
  // Type = `bool`
  // Config Var = `approx_backtrace`
  @DiamondHidden
  @CliFlag("approx-backtrace")
  @get:JsonGetter("approxBacktrace")
  @set:JsonSetter("approxBacktrace")
  var approxBacktrace: Boolean

  //
  // `--prefix-scan`
  // Default = ``
  // Type = `bool`
  // Config Var = `prefix_scan`
  @DiamondHidden
  @CliFlag("prefix-scan")
  @get:JsonGetter("prefixScan")
  @set:JsonSetter("prefixScan")
  var prefixScan: Boolean

  //
  // `--narrow-band-cov`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_cov`
  @DiamondHidden
  @CliFlag("narrow-band-cov")
  @get:JsonGetter("narrowBandCov")
  @set:JsonSetter("narrowBandCov")
  var narrowBandCov: Double

  //
  // `--narrow-band-factor`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_factor`
  @DiamondHidden
  @CliFlag("narrow-band-factor")
  @get:JsonGetter("narrowBandFactor")
  @set:JsonSetter("narrowBandFactor")
  var narrowBandFactor: Double

  //
  // `--anchor-window`
  // Default = `12`
  // Type = `Loc -> int32_t`
  // Config Var = `anchor_window`
  @DiamondHidden
  @CliFlag("anchor-window")
  @get:JsonGetter("anchorWindow")
  @set:JsonSetter("anchorWindow")
  var anchorWindow: Int

  //
  // `--anchor-score`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `anchor_score`
  @DiamondHidden
  @CliFlag("anchor-score")
  @get:JsonGetter("anchorScore")
  @set:JsonSetter("anchorScore")
  var anchorScore: Double

  //
  // `--classic-band`
  // Default = ``
  // Type = `boolean`
  // Config Var = `classic_band`
  @DiamondHidden
  @CliFlag("classic-band")
  @get:JsonGetter("classicBand")
  @set:JsonSetter("classicBand")
  var classicBand: Boolean

  //
  // `--no_8bit_extension`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_8bit_extension`
  @DiamondHidden
  @CliFlag("no_8bit_extension")
  @get:JsonGetter("no8BitExtension")
  @set:JsonSetter("no8BitExtension")
  var no8BitExtension: Boolean

  //
  // `--anchored-swipe`
  // Default = ``
  // Type = `bool`
  // Config Var = `anchored_swipe`
  @DiamondHidden
  @CliFlag("anchored-swipe")
  @get:JsonGetter("anchoredSwipe")
  @set:JsonSetter("anchoredSwipe")
  var anchoredSwipe: Boolean

  //
  // `--no_chaining_merge_hsps`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_chaining_merge_hsps`
  @DiamondHidden
  @CliFlag("no_chaining_merge_hsps")
  @get:JsonGetter("noChainingMergeHSPs")
  @set:JsonSetter("noChainingMergeHSPs")
  var noChainingMergeHSPs: Boolean

  //
  // `--pipeline-short`
  // Default = ``
  // Type = `bool`
  // Config Var = `pipeline_short`
  @DiamondHidden
  @CliFlag("pipeline-short")
  @get:JsonGetter("pipelineShort")
  @set:JsonSetter("pipelineShort")
  var pipelineShort: Boolean

  //
  // `--graph-algo`
  // Default = `string("gvc")`
  // Type = `string`
  // Config Var = `graph_algo`
  @DiamondHidden
  @CliFlag("graph-algo")
  @get:JsonGetter("graphAlgo")
  @set:JsonSetter("graphAlgo")
  var graphAlgo: String // TODO: enum this

  //
  // `--tsv-read-size`
  // Default = `int64_t(GIGABYTES)` // 1073741824
  // Type = `int64_t`
  // Config Var = `tsv_read_size`
  @DiamondHidden
  @CliFlag("tsv-read-size")
  @get:JsonGetter("tsvReadSize")
  @set:JsonSetter("tsvReadSize")
  var tsvReadSize: Long

  //
  // `--min-len-ratio`
  // Default = ``
  // Type = `double`
  // Config Var = `min_length_ratio`
  @DiamondHidden
  @CliFlag("min-len-ratio")
  @get:JsonGetter("minLenRatio")
  @set:JsonSetter("minLenRatio")
  var minLenRatio: Double

  //
  // `--max-indirection`
  // Default = ``
  // Type = `int`
  // Config Var = `max_indirection`
  @DiamondHidden
  @CliFlag("max-indirection")
  @get:JsonGetter("maxIndirection")
  @set:JsonSetter("maxIndirection")
  var maxIndirection: Int

  //
  // `--aln-out`
  // Default = ``
  // Type = `string`
  // Config Var = `aln_out`
  @DiamondHidden
  @CliFlag("aln-out")
  @get:JsonGetter("alnOut")
  @set:JsonSetter("alnOut")
  var alnOut: String // TODO: what is this?
}
