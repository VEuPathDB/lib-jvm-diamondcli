package org.veupathdb.lib.cli.diamond.util

import io.foxcapades.kt.prop.delegation.MutableDefaultableDelegateProperty
import io.foxcapades.kt.prop.delegation.NoSuchValueException
import kotlin.reflect.KProperty

internal class DefaultableProperty<T>(default: T) : MutableDefaultableDelegateProperty<T, T> {
  private val default: T = default
  private var value: T? = null

  override val hasDefault
    get() = true

  override var isSet = false
    private set

  override fun get(): T =
    @Suppress("UNCHECKED_CAST")
    if (isSet)
      value as T
    else
      throw NoSuchValueException()

  override fun getDefault(): T = default

  override fun getValue(thisRef: Any?, property: KProperty<*>): T =
    @Suppress("UNCHECKED_CAST")
    if (isSet)
      value as T
    else
      default

  override fun unset() {
    value = null
    isSet = false
  }

  override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.value = value
    this.isSet = true
  }

  override fun set(value: T) {
    this.value = value
    this.isSet = true
  }
}
