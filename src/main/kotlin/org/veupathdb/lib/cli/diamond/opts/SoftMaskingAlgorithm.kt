package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode

// TODO: the diamond cli code doesn't seem to actually be able to parse the
//       values "none", "seg", or "motif", only "0" or "tantan".
enum class SoftMaskingAlgorithm(
  val value: UByte,

  @get:JsonValue
  val key: String,
) {
  None(0u, "none"),
  Tantan(1u, "tantan"),
  Seg(2u, "seg"),
  Motif(4u, "motif"),
  ;

  val cliValue
    get() = when (this) {
      None   -> "0"
      Tantan -> key
      Seg    -> key
      Motif  -> key
    }

  override fun toString() = key

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual -> fromString(json.textValue())
      json.isIntegralNumber -> fromInt(json.intValue())
      else -> throw IllegalArgumentException("Invalid SoftMaskingAlgorithm value: $json")
    }

    fun fromString(value: String) = value.lowercase()
      .let { key -> entries.find { it.key == key } }
      ?: throw IllegalArgumentException("InvalidSoftMaskingAlgorithm value: \"$value\"")

    fun fromInt(value: Int) = when(value) {
      in 0..4 -> value.toUByte().let { id -> entries.find { it.value == id } }
      else        -> null
    } ?: throw IllegalArgumentException("Invalid SoftMaskingAlgorithm value: $value")
  }
}
