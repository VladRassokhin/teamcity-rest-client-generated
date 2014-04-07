package generated.resources;

import generated.*;
import generated.data.*;
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

public class AppRestProjects extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestProjects(Client client, URI baseUri, TeamCityClient tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/projects");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public Projects get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Projects.class);
  }

  public Projects get(String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Projects.class);
  }

  public Project post(NewProjectDescription input) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newProjectDescription"), NewProjectDescription.class, input), "application/json")).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Project.class);
  }

  public Project postTextPlain(String name) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(name, "text/plain")).invoke();
    Utils.throwExceptionIfWrongStatus(response);
    return response.readEntity(Project.class);
  }

  public ProjectLocatorTemplates getTemplates(String projectlocator) {
    return new ProjectLocatorTemplates(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorParameters getParameters(String projectlocator) {
    return new ProjectLocatorParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorParametersName getParametersName(String projectlocator, String name) {
    return new ProjectLocatorParametersName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, name);
  }

  public ProjectLocatorBuildTypesBtLocatorField getBuildTypesBtLocatorField(String projectlocator, String btlocator, String field) {
    return new ProjectLocatorBuildTypesBtLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, field);
  }

  public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField getBuildTypesBtLocatorBuildsBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field) {
    return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator, field);
  }

  public ProjectLocatorParentProject getParentProject(String projectlocator) {
    return new ProjectLocatorParentProject(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorAgentPools getAgentPools(String projectlocator) {
    return new ProjectLocatorAgentPools(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorAgentPoolsAgentPoolLocator getAgentPoolsAgentPoolLocator(String projectlocator, String agentpoollocator) {
    return new ProjectLocatorAgentPoolsAgentPoolLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, agentpoollocator);
  }

  public ProjectLocatorField getField(String projectlocator, String field) {
    return new ProjectLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, field);
  }

  public ProjectLocatorBuildTypes getBuildTypes(String projectlocator) {
    return new ProjectLocatorBuildTypes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorBuildTypesBtLocator getBuildTypesBtLocator(String projectlocator, String btlocator) {
    return new ProjectLocatorBuildTypesBtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
  }

  public ProjectLocatorTemplatesBtLocator getTemplatesBtLocator(String projectlocator, String btlocator) {
    return new ProjectLocatorTemplatesBtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
  }

  public ProjectLocatorNewProjectDescription getNewProjectDescription(String projectlocator) {
    return new ProjectLocatorNewProjectDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorExampleNewProjectDescription getExampleNewProjectDescription(String projectlocator) {
    return new ProjectLocatorExampleNewProjectDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocator getLocator(String projectlocator) {
    return new ProjectLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
  }

  public ProjectLocatorBuildTypesBtLocatorBuilds getBuildTypesBtLocatorBuilds(String projectlocator, String btlocator) {
    return new ProjectLocatorBuildTypesBtLocatorBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
  }

  public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator getBuildTypesBtLocatorBuildsBuildLocator(String projectlocator, String btlocator, String buildlocator) {
    return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator);
  }

  public class ProjectLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocator(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}");
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
    public ProjectLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocator(_client, copyUriBuilder, copyMap);
    }

    public Project get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Project get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Response delete() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.delete(resource);
    }
  }

  public class ProjectLocatorAgentPools {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorAgentPools(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorAgentPools(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/agentPools");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorAgentPools(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/agentPools");
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
    public ProjectLocatorAgentPools setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorAgentPools(_client, copyUriBuilder, copyMap);
    }

    public AgentPools get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPools.class);
    }

    public AgentPool post(AgentPool input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPool.class);
    }

    public AgentPools put(AgentPools input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agentPools"), AgentPools.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPools.class);
    }
  }

  public class ProjectLocatorAgentPoolsAgentPoolLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorAgentPoolsAgentPoolLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorAgentPoolsAgentPoolLocator(Client client, URI baseUri, String projectlocator, String agentpoollocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/agentPools/{agentPoolLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("agentPoolLocator", agentpoollocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorAgentPoolsAgentPoolLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator}");
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
    public ProjectLocatorAgentPoolsAgentPoolLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorAgentPoolsAgentPoolLocator(_client, copyUriBuilder, copyMap);
    }

    /**
     * Get agentPoolLocator
     */
    public String getAgentpoollocator() {
      return ((String) _templateAndMatrixParameterValues.get("agentPoolLocator"));
    }

    /**
     * Duplicate state and set agentPoolLocator
     */
    public ProjectLocatorAgentPoolsAgentPoolLocator setAgentpoollocator(String agentpoollocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentPoolLocator", agentpoollocator);
      return new ProjectLocatorAgentPoolsAgentPoolLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.delete(resource);
    }
  }

  public class ProjectLocatorBuildTypes {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypes(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypes(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypes(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes");
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
    public ProjectLocatorBuildTypes setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypes(_client, copyUriBuilder, copyMap);
    }

    public BuildTypes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    public BuildTypes get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    public <T> T postTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getReturnValue(returnType, response);
    }

    public <T> T postTextPlain(Object input, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getReturnValue(returnType, response);
    }

    /**
     * Creates a new build configuration by copying existing one.
     */
    public BuildType post(NewBuildTypeDescription input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    /**
     * Creates a new build configuration by copying existing one.
     */
    public BuildType post(NewBuildTypeDescription input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }
  }

  public class ProjectLocatorBuildTypesBtLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypesBtLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypesBtLocator(Client client, URI baseUri, String projectlocator, String btlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypesBtLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes/{btLocator}");
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
    public ProjectLocatorBuildTypesBtLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypesBtLocator(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBuildTypesBtLocator(_client, copyUriBuilder, copyMap);
    }

    public BuildType get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    public BuildType get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }
  }

  public class ProjectLocatorBuildTypesBtLocatorBuilds {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypesBtLocatorBuilds(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypesBtLocatorBuilds(Client client, URI baseUri, String projectlocator, String btlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypesBtLocatorBuilds(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds");
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
    public ProjectLocatorBuildTypesBtLocatorBuilds setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuilds(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuilds setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuilds(_client, copyUriBuilder, copyMap);
    }

    /**
     * Serves builds matching supplied condition.
     */
    public Builds get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }
    /**
     * Serves builds matching supplied condition.
     */
    /**
     * Serves builds matching supplied condition.
     */
    /**
     * Serves builds matching supplied condition.
     */
    public Builds get(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }
  }

  public class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(Client client, URI baseUri, String projectlocator, String btlocator, String buildlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}");
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
    }

    public Build get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    public Build get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }
  }

  public class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(Client client, URI baseUri, String projectlocator, String btlocator, String buildlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
      _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.getAsString(resource);
    }
  }

  public class ProjectLocatorBuildTypesBtLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorBuildTypesBtLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorBuildTypesBtLocatorField(Client client, URI baseUri, String projectlocator, String btlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/buildTypes/{btLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorBuildTypesBtLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/{field}");
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
    public ProjectLocatorBuildTypesBtLocatorField setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorField setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorBuildTypesBtLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.getAsString(resource);
    }
  }

  public class ProjectLocatorExampleNewProjectDescription {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorExampleNewProjectDescription(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorExampleNewProjectDescription(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/example/newProjectDescription");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorExampleNewProjectDescription(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/example/newProjectDescription");
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
    public ProjectLocatorExampleNewProjectDescription setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorExampleNewProjectDescription(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only.
     * Use this to get an example of the bean to be posted to the /projects request to create a new
     * project
     */
    public NewProjectDescription get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(NewProjectDescription.class);
    }

    /**
     * Experimental support only.
     * Use this to get an example of the bean to be posted to the /projects request to create a new
     * project
     */
    public NewProjectDescription get(String id) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("id", id);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(NewProjectDescription.class);
    }
  }

  public class ProjectLocatorField {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorField(Client client, URI baseUri, String projectlocator, String field) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/{field}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("field", field);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorField(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/{field}");
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
    public ProjectLocatorField setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorField(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new ProjectLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String putTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getStringValue(response);
    }

    public String get() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.getAsString(resource);
    }
  }

  public class ProjectLocatorNewProjectDescription {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorNewProjectDescription(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorNewProjectDescription(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/newProjectDescription");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorNewProjectDescription(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/newProjectDescription");
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
    public ProjectLocatorNewProjectDescription setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorNewProjectDescription(_client, copyUriBuilder, copyMap);
    }

    /**
     * For compatibility with experimental feature of 8.0
     */
    public NewProjectDescription get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(NewProjectDescription.class);
    }
    /**
     * For compatibility with experimental feature of 8.0
     */
    /**
     * For compatibility with experimental feature of 8.0
     */
    /**
     * For compatibility with experimental feature of 8.0
     */
    public NewProjectDescription get(String id) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("id", id);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(NewProjectDescription.class);
    }
  }

  public class ProjectLocatorParameters {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorParameters(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorParameters(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/parameters");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorParameters(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/parameters");
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
    public ProjectLocatorParameters setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorParameters(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Response delete() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.delete(resource);
    }

    public Property post(Property input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Property.class);
    }
  }

  public class ProjectLocatorParametersName {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorParametersName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorParametersName(Client client, URI baseUri, String projectlocator, String name) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/parameters/{name}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("name", name);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorParametersName(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/parameters/{name}");
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
    public ProjectLocatorParametersName setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorParametersName(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorParametersName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new ProjectLocatorParametersName(_client, copyUriBuilder, copyMap);
    }

    public String putTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getStringValue(response);
    }

    public String getAsString() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.getAsString(resource);
    }

    public Property getAsProperty() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Property.class);
    }

    public Response delete() {
      WebTarget resource = Utils.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return Utils.delete(resource);
    }
  }

  public class ProjectLocatorParentProject {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorParentProject(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorParentProject(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/parentProject");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorParentProject(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/parentProject");
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
    public ProjectLocatorParentProject setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorParentProject(_client, copyUriBuilder, copyMap);
    }

    public Project put(Project input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "project"), Project.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Project get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Project get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }
  }

  public class ProjectLocatorTemplates {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorTemplates(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorTemplates(Client client, URI baseUri, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/templates");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorTemplates(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/templates");
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
    public ProjectLocatorTemplates setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorTemplates(_client, copyUriBuilder, copyMap);
    }

    /**
     * Creates a new build configuration template by copying existing one.
     */
    public BuildType post(NewBuildTypeDescription input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    /**
     * Creates a new build configuration template by copying existing one.
     */
    public BuildType post(NewBuildTypeDescription input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    public BuildTypes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    public BuildTypes get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    public <T> T postTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getReturnValue(returnType, response);
    }

    public <T> T postTextPlain(Object input, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        Utils.throwExceptionIfWrongStatus(response);
      }
      return Utils.getReturnValue(returnType, response);
    }
  }

  public class ProjectLocatorTemplatesBtLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private ProjectLocatorTemplatesBtLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public ProjectLocatorTemplatesBtLocator(Client client, URI baseUri, String projectlocator, String btlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{projectLocator}/templates/{btLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
      _templateAndMatrixParameterValues.put("btLocator", btlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public ProjectLocatorTemplatesBtLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/projects/{projectLocator}/templates/{btLocator}");
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
    public ProjectLocatorTemplatesBtLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new ProjectLocatorTemplatesBtLocator(_client, copyUriBuilder, copyMap);
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
    public ProjectLocatorTemplatesBtLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new ProjectLocatorTemplatesBtLocator(_client, copyUriBuilder, copyMap);
    }

    public BuildType get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    public BuildType get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = Utils.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(Utils.METHOD_GET).invoke();
      Utils.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }
  }
}
