package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.flag
import org.veupathdb.lib.cli.diamond.opts.fields.HeaderOption
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputHeaderOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.HeaderOptionFormatter

internal class GeneralOutputHeaderOptionContainerImpl : GeneralOutputHeaderOptionContainer {
  override var header by flag<HeaderOption> { formatter = HeaderOptionFormatter }
}
