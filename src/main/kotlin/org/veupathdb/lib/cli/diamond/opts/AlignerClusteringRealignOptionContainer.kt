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

interface AlignerClusteringRealignOptionContainer {
  // composition based statistics mode (0-4)
  // `--comp-based-stats`
  // Default = `1u`
  // Type = `unsigned`
  // Config Var = `comp_based_stats`
  @get:JsonGetter("compBasedStats")
  @set:JsonSetter("compBasedStats")
  var compBasedStats: UInt // TODO: enum this?

  // masking algorithm (none, seg, tantan=default)
  // `--masking`
  // Default = ``
  // Type = `Option<string>` // TODO: what is this?
  // Config Var = `masking_`
  @get:JsonGetter("masking")
  @set:JsonSetter("masking")
  var masking: String

  // soft masking (none=default, seg, tantan)
  // `--soft-masking`
  // Default = ``
  // Type = `string`
  // Config Var = `soft_masking`
  @get:JsonGetter("softMasking")
  @set:JsonSetter("softMasking")
  var softMasking: String // TODO: enum this?

  // TODO: document this
  // `--mmseqs-compat`
  // Default = ``
  // Type = `bool`
  // Config Var = `mmseqs_compat`
  @get:JsonGetter("mmseqsCompat")
  @set:JsonSetter("mmseqsCompat")
  var mmseqsCompat: Boolean

  // TODO: document this
  // `--no-block-size-limit`
  // Default = ``
  // Type = `bool`
  // Config Var = `no_block_size_limit`
  @get:JsonGetter("noBlockSizeLimit")
  @set:JsonSetter("noBlockSizeLimit")
  var noBlockSizeLimit: Boolean
}

