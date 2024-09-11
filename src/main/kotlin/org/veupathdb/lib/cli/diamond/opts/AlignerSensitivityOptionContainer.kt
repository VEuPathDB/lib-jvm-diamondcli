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
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.wrapper.meta.CliFlag

// TODO: Most of these options should be condensed to an enum, they are mutually
//       exclusive and configure the same setting to different values.  The only
//       field in here that _isn't_ part of the enum is [shapes]
interface AlignerSensitivityOptionContainer {

  @get:JsonGetter("sensitivity")
  @set:JsonSetter("sensitivity")
  var sensitivity: Sensitivity

  /**
   * Enable faster mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--faster`
   */
  @CliFlag("faster")
  @get:JsonIgnore
  @set:JsonIgnore
  var faster: Boolean
    get() = sensitivity == Sensitivity.Faster
    set(value) {
      if (value)
        sensitivity = Sensitivity.Faster
      else if (sensitivity == Sensitivity.Faster)
        sensitivity = Sensitivity.Default
    }

  /**
   * Enable fast mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--fast`
   */
  @CliFlag("fast")
  @get:JsonIgnore
  @set:JsonIgnore
  var fast: Boolean
    get() = sensitivity == Sensitivity.Fast
    set(value) {
      if (value)
        sensitivity = Sensitivity.Fast
      else if (sensitivity == Sensitivity.Fast)
        sensitivity = Sensitivity.Default
    }

  /**
   * Enable mid-sensitive mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--mid-sensitive`
   */
  @CliFlag("mid-sensitive")
  @get:JsonIgnore
  @set:JsonIgnore
  var midSensitive: Boolean
    get() = sensitivity == Sensitivity.MidSensitive
    set(value) {
      if (value)
        sensitivity = Sensitivity.MidSensitive
      else if (sensitivity == Sensitivity.MidSensitive)
        sensitivity = Sensitivity.Default
    }

  /**
  // enable mode using 30 seed shapes of weight 10
  // `--shapes-30x10`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_shapes30x10`
   */
  @CliFlag("shapes-30x10")
  @get:JsonIgnore
  @set:JsonIgnore
  var shapes30x10: Boolean
    get() = sensitivity == Sensitivity.Shapes30x10
    set(value) {
      if (value)
        sensitivity = Sensitivity.Shapes30x10
      else if (sensitivity == Sensitivity.Shapes30x10)
        sensitivity = Sensitivity.Default
    }

  /**
  // enable sensitive mode)
  // `--sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_sensitive`
   */
  @CliFlag("sensitive")
  @get:JsonIgnore
  @set:JsonIgnore
  var sensitive: Boolean
    get() = sensitivity == Sensitivity.Sensitive
    set(value) {
      if (value)
        sensitivity = Sensitivity.Sensitive
      else if (sensitivity == Sensitivity.Sensitive)
        sensitivity = Sensitivity.Default
    }

  /**
  // enable more sensitive mode
  // `--more-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_more_sensitive`
   */
  @CliFlag("more-sensitive")
  @get:JsonIgnore
  @set:JsonIgnore
  var moreSensitive: Boolean
    get() = sensitivity == Sensitivity.MoreSensitive
    set(value) {
      if (value)
        sensitivity = Sensitivity.MoreSensitive
      else if (sensitivity == Sensitivity.MoreSensitive)
        sensitivity = Sensitivity.Default
    }

  /**
  // enable very sensitive mode
  // `--very-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_very_sensitive`
   */
  @CliFlag("very-sensitive")
  @get:JsonIgnore
  @set:JsonIgnore
  var verySensitive: Boolean
    get() = sensitivity == Sensitivity.VerySensitive
    set(value) {
      if (value)
        sensitivity = Sensitivity.VerySensitive
      else if (sensitivity == Sensitivity.VerySensitive)
        sensitivity = Sensitivity.Default
    }

  /**
  // enable ultra sensitive mode
  // `--ultra-sensitive`
  // Default = ``
  // Type = `bool`
  // Config Var = `mode_ultra_sensitive`
   */
  @CliFlag("ultra-sensitive")
  @get:JsonIgnore
  @set:JsonIgnore
  var ultraSensitive: Boolean
    get() = sensitivity == Sensitivity.UltraSensitive
    set(value) {
      if (value)
        sensitivity = Sensitivity.UltraSensitive
      else if (sensitivity == Sensitivity.UltraSensitive)
        sensitivity = Sensitivity.Default
    }

  /**
  // number of seed shapes (default=all available)
  // `--shapes` | `-s`
  // Default = ``
  // Type = `unsigned`
  // Config Var = `shapes`
   */
  @CliFlag("shapes", 's')
  @get:JsonGetter("shapes")
  @set:JsonSetter("shapes")
  var shapes: UInt
}
