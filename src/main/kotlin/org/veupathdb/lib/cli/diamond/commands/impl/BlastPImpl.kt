package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.builder.arg.filter.ArgumentPredicate
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.arg.format.BooleanFormat
import io.foxcapades.lib.cli.builder.flag.*
import org.veupathdb.lib.cli.diamond.DiamondHidden
import org.veupathdb.lib.cli.diamond.commands.BlastP
import org.veupathdb.lib.cli.diamond.opts.fields.*
import org.veupathdb.lib.cli.diamond.opts.fields.output_format.OutFormatFormatter
import org.veupathdb.lib.cli.diamond.opts.fields.output_format.OutputFormatOptions
import org.veupathdb.lib.cli.diamond.util.DefaultableProperty
import org.veupathdb.lib.cli.diamond.util.customFlag
import org.veupathdb.lib.cli.diamond.util.listFlag
import java.nio.file.Path

internal class BlastPImpl : BlastP {
  // region GeneralOptionContainer

  override var threads by intFlag { argument.filter = ArgumentPredicate { it > 0 } }
  override var verbose by toggleFlag()
  override var log by toggleFlag()
  override var quiet by toggleFlag()
  override var tempDir by pathFlag()

  // endregion GeneralOptionContainer

  // region GeneralDBOptionContainer

  override var databaseFile by pathFlag()

  // endregion GeneralDBOptionContainer

  // region GeneralOutputHeaderOptionContainer

  override var header by flag<HeaderOption> { formatter = HeaderOptionFormatter }

  // endregion GeneralOutputHeaderOptionContainer

  // region GeneralOutputOptions

  override var outputFile by pathFlag()

  // endregion GeneralOutputOptions

  // region AlignerClusteringRealignOptionContainer

  override var compBasedStats by customFlag<CompositionBasedStats>()
  override var masking by customFlag<MaskingMode>()
  override var softMasking by customFlag<SoftMaskingAlgorithm>()
  override var mmseqsCompat by toggleFlag()
  override var noBlockSizeLimit by toggleFlag()

  // endregion AlignerClusteringRealignOptionContainer

  // region AlignerClusteringOptionContainer

  override var expectValue by doubleFlag()
  override var motifMasking by customFlag<MotifMaskingAlgorithm>()
  override var approxIdentity by doubleFlag()
  override var extensionMode by customFlag<ExtensionMode>()

  // endregion AlignerClusteringOptionContainer

  // region AlignerGeneralOptionContainer

  override var query by listFlag<Path>()
  override var strand by customFlag<QueryStrand>()
  override var unalignedFile by pathFlag()
  override var alignedFile by pathFlag()
  override var unalignedFileFormat by customFlag<QueryFileFormat>()
  override var alignedFileFormat by customFlag<QueryFileFormat>()
  override var reportUnalignedQueries by boolFlag { formatter = BooleanFormat.Binary }
  override var maxHSPs by uintFlag()
  override var rangeCulling by toggleFlag()
  override var compress by customFlag<Compression>()
  override var minScore by doubleFlag()
  override var minimumIdentityPercentage by doubleFlag()
  override var minimumQueryCoverPercentage by doubleFlag()
  override var minimumSubjectCoverPercentage by doubleFlag()
  override var swipe by toggleFlag()
  override var iterate by listFlag<Sensitivity>()
  override var globalRanking by longFlag()
  override var blockSize by doubleFlag()
  override var indexChunks by uintFlag()
  override var parallelTmpDir by pathFlag()
  override var gapOpenPenalty by intFlag()
  override var gapExtendPenalty by intFlag()
  override var matrix by customFlag<ScoreMatrix>()
  override var customMatrix by pathFlag()
  override var frameShiftPenalty by intFlag()
  override var longReads by toggleFlag()
  override var queryGenCode by customFlag<TranslatorGenCode>()
  override var includeFullSubjectTitles by toggleFlag()
  override var includeAllSubjectIDs by toggleFlag()
  override var noSelfHits by toggleFlag()
  override var taxonList by flag<List<String>> { formatter = ArgumentFormatter { it.joinToString(",") } }
  override var taxonExclude by flag<List<String>> { formatter = ArgumentFormatter { it.joinToString(",") } }
  override var seqIdList by pathFlag()
  override var skipMissingSeqIDs by toggleFlag()

  // endregion AlignerGeneralOptionContainer

  // region AlignerSensitivityOptionContainer

  override var sensitivity by DefaultableProperty(Sensitivity.Default)
  override var shapes by uintFlag()

  // endregion AlignerSensitivityOptionContainer

  // region AlignerViewOptionContainer

  override var maxTargetSeqs by longFlag()
  override var top by doubleFlag()

