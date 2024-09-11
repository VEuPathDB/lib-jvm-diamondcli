package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.wrapper.FlagOptions
import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.serial.CliArgumentAppender
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter

internal inline fun <reified T : Any> invalid(value: Any): T =
  throw IllegalArgumentException("Invalid ${T::class.simpleName} value: $value")


internal object CliEnumFormatter : ArgumentFormatter<CliEnum> {
  override fun formatValue(value: CliEnum, builder: CliArgumentAppender) {
    builder.appendString(value.cliValue)
  }
}

@Suppress("UNCHECKED_CAST")
internal fun <T : CliEnum> enumFormatter(): ArgumentFormatter<T> =
  CliEnumFormatter as ArgumentFormatter<T>

interface CliEnum {
  val cliValue: String
}

internal inline fun <reified E : CliEnum> enumFlag(noinline action: FlagOptions<E>.() -> Unit = {}) =
  flag(E::class) {
    argument.formatter = enumFormatter()
    action()
  }

