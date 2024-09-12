package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class Compression(override val cliValue: String) : CliSerializable {
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
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { name -> entries.find { it.toString() == name || it.cliValue == name } }

    @JvmStatic
    fun fromInt(value: Int) =
      fromIntOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromIntOrNull(value: Int) = when (value) {
      0    -> None
      1    -> ZLib
      else -> null
    }
  }
}
