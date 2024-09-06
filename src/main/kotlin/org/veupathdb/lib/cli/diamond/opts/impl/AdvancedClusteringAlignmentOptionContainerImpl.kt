package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.booleanFlag
import io.foxcapades.lib.cli.wrapper.flag.doubleFlag
import io.foxcapades.lib.cli.wrapper.flag.uintFlag
import io.foxcapades.lib.cli.wrapper.flag.ulongFlag
import org.veupathdb.lib.cli.diamond.opts.AdvancedClusteringAlignmentOptionContainer

internal class AdvancedClusteringAlignmentOptionContainerImpl : AdvancedClusteringAlignmentOptionContainer {
  override var bins by uintFlag()

  override var extChunkSize by ulongFlag()

  override var noRanking by booleanFlag { isToggleFlag = true }

  override var dbSize by ulongFlag()

  override var noAutoAppend by booleanFlag { isToggleFlag = true }

  override var tantanMinMaskProb by doubleFlag { default = 0.9 }
}
