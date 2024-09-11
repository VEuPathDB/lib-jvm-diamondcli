package org.veupathdb.lib.cli.diamond.util

internal fun String.truncate(maxLen: Int) =
  if (length > maxLen) take(maxLen - 3) + "..." else this
