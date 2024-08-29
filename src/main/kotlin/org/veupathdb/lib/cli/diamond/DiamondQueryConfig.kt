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

import java.nio.file.Path

/**
 * Represents a CLI call to a DIAMOND query command such as `blastp` or
 * `blastx`.
 */
interface DiamondQueryConfig : DiamondConfig {
  /**
   * Path to the DIAMOND database file.
   *
   * Specify the base path of the database without file extensions.
   *
   * > `--db/-d <file>`
   */
  var databaseFile: Path

  /**
   * Path to the query input file in FASTA or FASTQ format (may be gzip
   * compressed, or zstd compressed if compiled with zstd support). If this
   * parameter is omitted, the input will be read from `stdin`.
   *
   * Two files that contain the same number of sequences may be supplied when
   * running in blastx mode.
   *
   * > `--query/-q <file>`
   *
   * Default: `null`
   *
   * TODO: blastp and blastx split here, this may be 2 values for blastx
   * TODO: how are 2 files represented in the cli call?
   */
  var queryFile: Path?

  /**
   * List of NCBI taxonomic IDs to filter the database by.
   *
   * Any taxonomic rank can be used, and only reference sequences matching one
   * of the specified taxon ids will be searched against.
   *
   * > `--taxonlist <list>`
   *
   * **NOTE**: If specified but set to an empty list, the CLI call will be
   * created containing the literal string `--taxonlist ''`.
   *
   * Default: `null`
   */
  var taxonList: List<String>?

  /**
   * Comma-separated list of NCBI taxonomic IDs to exclude from the database.
   *
   * > `--taxon-exclude <list>`
   *
   * **NOTE**: If specified but set to an empty list, the CLI call will be
   * created containing the literal string `--taxon-exclude ''`.
   *
   * Default: `null`
   */
  var taxonExcludeList: List<String>?

  /**
   * Filter the database by a list of accessions provided as a text file.
   *
   * Only supported when using a BLAST database.
   *
   * > `--seqidlist <filename>`
   *
   * Default: `null`
   */
  var sequenceIdListFile: Path?

  /**
   * Genetic code used for translation of query in BLASTX mode.
   *
   * By default, the Standard Code is used.
   *
   * **Note**: changing the genetic code is currently not fully supported for
   * the DAA format.
   *
   * > `--query-gencode #`
   *
   * TODO: This is for blastx only
   * TODO: resolve the values to a numeric enum
   * TODO: update default
   *
   * Default: `1`
   */
  var queryGenCode: Int

  /**
   * Set strand of query to align for translated searches.
   *
   * > `--strand {both, plus, minus}`
   *
   * Default: [Strand.Both]
   */
  var strand: Strand

  /**
   * Ignore translated sequences that do not contain an open reading frame of at
   * least this length.
   *
   * By default, this feature is disabled for sequences of length below `30`,
   * set to `20` for sequences of length below `100`, and set to `40` otherwise.
   *
   * Setting this option to `1` will disable this feature.
   *
   * > `--min-orf/-l #`
   *
   * Default: `null`
   */
  var minimumOpenReadingFrame: Int?
}