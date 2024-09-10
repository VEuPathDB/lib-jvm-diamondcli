/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond

import org.veupathdb.lib.cli.diamond.commands.DiamondCommandConfig
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
interface DiamondConfig<out T : DiamondCommandConfig> {

  /**
   * Diamond CLI tool-specific options.
   *
   * The type of this value may be determined by use of the [tool] property.
   */
  val options: T
}
