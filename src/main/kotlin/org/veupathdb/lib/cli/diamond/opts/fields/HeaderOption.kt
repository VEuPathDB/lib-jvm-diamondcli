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

package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.invalid

enum class HeaderOption {
  /**
   * --header 0
   */
  None,

  /**
   * --header
   */
  Enabled,

  /**
   * --header simple
   */
  Simple,

  /**
   * --header verbose
   */
  Verbose,
  ;

  @JsonValue
  override fun toString() = name.lowercase()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      json.takeIf { it.isTextual }
        ?.let { fromStringOrNull(it.textValue()) }
        ?: invalid(json)

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      if (value.length in 4..7)
        CharArray(value.length) { value[it].lowercaseChar() }
          .also { it[0] = it[0].uppercaseChar() }
          .let { String(it) }
          .let { target -> entries.find { it.name == target } }
      else
        null

  }
}

