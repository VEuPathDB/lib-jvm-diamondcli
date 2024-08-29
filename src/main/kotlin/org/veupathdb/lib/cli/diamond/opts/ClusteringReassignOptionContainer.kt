package org.veupathdb.lib.cli.diamond.opts

interface ClusteringReassignOptionContainer {
  ("memory-limit", 'M', "Memory limit in GB (default = 16G)", memory_limit)
  ("member-cover", 0, "Minimum coverage% of the cluster member sequence (default=80.0)", member_cover)
  ("mutual-cover", 0, "Minimum mutual coverage% of the cluster member and representative sequence", mutual_cover);
}