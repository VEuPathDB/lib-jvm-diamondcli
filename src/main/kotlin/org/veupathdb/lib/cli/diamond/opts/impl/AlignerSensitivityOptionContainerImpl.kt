package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.uintFlag
import io.foxcapades.lib.cli.wrapper.util.MutableDefaultedProperty
import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.Sensitivity

internal class AlignerSensitivityOptionContainerImpl : AlignerSensitivityOptionContainer {
  override var sensitivity by MutableDefaultedProperty(Sensitivity.Default)
  override var shapes by uintFlag()
}
