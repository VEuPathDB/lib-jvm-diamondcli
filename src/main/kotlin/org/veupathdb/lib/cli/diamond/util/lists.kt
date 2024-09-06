package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.wrapper.Argument
import io.foxcapades.lib.cli.wrapper.Flag
import io.foxcapades.lib.cli.wrapper.FlagOptions
import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.serial.CliArgumentAppender
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter

private object ListFlagFormatter : ArgumentFormatter<List<Any?>> {
  override fun formatValue(value: List<Any?>, builder: CliArgumentAppender) {
    value.forEach { builder.appendString(it.toString()) }
  }
}

@Suppress("UNCHECKED_CAST")
internal inline fun <T> listFlag(action: FlagOptions<List<String>>.() -> Unit = {}) =
  flag(List::class) {
    argument {
      shouldQuote = false
      formatter = ListFlagFormatter
    }
  } as Flag<Argument<List<T>>, List<T>>
