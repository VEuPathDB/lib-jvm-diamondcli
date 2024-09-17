package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.kt.prop.delegation.getOr
import io.foxcapades.lib.cli.builder.flag.Flag
import io.foxcapades.lib.cli.builder.flag.filter.FlagPredicate
import io.foxcapades.lib.cli.builder.serial.CliSerializationConfig
import io.foxcapades.lib.cli.builder.util.values.ValueSource

internal class FauxToggleTest : FlagPredicate<Boolean> {
  override fun shouldInclude(flag: Flag<Boolean>, config: CliSerializationConfig, source: ValueSource) =
    flag.getOr(false)
}
