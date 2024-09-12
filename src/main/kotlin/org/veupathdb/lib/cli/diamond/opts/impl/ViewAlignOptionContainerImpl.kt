package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.ViewAlignOptionContainer

internal class ViewAlignOptionContainerImpl : ViewAlignOptionContainer {
  override var daa by pathFlag()
}
