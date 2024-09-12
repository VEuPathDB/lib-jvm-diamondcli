package org.veupathdb.lib.cli.diamond.util

internal inline fun <reified T : Any> invalid(value: Any): T =
  throw IllegalArgumentException("Invalid ${T::class.simpleName} value: $value")
