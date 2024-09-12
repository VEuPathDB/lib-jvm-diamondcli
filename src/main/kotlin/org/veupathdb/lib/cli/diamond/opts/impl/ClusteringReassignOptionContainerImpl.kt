package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.doubleFlag
import io.foxcapades.lib.cli.builder.flag.stringFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringReassignOptionContainer

internal class ClusteringReassignOptionContainerImpl : ClusteringReassignOptionContainer {
  override var memoryLimit by stringFlag()
  override var memberCover by doubleFlag { default = 80.0 }
  override var mutualCover by doubleFlag()
}
