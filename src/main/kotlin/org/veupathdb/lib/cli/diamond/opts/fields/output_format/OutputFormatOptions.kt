package org.veupathdb.lib.cli.diamond.opts.fields.output_format

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

@JsonDeserialize(using = OutputFormatDeserializer::class)
sealed interface OutputFormatOptions {
  val formatType: OutputFormat
}
