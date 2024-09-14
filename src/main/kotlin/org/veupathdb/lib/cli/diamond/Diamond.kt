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

package org.veupathdb.lib.cli.diamond

import com.fasterxml.jackson.core.JacksonException
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.commands.BlastN
import org.veupathdb.lib.cli.diamond.commands.BlastP
import org.veupathdb.lib.cli.diamond.commands.BlastX
import org.veupathdb.lib.cli.diamond.commands.impl.BlastNImpl
import org.veupathdb.lib.cli.diamond.commands.impl.BlastPImpl
import org.veupathdb.lib.cli.diamond.commands.impl.BlastXImpl
import org.veupathdb.lib.cli.diamond.opts.fields.output_format.cacheFormatFields
import org.veupathdb.lib.jackson.Json
import java.io.InputStream

object Diamond {
  /**
   * Creates a new, blank [BlastN] CLI configuration instance.
   *
   * @return The new `BlastN` instance.
   */
  @JvmStatic
  @DiamondExtras
  fun blastN(): BlastN = BlastNImpl()

  /**
   * Creates a new, blank [BlastN] CLI configuration instance and passes it to
   * the given action before returning it.
   *
   * @param action Action which may be used to mutate the new `BlastN` instance.
   *
   * @return The new `BlastN` instance.
   */
  @JvmStatic
  @DiamondExtras
  inline fun blastN(action: BlastN.() -> Unit): BlastN = blastN().apply(action)

  /**
   * Attempts to parse the given JSON value as a [BlastN] CLI configuration.
   *
   * @param json JSON value to parse.
   *
   * @return The parsed `BlastN` instance.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastN` CLI configuration.
   */
  @JvmStatic
  @DiamondExtras
  @Throws(IllegalArgumentException::class)
  fun blastN(json: JsonNode): BlastN = Json.parse<BlastNImpl>(json)

  /**
   * Attempts to parse the given JSON string as a [BlastN] CLI configuration.
   *
   * @param json JSON string to parse.
   *
   * @return The parsed `BlastN` instance.
   *
   * @throws JacksonException if the given string could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastN` CLI configuration.
   */
  @JvmStatic
  @DiamondExtras
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastN(json: String): BlastN = Json.parse<BlastNImpl>(json)

  /**
   * Attempts to parse the given JSON stream as a [BlastN] CLI configuration.
   *
   * @param json JSON stream to parse.
   *
   * @return The parsed `BlastN` instance.
   *
   * @throws JacksonException if the given stream could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastN` CLI configuration.
   */
  @JvmStatic
  @DiamondExtras
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastN(json: InputStream): BlastN = Json.parse<BlastNImpl>(json)

  /**
   * Creates a new, blank [BlastP] CLI configuration instance.
   *
   * @return The new `BlastP` instance.
   */
  @JvmStatic
  fun blastP(): BlastP = BlastPImpl()

  /**
   * Creates a new, blank [BlastP] CLI configuration instance and passes it to
   * the given action before returning it.
   *
   * @param action Action which may be used to mutate the new `BlastP` instance.
   *
   * @return The new `BlastP` instance.
   */
  @JvmStatic
  inline fun blastP(action: BlastP.() -> Unit) = blastP().apply(action)

  /**
   * Attempts to parse the given JSON value as a [BlastP] CLI configuration.
   *
   * @param json JSON value to parse.
   *
   * @return The parsed `BlastP` instance.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastP` CLI configuration.
   */
  @JvmStatic
  @Throws(IllegalArgumentException::class)
  fun blastP(json: JsonNode): BlastP = Json.parse<BlastPImpl>(json)

  /**
   * Attempts to parse the given JSON string as a [BlastP] CLI configuration.
   *
   * @param json JSON string to parse.
   *
   * @return The parsed `BlastP` instance.
   *
   * @throws JacksonException if the given string could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastP` CLI configuration.
   */
  @JvmStatic
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastP(json: String): BlastP = Json.parse<BlastPImpl>(json)

  /**
   * Attempts to parse the given JSON stream as a [BlastP] CLI configuration.
   *
   * @param json JSON stream to parse.
   *
   * @return The parsed `BlastP` instance.
   *
   * @throws JacksonException if the given stream could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastP` CLI configuration.
   */
  @JvmStatic
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastP(json: InputStream): BlastP = Json.parse<BlastPImpl>(json)

  /**
   * Creates a new, blank [BlastX] CLI configuration instance.
   *
   * @return The new `BlastX` instance.
   */
  @JvmStatic
  fun blastX(): BlastX = BlastXImpl()

  /**
   * Creates a new, blank [BlastX] CLI configuration instance and passes it to
   * the given action before returning it.
   *
   * @param action Action which may be used to mutate the new `BlastX` instance.
   *
   * @return The new `BlastX` instance.
   */
  @JvmStatic
  inline fun blastX(action: BlastX.() -> Unit) = blastX().apply(action)

  /**
   * Attempts to parse the given JSON value as a [BlastX] CLI configuration.
   *
   * @param json JSON value to parse.
   *
   * @return The parsed `BlastX` instance.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastX` CLI configuration.
   */
  @JvmStatic
  @Throws(IllegalArgumentException::class)
  fun blastX(json: JsonNode): BlastX = Json.parse<BlastXImpl>(json)

  /**
   * Attempts to parse the given JSON string as a [BlastP] CLI configuration.
   *
   * @param json JSON string to parse.
   *
   * @return The parsed `BlastP` instance.
   *
   * @throws JacksonException if the given string could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastP` CLI configuration.
   */
  @JvmStatic
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastX(json: String): BlastX = Json.parse<BlastXImpl>(json)

  /**
   * Attempts to parse the given JSON stream as a [BlastX] CLI configuration.
   *
   * @param json JSON stream to parse.
   *
   * @return The parsed `BlastX` instance.
   *
   * @throws JacksonException if the given stream could not be parsed as JSON.
   *
   * @throws IllegalArgumentException if the input JSON could not be parsed as
   * a `BlastX` CLI configuration.
   */
  @JvmStatic
  @Throws(JacksonException::class, IllegalArgumentException::class)
  fun blastX(json: InputStream): BlastX = Json.parse<BlastXImpl>(json)

  object Options {
    /**
     * If [org.veupathdb.lib.cli.diamond.opts.output_format.FormatField] values
     * are going to be parsed frequently, it may be worthwhile to cache the
     * JSON string to enum value mapping to speed up those translations.
     *
     * By default, a given JSON string will be compared to both short and long
     * form representations of each `FormatField` entry, meaning up to 152
     * possible string comparison tests per input.
     */
    @JvmStatic
    fun cacheFormatFieldJson() = cacheFormatFields()
  }
}

