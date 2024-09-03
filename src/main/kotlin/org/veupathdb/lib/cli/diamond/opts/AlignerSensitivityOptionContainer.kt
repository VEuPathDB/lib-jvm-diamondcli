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

// TODO: Most of these options should be condensed to an enum, they are mutually
//       exclusive and configure the same setting to different values.  The only
//       field in here that _isn't_ part of the enum is [shapes]
interface AlignerSensitivityOptionContainer {
  // enable faster mode
  // `--faster`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_faster`
  @get:JsonGetter("faster")
  @set:JsonSetter("faster")
  var faster: Boolean

  // enable fast mode
  // `--fast`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_fast`
  @get:JsonGetter("fast")
  @set:JsonSetter("fast")
  var fast: Boolean

  // enable mid-sensitive mode
  // `--mid-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_mid_sensitive`
  @get:JsonGetter("midSensitive")
  @set:JsonSetter("midSensitive")
  var midSensitive: Boolean

  // enable mode using 30 seed shapes of weight 10
  // `--shapes-30x10`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_shapes30x10`
  @get:JsonGetter("shapes30x10")
  @set:JsonSetter("shapes30x10")
  var shapes30x10: Boolean

  // enable sensitive mode)
  // `--sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_sensitive`
  @get:JsonGetter("sensitive")
  @set:JsonSetter("sensitive")
  var sensitive: Boolean

  // enable more sensitive mode
  // `--more-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_more_sensitive`
  @get:JsonGetter("moreSensitive")
  @set:JsonSetter("moreSensitive")
  var moreSensitive: Boolean

  // enable very sensitive mode
  // `--very-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_very_sensitive`
  @get:JsonGetter("verySensitive")
  @set:JsonSetter("verySensitive")
  var verySensitive: Boolean

  // enable ultra sensitive mode
  // `--ultra-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_ultra_sensitive`
  @get:JsonGetter("ultraSensitive")
  @set:JsonSetter("ultraSensitive")
  var ultraSensitive: Boolean

  // number of seed shapes (default=all available)
  // `--shapes` | `-s`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `shapes`
  @get:JsonGetter("shapes")
  @set:JsonSetter("shapes")
  var shapes: UInt

}
