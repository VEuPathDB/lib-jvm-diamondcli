package org.veupathdb.lib.cli.diamond.commands

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.util.DiamondCommandConfigDeserializer

@JsonDeserialize(using = DiamondCommandConfigDeserializer::class)
sealed interface DiamondCommandConfig {
  /**
   * Diamond subcommand.
   */
  @get:JsonGetter("tool")
  val tool: DiamondCommand
}
