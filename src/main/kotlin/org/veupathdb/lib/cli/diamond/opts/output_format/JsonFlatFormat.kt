package org.veupathdb.lib.cli.diamond.opts.output_format

class JsonFlatFormat(override var formatFields: Iterable<BlastTabFormatField> = emptyList())
  : BlastTabFormatBase<Iterable<BlastTabFormatField>>(OutputFormat.BlastTab)
