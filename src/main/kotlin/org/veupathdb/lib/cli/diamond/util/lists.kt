package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.flag.DelegateFlag
import io.foxcapades.lib.cli.builder.flag.FlagOptions
import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter


private object ListFlagFormatter : ArgumentFormatter<List<Any?>> {
  override fun formatValue(
    value: List<Any?>,
    writer: CliArgumentWriter<*, List<Any?>>,
    reference: Argument<List<Any?>>
  ) {
    value.forEach { writer.rawWriteString(it.toString()) }
  }
}

@Suppress("UNCHECKED_CAST")
internal inline fun <T> listFlag(action: FlagOptions<List<String>>.() -> Unit = {}) =
  flag(List::class) {
    shouldQuote = false
    formatter = ListFlagFormatter
  } as DelegateFlag<List<T>>
