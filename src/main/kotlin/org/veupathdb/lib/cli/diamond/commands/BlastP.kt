package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*

interface BlastP
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , AlignerClusteringRealignOptionContainer
  , AlignerClusteringOptionContainer
  , AlignerGeneralOptionContainer
  , AlignerSensitivityOptionContainer
  , AlignerViewOptionContainer
  , OutputFormatOptionContainer
  , AdvancedGeneralOptionContainer
