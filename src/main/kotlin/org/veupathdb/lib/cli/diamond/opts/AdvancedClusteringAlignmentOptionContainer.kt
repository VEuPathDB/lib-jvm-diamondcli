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

package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter

interface AdvancedClusteringAlignmentOptionContainer {
  // number of query bins for seed search
  // `--bin`
  // `unsigned`
  @get:JsonGetter("bins")
  @set:JsonSetter("bins")
  var bins: UInt

  // chunk size for adaptive ranking (default=auto)
  // `--ext-chunk-size`
  // `size_t`
  @get:JsonGetter("extChunkSize")
  @set:JsonSetter("extChunkSize")
  var extChunkSize: ULong

  // disable ranking heuristic
  // `--no-ranking` | `-`
  // Default = `false`
  // Type = `bool`
  // config var = `no_ranking`
  @get:JsonGetter("noRanking")
  @set:JsonSetter("noRanking")
  var noRanking: Boolean

  // effective database size (in letters)
  // `--dbsize` | `-`
  // Default = `0`
  // Type = `uint64_t`
  // config var = `db_size`
  @get:JsonGetter("dbSize")
  @set:JsonSetter("dbSize")
  var dbSize: ULong

  // disable auto appending of DAA and DMND file extensions
  // `--no-auto-append` | `-`
  // Default = `false`
  // Type = `bool`
  // config var = `no_auto_append`
  @get:JsonGetter("noAutoAppend")
  @set:JsonSetter("noAutoAppend")
  var noAutoAppend: Any

  // minimum repeat probability for masking (default=0.9)
  // `--tantan-minMaskProb` | `-`
  // Default = `0.9`
  // config var = `tantan_minMaskProb`
  @get:JsonGetter("tantanMinMaskProb")
  @set:JsonSetter("tantanMinMaskProb")
  var tantanMinMaskProb: Double
}
