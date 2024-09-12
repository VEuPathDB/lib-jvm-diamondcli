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
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.DiamondHidden
import java.nio.file.Path

// THIS IS ONLY USED WHEN COMPILED WITH 'EXTRA' AND IT IS UNCLEAR WHAT FLAG GOES
// WITH WHAT COMMAND.  ADD A GENERAL WARNING TO ALL PROPERTIES IN THIS TYPE!
interface HiddenOptionContainer {
   // ("match1", 0, "", match_file1) // unused in 2.1.9
   // ("match2", 0, "", match_file2) // unused in 2.1.9

  /**
   * Maximum seed frequency.
   *
   * Flag: `--seed-freq`
   *
   * Default = `-15.0`
   */
  // TODO: potentially used by blastp/blastx
  @DiamondHidden
  @CliFlag("seed-freq")
  @get:JsonGetter("maximumSeedFrequency")
  @set:JsonSetter("maximumSeedFrequency")
  var maximumSeedFrequency: Double

  /**
   * Flag: `--space-penalty`
   *
   * Default: `0.5`
   */
  @DiamondHidden
  @CliFlag("space-penalty")
  @get:JsonGetter("spacePenalty")
  @set:JsonSetter("spacePenalty")
  var spacePenalty: Double

  /**
   * Flag: `--reverse`
   */
  @DiamondHidden
  @CliFlag("reverse")
  @get:JsonGetter("reverse")
  @set:JsonSetter("reverse")
  var reverse: Boolean

  /**
   * Flag: `--neighborhood-score`
   */
  @DiamondHidden
  @CliFlag("neighborhood-score")
  @get:JsonGetter("neighborhoodScore")
  @set:JsonSetter("neighborhoodScore")
  var neighborhoodScore: Int

  /**
   * Flag: `--seed-weight` | `-w`
   *
   * Default: `7u`
   */
  @DiamondHidden
  @CliFlag("seed-weight", 'w')
  @get:JsonGetter("seedWeight")
  @set:JsonSetter("seedWeight")
  var seedWeight: UInt

  /**
   * Flag: `--idl`
   */
  @DiamondHidden
  @CliFlag("idl")
  @get:JsonGetter("idLeft")
  @set:JsonSetter("idLeft")
  var idLeft: UInt

  /**
   * Flag: `--idr`
   */
  @DiamondHidden
  @CliFlag("idr")
  @get:JsonGetter("idRight")
  @set:JsonSetter("idRight")
  var idRight: UInt

  /**
   * Flag: `--idn`
   */
  @DiamondHidden
  @CliFlag("idn")
  @get:JsonGetter("idN")
  @set:JsonSetter("idN")
  var idN: UInt

  /**
   * Flag: `--bmatch`
   */
  @DiamondHidden
  @CliFlag("bmatch")
  @get:JsonGetter("bMatch")
  @set:JsonSetter("bMatch")
  var bMatch: Int

  /**
   * Flag: `--bmismatch`
   */
  @DiamondHidden
  @CliFlag("bmismatch")
  @get:JsonGetter("bMismatch")
  @set:JsonSetter("bMismatch")
  var bMismatch: Int

  /**
   * Flag: `--bcutoff`
   */
  @DiamondHidden
  @CliFlag("cutoff")
  @get:JsonGetter("bCutoff")
  @set:JsonSetter("bCutoff")
  var bCutoff: Int

  /**
   * Flag: `--ants`
   *
   * Default: `100`
   */
  @DiamondHidden
  @CliFlag("ants")
  @get:JsonGetter("ants")
  @set:JsonSetter("ants")
  var ants: ULong

  /**
   * Flag: `--rho`
   *
   * Default: `0.99`
   */
  @DiamondHidden
  @CliFlag("rho")
  @get:JsonGetter("rho")
  @set:JsonSetter("rho")
  var rho: Double

  /**
   * Flag: `--p_best`
   *
   * Default: `0.05`
   */
  @DiamondHidden
  @CliFlag("p_best")
  @get:JsonGetter("pBest")
  @set:JsonSetter("pBest")
  var pBest: Double

  /**
   * Flag: `--d_exp`
   *
   * Default: `1.0`
   */
  @DiamondHidden
  @CliFlag("d_exp")
  @get:JsonGetter("dExp")
  @set:JsonSetter("dExp")
  var dExp: Double

  /**
   * Flag: `--d_new`
   *
   * Default: `1.0`
   */
  @DiamondHidden
  @CliFlag("d_new")
  @get:JsonGetter("dNew")
  @set:JsonSetter("dNew")
  var dNew: Double

  /**
   * Flag: `--score-estimate-factor`
   *
   * Default: `0.0`
   */
  @DiamondHidden
  @CliFlag("score-estimate-factor")
  @get:JsonGetter("scoreEstimateFactor")
  @set:JsonSetter("scoreEstimateFactor")
  var scoreEstimateFactor: Double

  /**
   * Flag: `--diag-min-estimate`
   *
   * Default: `17`
   */
  @DiamondHidden
  @CliFlag("diag-min-estimate")
  @get:JsonGetter("diagMinEstimate")
  @set:JsonSetter("diagMinEstimate")
  var diagMinEstimate: Int

  /**
   * Flag: `--path-cutoff`
   *
   * Default: `0.92`
   */
  @DiamondHidden
  @CliFlag("path-cutoff")
  @get:JsonGetter("pathCutoff")
  @set:JsonSetter("pathCutoff")
  var pathCutoff: Double

  /**
   * Flag: `--sw`
   */
  @DiamondHidden
  @CliFlag("sw")
  @get:JsonGetter("useSmithWaterman")
  @set:JsonSetter("useSmithWaterman")
  var useSmithWaterman: Boolean

