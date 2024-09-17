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

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ClusteringGeneralOptionContainer {
  /**
   * Clustering steps.
   *
   * Flag: `--cluster-steps`
   */
  @CliFlag("cluster-steps")
  @get:JsonGetter("clusterSteps")
  @set:JsonSetter("clusterSteps")
  var clusterSteps: List<String>?

  /**
   * Rank sequences based on kmer frequency in linear stage.
   *
   * Flag: `--kmer-ranking`
   */
  @CliFlag("kmer-ranking")
  @get:JsonGetter("kmerRanking")
  @set:JsonSetter("kmerRanking")
  var kmerRanking: Boolean?

  /**
   * Per-round coverage cutoffs for cascaded clustering.
   *
   * Flag: `--round-coverage`
   */
  @CliFlag("round-coverage")
  @get:JsonGetter("roundCoverage")
  @set:JsonSetter("roundCoverage")
  var roundCoverage: List<String>?

  /**
   * Per-round approx-id cutoffs for cascaded clustering.
   *
   * Flag: `--round-approx-id`
   */
  @CliFlag("round-approx-id")
  @get:JsonGetter("roundApproxID")
  @set:JsonSetter("roundApproxID")
  var roundApproxID: List<String>?
}
