/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*

interface GreedyVortexCover
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , ClusteringReassignOptionContainer
  , HiddenOptionContainer
{
  ("centroid-out", 0, "Output file for centroids", centroid_out)
  ("edges", 0, "Input file for greedy vertex cover", edges)
  ("edge-format", 0, "Edge format for greedy vertex cover (default/triplet)", edge_format)
  ("symmetric", 0, "Edges are symmetric", symmetric)
  ("no-reassign", 0, "Do not reassign to closest representative", no_gvc_reassign)
  ("connected-component-depth", 0, "Depth to cluster connected components", connected_component_depth);
}