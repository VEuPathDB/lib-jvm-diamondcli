package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.ReassignClusters
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*

internal class ReassignClustersImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignClusterRealignOptions: AlignerClusteringRealignOptionContainer = AlignerClusteringRealignOptionContainerImpl(),
  private val alignClusterOptions: AlignerClusteringOptionContainer = AlignerClusteringOptionContainerImpl(),
  private val clusteringReassignOptions: ClusteringReassignOptionContainer = ClusteringReassignOptionContainerImpl(),
  private val clusteringInputOptions: ClusteringInputOptionContainer = ClusteringInputOptionContainerImpl(),
  private val advancedGeneralOptions: AdvancedGeneralOptionContainer = AdvancedGeneralOptionContainerImpl(),
  private val advancedClusterAlignOptions: AdvancedClusteringAlignmentOptionContainer = AdvancedClusteringAlignmentOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : ReassignClusters
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerClusteringRealignOptionContainer by alignClusterRealignOptions
  , AlignerClusteringOptionContainer by alignClusterOptions
  , ClusteringReassignOptionContainer by clusteringReassignOptions
  , ClusteringInputOptionContainer by clusteringInputOptions
  , AdvancedGeneralOptionContainer by advancedGeneralOptions
  , AdvancedClusteringAlignmentOptionContainer by advancedClusterAlignOptions
  , HiddenOptionContainer by hiddenOptions
