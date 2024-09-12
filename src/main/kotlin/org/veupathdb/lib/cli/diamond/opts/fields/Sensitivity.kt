package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class Sensitivity(
  @get:JsonValue
  override val cliValue: String
) : CliSerializable {
  Faster("faster"),
  Fast("fast"),
  Default("default"),
  MidSensitive("mid-sensitive"),
  Shapes30x10("shapes-30x10"),
  Sensitive("sensitive"),
  MoreSensitive("more-sensitive"),
  VerySensitive("very-sensitive"),
  UltraSensitive("ultra-sensitive"),
  ;

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
      value.lowercase().let { target -> entries.find { it.cliValue == target } }
  }
}
