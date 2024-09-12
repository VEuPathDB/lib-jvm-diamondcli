package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

@JvmInline
value class RadixBits(private val rawValue: UByte) : CliSerializable {
  @get:JsonValue
  val jsonValue
    get() = rawValue.toInt()

  override val cliValue: String
    get() = rawValue.toString()

  init {
    if (rawValue > 32u)
      invalid<RadixBits>(rawValue)
  }

  @JsonCreator
  constructor(value: Int) : this(if (value !in 0..255) invalid(value) else value.toUByte())
}
