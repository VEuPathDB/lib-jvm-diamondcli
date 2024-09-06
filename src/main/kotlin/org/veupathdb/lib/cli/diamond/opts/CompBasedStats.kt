package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode

enum class CompBasedStats {
  Disabled,
  Hauser,
  Deprecated1,
  HauserAndMatrixAdjust,
  MatrixAdjust,
  // ONLY AVAILABLE WITH EXTRAS!!!
  CompBasedStats,
  CompBasedStatsAndMatrixAdjust,
  HauserGlobal,
  ;

  @get:JsonValue
  val value
    get() = ordinal

  val cliValue
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
