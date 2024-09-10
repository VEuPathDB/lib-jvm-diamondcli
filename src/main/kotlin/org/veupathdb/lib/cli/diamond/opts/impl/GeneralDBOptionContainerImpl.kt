package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer

internal class GeneralDBOptionContainerImpl : GeneralDBOptionContainer {
  override var databaseFile by pathFlag()
}
