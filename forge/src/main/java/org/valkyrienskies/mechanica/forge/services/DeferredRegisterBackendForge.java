package org.valkyrienskies.mechanica.forge.services;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import org.jetbrains.annotations.NotNull;
import org.valkyrienskies.mechanica.forge.DeferredRegisterImpl;
import org.valkyrienskies.mechanica.registry.DeferredRegister;
import org.valkyrienskies.mechanica.services.DeferredRegisterBackend;

public class DeferredRegisterBackendForge implements DeferredRegisterBackend {

    @NotNull
    @Override
    public <T> DeferredRegister<T> makeDeferredRegister(
            @NotNull final String id,
            @NotNull final ResourceKey<Registry<T>> registry
    ) {
        return new DeferredRegisterImpl(id, registry);
    }
}
