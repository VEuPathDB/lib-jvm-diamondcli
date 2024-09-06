package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class ScoreMatrix : CliEnum {
  BLOSUM45,
  BLOSUM62,
  BLOSUM50,
  BLOSUM80,
  BLOSUM90,
  PAM250,
  PAM30,
  PAM70,
  ;

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
      value.uppercase().let { target -> entries.find { it.name == target } }
        ?: invalid(value)
  }
}
