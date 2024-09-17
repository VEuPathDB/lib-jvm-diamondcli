package org.veupathdb.lib.cli.diamond.util

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.module.kotlin.contains
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.commands.DiamondCommandConfig
import org.veupathdb.lib.cli.diamond.commands.impl.BlastPImpl
import org.veupathdb.lib.cli.diamond.commands.impl.BlastXImpl
import org.veupathdb.lib.jackson.Json

internal class DiamondCommandConfigDeserializer : JsonDeserializer<DiamondCommandConfig>() {
  override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DiamondCommandConfig {
    val obj = ctxt.readValue(p, ObjectNode::class.java)

    if ("tool" !in obj)
      throw JsonMappingException(
        p,
        "cannot deserialize given JSON into a DIAMOND command configuration; the given object has no \"tool\" property"
      )

    return when (DiamondCommand.fromJson(obj["tool"])) {
      DiamondCommand.BlastP -> Json.parse<BlastPImpl>(obj)
      DiamondCommand.BlastX -> Json.parse<BlastXImpl>(obj)
      else -> TODO("unsupported type")
    }
  }
}
