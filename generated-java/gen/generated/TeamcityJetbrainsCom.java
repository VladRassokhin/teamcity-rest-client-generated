package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
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

  public static TeamcityJetbrainsCom.AppRestVcsRoots appRestVcsRoots(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestVcsRoots(client, baseURI);
  }

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

    UriBuilder localUriBuilder = builder.clone();
    return client.target(localUriBuilder.buildFromMap(map));
  }

  public static TeamcityJetbrainsCom.AppRestVcsRoots appRestVcsRoots() {
    return appRestVcsRoots(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestBuilds appRestBuilds(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestBuilds(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestBuilds appRestBuilds() {
    return appRestBuilds(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestServer appRestServer(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestServer(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestServer appRestServer() {
    return appRestServer(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestUserGroups appRestUserGroups(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestUserGroups(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestUserGroups appRestUserGroups() {
    return appRestUserGroups(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestProjects appRestProjects(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestProjects(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestProjects appRestProjects() {
    return appRestProjects(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestUsers appRestUsers(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestUsers(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestUsers appRestUsers() {
    return appRestUsers(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestTestOccurrences appRestTestOccurrences(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestTestOccurrences(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestTestOccurrences appRestTestOccurrences() {
    return appRestTestOccurrences(createClient(), BASE_URI);
  }

  public static TeamcityJetbrainsCom.AppRestChanges appRestChanges(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestChanges(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestChanges appRestChanges() {
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


  public static TeamcityJetbrainsCom.AppRestProblems appRestProblems(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestProblems(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestProblems appRestProblems() {
    return appRestProblems(createClient(), BASE_URI);
  }


  public static TeamcityJetbrainsCom.AppRest appRest(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRest(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRest appRest() {
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
  public static TeamcityJetbrainsCom.AppRestInvestigations appRestInvestigations(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestInvestigations(client, baseURI);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public static TeamcityJetbrainsCom.AppRestInvestigations appRestInvestigations() {
    return appRestInvestigations(createClient(), BASE_URI);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */

  public static TeamcityJetbrainsCom.AppRestVcsRootInstances appRestVcsRootInstances(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestVcsRootInstances(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestVcsRootInstances appRestVcsRootInstances() {
    return appRestVcsRootInstances(createClient(), BASE_URI);
  }


  public static TeamcityJetbrainsCom.AppRestTests appRestTests(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestTests(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestTests appRestTests() {
    return appRestTests(createClient(), BASE_URI);
  }


  public static TeamcityJetbrainsCom.AppRestProblemOccurrences appRestProblemOccurrences(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestProblemOccurrences(client, baseURI);
  }

  public static TeamcityJetbrainsCom.AppRestProblemOccurrences appRestProblemOccurrences() {
    return appRestProblemOccurrences(createClient(), BASE_URI);
  }


  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public static TeamcityJetbrainsCom.AppRestDebug appRestDebug(Client client, URI baseURI) {
    return new TeamcityJetbrainsCom.AppRestDebug(client, baseURI);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public static TeamcityJetbrainsCom.AppRestDebug appRestDebug() {
    return appRestDebug(createClient(), BASE_URI);
  }

  public static class AppRest {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRest(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRest(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public String getAsTextPlain() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return getAsString(resource);
    }

    public TeamcityJetbrainsCom.AppRest.Version version() {
      return new TeamcityJetbrainsCom.AppRest.Version(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public TeamcityJetbrainsCom.AppRest.ApiVersion apiVersion() {
      return new TeamcityJetbrainsCom.AppRest.ApiVersion(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public TeamcityJetbrainsCom.AppRest.Info info() {
      return new TeamcityJetbrainsCom.AppRest.Info(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField projectLocatorBtLocatorBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field) {
      return new TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator, field);
    }

    public static class ApiVersion {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private ApiVersion(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public ApiVersion(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/apiVersion");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class Info {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private Info(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public Info(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/info");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      public PluginInfo getAsPluginInfo() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PluginInfo.class);
      }

    }

    public static class ProjectLocatorBtLocatorBuildLocatorField {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private ProjectLocatorBtLocatorBuildLocatorField(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public ProjectLocatorBtLocatorBuildLocatorField(Client client, URI baseUri, String projectlocator, String btlocator, String buildlocator, String field) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{projectLocator}/{btLocator}/{buildLocator}/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("projectLocator", projectlocator);
        _templateAndMatrixParameterValues.put("btLocator", btlocator);
        _templateAndMatrixParameterValues.put("buildLocator", buildlocator);
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public ProjectLocatorBtLocatorBuildLocatorField(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/{projectLocator}/{btLocator}/{buildLocator}/{field}");
        } else {
          template.append("app/rest/{projectLocator}/{btLocator}/{buildLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRest.ProjectLocatorBtLocatorBuildLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class Version {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private Version(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public Version(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/version");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

  }

  public static <T> T getReturnValue(Class<T> returnType, Response response) {
    if (!Response.class.isAssignableFrom(returnType)) {
      return response.readEntity(returnType);
    } else {
      return returnType.cast(response);
    }
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

    public AgentPools getAsAgentPools() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentPools.class);
    }


    public AgentPool postJsonAsAgentPool(AgentPool input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agentPools/{agentPoolLocator}");
        } else {
          template.append("app/rest/agentPools/{agentPoolLocator}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public AgentPool getAsAgentPool() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public AgentPool getAsAgentPool(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agentPools/{agentPoolLocator}/agents");
        } else {
          template.append("app/rest/agentPools/{agentPoolLocator}/agents");
        }
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

      public AgentsRef getAsAgentsRef() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }

      public AgentsRef getAsAgentsRef(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }


      /**
       * Moves the agent posted to the pool
       */
      public Agent postJsonAsAgent(Agent input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent"), Agent.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agentPools/{agentPoolLocator}/projects");
        } else {
          template.append("app/rest/agentPools/{agentPoolLocator}/projects");
        }
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
      public Project postJsonAsProject(Project input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "project"), Project.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Projects getAsProjects() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Projects.class);
      }

      public Projects getAsProjects(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Projects.class);
      }


      /**
       * Associates the posted set of projects with the pool which replaces earlier associations on
       * this pool
       */
      public Projects putJsonAsProjects(Projects input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "projects"), Projects.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}");
        } else {
          template.append("app/rest/agentPools/{agentPoolLocator}/projects/{projectLocator}");
        }
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

      public Project getAsProject() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Project getAsProject(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }


      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


    }

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
    public AgentsRef getAsAgentsRef() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(AgentsRef.class);
    }

    /**
     * Returns list of agents
     */
    public AgentsRef getAsAgentsRef(Boolean includedisconnected, Boolean includeunauthorized, String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (includedisconnected == null) {
      }
      if (includedisconnected != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeDisconnected", includedisconnected);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeDisconnected", null);
      }
      if (includeunauthorized == null) {
      }
      if (includeunauthorized != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeUnauthorized", includeunauthorized);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeUnauthorized", null);
      }
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agents/{agentLocator}");
        } else {
          template.append("app/rest/agents/{agentLocator}");
        }
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

      public Agent getAsAgent() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Agent.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agents/{agentLocator}/{field}");
        } else {
          template.append("app/rest/agents/{agentLocator}/{field}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/agents/{agentLocator}/pool");
        } else {
          template.append("app/rest/agents/{agentLocator}/pool");
        }
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

      public AgentPool getAsAgentPool() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public AgentPool getAsAgentPool(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }


      public AgentPool putJsonAsAgentPool(AgentPool input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
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

    public Builds putJsonAsBuilds(Builds input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public Builds putJsonAsBuilds(Builds input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "builds"), Builds.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    public Build postJsonAsBuild(Build input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "build"), Build.class, input), "application/json")).invoke();
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
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      return TeamcityJetbrainsCom.delete(resource);
    }

    /**
     * Serves build queue.
     */
    public Builds getAsBuilds() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    /**
     * Serves build queue.
     */
    public Builds getAsBuilds(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildQueue/{buildLocator}/example/buildCancelRequest");
        } else {
          template.append("app/rest/buildQueue/{buildLocator}/example/buildCancelRequest");
        }
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

      public BuildCancelRequest getAsBuildCancelRequest() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildQueue/{buildLocator}/{field}");
        } else {
          template.append("app/rest/buildQueue/{buildLocator}/{field}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildQueue/{queuedBuildLocator}");
        } else {
          template.append("app/rest/buildQueue/{queuedBuildLocator}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public Build postJsonAsBuild(BuildCancelRequest input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build getAsBuild() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build getAsBuild(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents");
        } else {
          template.append("app/rest/buildQueue/{queuedBuildLocator}/compatibleAgents");
        }
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

      public AgentsRef getAsAgentsRef() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentsRef.class);
      }

      public AgentsRef getAsAgentsRef(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
    public Builds getAsBuilds() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Builds.class);
    }

    /**
     * Serves builds matching supplied condition.
     */
    public Builds getAsBuilds(String buildtype, String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (buildtype == null) {
      }
      if (buildtype != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", null);
      }
      if (status == null) {
      }
      if (status != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("status", null);
      }
      if (triggeredbyuser == null) {
      }
      if (triggeredbyuser != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", null);
      }
      if (includepersonal == null) {
      }
      if (includepersonal != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", null);
      }
      if (includecanceled == null) {
      }
      if (includecanceled != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", null);
      }
      if (onlypinned == null) {
      }
      if (onlypinned != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", null);
      }
      if (tag == null) {
      }
      if (tag != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("tag", null);
      }
      if (agentname == null) {
      }
      if (agentname != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("agentName", null);
      }
      if (sincebuild == null) {
      }
      if (sincebuild != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", null);
      }
      if (sincedate == null) {
      }
      if (sincedate != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", null);
      }
      if (start == null) {
      }
      if (start != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
      }
      if (count == null) {
      }
      if (count != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
      }
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}");
        } else {
          template.append("app/rest/builds/{buildLocator}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public Build postJsonAsBuild(BuildCancelRequest input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build postJsonAsBuild(BuildCancelRequest input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildCancelRequest"), BuildCancelRequest.class, input), "application/json")).invoke();
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
      public Build getAsBuild() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public Build getAsBuild(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/artifacts");
        } else {
          template.append("app/rest/builds/{buildLocator}/artifacts");
        }
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
      public Files getAsFiles() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/artifacts/children{path:(/.*)?}");
        } else {
          template.append("app/rest/builds/{buildLocator}/artifacts/children{path:(/.*)?}");
        }
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

      public Files getAsFiles() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Files.class);
      }

      public Files getAsFiles(Boolean resolveparameters, String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/artifacts/content{path:(/.*)?}");
        } else {
          template.append("app/rest/builds/{buildLocator}/artifacts/content{path:(/.*)?}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T getAs(Boolean resolveparameters, Boolean logbuildusage, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        if (logbuildusage == null) {
        }
        if (logbuildusage != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("logBuildUsage", logbuildusage);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("logBuildUsage", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/artifacts/files{path:(/.*)?}");
        } else {
          template.append("app/rest/builds/{buildLocator}/artifacts/files{path:(/.*)?}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/artifacts/metadata{path:(/.*)?}");
        } else {
          template.append("app/rest/builds/{buildLocator}/artifacts/metadata{path:(/.*)?}");
        }
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

      public File getAsFile() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(File.class);
      }

      public File getAsFile(Boolean resolveparameters, String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/canceledInfo");
        } else {
          template.append("app/rest/builds/{buildLocator}/canceledInfo");
        }
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

      public Comment getAsComment() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Comment.class);
      }

      public Comment getAsComment(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/comment");
        } else {
          template.append("app/rest/builds/{buildLocator}/comment");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/example/buildCancelRequest");
        } else {
          template.append("app/rest/builds/{buildLocator}/example/buildCancelRequest");
        }
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

      public BuildCancelRequest getAsBuildCancelRequest() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/{field}");
        } else {
          template.append("app/rest/builds/{buildLocator}/{field}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/pin/");
        } else {
          template.append("app/rest/builds/{buildLocator}/pin/");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Fetches current build pinned status.
       */
      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      /**
       * Unpins a build
       */
      public <T> T deleteTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
        Response response;
        response = resourceBuilder.build("DELETE", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/problemOccurrences");
        } else {
          template.append("app/rest/builds/{buildLocator}/problemOccurrences");
        }
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

      public ProblemOccurrences getAsProblemOccurrences() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(ProblemOccurrences.class);
      }

      public ProblemOccurrences getAsProblemOccurrences(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/related-issues");
        } else {
          template.append("app/rest/builds/{buildLocator}/related-issues");
        }
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

      public IssueUsages getAsIssueUsages() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(IssueUsages.class);
      }

      public IssueUsages getAsIssueUsages(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/relatedIssues");
        } else {
          template.append("app/rest/builds/{buildLocator}/relatedIssues");
        }
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

      public IssueUsages getAsIssueUsages() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(IssueUsages.class);
      }

      public IssueUsages getAsIssueUsages(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/resulting-properties/");
        } else {
          template.append("app/rest/builds/{buildLocator}/resulting-properties/");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/resulting-properties/{propertyName}");
        } else {
          template.append("app/rest/builds/{buildLocator}/resulting-properties/{propertyName}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/sources/files/{fileName:.+}");
        } else {
          template.append("app/rest/builds/{buildLocator}/sources/files/{fileName:.+}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/octet-stream");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/statistics/");
        } else {
          template.append("app/rest/builds/{buildLocator}/statistics/");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/statistics/{name}");
        } else {
          template.append("app/rest/builds/{buildLocator}/statistics/{name}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/statusIcon");
        } else {
          template.append("app/rest/builds/{buildLocator}/statusIcon");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/tags/");
        } else {
          template.append("app/rest/builds/{buildLocator}/tags/");
        }
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
      public <T> T postTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Replaces build's tags.
       */
      public Tags putJsonAsTags(Tags input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Tags.class);
      }


      /**
       * Adds a set of tags to a build
       */
      public Response postJson(Tags input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "tags"), Tags.class, input), "application/json")).invoke();
        return response;
      }

      public Tags getAsTags() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/builds/{buildLocator}/testOccurrences");
        } else {
          template.append("app/rest/builds/{buildLocator}/testOccurrences");
        }
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

      public TestOccurrences getAsTestOccurrences() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(TestOccurrences.class);
      }

      public TestOccurrences getAsTestOccurrences(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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

    public <T> T postJson(Object input, Class<T> returnType) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public BuildType postJsonAsBuildType(BuildType input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildType"), BuildType.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    /**
     * Lists build types registered on the server. Build templates are not included by default
     */
    public BuildTypes getAsBuildTypes() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildTypes.class);
    }

    /**
     * Lists build types registered on the server. Build templates are not included by default
     */
    public BuildTypes getAsBuildTypes(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}");
        }
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
      public BuildType getAsBuildType() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public BuildType getAsBuildType(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/agent-requirements");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/agent-requirements");
        }
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

      public PropEntitiesAgentRequirement getAsPropEntitiesAgentRequirement() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesAgentRequirement.class);
      }

      /**
       * Creates new agent requirement. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new requirement cannot be created (e.g. another requirement is present for the
       * parameter).
       */
      public PropEntityAgentRequirement postJsonAsPropEntityAgentRequirement(PropEntityAgentRequirement input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityAgentRequirement.class);
      }

      /**
       * Replaces agent requirements with those sent in the request.
       */
      public PropEntitiesAgentRequirement putJsonAsPropEntitiesAgentRequirement(PropEntitiesAgentRequirement input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirements"), PropEntitiesAgentRequirement.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}");
        }
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

      public PropEntityAgentRequirement getAsPropEntityAgentRequirement() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityAgentRequirement.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntityAgentRequirement putJsonAsPropEntityAgentRequirement(PropEntityAgentRequirement input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/artifact-dependencies");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/artifact-dependencies");
        }
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

      public PropEntitiesArtifactDep getAsPropEntitiesArtifactDep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesArtifactDep.class);
      }

      /**
       * Replaces the dependencies to those sent in the request.
       */
      public PropEntitiesArtifactDep putJsonAsPropEntitiesArtifactDep(PropEntitiesArtifactDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependencies"), PropEntitiesArtifactDep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesArtifactDep.class);
      }

      /**
       * Replaces the dependencies to those sent in the request.
       */

      /**
       * Replaces the dependencies to those sent in the request.
       */


      public PropEntityArtifactDep postAsPropEntityArtifactDep(PropEntityArtifactDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}");
        }
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

      public PropEntityArtifactDep getAsPropEntityArtifactDep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityArtifactDep.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntityArtifactDep putAsPropEntityArtifactDep(PropEntityArtifactDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/branches");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/branches");
        }
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
      public Branches getAsBranches() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public Branches getAsBranches(String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/builds");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/builds");
        }
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
      public Builds getAsBuilds() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Builds.class);
      }

      /**
       * Serves builds matching supplied condition.
       */
      public Builds getAsBuilds(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (status == null) {
        }
        if (status != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", null);
        }
        if (triggeredbyuser == null) {
        }
        if (triggeredbyuser != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", null);
        }
        if (includepersonal == null) {
        }
        if (includepersonal != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", null);
        }
        if (includecanceled == null) {
        }
        if (includecanceled != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", null);
        }
        if (onlypinned == null) {
        }
        if (onlypinned != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", null);
        }
        if (tag == null) {
        }
        if (tag != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", null);
        }
        if (agentname == null) {
        }
        if (agentname != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", null);
        }
        if (sincebuild == null) {
        }
        if (sincebuild != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", null);
        }
        if (sincedate == null) {
        }
        if (sincedate != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", null);
        }
        if (start == null) {
        }
        if (start != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/builds/{buildLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/builds/{buildLocator}");
        }
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

      public Build getAsBuild() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build getAsBuild(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/buildTags");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/buildTags");
        }
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

      public Tags getAsTags() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/example/newBuildTypeDescription");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/example/newBuildTypeDescription");
        }
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
      public NewBuildTypeDescription getAsNewBuildTypeDescription() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/features");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/features");
        }
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

      public PropEntityFeature postAsPropEntityFeature(PropEntityFeature input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityFeature.class);
      }

      public PropEntitiesFeature getAsPropEntitiesFeature() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesFeature.class);
      }

      public PropEntitiesFeature putJsonAsPropEntitiesFeature(PropEntitiesFeature input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "features"), PropEntitiesFeature.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/features/{featureId}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/features/{featureId}");
        }
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
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntityFeature putAsPropEntityFeature(PropEntityFeature input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityFeature.class);
      }

      public PropEntityFeature getAsPropEntityFeature() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/features/{featureId}/{name}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/features/{featureId}/{name}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public <T> T putAsTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/{field}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/{field}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/investigations");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/investigations");
        }
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

      public Investigations getAsInvestigations() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Investigations.class);
      }

      public Investigations getAsInvestigations(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/newBuildTypeDescription");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/newBuildTypeDescription");
        }
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
      public NewBuildTypeDescription getAsNewBuildTypeDescription() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/parameters");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/parameters");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties getAsProperties(String locator, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }

      public Property postJsonAsProperty(Property input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public Property postJsonAsProperty(Property input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/parameters/{name}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/parameters/{name}");
        }
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


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public Property getAsProperty() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/settings");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/settings");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/settings/{name}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/settings/{name}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public <T> T putAsTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/snapshot-dependencies");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/snapshot-dependencies");
        }
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

      public PropEntitiesSnapshotDep getAsPropEntitiesSnapshotDep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesSnapshotDep.class);
      }

      /**
       * Replaces snapshot dependency with those sent in request.
       */
      public PropEntitiesSnapshotDep putJsonAsPropEntitiesSnapshotDep(PropEntitiesSnapshotDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependencies"), PropEntitiesSnapshotDep.class, input), "application/json")).invoke();
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
      public PropEntitySnapshotDep postJsonAsPropEntitySnapshotDep(PropEntitySnapshotDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}");
        }
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

      public PropEntitySnapshotDep getAsPropEntitySnapshotDep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitySnapshotDep.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntitySnapshotDep putJsonAsPropEntitySnapshotDep(PropEntitySnapshotDep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/steps");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/steps");
        }
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

      public PropEntityStep postJsonAsPropEntityStep(PropEntityStep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityStep.class);
      }

      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public PropEntitiesStep getAsPropEntitiesStep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesStep.class);
      }

      public PropEntitiesStep putJsonAsPropEntitiesStep(PropEntitiesStep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "steps"), PropEntitiesStep.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/steps/{stepId}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/steps/{stepId}");
        }
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

      public PropEntityStep getAsPropEntityStep() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityStep.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntityStep putJsonAsPropEntityStep(PropEntityStep input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters");
        }
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

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/template");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/template");
        }
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

      public BuildType getAsBuildType() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      public BuildType getAsBuildType(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }


      public <T> T putTextPlainAsJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T putTextPlainAsJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T putTextPlainAsJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T putTextPlainAsJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/triggers");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/triggers");
        }
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

      public PropEntitiesTrigger getAsPropEntitiesTrigger() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesTrigger.class);
      }

      /**
       * Creates new trigger. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new trigger cannot be created (e.g. only single trigger of the type is allowed
       * for a build configuration).
       */
      public PropEntityTrigger postJsonAsPropEntityTrigger(PropEntityTrigger input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityTrigger.class);
      }

      /**
       * Creates new trigger. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new trigger cannot be created (e.g. only single trigger of the type is allowed
       * for a build configuration).
       */
      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Creates new trigger. 'id' attribute is ignored in the submitted descriptor.
       * Reports error if new trigger cannot be created (e.g. only single trigger of the type is allowed
       * for a build configuration).
       */
      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Replaces trigger with those sent inthe request.
       */
      public PropEntitiesTrigger putJsonAsPropEntitiesTrigger(PropEntitiesTrigger input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "triggers"), PropEntitiesTrigger.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntitiesTrigger.class);
      }

      /**
       * Replaces trigger with those sent inthe request.
       */

      /**
       * Replaces trigger with those sent inthe request.
       */


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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}");
        }
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

      public PropEntityTrigger getAsPropEntityTrigger() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PropEntityTrigger.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public PropEntityTrigger putJsonAsPropEntityTrigger(PropEntityTrigger input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs/files/latest/children{path:(/.*)?}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs/files/latest/children{path:(/.*)?}");
        }
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
      public Files getAsFiles() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public Files getAsFiles(Boolean resolveparameters) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Files.class);
      }

      /**
       * Lists files in VCS
       * Experimental support only
       */
      public <T> T getAsJson(Boolean resolveparameters, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Lists files in VCS
       * Experimental support only
       */
      public <T> T getAsJson(Boolean resolveparameters, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs/files/latest/content{path:(/.*)?}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs/files/latest/content{path:(/.*)?}");
        }
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
      public <T> T getAs(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Boolean resolveparameters, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Boolean resolveparameters, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}");
        }
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
      public File getAsFile() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public File getAsFile(Boolean resolveparameters) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(File.class);
      }

      /**
       * Gets VCS file details
       * Experimental support only
       */
      public <T> T getAsJson(Boolean resolveparameters, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Gets VCS file details
       * Experimental support only
       */
      public <T> T getAsJson(Boolean resolveparameters, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (resolveparameters == null) {
        }
        if (resolveparameters != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcsLabeling");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcsLabeling");
        }
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
      public VcsLabelingOptions getAsVcsLabelingOptions() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
      public VcsLabelingOptions putJsonAsVcsLabelingOptions(VcsLabelingOptions input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcsLabeling"), VcsLabelingOptions.class, input), "application/json")).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs-root-entries");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs-root-entries");
        }
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

      public VcsRootEntries getAsVcsRootEntries() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntries.class);
      }

      public VcsRootEntries putJsonAsVcsRootEntries(VcsRootEntries input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entries"), VcsRootEntries.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntries.class);
      }


      public VcsRootEntry postJsonAsVcsRootEntry(VcsRootEntry input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }

      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}");
        }
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

      public VcsRootEntry getAsVcsRootEntry() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }

      public VcsRootEntry putJsonAsVcsRootEntry(VcsRootEntry input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootEntry.class);
      }


      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}/checkout-rules");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}/checkout-rules");
        }
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


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/buildTypes/{btLocator}/vcs-root-instances");
        } else {
          template.append("app/rest/buildTypes/{btLocator}/vcs-root-instances");
        }
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
      public VcsRootInstances getAsVcsRootInstances() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootInstances.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

  }

  public static class AppRestChanges {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestChanges(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestChanges(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/changes");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Lists changes by the specified locator
     */
    public Changes getAsChanges() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }

    /**
     * Lists changes by the specified locator
     */

    /**
     * Lists changes by the specified locator
     */

    /**
     * Lists changes by the specified locator
     */
    public Changes getAsChanges(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count, String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (project == null) {
      }
      if (project != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", project);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", null);
      }
      if (buildtype == null) {
      }
      if (buildtype != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", null);
      }
      if (build == null) {
      }
      if (build != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", build);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", null);
      }
      if (vcsroot == null) {
      }
      if (vcsroot != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", vcsroot);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", null);
      }
      if (sincechange == null) {
      }
      if (sincechange != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", sincechange);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", null);
      }
      if (start == null) {
      }
      if (start != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
      }
      if (count == null) {
      }
      if (count != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
      }
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Changes.class);
    }

    /**
     * Lists changes by the specified locator
     */
    public <T> T getAsJson(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count, String locator, String fields, GenericType<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (project == null) {
      }
      if (project != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", project);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", null);
      }
      if (buildtype == null) {
      }
      if (buildtype != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", null);
      }
      if (build == null) {
      }
      if (build != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", build);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", null);
      }
      if (vcsroot == null) {
      }
      if (vcsroot != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", vcsroot);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", null);
      }
      if (sincechange == null) {
      }
      if (sincechange != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", sincechange);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", null);
      }
      if (start == null) {
      }
      if (start != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
      }
      if (count == null) {
      }
      if (count != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
      }
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    /**
     * Lists changes by the specified locator
     */
    public <T> T getAsJson(String project, String buildtype, String build, String vcsroot, String sincechange, Long start, Integer count, String locator, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (project == null) {
      }
      if (project != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", project);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("project", null);
      }
      if (buildtype == null) {
      }
      if (buildtype != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", buildtype);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("buildType", null);
      }
      if (build == null) {
      }
      if (build != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", build);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("build", null);
      }
      if (vcsroot == null) {
      }
      if (vcsroot != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", vcsroot);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("vcsRoot", null);
      }
      if (sincechange == null) {
      }
      if (sincechange != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", sincechange);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("sinceChange", null);
      }
      if (start == null) {
      }
      if (start != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
      }
      if (count == null) {
      }
      if (count != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
      }
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField changeLocatorField(String changelocator, String field) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator, field);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentChanges changeLocatorParentChanges(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentChanges(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentRevisions changeLocatorParentRevisions(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentRevisions(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorVcsRoot changeLocatorVcsRoot(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorVcsRoot(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorAttributes changeLocatorAttributes(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorAttributes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorDuplicates changeLocatorDuplicates(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorDuplicates(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorIssues changeLocatorIssues(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorIssues(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorBuildTypes changeLocatorBuildTypes(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorBuildTypes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorFirstBuilds changeLocatorFirstBuilds(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorFirstBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public TeamcityJetbrainsCom.AppRestChanges.ChangeLocator changeLocator(String changelocator) {
      return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), changelocator);
    }

    public static class ChangeLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}");
        } else {
          template.append("app/rest/changes/{changeLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocator setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocator(_client, copyUriBuilder, copyMap);
      }

      public Change getAsChange() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Change.class);
      }

      public Change getAsChange(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Change.class);
      }


    }

    public static class ChangeLocatorAttributes {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/attributes");
        } else {
          template.append("app/rest/changes/{changeLocator}/attributes");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorAttributes setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorAttributes(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Entries getAsEntries() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Entries.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorBuildTypes {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/buildTypes");
        } else {
          template.append("app/rest/changes/{changeLocator}/buildTypes");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorBuildTypes setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorBuildTypes(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public BuildTypes getAsBuildTypes() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public BuildTypes getAsBuildTypes(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildTypes.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorDuplicates {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/duplicates");
        } else {
          template.append("app/rest/changes/{changeLocator}/duplicates");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorDuplicates setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorDuplicates(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Changes getAsChanges() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public Changes getAsChanges(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Changes.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorField {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/{field}");
        } else {
          template.append("app/rest/changes/{changeLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class ChangeLocatorFirstBuilds {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/firstBuilds");
        } else {
          template.append("app/rest/changes/{changeLocator}/firstBuilds");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorFirstBuilds setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorFirstBuilds(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Builds getAsBuilds() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public Builds getAsBuilds(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Builds.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorIssues {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/issues");
        } else {
          template.append("app/rest/changes/{changeLocator}/issues");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorIssues setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorIssues(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Issues getAsIssues() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Issues.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorParentChanges {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/parentChanges");
        } else {
          template.append("app/rest/changes/{changeLocator}/parentChanges");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentChanges setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentChanges(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Changes getAsChanges() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public Changes getAsChanges(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Changes.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorParentRevisions {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/parentRevisions");
        } else {
          template.append("app/rest/changes/{changeLocator}/parentRevisions");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentRevisions setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorParentRevisions(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public Items getAsItems() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Items.class);
      }

      /**
       * Experimental support only!
       */


      /**
       * Experimental support only!
       */


    }

    public static class ChangeLocatorVcsRoot {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/changes/{changeLocator}/vcsRoot");
        } else {
          template.append("app/rest/changes/{changeLocator}/vcsRoot");
        }
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
      public TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorVcsRoot setChangelocator(String changelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("changeLocator", changelocator);
        return new TeamcityJetbrainsCom.AppRestChanges.ChangeLocatorVcsRoot(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only!
       */
      public VcsRootInstanceRef getAsVcsRootInstanceRef() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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


  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public static class AppRestDebug {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestDebug(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestDebug(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/debug");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public TeamcityJetbrainsCom.AppRestDebug.DatabaseQueryQuery databaseQueryQuery(String query) {
      return new TeamcityJetbrainsCom.AppRestDebug.DatabaseQueryQuery(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), query);
    }

    public TeamcityJetbrainsCom.AppRestDebug.VcsCheckingForChangesQueue vcsCheckingForChangesQueue() {
      return new TeamcityJetbrainsCom.AppRestDebug.VcsCheckingForChangesQueue(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public TeamcityJetbrainsCom.AppRestDebug.DatabaseTables databaseTables() {
      return new TeamcityJetbrainsCom.AppRestDebug.DatabaseTables(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public static class DatabaseQueryQuery {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private DatabaseQueryQuery(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public DatabaseQueryQuery(Client client, URI baseUri, String query) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/database/query/{query}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("query", query);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public DatabaseQueryQuery(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/debug/database/query/{query}");
        } else {
          template.append("app/rest/debug/database/query/{query}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get query
       */
      public String getQuery() {
        return ((String) _templateAndMatrixParameterValues.get("query"));
      }

      /**
       * Duplicate state and set query
       */
      public TeamcityJetbrainsCom.AppRestDebug.DatabaseQueryQuery setQuery(String query) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("query", query);
        return new TeamcityJetbrainsCom.AppRestDebug.DatabaseQueryQuery(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAsTextPlainCharsetUTF8(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T getAsTextPlainCharsetUTF8(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T getAsTextPlainCharsetUTF8(String fielddelimiter, Integer count, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fielddelimiter == null) {
        }
        if (fielddelimiter != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fieldDelimiter", fielddelimiter);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fieldDelimiter", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T getAsTextPlainCharsetUTF8(String fielddelimiter, Integer count, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fielddelimiter == null) {
        }
        if (fielddelimiter != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fieldDelimiter", fielddelimiter);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fieldDelimiter", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class DatabaseTables {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private DatabaseTables(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public DatabaseTables(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/database/tables");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      public <T> T getAsTextPlainCharsetUTF8(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T getAsTextPlainCharsetUTF8(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain; charset=UTF-8");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class VcsCheckingForChangesQueue {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private VcsCheckingForChangesQueue(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public VcsCheckingForChangesQueue(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/vcsCheckingForChangesQueue");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      /**
       * Experimental use only!
       */
      public VcsRootInstances postAsVcsRootInstances() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootInstances.class);
      }

      /**
       * Experimental use only!
       */
      public <T> T postAsJson(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Experimental use only!
       */
      public <T> T postAsJson(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Experimental use only!
       */
      public VcsRootInstances postAsVcsRootInstances(String locator) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRootInstances.class);
      }

      /**
       * Experimental use only!
       */
      public <T> T postAsJson(String locator, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Experimental use only!
       */
      public <T> T postAsJson(String locator, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

  }


  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public static class AppRestInvestigations {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestInvestigations(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestInvestigations(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/investigations");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Investigations getAsInvestigations() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Investigations.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Investigations getAsInvestigations(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Investigations.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, GenericType<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public TeamcityJetbrainsCom.AppRestInvestigations.InvestigationLocator investigationLocator(String investigationlocator) {
      return new TeamcityJetbrainsCom.AppRestInvestigations.InvestigationLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), investigationlocator);
    }

    public static class InvestigationLocator {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private InvestigationLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public InvestigationLocator(Client client, URI baseUri, String investigationlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{investigationLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("investigationLocator", investigationlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public InvestigationLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/investigations/{investigationLocator}");
        } else {
          template.append("app/rest/investigations/{investigationLocator}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get investigationLocator
       */
      public String getInvestigationlocator() {
        return ((String) _templateAndMatrixParameterValues.get("investigationLocator"));
      }

      /**
       * Duplicate state and set investigationLocator
       */
      public TeamcityJetbrainsCom.AppRestInvestigations.InvestigationLocator setInvestigationlocator(String investigationlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("investigationLocator", investigationlocator);
        return new TeamcityJetbrainsCom.AppRestInvestigations.InvestigationLocator(_client, copyUriBuilder, copyMap);
      }

      public Investigation getAsInvestigation() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Investigation.class);
      }

      public Investigation getAsInvestigation(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Investigation.class);
      }


    }

  }

  public static class AppRestProblemOccurrences {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestProblemOccurrences(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestProblemOccurrences(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/problemOccurrences");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public ProblemOccurrences getAsProblemOccurrences() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrences.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public ProblemOccurrences getAsProblemOccurrences(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrences.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, GenericType<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public TeamcityJetbrainsCom.AppRestProblemOccurrences.ProblemLocator problemLocator(String problemlocator) {
      return new TeamcityJetbrainsCom.AppRestProblemOccurrences.ProblemLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), problemlocator);
    }

    public static class ProblemLocator {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private ProblemLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public ProblemLocator(Client client, URI baseUri, String problemlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{problemLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("problemLocator", problemlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public ProblemLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/problemOccurrences/{problemLocator}");
        } else {
          template.append("app/rest/problemOccurrences/{problemLocator}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get problemLocator
       */
      public String getProblemlocator() {
        return ((String) _templateAndMatrixParameterValues.get("problemLocator"));
      }

      /**
       * Duplicate state and set problemLocator
       */
      public TeamcityJetbrainsCom.AppRestProblemOccurrences.ProblemLocator setProblemlocator(String problemlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("problemLocator", problemlocator);
        return new TeamcityJetbrainsCom.AppRestProblemOccurrences.ProblemLocator(_client, copyUriBuilder, copyMap);
      }

      public ProblemOccurrence getAsProblemOccurrence() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(ProblemOccurrence.class);
      }

      public ProblemOccurrence getAsProblemOccurrence(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(ProblemOccurrence.class);
      }


    }

  }

  public static class AppRestProblems {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestProblems(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestProblems(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/problems");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Problems getAsProblems() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Problems.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Problems getAsProblems(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Problems.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, GenericType<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public <T> T getAsJson(String locator, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public TeamcityJetbrainsCom.AppRestProblems.ProblemLocator problemLocator(String problemlocator) {
      return new TeamcityJetbrainsCom.AppRestProblems.ProblemLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), problemlocator);
    }

    public static class ProblemLocator {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private ProblemLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public ProblemLocator(Client client, URI baseUri, String problemlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{problemLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("problemLocator", problemlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public ProblemLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/problems/{problemLocator}");
        } else {
          template.append("app/rest/problems/{problemLocator}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get problemLocator
       */
      public String getProblemlocator() {
        return ((String) _templateAndMatrixParameterValues.get("problemLocator"));
      }

      /**
       * Duplicate state and set problemLocator
       */
      public TeamcityJetbrainsCom.AppRestProblems.ProblemLocator setProblemlocator(String problemlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("problemLocator", problemlocator);
        return new TeamcityJetbrainsCom.AppRestProblems.ProblemLocator(_client, copyUriBuilder, copyMap);
      }

      public Problem getAsProblem() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Problem.class);
      }

      public Problem getAsProblem(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Problem.class);
      }


    }

  }

  public static class AppRestProjects {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestProjects(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestProjects(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/projects");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public Projects getAsProjects() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Projects.class);
    }


    public Projects getAsProjects(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Projects.class);
    }

    public <T> T getAsJson(String fields, GenericType<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    public <T> T getAsJson(String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public Project postJsonAsProject(NewProjectDescription input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newProjectDescription"), NewProjectDescription.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Project.class);
    }

    public <T> T postJson(Object input, GenericType<T> returnType) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }

    public <T> T postJson(Object input, Class<T> returnType) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public <T> T postTextPlainAsJson(Object input, GenericType<T> returnType) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(returnType);
    }


    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplates projectLocatorTemplates(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplates(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParameters projectLocatorParameters(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName projectLocatorParametersName(String projectlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, name);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField projectLocatorBuildTypesBtLocatorField(String projectlocator, String btlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField projectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(String projectlocator, String btlocator, String buildlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParentProject projectLocatorParentProject(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParentProject(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPools projectLocatorAgentPools(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPools(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator projectLocatorAgentPoolsAgentPoolLocator(String projectlocator, String agentpoollocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, agentpoollocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField projectLocatorField(String projectlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypes projectLocatorBuildTypes(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypes(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator projectLocatorBuildTypesBtLocator(String projectlocator, String btlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator projectLocatorTemplatesBtLocator(String projectlocator, String btlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorNewProjectDescription projectLocatorNewProjectDescription(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorNewProjectDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorExampleNewProjectDescription projectLocatorExampleNewProjectDescription(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorExampleNewProjectDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocator projectLocator(String projectlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds projectLocatorBuildTypesBtLocatorBuilds(String projectlocator, String btlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator);
    }

    public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator projectLocatorBuildTypesBtLocatorBuildsBuildLocator(String projectlocator, String btlocator, String buildlocator) {
      return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), projectlocator, btlocator, buildlocator);
    }

    public static class ProjectLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}");
        } else {
          template.append("app/rest/projects/{projectLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocator(_client, copyUriBuilder, copyMap);
      }

      public Project getAsProject() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Project getAsProject(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }


      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


    }

    public static class ProjectLocatorAgentPools {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/agentPools");
        } else {
          template.append("app/rest/projects/{projectLocator}/agentPools");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPools setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPools(_client, copyUriBuilder, copyMap);
      }

      public AgentPools getAsAgentPools() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPools.class);
      }

      public AgentPool postJsonAsAgentPool(AgentPool input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agentPool"), AgentPool.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPool.class);
      }

      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public AgentPools putJsonAsAgentPools(AgentPools input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agentPools"), AgentPools.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(AgentPools.class);
      }


    }

    public static class ProjectLocatorAgentPoolsAgentPoolLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator}");
        } else {
          template.append("app/rest/projects/{projectLocator}/agentPools/{agentPoolLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator setAgentpoollocator(String agentpoollocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("agentPoolLocator", agentpoollocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorAgentPoolsAgentPoolLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


    }

    public static class ProjectLocatorBuildTypes {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypes setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypes(_client, copyUriBuilder, copyMap);
      }

      public BuildTypes getAsBuildTypes() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildTypes.class);
      }

      public BuildTypes getAsBuildTypes(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildTypes.class);
      }


      public <T> T postTextPlainAsJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postTextPlainAsJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T postTextPlainAsJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postTextPlainAsJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public BuildType postJsonAsBuildType(NewBuildTypeDescription input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public BuildType postJsonAsBuildType(NewBuildTypeDescription input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public <T> T postJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Creates a new build configuration by copying existing one.
       */
      public <T> T postJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes/{btLocator}");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes/{btLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocator(_client, copyUriBuilder, copyMap);
      }

      public BuildType getAsBuildType() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      public BuildType getAsBuildType(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }


    }

    public static class ProjectLocatorBuildTypesBtLocatorBuilds {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuilds(_client, copyUriBuilder, copyMap);
      }

      /**
       * Serves builds matching supplied condition.
       */
      public Builds getAsBuilds() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public Builds getAsBuilds(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (status == null) {
        }
        if (status != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", null);
        }
        if (triggeredbyuser == null) {
        }
        if (triggeredbyuser != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", null);
        }
        if (includepersonal == null) {
        }
        if (includepersonal != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", null);
        }
        if (includecanceled == null) {
        }
        if (includecanceled != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", null);
        }
        if (onlypinned == null) {
        }
        if (onlypinned != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", null);
        }
        if (tag == null) {
        }
        if (tag != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", null);
        }
        if (agentname == null) {
        }
        if (agentname != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", null);
        }
        if (sincebuild == null) {
        }
        if (sincebuild != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", null);
        }
        if (sincedate == null) {
        }
        if (sincedate != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", null);
        }
        if (start == null) {
        }
        if (start != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Builds.class);
      }

      /**
       * Serves builds matching supplied condition.
       */
      public <T> T getAsJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (status == null) {
        }
        if (status != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", null);
        }
        if (triggeredbyuser == null) {
        }
        if (triggeredbyuser != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", null);
        }
        if (includepersonal == null) {
        }
        if (includepersonal != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", null);
        }
        if (includecanceled == null) {
        }
        if (includecanceled != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", null);
        }
        if (onlypinned == null) {
        }
        if (onlypinned != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", null);
        }
        if (tag == null) {
        }
        if (tag != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", null);
        }
        if (agentname == null) {
        }
        if (agentname != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", null);
        }
        if (sincebuild == null) {
        }
        if (sincebuild != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", null);
        }
        if (sincedate == null) {
        }
        if (sincedate != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", null);
        }
        if (start == null) {
        }
        if (start != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Serves builds matching supplied condition.
       */
      public <T> T getAsJson(String status, String triggeredbyuser, Boolean includepersonal, Boolean includecanceled, Boolean onlypinned, String tag, String agentname, String sincebuild, String sincedate, Long start, Integer count, String locator, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (status == null) {
        }
        if (status != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", status);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("status", null);
        }
        if (triggeredbyuser == null) {
        }
        if (triggeredbyuser != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", triggeredbyuser);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("triggeredByUser", null);
        }
        if (includepersonal == null) {
        }
        if (includepersonal != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", includepersonal);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonal", null);
        }
        if (includecanceled == null) {
        }
        if (includecanceled != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", includecanceled);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeCanceled", null);
        }
        if (onlypinned == null) {
        }
        if (onlypinned != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", onlypinned);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("onlyPinned", null);
        }
        if (tag == null) {
        }
        if (tag != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", tag);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("tag", null);
        }
        if (agentname == null) {
        }
        if (agentname != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", agentname);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("agentName", null);
        }
        if (sincebuild == null) {
        }
        if (sincebuild != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", sincebuild);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceBuild", null);
        }
        if (sincedate == null) {
        }
        if (sincedate != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", sincedate);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("sinceDate", null);
        }
        if (start == null) {
        }
        if (start != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", start);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("start", null);
        }
        if (count == null) {
        }
        if (count != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", count);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("count", null);
        }
        if (locator == null) {
        }
        if (locator != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
        }
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
      }

      public Build getAsBuild() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }

      public Build getAsBuild(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Build.class);
      }


    }

    public static class ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("buildLocator", buildlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class ProjectLocatorBuildTypesBtLocatorField {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/buildTypes/{btLocator}/{field}");
        } else {
          template.append("app/rest/projects/{projectLocator}/buildTypes/{btLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorBuildTypesBtLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class ProjectLocatorExampleNewProjectDescription {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/example/newProjectDescription");
        } else {
          template.append("app/rest/projects/{projectLocator}/example/newProjectDescription");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorExampleNewProjectDescription setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorExampleNewProjectDescription(_client, copyUriBuilder, copyMap);
      }

      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /projects request to create a new
       * project
       */
      public NewProjectDescription getAsNewProjectDescription() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(NewProjectDescription.class);
      }


      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /projects request to create a new
       * project
       */
      public NewProjectDescription getAsNewProjectDescription(String id) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(NewProjectDescription.class);
      }

      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /projects request to create a new
       * project
       */
      public <T> T getAsJson(String id, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Experimental support only.
       * Use this to get an example of the bean to be posted to the /projects request to create a new
       * project
       */
      public <T> T getAsJson(String id, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorField {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/{field}");
        } else {
          template.append("app/rest/projects/{projectLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorField(_client, copyUriBuilder, copyMap);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class ProjectLocatorNewProjectDescription {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/newProjectDescription");
        } else {
          template.append("app/rest/projects/{projectLocator}/newProjectDescription");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorNewProjectDescription setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorNewProjectDescription(_client, copyUriBuilder, copyMap);
      }

      /**
       * For compatibility with experimental feature of 8.0
       */
      public NewProjectDescription getAsNewProjectDescription() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
      public NewProjectDescription getAsNewProjectDescription(String id) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(NewProjectDescription.class);
      }

      /**
       * For compatibility with experimental feature of 8.0
       */
      public <T> T getAsJson(String id, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * For compatibility with experimental feature of 8.0
       */
      public <T> T getAsJson(String id, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (id == null) {
        }
        if (id != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("id", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorParameters {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/parameters");
        } else {
          template.append("app/rest/projects/{projectLocator}/parameters");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParameters setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParameters(_client, copyUriBuilder, copyMap);
      }

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties getAsProperties(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }


      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }


      public Properties putJsonAsProperties(Properties input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public <T> T putJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T putJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public Property postJsonAsProperty(Property input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorParametersName {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/parameters/{name}");
        } else {
          template.append("app/rest/projects/{projectLocator}/parameters/{name}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParametersName(_client, copyUriBuilder, copyMap);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public Property getAsProperty() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Property.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


    }

    public static class ProjectLocatorParentProject {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/parentProject");
        } else {
          template.append("app/rest/projects/{projectLocator}/parentProject");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParentProject setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorParentProject(_client, copyUriBuilder, copyMap);
      }

      public Project putJsonAsProject(Project input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "project"), Project.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }


      public Project getAsProject() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }

      public Project getAsProject(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Project.class);
      }


    }

    public static class ProjectLocatorTemplates {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/templates");
        } else {
          template.append("app/rest/projects/{projectLocator}/templates");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplates setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplates(_client, copyUriBuilder, copyMap);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public BuildType postJsonAsBuildType(NewBuildTypeDescription input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public <T> T postJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public <T> T postJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public BuildType postJsonAsBuildType(NewBuildTypeDescription input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "newBuildTypeDescription"), NewBuildTypeDescription.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public <T> T postJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Creates a new build configuration template by copying existing one.
       */
      public <T> T postJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public BuildTypes getAsBuildTypes() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildTypes.class);
      }

      public BuildTypes getAsBuildTypes(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildTypes.class);
      }


      public <T> T postTextPlainAsJson(Object input, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postTextPlainAsJson(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T postTextPlainAsJson(Object input, String fields, GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T postTextPlainAsJson(Object input, String fields, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class ProjectLocatorTemplatesBtLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/projects/{projectLocator}/templates/{btLocator}");
        } else {
          template.append("app/rest/projects/{projectLocator}/templates/{btLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator setProjectlocator(String projectlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("projectLocator", projectlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator setBtlocator(String btlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("btLocator", btlocator);
        return new TeamcityJetbrainsCom.AppRestProjects.ProjectLocatorTemplatesBtLocator(_client, copyUriBuilder, copyMap);
      }

      public BuildType getAsBuildType() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }

      public BuildType getAsBuildType(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(BuildType.class);
      }


    }

  }

  public static class AppRestServer {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestServer(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestServer(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/server");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public Server getAsServer() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Server.class);
    }


    public TeamcityJetbrainsCom.AppRestServer.Backup backup() {
      return new TeamcityJetbrainsCom.AppRestServer.Backup(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public TeamcityJetbrainsCom.AppRestServer.Field field(String field) {
      return new TeamcityJetbrainsCom.AppRestServer.Field(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), field);
    }

    public TeamcityJetbrainsCom.AppRestServer.Plugins plugins() {
      return new TeamcityJetbrainsCom.AppRestServer.Plugins(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
    }

    public static class Backup {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private Backup(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public Backup(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/backup");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public <T> T postAsTextPlain(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public <T> T postAsTextPlain(String filename, Boolean addtimestamp, Boolean includeconfigs, Boolean includedatabase, Boolean includebuildlogs, Boolean includepersonalchanges, Boolean includerunningbuilds, Boolean includesupplimentarydata, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (filename == null) {
        }
        if (filename != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fileName", filename);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fileName", null);
        }
        if (addtimestamp == null) {
        }
        if (addtimestamp != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("addTimestamp", addtimestamp);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("addTimestamp", null);
        }
        if (includeconfigs == null) {
        }
        if (includeconfigs != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeConfigs", includeconfigs);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeConfigs", null);
        }
        if (includedatabase == null) {
        }
        if (includedatabase != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeDatabase", includedatabase);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeDatabase", null);
        }
        if (includebuildlogs == null) {
        }
        if (includebuildlogs != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeBuildLogs", includebuildlogs);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeBuildLogs", null);
        }
        if (includepersonalchanges == null) {
        }
        if (includepersonalchanges != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonalChanges", includepersonalchanges);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includePersonalChanges", null);
        }
        if (includerunningbuilds == null) {
        }
        if (includerunningbuilds != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeRunningBuilds", includerunningbuilds);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeRunningBuilds", null);
        }
        if (includesupplimentarydata == null) {
        }
        if (includesupplimentarydata != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeSupplimentaryData", includesupplimentarydata);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("includeSupplimentaryData", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

    public static class Field {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private Field(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public Field(Client client, URI baseUri, String field) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{field}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("field", field);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public Field(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/server/{field}");
        } else {
          template.append("app/rest/server/{field}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
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
      public TeamcityJetbrainsCom.AppRestServer.Field setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestServer.Field(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

    }

    public static class Plugins {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private Plugins(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public Plugins(Client client, URI baseUri) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/plugins");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
      }

      public PluginInfos getAsPluginInfos() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(PluginInfos.class);
      }
    }

  }

  public static class AppRestTestOccurrences {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestTestOccurrences(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestTestOccurrences(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/testOccurrences");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public TestOccurrences getAsTestOccurrences() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrences.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public TestOccurrences getAsTestOccurrences(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(TestOccurrences.class);
    }

    public TeamcityJetbrainsCom.AppRestTestOccurrences.TestLocator testLocator(String testlocator) {
      return new TeamcityJetbrainsCom.AppRestTestOccurrences.TestLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), testlocator);
    }

    public static class TestLocator {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private TestLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public TestLocator(Client client, URI baseUri, String testlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{testLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("testLocator", testlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public TestLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/testOccurrences/{testLocator}");
        } else {
          template.append("app/rest/testOccurrences/{testLocator}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get testLocator
       */
      public String getTestlocator() {
        return ((String) _templateAndMatrixParameterValues.get("testLocator"));
      }

      /**
       * Duplicate state and set testLocator
       */
      public TeamcityJetbrainsCom.AppRestTestOccurrences.TestLocator setTestlocator(String testlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("testLocator", testlocator);
        return new TeamcityJetbrainsCom.AppRestTestOccurrences.TestLocator(_client, copyUriBuilder, copyMap);
      }

      public TestOccurrence getAsTestOccurrence() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(TestOccurrence.class);
      }

      public TestOccurrence getAsTestOccurrence(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(TestOccurrence.class);
      }


    }

  }

  public static class AppRestTests {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestTests(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestTests(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/tests");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Tests getAsTests() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Tests.class);
    }

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */

    /**
     * Experimental, the requests and results returned will change in future versions!
     */
    public Tests getAsTests(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Tests.class);
    }

    public TeamcityJetbrainsCom.AppRestTests.TestLocator testLocator(String testlocator) {
      return new TeamcityJetbrainsCom.AppRestTests.TestLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), testlocator);
    }

    public static class TestLocator {

      private Client _client;
      private UriBuilder _uriBuilder;
      private Map<String, Object> _templateAndMatrixParameterValues;

      private TestLocator(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
        _client = client;
        _uriBuilder = uriBuilder.clone();
        _templateAndMatrixParameterValues = map;
      }

      /**
       * Create new instance using existing Client instance, and a base URI and any parameters
       */
      public TestLocator(Client client, URI baseUri, String testlocator) {
        _client = client;
        _uriBuilder = UriBuilder.fromUri(baseUri);
        _uriBuilder = _uriBuilder.path("/{testLocator}");
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        _templateAndMatrixParameterValues.put("testLocator", testlocator);
      }

      /**
       * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
       */
      public TestLocator(Client client, URI uri) {
        _client = client;
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/tests/{testLocator}");
        } else {
          template.append("app/rest/tests/{testLocator}");
        }
        _uriBuilder = UriBuilder.fromPath(template.toString());
        _templateAndMatrixParameterValues = new HashMap<String, Object>();
        UriTemplate uriTemplate = new UriTemplate(template.toString());
        HashMap<String, String> parameters = new HashMap<String, String>();
        uriTemplate.match(uri.toString(), parameters);
        _templateAndMatrixParameterValues.putAll(parameters);
      }

      /**
       * Get testLocator
       */
      public String getTestlocator() {
        return ((String) _templateAndMatrixParameterValues.get("testLocator"));
      }

      /**
       * Duplicate state and set testLocator
       */
      public TeamcityJetbrainsCom.AppRestTests.TestLocator setTestlocator(String testlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("testLocator", testlocator);
        return new TeamcityJetbrainsCom.AppRestTests.TestLocator(_client, copyUriBuilder, copyMap);
      }

      public Test getAsTest() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Test.class);
      }

      public Test getAsTest(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Test.class);
      }


    }

  }

  public static class AppRestUserGroups {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestUserGroups(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
      _client = client;
      _uriBuilder = uriBuilder.clone();
      _templateAndMatrixParameterValues = map;
    }

    /**
     * Create new instance using existing Client instance, and a base URI and any parameters
     */
    public AppRestUserGroups(Client client, URI baseUri) {
      _client = client;
      _uriBuilder = UriBuilder.fromUri(baseUri);
      _uriBuilder = _uriBuilder.path("/app/rest/userGroups");
      _templateAndMatrixParameterValues = new HashMap<String, Object>();
    }

    public Group postJsonAsGroup(Group input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }

    public Group postJsonAsGroup(Group input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Group.class);
    }

    public Groups getAsGroups() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }


    public Groups getAsGroups(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Groups.class);
    }

    public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocator groupLocator(String grouplocator) {
      return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator);
    }

    public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRoles groupLocatorRoles(String grouplocator) {
      return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRoles(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator);
    }

    public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope groupLocatorRolesRoleIdScope(String grouplocator, String roleid, String scope) {
      return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), grouplocator, roleid, scope);
    }

    public static class GroupLocator {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/userGroups/{groupLocator}");
        } else {
          template.append("app/rest/userGroups/{groupLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocator setGrouplocator(String grouplocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("groupLocator", grouplocator);
        return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public Group getAsGroup() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Group.class);
      }

      public Group getAsGroup(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Group.class);
      }


    }

    public static class GroupLocatorRoles {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/userGroups/{groupLocator}/roles");
        } else {
          template.append("app/rest/userGroups/{groupLocator}/roles");
        }
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
      public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRoles setGrouplocator(String grouplocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("groupLocator", grouplocator);
        return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRoles(_client, copyUriBuilder, copyMap);
      }

      public RoleAssignments putJsonAsRoleAssignments(RoleAssignments input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "roles"), RoleAssignments.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignments.class);
      }


      public RoleAssignment postJsonAsRoleAssignment(RoleAssignment input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "role"), RoleAssignment.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public RoleAssignments getAsRoleAssignments() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignments.class);
      }
    }

    public static class GroupLocatorRolesRoleIdScope {

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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}");
        } else {
          template.append("app/rest/userGroups/{groupLocator}/roles/{roleId}/{scope}");
        }
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
      public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope setGrouplocator(String grouplocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("groupLocator", grouplocator);
        return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope setRoleid(String roleid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("roleId", roleid);
        return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope setScope(String scope) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("scope", scope);
        return new TeamcityJetbrainsCom.AppRestUserGroups.GroupLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
      }

      public RoleAssignment getAsRoleAssignment() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public RoleAssignment postAsRoleAssignment() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


    }

  }

  public static class AppRestUsers {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestUsers(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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

    public User postJsonAsUser(User input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }


    public <T> T postJsonAs(Object input, Class<T> returnType) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        throwExceptionIfWrongStatus(response);
      }
      return getReturnValue((Class<T>) returnType, response);
    }

    public User postJsonAsUser(User input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(User.class);
    }

    public Users getAsUsers() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Users.class);
    }


    public Users getAsUsers(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (fields != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(Users.class);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocator userLocator(String userlocator) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRoles userLocatorRoles(String userlocator) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRoles(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope userLocatorRolesRoleIdScope(String userlocator, String roleid, String scope) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, roleid, scope);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorGroups userLocatorGroups(String userlocator) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorGroups(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorField userLocatorField(String userlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, field);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorProperties userLocatorProperties(String userlocator) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator);
    }

    public TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName userLocatorPropertiesName(String userlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), userlocator, name);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}");
        } else {
          template.append("app/rest/users/{userLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocator setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocator(_client, copyUriBuilder, copyMap);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public User putJsonAsUser(User input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(User.class);
      }


      public User putJsonAsUser(User input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "user"), User.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(User.class);
      }

      public User getAsUser() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(User.class);
      }

      public User getAsUser(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/{field}");
        } else {
          template.append("app/rest/users/{userLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorField setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/groups");
        } else {
          template.append("app/rest/users/{userLocator}/groups");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorGroups setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorGroups(_client, copyUriBuilder, copyMap);
      }

      public Group postJsonAsGroup(Group input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Group.class);
      }

      public Group postJsonAsGroup(Group input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "group"), Group.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Group.class);
      }

      /**
       * Replaces user's roles with the submitted ones
       */
      public Groups putJsonAsGroups(Groups input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "groups"), Groups.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Groups.class);
      }

      /**
       * Replaces user's roles with the submitted ones
       */
      public Groups putJsonAsGroups(Groups input, String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "groups"), Groups.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Groups.class);
      }

      public Groups getAsGroups() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Groups.class);
      }

      public Groups getAsGroups(String fields) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        if (fields == null) {
        }
        if (fields != null) {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
        } else {
          localUriBuilder = localUriBuilder.replaceQueryParam("fields", null);
        }
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/properties");
        } else {
          template.append("app/rest/users/{userLocator}/properties");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorProperties setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorProperties(_client, copyUriBuilder, copyMap);
      }

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/properties/{name}");
        } else {
          template.append("app/rest/users/{userLocator}/properties/{name}");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorPropertiesName(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/roles");
        } else {
          template.append("app/rest/users/{userLocator}/roles");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRoles setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRoles(_client, copyUriBuilder, copyMap);
      }

      /**
       * Replaces user's roles with the submitted ones
       */
      public RoleAssignments putJsonAsRoleAssignments(RoleAssignments input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "roles"), RoleAssignments.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignments.class);
      }

      /**
       * Replaces user's roles with the submitted ones
       */

      /**
       * Replaces user's roles with the submitted ones
       */


      public RoleAssignment postJsonAsRoleAssignment(RoleAssignment input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "role"), RoleAssignment.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public RoleAssignments getAsRoleAssignments() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/users/{userLocator}/roles/{roleId}/{scope}");
        } else {
          template.append("app/rest/users/{userLocator}/roles/{roleId}/{scope}");
        }
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope setUserlocator(String userlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("userLocator", userlocator);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope setRoleid(String roleid) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("roleId", roleid);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope setScope(String scope) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("scope", scope);
        return new TeamcityJetbrainsCom.AppRestUsers.UserLocatorRolesRoleIdScope(_client, copyUriBuilder, copyMap);
      }

      public RoleAssignment getAsRoleAssignment() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public RoleAssignment putAsRoleAssignment() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT").invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(RoleAssignment.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }


      public Response post() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
        Response response;
        response = resourceBuilder.build("POST").invoke();
        return response;
      }
    }

  }

  public static class AppRestVcsRootInstances {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestVcsRootInstances(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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

    public VcsRootInstances getAsVcsRootInstances() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }


    public VcsRootInstances getAsVcsRootInstances(String locator) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }


    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryState vcsRootInstanceLocatorRepositoryState(String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryState(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorProperties vcsRootInstanceLocatorProperties(String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField vcsRootInstanceLocatorField(String vcsrootinstancelocator, String field) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, field);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryStateCreationDate vcsRootInstanceLocatorRepositoryStateCreationDate(String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryStateCreationDate(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath vcsRootInstanceLocatorFilesLatestContentpath(String vcsrootinstancelocator, String path) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath vcsRootInstanceLocatorFilesLatestChildrenpath(String vcsrootinstancelocator, String path) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath vcsRootInstanceLocatorFilesLatestMetadatapath(String vcsrootinstancelocator, String path) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator, path);
    }

    public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocator vcsRootInstanceLocator(String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootinstancelocator);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocator setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
      }

      public VcsRootInstance getAsVcsRootInstance() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/children{path:(/.*)?}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Lists files in VCS
       * Experimental support only
       */
      public Files getAsFiles() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/content{path:(/.*)?}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestContentpath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      /**
       * Gets content of a file form VCS
       * Experimental support only
       */
      public <T> T getAs(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/files/latest/metadata{path:(/.*)?}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath setPath(String path) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("path", path);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
      }

      /**
       * Gets VCS file details
       * Experimental support only
       */
      public File getAsFile() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/properties");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorProperties setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
      }

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryState setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryState(_client, copyUriBuilder, copyMap);
      }

      public Entries getAsEntries() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Entries.class);
      }

      public Entries putJsonAsEntries(Entries input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "entries"), Entries.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate");
        } else {
          template.append("app/rest/vcs-root-instances/{vcsRootInstanceLocator}/repositoryState/creationDate");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryStateCreationDate setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRootInstances.VcsRootInstanceLocatorRepositoryStateCreationDate(_client, copyUriBuilder, copyMap);
      }

      public <T> T getAs(GenericType<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(returnType);
      }

      public <T> T getAs(Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }

    }

  }

  public static class AppRestVcsRoots {

    private Client _client;
    private UriBuilder _uriBuilder;
    private Map<String, Object> _templateAndMatrixParameterValues;

    private AppRestVcsRoots(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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

    public VcsRoot postJsonAsVcsRoot(VcsRoot input) {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "vcs-root"), VcsRoot.class, input), "application/json")).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRoot.class);
    }

    public VcsRoots getAsVcsRoots() {
      WebTarget resource = getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRoots.class);
    }


    public VcsRoots getAsVcsRoots(String locator) {
      UriBuilder localUriBuilder = _uriBuilder.clone();
      if (locator == null) {
      }
      if (locator != null) {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      } else {
        localUriBuilder = localUriBuilder.replaceQueryParam("locator", null);
      }
      WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
      Response response;
      response = resourceBuilder.build(GET).invoke();
      throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRoots.class);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName vcsRootLocatorPropertiesName(String vcsrootlocator, String name) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, name);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocator vcsRootLocator(String vcsrootlocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties vcsRootLocatorInstancesVcsRootInstanceLocatorProperties(String vcsrootlocator, String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField vcsRootLocatorInstancesVcsRootInstanceLocatorField(String vcsrootlocator, String vcsrootinstancelocator, String field) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator, field);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstances vcsRootLocatorInstances(String vcsrootlocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstances(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
    }

    /**
     * @param vcsrootlocator this is effectively ignored as vcsRootInstanceLocator should specify instance fully
     */
    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator vcsRootLocatorInstancesVcsRootInstanceLocator(String vcsrootlocator, String vcsrootinstancelocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, vcsrootinstancelocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorProperties vcsRootLocatorProperties(String vcsrootlocator) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorProperties(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator);
    }

    public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField vcsRootLocatorField(String vcsrootlocator, String field) {
      return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), vcsrootlocator, field);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocator setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocator(_client, copyUriBuilder, copyMap);
      }

      public VcsRoot getAsVcsRoot() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(VcsRoot.class);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/{field}");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorField(_client, copyUriBuilder, copyMap);
      }

      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/instances");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/instances");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstances setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstances(_client, copyUriBuilder, copyMap);
      }

      public VcsRootInstances getAsVcsRootInstances() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocator(_client, copyUriBuilder, copyMap);
      }

      public VcsRootInstance getAsVcsRootInstance() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField setField(String field) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("field", field);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorField(_client, copyUriBuilder, copyMap);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties setVcsrootinstancelocator(String vcsrootinstancelocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootInstanceLocator", vcsrootinstancelocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorInstancesVcsRootInstanceLocatorProperties(_client, copyUriBuilder, copyMap);
      }

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/properties");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/properties");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorProperties setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorProperties(_client, copyUriBuilder, copyMap);
      }

      public Properties getAsProperties() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build(GET).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }

      public Properties putJsonAsProperties(Properties input) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
        throwExceptionIfWrongStatus(response);
        return response.readEntity(Properties.class);
      }


      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
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
        StringBuilder template = new StringBuilder(BASE_URI.toString());
        if (template.charAt((template.length() - 1)) != '/') {
          template.append("/app/rest/vcs-roots/{vcsRootLocator}/properties/{name}");
        } else {
          template.append("app/rest/vcs-roots/{vcsRootLocator}/properties/{name}");
        }
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName setVcsrootlocator(String vcsrootlocator) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("vcsRootLocator", vcsrootlocator);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName(_client, copyUriBuilder, copyMap);
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
      public TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName setName(String name) {
        Map<String, Object> copyMap;
        copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
        UriBuilder copyUriBuilder = _uriBuilder.clone();
        copyMap.put("name", name);
        return new TeamcityJetbrainsCom.AppRestVcsRoots.VcsRootLocatorPropertiesName(_client, copyUriBuilder, copyMap);
      }


      public <T> T putTextPlain(Object input, Class<T> returnType) {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
        Response response;
        response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
        if (!Response.class.isAssignableFrom(returnType)) {
          throwExceptionIfWrongStatus(response);
        }
        return getReturnValue((Class<T>) returnType, response);
      }


      public String getAsTextPlain() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return getAsString(resource);
      }

      public Response delete() {
        UriBuilder localUriBuilder = _uriBuilder.clone();
        WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        return TeamcityJetbrainsCom.delete(resource);
      }

    }

  }

  public static Response delete(WebTarget resource) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
    Response response;
    response = resourceBuilder.build("DELETE").invoke();
    return response;
  }

  public static String getAsString(WebTarget resource) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
    Response response;
    response = resourceBuilder.build(GET).invoke();
    if (!Response.class.isAssignableFrom(String.class)) {
      throwExceptionIfWrongStatus(response);
    }
    return getReturnValue(String.class, response);
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
