package org.veupathdb.lib.cli.diamond

import io.foxcapades.lib.cli.builder.Cli
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.TestInstance
import org.veupathdb.lib.cli.diamond.commands.DiamondCommandConfig
import org.veupathdb.lib.jackson.Json
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Diamond")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DiamondTest {

  @Nested
  @DisplayName("blastP")
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  inner class BlastP {

    @Test
    fun t1() {
      val target = Diamond.blastP {
        verySensitive = true
      }

      assertEquals("diamond 'blastp' --very-sensitive", Cli.toCliString(target))
    }
  }

  @Nested
  @DisplayName(" * META * ")
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  inner class Meta {

    @Nested
    @DisplayName("JSON Deserialization")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class FromJSON {

      @Test
      fun t1() {
        val json = """{"tool":"blastp"}"""

        assertEquals(DiamondCommand.BlastP, Json.parse<DiamondCommandConfig>(json).tool)
      }
    }
  }
}
