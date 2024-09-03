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

interface AlignerClusteringOptionContainer {
  // maximum e-value to report alignments (default=0.001)
  // `--evalue` | `-e`
  // Default = `0.001`
  // Type = `double`
  // Config Var = `max_evalue`
  @get:JsonGetter("eValue")
  @set:JsonSetter("eValue")
  var eValue: Double

  // softmask abundant motifs (0/1)
  // `--motif-masking`
  // Default = ``
  // Type = `string`
  // Config Var = `motif_masking`
  @get:JsonGetter("motifMasking")
  @set:JsonSetter("motifMasking")
  var motifMasking: String

  // minimum approx. identity% to report an alignment/to cluster sequences
  // `--approx-id`
  // Default = ``
  // Type = `Option<double>` // TODO: what is this?
  // Config Var = `approx_min_id`
  @get:JsonGetter("approxID")
  @set:JsonSetter("approxID")
  var approxID: Double

  // Extension mode (banded-fast/banded-slow/full)
  // `--ext`
  // Default = ``
  // Type = `string`
  // Config Var = `ext_`
  @get:JsonGetter("ext")
  @set:JsonSetter("ext")
  var ext: String
}
