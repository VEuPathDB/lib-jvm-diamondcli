package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class SequenceType(
  @get:JsonValue
  override val cliValue: String
) : CliSerializable {
  AminoAcid("prot"),
  Nucleotide("nucl"),
  ;

  override fun toString() = name.lowercase()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual -> fromString(json.textValue())
      else           -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      value.uppercase().let { target -> entries.find { it.cliValue == target } }
        ?: invalid(value)
  }
}
