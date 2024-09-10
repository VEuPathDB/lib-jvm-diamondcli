package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.doubleFlag
import org.veupathdb.lib.cli.diamond.opts.AlignerClusteringOptionContainer
import org.veupathdb.lib.cli.diamond.opts.ExtensionMode
import org.veupathdb.lib.cli.diamond.opts.MotifMaskingAlgorithm
import org.veupathdb.lib.cli.diamond.util.enumFormatter

internal class AlignerClusteringOptionContainerImpl : AlignerClusteringOptionContainer {
  override var expectValue by doubleFlag { default = 0.001 }
  override var motifMasking by flag<MotifMaskingAlgorithm> { argument.formatter = enumFormatter() }
  override var approxIdentity by doubleFlag()
  override var extensionMode by flag<ExtensionMode> { argument.formatter = enumFormatter() }
}
