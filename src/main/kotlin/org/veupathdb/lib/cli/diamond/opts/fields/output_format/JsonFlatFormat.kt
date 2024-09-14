package org.veupathdb.lib.cli.diamond.opts.fields.output_format

class JsonFlatFormat(override var formatFields: Iterable<FormatField> = emptyList())
  : BlastTabFormatBase<Iterable<FormatField>>(OutputFormat.BlastTab)
