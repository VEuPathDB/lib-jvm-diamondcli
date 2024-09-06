package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class DNAExtensionAlgorithm : CliEnum {
  KSW,
  WFA,
  ;

  override val cliValue: String
    get() = toString()

  @JsonValue
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
      value.uppercase().let { name -> entries.find { it.name == name } }
        ?: invalid(value)
  }
}
