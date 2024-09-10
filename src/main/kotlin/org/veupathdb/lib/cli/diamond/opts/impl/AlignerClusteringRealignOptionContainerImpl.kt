package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.util.enumFormatter

internal class AlignerClusteringRealignOptionContainerImpl : AlignerClusteringRealignOptionContainer {
  override var compBasedStats by flag<CompositionBasedStats> {
    default = CompositionBasedStats.Hauser
    argument.formatter = enumFormatter()
  }

  override var masking by flag<MaskingMode> {
    default = MaskingMode.Tantan
    argument.formatter = enumFormatter()
  }

  override var softMasking by flag<SoftMaskingAlgorithm> { argument.formatter = enumFormatter() }

  override var mmseqsCompat by toggleFlag()

  override var noBlockSizeLimit by toggleFlag()
}
