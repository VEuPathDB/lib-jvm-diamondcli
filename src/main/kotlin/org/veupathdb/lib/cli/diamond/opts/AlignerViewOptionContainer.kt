package org.veupathdb.lib.cli.diamond.opts

interface AlignerViewOptionContainer {
  ("max-target-seqs", 'k', "maximum number of target sequences to report alignments for (default=25)", max_target_seqs_)
  ("top", 0, "report alignments within this percentage range of top alignment score (overrides --max-target-seqs)", toppercent, 100.0);
}