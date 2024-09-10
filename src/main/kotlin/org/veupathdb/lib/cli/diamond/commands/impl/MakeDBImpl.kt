package org.veupathdb.lib.cli.diamond.commands.impl

import io.foxcapades.lib.cli.wrapper.flag.pathFlag
import org.veupathdb.lib.cli.diamond.commands.MakeDB
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.AdvancedGeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralDBOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl

internal class MakeDBImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val advancedGeneralOptions: AdvancedGeneralOptionContainer = AdvancedGeneralOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : MakeDB
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , AdvancedGeneralOptionContainer by advancedGeneralOptions
  , HiddenOptionContainer by hiddenOptions
{
  override var inputFile by pathFlag()
  override var taxonMapFile by pathFlag()
  override var taxonNodesFile by pathFlag()
  override var taxonNamesFile by pathFlag()
}
