package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

// TODO: the diamond cli code doesn't seem to actually be able to parse the
//       values "none", "seg", or "motif", only "0" or "tantan".
enum class SoftMaskingAlgorithm(
  val value: UByte,

  @get:JsonValue
  val key: String,
) : CliSerializable {
  None(0u, "none"),
  Tantan(1u, "tantan"),
  Seg(2u, "seg"),
  Motif(4u, "motif"),
  ;

  override val cliValue
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
      json.isTextual        -> fromString(json.textValue())
      json.isIntegralNumber -> fromInt(json.intValue())
      else                  -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase()
        .let { key -> entries.find { it.key == key } }

    @JvmStatic
    fun fromInt(value: Int) =
      fromIntOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromIntOrNull(value: Int) = when(value) {
      in 0..4 -> value.toUByte().let { id -> entries.find { it.value == id } }
      else        -> null
    }
  }
}
