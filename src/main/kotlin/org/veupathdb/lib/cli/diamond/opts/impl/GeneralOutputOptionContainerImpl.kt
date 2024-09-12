package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer

internal class GeneralOutputOptionContainerImpl : GeneralOutputOptionContainer {
  override var outputFile by pathFlag()
}
