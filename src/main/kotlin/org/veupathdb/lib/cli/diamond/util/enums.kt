package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.lib.cli.builder.arg.Argument
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import io.foxcapades.lib.cli.builder.flag.FlagOptions
import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.serial.CliArgumentWriter

// TODO: restrict this back to enum types, there should be different error
//       messages for complex types.
internal inline fun <reified T : Any> invalid(value: Any): T =
  throw IllegalArgumentException("Invalid ${T::class.simpleName} value: $value")


internal object CliEnumFormatter : ArgumentFormatter<CliEnum> {
  override fun formatValue(value: CliEnum, writer: CliArgumentWriter<*, CliEnum>, reference: Argument<CliEnum>) =
    writer.writeString(value.cliValue)
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

