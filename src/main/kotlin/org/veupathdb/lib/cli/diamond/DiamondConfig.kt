package org.veupathdb.lib.cli.diamond

import java.nio.file.Path
import kotlin.jvm.Throws

/**
 * Base options common to most standard¹ DIAMOND CLI command calls.
 *
 * ¹:
 * * `makedb`
 * * `prepdb`
 * * `blastp`
 * * `blastx`
 * * `cluster`
 * * `linclust`
 * * `realign`
 * * `recluster`
 * * `reassign`
 * * `view`
 * * `merge-daa`
 * * `getseq`
 * * `dbinfo`
 * * `makeidx`
 * * `greedy-vertex-cover`
 * * `deepclust`
 */
interface DiamondConfig {
  /**
   * Command that will be executed.
   *
   * **NOTE**: Subtypes of [DiamondConfig] place restrictions on what values
   * are permitted for this property.
   *
   * Attempting to set this property to a value that is not supported by the
   * implementing subtype will result in an [IllegalArgumentException] being
   * thrown.
   */
  @set:Throws(IllegalArgumentException::class)
  var tool: DiamondCommand
}