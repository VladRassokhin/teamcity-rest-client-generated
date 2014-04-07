package generated;

import javax.annotation.Generated;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Map;

@Generated(value = {
    "wadl|file:/Users/vlad/devel/teamcity-rest-myRestClient/generated-java/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-04-07T14:34:37.557+04:00")
public class TeamcityJetbrainsCom {
  /**
   * The base URI for the resource represented by this proxy
   */
  public final static URI BASE_URI;

  static {
    BASE_URI = URI.create("http://teamcity.jetbrains.com/");
  }

  public static final String METHOD_GET = "METHOD_GET";
  public static final String METHOD_DELETE = "DELETE";
  public static final String TEXT_PLAIN = "text/plain";
  private final Client client;
  private final URI baseURI;

  public TeamcityJetbrainsCom(URI baseURI, Client client) {
    this.baseURI = baseURI;
    this.client = client;
  }

  public TeamcityJetbrainsCom(URI baseURI) {
    this(baseURI, createClient());
  }

  private static Client createClientInstance() {
    return ClientBuilder.newClient();
  }

  private static Client createClient() {
    Client client = createClientInstance();
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

  public AppRestVcsRoots appRestVcsRoots() {
    return new AppRestVcsRoots(client, baseURI, this);
  }

  public AppRestBuilds appRestBuilds() {
    return new AppRestBuilds(client, baseURI, this);
  }

  public AppRestServer appRestServer() {
    return new AppRestServer(client, baseURI, this);
  }

  public AppRestUserGroups appRestUserGroups() {
    return new AppRestUserGroups(client, baseURI, this);
  }

  public AppRestProjects appRestProjects() {
    return new AppRestProjects(client, baseURI, this);
  }

  public AppRestUsers appRestUsers() {
    return new AppRestUsers(client, baseURI, this);
  }

  public AppRestTestOccurrences appRestTestOccurrences() {
    return new AppRestTestOccurrences(client, baseURI, this);
  }

  public AppRestChanges appRestChanges() {
    return new AppRestChanges(client, baseURI, this);
  }

  public AppRestAgents appRestAgents() {
    return new AppRestAgents(client, baseURI, this);
  }

  public AppRestAgentPools appRestAgentPools() {
    return new AppRestAgentPools(client, baseURI, this);
  }

  public AppRestProblems appRestProblems() {
    return new AppRestProblems(client, baseURI, this);
  }

  public AppRest appRest() {
    return new AppRest(client, baseURI, this);
  }

  public AppRestBuildQueue appRestBuildQueue() {
    return new AppRestBuildQueue(client, baseURI, this);
  }

  public AppRestBuildTypes appRestBuildTypes() {
    return new AppRestBuildTypes(client, baseURI, this);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public AppRestInvestigations appRestInvestigations() {
    return new AppRestInvestigations(client, baseURI, this);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public AppRestVcsRootInstances appRestVcsRootInstances() {
    return new AppRestVcsRootInstances(client, baseURI, this);
  }

  public AppRestTests appRestTests() {
    return new AppRestTests(client, baseURI, this);
  }

  public AppRestProblemOccurrences appRestProblemOccurrences() {
    return new AppRestProblemOccurrences(client, baseURI, this);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public AppRestDebug appRestDebug() {
    return new AppRestDebug(client, baseURI, this);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public StringBuilder getTemplateBuilder(String path) {
    final String base = baseURI.toString();
    StringBuilder template = new StringBuilder(base);
    if (!base.endsWith("/")) {
      template.append("/");
    }
    template.append(path);
    return template;
  }

  public static Response delete(WebTarget resource) {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request();
    Response response = resourceBuilder.build(METHOD_DELETE).invoke();
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
    javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request(TEXT_PLAIN);
    Response response = resourceBuilder.build(METHOD_GET).invoke();
    throwExceptionIfWrongStatus(response);
    return getStringValue(response);
  }

  public static void throwExceptionIfWrongStatus(Response response) {
    if (response.getStatus() >= 400) {
      throw new WebApplicationExceptionMessage(response);
    }
  }

}
