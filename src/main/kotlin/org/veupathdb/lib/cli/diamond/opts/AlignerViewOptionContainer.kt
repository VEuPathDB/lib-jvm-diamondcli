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

interface AlignerViewOptionContainer {
  ("max-target-seqs", 'k', "maximum number of target sequences to report alignments for (default=25)", max_target_seqs_)
  ("top", 0, "report alignments within this percentage range of top alignment score (overrides --max-target-seqs)", toppercent, 100.0);
}