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
import io.foxcapades.lib.cli.builder.arg.CliArgument
import io.foxcapades.lib.cli.builder.flag.CliFlag
import org.veupathdb.lib.cli.diamond.opts.fields.Sensitivity
import org.veupathdb.lib.cli.diamond.util.FauxToggleFormatter
import org.veupathdb.lib.cli.diamond.util.FauxToggleTest

interface AlignerSensitivityOptionContainer {

  /**
   * Aligner sensitivity.
   *
   * This is the root sensitivity config value, the following properties are
   * empty setters over this value:
   *
   * * [faster]
   * * [fast]
   * * [midSensitive]
   * * [shapes30x10]
   * * [sensitive]
   * * [moreSensitive]
   * * [verySensitive]
   * * [ultraSensitive]
   */
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
  @CliFlag("faster", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
  @CliFlag("fast", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
  @CliFlag("mid-sensitive", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Enable mode using 30 seed shapes of weight 10
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--shapes-30x10`
   */
  @CliFlag("shapes-30x10", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Enable sensitive mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--sensitive`
   */
  @CliFlag("sensitive", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Enable more sensitive mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--more-sensitive`
   */
  @CliFlag("more-sensitive", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Enable very sensitive mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--very-sensitive`
   */
  @CliFlag("very-sensitive", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Enable ultra sensitive mode.
   *
   * This is a virtual property over the value of [sensitivity].
   *
   * Flag: `--ultra-sensitive`
   */
  @CliFlag("ultra-sensitive", inclusionTest = FauxToggleTest::class, argument = CliArgument(formatter = FauxToggleFormatter::class))
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
   * Number of seed shapes.
   *
   * Defaults to all available.
   *
   * Flag: `--shapes` | `-s`
   */
  @CliFlag("shapes", 's')
  @get:JsonGetter("shapes")
  @set:JsonSetter("shapes")
  var shapes: UInt?
}
