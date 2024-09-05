package org.veupathdb.lib.cli.diamond.opts.output_format

enum class OutputFormat(val intForm: Int, val stringForm: String) {
  Pairwise(0),
  XML(5, "xml"),
  BlastTab(6, "tab"),
  DiamondAlignmentArchive(100, "daa"),
  SAM(101, "sam"),
  Taxon(102),
  PAF(103, "paf"),
  JsonFlat(104, "json-flat"),
  Null("null"),
  Bin1("bin1"),
  Clustering("clus"),
  Edge("edge")
  ;

  constructor(intForm: Int) : this(intForm, "")

  constructor(stringForm: String) : this(-1, stringForm)

  inline val hasIntForm get() = intForm >= 0

  inline val hasStringForm get() = stringForm.isNotEmpty()

  // TODO: confirm no other formats allow customization!
  inline val acceptsFormatParams get() = this == BlastTab || this == JsonFlat

  override fun toString() = toString(false)

  fun toString(preferStringForm: Boolean) =
    if (preferStringForm && hasStringForm || !hasIntForm)
      stringForm
    else
      intForm.toString()
}
