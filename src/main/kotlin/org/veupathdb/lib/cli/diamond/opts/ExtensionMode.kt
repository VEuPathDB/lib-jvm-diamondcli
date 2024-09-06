package org.veupathdb.lib.cli.diamond.opts

enum class ExtensionMode(val value: String) {
  BandedFast("banded-fast"),
  BandedSlow("banded-slow"),
  Full("full"),
  Global("global"),
  ;

  override fun toString() = value
}
