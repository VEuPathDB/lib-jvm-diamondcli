package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

// TODO: this name may be changed if other usages of the `--type` flag are
//       discovered.
enum class BenchmarkType(
  @get:JsonValue
  override val cliValue: String
) : CliSerializable {
  Swipe("swipe"),
  SeedHit("seedhit"),
  LoadSeqs("loadseqs"),
  LoadRaw("loadraw"),
  MMap("mmap"),
  MMapMt("mmap_mt"),
  BlastSeqID("blast_seqid"),
  BlastSeqIDLinear("blast_seqid"),
  IPS4O("ips4o")
  ;

  override fun toString() = name.lowercase()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isTextual -> fromString(json.textValue())
      else           -> invalid(json)
    }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.uppercase().let { target -> entries.find { it.cliValue == target } }
  }
}
