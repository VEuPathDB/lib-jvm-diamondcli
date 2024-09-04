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

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.wrapper.meta.CliCommand
import org.veupathdb.lib.cli.diamond.opts.*
import java.nio.file.Path

@CliCommand(Command, SubCommands.GreedyVortexCover)
interface GreedyVortexCover
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , ClusteringReassignOptionContainer
  , HiddenOptionContainer
{
  // Output file for centroids
  // `--centroid-out`
  // Default = ``
  // Type = `string`
  // Config Var = `centroid_out`
  @get:JsonGetter("centroidOut")
  @set:JsonSetter("centroidOut")
  var centroidOut: Path

  // Input file for greedy vertex cover
  // `--edges`
  // Default = ``
  // Type = `string`
  // Config Var = `edges`
  @get:JsonGetter("edges")
  @set:JsonSetter("edges")
  var edges: Path

  // Edge format for greedy vertex cover (default/triplet)
  // `--edge-format`
  // Default = ``
  // Type = `string`
  // Config Var = `edge_format`
  @get:JsonGetter("edgeFormat")
  @set:JsonSetter("edgeFormat")
  var edgeFormat: String // TODO enum this

  // Edges are symmetric
  // `--symmetric`
  // Default = ``
  // Type = `bool`
  // Config Var = `symmetric`
  @get:JsonGetter("symmetric")
  @set:JsonSetter("symmetric")
  var symmetric: Boolean

  // Do not reassign to closest representative
  // `--no-reassign`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_gvc_reassign`
  @get:JsonGetter("noReassign")
  @set:JsonSetter("noReassign")
  var noReassign: Boolean

  // Depth to cluster connected components
  // `--connected-component-depth`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `connected_component_depth`
  @get:JsonGetter("connectedComponentDepth")
  @set:JsonSetter("connectedComponentDepth")
  var connectedComponentDepth: List<String>
}
