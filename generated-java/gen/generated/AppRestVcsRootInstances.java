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

public class AppRestVcsRootInstances {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestVcsRootInstances(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
    _client = client;
    _uriBuilder = uriBuilder.clone();
    _templateAndMatrixParameterValues = map;
  }

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestVcsRootInstances(Client client, URI baseUri) {
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/vcs-root-instances");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public VcsRootInstances get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(VcsRootInstances.class);
  }

  public VcsRootInstances get(String locator) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(VcsRootInstances.class);
  }

  public VcsRootInstanceLocatorRepositoryState vcsRootInstanceLocatorRepositoryState(String vcsrootinstancelocator) {
    return new VcsRootInstanceLocatorRepositoryState(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
  }

  public VcsRootInstanceLocatorProperties vcsRootInstanceLocatorProperties(String vcsrootinstancelocator) {
    return new VcsRootInstanceLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
  }

  public VcsRootInstanceLocatorField vcsRootInstanceLocatorField(String vcsrootinstancelocator, String field) {
    return new VcsRootInstanceLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, field);
  }

  public VcsRootInstanceLocatorRepositoryStateCreationDate vcsRootInstanceLocatorRepositoryStateCreationDate(String vcsrootinstancelocator) {
    return new VcsRootInstanceLocatorRepositoryStateCreationDate(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
  }

  public VcsRootInstanceLocatorFilesLatestContentpath vcsRootInstanceLocatorFilesLatestContentpath(String vcsrootinstancelocator, String path) {
    return new VcsRootInstanceLocatorFilesLatestContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
  }

  public VcsRootInstanceLocatorFilesLatestChildrenpath vcsRootInstanceLocatorFilesLatestChildrenpath(String vcsrootinstancelocator, String path) {
    return new VcsRootInstanceLocatorFilesLatestChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
  }

  public VcsRootInstanceLocatorFilesLatestMetadatapath vcsRootInstanceLocatorFilesLatestMetadatapath(String vcsrootinstancelocator, String path) {
    return new VcsRootInstanceLocatorFilesLatestMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
  }

  public VcsRootInstanceLocator vcsRootInstanceLocator(String vcsrootinstancelocator) {
    return new VcsRootInstanceLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
  }

  public static class VcsRootInstanceLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocator(Client client, URI baseUri, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocator setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
    }

    public VcsRootInstance get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstance.class);
    }
  }

  public static class VcsRootInstanceLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorField(Client client, URI baseUri, String vcsrootinstancelocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorField setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
    public VcsRootInstanceLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new VcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    public String putTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
    }
  }

  public static class VcsRootInstanceLocatorFilesLatestChildrenpath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorFilesLatestChildrenpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorFilesLatestChildrenpath(Client client, URI baseUri, String vcsrootinstancelocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorFilesLatestChildrenpath(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorFilesLatestChildrenpath setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
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
    public VcsRootInstanceLocatorFilesLatestChildrenpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new VcsRootInstanceLocatorFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Lists files in VCS
     * Experimental support only
     */
    public Files get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Files.class);
    }
    /**
     * Lists files in VCS
     * Experimental support only
     */
    /**
     * Lists files in VCS
     * Experimental support only
     */
  }

  public static class VcsRootInstanceLocatorFilesLatestContentpath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorFilesLatestContentpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorFilesLatestContentpath(Client client, URI baseUri, String vcsrootinstancelocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorFilesLatestContentpath(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorFilesLatestContentpath setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorFilesLatestContentpath(_client, copyUriBuilder, copyMap);
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
    public VcsRootInstanceLocatorFilesLatestContentpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new VcsRootInstanceLocatorFilesLatestContentpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Gets content of a file form VCS
     * Experimental support only
     */
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

  public static class VcsRootInstanceLocatorFilesLatestMetadatapath {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorFilesLatestMetadatapath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorFilesLatestMetadatapath(Client client, URI baseUri, String vcsrootinstancelocator, String path) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      _templateAndMatrixParameterValues.put("path", path);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorFilesLatestMetadatapath(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorFilesLatestMetadatapath setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
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
    public VcsRootInstanceLocatorFilesLatestMetadatapath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new VcsRootInstanceLocatorFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Gets VCS file details
     * Experimental support only
     */
    public File get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(File.class);
    }
    /**
     * Gets VCS file details
     * Experimental support only
     */
    /**
     * Gets VCS file details
     * Experimental support only
     */
  }

  public static class VcsRootInstanceLocatorProperties {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorProperties(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorProperties(Client client, URI baseUri, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/properties");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorProperties(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorProperties setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }
  }

  public static class VcsRootInstanceLocatorRepositoryState {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorRepositoryState(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorRepositoryState(Client client, URI baseUri, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/repositoryState");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorRepositoryState(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorRepositoryState setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorRepositoryState(_client, copyUriBuilder, copyMap);
    }

    public Entries get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Entries.class);
    }

    public Entries put(Entries input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "entries"), Entries.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Entries.class);
    }
  }

  public static class VcsRootInstanceLocatorRepositoryStateCreationDate {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootInstanceLocatorRepositoryStateCreationDate(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootInstanceLocatorRepositoryStateCreationDate(Client client, URI baseUri, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootInstanceLocator}/repositoryState/creationDate");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootInstanceLocatorRepositoryStateCreationDate(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootInstanceLocator
     */
    public String getVcsrootinstancelocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootInstanceLocator"));
    }

    /**
     * Duplicate state and set vcsRootInstanceLocator
     */
    public VcsRootInstanceLocatorRepositoryStateCreationDate setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootInstanceLocatorRepositoryStateCreationDate(_client, copyUriBuilder, copyMap);
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
}
