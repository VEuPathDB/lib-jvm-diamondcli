package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.flag.pathFlag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.commands.GreedyVortexCover
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.fields.EdgeFormat
import org.veupathdb.lib.cli.diamond.opts.impl.*
import org.veupathdb.lib.cli.diamond.util.customFlag

internal class GreedyVortexCoverImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val clusteringReassignOptions: ClusteringReassignOptionContainer = ClusteringReassignOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : GreedyVortexCover
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , ClusteringReassignOptionContainer by clusteringReassignOptions
  , HiddenOptionContainer by hiddenOptions
{
  override var centroidOut by pathFlag()
  override var edges by pathFlag()
  override var edgeFormat by customFlag<EdgeFormat>()
  override var symmetric by toggleFlag()
  override var noReassign by toggleFlag()
  override var connectedComponentDepth by flag<List<String>> { shouldQuote = false }
}