  /**
   * Flag: `--superblock`
   *
   * Default: `128`
   */
  @DiamondHidden
  @CliFlag("superblock")
  @get:JsonGetter("superblock")
  @set:JsonSetter("superblock")
  var superblock: Int

  /**
   * Flag: `--max-cells`
   *
   * Default: `10000000u`
   */
  @DiamondHidden
  @CliFlag("max-cells")
  @get:JsonGetter("maxCells")
  @set:JsonSetter("maxCells")
  var maxCells: UInt

  /**
   * Flag: `--load-balancing`
   */
  @DiamondHidden
  @CliFlag("load-balancing")
  @get:JsonGetter("loadBalancing")
  @set:JsonSetter("loadBalancing")
  var loadBalancing: UInt

  /**
   * Flag: `--log-query`
   */
  @DiamondHidden
  @CliFlag("log-query")
  @get:JsonGetter("logQuery")
  @set:JsonSetter("logQuery")
  var logQuery: Boolean

  /**
   * Flag: `--log-subject`
   */
  @DiamondHidden
  @CliFlag("log-subject")
  @get:JsonGetter("logSubject")
  @set:JsonSetter("logSubject")
  var logSubject: Boolean

  /**
   * Flag: `--palign`
   */
  @DiamondHidden
  @CliFlag("palign")
  @get:JsonGetter("pAlign")
  @set:JsonSetter("pAlign")
  var pAlign: UInt

  /**
   * Flag: `--score-ratio`
   *
   * Default: `0.9`
   */
  @DiamondHidden
  @CliFlag("score-ratio")
  @get:JsonGetter("scoreRatio")
  @set:JsonSetter("scoreRatio")
  var scoreRatio: Double

  /**
   * Trace point fetch size.
   *
   * Flag: `--fetch-size`
   *
   * Default: `4096u`
   */
  @DiamondHidden
  @CliFlag("fetch-size")
  @get:JsonGetter("fetchSize")
  @set:JsonSetter("fetchSize")
  var fetchSize: UInt

  /**
   * Number of target sequences to fetch for seed extension.
   *
   * Flag: `--target-fetch-size`
   *
   * Default: `4u`
   */
  @DiamondHidden
  @CliFlag("target-fetch-size")
  @get:JsonGetter("targetFetchSize")
  @set:JsonSetter("targetFetchSize")
  var targetFetchSize: UInt

  /**
   * Flag: `--rank-factor`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("rank-factor")
  @get:JsonGetter("rankFactor")
  @set:JsonSetter("rankFactor")
  var rankFactor: Double

  /**
   * Flag: `--transcript-len-estimate`
   *
   * Default: `1.0`
   */
  @DiamondHidden
  @CliFlag("transcript-len-estimate")
  @get:JsonGetter("transcriptLenEstimate")
  @set:JsonSetter("transcriptLenEstimate")
  var transcriptLenEstimate: Double

  /**
   * Flag: `--family-counts`
   */
  @DiamondHidden
  @CliFlag("family-counts")
  @get:JsonGetter("familyCountsFile")
  @set:JsonSetter("familyCountsFile")
  var familyCountsFile: Path

  /**
   * Flag: `--radix-cluster-buffered`
   */
  @DiamondHidden
  @CliFlag("radix-cluster-buffered")
  @get:JsonGetter("radixClusterBuffered")
  @set:JsonSetter("radixClusterBuffered")
  var radixClusterBuffered: Boolean

  /**
   * Flag: `--join-split-size`
   *
   * Default: `100000u`
   */
  @DiamondHidden
  @CliFlag("join-split-size")
  @get:JsonGetter("joinSplitSize")
  @set:JsonSetter("joinSplitSize")
  var joinSplitSize: UInt

  /**
   * Flag: `--join-split-key-len`
   *
   * Default: `17u`
   */
  @DiamondHidden
  @CliFlag("join-split-key-len")
  @get:JsonGetter("joinSplitKeyLen")
  @set:JsonSetter("joinSplitKeyLen")
  var joinSplitKeyLen: UInt

  /**
   * Flag: `--radix-bits`
   *
   * Default: `8u`
   */
  @DiamondHidden
  @CliFlag("radix-bits")
  @get:JsonGetter("radixBits")
  @set:JsonSetter("radixBits")
  var radixBits: UInt // TODO: should this be capped/enum'd?

  /**
   * Flag: `--join-ht-factor`
   *
   * Default: `1.3`
   */
  @DiamondHidden
  @CliFlag("join-ht-factor")
  @get:JsonGetter("joinHTFactor")
  @set:JsonSetter("joinHTFactor")
  var joinHTFactor: Double

  /**
   * Flag: `--sort-join`
   */
  @DiamondHidden
  @CliFlag("sort-join")
  @get:JsonGetter("sortJoin")
  @set:JsonSetter("sortJoin")
  var sortJoin: Boolean

  /**
   * Flag: `--simple-freq`
   */
  @DiamondHidden
  @CliFlag("simple-freq")
  @get:JsonGetter("simpleFreq")
  @set:JsonSetter("simpleFreq")
  var simpleFreq: Boolean

  /**
   * Flag: `--freq-treshold` // TYPO: This typo exists in the diamond cli source.
   */
  @DiamondHidden
  @CliFlag("freq-treshold") // TYPO: This typo exists in the diamond cli source.
  @get:JsonGetter("freqThreshold")
  @set:JsonSetter("freqThreshold")
  var freqThreshold: Double

  /**
   * Flag: `--use-dataset-field`
   */
  @DiamondHidden
  @CliFlag("use-dataset-field")
  @get:JsonGetter("useDatasetField")
  @set:JsonSetter("useDatasetField")
  var useDatasetField: Boolean

  /**
   * Flag: `--store-query-quality`
   */
  @DiamondHidden
  @CliFlag("store-query-quality")
  @get:JsonGetter("storeQueryQuality")
  @set:JsonSetter("storeQueryQuality")
  var storeQueryQuality: Boolean

