package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.wrapper.flag
import org.veupathdb.lib.cli.diamond.commands.GetSeq
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralDBOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOutputOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl

internal class GetSeqImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : GetSeq
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , HiddenOptionContainer by hiddenOptions
{
  override var seq by flag<List<Int>> { argument.shouldQuote = false }
}
