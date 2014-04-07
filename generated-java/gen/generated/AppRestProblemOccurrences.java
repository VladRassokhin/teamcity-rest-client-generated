package generated;

import org.glassfish.jersey.uri.UriTemplate;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class AppRestProblemOccurrences extends AbstractAppRest {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  /**
   * Create new instance using existing Client instance, and a base URI and any parameters
   */
  public AppRestProblemOccurrences(Client client, URI baseUri, TeamcityJetbrainsCom tjc) {
    super(tjc);
    _client = client;
    _uriBuilder = UriBuilder.fromUri(baseUri);
    _uriBuilder = _uriBuilder.path("/app/rest/problemOccurrences");
    _templateAndMatrixParameterValues = new HashMap<String, Object>();
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public ProblemOccurrences get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(ProblemOccurrences.class);
  }

  /**
   * Experimental, the requests and results returned will change in future versions!
   */
  public ProblemOccurrences get(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(ProblemOccurrences.class);
  }

  public ProblemLocator problemLocator(String problemlocator) {
    return new ProblemLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), problemlocator);
  }

  public class ProblemLocator {
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
      StringBuilder template;
      template = myRestClient.getTemplateBuilder("app/rest/problemOccurrences/{problemLocator}");
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
    public ProblemLocator setProblemlocator(String problemlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("problemLocator", problemlocator);
      return new ProblemLocator(_client, copyUriBuilder, copyMap);
    }

    public ProblemOccurrence get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrence.class);
    }

    public ProblemOccurrence get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(ProblemOccurrence.class);
    }
  }
}
