package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class MotifMaskingAlgorithm : CliEnum {
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
    fun fromInt(value: Int) = when(value) {
      0    -> None
      1    -> Motif
      else -> invalid(value)
    }

    @JvmStatic
    fun fromString(value: String) = when(value.lowercase()) {
      "none",  "0" -> None
      "motif", "1" -> Motif
      else         -> invalid(value)
    }
  }
}

