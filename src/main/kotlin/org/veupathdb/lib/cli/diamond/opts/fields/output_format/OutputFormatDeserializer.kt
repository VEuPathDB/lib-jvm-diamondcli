package org.veupathdb.lib.cli.diamond.opts.fields.output_format

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode

internal class OutputFormatDeserializer() : JsonDeserializer<OutputFormatOptions>() {
  override fun deserialize(parser: JsonParser, context: DeserializationContext?) =
    OutputFormatOptions(parser.readValueAs(JsonNode::class.java))
}
