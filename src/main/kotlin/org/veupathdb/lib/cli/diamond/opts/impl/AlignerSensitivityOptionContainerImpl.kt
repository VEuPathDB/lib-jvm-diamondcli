package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.uintFlag
import io.foxcapades.lib.cli.builder.util.properties.MutableDefaultedProperty
import org.veupathdb.lib.cli.diamond.opts.AlignerSensitivityOptionContainer
import org.veupathdb.lib.cli.diamond.opts.fields.Sensitivity

internal class AlignerSensitivityOptionContainerImpl : AlignerSensitivityOptionContainer {
  override var sensitivity by MutableDefaultedProperty(Sensitivity.Default)
  override var shapes by uintFlag()
}
