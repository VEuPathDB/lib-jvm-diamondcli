package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode

enum class MotifMaskingAlgorithm {
  None,
  Motif,
  ;

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
      else                  -> throw IllegalArgumentException("Invalid MotifMaskingAlgorithm: $json")
    }

    fun fromInt(value: Int) = when(value) {
      0    -> None
      1    -> Motif
      else -> throw IllegalArgumentException("Invalid MotifMaskingAlgorithm value: $value")
    }

    fun fromString(value: String) = when(value.lowercase()) {
      "none",  "0" -> None
      "motif", "1" -> Motif
      else         -> throw IllegalArgumentException("Invalid MotifMaskingAlgorithm value: \"$value\"")
    }
  }
}

