package org.veupathdb.lib.cli.diamond.opts

import java.nio.file.Path

interface GeneralOptionContainer {

  /**
   * Number of CPU threads.
   *
   * By default, the program will auto-detect and use all available virtual
   * cores on the machine.
   *
   * > `--threads/-p #`
   *
   * Setting this to a value that is less than or equal to zero results in the
   * option being omitted from the CLI call.
   *
   * Default: `0`
   */
  var threads: Int

  /**
   * Enable more verbose terminal output.
   *
   * > `--verbose/-v`
   *
   * Default: `false`
   *
   * TODO: verify whether this is mutually exclusive with [quiet]
   */
  var verbose: Boolean

  /**
   * Enable even more verbose terminal output, which is also written to a file
   * named `diamond.log` is the current working directory.
   *
   * > `--log`
   *
   * Default: `false`
   *
   * TODO: how does this interact with [quiet] and [verbose]?
   */
  var log: Boolean

  /**
   * Disable all terminal output.
   *
   * > `--quiet`
   *
   * Default: `false`
   *
   * TODO: verify whether this is mutually exclusive with [verbose]
   */
  var quiet: Boolean

  /**
   * Directory for temporary files.
   *
   * > `--tmpdir/-t <path>`
   *
   * Default: `null`
   */
  var tempDir: Path?
}