  /**
   * Flag: `--swipe-chunk-size`
   *
   * Default: `256u`
   */
  @DiamondHidden
  @CliFlag("swipe-chunk-size")
  @get:JsonGetter("swipeChunkSize")
  @set:JsonSetter("swipeChunkSize")
  var swipeChunkSize: UInt

  /**
   * Flag: `--hard-masked`
   */
  @DiamondHidden
  @CliFlag("hard-masked")
  @get:JsonGetter("hardMasked")
  @set:JsonSetter("hardMasked")
  var hardMasked: Boolean

  /**
   * Flag: `--cbs-window`
   *
   * Default: `40`
   */
  @DiamondHidden
  @CliFlag("cbs-window")
  @get:JsonGetter("cbsWindow")
  @set:JsonSetter("cbsWindow")
  var cbsWindow: Int

  /**
   * Flag: `--no-dict`
   */
  @DiamondHidden
  @CliFlag("no-dict")
  @get:JsonGetter("noDict")
  @set:JsonSetter("noDict")
  var noDict: Boolean

  /**
   * Flag: `--upgma-edge-limit`
   *
   * Default: `10000000`
   */
  @DiamondHidden
  @CliFlag("upgma-edge-limit")
  @get:JsonGetter("upGmaEdgeLimit")
  @set:JsonSetter("upGmaEdgeLimit")
  var upGmaEdgeLimit: ULong

  /**
   * Flag: `--tree`
   */
  @DiamondHidden
  @CliFlag("tree")
  @get:JsonGetter("tree")
  @set:JsonSetter("tree")
  var tree: Path

  /**
   * Flag: `--upgma-dist`
   */
  @DiamondHidden
  @CliFlag("upgma-dist")
  @get:JsonGetter("upGmaDist")
  @set:JsonSetter("upGmaDist")
  var upGmaDist: DistributionType // TODO: what is this?

  /**
   * Flag: `--upgma-input`
   */
  @DiamondHidden
  @CliFlag("upgma-input")
  @get:JsonGetter("upGmaInput")
  @set:JsonSetter("upGmaInput")
  var upGmaInput: InputType // TODO: what is this?

  /**
   * Flag: `--log-extend`
   */
  @DiamondHidden
  @CliFlag("log-extend")
  @get:JsonGetter("logExtend")
  @set:JsonSetter("logExtend")
  var logExtend: Boolean

  /**
   * Flag: `--chaining-maxgap`
   *
   * Default: `2000`
   */
  @DiamondHidden
  @CliFlag("chaining-maxgap")
  @get:JsonGetter("chainingMaxGap")
  @set:JsonSetter("chainingMaxGap")
  var chainingMaxGap: Int

  /**
   * Maximum tandem repeat period to consider (50)
   *
   * Flag: `--tantan-maxRepeatOffset` // TODO: the caps are in the diamond cli source, are flag strings case sensitive?
   *
   * Default: `15`
   */
  @DiamondHidden
  @CliFlag("tantan-maxRepeatOffset") // NOTE: Capitalization is present in DIAMOND CLI source code
  @get:JsonGetter("tantanMaxRepeatOffset")
  @set:JsonSetter("tantanMaxRepeatOffset")
  var tantanMaxRepeatOffset: Int

  /**
   * Use tantan masking in ungapped mode
   *
   * Flag: `--tantan-ungapped`
   */
  @DiamondHidden
  @CliFlag("tantan-ungapped")
  @get:JsonGetter("tantanUngapped")
  @set:JsonSetter("tantanUngapped")
  var tantanUngapped: Boolean

  /**
   * Flag: `--chaining-range-cover`
   *
   * Default = `8`
   */
  @DiamondHidden
  @CliFlag("chaining-range-cover")
  @get:JsonGetter("chainingRangeCover")
  @set:JsonSetter("chainingRangeCover")
  var chainingRangeCover: ULong

  /**
   * Flag: `--no-swipe-realign`
   */
  @DiamondHidden
  @CliFlag("no-swipe-realign")
  @get:JsonGetter("noSwipeRealign")
  @set:JsonSetter("noSwipeRealign")
  var noSwipeRealign: Boolean

  /**
   * Flag: `--chaining-maxnodes`
   */
  @DiamondHidden
  @CliFlag("chaining-maxnodes")
  @get:JsonGetter("chainingMaxNodes")
  @set:JsonSetter("chainingMaxNodes")
  var chainingMaxNodes: ULong

  /**
   * Flag: `--cutoff-score-8bit`
   *
   * Default: `240`
   */
  @DiamondHidden
  @CliFlag("cutoff-score-8bit")
  @get:JsonGetter("cutoffScore8Bit")
  @set:JsonSetter("cutoffScore8Bit")
  var cutoffScore8Bit: Int // TODO: is this supposed to be limited to 8 bits?

  /**
   * Flag: `--min-band-overlap`
   *
   * Default: `0.0`
   */
  @DiamondHidden
  @CliFlag("min-band-overlap")
  @get:JsonGetter("minBandOverlap")
  @set:JsonSetter("minBandOverlap")
  var minBandOverlap: Double

  /**
   * Flag: `--min-realign-overhang`
   *
   * Default: `30`
   */
  @DiamondHidden
  @CliFlag("min-realign-overhang")
  @get:JsonGetter("minRealignOverhang")
  @set:JsonSetter("minRealignOverhang")
  var minRealignOverhang: Int

  /**
   * Flag: `--ungapped-window`
   *
   * Default: `48`
   */
  @DiamondHidden
  @CliFlag("ungapped-window")
  @get:JsonGetter("ungappedWindow")
  @set:JsonSetter("ungappedWindow")
  var ungappedWindow: Int

