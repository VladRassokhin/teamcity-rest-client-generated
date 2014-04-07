package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides some debug abilities for the server. Experimental only. Should be used with caution or
 * better not used if not advised by JetBrains
 * These should never be used for non-debug purposes and the API here can change in future versions of
 * TeamCity without any notice.
 */
public class AppRestDebug extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestDebug(Client client, URI baseUri, TeamcityJetbrainsCom tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/debug");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public DatabaseQueryQuery databaseQueryQuery(String query) {
    return new DatabaseQueryQuery(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), query);
  }

  public VcsCheckingForChangesQueue vcsCheckingForChangesQueue() {
    return new VcsCheckingForChangesQueue(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
  }

  public DatabaseTables databaseTables() {
    return new DatabaseTables(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
  }

  public class DatabaseQueryQuery {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private DatabaseQueryQuery(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public DatabaseQueryQuery(Client client, URI baseUri, String query) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/database/query/{query}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("query", query);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public DatabaseQueryQuery(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/debug/database/query/{query}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get query
     */
    public String getQuery() {
      return ((String) _templateAndMatrixParameterValues.get("query"));
    }

    /**
     * Duplicate state and set query
     */
    public DatabaseQueryQuery setQuery(String query) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("query", query);
      return new DatabaseQueryQuery(_client, copyUriBuilder, copyMap);
    }

    public <T> T getAsTextPlainCharsetUTF8(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    public <T> T getAsTextPlainCharsetUTF8(String fielddelimiter, Integer count, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fieldDelimiter", fielddelimiter);
      localUriBuilder = localUriBuilder.replaceQueryParam("count", count);

      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public class DatabaseTables {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private DatabaseTables(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public DatabaseTables(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/database/tables");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public <T> T getAsTextPlainCharsetUTF8(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public class VcsCheckingForChangesQueue {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsCheckingForChangesQueue(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsCheckingForChangesQueue(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/vcsCheckingForChangesQueue");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental use only!
     */
    public VcsRootInstances post() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST").invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }

    /**
     * Experimental use only!
     */
    public VcsRootInstances post(String locator) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST").invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }
  }
}
