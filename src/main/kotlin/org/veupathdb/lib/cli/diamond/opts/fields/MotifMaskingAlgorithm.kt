package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class MotifMaskingAlgorithm : CliSerializable {
  None,
  Motif,
  ;

  override val cliValue: String
    get() = toString()

  @get:JsonValue
  val value get() = when(this) {
    None  -> "none"
    Motif -> "motif"
  }

  override fun toString() = ordinal.toString()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isIntegralNumber -> fromInt(json.intValue())
      json.isTextual        -> fromString(json.textValue())
      else                  -> invalid(json)
    }

    @JvmStatic
    fun fromInt(value: Int) =
      fromIntOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromIntOrNull(value: Int) =
      when(value) { 0 -> None ; 1 -> Motif ; else -> null }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOfNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOfNull(value: String) =
      when(value.lowercase()) {
        "none",  "0" -> None
        "motif", "1" -> Motif
        else         -> null
      }
  }
}

