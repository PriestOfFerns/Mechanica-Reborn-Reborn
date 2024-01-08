package org.valkyrienskies.mechanica.registry

interface RegistrySupplier<T> {

    val name: String
    fun get(): T
}
