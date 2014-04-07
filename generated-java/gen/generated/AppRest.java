package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class AppRest extends AbstractAppRest{
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRest(Client client, URI baseUri,TeamcityJetbrainsCom tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public String get() {
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
    return TeamcityJetbrainsCom.getAsString(resource);
  }

  public Version version() {
    return new Version(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
  }

  public ApiVersion apiVersion() {
    return new ApiVersion(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
  }

  public Info info() {
    return new Info(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
  }

  public ProjectLocatorBtLocatorBuildLocatorField projectLocatorBtLocatorBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field) {
    return new ProjectLocatorBtLocatorBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator, field);
  }

  public class ApiVersion {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ApiVersion(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ApiVersion(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/apiVersion");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }

  public class Info {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private Info(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public Info(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/info");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public PluginInfo get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PluginInfo.class);
    }
  }

  public class ProjectLocatorBtLocatorBuildLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBtLocatorBuildLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBtLocatorBuildLocatorField(Client client, URI baseUri, String projectlocator, String btlocator, String buildlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/{btLocator}/{buildLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBtLocatorBuildLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/{projectLocator}/{btLocator}/{buildLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get projectLocator
     */
    public String getProjectlocator() {
      return ((String) _templateAndMatrixParameterValues.get("projectLocator"));
    }

    /**
     * Duplicate state and set projectLocator
     */
    public ProjectLocatorBtLocatorBuildLocatorField setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get btLocator
     */
    public String getBtlocator() {
      return ((String) _templateAndMatrixParameterValues.get("btLocator"));
    }

    /**
     * Duplicate state and set btLocator
     */
    public ProjectLocatorBtLocatorBuildLocatorField setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get buildLocator
     */
    public String getBuildlocator() {
      return ((String) _templateAndMatrixParameterValues.get("buildLocator"));
    }

    /**
     * Duplicate state and set buildLocator
     */
    public ProjectLocatorBtLocatorBuildLocatorField setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get field
     */
    public String getField() {
      return ((String) _templateAndMatrixParameterValues.get("field"));
    }

    /**
     * Duplicate state and set field
     */
    public ProjectLocatorBtLocatorBuildLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }

  public class Version {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private Version(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public Version(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/version");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }
}
