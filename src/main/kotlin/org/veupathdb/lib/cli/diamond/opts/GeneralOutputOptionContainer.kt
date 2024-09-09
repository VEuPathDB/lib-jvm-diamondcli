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

package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.wrapper.meta.CliFlag
import java.nio.file.Path

interface GeneralOutputOptionContainer {
  /**
   * Path to the output file. If this parameter is omitted, the results will be
   * written to the standard output and all other program output will be
   * suppressed.
   *
   * > `--out/-o <file>`
   */
  @CliFlag("out", 'o')
  @get:JsonGetter("out")
  @set:JsonSetter("out")
  var outputFile: Path?
}
