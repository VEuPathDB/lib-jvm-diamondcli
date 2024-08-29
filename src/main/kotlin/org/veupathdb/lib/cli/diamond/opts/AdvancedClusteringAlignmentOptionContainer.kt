package org.veupathdb.lib.cli.diamond.opts

interface AdvancedClusteringAlignmentOptionContainer {
  ("bin", 0, "number of query bins for seed search", query_bins_)
  ("ext-chunk-size", 0, "chunk size for adaptive ranking (default=auto)", ext_chunk_size)
  ("no-ranking", 0, "disable ranking heuristic", no_ranking)
  ("dbsize", 0, "effective database size (in letters)", db_size)
  ("no-auto-append", 0, "disable auto appending of DAA and DMND file extensions", no_auto_append)
  ("tantan-minMaskProb", 0, "minimum repeat probability for masking (default=0.9)", tantan_minMaskProb, 0.9);
}