  /**
   * Flag: `--gapped-filter-diag-score`
   *
   * Default: `12.0`
   */
  @DiamondHidden
  @CliFlag("gapped-filter-diag-score")
  @get:JsonGetter("gappedFilterDiagBitScore")
  @set:JsonSetter("gappedFilterDiagBitScore")
  var gappedFilterDiagBitScore: Double

  /**
   * Flag: `--gapped-filter-window`
   *
   * Default: `200`
   */
  @DiamondHidden
  @CliFlag("gapped-filter-window")
  @get:JsonGetter("gappedFilterWindow")
  @set:JsonSetter("gappedFilterWindow")
  var gappedFilterWindow: Int

  /**
   * Flag: `--output-hits`
   */
  @DiamondHidden
  @CliFlag("output-hits")
  @get:JsonGetter("outputHits")
  @set:JsonSetter("outputHits")
  var outputHits: Boolean

  /**
   * Flag: `--ungapped-evalue`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("ungapped-evalue")
  @get:JsonGetter("ungappedEValue")
  @set:JsonSetter("ungappedEValue")
  var ungappedEValue: Double

  /**
   * Flag: `--ungapped-evalue-short`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("ungapped-evalue-short")
  @get:JsonGetter("ungappedEValueShort")
  @set:JsonSetter("ungappedEValueShort")
  var ungappedEValueShort: Double

  /**
   * Flag: `--no-logfile`
   */
  @DiamondHidden
  @CliFlag("no-logfile")
  @get:JsonGetter("noLogFile")
  @set:JsonSetter("noLogFile")
  var noLogFile: Boolean

  /**
   * Flag: `--band-bin`
   *
   * Default: `24`
   */
  @DiamondHidden
  @CliFlag("band-bin")
  @get:JsonGetter("bandBin")
  @set:JsonSetter("bandBin")
  var bandBin: Int

  /**
   * Flag: `--col-bin`
   *
   * Default: `400`
   */
  @DiamondHidden
  @CliFlag("col-bin")
  @get:JsonGetter("colBin")
  @set:JsonSetter("colBin")
  var colBin: Int

  /**
   * Flag: `--self`
   */
  @DiamondHidden
  @CliFlag("self")
  @get:JsonGetter("self")
  @set:JsonSetter("self")
  var self: Boolean

  /**
   * Flag: `--trace-pt-fetch-size`
   *
   * Default: `10e9`
   */
  @DiamondHidden
  @CliFlag("trace-pt-fetch-size")
  @get:JsonGetter("tracePtFetchSize")
  @set:JsonSetter("tracePtFetchSize")
  var tracePtFetchSize: Long

  /**
   * Flag: `--tile-size`
   *
   * Default: `1024`
   */
  @DiamondHidden
  @CliFlag("tile-size")
  @get:JsonGetter("tileSize")
  @set:JsonSetter("tileSize")
  var tileSize: UInt

  /**
   * Flag: `--short-query-ungapped-bitscore`
   *
   * Default: `25.0`
   */
  @DiamondHidden
  @CliFlag("short-query-ungapped-bitscore")
  @get:JsonGetter("shortQueryUngappedBitScore")
  @set:JsonSetter("shortQueryUngappedBitScore")
  var shortQueryUngappedBitScore: Double

  /**
   * Flag: `--short-query-max-len`
   *
   * Default: `60`
   */
  @DiamondHidden
  @CliFlag("short-query-max-len")
  @get:JsonGetter("shortQueryMaxLen")
  @set:JsonSetter("shortQueryMaxLen")
  var shortQueryMaxLen: Int

  /**
   * Flag: `--gapped-filter-evalue1`
   *
   * Default: `2000.0`
   */
  @DiamondHidden
  @CliFlag("gapped-filter-evalue1")
  @get:JsonGetter("gappedFilterEValue1")
  @set:JsonSetter("gappedFilterEValue1")
  var gappedFilterEValue1: Double

  /**
   * Flag: `--ext-yield`
   */
  @DiamondHidden
  @CliFlag("ext-yield")
  @get:JsonGetter("extYield")
  @set:JsonSetter("extYield")
  var extYield: Double

  /**
   * Flag: `--full-sw-len`
   */
  @DiamondHidden
  @CliFlag("full-sw-len")
  @get:JsonGetter("fullSwLen")
  @set:JsonSetter("fullSwLen")
  var fullSwLen: Int

  /**
   * Flag: `--relaxed-evalue-factor`
   *
   * Default: `1.0`
   */
  @DiamondHidden
  @CliFlag("relaxed-evalue-factor")
  @get:JsonGetter("relaxedEValueFactor")
  @set:JsonSetter("relaxedEValueFactor")
  var relaxedEValueFactor: Double

  /**
   * TODO: seems to only be used by benchmark?
   *
   * Flag: `--type`
   */
  @DiamondHidden
  @CliFlag("type")
  @get:JsonGetter("type")
  @set:JsonSetter("type")
  var type: BenchmarkType

  /**
   * Flag: `--raw`
   */
  @DiamondHidden
  @CliFlag("raw")
  @get:JsonGetter("raw")
  @set:JsonSetter("raw")
  var raw: Boolean

  /**
   * Flag: `--chaining-len-cap`
   *
   * Default: `2.0`
   */
  @DiamondHidden
  @CliFlag("chaining-len-cap")
  @get:JsonGetter("chainingLenCap")
  @set:JsonSetter("chainingLenCap")
  var chainingLenCap: Double

  /**
   * Flag: `--chaining-min-nodes`
   *
   * Default: `200`
   */
  @DiamondHidden
  @CliFlag("chaining-min-nodes")
  @get:JsonGetter("chainingMinNodes")
  @set:JsonSetter("chainingMinNodes")
  var chainingMinNodes: ULong

  /**
   * Flag: `--fast-tsv`
   */
  @DiamondHidden
  @CliFlag("fast-tsv")
  @get:JsonGetter("fastTsv")
  @set:JsonSetter("fastTsv")
  var fastTsv: Boolean

