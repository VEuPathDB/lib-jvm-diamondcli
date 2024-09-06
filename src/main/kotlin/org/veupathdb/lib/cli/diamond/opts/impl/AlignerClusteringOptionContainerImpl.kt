package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.doubleFlag
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter
import org.veupathdb.lib.cli.diamond.opts.AlignerClusteringOptionContainer
import org.veupathdb.lib.cli.diamond.opts.ExtensionMode
import org.veupathdb.lib.cli.diamond.opts.MotifMaskingAlgorithm

class AlignerClusteringOptionContainerImpl : AlignerClusteringOptionContainer {
  override var expectValue by doubleFlag { default = 0.001 }

  override var motifMasking by flag<MotifMaskingAlgorithm> { argument.formatter = ArgumentFormatter.ofToString() }

  override var approxIdentity by doubleFlag()

  override var extensionMode by flag<ExtensionMode> { argument.formatter = ArgumentFormatter.ofToString() }
}
