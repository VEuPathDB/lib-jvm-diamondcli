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

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.TextNode
import kotlin.jvm.Throws

enum class Sensitivity(val cliString: String) {
  Faster("faster"),
  Fast("fast"),
  Default("default"),
  MidSensitive("mid-sensitive"),
  Shapes30x10("shapes-30x10"),
  Sensitive("sensitive"),
  MoreSensitive("more-sensitive"),
  VerySensitive("very-sensitive"),
  UltraSensitive("ultra-sensitive"),
  ;

  companion object {
    /**
     * Attempts to parse a [Sensitivity] instance from the given [JsonNode],
     * returning `null` if the given [json] was not a string, or did not contain
     * a valid `Sensitivity` value.
     *
     * @param json `JsonNode` to parse.
     *
     * @return A [Sensitivity] value matching the given input, or `null` if
     * the input did not match any `Sensitivity` value.
     */
    @JvmStatic
    fun fromJsonOrNull(json: JsonNode) =
      when (json) {
        is TextNode -> fromStringOrNull(json.textValue())
        else -> null
      }

    /**
     * Attempts to parse a [Sensitivity] instance from the given [JsonNode],
     * throwing an [IllegalArgumentException] if the given [json] was not a
     * string, or did not contain a valid `Sensitivity` value.
     *
     * @param json `JsonNode` to parse.
     *
     * @return A [Sensitivity] value matching the given input.
     *
     * @throws IllegalArgumentException if the given input value was not a JSON
     * string, or did not represent a valid `Sensitivity` value.
     */
    @JvmStatic
    @JsonCreator
    @Throws(IllegalArgumentException::class)
    fun fromJson(json: JsonNode) =
      when (json) {
        is TextNode -> fromString(json.textValue())
        else -> throw IllegalArgumentException("could not parse non-text JSON value as a valid sensitivity level")
      }

    /**
     * Attempts to parse a [Sensitivity] instance from the given [String],
     * returning `null` if the given [value] did not contain a valid
     * `Sensitivity` value.
     *
     * @param value `String` to parse.
     *
     * @return A [Sensitivity] value matching the given input, or `null` if
     * the input did not match any `Sensitivity` value.
     */
    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { raw -> Sensitivity.entries.find { it.cliString == raw } }

    /**
     * Attempts to parse a [Sensitivity] instance from the given [String],
     * throwing an [IllegalArgumentException] if the given [value] did not
     * contain a valid `Sensitivity` value.
     *
     * @param value `String` to parse.
     *
     * @return A [Sensitivity] value matching the given input.
     *
     * @throws IllegalArgumentException if the given input value did not
     * represent a valid `Sensitivity` value.
     */
    @JvmStatic
    @Throws(IllegalArgumentException::class)
    fun fromString(value: String) =
      fromStringOrNull(value) ?: throw IllegalArgumentException("unrecognized sensitivity value: \"$value\"")
  }
}