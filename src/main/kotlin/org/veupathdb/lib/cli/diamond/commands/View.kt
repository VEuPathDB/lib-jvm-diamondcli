package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.*
import java.nio.file.Path

interface View
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputHeaderOptionContainer
  , GeneralOutputOptionContainer
  , AlignerViewOptionContainer
  , OutputFormatOptionContainer
  , ViewAlignOptionContainer
{
  var inputFile: Path

  ("forwardonly", 0, "only show alignments of forward strand", forwardonly);
}