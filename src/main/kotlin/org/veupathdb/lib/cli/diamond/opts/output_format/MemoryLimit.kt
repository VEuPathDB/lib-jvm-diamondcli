package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid
import java.math.BigDecimal
import java.math.BigInteger
import java.text.DecimalFormat

data class MemoryLimit(val value: ULong) : CliSerializable {
  override val cliValue: String by lazy {
    when {
      value > 1000000000000uL -> format.format((BigInteger(value.toString()).toBigDecimal() / BigDecimal("1e12")).toDouble()) + "T"
      value > 1000000000uL    -> format.format(value.toDouble() / 1e9) + "G"
      value > 1000000uL       -> format.format(value.toDouble() / 1e6) + "M"
      else                    -> format.format(value.toDouble() / 1e3) + "K"
    }
  }

  override fun toString() = cliValue

  companion object {
    private val format by lazy { DecimalFormat("#.###") }

    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isTextual        -> fromString(json.textValue())
        json.isIntegralNumber -> MemoryLimit(json.longValue().toULong())
        else                  -> invalid(json)
      }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      when(value.last()) {
        'G', 'g' -> (value.dropLast(1).toDouble() * 1e9).toULong()
        'M', 'm' -> (value.dropLast(1).toDouble() * 1e6).toULong()
        'K', 'k' -> (value.dropLast(1).toDouble() * 1e3).toULong()
        'T', 't' -> (value.dropLast(1).toBigDecimal() * BigDecimal("1e12"))
          .toBigInteger()
          .toString()
          .toULong()
        else -> null
      }?.let(::MemoryLimit)
  }
}
