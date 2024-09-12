package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonValue
import org.veupathdb.lib.jackson.Json

// TODO: need a custom renderer for this
sealed class BlastTabFormatBase<T : Iterable<FormatField>>(override val formatType: OutputFormat)
  : OutputFormatOptions
{
  abstract val formatFields: T

  @JsonValue
  fun jsonValue() =
    Json.newObject {
      put(JsonKey.Format, formatType.jsonValue)
      put(JsonKey.Fields, Json.newArray { formatFields.forEach { add(it.jsonValue) } })
    }

  override fun toString() =
    StringBuilder(1024)
      .append(formatType.toString())
      .apply { formatFields.forEach { append(' ').append(it.cliValue) } }
      .toString()

  internal object JsonKey {
    const val Format = "format"
    const val Fields = "fields"
  }
}

