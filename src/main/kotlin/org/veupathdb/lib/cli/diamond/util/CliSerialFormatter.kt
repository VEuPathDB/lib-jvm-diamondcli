package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter

internal object CliSerialFormatter : ArgumentFormatter<CliSerializable> {
  override fun formatValue(value: CliSerializable, writer: CliArgumentWriter<*, CliSerializable>, reference: Argument<CliSerializable>) =
    writer.writeString(value.cliValue)
}
