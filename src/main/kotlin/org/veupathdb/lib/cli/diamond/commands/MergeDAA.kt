package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import java.nio.file.Path

interface MergeDAA : GeneralOptionContainer, GeneralOutputOptionContainer {
  var inputFiles: List<Path>
}