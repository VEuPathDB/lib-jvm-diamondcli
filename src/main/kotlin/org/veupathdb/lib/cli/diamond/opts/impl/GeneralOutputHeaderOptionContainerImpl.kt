package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.flag
import org.veupathdb.lib.cli.diamond.opts.HeaderOption
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputHeaderOptionContainer

internal class GeneralOutputHeaderOptionContainerImpl : GeneralOutputHeaderOptionContainer {
  override var header by flag<HeaderOption>() // TODO: custom implementation for optional arg var
}
