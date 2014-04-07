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

public class AppRestAgentPools extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestAgentPools(Client client, URI baseUri, TeamcityJetbrainsCom tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/agentPools");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  public AgentPools get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(AgentPools.class);
  }

  public AgentPool post(AgentPool input) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(AgentPool.class);
  }

  public AgentPoolLocatorProjects agentPoolLocatorProjects(String agentpoollocator) {
    return new AgentPoolLocatorProjects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
  }

  public AgentPoolLocatorAgents agentPoolLocatorAgents(String agentpoollocator) {
    return new AgentPoolLocatorAgents(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
  }

  public AgentPoolLocator agentPoolLocator(String agentpoollocator) {
    return new AgentPoolLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
  }

  public AgentPoolLocatorProjectsProjectLocator agentPoolLocatorProjectsProjectLocator(String agentpoollocator, String projectlocator) {
    return new AgentPoolLocatorProjectsProjectLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator, projectlocator);
  }

  public class AgentPoolLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AgentPoolLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AgentPoolLocator(Client client, URI baseUri, String agentpoollocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{agentPoolLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("agentPoolLocator", agentpoollocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public AgentPoolLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public AgentPoolLocator setAgentpoollocator(String agentpoollocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentPoolLocator", agentpoollocator);
      return new AgentPoolLocator(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public AgentPool get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPool.class);
    }

    public AgentPool get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPool.class);
    }
  }

  public class AgentPoolLocatorAgents {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AgentPoolLocatorAgents(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AgentPoolLocatorAgents(Client client, URI baseUri, String agentpoollocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{agentPoolLocator}/agents");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("agentPoolLocator", agentpoollocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public AgentPoolLocatorAgents(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/agents");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public AgentPoolLocatorAgents setAgentpoollocator(String agentpoollocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentPoolLocator", agentpoollocator);
      return new AgentPoolLocatorAgents(_client, copyUriBuilder, copyMap);
    }

    public AgentsRef get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    public AgentsRef get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    /**
     * Moves the agent posted to the pool
     */
    public Agent post(Agent input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent"), Agent.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Agent.class);
    }
  }

  public class AgentPoolLocatorProjects {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AgentPoolLocatorProjects(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AgentPoolLocatorProjects(Client client, URI baseUri, String agentpoollocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{agentPoolLocator}/projects");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("agentPoolLocator", agentpoollocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public AgentPoolLocatorProjects(Client client, URI uri) {
      _client = client;
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/projects");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public AgentPoolLocatorProjects setAgentpoollocator(String agentpoollocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentPoolLocator", agentpoollocator);
      return new AgentPoolLocatorProjects(_client, copyUriBuilder, copyMap);
    }

    /**
     * Adds the posted project to the pool associated projects
     */
    public Project post(Project input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "project"), Project.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Projects get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Projects.class);
    }

    public Projects get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Projects.class);
    }

    /**
     * Associates the posted set of projects with the pool which replaces earlier associations on
     * this pool
     */
    public Projects put(Projects input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "projects"), Projects.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Projects.class);
    }
  }

  public class AgentPoolLocatorProjectsProjectLocator {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AgentPoolLocatorProjectsProjectLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AgentPoolLocatorProjectsProjectLocator(Client client, URI baseUri, String agentpoollocator, String projectlocator) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/{agentPoolLocator}/projects/{projectLocator}");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      _templateAndMatrixParameterValues.put("agentPoolLocator", agentpoollocator);
      _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
    }

    /**
     * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
     */
    public AgentPoolLocatorProjectsProjectLocator(Client client, URI uri) {
      _client = client;
      StringBuilder template = myRestClient.getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}");
      _uriBuilder = UriBuilder.fromPath(template.toString());
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
      UriTemplate uriTemplate = new UriTemplate(template.toString());
      HashMap<String, String> parameters = new HashMap<String, String>();
      uriTemplate.match(uri.toString(), parameters);
      _templateAndMatrixParameterValues.putAll(parameters);
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
    public AgentPoolLocatorProjectsProjectLocator setAgentpoollocator(String agentpoollocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentPoolLocator", agentpoollocator);
      return new AgentPoolLocatorProjectsProjectLocator(_client, copyUriBuilder, copyMap);
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
    public AgentPoolLocatorProjectsProjectLocator setProjectlocator(String projectlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("projectLocator", projectlocator);
      return new AgentPoolLocatorProjectsProjectLocator(_client, copyUriBuilder, copyMap);
    }

    public Project get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Project get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }
  }
}
