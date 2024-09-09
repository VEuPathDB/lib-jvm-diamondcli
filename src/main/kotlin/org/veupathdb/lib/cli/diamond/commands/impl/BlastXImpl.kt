package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.BlastX
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*

internal class BlastXImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignClusterRealignOptions: AlignerClusteringRealignOptionContainer = AlignerClusteringRealignOptionContainerImpl(),
  private val alignClusterOptions: AlignerClusteringOptionContainer = AlignerClusteringOptionContainerImpl(),
  private val alignGeneralOptions: AlignerGeneralOptionContainer = AlignerGeneralOptionContainerImpl(),
  private val alignSensitivityOptions: AlignerSensitivityOptionContainer = AlignerSensitivityOptionContainerImpl(),
  private val alignViewOptions: AlignerViewOptionContainer = AlignerViewOptionContainerImpl(),
  private val outputFormatOptions: OutputFormatOptionContainer = OutputFormatOptionContainerImpl(),
  private val advancedGeneralOptions: AdvancedGeneralOptionContainer = AdvancedGeneralOptionContainerImpl(),
  private val advancedClusterAlignOptions: AdvancedClusteringAlignmentOptionContainer = AdvancedClusteringAlignmentOptionContainerImpl(),
  private val advancedQueryOptions: AdvancedQueryOptionContainer = AdvancedQueryOptionContainerImpl(),
  private val viewAlignOptions: ViewAlignOptionContainer = ViewAlignOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : BlastX
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerClusteringRealignOptionContainer by alignClusterRealignOptions
  , AlignerClusteringOptionContainer by alignClusterOptions
  , AlignerGeneralOptionContainer by alignGeneralOptions
  , AlignerSensitivityOptionContainer by alignSensitivityOptions
  , AlignerViewOptionContainer by alignViewOptions
  , OutputFormatOptionContainer by outputFormatOptions
  , AdvancedGeneralOptionContainer by advancedGeneralOptions
  , AdvancedClusteringAlignmentOptionContainer by advancedClusterAlignOptions
  , AdvancedQueryOptionContainer by advancedQueryOptions
  , ViewAlignOptionContainer by viewAlignOptions
  , HiddenOptionContainer by hiddenOptions
