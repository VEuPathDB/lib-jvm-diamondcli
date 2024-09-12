package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class OutputFormat(
  val intForm: Int,
  val stringForm: String,

  @get:JsonValue
  val jsonValue: String,
) : CliSerializable {
  Pairwise(0, "pairwise"),
  XML(5, "xml", "xml"),
  BlastTab(6, "tab", "blast-tab"),
  DiamondAlignmentArchive(100, "daa", "daa"),
  SequenceAlignmentMap(101, "sam", "sam"),
  Taxon(102, "taxon"),
  PairwiseMappingFormat(103, "paf", "paf"),
  JsonFlat(104, "json-flat", "json-flat"),
  Null("null", "null"),
  Bin1("bin1", "bin1"),
  Clustering("clus", "clustering"),
  Edge("edge", "edge"),
  ;

  inline val hasIntForm
    get() = intForm >= 0

  inline val hasStringForm
    get() = stringForm.isNotEmpty()

  // TODO: confirm no other formats allow customization!
  inline val acceptsFormatParams
    get() = this == BlastTab || this == JsonFlat

  override val cliValue: String
    get() = toString(false)

  constructor(intForm: Int, jsonValue: String) : this(intForm, "", jsonValue)

  constructor(stringForm: String, jsonValue: String) : this(-1, stringForm, jsonValue)

  override fun toString() = toString(false)

  fun toString(preferStringForm: Boolean) =
    if (preferStringForm && hasStringForm || !hasIntForm)
      stringForm
    else
      intForm.toString()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isTextual -> fromString(json.textValue())
        else           -> invalid(json)
      }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { target -> entries.find { it.jsonValue == target } }
  }
}
