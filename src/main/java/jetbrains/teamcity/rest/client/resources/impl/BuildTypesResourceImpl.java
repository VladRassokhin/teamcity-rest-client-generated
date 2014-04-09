/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import com.google.api.client.http.HttpResponse;
import jetbrains.teamcity.rest.client.model.BuildType;
import jetbrains.teamcity.rest.client.model.BuildTypes;
import jetbrains.teamcity.rest.client.model.PropEntityStep;
import jetbrains.teamcity.rest.client.model.VcsRootEntry;
import jetbrains.teamcity.rest.client.resources.BuildTypesResource;
import jetbrains.teamcity.rest.client.resources.Locator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class BuildTypesResourceImpl extends ResourceImpl implements BuildTypesResource {

  public static final String BUILD_TYPES = "/buildTypes";

  public BuildTypesResourceImpl(@NotNull RequestsProcessor processor) {
    super(processor);
  }

  public BuildType addBuildType(@NotNull BuildType type) {
    final HttpResponse response = processor.post(BUILD_TYPES, processor.asJson(type));
    return safeParse(response, BuildType.class);
  }

  public BuildType getBuildType(Locator locator) {
    final HttpResponse response = processor.get(BUILD_TYPES + "/" + locator.toString());
    return safeParse(response, BuildType.class);
  }

  public BuildTypes getBuildTypes(Locator locator) {
    final HttpResponse response = processor.get(BUILD_TYPES + "/" + locator.toString());
    return safeParse(response, BuildTypes.class);
  }


  public Response getAgentRequirements(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addAgentRequirement(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceAgentRequirements(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addFeature(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatures(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeatures(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSnapshotDep(Locator btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteSnapshotDep(Locator btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSnapshotDep(Locator btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntry(String id, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response updateVcsRootEntry(String id, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteVcsRootEntry(String id, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getArtifactDep(Locator btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteArtifactDep(Locator btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceArtifactDep(Locator btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTrigger(Locator btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteTrigger(Locator btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceTrigger(Locator btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getAgentRequirement(Locator btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteAgentRequirement(Locator btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceAgentRequirement(Locator btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setParameterValue(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getParameterValue(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getParameter(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteBuildTypeParameter(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTriggers(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addTrigger(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceTriggers(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addStep(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSteps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSteps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getInvestigations(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntries(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceVcsRootEntries(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public VcsRootEntry addVcsRootEntry(Locator btLocator, @NotNull VcsRootEntry entry) {
    final HttpResponse response = processor.post(BUILD_TYPES + "/" + btLocator.toString() + "/vcs-root-entries", processor.asJson(entry));
    return safeParse(response, VcsRootEntry.class);
  }


  public PropEntityStep getStep(Locator btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteStep(Locator btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceStep(Locator btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepParameters(Locator btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceStepParameters(Locator btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepParameter(Locator btLocator, String stepId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addStepParameter(Locator btLocator, String stepId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepSetting(Locator btLocator, String fieldName, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeStepSetting(Locator btLocator, String fieldName, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteFeature(Locator btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeature(Locator btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeature(Locator btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureParameters(Locator btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeatureParameters(Locator btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureParameter(Locator btLocator, String featureId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addFeatureParameter(Locator btLocator, String featureId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureSetting(Locator btLocator, String name, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeFeatureSetting(Locator btLocator, String name, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getArtifactDeps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceArtifactDeps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addArtifactDep(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSnapshotDeps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSnapshotDeps(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addSnapshotDep(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTriggerSetting(Locator btLocator, String triggerLocator, String fieldName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeTriggerSetting(Locator btLocator, String triggerLocator, String fieldName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVCSLabelingOptions(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setVCSLabelingOptions(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFileContent(Locator btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFileListing(Locator btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFile(Locator btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getExampleNewProjectDescriptionCompatibilityVersion1(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getExampleNewProjectDescription(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getCurrentVcsInstances(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuilds(Locator btLocator, String status, String triggeredByUser, Boolean includePersonal,
                              Boolean includeCanceled, Boolean onlyPinned, String tag, String agentName,
                              String sinceBuild, String sinceDate, Long start, Integer count,
                              String locator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildWithProject(Locator btLocator, String buildLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildField(String field, Locator btLocator, String buildLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBranches(Locator btLocator, String locator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeXML(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteBuildType(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeField(String field, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setBuildTypeField(String field, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeBuildsTags(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeParameters(Locator btLocator, String locator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeBuildTypeParameters(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteAllBuildTypeParameters(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setParameter(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeSettings(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceBuildTypeSettings(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeSettings(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response putBuildTypeSetting(Locator btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeTemplate(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTemplateAssociation(Locator btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteTemplateAssociation(Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntryCheckoutRules(String id, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response updateVcsRootEntryCheckoutRules(String id, Locator btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }

}
