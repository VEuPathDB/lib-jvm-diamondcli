package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.opts.AlignerClusteringRealignOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.CompositionBasedStats
import org.veupathdb.lib.cli.diamond.opts.fields.MaskingMode
import org.veupathdb.lib.cli.diamond.opts.fields.SoftMaskingAlgorithm
import org.veupathdb.lib.cli.diamond.util.customFlag

internal class AlignerClusteringRealignOptionContainerImpl : AlignerClusteringRealignOptionContainer {
  override var compBasedStats by customFlag<CompositionBasedStats> { default = CompositionBasedStats.Hauser }
  override var masking by customFlag<MaskingMode>() { default = MaskingMode.Tantan }
  override var softMasking by customFlag<SoftMaskingAlgorithm>()
  override var mmseqsCompat by toggleFlag()
  override var noBlockSizeLimit by toggleFlag()
}
