package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class AppRestBuildQueue {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestBuildQueue(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
    _client = client;
    _uriBuilder = uriBuilder.clone();
    _templateAndMatrixParameterValues = map;
  }

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestBuildQueue(Client client, URI baseUri) {
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/buildQueue");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public Builds put(Builds input) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  public Builds put(Builds input, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  public Build post(Build input) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "build"), Build.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Build.class);
  }

  /**
   * Experimental! Deletes the set of builds filtered
   */
  public Response delete() {
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
    return TeamcityJetbrainsCom.delete(resource);
  }

  /**
   * Experimental! Deletes the set of builds filtered
   */
  public Response delete(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
    return TeamcityJetbrainsCom.delete(resource);
  }

  /**
   * Serves build queue.
   */
  public Builds get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  /**
   * Serves build queue.
   */
  public Builds get(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  public QueuedBuildLocator queuedBuildLocator(String queuedbuildlocator) {
    return new QueuedBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), queuedbuildlocator);
  }

  public BuildLocatorExampleBuildCancelRequest buildLocatorExampleBuildCancelRequest(String buildlocator) {
    return new BuildLocatorExampleBuildCancelRequest(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public QueuedBuildLocatorCompatibleAgents queuedBuildLocatorCompatibleAgents(String queuedbuildlocator) {
    return new QueuedBuildLocatorCompatibleAgents(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), queuedbuildlocator);
  }

  public BuildLocatorField buildLocatorField(String buildlocator, String field) {
    return new BuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, field);
  }

  public static class BuildLocatorExampleBuildCancelRequest {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorExampleBuildCancelRequest(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorExampleBuildCancelRequest(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/example/buildCancelRequest");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorExampleBuildCancelRequest(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildQueue/{buildLocator}/example/buildCancelRequest");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public BuildLocatorExampleBuildCancelRequest setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorExampleBuildCancelRequest(_client, copyUriBuilder, copyMap);
    }

    public BuildCancelRequest get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildCancelRequest.class);
    }
  }

  public static class BuildLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorField(Client client, URI baseUri, String buildlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildQueue/{buildLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public BuildLocatorField setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public BuildLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new BuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }

  public static class QueuedBuildLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private QueuedBuildLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public QueuedBuildLocator(Client client, URI baseUri, String queuedbuildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{queuedBuildLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("queuedBuildLocator", queuedbuildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public QueuedBuildLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildQueue/{queuedBuildLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get queuedBuildLocator
     */
    public String getQueuedbuildlocator() {
      return ((String) _templateAndMatrixParameterValues.get("queuedBuildLocator"));
    }

    /**
     * Duplicate state and set queuedBuildLocator
     */
    public QueuedBuildLocator setQueuedbuildlocator(String queuedbuildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("queuedBuildLocator", queuedbuildlocator);
      return new QueuedBuildLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public Build post(BuildCancelRequest input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    public Build get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    public Build get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }
  }

  public static class QueuedBuildLocatorCompatibleAgents {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private QueuedBuildLocatorCompatibleAgents(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public QueuedBuildLocatorCompatibleAgents(Client client, URI baseUri, String queuedbuildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{queuedBuildLocator}/compatibleAgents");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("queuedBuildLocator", queuedbuildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public QueuedBuildLocatorCompatibleAgents(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get queuedBuildLocator
     */
    public String getQueuedbuildlocator() {
      return ((String) _templateAndMatrixParameterValues.get("queuedBuildLocator"));
    }

    /**
     * Duplicate state and set queuedBuildLocator
     */
    public QueuedBuildLocatorCompatibleAgents setQueuedbuildlocator(String queuedbuildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("queuedBuildLocator", queuedbuildlocator);
      return new QueuedBuildLocatorCompatibleAgents(_client, copyUriBuilder, copyMap);
    }

    public AgentsRef get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    public AgentsRef get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }
  }
}
