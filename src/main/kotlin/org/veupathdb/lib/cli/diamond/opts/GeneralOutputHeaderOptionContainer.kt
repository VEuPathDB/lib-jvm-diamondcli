package org.veupathdb.lib.cli.diamond.opts

import org.veupathdb.lib.cli.diamond.HeaderOption

interface GeneralOutputHeaderOptionContainer {
  /**
   * Use header lines in tabular output format.
   *
   * > `--header [option]`
   *
   * Default: [HeaderOption.None]
   */
  var header: HeaderOption
}

