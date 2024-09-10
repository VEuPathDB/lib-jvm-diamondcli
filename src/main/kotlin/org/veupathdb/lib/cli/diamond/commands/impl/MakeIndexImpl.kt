package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.MakeIndex
import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.AlignerSensitivityOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralDBOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl

internal class MakeIndexImpl(
  private val generalOptions:          GeneralOptionContainer            = GeneralOptionContainerImpl(),
  private val generalDBOptions:        GeneralDBOptionContainer          = GeneralDBOptionContainerImpl(),
  private val alignSensitivityOptions: AlignerSensitivityOptionContainer = AlignerSensitivityOptionContainerImpl(),
  private val hiddenOptions:           HiddenOptionContainer             = HiddenOptionContainerImpl(),
)
  : MakeIndex
  , GeneralOptionContainer            by generalOptions
  , GeneralDBOptionContainer          by generalDBOptions
  , AlignerSensitivityOptionContainer by alignSensitivityOptions
  , HiddenOptionContainer             by hiddenOptions
