package org.veupathdb.lib.cli.diamond.opts

interface AlignerClusteringOptionContainer {
  ("evalue", 'e', "maximum e-value to report alignments (default=0.001)", max_evalue, 0.001)
  ("motif-masking", 0, "softmask abundant motifs (0/1)", motif_masking)
  ("approx-id", 0, "minimum approx. identity% to report an alignment/to cluster sequences", approx_min_id)
  ("ext", 0, "Extension mode (banded-fast/banded-slow/full)", ext_);
}