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

public class AppRestVcsRoots {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestVcsRoots(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
    _client = client;
    _uriBuilder = uriBuilder.clone();
    _templateAndMatrixParameterValues = map;
  }

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestVcsRoots(Client client, URI baseUri) {
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/vcs-roots");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public VcsRoot post(VcsRoot input) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "vcs-root"), VcsRoot.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(VcsRoot.class);
  }

  public VcsRoots get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(VcsRoots.class);
  }

  public VcsRoots get(String locator) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(VcsRoots.class);
  }

  public VcsRootLocatorPropertiesName vcsRootLocatorPropertiesName(String vcsrootlocator, String name) {
    return new VcsRootLocatorPropertiesName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, name);
  }

  public VcsRootLocator vcsRootLocator(String vcsrootlocator) {
    return new VcsRootLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
  }

  public VcsRootLocatorInstancesVcsRootInstanceLocatorProperties vcsRootLocatorInstancesVcsRootInstanceLocatorProperties(String vcsrootlocator, String vcsrootinstancelocator) {
    return new VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator);
  }

  public VcsRootLocatorInstancesVcsRootInstanceLocatorField vcsRootLocatorInstancesVcsRootInstanceLocatorField(String vcsrootlocator, String vcsrootinstancelocator, String field) {
    return new VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator, field);
  }

  public VcsRootLocatorInstances vcsRootLocatorInstances(String vcsrootlocator) {
    return new VcsRootLocatorInstances(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
  }

  /**
   * @param vcsrootlocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
   */
  public VcsRootLocatorInstancesVcsRootInstanceLocator vcsRootLocatorInstancesVcsRootInstanceLocator(String vcsrootlocator, String vcsrootinstancelocator) {
    return new VcsRootLocatorInstancesVcsRootInstanceLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator);
  }

  public VcsRootLocatorProperties vcsRootLocatorProperties(String vcsrootlocator) {
    return new VcsRootLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
  }

  public VcsRootLocatorField vcsRootLocatorField(String vcsrootlocator, String field) {
    return new VcsRootLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, field);
  }

  public static class VcsRootLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocator(Client client, URI baseUri, String vcsrootlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocator setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocator(_client, copyUriBuilder, copyMap);
    }

    public VcsRoot get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRoot.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }

  public static class VcsRootLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorField(Client client, URI baseUri, String vcsrootlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorField setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorField(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new VcsRootLocatorField(_client, copyUriBuilder, copyMap);
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

  public static class VcsRootLocatorInstances {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorInstances(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorInstances(Client client, URI baseUri, String vcsrootlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/instances");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorInstances(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/instances");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorInstances setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorInstances(_client, copyUriBuilder, copyMap);
    }

    public VcsRootInstances get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }
  }

  public static class VcsRootLocatorInstancesVcsRootInstanceLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorInstancesVcsRootInstanceLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     *
     * @param vcsrootlocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocator(Client client, URI baseUri, String vcsrootlocator, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     *
     * @return this is effectively ignored as vcsRootInstanceLocator should specify instance fully
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     *
     * @param vcsrootlocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocator setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorInstancesVcsRootInstanceLocator setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
    }

    public VcsRootInstance get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstance.class);
    }
  }

  public static class VcsRootLocatorInstancesVcsRootInstanceLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorInstancesVcsRootInstanceLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorField(Client client, URI baseUri, String vcsrootlocator, String vcsrootinstancelocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorField setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorInstancesVcsRootInstanceLocatorField setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorInstancesVcsRootInstanceLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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

  public static class VcsRootLocatorInstancesVcsRootInstanceLocatorProperties {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(Client client, URI baseUri, String vcsrootlocator, String vcsrootinstancelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      _templateAndMatrixParameterValues.put("vcsRootInstanceLocator", vcsrootinstancelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorInstancesVcsRootInstanceLocatorProperties setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorInstancesVcsRootInstanceLocatorProperties setVcsrootinstancelocator(String vcsrootinstancelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
      return new VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }
  }

  public static class VcsRootLocatorProperties {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorProperties(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorProperties(Client client, URI baseUri, String vcsrootlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/properties");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorProperties(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/properties");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorProperties setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorProperties(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }

  public static class VcsRootLocatorPropertiesName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private VcsRootLocatorPropertiesName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public VcsRootLocatorPropertiesName(Client client, URI baseUri, String vcsrootlocator, String name) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{vcsRootLocator}/properties/{name}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("vcsRootLocator", vcsrootlocator);
      _templateAndMatrixParameterValues.put("name", name);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public VcsRootLocatorPropertiesName(Client client, URI uri) {
      _client = client;
      StringBuilder template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/vcs-roots/{vcsRootLocator}/properties/{name}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get vcsRootLocator
     */
    public String getVcsrootlocator() {
      return ((String) _templateAndMatrixParameterValues.get("vcsRootLocator"));
    }

    /**
     * Duplicate state and set vcsRootLocator
     */
    public VcsRootLocatorPropertiesName setVcsrootlocator(String vcsrootlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("vcsRootLocator", vcsrootlocator);
      return new VcsRootLocatorPropertiesName(_client, copyUriBuilder, copyMap);
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
    public VcsRootLocatorPropertiesName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new VcsRootLocatorPropertiesName(_client, copyUriBuilder, copyMap);
    }

    public String putTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }
}
