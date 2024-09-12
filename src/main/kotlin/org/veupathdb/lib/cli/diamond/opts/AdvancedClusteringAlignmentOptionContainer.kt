/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http: *www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.builder.flag.CliFlag

interface AdvancedClusteringAlignmentOptionContainer {
  /**
   * Number of query bins for seed search
   *
   * Flag = `--bin`
   */
  @CliFlag("bin")
  @get:JsonGetter("bins")
  @set:JsonSetter("bins")
  var bins: UInt

  /**
   * Chunk size for adaptive ranking (default=auto)
   *
   * Flag = `--ext-chunk-size`
   */
  @CliFlag("ext-chunk-size")
  @get:JsonGetter("extChunkSize")
  @set:JsonSetter("extChunkSize")
  var extChunkSize: ULong

  /**
   * Disable ranking heuristic.
   *
   * Flag = `--no-ranking`
   * Default = `false`
   */
  @CliFlag("no-ranking")
  @get:JsonGetter("noRanking")
  @set:JsonSetter("noRanking")
  var noRanking: Boolean

  /**
   * Effective database size (in letters)
   *
   * Flag = `--dbsize`
   * Default = `0`
   */
  @CliFlag("dbsize")
  @get:JsonGetter("dbSize")
  @set:JsonSetter("dbSize")
  var dbSize: ULong

  /**
   * Disable auto appending of DAA and DMND file extensions.
   *
   * Flag = `--no-auto-append`
   * Default = `false`
   */
  @CliFlag("no-auto-append")
  @get:JsonGetter("noAutoAppend")
  @set:JsonSetter("noAutoAppend")
  var noAutoAppend: Boolean

  /**
   * minimum repeat probability for masking (default=0.9)
   *
   * Flag = `--tantan-minMaskProb`
   * Default = `0.9`
   */
  @CliFlag("tantan-minMaskProb")
  @get:JsonGetter("tantanMinMaskProb")
  @set:JsonSetter("tantanMinMaskProb")
  var tantanMinMaskProb: Double
}
