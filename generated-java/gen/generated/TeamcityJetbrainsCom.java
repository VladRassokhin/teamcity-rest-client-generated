package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Generated(value = {
    "wadl|file:/Users/vlad/devel/teamcity-rest-client/generated-java/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-04-07T14:34:37.557+04:00")
public class TeamcityJetbrainsCom {
  /**
   * The base URI for the resource represented by this proxy
   */
  public final static URI BASE_URI;

  static {
    BASE_URI = URI.create("http://teamcity.jetbrains.com/");
  }

  public static final String GET = "GET";

  /**
   * Template method to allow tooling to customize the new Client
   */
  private static void customizeClientConfiguration(Configurable cc) {
  }

  /**
   * Template method to allow tooling to override Client factory
   */
  private static Client createClientInstance() {
    return ClientBuilder.newClient();
  }

  /**
   * Create a new Client instance
   */
  public static Client createClient() {
    Client client = createClientInstance();
    customizeClientConfiguration(client);
    return client;
  }

  public static WebTarget getWebTarget(UriBuilder builder, Client client, Map<String, Object> map) {
    final UriBuilder localUriBuilder = builder.clone();
    return client.target(localUriBuilder.buildFromMap(map));
  }

  public static Invocation.Builder getBuilder(UriBuilder builder, Client client, Map<String, Object> map, String type) {
    final WebTarget resource = getWebTarget(builder, client, map);
    return resource.request(type);
  }
  public static Invocation.Builder getBuilder(UriBuilder builder, Client client, Map<String, Object> map) {
    final WebTarget resource = getWebTarget(builder, client, map);
    return resource.request();
  }

  public static AppRestVcsRoots appRestVcsRoots(Client client, URI baseURI) {
    return new AppRestVcsRoots(client, baseURI);
  }

  public static AppRestVcsRoots appRestVcsRoots() {
    return appRestVcsRoots(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestBuilds appRestBuilds(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestBuilds(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestBuilds appRestBuilds() {
    return appRestBuilds(createClient(), BASE_URI);
  }

  public static AppRestServer appRestServer(Client client, URI baseURI) {
    return new AppRestServer(client, baseURI);
  }

  public static AppRestServer appRestServer() {
    return appRestServer(createClient(), BASE_URI);
  }

  public static AppRestUserGroups appRestUserGroups(Client client, URI baseURI) {
    return new AppRestUserGroups(client, baseURI);
  }

  public static AppRestUserGroups appRestUserGroups() {
    return appRestUserGroups(createClient(), BASE_URI);
  }

  public static AppRestProjects appRestProjects(Client client, URI baseURI) {
    return new AppRestProjects(client, baseURI);
  }

  public static AppRestProjects appRestProjects() {
    return appRestProjects(createClient(), BASE_URI);
  }

  public static AppRestUsers appRestUsers(Client client, URI baseURI) {
    return new AppRestUsers(client, baseURI);
  }

  public static AppRestUsers appRestUsers() {
    return appRestUsers(createClient(), BASE_URI);
  }

  public static AppRestTestOccurrences appRestTestOccurrences(Client client, URI baseURI) {
    return new AppRestTestOccurrences(client, baseURI);
  }

  public static AppRestTestOccurrences appRestTestOccurrences() {
    return appRestTestOccurrences(createClient(), BASE_URI);
  }

  public static AppRestChanges appRestChanges(Client client, URI baseURI) {
    return new AppRestChanges(client, baseURI);
  }

  public static AppRestChanges appRestChanges() {
    return appRestChanges(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestAgents appRestAgents(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestAgents(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestAgents appRestAgents() {
    return appRestAgents(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestAgentPools appRestAgentPools(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestAgentPools(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestAgentPools appRestAgentPools() {
    return appRestAgentPools(createClient(), BASE_URI);
  }

  public static AppRestProblems appRestProblems(Client client, URI baseURI) {
    return new AppRestProblems(client, baseURI);
  }

  public static AppRestProblems appRestProblems() {
    return appRestProblems(createClient(), BASE_URI);
  }

  public static AppRest appRest(Client client, URI baseURI) {
    return new AppRest(client, baseURI);
  }

  public static AppRest appRest() {
    return appRest(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestBuildQueue appRestBuildQueue(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestBuildQueue(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestBuildQueue appRestBuildQueue() {
    return appRestBuildQueue(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestBuildTypes appRestBuildTypes(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestBuildTypes(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestBuildTypes appRestBuildTypes() {
    return appRestBuildTypes(createClient(), BASE_URI);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public static AppRestInvestigations appRestInvestigations(Client client, URI baseURI) {
    return new AppRestInvestigations(client, baseURI);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public static AppRestInvestigations appRestInvestigations() {
    return appRestInvestigations(createClient(), BASE_URI);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public static AppRestVcsRootInstances appRestVcsRootInstances(Client client, URI baseURI) {
    return new AppRestVcsRootInstances(client, baseURI);
  }

  public static AppRestVcsRootInstances appRestVcsRootInstances() {
    return appRestVcsRootInstances(createClient(), BASE_URI);
  }

  public static AppRestTests appRestTests(Client client, URI baseURI) {
    return new AppRestTests(client, baseURI);
  }

  public static AppRestTests appRestTests() {
    return appRestTests(createClient(), BASE_URI);
  }

  public static AppRestProblemOccurrences appRestProblemOccurrences(Client client, URI baseURI) {
    return new AppRestProblemOccurrences(client, baseURI);
  }

  public static AppRestProblemOccurrences appRestProblemOccurrences() {
    return appRestProblemOccurrences(createClient(), BASE_URI);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public static AppRestDebug appRestDebug(Client client, URI baseURI) {
    return new AppRestDebug(client, baseURI);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public static AppRestDebug appRestDebug() {
    return appRestDebug(createClient(), BASE_URI);
  }

  public static class AppRestAgentPools {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestAgentPools(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestAgentPools(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/agentPools");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public AgentPools get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPools.class);
    }

    public AgentPool post(AgentPool input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPool.class);
    }

    public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjects agentPoolLocatorProjects(String agentpoollocator) {
      return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
    }

    public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorAgents agentPoolLocatorAgents(String agentpoollocator) {
      return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorAgents(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
    }

    public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocator agentPoolLocator(String agentpoollocator) {
      return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator);
    }

    public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator agentPoolLocatorProjectsProjectLocator(String agentpoollocator, String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentpoollocator, projectlocator);
    }

    public static class AgentPoolLocator {
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
        template = getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}");
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
      public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocator setAgentpoollocator(String agentpoollocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentPoolLocator", agentpoollocator);
        return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public AgentPool get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public AgentPool get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }
    }

    public static class AgentPoolLocatorAgents {
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
        template = getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/agents");
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
      public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorAgents setAgentpoollocator(String agentpoollocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentPoolLocator", agentpoollocator);
        return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorAgents(_client, copyUriBuilder, copyMap);
      }

      public AgentsRef get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }

      public AgentsRef get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }

      /**
       * Moves the agent posted to the pool
       */
      public Agent post(Agent input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent"), Agent.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Agent.class);
      }
    }

    public static class AgentPoolLocatorProjects {
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
        template = getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/projects");
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
      public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjects setAgentpoollocator(String agentpoollocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentPoolLocator", agentpoollocator);
        return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjects(_client, copyUriBuilder, copyMap);
      }

      /**
       * Adds the posted project to the pool associated projects
       */
      public Project post(Project input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "project"), Project.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Projects get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Projects.class);
      }

      public Projects get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Projects.class);
      }

      /**
       * Associates the posted set of projects with the pool which replaces earlier associations on
       * this pool
       */
      public Projects put(Projects input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "projects"), Projects.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Projects.class);
      }
    }

    public static class AgentPoolLocatorProjectsProjectLocator {
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
        StringBuilder template = getTemplateBuilder("app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}");
        ;
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
      public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator setAgentpoollocator(String agentpoollocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentPoolLocator", agentpoollocator);
        return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestAgentPools.AgentPoolLocatorProjectsProjectLocator(_client, copyUriBuilder, copyMap);
      }

      public Project get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Project get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }
  }

  public static StringBuilder getTemplateBuilder(String path) {
    final String base = BASE_URI.toString();
    StringBuilder template = new StringBuilder(base);
    if (!base.endsWith("/")) {
      template.append("/");
    }
    template.append(path);
    return template;
  }

  public static class AppRestAgents {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestAgents(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestAgents(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/agents");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Returns list of agents
     */
    public AgentsRef get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    /**
     * Returns list of agents
     */
    public AgentsRef get(Boolean includedisconnected, Boolean includeunauthorized, String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("includeDisconnected", includedisconnected);

      localUriBuilder = localUriBuilder.replaceQueryParam("includeUnauthorized", includeunauthorized);

      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    public TeamcityJetbrainsCom.AppRestAgents.AgentLocatorPool agentLocatorPool(String agentlocator) {
      return new TeamcityJetbrainsCom.AppRestAgents.AgentLocatorPool(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentlocator);
    }

    public TeamcityJetbrainsCom.AppRestAgents.AgentLocator agentLocator(String agentlocator) {
      return new TeamcityJetbrainsCom.AppRestAgents.AgentLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentlocator);
    }

    public TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField agentLocatorField(String agentlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), agentlocator, field);
    }

    public static class AgentLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private AgentLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public AgentLocator(Client client, URI baseUri, String agentlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{agentLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("agentLocator", agentlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public AgentLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/agents/{agentLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get agentLocator
       */
      public String getAgentlocator() {
        return ((String) _templateAndMatrixParameterValues.get("agentLocator"));
      }

      /**
       * Duplicate state and set agentLocator
       */
      public TeamcityJetbrainsCom.AppRestAgents.AgentLocator setAgentlocator(String agentlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentLocator", agentlocator);
        return new TeamcityJetbrainsCom.AppRestAgents.AgentLocator(_client, copyUriBuilder, copyMap);
      }

      public Agent get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Agent.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }

    public static class AgentLocatorField {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private AgentLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public AgentLocatorField(Client client, URI baseUri, String agentlocator, String field) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{agentLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("agentLocator", agentlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public AgentLocatorField(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/agents/{agentLocator}/{field}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get agentLocator
       */
      public String getAgentlocator() {
        return ((String) _templateAndMatrixParameterValues.get("agentLocator"));
      }

      /**
       * Duplicate state and set agentLocator
       */
      public TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField setAgentlocator(String agentlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentLocator", agentlocator);
        return new TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestAgents.AgentLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(String input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class AgentLocatorPool {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private AgentLocatorPool(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public AgentLocatorPool(Client client, URI baseUri, String agentlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{agentLocator}/pool");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("agentLocator", agentlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public AgentLocatorPool(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/agents/{agentLocator}/pool");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get agentLocator
       */
      public String getAgentlocator() {
        return ((String) _templateAndMatrixParameterValues.get("agentLocator"));
      }

      /**
       * Duplicate state and set agentLocator
       */
      public TeamcityJetbrainsCom.AppRestAgents.AgentLocatorPool setAgentlocator(String agentlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentLocator", agentlocator);
        return new TeamcityJetbrainsCom.AppRestAgents.AgentLocatorPool(_client, copyUriBuilder, copyMap);
      }

      public AgentPool get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public AgentPool get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public AgentPool put(AgentPool input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }
    }
  }

  public static class AppRestBuildQueue {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestBuildQueue(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public Builds put(Builds input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public Build post(Build input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "build"), Build.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    /**
     * Experimental! Deletes the set of builds filtered
     */
    public Response delete() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    /**
     * Experimental! Deletes the set of builds filtered
     */
    public Response delete(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      WebTarget resource = getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    /**
     * Serves build queue.
     */
    public Builds get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    /**
     * Serves build queue.
     */
    public Builds get(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocator queuedBuildLocator(String queuedbuildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), queuedbuildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorExampleBuildCancelRequest buildLocatorExampleBuildCancelRequest(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorExampleBuildCancelRequest(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocatorCompatibleAgents queuedBuildLocatorCompatibleAgents(String queuedbuildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocatorCompatibleAgents(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), queuedbuildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField buildLocatorField(String buildlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, field);
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
        template = getTemplateBuilder("app/rest/buildQueue/{buildLocator}/example/buildCancelRequest");
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
      public TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorExampleBuildCancelRequest setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorExampleBuildCancelRequest(_client, copyUriBuilder, copyMap);
      }

      public BuildCancelRequest get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/buildQueue/{buildLocator}/{field}");
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
      public TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestBuildQueue.BuildLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
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
        template = getTemplateBuilder("app/rest/buildQueue/{queuedBuildLocator}");
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
      public TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocator setQueuedbuildlocator(String queuedbuildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("queuedBuildLocator", queuedbuildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public Build post(BuildCancelRequest input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents");
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
      public TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocatorCompatibleAgents setQueuedbuildlocator(String queuedbuildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("queuedBuildLocator", queuedbuildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildQueue.QueuedBuildLocatorCompatibleAgents(_client, copyUriBuilder, copyMap);
      }

      public AgentsRef get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }

      public AgentsRef get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }
    }
  }

  public static class AppRestBuilds {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestBuilds(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
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
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath buildLocatorArtifactsMetadatapath(String buildlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorPin buildLocatorPin(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorPin(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocator buildLocator(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTags buildLocatorTags(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTags(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorProblemOccurrences buildLocatorProblemOccurrences(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorProblemOccurrences(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifacts buildLocatorArtifacts(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifacts(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorCanceledInfo buildLocatorCanceledInfo(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorCanceledInfo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTestOccurrences buildLocatorTestOccurrences(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTestOccurrences(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorExampleBuildCancelRequest buildLocatorExampleBuildCancelRequest(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorExampleBuildCancelRequest(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatistics buildLocatorStatistics(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatistics(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName buildLocatorStatisticsName(String buildlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, name);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorComment buildLocatorComment(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorComment(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatusIcon buildLocatorStatusIcon(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatusIcon(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName buildLocatorResultingPropertiesPropertyName(String buildlocator, String propertyname) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, propertyname);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField buildLocatorField(String buildlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingProperties buildLocatorResultingProperties(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath buildLocatorArtifactsChildrenpath(String buildlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath buildLocatorArtifactsContentpath(String buildlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath buildLocatorArtifactsFilespath(String buildlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName buildLocatorSourcesFilesFileName(String buildlocator, String filename) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator, filename);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues buildLocatorRelatedIssues(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues2 buildLocatorRelatedIssues2(String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues2(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), buildlocator);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocator setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public Build post(BuildCancelRequest input) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build post(BuildCancelRequest input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        WebTarget resource = getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
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
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifacts setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifacts(_client, copyUriBuilder, copyMap);
      }

      /**
       * More user-friendly URL for "/{buildLocator}/artifacts/children" one.
       */
      public Files get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/children{path:(/.*)?}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsChildrenpath(_client, copyUriBuilder, copyMap);
      }

      public Files get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Files.class);
      }

      public Files get(Boolean resolveparameters, String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/content{path:(/.*)?}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsContentpath(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAs(Class<T> returnType) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      public <T> T getAs(Boolean resolveparameters, Boolean logbuildusage, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        localUriBuilder = localUriBuilder.replaceQueryParam("logBuildUsage", logbuildusage);

        WebTarget resource = getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/files{path:(/.*)?}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsFilespath(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAs(Class<T> returnType) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/artifacts/metadata{path:(/.*)?}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorArtifactsMetadatapath(_client, copyUriBuilder, copyMap);
      }

      public File get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(File.class);
      }

      public File get(Boolean resolveparameters, String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/canceledInfo");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorCanceledInfo setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorCanceledInfo(_client, copyUriBuilder, copyMap);
      }

      public Comment get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Comment.class);
      }

      public Comment get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/comment");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorComment setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorComment(_client, copyUriBuilder, copyMap);
      }

      public <T> T putTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/example/buildCancelRequest");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorExampleBuildCancelRequest setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorExampleBuildCancelRequest(_client, copyUriBuilder, copyMap);
      }

      public BuildCancelRequest get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/{field}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/pin/");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorPin setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorPin(_client, copyUriBuilder, copyMap);
      }

      /**
       * Pins a build
       */
      public <T> T putTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      /**
       * Fetches current build pinned status.
       */
      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      /**
       * Unpins a build
       */
      public <T> T deleteTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
        Response response = resourceBuilder.build("DELETE", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/problemOccurrences");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorProblemOccurrences setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorProblemOccurrences(_client, copyUriBuilder, copyMap);
      }

      public ProblemOccurrences get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(ProblemOccurrences.class);
      }

      public ProblemOccurrences get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = getTemplateBuilder("app/rest/builds/{buildLocator}/related-issues");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues(_client, copyUriBuilder, copyMap);
      }

      public IssueUsages get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(IssueUsages.class);
      }

      public IssueUsages get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/relatedIssues");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues2 setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorRelatedIssues2(_client, copyUriBuilder, copyMap);
      }

      public IssueUsages get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(IssueUsages.class);
      }

      public IssueUsages get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/resulting-properties/");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingProperties setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingProperties(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/resulting-properties/{propertyName}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName setPropertyname(String propertyname) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("propertyName", propertyname);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorResultingPropertiesPropertyName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/sources/files/{fileName:.+}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName setFilename(String filename) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("fileName", filename);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorSourcesFilesFileName(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAsOctetStream(Class<T> returnType) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/statistics/");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatistics setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatistics(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/statistics/{name}");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatisticsName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/statusIcon");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatusIcon setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorStatusIcon(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAs(Class<T> returnType) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/tags/");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTags setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTags(_client, copyUriBuilder, copyMap);
      }

      /**
       * Adds a single tag to a build
       */
      public String postTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }

      /**
       * Replaces build's tags.
       */
      public Tags put(Tags input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Tags.class);
      }

      /**
       * Adds a set of tags to a build
       */
      public Response post(Tags input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues);
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
        return response;
      }

      public Tags get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        template = getTemplateBuilder("app/rest/builds/{buildLocator}/testOccurrences");
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
      public TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTestOccurrences setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuilds.BuildLocatorTestOccurrences(_client, copyUriBuilder, copyMap);
      }

      public TestOccurrences get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(TestOccurrences.class);
      }

      public TestOccurrences get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(TestOccurrences.class);
      }
    }
  }

  public static class AppRestBuildTypes {
    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestBuildTypes(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestBuildTypes(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/buildTypes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public <T> T post(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue(returnType, response);
    }

    public BuildType post(BuildType input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildType"), BuildType.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    /**
     * Lists build types registered on the server. Build templates are not included by default
     */
    public BuildTypes get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    /**
     * Lists build types registered on the server. Build templates are not included by default
     */
    public BuildTypes get(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirements btLocatorAgentRequirements(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirements(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeatures btLocatorFeatures(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeatures(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator btLocatorSnapshotDependenciesSnapshotDepLocator(String btlocator, String snapshotdeplocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, snapshotdeplocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId btLocatorVcsRootEntriesId(String btlocator, String id) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, id);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator btLocatorArtifactDependenciesArtifactDepLocator(String btlocator, String artifactdeplocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, artifactdeplocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator btLocatorTriggersTriggerLocator(String btlocator, String triggerlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, triggerlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator btLocatorAgentRequirementsAgentRequirementLocator(String btlocator, String agentrequirementlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, agentrequirementlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName btLocatorParametersName(String btlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, name);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggers btLocatorTriggers(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggers(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSteps btLocatorSteps(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSteps(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorInvestigations btLocatorInvestigations(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorInvestigations(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntries btLocatorVcsRootEntries(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntries(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId btLocatorStepsStepId(String btlocator, String stepid) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters btLocatorStepsStepIdParameters(String btlocator, String stepid) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName btLocatorStepsStepIdParametersParameterName(String btlocator, String stepid, String parametername) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid, parametername);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName btLocatorStepsStepIdFieldName(String btlocator, String stepid, String fieldname) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid, fieldname);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId btLocatorFeaturesFeatureId(String btlocator, String featureid) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters btLocatorFeaturesFeatureIdParameters(String btlocator, String featureid) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName btLocatorFeaturesFeatureIdParametersParameterName(String btlocator, String featureid, String parametername) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid, parametername);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName btLocatorFeaturesFeatureIdName(String btlocator, String featureid, String name) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid, name);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependencies btLocatorArtifactDependencies(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependencies(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependencies btLocatorSnapshotDependencies(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependencies(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName btLocatorTriggersTriggerLocatorFieldName(String btlocator, String triggerlocator, String fieldname) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, triggerlocator, fieldname);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsLabeling btLocatorVcsLabeling(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsLabeling(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath btLocatorVcsFilesLatestContentpath(String btlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath btLocatorVcsFilesLatestChildrenpath(String btlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath btLocatorVcsFilesLatestMetadatapath(String btlocator, String path) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorNewBuildTypeDescription btLocatorNewBuildTypeDescription(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorNewBuildTypeDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorExampleNewBuildTypeDescription btLocatorExampleNewBuildTypeDescription(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorExampleNewBuildTypeDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootInstances btLocatorVcsRootInstances(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootInstances(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuilds btLocatorBuilds(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator btLocatorBuildsBuildLocator(String btlocator, String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, buildlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField btLocatorBuildsBuildLocatorField(String btlocator, String buildlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, buildlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBranches btLocatorBranches(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBranches(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocator btLocator(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField btLocatorField(String btlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildTags btLocatorBuildTags(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildTags(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParameters btLocatorParameters(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettings btLocatorSettings(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettings(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName btLocatorSettingsName(String btlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, name);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTemplate btLocatorTemplate(String btlocator) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTemplate(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
    }

    public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules btLocatorVcsRootEntriesIdCheckoutRules(String btlocator, String id) {
      return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, id);
    }

    public static class BtLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocator(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocator(_client, copyUriBuilder, copyMap);
      }

      /**
       * Serves build configuration or templates according to the locator.
       */
      public BuildType get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }
      /**
       * Serves build configuration or templates according to the locator.
       */
      /**
       * Serves build configuration or templates according to the locator.
       */
      /**
       * Serves build configuration or templates according to the locator.
       */
      public BuildType get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }
      /**
       * Serves build configuration or templates according to the locator.
       */
      /**
       * Serves build configuration or templates according to the locator.
       */
      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }

    public static class BtLocatorAgentRequirements {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorAgentRequirements(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorAgentRequirements(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/agent-requirements");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorAgentRequirements(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/agent-requirements");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirements setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirements(_client, copyUriBuilder, copyMap);
      }

      public PropEntitiesAgentRequirement get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesAgentRequirement.class);
      }

      /**
       * Creates new agent requirement. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new requirement cannot be created (e.g. another requirement is present for the
       * parameter).
       */
      public PropEntityAgentRequirement post(PropEntityAgentRequirement input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityAgentRequirement.class);
      }

      /**
       * Replaces agent requirements with those sent in the request.
       */
      public PropEntitiesAgentRequirement put(PropEntitiesAgentRequirement input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirements"), PropEntitiesAgentRequirement.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesAgentRequirement.class);
      }
    }

    public static class BtLocatorAgentRequirementsAgentRequirementLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorAgentRequirementsAgentRequirementLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorAgentRequirementsAgentRequirementLocator(Client client, URI baseUri, String btlocator, String agentrequirementlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/agent-requirements/{agentRequirementLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("agentRequirementLocator", agentrequirementlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorAgentRequirementsAgentRequirementLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get agentRequirementLocator
       */
      public String getAgentrequirementlocator() {
        return ((String) _templateAndMatrixParameterValues.get("agentRequirementLocator"));
      }

      /**
       * Duplicate state and set agentRequirementLocator
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator setAgentrequirementlocator(String agentrequirementlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentRequirementLocator", agentrequirementlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorAgentRequirementsAgentRequirementLocator(_client, copyUriBuilder, copyMap);
      }

      public PropEntityAgentRequirement get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityAgentRequirement.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntityAgentRequirement put(PropEntityAgentRequirement input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityAgentRequirement.class);
      }
    }

    public static class BtLocatorArtifactDependencies {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorArtifactDependencies(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorArtifactDependencies(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/artifact-dependencies");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorArtifactDependencies(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/artifact-dependencies");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependencies setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependencies(_client, copyUriBuilder, copyMap);
      }

      public PropEntitiesArtifactDep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesArtifactDep.class);
      }

      /**
       * Replaces the dependencies to those sent in the request.
       */
      public PropEntitiesArtifactDep put(PropEntitiesArtifactDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependencies"), PropEntitiesArtifactDep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesArtifactDep.class);
      }
      /**
       * Replaces the dependencies to those sent in the request.
       */
      /**
       * Replaces the dependencies to those sent in the request.
       */
      public PropEntityArtifactDep post(PropEntityArtifactDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityArtifactDep.class);
      }
    }

    public static class BtLocatorArtifactDependenciesArtifactDepLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorArtifactDependenciesArtifactDepLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorArtifactDependenciesArtifactDepLocator(Client client, URI baseUri, String btlocator, String artifactdeplocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/artifact-dependencies/{artifactDepLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("artifactDepLocator", artifactdeplocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorArtifactDependenciesArtifactDepLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get artifactDepLocator
       */
      public String getArtifactdeplocator() {
        return ((String) _templateAndMatrixParameterValues.get("artifactDepLocator"));
      }

      /**
       * Duplicate state and set artifactDepLocator
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator setArtifactdeplocator(String artifactdeplocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("artifactDepLocator", artifactdeplocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorArtifactDependenciesArtifactDepLocator(_client, copyUriBuilder, copyMap);
      }

      public PropEntityArtifactDep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityArtifactDep.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntityArtifactDep put(PropEntityArtifactDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityArtifactDep.class);
      }
    }

    public static class BtLocatorBranches {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorBranches(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorBranches(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/branches");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorBranches(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/branches");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBranches setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBranches(_client, copyUriBuilder, copyMap);
      }

      /**
       * Lists branches of the build type.
       */
      public Branches get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Branches.class);
      }
      /**
       * Lists branches of the build type.
       */
      /**
       * Lists branches of the build type.
       */
      /**
       * Lists branches of the build type.
       *
       * @param locator experimental use only!
       */
      public Branches get(String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Branches.class);
      }
    }

    public static class BtLocatorBuilds {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorBuilds(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorBuilds(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorBuilds(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuilds setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuilds(_client, copyUriBuilder, copyMap);
      }

      /**
       * Serves builds matching supplied condition.
       */
      public Builds get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Builds.class);
      }

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

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Builds.class);
      }
    }

    public static class BtLocatorBuildsBuildLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorBuildsBuildLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorBuildsBuildLocator(Client client, URI baseUri, String btlocator, String buildlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds/{buildLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorBuildsBuildLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds/{buildLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
      }

      public Build get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }
    }

    public static class BtLocatorBuildsBuildLocatorField {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorBuildsBuildLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorBuildsBuildLocatorField(Client client, URI baseUri, String btlocator, String buildlocator, String field) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/builds/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorBuildsBuildLocatorField(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }
    }

    public static class BtLocatorBuildTags {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorBuildTags(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorBuildTags(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/buildTags");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorBuildTags(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/buildTags");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildTags setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorBuildTags(_client, copyUriBuilder, copyMap);
      }

      public Tags get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Tags.class);
      }
    }

    public static class BtLocatorExampleNewBuildTypeDescription {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorExampleNewBuildTypeDescription(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorExampleNewBuildTypeDescription(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/example/newBuildTypeDescription");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorExampleNewBuildTypeDescription(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/example/newBuildTypeDescription");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorExampleNewBuildTypeDescription setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorExampleNewBuildTypeDescription(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /buildTypes request to create a new
       * build type
       */
      public NewBuildTypeDescription get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(NewBuildTypeDescription.class);
      }
      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /buildTypes request to create a new
       * build type
       */
      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /buildTypes request to create a new
       * build type
       */
    }

    public static class BtLocatorFeatures {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorFeatures(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorFeatures(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/features");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorFeatures(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/features");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeatures setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeatures(_client, copyUriBuilder, copyMap);
      }

      public PropEntityFeature post(PropEntityFeature input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityFeature.class);
      }

      public PropEntitiesFeature get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesFeature.class);
      }

      public PropEntitiesFeature put(PropEntitiesFeature input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "features"), PropEntitiesFeature.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesFeature.class);
      }
    }

    public static class BtLocatorFeaturesFeatureId {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorFeaturesFeatureId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorFeaturesFeatureId(Client client, URI baseUri, String btlocator, String featureid) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/features/{featureId}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("featureId", featureid);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorFeaturesFeatureId(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get featureId
       */
      public String getFeatureid() {
        return ((String) _templateAndMatrixParameterValues.get("featureId"));
      }

      /**
       * Duplicate state and set featureId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId setFeatureid(String featureid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("featureId", featureid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureId(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntityFeature put(PropEntityFeature input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityFeature.class);
      }

      public PropEntityFeature get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityFeature.class);
      }
    }

    public static class BtLocatorFeaturesFeatureIdName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorFeaturesFeatureIdName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorFeaturesFeatureIdName(Client client, URI baseUri, String btlocator, String featureid, String name) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/features/{featureId}/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("featureId", featureid);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorFeaturesFeatureIdName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/{name}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get featureId
       */
      public String getFeatureid() {
        return ((String) _templateAndMatrixParameterValues.get("featureId"));
      }

      /**
       * Duplicate state and set featureId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName setFeatureid(String featureid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("featureId", featureid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorFeaturesFeatureIdParameters {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorFeaturesFeatureIdParameters(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorFeaturesFeatureIdParameters(Client client, URI baseUri, String btlocator, String featureid) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/features/{featureId}/parameters");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("featureId", featureid);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorFeaturesFeatureIdParameters(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get featureId
       */
      public String getFeatureid() {
        return ((String) _templateAndMatrixParameterValues.get("featureId"));
      }

      /**
       * Duplicate state and set featureId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters setFeatureid(String featureid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("featureId", featureid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParameters(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties put(Properties input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }
    }

    public static class BtLocatorFeaturesFeatureIdParametersParameterName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorFeaturesFeatureIdParametersParameterName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorFeaturesFeatureIdParametersParameterName(Client client, URI baseUri, String btlocator, String featureid, String parametername) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/features/{featureId}/parameters/{parameterName}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("featureId", featureid);
        _templateAndMatrixParameterValues.put("parameterName", parametername);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorFeaturesFeatureIdParametersParameterName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get featureId
       */
      public String getFeatureid() {
        return ((String) _templateAndMatrixParameterValues.get("featureId"));
      }

      /**
       * Duplicate state and set featureId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName setFeatureid(String featureid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("featureId", featureid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get parameterName
       */
      public String getParametername() {
        return ((String) _templateAndMatrixParameterValues.get("parameterName"));
      }

      /**
       * Duplicate state and set parameterName
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName setParametername(String parametername) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("parameterName", parametername);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public <T> String putAsTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorField {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorField(Client client, URI baseUri, String btlocator, String field) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorField(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/{field}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorInvestigations {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorInvestigations(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorInvestigations(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/investigations");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorInvestigations(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/investigations");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorInvestigations setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorInvestigations(_client, copyUriBuilder, copyMap);
      }

      public Investigations get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Investigations.class);
      }

      public Investigations get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Investigations.class);
      }
    }

    public static class BtLocatorNewBuildTypeDescription {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorNewBuildTypeDescription(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorNewBuildTypeDescription(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/newBuildTypeDescription");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorNewBuildTypeDescription(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/newBuildTypeDescription");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorNewBuildTypeDescription setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorNewBuildTypeDescription(_client, copyUriBuilder, copyMap);
      }

      /**
       * For compatibility with experimental feature of 8.0
       */
      public NewBuildTypeDescription get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(NewBuildTypeDescription.class);
      }
      /**
       * For compatibility with experimental feature of 8.0
       */
      /**
       * For compatibility with experimental feature of 8.0
       */
    }

    public static class BtLocatorParameters {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorParameters(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorParameters(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/parameters");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorParameters(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/parameters");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParameters setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParameters(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties get(String locator, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties put(Properties input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties put(Properties input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public Property post(Property input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public Property post(Property input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }
    }

    public static class BtLocatorParametersName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorParametersName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorParametersName(Client client, URI baseUri, String btlocator, String name) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/parameters/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorParametersName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/parameters/{name}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorParametersName(_client, copyUriBuilder, copyMap);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }

      public String getAsString() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.getAsString(resource);
      }

      public Property getAsProperty() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }

    public static class BtLocatorSettings {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorSettings(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorSettings(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/settings");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorSettings(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/settings");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettings setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettings(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties put(Properties input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }
    }

    public static class BtLocatorSettingsName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorSettingsName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorSettingsName(Client client, URI baseUri, String btlocator, String name) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/settings/{name}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("name", name);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorSettingsName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/settings/{name}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSettingsName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public <T> String putAsTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorSnapshotDependencies {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorSnapshotDependencies(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorSnapshotDependencies(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/snapshot-dependencies");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorSnapshotDependencies(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/snapshot-dependencies");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependencies setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependencies(_client, copyUriBuilder, copyMap);
      }

      public PropEntitiesSnapshotDep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesSnapshotDep.class);
      }

      /**
       * Replaces snapshot dependency with those sent in request.
       */
      public PropEntitiesSnapshotDep put(PropEntitiesSnapshotDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependencies"), PropEntitiesSnapshotDep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesSnapshotDep.class);
      }
      /**
       * Replaces snapshot dependency with those sent in request.
       */
      /**
       * Replaces snapshot dependency with those sent in request.
       */
      /**
       * Creates new snapshot dependency. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new dependency cannot be created (e.g. another dependency on the specified
       * build configuration already exists).
       */
      public PropEntitySnapshotDep post(PropEntitySnapshotDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitySnapshotDep.class);
      }
    }

    public static class BtLocatorSnapshotDependenciesSnapshotDepLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorSnapshotDependenciesSnapshotDepLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorSnapshotDependenciesSnapshotDepLocator(Client client, URI baseUri, String btlocator, String snapshotdeplocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("snapshotDepLocator", snapshotdeplocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorSnapshotDependenciesSnapshotDepLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get snapshotDepLocator
       */
      public String getSnapshotdeplocator() {
        return ((String) _templateAndMatrixParameterValues.get("snapshotDepLocator"));
      }

      /**
       * Duplicate state and set snapshotDepLocator
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator setSnapshotdeplocator(String snapshotdeplocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("snapshotDepLocator", snapshotdeplocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, copyUriBuilder, copyMap);
      }

      public PropEntitySnapshotDep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitySnapshotDep.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntitySnapshotDep put(PropEntitySnapshotDep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitySnapshotDep.class);
      }
    }

    public static class BtLocatorSteps {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorSteps(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorSteps(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/steps");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorSteps(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSteps setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorSteps(_client, copyUriBuilder, copyMap);
      }

      public PropEntityStep post(PropEntityStep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityStep.class);
      }

      public PropEntitiesStep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesStep.class);
      }

      public PropEntitiesStep put(PropEntitiesStep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "steps"), PropEntitiesStep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesStep.class);
      }
    }

    public static class BtLocatorStepsStepId {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorStepsStepId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorStepsStepId(Client client, URI baseUri, String btlocator, String stepid) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/steps/{stepId}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("stepId", stepid);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorStepsStepId(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get stepId
       */
      public String getStepid() {
        return ((String) _templateAndMatrixParameterValues.get("stepId"));
      }

      /**
       * Duplicate state and set stepId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId setStepid(String stepid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("stepId", stepid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepId(_client, copyUriBuilder, copyMap);
      }

      public PropEntityStep get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityStep.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntityStep put(PropEntityStep input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityStep.class);
      }
    }

    public static class BtLocatorStepsStepIdFieldName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorStepsStepIdFieldName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorStepsStepIdFieldName(Client client, URI baseUri, String btlocator, String stepid, String fieldname) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/steps/{stepId}/{fieldName}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("stepId", stepid);
        _templateAndMatrixParameterValues.put("fieldName", fieldname);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorStepsStepIdFieldName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get stepId
       */
      public String getStepid() {
        return ((String) _templateAndMatrixParameterValues.get("stepId"));
      }

      /**
       * Duplicate state and set stepId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName setStepid(String stepid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("stepId", stepid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get fieldName
       */
      public String getFieldname() {
        return ((String) _templateAndMatrixParameterValues.get("fieldName"));
      }

      /**
       * Duplicate state and set fieldName
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName setFieldname(String fieldname) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("fieldName", fieldname);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorStepsStepIdParameters {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorStepsStepIdParameters(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorStepsStepIdParameters(Client client, URI baseUri, String btlocator, String stepid) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/steps/{stepId}/parameters");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("stepId", stepid);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorStepsStepIdParameters(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get stepId
       */
      public String getStepid() {
        return ((String) _templateAndMatrixParameterValues.get("stepId"));
      }

      /**
       * Duplicate state and set stepId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters setStepid(String stepid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("stepId", stepid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParameters(_client, copyUriBuilder, copyMap);
      }

      public Properties get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties put(Properties input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }
    }

    public static class BtLocatorStepsStepIdParametersParameterName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorStepsStepIdParametersParameterName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorStepsStepIdParametersParameterName(Client client, URI baseUri, String btlocator, String stepid, String parametername) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/steps/{stepId}/parameters/{parameterName}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("stepId", stepid);
        _templateAndMatrixParameterValues.put("parameterName", parametername);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorStepsStepIdParametersParameterName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get stepId
       */
      public String getStepid() {
        return ((String) _templateAndMatrixParameterValues.get("stepId"));
      }

      /**
       * Duplicate state and set stepId
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName setStepid(String stepid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("stepId", stepid);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get parameterName
       */
      public String getParametername() {
        return ((String) _templateAndMatrixParameterValues.get("parameterName"));
      }

      /**
       * Duplicate state and set parameterName
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName setParametername(String parametername) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("parameterName", parametername);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorTemplate {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorTemplate(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorTemplate(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/template");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorTemplate(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/template");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTemplate setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTemplate(_client, copyUriBuilder, copyMap);
      }

      public BuildType get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      public BuildType get(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      public <T> T putTextPlain(Object input, Class<T> returnType) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      public <T> T putTextPlain(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }

    public static class BtLocatorTriggers {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorTriggers(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorTriggers(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/triggers");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorTriggers(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggers setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggers(_client, copyUriBuilder, copyMap);
      }

      public PropEntitiesTrigger get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesTrigger.class);
      }

      /**
       * Creates new trigger. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new trigger cannot be created (e.g. only single trigger of the type is allowed
       * for a build configuration).
       */
      public PropEntityTrigger post(PropEntityTrigger input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityTrigger.class);
      }

      /**
       * Replaces trigger with those sent inthe request.
       */
      public PropEntitiesTrigger put(PropEntitiesTrigger input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "triggers"), PropEntitiesTrigger.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesTrigger.class);
      }
    }

    public static class BtLocatorTriggersTriggerLocator {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorTriggersTriggerLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorTriggersTriggerLocator(Client client, URI baseUri, String btlocator, String triggerlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/triggers/{triggerLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("triggerLocator", triggerlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorTriggersTriggerLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get triggerLocator
       */
      public String getTriggerlocator() {
        return ((String) _templateAndMatrixParameterValues.get("triggerLocator"));
      }

      /**
       * Duplicate state and set triggerLocator
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator setTriggerlocator(String triggerlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("triggerLocator", triggerlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocator(_client, copyUriBuilder, copyMap);
      }

      public PropEntityTrigger get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityTrigger.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }

      public PropEntityTrigger put(PropEntityTrigger input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityTrigger.class);
      }
    }

    public static class BtLocatorTriggersTriggerLocatorFieldName {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorTriggersTriggerLocatorFieldName(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorTriggersTriggerLocatorFieldName(Client client, URI baseUri, String btlocator, String triggerlocator, String fieldname) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/triggers/{triggerLocator}/{fieldName}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("triggerLocator", triggerlocator);
        _templateAndMatrixParameterValues.put("fieldName", fieldname);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorTriggersTriggerLocatorFieldName(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get triggerLocator
       */
      public String getTriggerlocator() {
        return ((String) _templateAndMatrixParameterValues.get("triggerLocator"));
      }

      /**
       * Duplicate state and set triggerLocator
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName setTriggerlocator(String triggerlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("triggerLocator", triggerlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get fieldName
       */
      public String getFieldname() {
        return ((String) _templateAndMatrixParameterValues.get("fieldName"));
      }

      /**
       * Duplicate state and set fieldName
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName setFieldname(String fieldname) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("fieldName", fieldname);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorVcsFilesLatestChildrenpath {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsFilesLatestChildrenpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsFilesLatestChildrenpath(Client client, URI baseUri, String btlocator, String path) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs/files/latest/children{path:(/.*)?}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("path", path);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsFilesLatestChildrenpath(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/children{path:(/.*)?}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Lists files in VCS
       * Experimental support only
       */
      public Files get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      /**
       * Lists files in VCS
       * Experimental support only
       */
      public Files get(Boolean resolveparameters) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Files.class);
      }
    }

    public static class BtLocatorVcsFilesLatestContentpath {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsFilesLatestContentpath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsFilesLatestContentpath(Client client, URI baseUri, String btlocator, String path) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs/files/latest/content{path:(/.*)?}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("path", path);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsFilesLatestContentpath(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/content{path:(/.*)?}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestContentpath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Class<T> returnType) {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Boolean resolveparameters, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);

        WebTarget resource = getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue(returnType, response);
      }
    }

    public static class BtLocatorVcsFilesLatestMetadatapath {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsFilesLatestMetadatapath(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsFilesLatestMetadatapath(Client client, URI baseUri, String btlocator, String path) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("path", path);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsFilesLatestMetadatapath(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Gets VCS file details
       * Experimental support only
       */
      public File get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      /**
       * Gets VCS file details
       * Experimental support only
       */
      public File get(Boolean resolveparameters) {
        UriBuilder localUriBuilder = _uriBuilder.clone();

        localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);

        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(File.class);
      }
    }

    public static class BtLocatorVcsLabeling {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsLabeling(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsLabeling(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcsLabeling");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsLabeling(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcsLabeling");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsLabeling setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsLabeling(_client, copyUriBuilder, copyMap);
      }

      /**
       * Gets VCS labeling settings
       * Experimental support only
       */
      public VcsLabelingOptions get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsLabelingOptions.class);
      }
      /**
       * Gets VCS labeling settings
       * Experimental support only
       */
      /**
       * Gets VCS labeling settings
       * Experimental support only
       */
      /**
       * Sets VCS labeling settings
       * Experimental support only
       */
      public VcsLabelingOptions put(VcsLabelingOptions input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcsLabeling"), VcsLabelingOptions.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsLabelingOptions.class);
      }
      /**
       * Sets VCS labeling settings
       * Experimental support only
       */
      /**
       * Sets VCS labeling settings
       * Experimental support only
       */
    }

    public static class BtLocatorVcsRootEntries {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsRootEntries(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsRootEntries(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs-root-entries");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsRootEntries(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntries setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntries(_client, copyUriBuilder, copyMap);
      }

      public VcsRootEntries get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntries.class);
      }

      public VcsRootEntries put(VcsRootEntries input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entries"), VcsRootEntries.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntries.class);
      }

      public VcsRootEntry post(VcsRootEntry input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }
    }

    public static class BtLocatorVcsRootEntriesId {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsRootEntriesId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsRootEntriesId(Client client, URI baseUri, String btlocator, String id) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs-root-entries/{id}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("id", id);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsRootEntriesId(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get id
       */
      public String getId() {
        return ((String) _templateAndMatrixParameterValues.get("id"));
      }

      /**
       * Duplicate state and set id
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId setId(String id) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("id", id);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesId(_client, copyUriBuilder, copyMap);
      }

      public VcsRootEntry get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }

      public VcsRootEntry put(VcsRootEntry input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }

      public Response delete() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return TeamcityJetbrainsCom.delete(resource);
      }
    }

    public static class BtLocatorVcsRootEntriesIdCheckoutRules {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsRootEntriesIdCheckoutRules(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsRootEntriesIdCheckoutRules(Client client, URI baseUri, String btlocator, String id) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs-root-entries/{id}/checkout-rules");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("id", id);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsRootEntriesIdCheckoutRules(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}/checkout-rules");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules(_client, copyUriBuilder, copyMap);
      }

      /**
       * Get id
       */
      public String getId() {
        return ((String) _templateAndMatrixParameterValues.get("id"));
      }

      /**
       * Duplicate state and set id
       */
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules setId(String id) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("id", id);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootEntriesIdCheckoutRules(_client, copyUriBuilder, copyMap);
      }

      public String get() {
        WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
        return getAsString(resource);
      }

      public String putTextPlain(Object input) {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
        Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(String.class)) {
          throwExceptionIfWrongStatus(response);
        }
        return getStringValue(response);
      }
    }

    public static class BtLocatorVcsRootInstances {
      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private BtLocatorVcsRootInstances(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public BtLocatorVcsRootInstances(Client client, URI baseUri, String btlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{btLocator}/vcs-root-instances");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public BtLocatorVcsRootInstances(Client client, URI uri) {
        _client = client;
        StringBuilder template;
        template = getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-instances");
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootInstances setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestBuildTypes.BtLocatorVcsRootInstances(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public VcsRootInstances get() {
        javax.ws.rs.client.Invocation.Builder resourceBuilder = getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
        Response response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootInstances.class);
      }
    }
  }

  public static Response delete(WebTarget resource) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
    Response response = resourceBuilder.build("DELETE").invoke();
    return response;
  }

  public static <T> T getReturnValue(Class<T> returnType, Response response) {
    if (!Response.class.isAssignableFrom(returnType)) {
      return response.readEntity(returnType);
    } else {
      return returnType.cast(response);
    }
  }

  public static String getStringValue(Response response) {
    return response.readEntity(String.class);
  }

  public static String getAsString(WebTarget resource) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
    Response response = resourceBuilder.build(GET).invoke();
    throwExceptionIfWrongStatus(response);
    return getStringValue(response);
  }

  public static void throwExceptionIfWrongStatus(Response response) {
    if (response.getStatus() >= 400) {
      throw new TeamcityJetbrainsCom.WebApplicationExceptionMessage(response);
    }
  }

  /**
   * Workaround for JAX_RS_SPEC-312
   */
  private static class WebApplicationExceptionMessage
      extends WebApplicationException {
    private WebApplicationExceptionMessage(Response response) {
      super(response);
    }

    /**
     * Workaround for JAX_RS_SPEC-312
     */
    public String getMessage() {
      Response response = getResponse();
      Response.Status status = Response.Status.fromStatusCode(response.getStatus());
      if (status != null) {
        return (response.getStatus() + (" " + status.getReasonPhrase()));
      } else {
        return Integer.toString(response.getStatus());
      }
    }

    public String toString() {
      String s = "javax.ws.rs.WebApplicationException";
      String message = getLocalizedMessage();
      return (s + (": " + message));
    }
  }
}
