package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.module.kotlin.contains
import org.veupathdb.lib.cli.diamond.util.invalid

fun OutputFormatOptions(json: JsonNode) =
  when {
    json.isTextual -> OutputFormatOptions(json.textValue())
    json.isObject  -> OutputFormatOptions(json as ObjectNode)
    else           -> invalid(json)
  }

fun OutputFormatOptions(value: String) =
  when (OutputFormat.fromString(value)) {
    OutputFormat.Pairwise -> SimpleOutputFormat.Pairwise
    OutputFormat.XML -> SimpleOutputFormat.XML
    OutputFormat.BlastTab -> BlastTabFormat()
    OutputFormat.DiamondAlignmentArchive -> SimpleOutputFormat.DiamondAlignmentArchive
    OutputFormat.SequenceAlignmentMap -> SimpleOutputFormat.SequenceAlignmentMap
    OutputFormat.Taxon -> SimpleOutputFormat.TaxonomicClassification
    OutputFormat.PairwiseMappingFormat -> SimpleOutputFormat.PairwiseMappingFormat
    OutputFormat.JsonFlat -> JsonFlatFormat()
    OutputFormat.Null -> SimpleOutputFormat.Null
    OutputFormat.Bin1 -> SimpleOutputFormat.Bin1
    OutputFormat.Clustering -> SimpleOutputFormat.Clustering
    OutputFormat.Edge -> SimpleOutputFormat.Edge
  }

fun OutputFormatOptions(json: ObjectNode): OutputFormatOptions {
  val format = if (BlastTabFormatBase.JsonKey.Format in json)
    OutputFormat.fromJson(json[BlastTabFormatBase.JsonKey.Format])
  else
    invalid(json)

  val fields = if (BlastTabFormatBase.JsonKey.Fields in json)
    formatFields(json[BlastTabFormatBase.JsonKey.Fields])
  else
    emptyList()

  when (format) {
    OutputFormat.BlastTab -> return BlastTabFormat(fields)
    OutputFormat.JsonFlat -> return JsonFlatFormat(fields)
    else -> {}
  }

  if (fields.isNotEmpty()) {
    throw IllegalArgumentException("cannot specify report fields for output format ${format.jsonValue}")
  }

  return when (format) {
    OutputFormat.Pairwise -> SimpleOutputFormat.Pairwise
    OutputFormat.XML -> SimpleOutputFormat.XML
    OutputFormat.DiamondAlignmentArchive -> SimpleOutputFormat.DiamondAlignmentArchive
    OutputFormat.SequenceAlignmentMap -> SimpleOutputFormat.SequenceAlignmentMap
    OutputFormat.Taxon -> SimpleOutputFormat.TaxonomicClassification
    OutputFormat.PairwiseMappingFormat -> SimpleOutputFormat.PairwiseMappingFormat
    OutputFormat.Null -> SimpleOutputFormat.Null
    OutputFormat.Bin1 -> SimpleOutputFormat.Bin1
    OutputFormat.Clustering -> SimpleOutputFormat.Clustering
    OutputFormat.Edge -> SimpleOutputFormat.Edge

    else -> throw IllegalStateException()
  }
}

private fun formatFields(json: JsonNode): List<FormatField> {
  if (!json.isArray)
    return invalid(json)

  json as ArrayNode

  if (json.isEmpty)
    return emptyList()

  val out = ArrayList<FormatField>(json.size())

  for (entry in json) {
    out.add(FormatField.fromJson(entry))
  }

  return out
}
