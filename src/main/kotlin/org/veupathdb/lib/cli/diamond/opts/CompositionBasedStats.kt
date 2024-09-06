package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.DiamondExtras
import org.veupathdb.lib.cli.diamond.util.CliEnum

enum class CompositionBasedStats(
  @get:JsonValue
  val jsonName: String
) : CliEnum {
  Disabled("disabled"),
  Hauser("hauser"),
  Deprecated1("deprecated-1"),
  HauserAndMatrixAdjust("hauser-and-matrix-adjust"),
  MatrixAdjust("matrix-adjust"),

  @DiamondExtras
  CompBasedStats("comp-based-stats"),

  @DiamondExtras
  CompBasedStatsAndMatrixAdjust("comp-based-stats-and-matrix-adjust"),

  @DiamondExtras
  HauserGlobal("hauser-global"),
  ;

  @get:JsonValue
  val value
    get() = ordinal

  override val cliValue
    get() = toString()

  override fun toString() = ordinal.toString()

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isIntegralNumber && json.intValue() in entries.indices -> entries[json.intValue()]
        else -> throw IllegalArgumentException("Invalid CompBasedStats value: $json")
      }
  }
}
