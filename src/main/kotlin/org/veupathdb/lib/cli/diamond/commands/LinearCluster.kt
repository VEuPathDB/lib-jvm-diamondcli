package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*

// LINCLUST
interface LinearCluster
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , AlignerClusteringRealignOptionContainer
  , AlignerClusteringOptionContainer
  , ClusteringGeneralOptionContainer
  , ClusteringReassignOptionContainer
  , AdvancedGeneralOptionContainer
  , AdvancedClusteringAlignmentOptionContainer
  , HiddenOptionContainer
