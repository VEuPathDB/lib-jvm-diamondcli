package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode

enum class MaskingMode(
  @get:JsonValue
  val value: String,
  val alt: String? = null
) {
  None("0", "none"),
  Tantan("1", "tantan"),
  BlastSeg("seg"),
  ;

  val cliValue
    get() = value

  override fun toString() = value

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isIntegralNumber -> fromInt(json.intValue())
        json.isTextual        -> fromString(json.textValue())
        else                  -> throw IllegalArgumentException("Invalid MaskingMode value: $json")
      }

    fun fromInt(value: Int) =
      when (value) {
        0    -> None
        1    -> Tantan
        else -> throw IllegalArgumentException("Invalid MaskingMode value: $value")
      }

    fun fromString(value: String) =
      entries.find { it.value == value || it.alt == value }
        ?: throw IllegalArgumentException("Invalid MaskingMode value: \"$value\"")
  }
}
