package org.veupathdb.lib.cli.diamond.opts.output_format

// TODO: need a custom renderer for this
sealed class BlastTabFormatBase<T : Iterable<FormatField>>(override val formatType: OutputFormat)
  : OutputFormatOptions
{
  abstract val formatFields: T

  override fun toString() =
    StringBuilder(1024)
      .append(formatType.toString())
      .apply { formatFields.forEach { append(' ').append(it.toString()) } }
      .toString()
}

