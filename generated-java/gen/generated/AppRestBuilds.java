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

public class AppRestBuilds {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestBuilds(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
    _client = client;
    _uriBuilder = uriBuilder.clone();
    _templateAndMatrixParameterValues = map;
  }

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestBuilds(Client client, URI baseUri) {
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/builds");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  /**
   * Serves builds matching supplied condition.
   */
  public Builds get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  /**
   * Serves builds matching supplied condition.
   */
  public Builds get(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);

    localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
    localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);

    localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);

    localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);

    localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);

    localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
    localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);

    localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);

    localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);

    localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
    localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Builds.class);
  }

  public BuildLocatorArtifactsMetadatapath buildLocatorArtifactsMetadatapath(String buildlocator, String path) {
    return new BuildLocatorArtifactsMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
  }

  public BuildLocatorPin buildLocatorPin(String buildlocator) {
    return new BuildLocatorPin(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocator buildLocator(String buildlocator) {
    return new BuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorTags buildLocatorTags(String buildlocator) {
    return new BuildLocatorTags(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorProblemOccurrences buildLocatorProblemOccurrences(String buildlocator) {
    return new BuildLocatorProblemOccurrences(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorArtifacts buildLocatorArtifacts(String buildlocator) {
    return new BuildLocatorArtifacts(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorCanceledInfo buildLocatorCanceledInfo(String buildlocator) {
    return new BuildLocatorCanceledInfo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorTestOccurrences buildLocatorTestOccurrences(String buildlocator) {
    return new BuildLocatorTestOccurrences(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorExampleBuildCancelRequest buildLocatorExampleBuildCancelRequest(String buildlocator) {
    return new BuildLocatorExampleBuildCancelRequest(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorStatistics buildLocatorStatistics(String buildlocator) {
    return new BuildLocatorStatistics(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorStatisticsName buildLocatorStatisticsName(String buildlocator, String name) {
    return new BuildLocatorStatisticsName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, name);
  }

  public BuildLocatorComment buildLocatorComment(String buildlocator) {
    return new BuildLocatorComment(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorStatusIcon buildLocatorStatusIcon(String buildlocator) {
    return new BuildLocatorStatusIcon(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorResultingPropertiesPropertyName buildLocatorResultingPropertiesPropertyName(String buildlocator, String propertyname) {
    return new BuildLocatorResultingPropertiesPropertyName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, propertyname);
  }

  public BuildLocatorField buildLocatorField(String buildlocator, String field) {
    return new BuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, field);
  }

  public BuildLocatorResultingProperties buildLocatorResultingProperties(String buildlocator) {
    return new BuildLocatorResultingProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorArtifactsChildrenpath buildLocatorArtifactsChildrenpath(String buildlocator, String path) {
    return new BuildLocatorArtifactsChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
  }

  public BuildLocatorArtifactsContentpath buildLocatorArtifactsContentpath(String buildlocator, String path) {
    return new BuildLocatorArtifactsContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
  }

  public BuildLocatorArtifactsFilespath buildLocatorArtifactsFilespath(String buildlocator, String path) {
    return new BuildLocatorArtifactsFilespath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
  }

  public BuildLocatorSourcesFilesFileName buildLocatorSourcesFilesFileName(String buildlocator, String filename) {
    return new BuildLocatorSourcesFilesFileName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, filename);
  }

  public BuildLocatorRelatedIssues buildLocatorRelatedIssues(String buildlocator) {
    return new BuildLocatorRelatedIssues(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public BuildLocatorRelatedIssues2 buildLocatorRelatedIssues2(String buildlocator) {
    return new BuildLocatorRelatedIssues2(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
  }

  public static class BuildLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocator(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}");
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
    public BuildLocator setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public Build post(BuildCancelRequest input) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    public Build post(BuildCancelRequest input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    /**
     * Serves a build described by the locator provided searching through those accessible by the
     * current user.
     * See {@link jetbrains.buildServer.server.rest.request.BuildRequest#serveAllBuilds(String, String,
     * String, boolean, boolean, boolean, java.util.List, String, String, String, Long, Integer,
     * String, javax.ws.rs.core.UriInfo, javax.servlet.http.HttpServletRequest)}
     * If several builds are matched, the first one is used (the effect is the same as if ",count:1"
     * locator dimension is added)
     */
    public Build get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    /**
     * Serves a build described by the locator provided searching through those accessible by the
     * current user.
     * See {@link jetbrains.buildServer.server.rest.request.BuildRequest#serveAllBuilds(String, String,
     * String, boolean, boolean, boolean, java.util.List, String, String, String, Long, Integer,
     * String, javax.ws.rs.core.UriInfo, javax.servlet.http.HttpServletRequest)}
     * If several builds are matched, the first one is used (the effect is the same as if ",count:1"
     * locator dimension is added)
     */
    public Build get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }
  }

  public static class BuildLocatorArtifacts {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorArtifacts(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorArtifacts(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/artifacts");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorArtifacts(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts");
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
    public BuildLocatorArtifacts setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorArtifacts(_client, copyUriBuilder, copyMap);
    }

    /**
     * More user-friendly URL for "/{buildLocator}/artifacts/children" one.
     */
    public Files get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Files.class);
    }
    /**
     * More user-friendly URL for "/{buildLocator}/artifacts/children" one.
     */
    /**
     * More user-friendly URL for "/{buildLocator}/artifacts/children" one.
     */
  }

  public static class BuildLocatorArtifactsChildrenpath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorArtifactsChildrenpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorArtifactsChildrenpath(Client client, URI baseUri, String buildlocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/artifacts/children{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorArtifactsChildrenpath(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/children{path:(/.*)?}");
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
    public BuildLocatorArtifactsChildrenpath setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorArtifactsChildrenpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get path
     */
    public String getPath() {
      return ((String) _templateAndMatrixParameterValues.get("path"));
    }

    /**
     * Duplicate state and set path
     */
    public BuildLocatorArtifactsChildrenpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BuildLocatorArtifactsChildrenpath(_client, copyUriBuilder, copyMap);
    }

    public Files get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Files.class);
    }

    public Files get(Boolean resolveparameters, String locator) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Files.class);
    }
  }

  public static class BuildLocatorArtifactsContentpath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorArtifactsContentpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorArtifactsContentpath(Client client, URI baseUri, String buildlocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/artifacts/content{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorArtifactsContentpath(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/content{path:(/.*)?}");
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
    public BuildLocatorArtifactsContentpath setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorArtifactsContentpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get path
     */
    public String getPath() {
      return ((String) _templateAndMatrixParameterValues.get("path"));
    }

    /**
     * Duplicate state and set path
     */
    public BuildLocatorArtifactsContentpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BuildLocatorArtifactsContentpath(_client, copyUriBuilder, copyMap);
    }

    public <T> T getAs(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    public <T> T getAs(Boolean resolveparameters, Boolean logbuildusage, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
      localUriBuilder = localUriBuilder.replaceQueryParam("logBuildUsage", logbuildusage);

      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public static class BuildLocatorArtifactsFilespath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorArtifactsFilespath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorArtifactsFilespath(Client client, URI baseUri, String buildlocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/artifacts/files{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorArtifactsFilespath(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/files{path:(/.*)?}");
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
    public BuildLocatorArtifactsFilespath setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorArtifactsFilespath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get path
     */
    public String getPath() {
      return ((String) _templateAndMatrixParameterValues.get("path"));
    }

    /**
     * Duplicate state and set path
     */
    public BuildLocatorArtifactsFilespath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BuildLocatorArtifactsFilespath(_client, copyUriBuilder, copyMap);
    }

    public <T> T getAs(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public static class BuildLocatorArtifactsMetadatapath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorArtifactsMetadatapath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorArtifactsMetadatapath(Client client, URI baseUri, String buildlocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/artifacts/metadata{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorArtifactsMetadatapath(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/metadata{path:(/.*)?}");
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
    public BuildLocatorArtifactsMetadatapath setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorArtifactsMetadatapath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get path
     */
    public String getPath() {
      return ((String) _templateAndMatrixParameterValues.get("path"));
    }

    /**
     * Duplicate state and set path
     */
    public BuildLocatorArtifactsMetadatapath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BuildLocatorArtifactsMetadatapath(_client, copyUriBuilder, copyMap);
    }

    public File get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(File.class);
    }

    public File get(Boolean resolveparameters, String locator) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(File.class);
    }
  }

  public static class BuildLocatorCanceledInfo {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorCanceledInfo(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorCanceledInfo(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/canceledInfo");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorCanceledInfo(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/canceledInfo");
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
    public BuildLocatorCanceledInfo setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorCanceledInfo(_client, copyUriBuilder, copyMap);
    }

    public Comment get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Comment.class);
    }

    public Comment get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Comment.class);
    }
  }

  public static class BuildLocatorComment {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorComment(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorComment(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/comment");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorComment(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/comment");
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
    public BuildLocatorComment setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorComment(_client, copyUriBuilder, copyMap);
    }

    public <T> T putTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/example/buildCancelRequest");
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
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/{field}");
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

  public static class BuildLocatorPin {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorPin(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorPin(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/pin/");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorPin(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/pin/");
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
    public BuildLocatorPin setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorPin(_client, copyUriBuilder, copyMap);
    }

    /**
     * Pins a build
     */
    public <T> T putTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    /**
     * Fetches current build pinned status.
     */
    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    /**
     * Unpins a build
     */
    public <T> T deleteTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
      Response response = resourceBuilder.build("DELETE", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public static class BuildLocatorProblemOccurrences {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorProblemOccurrences(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorProblemOccurrences(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/problemOccurrences");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorProblemOccurrences(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/problemOccurrences");
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
    public BuildLocatorProblemOccurrences setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorProblemOccurrences(_client, copyUriBuilder, copyMap);
    }

    public ProblemOccurrences get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrences.class);
    }

    public ProblemOccurrences get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrences.class);
    }
  }

  public static class BuildLocatorRelatedIssues {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorRelatedIssues(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorRelatedIssues(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/related-issues");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorRelatedIssues(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/related-issues");
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
    public BuildLocatorRelatedIssues setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorRelatedIssues(_client, copyUriBuilder, copyMap);
    }

    public IssueUsages get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(IssueUsages.class);
    }

    public IssueUsages get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(IssueUsages.class);
    }
  }

  public static class BuildLocatorRelatedIssues2 {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorRelatedIssues2(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorRelatedIssues2(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/relatedIssues");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorRelatedIssues2(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/relatedIssues");
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
    public BuildLocatorRelatedIssues2 setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorRelatedIssues2(_client, copyUriBuilder, copyMap);
    }

    public IssueUsages get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(IssueUsages.class);
    }

    public IssueUsages get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(IssueUsages.class);
    }
  }

  public static class BuildLocatorResultingProperties {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorResultingProperties(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorResultingProperties(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/resulting-properties/");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorResultingProperties(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/resulting-properties/");
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
    public BuildLocatorResultingProperties setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorResultingProperties(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }
  }

  public static class BuildLocatorResultingPropertiesPropertyName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorResultingPropertiesPropertyName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorResultingPropertiesPropertyName(Client client, URI baseUri, String buildlocator, String propertyname) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/resulting-properties/{propertyName}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("propertyName", propertyname);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorResultingPropertiesPropertyName(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/resulting-properties/{propertyName}");
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
    public BuildLocatorResultingPropertiesPropertyName setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorResultingPropertiesPropertyName(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get propertyName
     */
    public String getPropertyname() {
      return ((String) _templateAndMatrixParameterValues.get("propertyName"));
    }

    /**
     * Duplicate state and set propertyName
     */
    public BuildLocatorResultingPropertiesPropertyName setPropertyname(String propertyname) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("propertyName", propertyname);
      return new BuildLocatorResultingPropertiesPropertyName(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }

  public static class BuildLocatorSourcesFilesFileName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorSourcesFilesFileName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorSourcesFilesFileName(Client client, URI baseUri, String buildlocator, String filename) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/sources/files/{fileName:.+}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("fileName", filename);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorSourcesFilesFileName(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/sources/files/{fileName:.+}");
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
    public BuildLocatorSourcesFilesFileName setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorSourcesFilesFileName(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get fileName
     */
    public String getFilename() {
      return ((String) _templateAndMatrixParameterValues.get("fileName"));
    }

    /**
     * Duplicate state and set fileName
     */
    public BuildLocatorSourcesFilesFileName setFilename(String filename) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("fileName", filename);
      return new BuildLocatorSourcesFilesFileName(_client, copyUriBuilder, copyMap);
    }

    public <T> T getAsOctetStream(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public static class BuildLocatorStatistics {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorStatistics(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorStatistics(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/statistics/");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorStatistics(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/statistics/");
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
    public BuildLocatorStatistics setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorStatistics(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }
  }

  public static class BuildLocatorStatisticsName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorStatisticsName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorStatisticsName(Client client, URI baseUri, String buildlocator, String name) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/statistics/{name}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("name", name);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorStatisticsName(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/statistics/{name}");
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
    public BuildLocatorStatisticsName setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorStatisticsName(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get name
     */
    public String getName() {
      return ((String) _templateAndMatrixParameterValues.get("name"));
    }

    /**
     * Duplicate state and set name
     */
    public BuildLocatorStatisticsName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new BuildLocatorStatisticsName(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }
  }

  public static class BuildLocatorStatusIcon {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorStatusIcon(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorStatusIcon(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/statusIcon");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorStatusIcon(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/statusIcon");
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
    public BuildLocatorStatusIcon setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorStatusIcon(_client, copyUriBuilder, copyMap);
    }

    public <T> T getAs(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }
  }

  public static class BuildLocatorTags {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorTags(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorTags(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/tags/");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorTags(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/tags/");
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
    public BuildLocatorTags setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorTags(_client, copyUriBuilder, copyMap);
    }

    /**
     * Adds a single tag to a build
     */
    public String postTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
    }

    /**
     * Replaces build's tags.
     */
    public Tags put(Tags input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Tags.class);
    }

    /**
     * Adds a set of tags to a build
     */
    public Response post(Tags input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
      return response;
    }

    public Tags get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Tags.class);
    }
  }

  public static class BuildLocatorTestOccurrences {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private BuildLocatorTestOccurrences(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public BuildLocatorTestOccurrences(Client client, URI baseUri, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{buildLocator}/testOccurrences");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public BuildLocatorTestOccurrences(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/builds/{buildLocator}/testOccurrences");
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
    public BuildLocatorTestOccurrences setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BuildLocatorTestOccurrences(_client, copyUriBuilder, copyMap);
    }

    public TestOccurrences get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrences.class);
    }

    public TestOccurrences get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrences.class);
    }
  }
}
