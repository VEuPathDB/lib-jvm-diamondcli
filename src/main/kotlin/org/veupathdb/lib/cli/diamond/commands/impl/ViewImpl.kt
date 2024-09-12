package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.builder.flag.pathFlag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import org.veupathdb.lib.cli.diamond.commands.View
import org.veupathdb.lib.cli.diamond.opts.*
import org.veupathdb.lib.cli.diamond.opts.impl.*

internal class ViewImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputHeaderOptions: GeneralOutputHeaderOptionContainer = GeneralOutputHeaderOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val alignViewOptions: AlignerViewOptionContainer = AlignerViewOptionContainerImpl(),
  private val outputFormatOptions: OutputFormatOptionContainer = OutputFormatOptionContainerImpl(),
  private val viewAlignOptions: ViewAlignOptionContainer = ViewAlignOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : View
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputHeaderOptionContainer by generalOutputHeaderOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , AlignerViewOptionContainer by alignViewOptions
  , OutputFormatOptionContainer by outputFormatOptions
  , ViewAlignOptionContainer by viewAlignOptions
  , HiddenOptionContainer by hiddenOptions
{
  override var inputFile by pathFlag()
  override var forwardOnly by toggleFlag()
}
