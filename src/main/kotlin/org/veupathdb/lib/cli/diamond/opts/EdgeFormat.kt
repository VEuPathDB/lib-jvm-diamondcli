package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class EdgeFormat : CliEnum {
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
      string.lowercase().let { target -> entries.find { it.cliValue == target } }
        ?: invalid(string)
  }
}
