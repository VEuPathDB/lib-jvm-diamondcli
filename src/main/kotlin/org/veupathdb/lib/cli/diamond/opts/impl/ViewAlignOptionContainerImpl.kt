package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.ViewAlignOptionContainer

class ViewAlignOptionContainerImpl : ViewAlignOptionContainer {
  override var daa by pathFlag()
}
