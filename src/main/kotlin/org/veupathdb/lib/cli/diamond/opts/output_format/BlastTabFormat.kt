package org.veupathdb.lib.cli.diamond.opts.output_format

class BlastTabFormat(override var formatFields: Iterable<FormatField> = emptyList())
  : BlastTabFormatBase<Iterable<FormatField>>(OutputFormat.BlastTab)
