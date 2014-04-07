package generated.resources;

import generated.WebApplicationExceptionMessage;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.Map;

public class Utils {
  public static final String METHOD_GET = "GET";
  public static final String METHOD_DELETE = "DELETE";
  public static final String TEXT_PLAIN = "text/plain";

  public static WebTarget getWebTarget(UriBuilder builder, Client client, Map<String, Object> map) {
    final UriBuilder localUriBuilder = builder.clone();
    return client.target(localUriBuilder.buildFromMap(map));
  }

  public static Invocation.Builder getBuilder(UriBuilder builder, Client client, Map<String, Object> map, String type) {
    final WebTarget resource = getWebTarget(builder, client, map);
    return resource.request(type);
  }

  public static Invocation.Builder getBuilder(UriBuilder builder, Client client, Map<String, Object> map) {
    final WebTarget resource = getWebTarget(builder, client, map);
    return resource.request();
  }

  public static Response delete(WebTarget resource) {
    Invocation.Builder resourceBuilder = resource.request();
    return resourceBuilder.build(METHOD_DELETE).invoke();
  }

  public static <T> T getReturnValue(Class<T> returnType, Response response) {
    if (!Response.class.isAssignableFrom(returnType)) {
      return response.readEntity(returnType);
    } else {
      return returnType.cast(response);
    }
  }

  public static String getStringValue(Response response) {
    return response.readEntity(String.class);
  }

  public static String getAsString(WebTarget resource) {
    Invocation.Builder resourceBuilder = resource.request(TEXT_PLAIN);
    Response response = resourceBuilder.build(METHOD_GET).invoke();
    throwExceptionIfWrongStatus(response);
    return getStringValue(response);
  }

  public static void throwExceptionIfWrongStatus(Response response) {
    if (response.getStatus() >= 400) {
      throw new WebApplicationExceptionMessage(response);
    }
  }
}
