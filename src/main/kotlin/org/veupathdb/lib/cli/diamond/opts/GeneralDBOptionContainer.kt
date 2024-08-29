package org.veupathdb.lib.cli.diamond.opts

import java.nio.file.Path

interface GeneralDBOptionContainer {
  /**
   * Path to the target DIAMOND database file.
   *
   * > `--db/-d <file>`
   */
  var databaseFile: Path
}