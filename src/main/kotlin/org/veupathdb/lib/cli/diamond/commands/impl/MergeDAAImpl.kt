package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.builder.flag
import org.veupathdb.lib.cli.diamond.commands.MergeDAA
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOutputOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl
import java.nio.file.Path

internal class MergeDAAImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalOutputOptions: GeneralOutputOptionContainer = GeneralOutputOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : MergeDAA
  , GeneralOptionContainer by generalOptions
  , GeneralOutputOptionContainer by generalOutputOptions
  , HiddenOptionContainer by hiddenOptions
{
  override var inputFiles by flag<List<Path>> { argument.shouldQuote = false }
}
