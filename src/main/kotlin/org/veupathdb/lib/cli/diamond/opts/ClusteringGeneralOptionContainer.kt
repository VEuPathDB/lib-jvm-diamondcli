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

interface ClusteringGeneralOptionContainer {
  // Clustering steps
  // `--cluster-steps`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `cluster_steps`
  @get:JsonGetter("clusterSteps")
  @set:JsonSetter("clusterSteps")
  var clusterSteps: List<String> // TODO: what is this

  // Rank sequences based on kmer frequency in linear stage
  // `--kmer-ranking`
  // Default = ``
  // Type = `bool`
  // Config Var = `kmer_ranking`
  @get:JsonGetter("kmerRanking")
  @set:JsonSetter("kmerRanking")
  var kmerRanking: Boolean

  // Per-round coverage cutoffs for cascaded clustering
  // `--round-coverage`
  // Default = ``
  // Type = `std::vector<string>`
  // Config Var = `round_coverage`
  @get:JsonGetter("roundCoverage")
  @set:JsonSetter("roundCoverage")
  var roundCoverage: List<String> // TODO: what is this

  // Per-round approx-id cutoffs for cascaded clustering
  // `--round-approx-id`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `round_approx_id`
  @get:JsonGetter("roundApproxID")
  @set:JsonSetter("roundApproxID")
  var roundApproxID: List<String>
}