  // endregion AlignerViewOptionContainer

  // region OutputFormatOptionContainer

  override var outputFormat by flag<OutputFormatOptions> { formatter = OutFormatFormatter }
  override var includeLineage by toggleFlag()

  // endregion OutputFormatOptionContainer

  // region AdvancedGeneralOptionContainer

  override var fileBufferSize by ulongFlag()
  override var noUnlink by toggleFlag()
  override var ignoreWarnings by toggleFlag()
  override var noParseSeqIDs by toggleFlag()

  // endregion AdvancedGeneralOptionContainer

  // region AdvancedClusteringAlignmentOptionContainer

  override var bins by uintFlag()
  override var extChunkSize by ulongFlag()
  override var noRanking by toggleFlag()
  override var dbSize by ulongFlag()
  override var noAutoAppend by toggleFlag()
  override var tantanMinMaskProb by doubleFlag()

  // endregion AdvancedClusteringAlignmentOptionContainer

  // region AdvancedQueryOptionContainer

  override var algo by customFlag<SeedSearchAlgorithm>()
  override var minOrf by uintFlag()
  override var seedCut by doubleFlag()
  override var freqMasking by toggleFlag()
  override var freqStandardDeviation by doubleFlag()
  override var id2 by uintFlag()
  override var linsearch by toggleFlag()
  override var linStage1 by toggleFlag()
  override var xDrop by doubleFlag()
  override var gappedFilterEValue by doubleFlag()
  override var band by intFlag()
  override var shapeMask by flag<List<String>> { shouldQuote = false }
  override var multiprocessing by toggleFlag()
  override var mpInit by toggleFlag()
  override var mpRecover by toggleFlag()
  override var mpQueryChunk by intFlag()
  override var cullingOverlap by doubleFlag()
  override var taxonK by ulongFlag()
  override var rangeCover by doubleFlag()
  override var xmlBlOrdFormat by toggleFlag()
  override var samQueryLen by toggleFlag()
  override var stopMatchScore by intFlag()
  override var targetIndexed by toggleFlag()
  override var unalignedTargets by pathFlag()
  override var cutBar by toggleFlag()
  override var checkMultiTarget by toggleFlag()
  override var rocFile by pathFlag()
  override var familyMap by pathFlag()
  override var familyMapQuery by pathFlag()
  override var queryParallelLimit by uintFlag()
  override var logEValueScale by doubleFlag()
  override var bootstrap by toggleFlag()
  override var heartbeat by toggleFlag()
  override var mpSelf by toggleFlag()
  override var zDrop by intFlag()
  override var repetitionCutoff by doubleFlag()
  override var extension by customFlag<DNAExtensionAlgorithm>()
  override var chainingOut by toggleFlag()
  override var alignLongReads by toggleFlag()
  override var chainPenGapScale by doubleFlag()
  override var chainPenSkipScale by doubleFlag()
  override var penalty by intFlag()
  override var reward by intFlag()
  override var queryOrSubjectCover by doubleFlag()

  // endregion AdvancedQueryOptionContainer

  // region ViewAlignOptionContainer

  override var daa by pathFlag()

  // endregion ViewAlignOptionContainer

  // region HiddenOptionContainer

