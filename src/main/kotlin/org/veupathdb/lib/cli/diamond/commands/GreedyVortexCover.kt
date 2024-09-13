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
import io.foxcapades.lib.cli.builder.command.CliCommand
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.fields.EdgeFormat
import java.nio.file.Path

@CliCommand(Command, SubCommands.GreedyVortexCover)
interface GreedyVortexCover
  : DiamondCommandConfig
  , GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , ClusteringReassignOptionContainer
  , HiddenOptionContainer
{
  /**
   * Output file for centroids
   *
   * Flag: `--centroid-out`
   */
  @CliFlag("centroid-out")
  @get:JsonGetter("centroidOut")
  @set:JsonSetter("centroidOut")
  var centroidOut: Path?

  /**
   * Input file for greedy vertex cover
   *
   * Flag: `--edges`
   */
  @CliFlag("edges")
  @get:JsonGetter("edges")
  @set:JsonSetter("edges")
  var edges: Path?

  /**
   * Edge format for greedy vertex cover.
   *
   * Flag: `--edge-format`
   */
  @CliFlag("edge-format")
  @get:JsonGetter("edgeFormat")
  @set:JsonSetter("edgeFormat")
  var edgeFormat: EdgeFormat?

  /**
   * Edges are symmetric
   *
   * Flag: `--symmetric`
   */
  @CliFlag("symmetric")
  @get:JsonGetter("symmetric")
  @set:JsonSetter("symmetric")
  var symmetric: Boolean?

  /**
   * Do not reassign to the closest representative.
   *
   * Flag: `--no-reassign`
   */
  @CliFlag("no-reassign")
  @get:JsonGetter("noReassign")
  @set:JsonSetter("noReassign")
  var noReassign: Boolean?

  /**
   * Depth to cluster connected components.
   *
   * Flag: `--connected-component-depth`
   */
  @CliFlag("connected-component-depth")
  @get:JsonGetter("connectedComponentDepth")
  @set:JsonSetter("connectedComponentDepth")
  var connectedComponentDepth: List<String>?

  override val tool: DiamondCommand
    get() = DiamondCommand.GreedyVortexCover
}
