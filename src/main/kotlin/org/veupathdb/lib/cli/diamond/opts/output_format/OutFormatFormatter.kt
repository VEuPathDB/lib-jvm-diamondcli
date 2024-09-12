package org.veupathdb.lib.cli.diamond.opts.output_format

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter

internal object OutFormatFormatter : ArgumentFormatter<OutputFormatOptions> {
  override fun formatValue(
    value: OutputFormatOptions,
    writer: CliArgumentWriter<*, OutputFormatOptions>,
    reference: Argument<OutputFormatOptions>,
  ) {
    writer.rawWriteString(value.formatType.cliValue)

    if (value is BlastTabFormatBase<*>)
      for (field in value.formatFields)
        writer.rawWriteString(field.cliValue)
  }
}
