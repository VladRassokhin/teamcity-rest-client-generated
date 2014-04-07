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

public class AppRestUserGroups extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestUserGroups(Client client, URI baseUri, TeamcityJetbrainsCom tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
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
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Group.class);
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
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(Groups.class);
  }

  public GroupLocator groupLocator(String grouplocator) {
    return new GroupLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator);
  }

  public GroupLocatorRoles groupLocatorRoles(String grouplocator) {
    return new GroupLocatorRoles(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator);
  }

  public GroupLocatorRolesRoleIdScope groupLocatorRolesRoleIdScope(String grouplocator, String roleid, String scope) {
    return new GroupLocatorRolesRoleIdScope(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator, roleid, scope);
  }

  public class GroupLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private GroupLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public GroupLocator(Client client, URI baseUri, String grouplocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{groupLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public GroupLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/userGroups/{groupLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get groupLocator
     */
    public String getGrouplocator() {
      return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
    }

    /**
     * Duplicate state and set groupLocator
     */
    public GroupLocator setGrouplocator(String grouplocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("groupLocator", grouplocator);
      return new GroupLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public Group get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }

    public Group get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }
  }

  public class GroupLocatorRoles {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private GroupLocatorRoles(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public GroupLocatorRoles(Client client, URI baseUri, String grouplocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{groupLocator}/roles");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public GroupLocatorRoles(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/userGroups/{groupLocator}/roles");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get groupLocator
     */
    public String getGrouplocator() {
      return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
    }

    /**
     * Duplicate state and set groupLocator
     */
    public GroupLocatorRoles setGrouplocator(String grouplocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("groupLocator", grouplocator);
      return new GroupLocatorRoles(_client, copyUriBuilder, copyMap);
    }

    public RoleAssignments put(RoleAssignments input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "roles"), RoleAssignments.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignments.class);
    }

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

  public class GroupLocatorRolesRoleIdScope {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private GroupLocatorRolesRoleIdScope(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public GroupLocatorRolesRoleIdScope(Client client, URI baseUri, String grouplocator, String roleid, String scope) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{groupLocator}/roles/{roleId}/{scope}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("groupLocator", grouplocator);
      _templateAndMatrixParameterValues.put("roleId", roleid);
      _templateAndMatrixParameterValues.put("scope", scope);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public GroupLocatorRolesRoleIdScope(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
    }

    /**
     * Get groupLocator
     */
    public String getGrouplocator() {
      return ((String) _templateAndMatrixParameterValues.get("groupLocator"));
    }

    /**
     * Duplicate state and set groupLocator
     */
    public GroupLocatorRolesRoleIdScope setGrouplocator(String grouplocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("groupLocator", grouplocator);
      return new GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
    public GroupLocatorRolesRoleIdScope setRoleid(String roleid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("roleId", roleid);
      return new GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
    public GroupLocatorRolesRoleIdScope setScope(String scope) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("scope", scope);
      return new GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
    }

    public RoleAssignment get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignment.class);
    }

    public RoleAssignment post() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST").invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(RoleAssignment.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }
}
