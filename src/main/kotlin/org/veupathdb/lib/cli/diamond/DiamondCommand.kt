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

package org.veupathdb.lib.cli.diamond

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.TextNode
import org.veupathdb.lib.cli.diamond.commands.SubCommands
import org.veupathdb.lib.cli.diamond.util.invalid
import kotlin.jvm.Throws

/**
 * Enum of DIAMOND commands.
 *
 * DIAMOND Docs:
 * > Commands are issued as the first parameter on the command line and set the
 * > task to be run by the program.
 *
 * @since v1.0.0
 */
enum class DiamondCommand(@get:JsonValue val command: String) {
  /**
   * Create a DIAMOND formatted reference database from a FASTA input file.
   */
  MakeDB(SubCommands.MakeDB),

  /**
   * Prepare BLAST database for use with Diamond. This call requires the path
   * to the BLAST database (option `-d`) and will write a number of small
   * auxiliary files into the database directory.
   */
  PrepDB(SubCommands.PrepDB),

  /**
   * Align protein query sequences against a protein reference database.
   */
  BlastP(SubCommands.BlastP),

  /**
   * Align translated DNA query sequences against a protein reference database.
   */
  BlastX(SubCommands.BlastX),

  /**
   * Generate formatted output from DAA files.
   */
  View(SubCommands.View),

  /**
   * Print information about a database file.
   */
  DBInfo(SubCommands.DBInfo),

  /**
   * Print version information.
   */
  Version(SubCommands.Version),

  /**
   * Print help message.
   */
  Help(SubCommands.Help),

  /**
   * Run a series of test cases and verify the output against reference hashes.
   *
   * This command will exit with code `0` if all tests have passed and `1`
   * otherwise.
   *
   * Running this command requires write access to the current working
   * directory.
   */
  Test(SubCommands.Test),

  /**
   * Cluster protein sequences
   */
  Cluster(SubCommands.Cluster),

  /**
   * Cluster protein sequences in linear time
   */
  LinearCluster(SubCommands.LinearCluster),

  /**
   * Realign clustered sequences against their centroids
   */
  ClusterRealign(SubCommands.ClusterRealign),

  /**
   * Recompute clustering to fix errors
   */
  RecomputeClustering(SubCommands.RecomputeClustering),

  /**
   * Reassign clustered sequences to the closest centroid
   */
  ReassignClusters(SubCommands.ReassignClusters),

  /**
   * Merge DAA files
   */
  MergeDAA(SubCommands.MergeDAA),

  /**
   * Retrieve sequences from a DIAMOND database file
   */
  GetSeq(SubCommands.GetSeq),

  /**
   * Make database index
   */
  MakeIndex(SubCommands.MakeIndex),

  /**
   * Compute greedy vertex cover
   */
  GreedyVortexCover(SubCommands.GreedyVortexCover),

  /**
   * ???
   */
  ROC(SubCommands.ROC),

  /**
   * ???
   */
  Benchmark(SubCommands.Benchmark),

  /**
   * ???
   */
  DeepClustering(SubCommands.DeepClustering),

  /**
   * ???
   */
  @DiamondExtras
  RandomSeqs(SubCommands.RandomSeqs),

  /**
   * ???
   */
  @DiamondExtras
  Sort(SubCommands.Sort),

  /**
   * ???
   */
  @DiamondExtras
  DBStats(SubCommands.DBStats),

  /**
   * ???
   */
  @DiamondExtras
  Mask(SubCommands.Mask),

  /**
   * ???
   */
  @DiamondExtras
  FastQ2FastA(SubCommands.FastQ2FastA),

  /**
   * ???
   */
  @DiamondExtras
  ReadSim(SubCommands.ReadSim),

  /**
   * ???
   */
  @DiamondExtras
  SeedStat(SubCommands.SeedStat),

  /**
   * ???
   */
  @DiamondExtras
  SmithWaterman(SubCommands.SmithWaterman),

  /**
   * ???
   */
  @DiamondExtras
  Translate(SubCommands.Translate),

