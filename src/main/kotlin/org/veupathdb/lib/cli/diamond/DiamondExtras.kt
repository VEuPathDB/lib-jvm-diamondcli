package org.veupathdb.lib.cli.diamond

@RequiresOptIn(
  "This feature requires a DIAMOND tool installation that has been compiled " +
    "with extras enabled."
)
@Retention(AnnotationRetention.BINARY)
annotation class DiamondExtras

