package org.veupathdb.lib.cli.diamond.opts.output_format

@JvmInline
value class SimpleOutputFormat private constructor(override val formatType: OutputFormat) : OutputFormatOptions {
  companion object {
    @JvmStatic
    val Pairwise by lazy { SimpleOutputFormat(OutputFormat.Pairwise) }

    @JvmStatic
    val XML by lazy { SimpleOutputFormat(OutputFormat.XML) }

    @JvmStatic
    val DiamondAlignmentArchive by lazy { SimpleOutputFormat(OutputFormat.DiamondAlignmentArchive) }

    @JvmStatic
    inline val DAA
      get() = DiamondAlignmentArchive

    @JvmStatic
    val SequenceAlignmentMap by lazy { SimpleOutputFormat(OutputFormat.SequenceAlignmentMap) }

    @JvmStatic
    inline val SAM
      get() = SequenceAlignmentMap

    @JvmStatic
    val TaxonomicClassification by lazy { SimpleOutputFormat(OutputFormat.Taxon) }

    @JvmStatic
    val PairwiseMappingFormat by lazy { SimpleOutputFormat(OutputFormat.PairwiseMappingFormat) }

    @JvmStatic
    inline val PAF
      get() = PairwiseMappingFormat

    @JvmStatic
    val Null by lazy { SimpleOutputFormat(OutputFormat.Null) }

    @JvmStatic
    val Bin1 by lazy { SimpleOutputFormat(OutputFormat.Bin1) }

    @JvmStatic
    val Clustering by lazy { SimpleOutputFormat(OutputFormat.Clustering) }

    @JvmStatic
    val Edge by lazy { SimpleOutputFormat(OutputFormat.Edge) }
  }

  override fun toString() = formatType.toString()
}
