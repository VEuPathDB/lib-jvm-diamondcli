package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.AdvancedGeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import java.nio.file.Path

interface MakeDB : GeneralOptionContainer, GeneralDBOptionContainer, AdvancedGeneralOptionContainer {
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