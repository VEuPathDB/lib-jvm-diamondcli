package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag.booleanFlag
import io.foxcapades.lib.cli.wrapper.flag.ulongFlag
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer

class AdvancedGeneralOptionContainerImpl : AdvancedGeneralOptionContainer {
  override var fileBufferSize by ulongFlag { default = 67108864u }

  override var noUnlink by booleanFlag { isToggleFlag = true }

  override var ignoreWarnings by booleanFlag { isToggleFlag = true }

  override var noParseSeqIDs by booleanFlag { isToggleFlag = true }
}
