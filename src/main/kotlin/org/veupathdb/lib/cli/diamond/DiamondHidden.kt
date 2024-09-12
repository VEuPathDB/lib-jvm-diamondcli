package org.veupathdb.lib.cli.diamond

/**
 * Opt-in annotation for features that are explicitly marked as hidden in the
 * DIAMOND CLI tool source code.
 *
 * @since 1.0.0
 */
@RequiresOptIn("This feature is intentionally hidden in the DIAMOND tool.")
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class DiamondHidden
