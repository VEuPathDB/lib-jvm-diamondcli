package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import java.nio.file.Path

interface MergeDAA : GeneralOptionContainer, GeneralOutputOptionContainer, HiddenOptionContainer {
  var inputFiles: List<Path>
}