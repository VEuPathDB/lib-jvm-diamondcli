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
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.opts.fields.MemoryLimit

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ClusteringReassignOptionContainer {
  /**
   * Memory limit in GB
   *
   * Flag: `--memory-limit` | `-M`
   *
   * Default: `"16G"`
   */
  @CliFlag("memory-limit", 'M')
  @get:JsonGetter("memoryLimit")
  @set:JsonSetter("memoryLimit")
  var memoryLimit: MemoryLimit?

  /**
   * Minimum coverage percentage of the cluster member sequence.
   *
   * Flag: `--member-cover`
   *
   * Default: `80.0`
   */
  @CliFlag("member-cover")
  @get:JsonGetter("memberCover")
  @set:JsonSetter("memberCover")
  var memberCover: Double?

  /**
   * Minimum mutual coverage percentage of the cluster member and representative
   * sequence.
   *
   * Flag: `--mutual-cover`
   */
  @CliFlag("mutual-cover")
  @get:JsonGetter("mutualCover")
  @set:JsonSetter("mutualCover")
  var mutualCover: Double?
}
