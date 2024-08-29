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

interface AdvancedGeneralOptionContainer {
  ("file-buffer-size", 0, "file buffer size in bytes (default=67108864)", file_buffer_size, (size_t)67108864)
  ("no-unlink", 0, "Do not unlink temporary files.", no_unlink)
  ("ignore-warnings", 0, "Ignore warnings", ignore_warnings)
  ("no-parse-seqids", 0, "Print raw seqids without parsing", no_parse_seqids);
}