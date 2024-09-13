package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.uintFlag
import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.Sensitivity
import org.veupathdb.lib.cli.diamond.util.DefaultableProperty

internal class AlignerSensitivityOptionContainerImpl : AlignerSensitivityOptionContainer {
  override var sensitivity by DefaultableProperty(Sensitivity.Default)
  override var shapes by uintFlag()
}
