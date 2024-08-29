package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.AdvancedClusteringAlignmentOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.AdvancedQueryOptionContainer

interface BlastN
  : AdvancedGeneralOptionContainer
  , AdvancedClusteringAlignmentOptionContainer
  , AdvancedQueryOptionContainer
