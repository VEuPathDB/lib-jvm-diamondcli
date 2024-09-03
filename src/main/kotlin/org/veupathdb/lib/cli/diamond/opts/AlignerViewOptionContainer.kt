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

interface AlignerViewOptionContainer {
  // maximum number of target sequences to report alignments for (default=25)
  // `--max-target-seqs` | `-k`
  // Default = `25`
  // Type = `Option<int64_t>` // TODO: what is this
  // Config Var = `max_target_seqs_`
  @get:JsonGetter("maxTargetSeqs")
  @set:JsonSetter("maxTargetSeqs")
  var maxTargetSeqs: Long

  // report alignments within this percentage range of top alignment score (overrides --max-target-seqs)
  // `--top`
  // Default = `100.0`
  // Type = `double`
  // Config Var = `toppercent`
  @get:JsonGetter("top")
  @set:JsonSetter("top")
  var top: Double
}
