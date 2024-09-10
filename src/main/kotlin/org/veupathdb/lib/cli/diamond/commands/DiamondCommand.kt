package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.DiamondCommand

sealed interface DiamondCommand {
  /**
   * Diamond subcommand.
   */
  val tool: DiamondCommand
}
