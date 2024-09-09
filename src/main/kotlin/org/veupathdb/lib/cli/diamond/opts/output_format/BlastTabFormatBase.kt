package org.veupathdb.lib.cli.diamond.opts.output_format

sealed class BlastTabFormatBase<T : Iterable<BlastTabFormatField>>(override val formatType: OutputFormat)
  : OutputFormatOptions
{
  abstract val formatFields: T

  override fun toString() =
    StringBuilder(1024)
      .append(formatType.toString())
      .apply { formatFields.forEach { append(' ').append(it.toString()) } }
      .toString()
}

