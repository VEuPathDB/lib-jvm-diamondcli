package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer

interface MakeIndex
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , AlignerSensitivityOptionContainer
