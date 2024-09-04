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
import java.nio.file.Path

interface GeneralOptionContainer {

  /**
   * Number of CPU threads.
   *
   * By default, the program will auto-detect and use all available virtual
   * cores on the machine.
   *
   * > `--threads/-p #`
   *
   * Setting this to a value that is less than or equal to zero results in the
   * option being omitted from the CLI call.
   *
   * Default: `0`
   */
  @get:JsonGetter("threads")
  @set:JsonSetter("threads")
  var threads: Int

  /**
   * Enable more verbose terminal output.
   *
   * > `--verbose/-v`
   *
   * Default: `false`
   *
   * TODO: verify whether this is mutually exclusive with [quiet]
   */
  @get:JsonGetter("verbose")
  @set:JsonSetter("verbose")
  var verbose: Boolean

  /**
   * Enable even more verbose terminal output, which is also written to a file
   * named `diamond.log` is the current working directory.
   *
   * > `--log`
   *
   * Default: `false`
   *
   * TODO: how does this interact with [quiet] and [verbose]?
   */
  @get:JsonGetter("log")
  @set:JsonSetter("log")
  var log: Boolean

  /**
   * Disable all terminal output.
   *
   * > `--quiet`
   *
   * Default: `false`
   *
   * TODO: verify whether this is mutually exclusive with [verbose]
   */
  @get:JsonGetter("quiet")
  @set:JsonSetter("quiet")
  var quiet: Boolean

  /**
   * Directory for temporary files.
   *
   * > `--tmpdir/-t <path>`
   *
   * Default: `null`
   */
  @get:JsonGetter("tmpdir")
  @set:JsonSetter("tmpdir")
  var tempDir: Path?
}

