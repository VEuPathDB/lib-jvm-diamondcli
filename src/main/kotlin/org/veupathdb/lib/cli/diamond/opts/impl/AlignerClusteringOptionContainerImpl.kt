package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.doubleFlag
import org.veupathdb.lib.cli.diamond.opts.AlignerClusteringOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.ExtensionMode
import org.veupathdb.lib.cli.diamond.opts.fields.MotifMaskingAlgorithm
import org.veupathdb.lib.cli.diamond.util.customFlag

internal class AlignerClusteringOptionContainerImpl : AlignerClusteringOptionContainer {
  override var expectValue by doubleFlag { default = 0.001 }
  override var motifMasking by customFlag<MotifMaskingAlgorithm>()
  override var approxIdentity by doubleFlag()
  override var extensionMode by customFlag<ExtensionMode>()
}
