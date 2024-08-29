package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*

// CLUSTER_REASSIGN
interface ReassignClusters
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , AlignerClusteringRealignOptionContainer
  , AlignerClusteringOptionContainer
  , ClusteringReassignOptionContainer
  , ClusteringInputOptionContainer
  , AdvancedGeneralOptionContainer
  , AdvancedClusteringAlignmentOptionContainer
  , HiddenOptionContainer
