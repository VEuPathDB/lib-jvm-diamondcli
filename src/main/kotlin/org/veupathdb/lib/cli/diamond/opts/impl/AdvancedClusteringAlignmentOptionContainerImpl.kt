package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.doubleFlag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import io.foxcapades.lib.cli.builder.flag.uintFlag
import io.foxcapades.lib.cli.builder.flag.ulongFlag
import org.veupathdb.lib.cli.diamond.opts.AdvancedClusteringAlignmentOptionContainer

internal class AdvancedClusteringAlignmentOptionContainerImpl : AdvancedClusteringAlignmentOptionContainer {
  override var bins by uintFlag()

  override var extChunkSize by ulongFlag()

  override var noRanking by toggleFlag()

  override var dbSize by ulongFlag()

  override var noAutoAppend by toggleFlag()

  override var tantanMinMaskProb by doubleFlag { default = 0.9 }
}
