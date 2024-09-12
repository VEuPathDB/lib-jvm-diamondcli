package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.intFlag
import io.foxcapades.lib.cli.builder.flag.pathFlag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer

internal class GeneralOptionContainerImpl : GeneralOptionContainer {
  override var threads by intFlag()
  override var verbose by toggleFlag()
  override var log by toggleFlag()
  override var quiet by toggleFlag()
  override var tempDir by pathFlag()
}
