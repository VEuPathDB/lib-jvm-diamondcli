@file:Suppress("NOTHING_TO_INLINE")
package org.veupathdb.lib.cli.diamond.util

import org.slf4j.LoggerFactory
import kotlin.reflect.KClass

internal inline fun logger(name: String) = LoggerFactory.getLogger(name)!!

internal inline fun <reified T : Any> logger() = logger(T::class)

internal inline fun logger(type: KClass<*>) = LoggerFactory.getLogger(type.java)!!
