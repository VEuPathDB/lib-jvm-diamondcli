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
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.opts.fields.CompositionBasedStats
import org.veupathdb.lib.cli.diamond.opts.fields.MaskingMode
import org.veupathdb.lib.cli.diamond.opts.fields.SoftMaskingAlgorithm

@JsonInclude(JsonInclude.Include.NON_NULL)
interface AlignerClusteringRealignOptionContainer {
  /**
   * Composition based statistics mode.
   *
   * Flag: `--comp-based-stats`
   *
   * Default: [CompositionBasedStats.Hauser]
   */
  @CliFlag("comp-based-stats")
  @get:JsonGetter("compBasedStats")
  @set:JsonSetter("compBasedStats")
  var compBasedStats: CompositionBasedStats?

  /**
   * Masking algorithm.
   *
   * Flag: `--masking`
   *
   * Default: [MaskingMode.Tantan]
   */
  @CliFlag("masking")
  @get:JsonGetter("masking")
  @set:JsonSetter("masking")
  var masking: MaskingMode?

  /**
   * Soft masking.
   *
   * Default value is subcommand dependent.
   *
   * Flag: `--soft-masking`
   */
  @CliFlag("soft-masking")
  @get:JsonGetter("softMasking")
  @set:JsonSetter("softMasking")
  var softMasking: SoftMaskingAlgorithm?

  /**
   * Key: `--mmseqs-compat`
   */
  @CliFlag("mmseqs-compat")
  @get:JsonGetter("mmseqsCompat")
  @set:JsonSetter("mmseqsCompat")
  var mmseqsCompat: Boolean?

  /**
   * Key: `--no-block-size-limit`
   */
  @CliFlag("no-block-size-limit")
  @get:JsonGetter("noBlockSizeLimit")
  @set:JsonSetter("noBlockSizeLimit")
  var noBlockSizeLimit: Boolean?
}

