package org.veupathdb.lib.cli.diamond.opts

import java.nio.file.Path

interface GeneralOutputOptionContainer {
  /**
   * Path to the output file. If this parameter is omitted, the results will be
   * written to the standard output and all other program output will be
   * suppressed.
   *
   * > `--out/-o <file>`
   */
  var outputFile: Path?
}