  /**
   * ???
   */
  @DiamondExtras
  FilterBlastTab(SubCommands.FilterBlastTab),

  /**
   * ???
   */
  @DiamondExtras
  ShowCBS(SubCommands.ShowCBS),

  /**
   * ???
   */
  @DiamondExtras
  SimulateSeqs(SubCommands.SimulateSeqs),

  /**
   * ???
   */
  @DiamondExtras
  Split(SubCommands.Split),

  /**
   * ???
   */
  @DiamondExtras
  UpGMA(SubCommands.UpGMA),

  /**
   * ???
   */
  @DiamondExtras
  UpGMAMC(SubCommands.UpGMAMC),

  /**
   * ???
   */
  @DiamondExtras
  Reverse(SubCommands.Reverse),

  /**
   * ???
   */
  @DiamondExtras
  ComputeMedoids(SubCommands.ComputeMedoids),

  /**
   * ???
   */
  @DiamondExtras
  Mutate(SubCommands.Mutate),

  /**
   * ???
   */
  @DiamondExtras
  ROCID(SubCommands.ROCID),

  /**
   * ???
   */
  @DiamondExtras
  FindShapes(SubCommands.FindShapes),

  /**
   * ???
   */
  @DiamondExtras
  Composition(SubCommands.Composition),

  /**
   * ???
   */
  @DiamondExtras
  Join(SubCommands.Join),

  /**
   * ???
   */
  @DiamondExtras
  HashSeqs(SubCommands.HashSeqs),

  /**
   * ???
   */
  @DiamondExtras
  ListSeeds(SubCommands.ListSeeds),

  /**
   * ???
   */
  @DiamondExtras
  IndexFastA(SubCommands.IndexFastA),

  /**
   * ???
   */
  @DiamondExtras
  FetchSeq(SubCommands.FetchSeq),

  /**
   * Align DNA query sequences against a DNA reference database.
   */
  @DiamondExtras
  BlastN(SubCommands.BlastN),

  /**
   * ???
   */
  @DiamondExtras
  LengthSort(SubCommands.LengthSort),

  /**
   * ???
   */
  @DiamondExtras
  WC(SubCommands.WC),

  /**
   * ???
   */
  @DiamondExtras
  Cut(SubCommands.Cut),

  /**
   * ???
   */
  @DiamondExtras
  ModelSeqs(SubCommands.ModelSeqs),
  ;

  companion object {
    /**
     * Attempts to parse a [DiamondCommand] instance from the given [JsonNode],
     * throwing an [IllegalArgumentException] if the given [json] was not a
     * string, or did not contain a valid `DiamondCommand` value.
     *
     * @param json `JsonNode` to parse.
     *
     * @return A [DiamondCommand] value matching the given input.
     *
     * @throws IllegalArgumentException if the given input value was not a JSON
     * string, or did not represent a valid `DiamondCommand` value.
     */
    @JvmStatic
    @JsonCreator
    @Throws(IllegalArgumentException::class)
    fun fromJson(json: JsonNode) =
      when (json) {
        is TextNode -> fromString(json.textValue())
        else        -> invalid(json)
      }

    /**
     * Attempts to parse a [DiamondCommand] instance from the given [String],
     * returning `null` if the given [value] did not contain a valid
     * `DiamondCommand` value.
     *
     * @param value `String` to parse.
     *
     * @return A [DiamondCommand] value matching the given input, or `null` if
     * the input did not match any `DiamondCommand` value.
     */
    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { raw -> entries.find { it.command == raw } }

    /**
     * Attempts to parse a [DiamondCommand] instance from the given [String],
     * throwing an [IllegalArgumentException] if the given [value] did not
     * contain a valid `DiamondCommand` value.
     *
     * @param value `String` to parse.
     *
     * @return A [DiamondCommand] value matching the given input.
     *
     * @throws IllegalArgumentException if the given input value did not
     * represent a valid `DiamondCommand` value.
     */
    @JvmStatic
    @Throws(IllegalArgumentException::class)
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)
  }
}
