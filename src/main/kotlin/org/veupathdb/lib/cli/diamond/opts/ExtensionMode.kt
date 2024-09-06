package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class ExtensionMode(
  @get:JsonValue
  val value: String
) : CliEnum {
  BandedFast("banded-fast"),
  BandedSlow("banded-slow"),
  Full("full"),
  Global("global"),
  ;

  override val cliValue
    get() = toString()

  override fun toString() = value

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual -> fromString(json.textValue())
      else           -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      value.lowercase().let { target -> entries.find { it.value == target } }
        ?: invalid(value)
  }
}
