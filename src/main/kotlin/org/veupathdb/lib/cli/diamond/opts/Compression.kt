package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class Compression(override val cliValue: String) : CliEnum {
  None("0"),
  ZLib("1"),
  ZStd("zstd"),
  ;

  @JsonValue
  override fun toString() = name.lowercase()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual        -> fromString(json.textValue())
      json.isIntegralNumber -> fromInt(json.intValue())
      else                  -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      value.lowercase().let { name -> entries.find { it.toString() == name || it.cliValue == name } }
        ?: invalid(value)

    @JvmStatic
    fun fromInt(value: Int) = when (value) {
      0    -> None
      1    -> ZLib
      else -> invalid(value)
    }
  }
}
