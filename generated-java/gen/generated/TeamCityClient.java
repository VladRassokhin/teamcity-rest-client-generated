package generated;

import generated.resources.*;

import javax.annotation.Generated;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.net.URI;

@Generated(value = {
    "wadl|file:/Users/vlad/devel/teamcity-rest-myRestClient/generated-java/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-04-07T14:34:37.557+04:00")
public class TeamCityClient {
  /**
   * The base URI for the resource represented by this proxy
   */
  public final static URI BASE_URI;

  static {
    BASE_URI = URI.create("http://teamcity.jetbrains.com/");
  }

  private final Client client;
  private final URI baseURI;

  public TeamCityClient(URI baseURI, Client client) {
    this.baseURI = baseURI;
    this.client = client;
  }

  public TeamCityClient(URI baseURI) {
    this(baseURI, createClient());
  }

  private static Client createClientInstance() {
    return ClientBuilder.newClient();
  }

  private static Client createClient() {
    Client client = createClientInstance();
    return client;
  }

  public AppRestVcsRoots getVcsRootsResource() {
    return new AppRestVcsRoots(client, baseURI, this);
  }

  public AppRestBuilds getBuildsResource() {
    return new AppRestBuilds(client, baseURI, this);
  }

  public AppRestServer getServerResource() {
    return new AppRestServer(client, baseURI, this);
  }

  public AppRestUserGroups getUserGroupsResource() {
    return new AppRestUserGroups(client, baseURI, this);
  }

  public AppRestProjects getProjectsResource() {
    return new AppRestProjects(client, baseURI, this);
  }

  public AppRestUsers getUsersResource() {
    return new AppRestUsers(client, baseURI, this);
  }

  public AppRestTestOccurrences getTestOccurrencesResource() {
    return new AppRestTestOccurrences(client, baseURI, this);
  }

  public AppRestChanges getChangesResource() {
    return new AppRestChanges(client, baseURI, this);
  }

  public AppRestAgents getAgentsResource() {
    return new AppRestAgents(client, baseURI, this);
  }

  public AppRestAgentPools getAgentPoolsResource() {
    return new AppRestAgentPools(client, baseURI, this);
  }

  public AppRestProblems getProblemsResource() {
    return new AppRestProblems(client, baseURI, this);
  }

  public AppRestRoot getRootResource() {
    return new AppRestRoot(client, baseURI, this);
  }

  public AppRestBuildQueue getBuildQueueResource() {
    return new AppRestBuildQueue(client, baseURI, this);
  }

  public AppRestBuildTypes getBuildTypesResource() {
    return new AppRestBuildTypes(client, baseURI, this);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public AppRestInvestigations getInvestigationsResource() {
    return new AppRestInvestigations(client, baseURI, this);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public AppRestVcsRootInstances getVcsRootInstancesResource() {
    return new AppRestVcsRootInstances(client, baseURI, this);
  }

  public AppRestTests getTestsResource() {
    return new AppRestTests(client, baseURI, this);
  }

  public AppRestProblemOccurrences getProblemOccurrencesResource() {
    return new AppRestProblemOccurrences(client, baseURI, this);
  }

  /**
   * Provides some debug abilities for the server. Experimental only. Should be used with caution or
   * better not used if not advised by JetBrains
   * These should never be used for non-debug purposes and the API here can change in future versions of
   * TeamCity without any notice.
   */
  public AppRestDebug getDebugResource() {
    return new AppRestDebug(client, baseURI, this);
  }

  public StringBuilder getTemplateBuilder(String path) {
    final String base = baseURI.toString();
    StringBuilder template = new StringBuilder(base);
    if (!base.endsWith("/")) {
      template.append("/");
    }
    template.append(path);
    return template;
  }

}
