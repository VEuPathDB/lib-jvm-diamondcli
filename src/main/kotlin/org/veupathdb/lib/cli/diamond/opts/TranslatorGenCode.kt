package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.JsonNode
import org.veupathdb.lib.cli.diamond.util.CliEnum
import org.veupathdb.lib.cli.diamond.util.invalid

enum class TranslatorGenCode(
  @get:JsonValue
  val code: UByte
) : CliEnum {
  // skip 0
  Standard(1u),
  VertebrateMitochondrial(2u),
  YeastMitochondrial(3u),
  MoldMitochondrial(4u),
  ProtozoanMitochondrial(4u),
  CoelenterateMitochondrial(4u),
  Mycoplasma(4u),
  Spiroplasma(4u),
  InvertebrateMitochondrial(5u),
  CiliateNuclear(6u),
  DasycladaceanNuclear(6u),
  HexamitaNuclear(6u),
  // skip 7
  // skip 8
  EchinodermMitochondrial(9u),
  FlatwormMitochondrial(9u),
  EuplotidNuclear(10u),
  BacterialPlastid(11u),
  ArchaealPlastid(11u),
  PlantPlastid(11u),
  AlternativeYeastNuclear(12u),
  AscidianMitochondrial(13u),
  AlternativeFlatwormMitochondrial(14u),
  // BlepharismaNuclear(15u) -- diamond does not support this
  ChlorophyceanMitochondrial(16u),
  // skip 17
  // skip 18
  // skip 19
  // skip 20
  TrematodeMitochondrial(21u),
  ScenedesmusObliquusMitochondrial(22u),
  ThraustochytriumMitochondrial(23u),
  RhabdopleuridaeMitochondrial(24u),
  CandidateDivisionSR1(25u),
  Gracilibacteria(25u),
  PachysolenTannophilusNuclear(26u),
  // KaryorelictNuclear(27u), -- diamond does not support this
  // CondylostomaNuclear(28u), -- diamond does not support this
  // MesodiniumNuclear(29u), -- diamond does not support this
  // PeritrichNuclear(30u), -- diamond does not support this
  // BlastocrithidiaNuclear(31u), -- diamond does not support this
  // skip 32
  // CephalodiscidaeMitochondrialUAATyr(33u), -- diamond does not support this
  ;

  override val cliValue: String
    get() = code.toString()

  override fun toString() = cliValue

  companion object {
    @JvmStatic
    @JsonCreator
    fun fromJson(json: JsonNode) = when {
      json.isIntegralNumber -> fromInt(json.intValue())
      else                  -> invalid(json)
    }

    @JvmStatic
    fun fromInt(value: Int) = when {
      value in 1..33 -> value.toUByte().let { code -> entries.find { it.code == code } }
      else               -> null
    } ?: invalid(value)
  }
}
