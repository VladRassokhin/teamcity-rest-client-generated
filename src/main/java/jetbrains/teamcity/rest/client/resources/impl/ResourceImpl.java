package jetbrains.teamcity.rest.client.resources.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

public abstract class ResourceImpl {

    @NotNull
    protected final RequestsProcessor processor;

    public ResourceImpl(@NotNull final RequestsProcessor processor) {
        this.processor = processor;
    }
}
