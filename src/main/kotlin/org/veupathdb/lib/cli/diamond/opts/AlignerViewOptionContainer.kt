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
import io.foxcapades.lib.cli.builder.flag.CliFlag

interface AlignerViewOptionContainer {
  /**
   * Maximum number of target sequences to report alignments for.
   *
   * Flag: `--max-target-seqs` | `-k`
   * Default: `25`
   */
  @CliFlag("max-target-seqs", 'k')
  @get:JsonGetter("maxTargetSeqs")
  @set:JsonSetter("maxTargetSeqs")
  var maxTargetSeqs: Long

  /**
   * Report alignments within this percentage range of top alignment score.
   *
   * Overrides: `--max-target-seqs`
   *
   * Flag = `--top`
   * Default = `100.0`
   */
  @CliFlag("top")
  @get:JsonGetter("top")
  @set:JsonSetter("top")
  var top: Double
}
