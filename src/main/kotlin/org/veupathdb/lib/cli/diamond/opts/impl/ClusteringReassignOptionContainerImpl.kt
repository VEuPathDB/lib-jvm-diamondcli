package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.doubleFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringReassignOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.MemoryLimit
import org.veupathdb.lib.cli.diamond.util.customFlag

internal class ClusteringReassignOptionContainerImpl : ClusteringReassignOptionContainer {
  override var memoryLimit by customFlag<MemoryLimit>()
  override var memberCover by doubleFlag { default = 80.0 }
  override var mutualCover by doubleFlag()
}