  /**
   * Flag: `--target-parallel-verbosity`
   */
  @DiamondHidden
  @CliFlag("target-parallel-verbosity")
  @get:JsonGetter("targetParallelVerbosity")
  @set:JsonSetter("targetParallelVerbosity")
  var targetParallelVerbosity: UInt

  /**
   * Flag: `--query-memory`
   */
  @DiamondHidden
  @CliFlag("query-memory")
  @get:JsonGetter("queryMemory")
  @set:JsonSetter("queryMemory")
  var queryMemory: Boolean

  /**
   * Flag: `--memory-intervals`
   *
   * Default: `2`
   */
  @DiamondHidden
  @CliFlag("memory-intervals")
  @get:JsonGetter("memoryIntervals")
  @set:JsonSetter("memoryIntervals")
  var memoryIntervals: ULong

  /**
   * Flag: `--seed-hit-density`
   */
  @DiamondHidden
  @CliFlag("seed-hit-density")
  @get:JsonGetter("seedHitDensity")
  @set:JsonSetter("seedHitDensity")
  var seedHitDensity: ULong

  /**
   * Flag: `--chunk-size-multiplier`
   *
   * Default: `4`
   */
  @DiamondHidden
  @CliFlag("chunk-size-multiplier")
  @get:JsonGetter("chunkSizeMultiplier")
  @set:JsonSetter("chunkSizeMultiplier")
  var chunkSizeMultiplier: ULong

  /**
   * Flag: `--score-drop-factor`
   *
   * Default: `0.95`
   */
  @DiamondHidden
  @CliFlag("score-drop-factor")
  @get:JsonGetter("rankingScoreDropFactor")
  @set:JsonSetter("rankingScoreDropFactor")
  var rankingScoreDropFactor: Double

  /**
   * Flag: `--left-most-interval`
   *
   * Default: `32`
   */
  @DiamondHidden
  @CliFlag("left-most-interval")
  @get:JsonGetter("leftMostInterval")
  @set:JsonSetter("leftMostInterval")
  var leftMostInterval: Int

  /**
   * Flag: `--ranking-cutoff-bitscore`
   *
   * Default: `25.0`
   */
  @DiamondHidden
  @CliFlag("ranking-cutoff-bitscore")
  @get:JsonGetter("rankingCutoffBitScore")
  @set:JsonSetter("rankingCutoffBitScore")
  var rankingCutoffBitScore: Double

  /**
   * Flag: `--no-forward-fp`
   */
  @DiamondHidden
  @CliFlag("no-forward-fp")
  @get:JsonGetter("noForwardFp")
  @set:JsonSetter("noForwardFp")
  var noForwardFp: Boolean

  /**
   * Flag: `--no-ref-masking`
   */
  @DiamondHidden
  @CliFlag("no-ref-masking")
  @get:JsonGetter("noRefMasking")
  @set:JsonSetter("noRefMasking")
  var noRefMasking: Boolean

  /**
   * Flag: `--target-bias`
   */
  @DiamondHidden
  @CliFlag("target-bias")
  @get:JsonGetter("targetBias")
  @set:JsonSetter("targetBias")
  var targetBias: Boolean

  /**
   * Flag: `--output-fp`
   */
  @DiamondHidden
  @CliFlag("output-fp")
  @get:JsonGetter("outputFp")
  @set:JsonSetter("outputFp")
  var outputFp: Boolean

  /**
   * Flag: `--family-cap`
   */
  @DiamondHidden
  @CliFlag("family-cap")
  @get:JsonGetter("familyCap")
  @set:JsonSetter("familyCap")
  var familyCap: Int

  /**
   * Flag: `--cbs-matrix-scale`
   *
   * Default: `1`
   */
  @DiamondHidden
  @CliFlag("cbs-matrix-scale")
  @get:JsonGetter("cbsMatrixScale")
  @set:JsonSetter("cbsMatrixScale")
  var cbsMatrixScale: Int

  /**
   * Flag: `--query-count`
   *
   * Default: `1`
   */
  @DiamondHidden
  @CliFlag("query-count")
  @get:JsonGetter("queryCount")
  @set:JsonSetter("queryCount")
  var queryCount: ULong

  /**
   * Flag: `--cbs-angle`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("cbs-angle")
  @get:JsonGetter("cbsAngle")
  @set:JsonSetter("cbsAngle")
  var cbsAngle: Double

  /**
   * Flag: `--cbs-err-tolerance`
   *
   * Default: `0.00000001`
   */
  @DiamondHidden
  @CliFlag("cbs-err-tolerance")
  @get:JsonGetter("cbsErrTolerance")
  @set:JsonSetter("cbsErrTolerance")
  var cbsErrTolerance: Double

  /**
   * Flag: `--cbs-it-limit`
   *
   * Default: `2000`
   */
  @DiamondHidden
  @CliFlag("cbs-it-limit")
  @get:JsonGetter("cbsItLimit")
  @set:JsonSetter("cbsItLimit")
  var cbsItLimit: Int

  /**
   * Flag: `--hash_join_swap`
   */
  @DiamondHidden
  @CliFlag("hash_join_swap")
  @get:JsonGetter("hashJoinSwap")
  @set:JsonSetter("hashJoinSwap")
  var hashJoinSwap: Boolean

  /**
   * Flag: `--deque_bucket_size`
   *
   * Default: `524288`
   */
  @DiamondHidden
  @CliFlag("deque_bucket_size")
  @get:JsonGetter("dequeBucketSize")
  @set:JsonSetter("dequeBucketSize")
  var dequeBucketSize: ULong

