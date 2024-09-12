package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.util.enumFormatter

internal class AlignerClusteringRealignOptionContainerImpl : AlignerClusteringRealignOptionContainer {
  override var compBasedStats by flag<CompositionBasedStats> {
    default = CompositionBasedStats.Hauser
    formatter = enumFormatter()
  }

  override var masking by flag<MaskingMode> {
    default = MaskingMode.Tantan
    formatter = enumFormatter()
  }

  override var softMasking by flag<SoftMaskingAlgorithm> { formatter = enumFormatter() }

  override var mmseqsCompat by toggleFlag()

  override var noBlockSizeLimit by toggleFlag()
}
