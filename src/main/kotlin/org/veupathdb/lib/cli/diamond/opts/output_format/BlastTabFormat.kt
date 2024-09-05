package org.veupathdb.lib.cli.diamond.opts.output_format

class BlastTabFormat(override var formatFields: Iterable<BlastTabFormatField> = emptyList())
  : BlastTabFormatBase<Iterable<BlastTabFormatField>>(OutputFormat.BlastTab)
