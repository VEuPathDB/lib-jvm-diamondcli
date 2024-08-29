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

interface AlignerClusteringRealignOptionContainer {
  ("comp-based-stats", 0, "composition based statistics mode (0-4)", comp_based_stats, 1u)
  ("masking", 0, "masking algorithm (none, seg, tantan=default)", masking_)
  ("soft-masking", 0, "soft masking (none=default, seg, tantan)", soft_masking)
  ("mmseqs-compat", 0, "", mmseqs_compat)
  ("no-block-size-limit", 0, "", no_block_size_limit);
}

