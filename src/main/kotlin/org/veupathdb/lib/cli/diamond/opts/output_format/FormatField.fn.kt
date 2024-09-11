package org.veupathdb.lib.cli.diamond.opts.output_format

private var formatFieldCache: Map<String, FormatField>? = null

internal fun cacheFormatFields() {
  if (formatFieldCache == null) {
    val tmp = HashMap<String, FormatField>(FormatField.entries.size*2)

    FormatField.entries.forEach {
      tmp[it.key] = it
      tmp[it.jsonValue] = it
    }

    formatFieldCache = tmp
  }
}

internal fun formatFieldCache() = formatFieldCache
