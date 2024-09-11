package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode
import org.veupathdb.lib.cli.diamond.util.invalid
import org.veupathdb.lib.cli.diamond.util.logger
import org.veupathdb.lib.cli.diamond.util.truncate

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
  val log = logger<OutputFormatOptions>()

  var format: OutputFormat? = null
  var fields: List<FormatField>? = null

  for ((k, v) in json.fields()) {
    when (k.lowercase()) {
      "format" -> format = OutputFormat.fromJson(v)
      "fields" -> fields = formatFields(v)
      else     -> log.info("ignoring unknown format fields json key \"{}\"", k.truncate(16))
    }
  }
}

private fun formatFields(json: JsonNode): List<FormatField>? {
  if (!json.isArray)
    return invalid(json)



}
