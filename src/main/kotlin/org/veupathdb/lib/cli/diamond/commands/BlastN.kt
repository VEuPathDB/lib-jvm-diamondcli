package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.AdvancedClusteringAlignmentOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedQueryOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer

interface BlastN
  : AdvancedGeneralOptionContainer
  , AdvancedClusteringAlignmentOptionContainer
  , AdvancedQueryOptionContainer
  , HiddenOptionContainer
