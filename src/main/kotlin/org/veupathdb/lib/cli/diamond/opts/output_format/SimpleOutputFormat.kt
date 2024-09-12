package org.veupathdb.lib.cli.diamond.opts.output_format

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.invalid

@JvmInline
value class SimpleOutputFormat private constructor(override val formatType: OutputFormat) : OutputFormatOptions {

  @get:JsonValue
  val jsonValue
    get() = formatType.jsonValue

  override fun toString() = formatType.toString()

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

    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      OutputFormat.fromJson(json)
        .takeIf { !it.acceptsFormatParams }
        ?.let { SimpleOutputFormat(it) }
        ?: invalid(json)

    @JvmStatic
    fun fromString(value: String) =
      OutputFormat.fromString(value)
        .takeIf { !it.acceptsFormatParams }
        ?.let { SimpleOutputFormat(it) }
        ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      OutputFormat.fromStringOrNull(value)
        ?.takeIf { !it.acceptsFormatParams }
        ?.let { SimpleOutputFormat(it) }
  }
}
