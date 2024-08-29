package org.veupathdb.lib.cli.diamond.opts

interface AlignerSensitivityOptionContainer {
  ("faster", 0, "enable faster mode", mode_faster)
  ("fast", 0, "enable fast mode", mode_fast)
  ("mid-sensitive", 0, "enable mid-sensitive mode", mode_mid_sensitive)
  ("shapes-30x10", 0, "enable mode using 30 seed shapes of weight 10", mode_shapes30x10)
  ("sensitive", 0, "enable sensitive mode)", mode_sensitive)
  ("more-sensitive", 0, "enable more sensitive mode", mode_more_sensitive)
  ("very-sensitive", 0, "enable very sensitive mode", mode_very_sensitive)
  ("ultra-sensitive", 0, "enable ultra sensitive mode", mode_ultra_sensitive)
  ("shapes", 's', "number of seed shapes (default=all available)", shapes);
}