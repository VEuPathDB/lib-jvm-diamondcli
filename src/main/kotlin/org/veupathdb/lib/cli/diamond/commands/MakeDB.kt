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

package org.veupathdb.lib.cli.diamond.commands

import io.foxcapades.lib.cli.wrapper.meta.CliCommand
import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer
import java.nio.file.Path

@CliCommand(Command, SubCommands.MakeDB)
interface MakeDB
  : GeneralOptionContainer
  , GeneralDBOptionContainer
  , AdvancedGeneralOptionContainer
  , HiddenOptionContainer
{
  /**
   * Path to the input protein reference database file in FASTA format (may be
   * gzip compressed).
   *
   * If this parameter is omitted, the input will be read from stdin.
   *
   * > `--in <file>`
   */
  var inputFile: Path

  /**
   * Path to mapping file that maps NCBI protein accession numbers to taxon ids
   * (gzip compressed).
   *
   * This parameter is optional and needs to be supplied in order to provide
   * taxonomy features.
   *
   * A file can be downloaded from NCBI, or a custom file following the same
   * format may be supplied here. Note that the first line of this file is
   * assumed to contain headings and will be ignored.
   *
   * > `--taxonmap <file>`
   */
  var taxonMapFile: Path?

  /**
   * Path to the `nodes.dmp` file from the NCBI taxonomy.
   *
   * This parameter is optional and needs to be supplied in order to provide
   * taxonomy features.
   *
   * The file is contained within this archive downloadable at NCBI.
   *
   * > `--taxonnodes <file>`
   */
  var taxonNodesFile: Path?

  /**
   * Path to the `names.dmp` file from the NCBI taxonomy.
   *
   * This parameter is optional and needs to be supplied in order to provide
   * taxonomy features.
   *
   * The file is contained within this archive downloadable at NCBI.
   *
   * > `--taxonnames <file>`
   */
  var taxonNamesFile: Path?
}
