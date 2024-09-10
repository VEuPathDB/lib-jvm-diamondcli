package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.toggleFlag
import io.foxcapades.lib.cli.wrapper.flag.ulongFlag
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer

internal class AdvancedGeneralOptionContainerImpl : AdvancedGeneralOptionContainer {
  override var fileBufferSize by ulongFlag { default = 67108864u }
  override var noUnlink by toggleFlag()
  override var ignoreWarnings by toggleFlag()
  override var noParseSeqIDs by toggleFlag()
}
