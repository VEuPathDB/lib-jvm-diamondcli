package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.ClusterRealign
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*

internal class ClusterRealignImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignClusterRealignOptions: AlignerClusteringRealignOptionContainer = AlignerClusteringRealignOptionContainerImpl(),
  private val outputFormatOptions: OutputFormatOptionContainer = OutputFormatOptionContainerImpl(),
  private val clusteringInputOptions: ClusteringInputOptionContainer = ClusteringInputOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : ClusterRealign
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerClusteringRealignOptionContainer by alignClusterRealignOptions
  , OutputFormatOptionContainer by outputFormatOptions
  , ClusteringInputOptionContainer by clusteringInputOptions
  , HiddenOptionContainer by hiddenOptions
