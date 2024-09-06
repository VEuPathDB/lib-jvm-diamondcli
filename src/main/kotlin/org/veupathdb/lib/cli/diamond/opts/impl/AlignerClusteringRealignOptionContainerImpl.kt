package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.toggleFlag
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter
import org.veupathdb.lib.cli.diamond.opts.AlignerClusteringRealignOptionContainer
import org.veupathdb.lib.cli.diamond.opts.CompBasedStats
import org.veupathdb.lib.cli.diamond.opts.MaskingMode
import org.veupathdb.lib.cli.diamond.opts.SoftMaskingAlgorithm

class AlignerClusteringRealignOptionContainerImpl : AlignerClusteringRealignOptionContainer {
  override var compBasedStats by flag<CompBasedStats> {
    default = CompBasedStats.Hauser
    argument.formatter = ArgumentFormatter.simple(CompBasedStats::cliValue)
  }

  override var masking by flag<MaskingMode> {
    default = MaskingMode.Tantan
    argument.formatter = ArgumentFormatter.simple(MaskingMode::cliValue)
  }

  override var softMasking by flag<SoftMaskingAlgorithm> {
    argument.formatter = ArgumentFormatter.simple(SoftMaskingAlgorithm::cliValue)
  }

  override var mmseqsCompat by toggleFlag()

  override var noBlockSizeLimit by toggleFlag()
}
