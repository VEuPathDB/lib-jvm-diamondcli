package org.veupathdb.lib.cli.diamond.opts.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.DiamondExtras
import org.veupathdb.lib.cli.diamond.util.CliSerializable
import org.veupathdb.lib.cli.diamond.util.invalid

enum class CompositionBasedStats(val rawCliValue: Int, @get:JsonValue val jsonName: String) : CliSerializable {
  /**
   * 0 -> DISABLED
   */
  Disabled(0, "disabled"),

  /**
   * 1 -> HAUSER
   */
  Hauser(1, "hauser"),

  /**
   * 2 -> DEPRECATED1
   */
  Deprecated1(2, "deprecated-1"),

  /**
   * 2 -> HAUSER_AND_AVG_MATRIX_ADJUST
   */
  @Deprecated("renamed to \"DEPRECATED1\" as of DIAMOND v2.1.0")
  HauserAndAverageMatrixAdjust(2, "hauser-and-avg-matrix-adjust"),

  /**
   * 3 -> HAUSER_AND_MATRIX_ADJUST
   */
  HauserAndMatrixAdjust(3, "hauser-and-matrix-adjust"),

  /**
   * 4 -> MATRIX_ADJUST
   */
  MatrixAdjust(4, "matrix-adjust"),

  /**
   * 5 -> COMP_BASED_STATS
   */
  @DiamondExtras
  CompBasedStats(5, "comp-based-stats"),

  /**
   * 6 -> COMP_BASED_STATS_AND_MATRIX_ADJUST
   */
  @DiamondExtras
  CompBasedStatsAndMatrixAdjust(6, "comp-based-stats-and-matrix-adjust"),

  /**
   * 7 -> HAUSER_GLOBAL
   */
  @DiamondExtras
  HauserGlobal(7, "hauser-global"),
  ;

  override val cliValue: String
    get() = rawCliValue.toString()

  override fun toString() =
    jsonName

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) =
      when {
        json.isIntegralNumber -> fromInt(json.intValue())
        json.isTextual        -> fromString(json.textValue())
        else                  -> invalid(json)
      }

    @JvmStatic
    fun fromInt(value: Int) =
      fromIntOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromIntOrNull(value: Int) =
      entries.find { it.rawCliValue == value }

    @JvmStatic
    fun fromString(value: String) =
      fromStringOrNull(value) ?: invalid(value)

    @JvmStatic
    fun fromStringOrNull(value: String) =
      value.lowercase().let { target -> entries.find { it.jsonName == target } }
  }
}
