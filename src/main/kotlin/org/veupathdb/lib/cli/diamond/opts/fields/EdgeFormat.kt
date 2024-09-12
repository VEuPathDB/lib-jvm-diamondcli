package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class EdgeFormat : CliSerializable {
  Triplet,
  Default,
  ;

  @get:JsonValue
  override val cliValue: String
    get() = name.lowercase()

  override fun toString() = cliValue

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      json.takeIf { it.isTextual }
        ?.let { fromString(it.textValue()) }
        ?: invalid(json)

    @JvmStatic
    fun fromString(string: String) =
      fromStringOrNull(string) ?: invalid(string)

    @JvmStatic
    fun fromStringOrNull(string: String) =
      string.lowercase().let { target -> entries.find { it.cliValue == target } }
  }
}
