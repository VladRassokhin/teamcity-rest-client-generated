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

public class AppRestUsers {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestUsers(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
    _client = client;
    _uriBuilder = uriBuilder.clone();
    _templateAndMatrixParameterValues = map;
  }

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestUsers(Client client, URI baseUri) {
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/users");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public User post(User input) {
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(User.class);
  }

  public <T> T post(Object input, Class<T> returnType) {
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
    Response response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
    if (!Response.class.isAssignableFrom(returnType)) {
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    }
    return TeamcityJetbrainsCom.getReturnValue(returnType, response);
  }

  public User post(User input, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(User.class);
  }

  public Users get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Users.class);
  }

  public Users get(String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Users.class);
  }

  public UserLocator userLocator(String userlocator) {
    return new UserLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
  }

  public UserLocatorRoles userLocatorRoles(String userlocator) {
    return new UserLocatorRoles(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
  }

  public UserLocatorRolesRoleIdScope userLocatorRolesRoleIdScope(String userlocator, String roleid, String scope) {
    return new UserLocatorRolesRoleIdScope(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, roleid, scope);
  }

  public UserLocatorGroups userLocatorGroups(String userlocator) {
    return new UserLocatorGroups(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
  }

  public UserLocatorField userLocatorField(String userlocator, String field) {
    return new UserLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, field);
  }

  public UserLocatorProperties userLocatorProperties(String userlocator) {
    return new UserLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
  }

  public UserLocatorPropertiesName userLocatorPropertiesName(String userlocator, String name) {
    return new UserLocatorPropertiesName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, name);
  }

  public static class UserLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocator(Client client, URI baseUri, String userlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocator setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public User put(User input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }

    public User put(User input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }

    public User get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }

    public User get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }
  }

  public static class UserLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorField(Client client, URI baseUri, String userlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/{field}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorField setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorField(_client, copyUriBuilder, copyMap);
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
    public UserLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new UserLocatorField(_client, copyUriBuilder, copyMap);
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

  public static class UserLocatorGroups {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorGroups(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorGroups(Client client, URI baseUri, String userlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/groups");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorGroups(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/groups");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorGroups setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorGroups(_client, copyUriBuilder, copyMap);
    }

    public Group post(Group input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }

    public Group post(Group input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }

    /**
     * Replaces user's roles with the submitted ones
     */
    public Groups put(Groups input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "groups"), Groups.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }

    /**
     * Replaces user's roles with the submitted ones
     */
    public Groups put(Groups input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "groups"), Groups.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }

    public Groups get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }

    public Groups get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }
  }

  public static class UserLocatorProperties {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorProperties(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorProperties(Client client, URI baseUri, String userlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/properties");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorProperties(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/properties");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorProperties setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorProperties(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }
  }

  public static class UserLocatorPropertiesName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorPropertiesName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorPropertiesName(Client client, URI baseUri, String userlocator, String name) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/properties/{name}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
      _templateAndMatrixParameterValues.put("name", name);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorPropertiesName(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/properties/{name}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorPropertiesName setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorPropertiesName(_client, copyUriBuilder, copyMap);
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
    public UserLocatorPropertiesName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new UserLocatorPropertiesName(_client, copyUriBuilder, copyMap);
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

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }

  public static class UserLocatorRoles {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorRoles(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorRoles(Client client, URI baseUri, String userlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/roles");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorRoles(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/roles");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorRoles setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorRoles(_client, copyUriBuilder, copyMap);
    }

    /**
     * Replaces user's roles with the submitted ones
     */
    public RoleAssignments put(RoleAssignments input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "roles"), RoleAssignments.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignments.class);
    }
    /**
     * Replaces user's roles with the submitted ones
     */
    /**
     * Replaces user's roles with the submitted ones
     */
    public RoleAssignment post(RoleAssignment input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "role"), RoleAssignment.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignment.class);
    }

    public RoleAssignments get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignments.class);
    }
  }

  public static class UserLocatorRolesRoleIdScope {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private UserLocatorRolesRoleIdScope(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public UserLocatorRolesRoleIdScope(Client client, URI baseUri, String userlocator, String roleid, String scope) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{userLocator}/roles/{roleId}/{scope}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("userLocator", userlocator);
      _templateAndMatrixParameterValues.put("roleId", roleid);
      _templateAndMatrixParameterValues.put("scope", scope);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public UserLocatorRolesRoleIdScope(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/users/{userLocator}/roles/{roleId}/{scope}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get userLocator
     */
    public String getUserlocator() {
      return ((String) _templateAndMatrixParameterValues.get("userLocator"));
    }

    /**
     * Duplicate state and set userLocator
     */
    public UserLocatorRolesRoleIdScope setUserlocator(String userlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("userLocator", userlocator);
      return new UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get roleId
     */
    public String getRoleid() {
      return ((String) _templateAndMatrixParameterValues.get("roleId"));
    }

    /**
     * Duplicate state and set roleId
     */
    public UserLocatorRolesRoleIdScope setRoleid(String roleid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("roleId", roleid);
      return new UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get scope
     */
    public String getScope() {
      return ((String) _templateAndMatrixParameterValues.get("scope"));
    }

    /**
     * Duplicate state and set scope
     */
    public UserLocatorRolesRoleIdScope setScope(String scope) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("scope", scope);
      return new UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
    }

    public RoleAssignment get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignment.class);
    }

    public RoleAssignment put() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT").invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignment.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public Response post() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
      Response response = resourceBuilder.build("POST").invoke();
      return response;
    }
  }
}
