package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.*
import org.veupathdb.lib.cli.diamond.opts.AdvancedQueryOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.DNAExtensionAlgorithm
import org.veupathdb.lib.cli.diamond.opts.fields.SeedSearchAlgorithm
import org.veupathdb.lib.cli.diamond.util.customFlag

internal class AdvancedQueryOptionContainerImpl : AdvancedQueryOptionContainer {
  override var algo by customFlag<SeedSearchAlgorithm>()
  override var minOrf by uintFlag()
  override var seedCut by doubleFlag()
  override var freqMasking by toggleFlag()
  override var freqStandardDeviation by doubleFlag { default = 0.0 }
  override var id2 by uintFlag()
  override var linsearch by toggleFlag()
  override var linStage1 by toggleFlag()
  override var xDrop by doubleFlag { default = 12.3 }
  override var gappedFilterEValue by doubleFlag { default = -1.0 }
  override var band by intFlag()
  override var shapeMask by flag<List<String>> { shouldQuote = false }
  override var multiprocessing by toggleFlag()
  override var mpInit by toggleFlag()
  override var mpRecover by toggleFlag()
  override var mpQueryChunk by intFlag { default = -1 }
  override var cullingOverlap by doubleFlag { default = 50.0 }
  override var taxonK by ulongFlag { default = 0uL }
  override var rangeCover by doubleFlag { default = 50.0 }
  override var xmlBlOrdFormat by toggleFlag()
  override var samQueryLen by toggleFlag()
  override var stopMatchScore by intFlag { default = 1 }
  override var targetIndexed by toggleFlag()
  override var unalignedTargets by pathFlag()
  override var cutBar by toggleFlag()
  override var checkMultiTarget by toggleFlag()
  override var rocFile by pathFlag()
  override var familyMap by pathFlag()
  override var familyMapQuery by pathFlag()
  override var queryParallelLimit by uintFlag { default = 3000000u }
  override var logEValueScale by doubleFlag()
  override var bootstrap by toggleFlag()
  override var heartbeat by toggleFlag()
  override var mpSelf by toggleFlag()
  override var zDrop by intFlag { default = 40 }
  override var repetitionCutoff by doubleFlag { default = 0.0002 }
  override var extension by customFlag<DNAExtensionAlgorithm> { default = DNAExtensionAlgorithm.KSW }
  override var chainingOut by toggleFlag()
  override var alignLongReads by toggleFlag()
  override var chainPenGapScale by doubleFlag { default = 0.8 }
  override var chainPenSkipScale by doubleFlag { default = 0.0 }
  override var penalty by intFlag { default = -3 }
  override var reward by intFlag { default = 2 }
  override var queryOrSubjectCover by doubleFlag()
}
