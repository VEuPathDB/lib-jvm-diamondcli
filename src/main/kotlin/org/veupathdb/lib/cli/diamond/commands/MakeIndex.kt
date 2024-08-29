package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer

interface MakeIndex
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , AlignerSensitivityOptionContainer
  , HiddenOptionContainer
