package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class DistributionType(@get:JsonValue override val cliValue: String) : CliSerializable {
  BitScore("bitscore"),
  ExpectValue("evalue"),
  ;

  override fun toString() = name.lowercase()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      json.takeIf { it.isTextual }
        ?.let { fromStringOrNull(json.textValue()) }
        ?: invalid(json)

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.uppercase().let { target -> entries.find { it.cliValue == target } }
  }
}