  @DiamondHidden override var maximumSeedFrequency by doubleFlag()
  @DiamondHidden override var spacePenalty by doubleFlag()
  @DiamondHidden override var reverse by toggleFlag()
  @DiamondHidden override var neighborhoodScore by intFlag()
  @DiamondHidden override var seedWeight by uintFlag()
  @DiamondHidden override var idLeft by uintFlag()
  @DiamondHidden override var idRight by uintFlag()
  @DiamondHidden override var idN by uintFlag()
  @DiamondHidden override var bMatch by intFlag()
  @DiamondHidden override var bMismatch by intFlag()
  @DiamondHidden override var bCutoff by intFlag()
  @DiamondHidden override var ants by ulongFlag()
  @DiamondHidden override var rho by doubleFlag()
  @DiamondHidden override var pBest by doubleFlag()
  @DiamondHidden override var dExp by doubleFlag()
  @DiamondHidden override var dNew by doubleFlag()
  @DiamondHidden override var scoreEstimateFactor by doubleFlag()
  @DiamondHidden override var diagMinEstimate by intFlag()
  @DiamondHidden override var pathCutoff by doubleFlag()
  @DiamondHidden override var useSmithWaterman by toggleFlag()
  @DiamondHidden override var superblock by intFlag()
  @DiamondHidden override var maxCells by uintFlag()
  @DiamondHidden override var loadBalancing by uintFlag()
  @DiamondHidden override var logQuery by toggleFlag()
  @DiamondHidden override var logSubject by toggleFlag()
  @DiamondHidden override var pAlign by uintFlag()
  @DiamondHidden override var scoreRatio by doubleFlag()
  @DiamondHidden override var fetchSize by uintFlag()
  @DiamondHidden override var targetFetchSize by uintFlag()
  @DiamondHidden override var rankFactor by doubleFlag()
  @DiamondHidden override var transcriptLenEstimate by doubleFlag()
  @DiamondHidden override var familyCountsFile by pathFlag()
  @DiamondHidden override var radixClusterBuffered by toggleFlag()
  @DiamondHidden override var joinSplitSize by uintFlag()
  @DiamondHidden override var joinSplitKeyLen by uintFlag()
  @DiamondHidden override var radixBits by customFlag<RadixBits>()
  @DiamondHidden override var joinHTFactor by doubleFlag()
  @DiamondHidden override var sortJoin by toggleFlag()
  @DiamondHidden override var simpleFreq by toggleFlag()
  @DiamondHidden override var freqThreshold by doubleFlag()
  @DiamondHidden override var useDatasetField by toggleFlag()
  @DiamondHidden override var storeQueryQuality by toggleFlag()
  @DiamondHidden override var swipeChunkSize by uintFlag()
  @DiamondHidden override var hardMasked by toggleFlag()
  @DiamondHidden override var cbsWindow by intFlag()
  @DiamondHidden override var noDict by toggleFlag()
  @DiamondHidden override var upGmaEdgeLimit by ulongFlag()
  @DiamondHidden override var tree by pathFlag()
  @DiamondHidden override var upGmaDist by customFlag<DistributionType>()
  @DiamondHidden override var upGmaInput by customFlag<InputType>()
  @DiamondHidden override var logExtend by toggleFlag()
  @DiamondHidden override var chainingMaxGap by intFlag()
  @DiamondHidden override var tantanMaxRepeatOffset by intFlag()
  @DiamondHidden override var tantanUngapped by toggleFlag()
  @DiamondHidden override var chainingRangeCover by ulongFlag()
  @DiamondHidden override var noSwipeRealign by toggleFlag()
  @DiamondHidden override var chainingMaxNodes by ulongFlag()
  @DiamondHidden override var cutoffScore8Bit by intFlag()
  @DiamondHidden override var minBandOverlap by doubleFlag()
  @DiamondHidden override var minRealignOverhang by intFlag()
  @DiamondHidden override var ungappedWindow by intFlag()
  @DiamondHidden override var gappedFilterDiagBitScore by doubleFlag()
  @DiamondHidden override var gappedFilterWindow by intFlag()
  @DiamondHidden override var outputHits by toggleFlag()
  @DiamondHidden override var ungappedEValue by doubleFlag()
  @DiamondHidden override var ungappedEValueShort by doubleFlag()
  @DiamondHidden override var noLogFile by toggleFlag()
  @DiamondHidden override var bandBin by intFlag()
  @DiamondHidden override var colBin by intFlag()
  @DiamondHidden override var self by toggleFlag()
  @DiamondHidden override var tracePtFetchSize by longFlag()
  @DiamondHidden override var tileSize by uintFlag()
  @DiamondHidden override var shortQueryUngappedBitScore by doubleFlag()
  @DiamondHidden override var shortQueryMaxLen by intFlag()
  @DiamondHidden override var gappedFilterEValue1 by doubleFlag()
  @DiamondHidden override var extYield by doubleFlag()
  @DiamondHidden override var fullSwLen by intFlag()
  @DiamondHidden override var relaxedEValueFactor by doubleFlag()
  @DiamondHidden override var type by customFlag<BenchmarkType>()
  @DiamondHidden override var raw by toggleFlag()
  @DiamondHidden override var chainingLenCap by doubleFlag()
  @DiamondHidden override var chainingMinNodes by ulongFlag()
  @DiamondHidden override var fastTsv by toggleFlag()
  @DiamondHidden override var targetParallelVerbosity by uintFlag()
  @DiamondHidden override var queryMemory by toggleFlag()
  @DiamondHidden override var memoryIntervals by ulongFlag()
  @DiamondHidden override var seedHitDensity by ulongFlag()
  @DiamondHidden override var chunkSizeMultiplier by ulongFlag()
  @DiamondHidden override var rankingScoreDropFactor by doubleFlag()
  @DiamondHidden override var leftMostInterval by intFlag()
  @DiamondHidden override var rankingCutoffBitScore by doubleFlag()
  @DiamondHidden override var noForwardFp by toggleFlag()
  @DiamondHidden override var noRefMasking by toggleFlag()
  @DiamondHidden override var targetBias by toggleFlag()
  @DiamondHidden override var outputFp by toggleFlag()
  @DiamondHidden override var familyCap by intFlag()
  @DiamondHidden override var cbsMatrixScale by intFlag()
  @DiamondHidden override var queryCount by ulongFlag()
  @DiamondHidden override var cbsAngle by doubleFlag()
  @DiamondHidden override var cbsErrTolerance by doubleFlag()
  @DiamondHidden override var cbsItLimit by intFlag()
  @DiamondHidden override var hashJoinSwap by toggleFlag()
  @DiamondHidden override var dequeBucketSize by ulongFlag()
  @DiamondHidden override var queryMatchDistanceThreshold by doubleFlag()
  @DiamondHidden override var lengthRatioThreshold by doubleFlag()
  @DiamondHidden override var maxSwipeDp by longFlag()
  @DiamondHidden override var shortSeqIDs by toggleFlag()
  @DiamondHidden override var noReextend by toggleFlag()
  @DiamondHidden override var noReorder by toggleFlag()
  @DiamondHidden override var file1 by pathFlag()
  @DiamondHidden override var file2 by pathFlag()
  @DiamondHidden override var key2 by ulongFlag()
  @DiamondHidden override var motifMaskFile by pathFlag()
  @DiamondHidden override var maxMotifLen by intFlag()
  @DiamondHidden override var chainingStackedHSPRatio by doubleFlag()
  @DiamondHidden override var swipeTaskSize by longFlag()
  @DiamondHidden override var minimizerWindow by intFlag()
  @DiamondHidden override var minTaskTracePts by longFlag()
  @DiamondHidden override var sketchSize by intFlag()
  @DiamondHidden override var oidList by pathFlag()
  @DiamondHidden override var bootstrapBlock by longFlag()
  @DiamondHidden override var centroidFactor by longFlag()
  @DiamondHidden override var timeout by intFlag()
  @DiamondHidden override var resume by stringFlag()
  @DiamondHidden override var targetHardCap by longFlag()
  @DiamondHidden override var mapAny by toggleFlag()
  @DiamondHidden override var neighbors by stringFlag()
  @DiamondHidden override var reassignOverlap by doubleFlag()
  @DiamondHidden override var reassignRatio by doubleFlag()
  @DiamondHidden override var reassignMax by longFlag()
  @DiamondHidden override var addSelfAln by toggleFlag()
  @DiamondHidden override var weightedGVC by toggleFlag()
  @DiamondHidden override var hammingExt by toggleFlag()
  @DiamondHidden override var diagFilterID by doubleFlag()
  @DiamondHidden override var diagFilterCov by doubleFlag()
  @DiamondHidden override var strictGVC by toggleFlag()
  @DiamondHidden override var dbType by customFlag<SequenceType>()
  @DiamondHidden override var clusterSimilarity by stringFlag()
  @DiamondHidden override var clusterThreshold by doubleFlag()
  @DiamondHidden override var clusterGraphFile by pathFlag()
  @DiamondHidden override var clusterRestart by toggleFlag()
  @DiamondHidden override var mclExpansion by uintFlag()
  @DiamondHidden override var mclInflation by doubleFlag()
  @DiamondHidden override var mclChunkSize by uintFlag()
  @DiamondHidden override var mclMaxIterations by uintFlag()
  @DiamondHidden override var mclSparsitySwitch by doubleFlag()
  @DiamondHidden override var mclNonSymmetric by toggleFlag()
  @DiamondHidden override var mclStats by toggleFlag()
  @DiamondHidden override var clusterAlgo by stringFlag()
  @DiamondHidden override var approxBacktrace by toggleFlag()
  @DiamondHidden override var prefixScan by toggleFlag()
  @DiamondHidden override var narrowBandCov by doubleFlag()
  @DiamondHidden override var narrowBandFactor by doubleFlag()
  @DiamondHidden override var anchorWindow by intFlag()
  @DiamondHidden override var anchorScore by doubleFlag()
  @DiamondHidden override var classicBand by toggleFlag()
  @DiamondHidden override var no8BitExtension by toggleFlag()
  @DiamondHidden override var anchoredSwipe by toggleFlag()
  @DiamondHidden override var noChainingMergeHSPs by toggleFlag()
  @DiamondHidden override var pipelineShort by toggleFlag()
  @DiamondHidden override var graphAlgo by customFlag<GraphAlgorithm>()
  @DiamondHidden override var tsvReadSize by longFlag()
  @DiamondHidden override var minLenRatio by doubleFlag()
  @DiamondHidden override var maxIndirection by intFlag()
  @DiamondHidden override var alnOut by pathFlag()

  // endregion HiddenOptionContainer
}
