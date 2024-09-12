package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class ScoreMatrix : CliSerializable {
  BLOSUM45,
  BLOSUM62,
  BLOSUM50,
  BLOSUM80,
  BLOSUM90,
  PAM250,
  PAM30,
  PAM70,
  ;

  @get:JsonValue
  override val cliValue: String
    get() = name.lowercase()

  override fun toString() = cliValue

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual -> fromString(json.textValue())
      else           -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.uppercase().let { target -> entries.find { it.name == target } }
  }
}
