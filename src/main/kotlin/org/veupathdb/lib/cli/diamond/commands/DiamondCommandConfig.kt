package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.DiamondCommand

sealed interface DiamondCommandConfig {
  /**
   * Diamond subcommand.
   */
  val tool: DiamondCommand
}
