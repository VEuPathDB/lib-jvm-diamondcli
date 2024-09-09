package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import org.veupathdb.lib.cli.diamond.HeaderOption
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputHeaderOptionContainer

class GeneralOutputHeaderOptionContainerImpl : GeneralOutputHeaderOptionContainer {
  override var header by flag<HeaderOption>() // TODO: custom implementation for optional arg var
}
