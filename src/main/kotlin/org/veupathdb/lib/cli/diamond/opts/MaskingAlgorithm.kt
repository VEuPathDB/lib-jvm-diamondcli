package org.veupathdb.lib.cli.diamond.opts

enum class MaskingAlgorithm {
  None,
  Motif,
  ;

  override fun toString() = ordinal.toString()
}
