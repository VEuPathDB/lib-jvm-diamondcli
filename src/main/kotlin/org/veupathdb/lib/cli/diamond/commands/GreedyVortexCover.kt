package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*

interface GreedyVortexCover
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , ClusteringReassignOptionContainer
{
  ("centroid-out", 0, "Output file for centroids", centroid_out)
  ("edges", 0, "Input file for greedy vertex cover", edges)
  ("edge-format", 0, "Edge format for greedy vertex cover (default/triplet)", edge_format)
  ("symmetric", 0, "Edges are symmetric", symmetric)
  ("no-reassign", 0, "Do not reassign to closest representative", no_gvc_reassign)
  ("connected-component-depth", 0, "Depth to cluster connected components", connected_component_depth);
}