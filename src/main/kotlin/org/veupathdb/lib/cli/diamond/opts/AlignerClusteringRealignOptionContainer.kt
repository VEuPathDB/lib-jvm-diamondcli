package org.veupathdb.lib.cli.diamond.opts

interface AlignerClusteringRealignOptionContainer {
  ("comp-based-stats", 0, "composition based statistics mode (0-4)", comp_based_stats, 1u)
  ("masking", 0, "masking algorithm (none, seg, tantan=default)", masking_)
  ("soft-masking", 0, "soft masking (none=default, seg, tantan)", soft_masking)
  ("mmseqs-compat", 0, "", mmseqs_compat)
  ("no-block-size-limit", 0, "", no_block_size_limit);
}

