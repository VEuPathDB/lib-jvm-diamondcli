package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.DiamondExtras
import org.veupathdb.lib.cli.diamond.commands.BlastN
import org.veupathdb.lib.cli.diamond.opts.AdvancedClusteringAlignmentOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedQueryOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.AdvancedClusteringAlignmentOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.AdvancedGeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.AdvancedQueryOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl

@DiamondExtras
internal class BlastNImpl(
  private val advancedGeneral: AdvancedGeneralOptionContainer = AdvancedGeneralOptionContainerImpl(),
  private val advancedClustering: AdvancedClusteringAlignmentOptionContainer = AdvancedClusteringAlignmentOptionContainerImpl(),
  private val advancedQuery: AdvancedQueryOptionContainer = AdvancedQueryOptionContainerImpl(),
  private val hidden: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : BlastN
  , AdvancedGeneralOptionContainer by advancedGeneral
  , AdvancedClusteringAlignmentOptionContainer by advancedClustering
  , AdvancedQueryOptionContainer by advancedQuery
  , HiddenOptionContainer by hidden
