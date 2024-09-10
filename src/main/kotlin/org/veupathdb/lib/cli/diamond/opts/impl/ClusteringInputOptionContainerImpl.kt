package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringInputOptionContainer

internal class ClusteringInputOptionContainerImpl : ClusteringInputOptionContainer {
  override var clustersFile by pathFlag()
}
