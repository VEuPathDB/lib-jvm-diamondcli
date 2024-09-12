package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.flag.FlagOptions
import io.foxcapades.lib.cli.builder.flag.flag

interface CliSerializable {
  val cliValue: String
}

internal inline fun <reified T : CliSerializable> customFlag(crossinline fn: FlagOptions<T>.() -> Unit = {}) =
  flag<T> {
    @Suppress("UNCHECKED_CAST")
    formatter = CliSerialFormatter as ArgumentFormatter<T>

    fn()
  }

