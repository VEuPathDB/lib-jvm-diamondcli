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
  var maximumSeedFrequency: Double

  // maximum seed frequency
  // `--seed-freq` | `-`
  // Default = `-15.0`
  // Type = `double`
  // Config Var = `max_seed_freq`
  var seedFreq: Double

  //
  // `--space-penalty` | `-`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `space_penalty`
  var spacePenalty: Double

  //
  // `--reverse` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `reverse`
  var reverse: Boolean

  //
  // `--neighborhood-score` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `neighborhood_score`
  var neighborhoodScore: Int

  //
  // `--seed-weight` | `-w`
  // Default = `7u`
  // Type = `unsigned`
  // Config Var = `seed_weight`
  var seedWeight: UInt

  //
  // `--idl` | `-`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_left`
  var idLeft: UInt

  //
  // `--idr` | `-`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_right`
  var idRight: UInt

  //
  // `--idn` | `-`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `id_n`
  var idN: UInt

  //
  // `--bmatch` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `bmatch`
  var bmatch: Int

  //
  // `--bmismatch` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `bmismatch`
  var bmismatch: Int

  //
  // `--bcutoff` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `bcutoff`
  var bcutoff: Int

  //
  // `--ants` | `-`
  // Default = `uint64_t(100)`
  // Type = `uint64_t`
  // Config Var = `n_ants`
  var ants: ULong

  //
  // `--rho` | `-`
  // Default = `0.99`
  // Type = `double`
  // Config Var = `rho`
  var rho: Double

  //
  // `--p_best` | `-`
  // Default = `0.05`
  // Type = `double`
  // Config Var = `p_best`
  var p_best: Double

  //
  // `--d_exp` | `-`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_exp`
  var d_exp: Double

  //
  // `--d_new` | `-`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `d_new`
  var d_new: Double

  //
  // `--score-estimate-factor` | `-`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `score_estimate_factor`
  var scoreEstimateFactor: Double

  //
  // `--diag-min-estimate` | `-`
  // Default = `17`
  // Type = `int`
  // Config Var = `diag_min_estimate`
  var diagMinEstimate: Int

  //
  // `--path-cutoff` | `-`
  // Default = `0.92`
  // Type = `double`
  // Config Var = `path_cutoff`
  var pathCutoff: Double

  //
  // `--sw` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_smith_waterman`
  var useSmithWaterman: Boolean

  //
  // `--superblock` | `-`
  // Default = `128`
  // Type = `int`
  // Config Var = `superblock`
  var superblock: Int

  //
  // `--max-cells` | `-`
  // Default = `10000000u`
  // Type = `unsigned`
  // Config Var = `max_cells`
  var maxCells: UInt

  //
  // `--load-balancing` | `-`
  // Default = `(unsigned)Config::query_parallel`
  // Type = `unsigned`
  // Config Var = `load_balancing`
  var loadBalancing: UInt

  //
  // `--log-query` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_query`
  var logQuery: Boolean

  //
  // `--log-subject` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_subject`
  var logSubject: Boolean

  //
  // `--palign` | `-`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `threads_align`
  var palign: UInt

  //
  // `--score-ratio` | `-`
  // Default = `0.9`
  // Type = `double`
  // Config Var = `score_ratio`
  var scoreRatio: Double

  // trace point fetch size
  // `--fetch-size` | `-`
  // Default = `4096u`
  // Type = `unsigned`
  // Config Var = `fetch_size`
  var fetchSize: UInt

  // number of target sequences to fetch for seed extension
  // `--target-fetch-size` | `-`
  // Default = `4u`
  // Type = `unsigned`
  // Config Var = `target_fetch_size`
  var targetFetchSize: UInt

  //
  // `--rank-factor` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `rank_factor`
  var rankFactor: Double

  //
  // `--transcript-len-estimate` | `-`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `transcript_len_estimate`
  var transcriptLenEstimate: Double

  //
  // `--family-counts` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `family_counts_file`
  var familyCountsFile: Path

  //
  // `--radix-cluster-buffered` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `radix_cluster_buffered`
  var radixClusterBuffered: Boolean

  //
  // `--join-split-size` | `-`
  // Default = `100000u`
  // Type = `unsigned`
  // Config Var = `join_split_size`
  var joinSplitSize: UInt

  //
  // `--join-split-key-len` | `-`
  // Default = `17u`
  // Type = `unsigned`
  // Config Var = `join_split_key_len`
  var joinSplitKeyLen: UInt

  //
  // `--radix-bits` | `-`
  // Default = `8u`
  // Type = `unsigned`
  // Config Var = `radix_bits`
  var radixBits: UInt // TODO: should this be capped/enum'd?

  //
  // `--join-ht-factor` | `-`
  // Default = `1.3`
  // Type = `double`
  // Config Var = `join_ht_factor`
  var joinHTFactor: Double

  //
  // `--sort-join` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `sort_join`
  var sortJoin: Boolean

  //
  // `--simple-freq` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `simple_freq`
  var simpleFreq: Boolean

  //
  // `--freq-treshold` // TYPO: This typo exists in the diamond cli source.
  // Default = ``
  // Type = `double`
  // Config Var = `freq_treshold`
  var freqThreshold: Double

  //
  // `--use-dataset-field` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `use_dataset_field`
  var useDatasetField: Boolean

  //
  // `--store-query-quality` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `store_query_quality`
  var storeQueryQuality: Boolean

  //
  // `--swipe-chunk-size` | `-`
  // Default = `256u`
  // Type = `unsigned`
  // Config Var = `swipe_chunk_size`
  var swipeChunkSize: UInt

  //
  // `--hard-masked` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `hardmasked`
  var hardMasked: Boolean

  //
  // `--cbs-window` | `-`
  // Default = `40`
  // Type = `int`
  // Config Var = `cbs_window`
  var cbsWindow: Int

  //
  // `--no-dict` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_dict`
  var noDict: Boolean

  //
  // `--upgma-edge-limit` | `-`
  // Default = `(uint64_t)10000000`
  // Type = `uint64_t`
  // Config Var = `upgma_edge_limit`
  var upGmaEdgeLimit: ULong

  //
  // `--tree` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `tree_file`
  var tree: Path

  //
  // `--upgma-dist` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_dist`
  var upGmaDist: String // TODO: what is this?

  //
  // `--upgma-input` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `upgma_input`
  var upGmaInput: String // TODO: what is this?

  //
  // `--log-extend` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `log_extend`
  var logExtend: Boolean

  //
  // `--chaining-maxgap` | `-`
  // Default = `2000`
  // Type = `int`
  // Config Var = `chaining_maxgap`
  var chainingMaxGap: Int

  // maximum tandem repeat period to consider (50)
  // `--tantan-maxRepeatOffset` // TODO: the caps are in the diamond cli source, are flag strings case sensitive?
  // Default = `15`
  // Type = `int`
  // Config Var = `tantan_maxRepeatOffset`
  var tantanMaxRepeatOffset: Int

  // use tantan masking in ungapped mode
  // `--tantan-ungapped` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `tantan_ungapped`
  var tantanUngapped: Boolean

  //
  // `--chaining-range-cover` | `-`
  // Default = `(size_t)8`
  // Type = `size_t`
  // Config Var = `chaining_range_cover`
  var chainingRangeCover: ULong

  //
  // `--no-swipe-realign` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_swipe_realign`
  var noSwipeRealign: Boolean

  //
  // `--chaining-maxnodes` | `-`
  // Default = ``
  // Type = `size_t`
  // Config Var = `chaining_maxnodes`
  var chainingMaxNodes: ULong

  //
  // `--cutoff-score-8bit` | `-`
  // Default = `240`
  // Type = `int`
  // Config Var = `cutoff_score_8bit`
  var cutoffScore8Bit: Int // TODO: is this supposed to be limited to 8 bits?

  //
  // `--min-band-overlap` | `-`
  // Default = `0.0`
  // Type = `double`
  // Config Var = `min_band_overlap`
  var minBandOverlap: Double

  //
  // `--min-realign-overhang` | `-`
  // Default = `30`
  // Type = `int`
  // Config Var = `min_realign_overhang`
  var minRealignOverhang: Int

  //
  // `--ungapped-window` | `-`
  // Default = `48`
  // Type = `int`
  // Config Var = `ungapped_window`
  var ungappedWindow: Int

  //
  // `--gapped-filter-diag-score` | `-`
  // Default = `12.0`
  // Type = `double`
  // Config Var = `gapped_filter_diag_bit_score`
  var gappedFilterDiagBitScore: Double

  //
  // `--gapped-filter-window` | `-`
  // Default = `200`
  // Type = `int`
  // Config Var = `gapped_filter_window`
  var gappedFilterWindow: Int

  //
  // `--output-hits` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_hits`
  var outputHits: Boolean

  //
  // `--ungapped-evalue` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_`
  var ungappedEValue: Double

  //
  // `--ungapped-evalue-short` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `ungapped_evalue_short_`
  var ungappedEValueShort: Double

  //
  // `--no-logfile` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_logfile`
  var noLogFile: Boolean

  //
  // `--band-bin` | `-`
  // Default = `24`
  // Type = `int`
  // Config Var = `band_bin`
  var bandBin: Int

  //
  // `--col-bin` | `-`
  // Default = `400`
  // Type = `int`
  // Config Var = `col_bin`
  var colBin: Int

  //
  // `--self` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `self`
  var self: Boolean

  //
  // `--trace-pt-fetch-size` | `-`
  // Default = `(int64_t)10e9`
  // Type = `int64_t`
  // Config Var = `trace_pt_fetch_size`
  var tracePtFetchSize: Long

  //
  // `--tile-size` | `-`
  // Default = `(uint32_t)1024`
  // Type = `uint32_t`
  // Config Var = `tile_size`
  var tileSize: UInt

  //
  // `--short-query-ungapped-bitscore` | `-`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `short_query_ungapped_bitscore`
  var shortQueryUngappedBitScore: Double

  //
  // `--short-query-max-len` | `-`
  // Default = `60`
  // Type = `int`
  // Config Var = `short_query_max_len`
  var shortQueryMaxLen: Int

  //
  // `--gapped-filter-evalue1` | `-`
  // Default = `2000.0`
  // Type = `double`
  // Config Var = `gapped_filter_evalue1`
  var gappedFilterEValue1: Double

  //
  // `--ext-yield` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `ext_min_yield`
  var extYield: Double

  //
  // `--full-sw-len` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `full_sw_len`
  var fullSwLen: Int

  //
  // `--relaxed-evalue-factor` | `-`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `relaxed_evalue_factor`
  var relaxedEValueFactor: Double

  //
  // `--type` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `type`
  var type: String // TODO: what is this?

  //
  // `--raw` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `raw`
  var raw: Boolean

  //
  // `--chaining-len-cap` | `-`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `chaining_len_cap`
  var chainingLenCap: Double

  //
  // `--chaining-min-nodes` | `-`
  // Default = `(size_t)200`
  // Type = `size_t`
  // Config Var = `chaining_min_nodes`
  var chainingMinNodes: ULong

  //
  // `--fast-tsv` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `fast_tsv`
  var fastTsv: Boolean

  //
  // `--target-parallel-verbosity` | `-`
  // Default = `UINT_MAX`  // TODO: unsure if a default should be specified for this in flag form.  In practice, this should always be 4294967295, but this may be system dependent?
  // Type = `unsigned`
  // Config Var = `target_parallel_verbosity`
  var targetParallelVerbosity: UInt

  //
  // `--query-memory` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `query_memory`
  var queryMemory: Boolean

  //
  // `--memory-intervals` | `-`
  // Default = `(size_t)2`
  // Type = `size_t`
  // Config Var = `memory_intervals`
  var memoryIntervals: ULong

  //
  // `--seed-hit-density` | `-`
  // Default = ``
  // Type = `size_t`
  // Config Var = `seedhit_density`
  var seedHitDensity: ULong

  //
  // `--chunk-size-multiplier` | `-`
  // Default = `(size_t)4`
  // Type = `size_t`
  // Config Var = `chunk_size_multiplier`
  var chunkSizeMultiplier: ULong

  //
  // `--score-drop-factor` | `-`
  // Default = `0.95`
  // Type = `double`
  // Config Var = `ranking_score_drop_factor`
  var rankingScoreDropFactor: Double

  //
  // `--left-most-interval` | `-`
  // Default = `32`
  // Type = `int`
  // Config Var = `left_most_interval`
  var leftMostInterval: Int

  //
  // `--ranking-cutoff-bitscore` | `-`
  // Default = `25.0`
  // Type = `double`
  // Config Var = `ranking_cutoff_bitscore`
  var rankingCutoffBitScore: Double

  //
  // `--no-forward-fp` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_forward_fp`
  var noForwardFp: Boolean

  //
  // `--no-ref-masking` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_ref_masking`
  var noRefMasking: Boolean

  //
  // `--target-bias` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `target_bias`
  var targetBias: Boolean

  //
  // `--output-fp` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `output_fp`
  var outputFp: Boolean

  //
  // `--family-cap` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `family_cap`
  var familyCap: Int

  //
  // `--cbs-matrix-scale` | `-`
  // Default = `1`
  // Type = `int`
  // Config Var = `cbs_matrix_scale`
  var cbsMatrixScale: Int

  //
  // `--query-count` | `-`
  // Default = `(size_t)1`
  // Type = `size_t`
  // Config Var = `query_count`
  var queryCount: ULong

  //
  // `--cbs-angle` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `cbs_angle`
  var cbsAngle: Double

  //
  // `--cbs-err-tolerance` | `-`
  // Default = `0.00000001`
  // Type = `double`
  // Config Var = `cbs_err_tolerance`
  var cbsErrTolerance: Double

  //
  // `--cbs-it-limit` | `-`
  // Default = `2000`
  // Type = `int`
  // Config Var = `cbs_it_limit`
  var cbsItLimit: Int

  //
  // `--hash_join_swap` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `hash_join_swap`
  var hashJoinSwap: Boolean

  //
  // `--deque_bucket_size` | `-`
  // Default = `(size_t)524288`
  // Type = `size_t`
  // Config Var = `deque_bucket_size`
  var dequeBucketSize: ULong

  //
  // `--query-match-distance-threshold` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `query_match_distance_threshold`
  var queryMatchDistanceThreshold: Double

  //
  // `--length-ratio-threshold` | `-`
  // Default = `-1.0`
  // Type = `double`
  // Config Var = `length_ratio_threshold`
  var lengthRatioThreshold: Double

  //
  // `--max-swipe-dp` | `-`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `max_swipe_dp`
  var maxSwipeDp: Long

  //
  // `--short-seqids` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `short_seqids`
  var shortSeqIDs: Boolean

  //
  // `--no-reextend` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reextend`
  var noReextend: Boolean

  //
  // `--no-reorder` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_reorder`
  var noReorder: Boolean

  //
  // `--file1` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `file1`
  var file1: String // TODO: me thinks this might need to be Path

  //
  // `--file2` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `file2`
  var file2: String // TODO: me thinks this might need to be Path

  //
  // `--key2` | `-`
  // Default = ``
  // Type = `size_t`
  // Config Var = `key2`
  var key2: ULong

  //
  // `--motif-mask-file` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `motif_mask_file`
  var motifMaskFile: String // TODO: me thinks this might need to be Path

  //
  // `--max-motif-len` | `-`
  // Default = `30`
  // Type = `Loc -> int32_t`
  // Config Var = `max_motif_len`
  var maxMotifLen: Int

  //
  // `--chaining-stacked-hsp-ratio` | `-`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `chaining_stacked_hsp_ratio`
  var chainingStackedHSPRatio: Double

  //
  // `--swipe-task-size` | `-`
  // Default = `(int64_t)100000000`
  // Type = `int64_t`
  // Config Var = `swipe_task_size`
  var swipeTaskSize: Long

  //
  // `--minimizer-window` | `-`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `minimizer_window_`
  var minimizerWindow: Int

  //
  // `--min_task_trace_pts` | `-`
  // Default = `(int64_t)1024`
  // Type = `int64_t`
  // Config Var = `min_task_trace_pts`
  var minTaskTracePts: Long

  //
  // `--sketch-size` | `-`
  // Default = ``
  // Type = `Loc -> int32_t`
  // Config Var = `sketch_size`
  var sketchSize: Int

  //
  // `--oid-list` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `oid_list`
  var oidList: String // TODO: what is this

  //
  // `--bootstrap-block` | `-`
  // Default = `(int64_t)1000000`
  // Type = `int64_t`
  // Config Var = `bootstrap_block`
  var bootstrapBlock: Long

  //
  // `--centroid-factor` | `-`
  // Default = `(int64_t)3`
  // Type = `int64_t`
  // Config Var = `centroid_factor`
  var centroidFactor: Long

  //
  // `--timeout` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `timeout`
  var timeout: Int

  //
  // `--resume` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `resume`
  var resume: String // TODO: what is this?

  //
  // `--target_hard_cap` | `-`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `target_hard_cap`
  var targetHardCap: Long

  //
  // `--mapany` | `-` // map any?
  // Default = ``
  // Type = `bool`
  // Config Var = `mapany`
  var mapAny: Boolean

  //
  // `--neighbors` | `-`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `neighbors`
  var neighbors: String // TODO: what is this?

  //
  // `--reassign-overlap` | `-`
  // Default = `0.3`
  // Type = `double`
  // Config Var = `reassign_overlap`
  var reassignOverlap: Double

  //
  // `--reassign-ratio` | `-`
  // Default = `0.5`
  // Type = `double`
  // Config Var = `reassign_ratio`
  var reassignRatio: Double

  //
  // `--reassign-max` | `-`
  // Default = ``
  // Type = `int64_t`
  // Config Var = `reassign_max`
  var reassignMax: Long

  //
  // `--add-self-aln` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `add_self_aln`
  var addSelfAln: Boolean

  //
  // `--weighted-gvc` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `weighted_gvc`
  var weightedGVC: Boolean

  //
  // `--hamming-ext` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `hamming_ext`
  var hammingExt: Boolean

  //
  // `--diag-filter-id` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_id`
  var diagFilterID: Double

  //
  // `--diag-filter-cov` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `diag_filter_cov`
  var diagFilterCov: Double

  //
  // `--strict-gvc` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `strict_gvc`
  var strictGVC: Boolean

  // type of sequences in database file (nucl/prot)
  // `--dbtype` | `-`
  // Default = `string("prot")`
  // Type = `string`
  // Config Var = `dbstring`
  var dbType: String // TODO: enum this

  // Clustering similarity measure (default='normalized_bitscore_global')
  // `--cluster-similarity` | `-`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_similarity`
  var clusterSimilarity: String // TODO: enum this

  // Threshold for the similarity measure (default=50%)
  // `--cluster-threshold` | `-`
  // Default = ``
  // Type = `Option<double>`
  // Config Var = `cluster_threshold`
  var clusterThreshold: Double

  // Filename for dumping the graph or reading the graph if cluster-restart
  // `--cluster-graph-file` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `cluster_graph_file`
  var clusterGraphFile: Path

  // Restart clustering from dumped graph
  // `--cluster-restart` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_restart`
  var clusterRestart: Boolean

  // MCL expansion coefficient (default=2)
  // `--mcl-expansion` | `-`
  // Default = `(uint32_t)2`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_expansion`
  var mclExpansion: UInt

  // MCL inflation coefficient (default=2.0)
  // `--mcl-inflation` | `-`
  // Default = `2.0`
  // Type = `double`
  // Config Var = `cluster_mcl_inflation`
  var mclInflation: Double

  // MCL chunk size per thread (default=100)
  // `--mcl-chunk-size` | `-`
  // Default = `(uint32_t)1`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_chunk_size`
  var mclChunkSize: UInt

  // MCL maximum iterations (default=100)
  // `--mcl-max-iterations` | `-`
  // Default = `(uint32_t)100`
  // Type = `uint32_t`
  // Config Var = `cluster_mcl_max_iter`
  var mclMaxIterations: UInt

  // MCL switch to sparse matrix computation (default=0.8)
  // `--mcl-sparsity-switch` | `-`
  // Default = `0.8`
  // Type = `double`
  // Config Var = `cluster_mcl_sparsity_switch`
  var mclSparsitySwitch: Double

  // Do not symmetrize the transistion matrix before clustering
  // `--mcl-nonsymmetric` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_nonsymmetric`
  var mclNonSymmetric: Boolean

  // Some stats about the connected components in MCL
  // `--mcl-stats` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `cluster_mcl_stats`
  var mclStats: Boolean

  // Clustering algorithm ('mcl')
  // `--cluster-algo` | `-`
  // Default = ``
  // Type = `Option<string>`
  // Config Var = `cluster_algo`
  var clusterAlgo: String // TODO: enum this

  //
  // `--approx-backtrace` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `approx_backtrace`
  var approxBacktrace: Boolean

  //
  // `--prefix-scan` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `prefix_scan`
  var prefixScan: Boolean

  //
  // `--narrow-band-cov` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_cov`
  var narrowBandCov: Double

  //
  // `--narrow-band-factor` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `narrow_band_factor`
  var narrowBandFactor: Double

  //
  // `--anchor-window` | `-`
  // Default = `12`
  // Type = `Loc -> int32_t`
  // Config Var = `anchor_window`
  var anchorWindow: Int

  //
  // `--anchor-score` | `-`
  // Default = `1.0`
  // Type = `double`
  // Config Var = `anchor_score`
  var anchorScore: Double

  //
  // `--classic-band` | `-`
  // Default = ``
  // Type = `boolean`
  // Config Var = `classic_band`
  var classicBand: Boolean

  //
  // `--no_8bit_extension` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_8bit_extension`
  var no8BitExtension: Boolean

  //
  // `--anchored-swipe` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `anchored_swipe`
  var anchoredSwipe: Boolean

  //
  // `--no_chaining_merge_hsps` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_chaining_merge_hsps`
  var noChainingMergeHSPs: Boolean

  //
  // `--pipeline-short` | `-`
  // Default = ``
  // Type = `bool`
  // Config Var = `pipeline_short`
  var pipelineShort: Boolean

  //
  // `--graph-algo` | `-`
  // Default = `string("gvc")`
  // Type = `string`
  // Config Var = `graph_algo`
  var graphAlgo: String // TODO: enum this

  //
  // `--tsv-read-size` | `-`
  // Default = `int64_t(GIGABYTES)` // 1073741824
  // Type = `int64_t`
  // Config Var = `tsv_read_size`
  var tsvReadSize: Long

  //
  // `--min-len-ratio` | `-`
  // Default = ``
  // Type = `double`
  // Config Var = `min_length_ratio`
  var minLenRatio: Double

  //
  // `--max-indirection` | `-`
  // Default = ``
  // Type = `int`
  // Config Var = `max_indirection`
  var maxIndirection: Int

  //
  // `--aln-out` | `-`
  // Default = ``
  // Type = `string`
  // Config Var = `aln_out`
  var alnOut: String // TODO: what is this?
}
