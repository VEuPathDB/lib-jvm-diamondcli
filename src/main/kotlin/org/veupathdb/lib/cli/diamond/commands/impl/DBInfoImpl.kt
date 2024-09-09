package org.veupathdb.lib.cli.diamond.commands.impl

import org.veupathdb.lib.cli.diamond.commands.DBInfo
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralDBOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.GeneralOptionContainerImpl
import org.veupathdb.lib.cli.diamond.opts.impl.HiddenOptionContainerImpl

internal class DBInfoImpl(
  private val generalOptions: GeneralOptionContainer = GeneralOptionContainerImpl(),
  private val generalDBOptions: GeneralDBOptionContainer = GeneralDBOptionContainerImpl(),
  private val hiddenOptions: HiddenOptionContainer = HiddenOptionContainerImpl(),
)
  : DBInfo
  , GeneralOptionContainer by generalOptions
  , GeneralDBOptionContainer by generalDBOptions
  , HiddenOptionContainer by hiddenOptions
