package org.veupathdb.lib.cli.diamond

import java.nio.file.Path

/**
 * Represents a CLI call to DIAMOND's `makedb` command.
 */
interface DiamondDBCreationConfig : DiamondConfig {
  var inputFile: Path?

}