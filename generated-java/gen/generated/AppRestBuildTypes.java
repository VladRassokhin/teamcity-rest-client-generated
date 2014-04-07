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

public class AppRestBuildTypes {
  private Client _client;
  private UriBuilder _uriBuilder;
  private Map<String, Object> _templateAndMatrixParameterValues;

  AppRestBuildTypes(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
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
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(input, "application/json")).invoke();
    if (!Response.class.isAssignableFrom(returnType)) {
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    }
    return TeamcityJetbrainsCom.getReturnValue(returnType, response);
  }

  public BuildType post(BuildType input, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "buildType"), BuildType.class, input), "application/json")).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(BuildType.class);
  }

  /**
   * Lists build types registered on the server. Build templates are not included by default
   */
  public BuildTypes get() {
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(BuildTypes.class);
  }

  /**
   * Lists build types registered on the server. Build templates are not included by default
   */
  public BuildTypes get(String locator, String fields) {
    UriBuilder localUriBuilder = _uriBuilder.clone();
    localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
    localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);
    javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
    Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
    TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
    return response.readEntity(BuildTypes.class);
  }

  public BtLocatorAgentRequirements btLocatorAgentRequirements(String btlocator) {
    return new BtLocatorAgentRequirements(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorFeatures btLocatorFeatures(String btlocator) {
    return new BtLocatorFeatures(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorSnapshotDependenciesSnapshotDepLocator btLocatorSnapshotDependenciesSnapshotDepLocator(String btlocator, String snapshotdeplocator) {
    return new BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, snapshotdeplocator);
  }

  public BtLocatorVcsRootEntriesId btLocatorVcsRootEntriesId(String btlocator, String id) {
    return new BtLocatorVcsRootEntriesId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, id);
  }

  public BtLocatorArtifactDependenciesArtifactDepLocator btLocatorArtifactDependenciesArtifactDepLocator(String btlocator, String artifactdeplocator) {
    return new BtLocatorArtifactDependenciesArtifactDepLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, artifactdeplocator);
  }

  public BtLocatorTriggersTriggerLocator btLocatorTriggersTriggerLocator(String btlocator, String triggerlocator) {
    return new BtLocatorTriggersTriggerLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, triggerlocator);
  }

  public BtLocatorAgentRequirementsAgentRequirementLocator btLocatorAgentRequirementsAgentRequirementLocator(String btlocator, String agentrequirementlocator) {
    return new BtLocatorAgentRequirementsAgentRequirementLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, agentrequirementlocator);
  }

  public BtLocatorParametersName btLocatorParametersName(String btlocator, String name) {
    return new BtLocatorParametersName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, name);
  }

  public BtLocatorTriggers btLocatorTriggers(String btlocator) {
    return new BtLocatorTriggers(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorSteps btLocatorSteps(String btlocator) {
    return new BtLocatorSteps(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorInvestigations btLocatorInvestigations(String btlocator) {
    return new BtLocatorInvestigations(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorVcsRootEntries btLocatorVcsRootEntries(String btlocator) {
    return new BtLocatorVcsRootEntries(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorStepsStepId btLocatorStepsStepId(String btlocator, String stepid) {
    return new BtLocatorStepsStepId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid);
  }

  public BtLocatorStepsStepIdParameters btLocatorStepsStepIdParameters(String btlocator, String stepid) {
    return new BtLocatorStepsStepIdParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid);
  }

  public BtLocatorStepsStepIdParametersParameterName btLocatorStepsStepIdParametersParameterName(String btlocator, String stepid, String parametername) {
    return new BtLocatorStepsStepIdParametersParameterName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid, parametername);
  }

  public BtLocatorStepsStepIdFieldName btLocatorStepsStepIdFieldName(String btlocator, String stepid, String fieldname) {
    return new BtLocatorStepsStepIdFieldName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, stepid, fieldname);
  }

  public BtLocatorFeaturesFeatureId btLocatorFeaturesFeatureId(String btlocator, String featureid) {
    return new BtLocatorFeaturesFeatureId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid);
  }

  public BtLocatorFeaturesFeatureIdParameters btLocatorFeaturesFeatureIdParameters(String btlocator, String featureid) {
    return new BtLocatorFeaturesFeatureIdParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid);
  }

  public BtLocatorFeaturesFeatureIdParametersParameterName btLocatorFeaturesFeatureIdParametersParameterName(String btlocator, String featureid, String parametername) {
    return new BtLocatorFeaturesFeatureIdParametersParameterName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid, parametername);
  }

  public BtLocatorFeaturesFeatureIdName btLocatorFeaturesFeatureIdName(String btlocator, String featureid, String name) {
    return new BtLocatorFeaturesFeatureIdName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, featureid, name);
  }

  public BtLocatorArtifactDependencies btLocatorArtifactDependencies(String btlocator) {
    return new BtLocatorArtifactDependencies(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorSnapshotDependencies btLocatorSnapshotDependencies(String btlocator) {
    return new BtLocatorSnapshotDependencies(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorTriggersTriggerLocatorFieldName btLocatorTriggersTriggerLocatorFieldName(String btlocator, String triggerlocator, String fieldname) {
    return new BtLocatorTriggersTriggerLocatorFieldName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, triggerlocator, fieldname);
  }

  public BtLocatorVcsLabeling btLocatorVcsLabeling(String btlocator) {
    return new BtLocatorVcsLabeling(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorVcsFilesLatestContentpath btLocatorVcsFilesLatestContentpath(String btlocator, String path) {
    return new BtLocatorVcsFilesLatestContentpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
  }

  public BtLocatorVcsFilesLatestChildrenpath btLocatorVcsFilesLatestChildrenpath(String btlocator, String path) {
    return new BtLocatorVcsFilesLatestChildrenpath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
  }

  public BtLocatorVcsFilesLatestMetadatapath btLocatorVcsFilesLatestMetadatapath(String btlocator, String path) {
    return new BtLocatorVcsFilesLatestMetadatapath(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, path);
  }

  public BtLocatorNewBuildTypeDescription btLocatorNewBuildTypeDescription(String btlocator) {
    return new BtLocatorNewBuildTypeDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorExampleNewBuildTypeDescription btLocatorExampleNewBuildTypeDescription(String btlocator) {
    return new BtLocatorExampleNewBuildTypeDescription(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorVcsRootInstances btLocatorVcsRootInstances(String btlocator) {
    return new BtLocatorVcsRootInstances(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorBuilds btLocatorBuilds(String btlocator) {
    return new BtLocatorBuilds(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorBuildsBuildLocator btLocatorBuildsBuildLocator(String btlocator, String buildlocator) {
    return new BtLocatorBuildsBuildLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, buildlocator);
  }

  public BtLocatorBuildsBuildLocatorField btLocatorBuildsBuildLocatorField(String btlocator, String buildlocator, String field) {
    return new BtLocatorBuildsBuildLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, buildlocator, field);
  }

  public BtLocatorBranches btLocatorBranches(String btlocator) {
    return new BtLocatorBranches(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocator btLocator(String btlocator) {
    return new BtLocator(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorField btLocatorField(String btlocator, String field) {
    return new BtLocatorField(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, field);
  }

  public BtLocatorBuildTags btLocatorBuildTags(String btlocator) {
    return new BtLocatorBuildTags(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorParameters btLocatorParameters(String btlocator) {
    return new BtLocatorParameters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorSettings btLocatorSettings(String btlocator) {
    return new BtLocatorSettings(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorSettingsName btLocatorSettingsName(String btlocator, String name) {
    return new BtLocatorSettingsName(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, name);
  }

  public BtLocatorTemplate btLocatorTemplate(String btlocator) {
    return new BtLocatorTemplate(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator);
  }

  public BtLocatorVcsRootEntriesIdCheckoutRules btLocatorVcsRootEntriesIdCheckoutRules(String btlocator, String id) {
    return new BtLocatorVcsRootEntriesIdCheckoutRules(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), btlocator, id);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}");
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
    public BtLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocator(_client, copyUriBuilder, copyMap);
    }

    /**
     * Serves build configuration or templates according to the locator.
     */
    public BuildType get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }
    /**
     * Serves build configuration or templates according to the locator.
     */
    /**
     * Serves build configuration or templates according to the locator.
     */
    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/agent-requirements");
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
    public BtLocatorAgentRequirements setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorAgentRequirements(_client, copyUriBuilder, copyMap);
    }

    public PropEntitiesAgentRequirement get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesAgentRequirement.class);
    }

    /**
     * Creates new agent requirement. 'id' attribute is ignored in the submitted descriptor.
     * Reports error if new requirement cannot be created (e.g. another requirement is present for the
     * parameter).
     */
    public PropEntityAgentRequirement post(PropEntityAgentRequirement input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityAgentRequirement.class);
    }

    /**
     * Replaces agent requirements with those sent in the request.
     */
    public PropEntitiesAgentRequirement put(PropEntitiesAgentRequirement input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirements"), PropEntitiesAgentRequirement.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/agent-requirements/{agentRequirementLocator}");
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
    public BtLocatorAgentRequirementsAgentRequirementLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorAgentRequirementsAgentRequirementLocator(_client, copyUriBuilder, copyMap);
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
    public BtLocatorAgentRequirementsAgentRequirementLocator setAgentrequirementlocator(String agentrequirementlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("agentRequirementLocator", agentrequirementlocator);
      return new BtLocatorAgentRequirementsAgentRequirementLocator(_client, copyUriBuilder, copyMap);
    }

    public PropEntityAgentRequirement get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityAgentRequirement.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntityAgentRequirement put(PropEntityAgentRequirement input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "agent-requirement"), PropEntityAgentRequirement.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/artifact-dependencies");
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
    public BtLocatorArtifactDependencies setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorArtifactDependencies(_client, copyUriBuilder, copyMap);
    }

    public PropEntitiesArtifactDep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesArtifactDep.class);
    }

    /**
     * Replaces the dependencies to those sent in the request.
     */
    public PropEntitiesArtifactDep put(PropEntitiesArtifactDep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependencies"), PropEntitiesArtifactDep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesArtifactDep.class);
    }
    /**
     * Replaces the dependencies to those sent in the request.
     */
    /**
     * Replaces the dependencies to those sent in the request.
     */
    public PropEntityArtifactDep post(PropEntityArtifactDep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/artifact-dependencies/{artifactDepLocator}");
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
    public BtLocatorArtifactDependenciesArtifactDepLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorArtifactDependenciesArtifactDepLocator(_client, copyUriBuilder, copyMap);
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
    public BtLocatorArtifactDependenciesArtifactDepLocator setArtifactdeplocator(String artifactdeplocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("artifactDepLocator", artifactdeplocator);
      return new BtLocatorArtifactDependenciesArtifactDepLocator(_client, copyUriBuilder, copyMap);
    }

    public PropEntityArtifactDep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityArtifactDep.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntityArtifactDep put(PropEntityArtifactDep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "artifact-dependency"), PropEntityArtifactDep.class, input), "*/*")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/branches");
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
    public BtLocatorBranches setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorBranches(_client, copyUriBuilder, copyMap);
    }

    /**
     * Lists branches of the build type.
     */
    public Branches get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds");
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
    public BtLocatorBuilds setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorBuilds(_client, copyUriBuilder, copyMap);
    }

    /**
     * Serves builds matching supplied condition.
     */
    public Builds get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds/{buildLocator}");
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
    public BtLocatorBuildsBuildLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
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
    public BtLocatorBuildsBuildLocator setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BtLocatorBuildsBuildLocator(_client, copyUriBuilder, copyMap);
    }

    public Build get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Build.class);
    }

    public Build get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/builds/{buildLocator}/{field}");
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
    public BtLocatorBuildsBuildLocatorField setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public BtLocatorBuildsBuildLocatorField setBuildlocator(String buildlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("buildLocator", buildlocator);
      return new BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
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
    public BtLocatorBuildsBuildLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new BtLocatorBuildsBuildLocatorField(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/buildTags");
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
    public BtLocatorBuildTags setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorBuildTags(_client, copyUriBuilder, copyMap);
    }

    public Tags get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/example/newBuildTypeDescription");
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
    public BtLocatorExampleNewBuildTypeDescription setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorExampleNewBuildTypeDescription(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only.
     * Use this to get an example of the bean to be posted to the /buildTypes request to create a new
     * build type
     */
    public NewBuildTypeDescription get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/features");
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
    public BtLocatorFeatures setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorFeatures(_client, copyUriBuilder, copyMap);
    }

    public PropEntityFeature post(PropEntityFeature input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityFeature.class);
    }

    public PropEntitiesFeature get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesFeature.class);
    }

    public PropEntitiesFeature put(PropEntitiesFeature input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "features"), PropEntitiesFeature.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}");
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
    public BtLocatorFeaturesFeatureId setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorFeaturesFeatureId(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureId setFeatureid(String featureid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("featureId", featureid);
      return new BtLocatorFeaturesFeatureId(_client, copyUriBuilder, copyMap);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntityFeature put(PropEntityFeature input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "feature"), PropEntityFeature.class, input), "*/*")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityFeature.class);
    }

    public PropEntityFeature get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/{name}");
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
    public BtLocatorFeaturesFeatureIdName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureIdName setFeatureid(String featureid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("featureId", featureid);
      return new BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureIdName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new BtLocatorFeaturesFeatureIdName(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters");
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
    public BtLocatorFeaturesFeatureIdParameters setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorFeaturesFeatureIdParameters(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureIdParameters setFeatureid(String featureid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("featureId", featureid);
      return new BtLocatorFeaturesFeatureIdParameters(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/features/{featureId}/parameters/{parameterName}");
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
    public BtLocatorFeaturesFeatureIdParametersParameterName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureIdParametersParameterName setFeatureid(String featureid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("featureId", featureid);
      return new BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorFeaturesFeatureIdParametersParameterName setParametername(String parametername) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("parameterName", parametername);
      return new BtLocatorFeaturesFeatureIdParametersParameterName(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    public <T> String putAsTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/{field}");
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
    public BtLocatorField setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorField(_client, copyUriBuilder, copyMap);
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
    public BtLocatorField setField(String field) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("field", field);
      return new BtLocatorField(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/investigations");
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
    public BtLocatorInvestigations setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorInvestigations(_client, copyUriBuilder, copyMap);
    }

    public Investigations get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Investigations.class);
    }

    public Investigations get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/newBuildTypeDescription");
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
    public BtLocatorNewBuildTypeDescription setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorNewBuildTypeDescription(_client, copyUriBuilder, copyMap);
    }

    /**
     * For compatibility with experimental feature of 8.0
     */
    public NewBuildTypeDescription get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/parameters");
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
    public BtLocatorParameters setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorParameters(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties get(String locator, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("locator", locator);
      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public Property post(Property input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Property.class);
    }

    public Property post(Property input, String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "property"), Property.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/parameters/{name}");
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
    public BtLocatorParametersName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorParametersName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorParametersName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new BtLocatorParametersName(_client, copyUriBuilder, copyMap);
    }

    public String putTextPlain(Object input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
    }

    public String getAsString() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    public Property getAsProperty() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Property.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/settings");
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
    public BtLocatorSettings setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorSettings(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/settings/{name}");
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
    public BtLocatorSettingsName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorSettingsName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorSettingsName setName(String name) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("name", name);
      return new BtLocatorSettingsName(_client, copyUriBuilder, copyMap);
    }

    public String get() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.getAsString(resource);
    }

    public <T> String putAsTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "text/plain");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "*/*")).invoke();
      if (!Response.class.isAssignableFrom(String.class)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getStringValue(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/snapshot-dependencies");
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
    public BtLocatorSnapshotDependencies setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorSnapshotDependencies(_client, copyUriBuilder, copyMap);
    }

    public PropEntitiesSnapshotDep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesSnapshotDep.class);
    }

    /**
     * Replaces snapshot dependency with those sent in request.
     */
    public PropEntitiesSnapshotDep put(PropEntitiesSnapshotDep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependencies"), PropEntitiesSnapshotDep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/snapshot-dependencies/{snapshotDepLocator}");
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
    public BtLocatorSnapshotDependenciesSnapshotDepLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, copyUriBuilder, copyMap);
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
    public BtLocatorSnapshotDependenciesSnapshotDepLocator setSnapshotdeplocator(String snapshotdeplocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("snapshotDepLocator", snapshotdeplocator);
      return new BtLocatorSnapshotDependenciesSnapshotDepLocator(_client, copyUriBuilder, copyMap);
    }

    public PropEntitySnapshotDep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitySnapshotDep.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntitySnapshotDep put(PropEntitySnapshotDep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "snapshot-dependency"), PropEntitySnapshotDep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps");
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
    public BtLocatorSteps setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorSteps(_client, copyUriBuilder, copyMap);
    }

    public PropEntityStep post(PropEntityStep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityStep.class);
    }

    public PropEntitiesStep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesStep.class);
    }

    public PropEntitiesStep put(PropEntitiesStep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "steps"), PropEntitiesStep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}");
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
    public BtLocatorStepsStepId setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorStepsStepId(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepId setStepid(String stepid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("stepId", stepid);
      return new BtLocatorStepsStepId(_client, copyUriBuilder, copyMap);
    }

    public PropEntityStep get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityStep.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntityStep put(PropEntityStep input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "step"), PropEntityStep.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/{fieldName}");
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
    public BtLocatorStepsStepIdFieldName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepIdFieldName setStepid(String stepid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("stepId", stepid);
      return new BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepIdFieldName setFieldname(String fieldname) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("fieldName", fieldname);
      return new BtLocatorStepsStepIdFieldName(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters");
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
    public BtLocatorStepsStepIdParameters setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorStepsStepIdParameters(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepIdParameters setStepid(String stepid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("stepId", stepid);
      return new BtLocatorStepsStepIdParameters(_client, copyUriBuilder, copyMap);
    }

    public Properties get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(Properties.class);
    }

    public Properties put(Properties input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "properties"), Properties.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/steps/{stepId}/parameters/{parameterName}");
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
    public BtLocatorStepsStepIdParametersParameterName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepIdParametersParameterName setStepid(String stepid) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("stepId", stepid);
      return new BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorStepsStepIdParametersParameterName setParametername(String parametername) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("parameterName", parametername);
      return new BtLocatorStepsStepIdParametersParameterName(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/template");
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
    public BtLocatorTemplate setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorTemplate(_client, copyUriBuilder, copyMap);
    }

    public BuildType get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    public BuildType get(String fields) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(BuildType.class);
    }

    public <T> T putTextPlain(Object input, Class<T> returnType) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    public <T> T putTextPlain(Object input, String fields, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("fields", fields);

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build("PUT", Entity.entity(input, "text/plain")).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers");
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
    public BtLocatorTriggers setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorTriggers(_client, copyUriBuilder, copyMap);
    }

    public PropEntitiesTrigger get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntitiesTrigger.class);
    }

    /**
     * Creates new trigger. 'id' attribute is ignored in the submitted descriptor.
     * Reports error if new trigger cannot be created (e.g. only single trigger of the type is allowed
     * for a build configuration).
     */
    public PropEntityTrigger post(PropEntityTrigger input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityTrigger.class);
    }

    /**
     * Replaces trigger with those sent inthe request.
     */
    public PropEntitiesTrigger put(PropEntitiesTrigger input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "triggers"), PropEntitiesTrigger.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}");
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
    public BtLocatorTriggersTriggerLocator setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorTriggersTriggerLocator(_client, copyUriBuilder, copyMap);
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
    public BtLocatorTriggersTriggerLocator setTriggerlocator(String triggerlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("triggerLocator", triggerlocator);
      return new BtLocatorTriggersTriggerLocator(_client, copyUriBuilder, copyMap);
    }

    public PropEntityTrigger get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(PropEntityTrigger.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      return TeamcityJetbrainsCom.delete(resource);
    }

    public PropEntityTrigger put(PropEntityTrigger input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "trigger"), PropEntityTrigger.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/triggers/{triggerLocator}/{fieldName}");
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
    public BtLocatorTriggersTriggerLocatorFieldName setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorTriggersTriggerLocatorFieldName setTriggerlocator(String triggerlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("triggerLocator", triggerlocator);
      return new BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
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
    public BtLocatorTriggersTriggerLocatorFieldName setFieldname(String fieldname) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("fieldName", fieldname);
      return new BtLocatorTriggersTriggerLocatorFieldName(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/children{path:(/.*)?}");
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
    public BtLocatorVcsFilesLatestChildrenpath setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
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
    public BtLocatorVcsFilesLatestChildrenpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BtLocatorVcsFilesLatestChildrenpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Lists files in VCS
     * Experimental support only
     */
    public Files get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/content{path:(/.*)?}");
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
    public BtLocatorVcsFilesLatestContentpath setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsFilesLatestContentpath(_client, copyUriBuilder, copyMap);
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
    public BtLocatorVcsFilesLatestContentpath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BtLocatorVcsFilesLatestContentpath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Gets content of a file form VCS
     * Experimental support only
     */
    public <T> T getAs(Class<T> returnType) {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
    }

    /**
     * Gets content of a file form VCS
     * Experimental support only
     */
    public <T> T getAs(Boolean resolveparameters, Class<T> returnType) {
      UriBuilder localUriBuilder = _uriBuilder.clone();

      localUriBuilder = localUriBuilder.replaceQueryParam("resolveParameters", resolveparameters);

      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(localUriBuilder, _client, _templateAndMatrixParameterValues);
      javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("*/*");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      if (!Response.class.isAssignableFrom(returnType)) {
        TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      }
      return TeamcityJetbrainsCom.getReturnValue(returnType, response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}");
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
    public BtLocatorVcsFilesLatestMetadatapath setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
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
    public BtLocatorVcsFilesLatestMetadatapath setPath(String path) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("path", path);
      return new BtLocatorVcsFilesLatestMetadatapath(_client, copyUriBuilder, copyMap);
    }

    /**
     * Gets VCS file details
     * Experimental support only
     */
    public File get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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

      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(localUriBuilder, _client, _templateAndMatrixParameterValues, "application/json");Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcsLabeling");
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
    public BtLocatorVcsLabeling setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsLabeling(_client, copyUriBuilder, copyMap);
    }

    /**
     * Gets VCS labeling settings
     * Experimental support only
     */
    public VcsLabelingOptions get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcsLabeling"), VcsLabelingOptions.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries");
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
    public BtLocatorVcsRootEntries setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsRootEntries(_client, copyUriBuilder, copyMap);
    }

    public VcsRootEntries get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootEntries.class);
    }

    public VcsRootEntries put(VcsRootEntries input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entries"), VcsRootEntries.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootEntries.class);
    }

    public VcsRootEntry post(VcsRootEntry input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("POST", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}");
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
    public BtLocatorVcsRootEntriesId setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsRootEntriesId(_client, copyUriBuilder, copyMap);
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
    public BtLocatorVcsRootEntriesId setId(String id) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("id", id);
      return new BtLocatorVcsRootEntriesId(_client, copyUriBuilder, copyMap);
    }

    public VcsRootEntry get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootEntry.class);
    }

    public VcsRootEntry put(VcsRootEntry input) {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build("PUT", Entity.entity(new JAXBElement(new QName("", "vcs-root-entry"), VcsRootEntry.class, input), "application/json")).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootEntry.class);
    }

    public Response delete() {
      WebTarget resource = TeamcityJetbrainsCom.getWebTarget(_uriBuilder, _client, _templateAndMatrixParameterValues);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-entries/{id}/checkout-rules");
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
    public BtLocatorVcsRootEntriesIdCheckoutRules setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsRootEntriesIdCheckoutRules(_client, copyUriBuilder, copyMap);
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
    public BtLocatorVcsRootEntriesIdCheckoutRules setId(String id) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("id", id);
      return new BtLocatorVcsRootEntriesIdCheckoutRules(_client, copyUriBuilder, copyMap);
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
      template = TeamcityJetbrainsCom.getTemplateBuilder("app/rest/buildTypes/{btLocator}/vcs-root-instances");
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
    public BtLocatorVcsRootInstances setBtlocator(String btlocator) {
      Map<String, Object> copyMap;
      copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
      UriBuilder copyUriBuilder = _uriBuilder.clone();
      copyMap.put("btLocator", btlocator);
      return new BtLocatorVcsRootInstances(_client, copyUriBuilder, copyMap);
    }

    /**
     * Experimental support only!
     */
    public VcsRootInstances get() {
      javax.ws.rs.client.Invocation.Builder resourceBuilder = TeamcityJetbrainsCom.getBuilder(_uriBuilder, _client, _templateAndMatrixParameterValues, "application/json");
      Response response = resourceBuilder.build(TeamcityJetbrainsCom.METHOD_GET).invoke();
      TeamcityJetbrainsCom.throwExceptionIfWrongStatus(response);
      return response.readEntity(VcsRootInstances.class);
    }
  }
}
