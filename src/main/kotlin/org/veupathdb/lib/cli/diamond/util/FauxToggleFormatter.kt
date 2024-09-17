package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter

internal class FauxToggleFormatter : ArgumentFormatter<Boolean> {
  override fun formatValue(value: Boolean, writer: CliArgumentWriter<*, Boolean>, reference: Argument<Boolean>) {}
}
