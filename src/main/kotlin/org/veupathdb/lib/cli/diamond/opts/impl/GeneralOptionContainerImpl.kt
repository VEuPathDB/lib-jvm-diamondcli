package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.intFlag
import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import io.foxcapades.lib.cli.wrapper.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer

class GeneralOptionContainerImpl : GeneralOptionContainer {
  override var threads by intFlag()
  override var verbose by toggleFlag()
  override var log by toggleFlag()
  override var quiet by toggleFlag()
  override var tempDir by pathFlag()
}
