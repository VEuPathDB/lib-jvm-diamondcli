package org.veupathdb.lib.cli.diamond.opts

interface ClusteringGeneralOptionContainer {
  ("cluster-steps", 0, "Clustering steps", cluster_steps)
  ("kmer-ranking", 0, "Rank sequences based on kmer frequency in linear stage", kmer_ranking)
  ("round-coverage", 0, "Per-round coverage cutoffs for cascaded clustering", round_coverage)
  ("round-approx-id", 0, "Per-round approx-id cutoffs for cascaded clustering", round_approx_id);

}