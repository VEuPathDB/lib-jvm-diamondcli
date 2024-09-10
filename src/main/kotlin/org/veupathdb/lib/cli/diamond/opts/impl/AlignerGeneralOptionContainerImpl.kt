package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.*
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.util.enumFlag
import org.veupathdb.lib.cli.diamond.util.listFlag
import java.nio.file.Path

internal class AlignerGeneralOptionContainerImpl : AlignerGeneralOptionContainer {
  override var query by listFlag<Path>()
  override var strand by enumFlag<QueryStrand>()
  override var unalignedFile by pathFlag()
  override var alignedFile by pathFlag()
  override var unalignedFileFormat by enumFlag<QueryFileFormat>()
  override var alignedFileFormat by enumFlag<QueryFileFormat>()
  override var unal by toggleFlag()
  override var maxHSPs by uintFlag()
  override var rangeCulling by toggleFlag()
  override var compress by enumFlag<Compression>()
  override var minScore by doubleFlag()
  override var minimumIdentityPercentage by doubleFlag()
  override var minimumQueryCoverPercentage by doubleFlag()
  override var minimumSubjectCoverPercentage by doubleFlag()
  override var swipe by toggleFlag()
  override var iterate by listFlag<Sensitivity>()
  override var globalRanking by longFlag()
  override var blockSize by doubleFlag { default = 2.0 }
  override var indexChunks by uintFlag()
  override var parallelTmpDir by pathFlag()
  override var gapOpenPenalty by intFlag { default = -1 }
  override var gapExtendPenalty by intFlag { default = -1 }
  override var matrix by enumFlag<ScoreMatrix> { default = ScoreMatrix.BLOSUM62 }
  override var customMatrix by pathFlag()
  override var frameShiftPenalty by intFlag()
  override var longReads by toggleFlag()
  override var queryGenCode by enumFlag<TranslatorGenCode>()
  override var includeFullSubjectTitles by toggleFlag()
  override var includeAllSubjectIDs by toggleFlag()
  override var noSelfHits by toggleFlag()
  override var taxonList by flag<List<String>> {
    argument.formatter = ArgumentFormatter.simple { it.joinToString(",") }
  }
  override var taxonExclude by flag<List<String>> {
    argument.formatter = ArgumentFormatter.simple { it.joinToString(",") }
  }
  override var seqIdList by pathFlag()
  override var skipMissingSeqIDs by toggleFlag()
}
