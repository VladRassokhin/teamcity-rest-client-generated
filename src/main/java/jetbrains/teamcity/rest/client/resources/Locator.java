package jetbrains.teamcity.rest.client.resources;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public abstract class Locator {

  private Locator() {
  }

  public static class Dimensioned extends Locator {
    private Map<String, String> dimensions;

    private Dimensioned() {
      dimensions = new HashMap<String, String>(1);
    }

    private String escape(String value) {
      // TODO: escape , : ( )
      return value;
    }

    @Override
    public String toString() {
      final StringBuilder builder = new StringBuilder();
      for (Map.Entry<String, String> entry : dimensions.entrySet()) {
        builder.append(entry.getKey()).append(":").append(escape(entry.getValue()));
      }
      return builder.toString();
    }

    public Dimensioned with(@NotNull final String key, @NotNull final String value) {
      dimensions.put(key, value);
      return this;
    }
  }

  @NotNull
  public static Locator simple(@NotNull final String value) {
    return new Locator() {
      @Override
      public String toString() {
        return value;
      }
    };
  }

  @NotNull
  public static Dimensioned dimensioned() {
    return new Dimensioned();
  }
}
