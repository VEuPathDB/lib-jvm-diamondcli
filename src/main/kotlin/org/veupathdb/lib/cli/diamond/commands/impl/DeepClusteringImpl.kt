package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.DeepClustering
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*
import org.veupathdb.lib.cli.diamond.opts.impl.AdvancedClusteringAlignmentOptionContainerImpl

internal class DeepClusteringImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignClusterRealignOptions: AlignerClusteringRealignOptionContainer = AlignerClusteringRealignOptionContainerImpl(),
  private val alignClusterOptions: AlignerClusteringOptionContainer = AlignerClusteringOptionContainerImpl(),
  private val clusteringGeneralOptions: ClusteringGeneralOptionContainer = ClusteringGeneralOptionContainerImpl(),
  private val clusteringReassignOptions: ClusteringReassignOptionContainer = ClusteringReassignOptionContainerImpl(),
  private val advancedGeneralOptions: AdvancedGeneralOptionContainer = AdvancedGeneralOptionContainerImpl(),
  private val advancedClusterAlignOptions: AdvancedClusteringAlignmentOptionContainer = AdvancedClusteringAlignmentOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : DeepClustering
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerClusteringRealignOptionContainer by alignClusterRealignOptions
  , AlignerClusteringOptionContainer by alignClusterOptions
  , ClusteringGeneralOptionContainer by clusteringGeneralOptions
  , ClusteringReassignOptionContainer by clusteringReassignOptions
  , AdvancedGeneralOptionContainer by advancedGeneralOptions
  , AdvancedClusteringAlignmentOptionContainer by advancedClusterAlignOptions
  , HiddenOptionContainer by hiddenOptions
