package org.valkyrienskies.mechanica.services

import net.minecraft.core.Registry
import net.minecraft.resources.ResourceKey
import org.valkyrienskies.mechanica.registry.DeferredRegister

interface DeferredRegisterBackend {
    fun <T> makeDeferredRegister(id: String, registry: ResourceKey<Registry<T>>): DeferredRegister<T>
}
