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
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.TextNode
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
enum class DiamondCommand(val cliString: String) {
  /**
   * Create a DIAMOND formatted reference database from a FASTA input file.
   */
  MakeDB("makedb"),

  /**
   * Prepare BLAST database for use with Diamond. This call requires the path
   * to the BLAST database (option `-d`) and will write a number of small
   * auxiliary files into the database directory.
   */
  PrepDB("prepdb"),

  /**
   * Align protein query sequences against a protein reference database.
   */
  BlastP("blastp"),

  /**
   * Align translated DNA query sequences against a protein reference database.
   */
  BlastX("blastx"),

  /**
   * Generate formatted output from DAA files.
   */
  View("view"),

  /**
   * Print information about a database file.
   */
  DBInfo("dbinfo"),

  /**
   * Print version information.
   */
  Version("version"),

  /**
   * Print help message.
   */
  Help("help"),

  /**
   * Run a series of test cases and verify the output against reference hashes.
   *
   * This command will exit with code `0` if all tests have passed and `1`
   * otherwise.
   *
   * Running this command requires write access to the current working
   * directory.
   */
  Test("test"),

  // Undocumented!
  /*
  cluster: Cluster protein sequences
  linclust: Cluster protein sequences in linear time
  realign: Realign clustered sequences against their centroids
  recluster: Recompute clustering to fix errors
  reassign: Reassign clustered sequences to the closest centroid
  merge-daa: Merge DAA files
  getseq: Retrieve sequences from a DIAMOND database file
  makeidx: Make database index
  greedy-vertex-cover: Compute greedy vertex cover
  roc: ???
  benchmark: ???
  deepclust: ???
  */

  // Undocumented and possibly not present depending on compile options!
  /*
  random-seqs: ???
  sort: ???
  dbstat: ???
  mask: ???
  fastq2fasta: ???
  read-sim: ???
  info: ???
  seed-stat: ???
  smith-waterman: ???
  translate: ???
  filter-blasttab: ???
  show-cbs: ???
  simulate-seqs: ???
  split: ???
  upgma: ???
  upgmamc: ???
  reverse: ???
  compute-medoids: ???
  mutate: ???
  roc-id: ???
  find-shapes: ???
  composition: ???
  join: ???
  hashseqs: ???
  listseeds: ???
  index-fasta: ???
  fetch-seq: ???
  blastn: Align DNA query sequences against a DNA reference database
  length-sort: ???
  wc: ???
  cut: ???
  model-seqs: ???
  */
  ;

  /**
   * Indicates whether the current [DiamondCommand] is one that is used for
   * making queries.
   */
  val isQueryCommand
    get() = this == BlastP || this == BlastX

  companion object {
    /**
     * Attempts to parse a [DiamondCommand] instance from the given [JsonNode],
     * returning `null` if the given [json] was not a string, or did not contain
     * a valid `DiamondCommand` value.
     *
     * @param json `JsonNode` to parse.
     *
     * @return A [DiamondCommand] value matching the given input, or `null` if
     * the input did not match any `DiamondCommand` value.
     */
    @JvmStatic
    fun fromJsonOrNull(json: JsonNode) =
      when (json) {
        is TextNode -> fromStringOrNull(json.textValue())
        else -> null
      }

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
        else -> throw IllegalArgumentException("could not parse non-text JSON value as a diamond tool name")
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
      value.lowercase().let { raw -> entries.find { it.cliString == raw } }

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
      fromStringOrNull(value) ?: throw IllegalArgumentException("unrecognized diamond tool value: \"$value\"")
  }
}