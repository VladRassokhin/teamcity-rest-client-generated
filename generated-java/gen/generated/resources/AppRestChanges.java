package generated.resources;

import generated.*;
import generated.data.*;
import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class AppRestChanges extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestChanges(Client client, URI baseUri, TeamCityClient tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/changes");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  /**
   * Lists changes by the specified locator
   */
  public Changes get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Changes.class);
  }

  /**
   * Lists changes by the specified locator
   */
  public Changes get(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count, String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("project", project);
    localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);
    localUriBuilder = localUriBuilder.replaceQueryParam("build", build);
    localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", vcsroot);
    localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", sincechange);
    localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
    localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Changes.class);
  }

  public ChangeLocatorField changeLocatorField(String changelocator, String field) {
    return new ChangeLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator, field);
  }

  public ChangeLocatorParentChanges changeLocatorParentChanges(String changelocator) {
    return new ChangeLocatorParentChanges(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorParentRevisions changeLocatorParentRevisions(String changelocator) {
    return new ChangeLocatorParentRevisions(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorVcsRoot changeLocatorVcsRoot(String changelocator) {
    return new ChangeLocatorVcsRoot(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorAttributes changeLocatorAttributes(String changelocator) {
    return new ChangeLocatorAttributes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorDuplicates changeLocatorDuplicates(String changelocator) {
    return new ChangeLocatorDuplicates(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorIssues changeLocatorIssues(String changelocator) {
    return new ChangeLocatorIssues(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorBuildTypes changeLocatorBuildTypes(String changelocator) {
    return new ChangeLocatorBuildTypes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocatorFirstBuilds changeLocatorFirstBuilds(String changelocator) {
    return new ChangeLocatorFirstBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public ChangeLocator changeLocator(String changelocator) {
    return new ChangeLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
  }

  public class ChangeLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocator(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocator setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocator(_client, copyUriBuilder, copyMap);
    }

    public Change get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Change.class);
    }

    public Change get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Change.class);
    }
  }

  public class ChangeLocatorAttributes {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorAttributes(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorAttributes(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/attributes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorAttributes(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/attributes");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorAttributes setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorAttributes(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Entries get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Entries.class);
    }
  }

  public class ChangeLocatorBuildTypes {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorBuildTypes(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorBuildTypes(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/buildTypes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorBuildTypes(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/buildTypes");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorBuildTypes setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorBuildTypes(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public BuildTypes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    public BuildTypes get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorDuplicates {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorDuplicates(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorDuplicates(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/duplicates");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorDuplicates(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/duplicates");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorDuplicates setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorDuplicates(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Changes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    public Changes get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorField(Client client, URI baseUri, String changelocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorField setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorField(_client, copyUriBuilder, copyMap);
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
    public ChangeLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new ChangeLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.getAsString(resource);
    }
  }

  public class ChangeLocatorFirstBuilds {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorFirstBuilds(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorFirstBuilds(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/firstBuilds");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorFirstBuilds(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/firstBuilds");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorFirstBuilds setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorFirstBuilds(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Builds get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    public Builds get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorIssues {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorIssues(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorIssues(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/issues");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorIssues(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/issues");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorIssues setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorIssues(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Issues get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Issues.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorParentChanges {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorParentChanges(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorParentChanges(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/parentChanges");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorParentChanges(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/parentChanges");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorParentChanges setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorParentChanges(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Changes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
    public Changes get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorParentRevisions {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorParentRevisions(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorParentRevisions(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/parentRevisions");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorParentRevisions(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/parentRevisions");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorParentRevisions setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorParentRevisions(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public Items get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Items.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }

  public class ChangeLocatorVcsRoot {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ChangeLocatorVcsRoot(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ChangeLocatorVcsRoot(Client client, URI baseUri, String changelocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{changeLocator}/vcsRoot");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("changeLocator", changelocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ChangeLocatorVcsRoot(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/changes/{changeLocator}/vcsRoot");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get changeLocator
     */
    public String getChangelocator() {
      return ((String) _templateAndMatrixParameterValues.get("changeLocator"));
    }

    /**
     * Duplicate state and set changeLocator
     */
    public ChangeLocatorVcsRoot setChangelocator(String changelocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("changeLocator", changelocator);
      return new ChangeLocatorVcsRoot(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public VcsRootInstanceRef get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstanceRef.class);
    }
    /**
     * Experimental support only!
     */
    /**
     * Experimental support only!
     */
  }
}
