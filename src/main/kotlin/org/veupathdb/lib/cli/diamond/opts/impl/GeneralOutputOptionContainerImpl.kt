package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer

class GeneralOutputOptionContainerImpl : GeneralOutputOptionContainer {
  override var outputFile by pathFlag()
}
