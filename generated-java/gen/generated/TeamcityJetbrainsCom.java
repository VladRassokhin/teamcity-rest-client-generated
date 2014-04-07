package generated;

import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
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

  public static AppRestBuilds appRestBuilds(Client client, URI baseURI) {
    return new AppRestBuilds(client, baseURI);
  }

  public static AppRestBuilds appRestBuilds() {
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

  public static AppRestAgents appRestAgents(Client client, URI baseURI) {
    return new AppRestAgents(client, baseURI);
  }

  public static AppRestAgents appRestAgents() {
    return appRestAgents(createClient(), BASE_URI);
  }

  public static AppRestAgentPools appRestAgentPools(Client client, URI baseURI) {
    return new AppRestAgentPools(client, baseURI);
  }

  public static AppRestAgentPools appRestAgentPools() {
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

  public static AppRestBuildQueue appRestBuildQueue(Client client, URI baseURI) {
    return new AppRestBuildQueue(client, baseURI);
  }

  public static AppRestBuildQueue appRestBuildQueue() {
    return appRestBuildQueue(createClient(), BASE_URI);
  }

  public static AppRestBuildTypes appRestBuildTypes(Client client, URI baseURI) {
    return new AppRestBuildTypes(client, baseURI);
  }

  public static AppRestBuildTypes appRestBuildTypes() {
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

  public static StringBuilder getTemplateBuilder(String path) {
    final String base = BASE_URI.toString();
    StringBuilder template = new StringBuilder(base);
    if (!base.endsWith("/")) {
      template.append("/");
    }
    template.append(path);
    return template;
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
