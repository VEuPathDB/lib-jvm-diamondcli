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

interface AdvancedQueryOptionContainer {
  ("algo", 0, "Seed search algorithm (0=double-indexed/1=query-indexed/ctg=contiguous-seed)", algo_str)
  ("min-orf", 'l', "ignore translated sequences without an open reading frame of at least this length", run_len)
  ("seed-cut", 0, "cutoff for seed complexity", seed_cut_)
  ("freq-masking", 0, "mask seeds based on frequency", freq_masking)
  ("freq-sd", 0, "number of standard deviations for ignoring frequent seeds", freq_sd_, 0.0)
  ("id2", 0, "minimum number of identities for stage 1 hit", min_identities_)
  ("linsearch", 0, "only consider seed hits against longest target for identical seeds", linsearch)
  ("lin-stage1", 0, "only consider seed hits against longest query for identical seeds", lin_stage1)
  ("xdrop", 'x', "xdrop for ungapped alignment", ungapped_xdrop, 12.3)
  ("gapped-filter-evalue", 0, "E-value threshold for gapped filter (auto)", gapped_filter_evalue_, -1.0)
  ("band", 0, "band for dynamic programming computation", padding)
  ("shape-mask", 0, "seed shapes", shape_mask)
  ("multiprocessing", 0, "enable distributed-memory parallel processing", multiprocessing)
  ("mp-init", 0, "initialize multiprocessing run", mp_init)
  ("mp-recover", 0, "enable continuation of interrupted multiprocessing run", mp_recover)
  ("mp-query-chunk", 0, "process only a single query chunk as specified", mp_query_chunk, -1)
  ("culling-overlap", 0, "minimum range overlap with higher scoring hit to delete a hit (default=50%)", inner_culling_overlap, 50.0)
  ("taxon-k", 0, "maximum number of targets to report per species", taxon_k, (uint64_t)0)
  ("range-cover", 0, "percentage of query range to be covered for range culling (default=50%)", query_range_cover, 50.0)
  ("xml-blord-format", 0, "Use gnl|BL_ORD_ID| style format in XML output", xml_blord_format)
  ("sam-query-len", 0, "add the query length to the SAM format (tag ZQ)", sam_qlen_field)
  ("stop-match-score", 0, "Set the match score of stop codons against each other.", stop_match_score, 1)
  ("target-indexed", 0, "Enable target-indexed mode", target_indexed)
  ("unaligned-targets", 0, "", unaligned_targets)
  ("cut-bar", 0, "", cut_bar)
  ("check-multi-target", 0, "", check_multi_target)
  ("roc-file", 0, "", roc_file)
  ("family-map", 0, "", family_map)
  ("family-map-query", 0, "", family_map_query)
  ("query-parallel-limit", 0, "", query_parallel_limit, 3000000u)
  ("log-evalue-scale", 0, "", log_evalue_scale, 1.0 / std::log(2.0))
  ("bootstrap", 0, "", bootstrap)
  ("heartbeat", 0, "", heartbeat)
  ("mp-self", 0, "", mp_self)
  #ifdef EXTRA
  ("zdrop", 'z', "zdrop for gapped dna alignment", zdrop, 40)
  #endif
  #ifdef WITH_DNA
  ("repetition-cutoff", 0 ,"filter out top FLOAT fraction of repetitive minimizers ",repetitive_cutoff,0.0002)
  ("extension", 0, "extension algorithm (wfa, ksw=default)", dna_extension_string, string("ksw"))
  ("chaining-out", 0, "use chaining without extension", chaining_out)
  ("align-long-reads", 0, "use chaining with extension", align_long_reads)
  ("chain-pen-gap-scale", 0, "scaling factor for the chaining gap penalty", chain_pen_gap_scale, 0.8)
  ("chain-pen-skip-scalee", 0, "scaling factor for the chaining skip penalty", chain_pen_skip_scale, 0.0)
  ("penalty", 0, "blastn mismatch penalty", mismatch_penalty, -3)
  ("reward", 0, "blastn match reward", match_reward, 2)
  #endif
  ("query-or-subject-cover", 0, "", query_or_target_cover);
}