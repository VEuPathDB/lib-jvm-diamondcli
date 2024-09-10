package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.RecomputeClustering
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*

internal class RecomputeClusteringImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignClusterRealignOptions: AlignerClusteringRealignOptionContainer = AlignerClusteringRealignOptionContainerImpl(),
  private val alignClusterOptions: AlignerClusteringOptionContainer = AlignerClusteringOptionContainerImpl(),
  private val clusteringGeneralOptions: ClusteringGeneralOptionContainer = ClusteringGeneralOptionContainerImpl(),
  private val clusteringReassignOptions: ClusteringReassignOptionContainer = ClusteringReassignOptionContainerImpl(),
  private val clusteringInputOptions: ClusteringInputOptionContainer = ClusteringInputOptionContainerImpl(),
  private val advancedClusterAlignOptions: AdvancedClusteringAlignmentOptionContainer = AdvancedClusteringAlignmentOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : RecomputeClustering
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerClusteringRealignOptionContainer by alignClusterRealignOptions
  , AlignerClusteringOptionContainer by alignClusterOptions
  , ClusteringGeneralOptionContainer by clusteringGeneralOptions
  , ClusteringReassignOptionContainer by clusteringReassignOptions
  , ClusteringInputOptionContainer by clusteringInputOptions
  , AdvancedClusteringAlignmentOptionContainer by advancedClusterAlignOptions
  , HiddenOptionContainer by hiddenOptions
