package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer

interface GetSeq
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputOptionContainer
  , HiddenOptionContainer
{
  ("seq", 0, "Space-separated list of sequence numbers to display.", seq_no);
}