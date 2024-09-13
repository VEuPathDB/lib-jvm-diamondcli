package org.veupathdb.lib.cli.diamond.opts.fields

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@DisplayName("MemoryLimit")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MemoryLimitTest {

  @Nested
  @DisplayName("Companion")
  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  inner class Companion {

    @Nested
    @DisplayName("::fromStringOrNull(String)")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    inner class FromStringOrNull1 {

      @Test
      @DisplayName("1G -> 1000000000")
      fun t1() {
        assertEquals(1000000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1G")).value)
      }

      @Test
      @DisplayName("1g -> 1000000000")
      fun t2() {
        assertEquals(1000000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1g")).value)
      }

      @Test
      @DisplayName("1M -> 1000000")
      fun t3() {
        assertEquals(1000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1M")).value)
      }

      @Test
      @DisplayName("1m -> 1000000")
      fun t4() {
        assertEquals(1000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1m")).value)
      }

      @Test
      @DisplayName("1K -> 1000")
      fun t5() {
        assertEquals(1000uL, assertNotNull(MemoryLimit.fromStringOrNull("1K")).value)
      }

      @Test
      @DisplayName("1k -> 1000")
      fun t6() {
        assertEquals(1000uL, assertNotNull(MemoryLimit.fromStringOrNull("1k")).value)
      }

      @Test
      @DisplayName("1T -> 1000000000000")
      fun t7() {
        assertEquals(1000000000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1T")).value)
      }

      @Test
      @DisplayName("1t -> 1000000000000")
      fun t8() {
        assertEquals(1000000000000uL, assertNotNull(MemoryLimit.fromStringOrNull("1t")).value)
      }

      @Test
      @DisplayName("0.5K -> 500")
      fun t9() {
        assertEquals(500uL, assertNotNull(MemoryLimit.fromStringOrNull("0.5K")).value)
      }
    }

    @Nested
    @DisplayName("::cliValue")
    inner class CliValue1 {


      @Test
      @DisplayName("1000000000 -> 1G")
      fun t1() {
        assertEquals("1G", MemoryLimit(1000000000uL).cliValue)
      }

      @Test
      @DisplayName("1000000 -> 1M")
      fun t3() {
        assertEquals("1M", MemoryLimit(1000000uL).cliValue)
      }

      @Test
      @DisplayName("1000 -> 1K")
      fun t5() {
        assertEquals("1K", MemoryLimit(1000uL).cliValue)
      }

      @Test
      @DisplayName("1000000000000 -> 1T")
      fun t7() {
        assertEquals("1T", MemoryLimit(1000000000000uL).cliValue)
      }

      @Test
      @DisplayName("500 ->0.5K")
      fun t9() {
        assertEquals("0.5K", MemoryLimit(500uL).cliValue)
      }
    }
  }
}
