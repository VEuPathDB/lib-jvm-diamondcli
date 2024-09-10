package org.veupathdb.lib.cli.diamond

/**
 * Opt-in annotation for features that require the DIAMOND CLI tool to be
 * compiled with extras enabled.
 *
 * @since 1.0.0
 */
@RequiresOptIn(
  "This feature requires a DIAMOND tool installation that has been compiled " +
    "with extras enabled."
)
@Retention(AnnotationRetention.BINARY)
annotation class DiamondExtras