  /**
   * Flag: `--query-match-distance-threshold`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("query-match-distance-threshold")
  @get:JsonGetter("queryMatchDistanceThreshold")
  @set:JsonSetter("queryMatchDistanceThreshold")
  var queryMatchDistanceThreshold: Double

  /**
   * Flag: `--length-ratio-threshold`
   *
   * Default: `-1.0`
   */
  @DiamondHidden
  @CliFlag("length-ratio-threshold")
  @get:JsonGetter("lengthRatioThreshold")
  @set:JsonSetter("lengthRatioThreshold")
  var lengthRatioThreshold: Double

  /**
   * Flag: `--max-swipe-dp`
   *
   * Default: `1000000`
   */
  @DiamondHidden
  @CliFlag("max-swipe-dp")
  @get:JsonGetter("maxSwipeDp")
  @set:JsonSetter("maxSwipeDp")
  var maxSwipeDp: Long

  /**
   * Flag: `--short-seqids`
   */
  @DiamondHidden
  @CliFlag("short-seqids")
  @get:JsonGetter("shortSeqIDs")
  @set:JsonSetter("shortSeqIDs")
  var shortSeqIDs: Boolean

  /**
   * Flag: `--no-reextend`
   */
  @DiamondHidden
  @CliFlag("no-reextend")
  @get:JsonGetter("noReextend")
  @set:JsonSetter("noReextend")
  var noReextend: Boolean

  /**
   * Flag: `--no-reorder`
   */
  @DiamondHidden
  @CliFlag("no-reorder")
  @get:JsonGetter("noReorder")
  @set:JsonSetter("noReorder")
  var noReorder: Boolean

  /**
   * Flag: `--file1`
   */
  @DiamondHidden
  @CliFlag("file1")
  @get:JsonGetter("file1")
  @set:JsonSetter("file1")
  var file1: Path

  /**
   * Flag: `--file2`
   */
  @DiamondHidden
  @CliFlag("file2")
  @get:JsonGetter("file2")
  @set:JsonSetter("file2")
  var file2: Path

  /**
   * Flag: `--key2`
   */
  @DiamondHidden
  @CliFlag("key2")
  @get:JsonGetter("key2")
  @set:JsonSetter("key2")
  var key2: ULong

  /**
   * TODO: this flag appears to be unused.
   *
   * Flag: `--motif-mask-file`
   */
  @DiamondHidden
  @CliFlag("motif-mask-file")
  @get:JsonGetter("motifMaskFile")
  @set:JsonSetter("motifMaskFile")
  var motifMaskFile: Path

  /**
   * Flag: `--max-motif-len`
   *
   * Default: `30`
   */
  @DiamondHidden
  @CliFlag("max-motif-len")
  @get:JsonGetter("maxMotifLen")
  @set:JsonSetter("maxMotifLen")
  var maxMotifLen: Int

  /**
   * Flag: `--chaining-stacked-hsp-ratio`
   *
   * Default: `0.5`
   */
  @DiamondHidden
  @CliFlag("chaining-stacked-hsp-ratio")
  @get:JsonGetter("chainingStackedHSPRatio")
  @set:JsonSetter("chainingStackedHSPRatio")
  var chainingStackedHSPRatio: Double

  /**
   * Flag: `--swipe-task-size`
   *
   * Default: `100000000`
   */
  @DiamondHidden
  @CliFlag("swipe-task-size")
  @get:JsonGetter("swipeTaskSize")
  @set:JsonSetter("swipeTaskSize")
  var swipeTaskSize: Long

  /**
   * Flag: `--minimizer-window`
   */
  @DiamondHidden
  @CliFlag("minimizer-window")
  @get:JsonGetter("minimizerWindow")
  @set:JsonSetter("minimizerWindow")
  var minimizerWindow: Int

  /**
   * Flag: `--min_task_trace_pts`
   *
   * Default: `1024`
   */
  @DiamondHidden
  @CliFlag("min_task_trace_pts")
  @get:JsonGetter("minTaskTracePts")
  @set:JsonSetter("minTaskTracePts")
  var minTaskTracePts: Long

  /**
   * Flag: `--sketch-size`
   */
  @DiamondHidden
  @CliFlag("sketch-size")
  @get:JsonGetter("sketchSize")
  @set:JsonSetter("sketchSize")
  var sketchSize: Int

  /**
   * Flag: `--oid-list`
   */
  @DiamondHidden
  @CliFlag("oid-list")
  @get:JsonGetter("oidList")
  @set:JsonSetter("oidList")
  var oidList: Path

  /**
   * Flag: `--bootstrap-block`
   *
   * Default: `1000000`
   */
  @DiamondHidden
  @CliFlag("bootstrap-block")
  @get:JsonGetter("bootstrapBlock")
  @set:JsonSetter("bootstrapBlock")
  var bootstrapBlock: Long

  /**
   * Flag: `--centroid-factor`
   *
   * Default: `3`
   */
  @DiamondHidden
  @CliFlag("centroid-factor")
  @get:JsonGetter("centroidFactor")
  @set:JsonSetter("centroidFactor")
  var centroidFactor: Long

  /**
   * Flag: `--timeout`
   */
  @DiamondHidden
  @CliFlag("timeout")
  @get:JsonGetter("timeout")
  @set:JsonSetter("timeout")
  var timeout: Int

  /**
   * TODO: this flag appears to be unused.
   *
   * Flag: `--resume`
   */
  @DiamondHidden
  @CliFlag("resume")
  @get:JsonGetter("resume")
  @set:JsonSetter("resume")
  var resume: String

  /**
   * Flag: `--target_hard_cap`
   */
  @DiamondHidden
  @CliFlag("target_hard_cap")
  @get:JsonGetter("targetHardCap")
  @set:JsonSetter("targetHardCap")
  var targetHardCap: Long

  /**
   * Flag: `--mapany`
   */
  @DiamondHidden
  @CliFlag("mapany")
  @get:JsonGetter("mapAny")
  @set:JsonSetter("mapAny")
  var mapAny: Boolean

