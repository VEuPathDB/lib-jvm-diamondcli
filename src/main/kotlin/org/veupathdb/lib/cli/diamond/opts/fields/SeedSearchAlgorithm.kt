package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class SeedSearchAlgorithm(
  cliValue: String,
  jsonValue: String,
) : CliSerializable {
  Auto("", "auto"),
  DoubleIndexed("0", "double-indexed"),
  QueryIndexed("1", "query-indexed"),
  ContiguousSeed("ctg", "contiguous-seed"),
  ;
  override val cliValue = cliValue

  @get:JsonValue
  val jsonValue = jsonValue

  override fun toString() = jsonValue

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      if (json.isTextual)
        fromString(json.textValue())
      else
        invalid(json)

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { target -> entries.find { it.jsonValue == target || it.cliValue == target } }
  }
}
