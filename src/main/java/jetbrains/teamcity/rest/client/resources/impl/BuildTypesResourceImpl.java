/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import com.google.api.client.http.HttpResponse;
import jetbrains.teamcity.rest.client.model.BuildType;
import jetbrains.teamcity.rest.client.resources.BuildTypesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;
import java.io.IOException;

public class BuildTypesResourceImpl extends ResourceImpl implements BuildTypesResource {

  public BuildTypesResourceImpl(@NotNull RequestsProcessor processor) {
    super(processor);
  }

  public BuildType addBuildType(@NotNull BuildType type, String fields) {
    final HttpResponse response = processor.post("/buildTypes", processor.asJson(type));
    try {
      if ("application/json".equals(response.getContentType())) {
        return response.parseAs(BuildType.class);
      } else {
        // Not good.
        System.err.println("Error: " + response.parseAsString());
        return null;
      }
    } catch (IOException e) {
      return null;
    }
  }


  public Response getBuildTypes(String locator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getAgentRequirements(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addAgentRequirement(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceAgentRequirements(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addFeature(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatures(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeatures(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSnapshotDep(String btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteSnapshotDep(String btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSnapshotDep(String btLocator, String snapshotDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntry(String id, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response updateVcsRootEntry(String id, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteVcsRootEntry(String id, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getArtifactDep(String btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteArtifactDep(String btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceArtifactDep(String btLocator, String artifactDepLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTrigger(String btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteTrigger(String btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceTrigger(String btLocator, String triggerLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getAgentRequirement(String btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteAgentRequirement(String btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceAgentRequirement(String btLocator, String agentRequirementLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setParameterValue(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getParameterValue(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getParameter(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteBuildTypeParameter(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTriggers(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addTrigger(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceTriggers(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addStep(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSteps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSteps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getInvestigations(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntries(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceVcsRootEntries(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addVcsRootEntry(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStep(String btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteStep(String btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceStep(String btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepParameters(String btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceStepParameters(String btLocator, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepParameter(String btLocator, String stepId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addStepParameter(String btLocator, String stepId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getStepSetting(String btLocator, String fieldName, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeStepSetting(String btLocator, String fieldName, String stepId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteFeature(String btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeature(String btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeature(String btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureParameters(String btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceFeatureParameters(String btLocator, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureParameter(String btLocator, String featureId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addFeatureParameter(String btLocator, String featureId, String parameterName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getFeatureSetting(String btLocator, String name, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeFeatureSetting(String btLocator, String name, String featureId) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getArtifactDeps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceArtifactDeps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addArtifactDep(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getSnapshotDeps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceSnapshotDeps(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response addSnapshotDep(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTriggerSetting(String btLocator, String triggerLocator, String fieldName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeTriggerSetting(String btLocator, String triggerLocator, String fieldName) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVCSLabelingOptions(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setVCSLabelingOptions(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFileContent(String btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFileListing(String btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsFile(String btLocator, String path, Boolean resolveParameters) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getExampleNewProjectDescriptionCompatibilityVersion1(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getExampleNewProjectDescription(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getCurrentVcsInstances(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuilds(String btLocator, String status, String triggeredByUser, Boolean includePersonal,
                              Boolean includeCanceled, Boolean onlyPinned, String tag, String agentName,
                              String sinceBuild, String sinceDate, Long start, Integer count,
                              String locator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildWithProject(String btLocator, String buildLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildField(String field, String btLocator, String buildLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBranches(String btLocator, String locator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeXML(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteBuildType(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeField(String field, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setBuildTypeField(String field, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeBuildsTags(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeParameters(String btLocator, String locator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response changeBuildTypeParameters(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteAllBuildTypeParameters(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response setParameter(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeSettings(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response replaceBuildTypeSettings(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeSettings(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response putBuildTypeSetting(String btLocator, String name) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response serveBuildTypeTemplate(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getTemplateAssociation(String btLocator, String fields) {
    throw new java.lang.UnsupportedOperationException();
  }


  public void deleteTemplateAssociation(String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response getVcsRootEntryCheckoutRules(String id, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }


  public Response updateVcsRootEntryCheckoutRules(String id, String btLocator) {
    throw new java.lang.UnsupportedOperationException();
  }

}
