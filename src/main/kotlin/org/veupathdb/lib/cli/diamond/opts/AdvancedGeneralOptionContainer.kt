/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http: *www.apache.org/licenses/LICENSE-2.0
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
import io.foxcapades.lib.cli.builder.flag.CliFlag

interface AdvancedGeneralOptionContainer {
  /**
   * File buffer size in bytes.
   *
   * Flag: `--file-buffer-size`
   *
   * Default: `67108864`
   */
  @CliFlag("file-buffer-size")
  @get:JsonGetter("fileBufferSize")
  @set:JsonSetter("fileBufferSize")
  var fileBufferSize: ULong?

  /**
   * Do not unlink temporary files.
   *
   * Flag: `--no-unlink`
   */
  @CliFlag("no-unlink")
  @get:JsonGetter("noUnlink")
  @set:JsonSetter("noUnlink")
  var noUnlink: Boolean?

  /**
   * Ignore warnings
   *
   * Flag: `--ignore-warnings`
   */
  @CliFlag("ignore-warnings")
  @get:JsonGetter("ignoreWarnings")
  @set:JsonSetter("ignoreWarnings")
  var ignoreWarnings: Boolean?

  /**
   * Print raw seqids without parsing
   *
   * Flag: `--no-parse-seqids`
   */
  @CliFlag("no-parse-seqids")
  @get:JsonGetter("noParseSeqIDs")
  @set:JsonSetter("noParseSeqIDs")
  var noParseSeqIDs: Boolean?
}
