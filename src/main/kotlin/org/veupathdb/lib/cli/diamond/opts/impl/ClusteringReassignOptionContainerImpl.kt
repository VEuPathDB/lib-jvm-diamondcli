package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.doubleFlag
import io.foxcapades.lib.cli.wrapper.flag.stringFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringReassignOptionContainer

class ClusteringReassignOptionContainerImpl : ClusteringReassignOptionContainer {
  override var memoryLimit by stringFlag()
  override var memberCover by doubleFlag { default = 80.0 }
  override var mutualCover by doubleFlag()
}
