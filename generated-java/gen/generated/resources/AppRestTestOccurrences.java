package generated.resources;

import generated.TeamCityClient;
import generated.data.TestOccurrence;
import generated.data.TestOccurrences;
import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class AppRestTestOccurrences extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestTestOccurrences(Client client, URI baseUri, TeamCityClient tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/testOccurrences");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public TestOccurrences get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(TestOccurrences.class);
  }
  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public TestOccurrences get(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(TestOccurrences.class);
  }

  public TestLocator testLocator(String testlocator) {
    return new TestLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), testlocator);
  }

  public class TestLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private TestLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public TestLocator(Client client, URI baseUri, String testlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{testLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("testLocator", testlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public TestLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/testOccurrences/{testLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get testLocator
     */
    public String getTestlocator() {
      return ((String) _templateAndMatrixParameterValues.get("testLocator"));
    }

    /**
     * Duplicate state and set testLocator
     */
    public TestLocator setTestlocator(String testlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("testLocator", testlocator);
      return new TestLocator(_client, copyUriBuilder, copyMap);
    }

    public TestOccurrence get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrence.class);
    }

    public TestOccurrence get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrence.class);
    }
  }
}
