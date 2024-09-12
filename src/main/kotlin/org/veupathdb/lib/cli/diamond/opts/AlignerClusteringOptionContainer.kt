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
import org.veupathdb.lib.cli.diamond.opts.fields.ExtensionMode
import org.veupathdb.lib.cli.diamond.opts.fields.MotifMaskingAlgorithm

interface AlignerClusteringOptionContainer {
  /**
   * Maximum e-value to report alignments.
   *
   * Flag = `--evalue` | `-e`
   * Default = `0.001`
   */
  @CliFlag("evalue", 'e')
  @get:JsonGetter("eValue")
  @set:JsonSetter("eValue")
  var expectValue: Double

  /**
   * Softmask abundant motifs (0/1)
   *
   * Flag = `--motif-masking`
   */
  @CliFlag("motif-masking")
  @get:JsonGetter("motifMasking")
  @set:JsonSetter("motifMasking")
  var motifMasking: MotifMaskingAlgorithm

  /**
   * Minimum approximate identity % to report an alignment/to cluster sequences.
   *
   * Flag = `--approx-id`
   */
  @CliFlag("approx-id")
  @get:JsonGetter("approxID")
  @set:JsonSetter("approxID")
  var approxIdentity: Double

  /**
   * Extension mode.
   *
   * Flag = `--ext`
   */
  @CliFlag("ext")
  @get:JsonGetter("ext")
  @set:JsonSetter("ext")
  var extensionMode: ExtensionMode
}
