package org.veupathdb.lib.cli.diamond.opts.fields

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter

internal object HeaderOptionFormatter : ArgumentFormatter<HeaderOption> {
  override fun formatValue(
    value: HeaderOption,
    writer: CliArgumentWriter<*, HeaderOption>,
    reference: Argument<HeaderOption>,
  ) {
    when (value) {
      HeaderOption.None -> writer.rawWriteChar('0')
      HeaderOption.Enabled -> {}
      HeaderOption.Simple -> writer.rawWriteString("simple")
      HeaderOption.Verbose -> writer.rawWriteString("verbose")
    }
  }
}
