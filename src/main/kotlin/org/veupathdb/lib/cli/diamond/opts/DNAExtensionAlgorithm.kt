package org.veupathdb.lib.cli.diamond.opts

enum class DNAExtensionAlgorithm {
  KSW,
  WFA,
  ;

  override fun toString() = name.lowercase()
}
