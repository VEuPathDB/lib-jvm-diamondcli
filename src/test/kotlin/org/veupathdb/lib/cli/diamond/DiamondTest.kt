package org.veupathdb.lib.cli.diamond

import io.foxcapades.lib.cli.builder.Cli
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.TestInstance
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
}
