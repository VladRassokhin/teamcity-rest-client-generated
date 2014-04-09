package jetbrains.teamcity.rest.client.resources.impl;

import com.google.api.client.http.HttpResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import java.io.IOException;

public abstract class ResourceImpl {

    @NotNull
    protected final RequestsProcessor processor;

    public ResourceImpl(@NotNull final RequestsProcessor processor) {
        this.processor = processor;
    }

  public static <T> T safeParse(HttpResponse response, Class<T> clazz) {
    try {
      if ("application/json".equals(response.getContentType())) {
        return response.parseAs(clazz);
      } else {
        // Not good.
        System.err.println("Error: " + response.parseAsString());
        return null;
      }
    } catch (IOException e) {
      return null;
    }
  }
}
