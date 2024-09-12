package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.ClusteringGeneralOptionContainer

internal class ClusteringGeneralOptionContainerImpl : ClusteringGeneralOptionContainer {
  override var clusterSteps by flag<List<String>> { shouldQuote = false }
  override var kmerRanking by toggleFlag()
  override var roundCoverage by flag<List<String>> { shouldQuote = false }
  override var roundApproxID by flag<List<String>> { shouldQuote = false }
}