  /**
   * TODO: this flag appears to be unused.
   *
   * Flag: `--neighbors`
   */
  @DiamondHidden
  @CliFlag("neighbors")
  @get:JsonGetter("neighbors")
  @set:JsonSetter("neighbors")
  var neighbors: String

  /**
   * Flag: `--reassign-overlap`
   *
   * Default: `0.3`
   */
  @DiamondHidden
  @CliFlag("reassign-overlap")
  @get:JsonGetter("reassignOverlap")
  @set:JsonSetter("reassignOverlap")
  var reassignOverlap: Double

  /**
   * Flag: `--reassign-ratio`
   *
   * Default: `0.5`
   */
  @DiamondHidden
  @CliFlag("reassign-ratio")
  @get:JsonGetter("reassignRatio")
  @set:JsonSetter("reassignRatio")
  var reassignRatio: Double

  /**
   * Flag: `--reassign-max`
   */
  @DiamondHidden
  @CliFlag("reassign-max")
  @get:JsonGetter("reassignMax")
  @set:JsonSetter("reassignMax")
  var reassignMax: Long

  /**
   * Flag: `--add-self-aln`
   */
  @DiamondHidden
  @CliFlag("add-self-aln")
  @get:JsonGetter("addSelfAln")
  @set:JsonSetter("addSelfAln")
  var addSelfAln: Boolean

  /**
   * Flag: `--weighted-gvc`
   */
  @DiamondHidden
  @CliFlag("weighted-gvc")
  @get:JsonGetter("weightedGVC")
  @set:JsonSetter("weightedGVC")
  var weightedGVC: Boolean

  /**
   * Flag: `--hamming-ext`
   */
  @DiamondHidden
  @CliFlag("hamming-ext")
  @get:JsonGetter("hammingExt")
  @set:JsonSetter("hammingExt")
  var hammingExt: Boolean

  /**
   * Flag: `--diag-filter-id`
   */
  @DiamondHidden
  @CliFlag("diag-filter-id")
  @get:JsonGetter("diagFilterID")
  @set:JsonSetter("diagFilterID")
  var diagFilterID: Double

  /**
   * Flag: `--diag-filter-cov`
   */
  @DiamondHidden
  @CliFlag("diag-filter-cov")
  @get:JsonGetter("diagFilterCov")
  @set:JsonSetter("diagFilterCov")
  var diagFilterCov: Double

  /**
   * Flag: `--strict-gvc`
   */
  @DiamondHidden
  @CliFlag("strict-gvc")
  @get:JsonGetter("strictGVC")
  @set:JsonSetter("strictGVC")
  var strictGVC: Boolean

  /**
   * Type of sequences in database file (nucl/prot).
   *
   * Flag: `--dbtype`
   *
   * Default: [SequenceType.AminoAcid]
   */
  @DiamondHidden
  @CliFlag("dbtype")
  @get:JsonGetter("dbType")
  @set:JsonSetter("dbType")
  var dbType: SequenceType

  /**
   * Clustering similarity measure.
   *
   * TODO: this is some sort of expression string, it's currently unclear what
   *       its rules are.  This should be converted to a complex type for
   *       validation.
   *
   * TODO: only seems relevant to `cluster`, `deepclust`, `linclust`
   *
   * Flag: `--cluster-similarity`
   */
  @DiamondHidden
  @CliFlag("cluster-similarity")
  @get:JsonGetter("clusterSimilarity")
  @set:JsonSetter("clusterSimilarity")
  var clusterSimilarity: String

  /**
   * Threshold for the similarity measure.
   *
   * Flag: `--cluster-threshold`
   *
   * Default: `0.5`
   */
  @DiamondHidden
  @CliFlag("cluster-threshold")
  @get:JsonGetter("clusterThreshold")
  @set:JsonSetter("clusterThreshold")
  var clusterThreshold: Double

  /**
   * Filename for dumping the graph or reading the graph if cluster-restart.
   *
   * Flag: `--cluster-graph-file`
   */
  @DiamondHidden
  @CliFlag("cluster-graph-file")
  @get:JsonGetter("clusterGraphFile")
  @set:JsonSetter("clusterGraphFile")
  var clusterGraphFile: Path

  /**
   * Restart clustering from dumped graph.
   *
   * Flag: `--cluster-restart`
   */
  @DiamondHidden
  @CliFlag("cluster-restart")
  @get:JsonGetter("clusterRestart")
  @set:JsonSetter("clusterRestart")
  var clusterRestart: Boolean

  /**
   * MCL expansion coefficient.
   *
   * Flag: `--mcl-expansion`
   *
   * Default: `2`
   */
  @DiamondHidden
  @CliFlag("mcl-expansion")
  @get:JsonGetter("mclExpansion")
  @set:JsonSetter("mclExpansion")
  var mclExpansion: UInt

  /**
   * MCL inflation coefficient.
   *
   * Flag: `--mcl-inflation`
   *
   * Default: `2.0`
   */
  @DiamondHidden
  @CliFlag("mcl-inflation")
  @get:JsonGetter("mclInflation")
  @set:JsonSetter("mclInflation")
  var mclInflation: Double

  /**
   * MCL chunk size per thread.
   *
   * Flag: `--mcl-chunk-size`
   */
  @DiamondHidden
  @CliFlag("mcl-chunk-size")
  @get:JsonGetter("mclChunkSize")
  @set:JsonSetter("mclChunkSize")
  var mclChunkSize: UInt

  /**
   * MCL maximum iterations.
   *
   * Flag: `--mcl-max-iterations`
   *
   * Default: `100`
   */
  @DiamondHidden
  @CliFlag("mcl-max-iterations")
  @get:JsonGetter("mclMaxIterations")
  @set:JsonSetter("mclMaxIterations")
  var mclMaxIterations: UInt

