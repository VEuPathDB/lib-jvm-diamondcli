package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.doubleFlag
import io.foxcapades.lib.cli.builder.flag.longFlag
import org.veupathdb.lib.cli.diamond.opts.AlignerViewOptionContainer

internal class AlignerViewOptionContainerImpl : AlignerViewOptionContainer {
  override var maxTargetSeqs by longFlag()
  override var top by doubleFlag()
}
