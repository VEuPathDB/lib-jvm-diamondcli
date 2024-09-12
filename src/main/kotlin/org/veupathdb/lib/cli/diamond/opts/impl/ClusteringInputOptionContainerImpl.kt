package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringInputOptionContainer

internal class ClusteringInputOptionContainerImpl : ClusteringInputOptionContainer {
  override var clustersFile by pathFlag()
}