  /**
   * MCL switch to sparse matrix computation.
   *
   * Flag: `--mcl-sparsity-switch`
   *
   * Default: `0.8`
   */
  @DiamondHidden
  @CliFlag("mcl-sparsity-switch")
  @get:JsonGetter("mclSparsitySwitch")
  @set:JsonSetter("mclSparsitySwitch")
  var mclSparsitySwitch: Double

  /**
   * Do not symmetrize the transition matrix before clustering.
   *
   * Flag: `--mcl-nonsymmetric`
   */
  @DiamondHidden
  @CliFlag("mcl-nonsymmetric")
  @get:JsonGetter("mclNonSymmetric")
  @set:JsonSetter("mclNonSymmetric")
  var mclNonSymmetric: Boolean

  /**
   * Some stats about the connected components in MCL.
   *
   * Flag: `--mcl-stats`
   */
  @DiamondHidden
  @CliFlag("mcl-stats")
  @get:JsonGetter("mclStats")
  @set:JsonSetter("mclStats")
  var mclStats: Boolean

  /**
   * Clustering algorithm ('mcl')
   *
   * TODO: actual values for this enum are dependent on compile flags, it seems
   *       that "cascaded" is the only 'safe' option, "mcl" is dependent on a
   *       compile flag.
   *
   * Flag: `--cluster-algo`
   */
  @DiamondHidden
  @CliFlag("cluster-algo")
  @get:JsonGetter("clusterAlgo")
  @set:JsonSetter("clusterAlgo")
  var clusterAlgo: String

  /**
   * Flag: `--approx-backtrace`
   */
  @DiamondHidden
  @CliFlag("approx-backtrace")
  @get:JsonGetter("approxBacktrace")
  @set:JsonSetter("approxBacktrace")
  var approxBacktrace: Boolean

  /**
   * Flag: `--prefix-scan`
   */
  @DiamondHidden
  @CliFlag("prefix-scan")
  @get:JsonGetter("prefixScan")
  @set:JsonSetter("prefixScan")
  var prefixScan: Boolean

  /**
   * Flag: `--narrow-band-cov`
   */
  @DiamondHidden
  @CliFlag("narrow-band-cov")
  @get:JsonGetter("narrowBandCov")
  @set:JsonSetter("narrowBandCov")
  var narrowBandCov: Double

  /**
   * Flag: `--narrow-band-factor`
   */
  @DiamondHidden
  @CliFlag("narrow-band-factor")
  @get:JsonGetter("narrowBandFactor")
  @set:JsonSetter("narrowBandFactor")
  var narrowBandFactor: Double

  /**
   * Flag: `--anchor-window`
   *
   * Default: `12`
   */
  @DiamondHidden
  @CliFlag("anchor-window")
  @get:JsonGetter("anchorWindow")
  @set:JsonSetter("anchorWindow")
  var anchorWindow: Int

  /**
   * Flag: `--anchor-score`
   *
   * Default: `1.0`
   */
  @DiamondHidden
  @CliFlag("anchor-score")
  @get:JsonGetter("anchorScore")
  @set:JsonSetter("anchorScore")
  var anchorScore: Double

  /**
   * Flag: `--classic-band`
   */
  @DiamondHidden
  @CliFlag("classic-band")
  @get:JsonGetter("classicBand")
  @set:JsonSetter("classicBand")
  var classicBand: Boolean

  /**
   * Flag: `--no_8bit_extension`
   */
  @DiamondHidden
  @CliFlag("no_8bit_extension")
  @get:JsonGetter("no8BitExtension")
  @set:JsonSetter("no8BitExtension")
  var no8BitExtension: Boolean

  /**
   * Flag: `--anchored-swipe`
   */
  @DiamondHidden
  @CliFlag("anchored-swipe")
  @get:JsonGetter("anchoredSwipe")
  @set:JsonSetter("anchoredSwipe")
  var anchoredSwipe: Boolean

  /**
   * Flag: `--no_chaining_merge_hsps`
   */
  @DiamondHidden
  @CliFlag("no_chaining_merge_hsps")
  @get:JsonGetter("noChainingMergeHSPs")
  @set:JsonSetter("noChainingMergeHSPs")
  var noChainingMergeHSPs: Boolean

  /**
   * Flag: `--pipeline-short`
   */
  @DiamondHidden
  @CliFlag("pipeline-short")
  @get:JsonGetter("pipelineShort")
  @set:JsonSetter("pipelineShort")
  var pipelineShort: Boolean

  /**
   * Flag: `--graph-algo`
   *
   * Default: [GraphAlgorithm.GreedyVortexCover]
   */
  @DiamondHidden
  @CliFlag("graph-algo")
  @get:JsonGetter("graphAlgo")
  @set:JsonSetter("graphAlgo")
  var graphAlgo: GraphAlgorithm

  /**
   * Flag: `--tsv-read-size`
   *
   * Default: `1073741824`
   */
  @DiamondHidden
  @CliFlag("tsv-read-size")
  @get:JsonGetter("tsvReadSize")
  @set:JsonSetter("tsvReadSize")
  var tsvReadSize: Long

  /**
   * Flag: `--min-len-ratio`
   */
  @DiamondHidden
  @CliFlag("min-len-ratio")
  @get:JsonGetter("minLenRatio")
  @set:JsonSetter("minLenRatio")
  var minLenRatio: Double

  /**
   * Flag: `--max-indirection`
   */
  @DiamondHidden
  @CliFlag("max-indirection")
  @get:JsonGetter("maxIndirection")
  @set:JsonSetter("maxIndirection")
  var maxIndirection: Int

  /**
   * Flag: `--aln-out`
   */
  @DiamondHidden
  @CliFlag("aln-out")
  @get:JsonGetter("alnOut")
  @set:JsonSetter("alnOut")
  var alnOut: Path
}
