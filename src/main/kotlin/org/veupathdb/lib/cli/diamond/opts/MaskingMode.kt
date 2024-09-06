package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class MaskingMode(
  @get:JsonValue
  val value: String,
  val alt: String? = null
) : CliEnum {
  None("0", "none"),
  Tantan("1", "tantan"),
  BlastSeg("seg"),
  ;

  override val cliValue
    get() = value

  override fun toString() = value

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isIntegralNumber -> fromInt(json.intValue())
        json.isTextual        -> fromString(json.textValue())
        else                  -> invalid(json)
      }

    @JvmStatic
    fun fromInt(value: Int) =
      when (value) {
        0    -> None
        1    -> Tantan
        else -> invalid(value)
      }

    @JvmStatic
    fun fromString(value: String) =
      entries.find { it.value == value || it.alt == value }
        ?: invalid(value)
  }
}
