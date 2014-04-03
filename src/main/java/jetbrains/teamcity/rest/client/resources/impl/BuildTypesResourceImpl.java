/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.BuildTypesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class BuildTypesResourceImpl extends ResourceImpl implements BuildTypesResource {

    public BuildTypesResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response addBuildType(String fields) {
        //TODO: implement
        return null;
    }


    public Response getBuildTypes(String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getAgentRequirements(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addAgentRequirement(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceAgentRequirements(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addFeature(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getFeatures(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceFeatures(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getSnapshotDep(String btLocator, String snapshotDepLocator) {
        //TODO: implement
        return null;
    }


    public void deleteSnapshotDep(String btLocator, String snapshotDepLocator) {
        //TODO: implement
    }


    public Response replaceSnapshotDep(String btLocator, String snapshotDepLocator) {
        //TODO: implement
        return null;
    }


    public Response getVcsRootEntry(String id, String btLocator) {
        //TODO: implement
        return null;
    }


    public Response updateVcsRootEntry(String id, String btLocator) {
        //TODO: implement
        return null;
    }


    public void deleteVcsRootEntry(String id, String btLocator) {
        //TODO: implement
    }


    public Response getArtifactDep(String btLocator, String artifactDepLocator) {
        //TODO: implement
        return null;
    }


    public void deleteArtifactDep(String btLocator, String artifactDepLocator) {
        //TODO: implement
    }


    public Response replaceArtifactDep(String btLocator, String artifactDepLocator) {
        //TODO: implement
        return null;
    }


    public Response getTrigger(String btLocator, String triggerLocator) {
        //TODO: implement
        return null;
    }


    public void deleteTrigger(String btLocator, String triggerLocator) {
        //TODO: implement
    }


    public Response replaceTrigger(String btLocator, String triggerLocator) {
        //TODO: implement
        return null;
    }


    public Response getAgentRequirement(String btLocator, String agentRequirementLocator) {
        //TODO: implement
        return null;
    }


    public void deleteAgentRequirement(String btLocator, String agentRequirementLocator) {
        //TODO: implement
    }


    public Response replaceAgentRequirement(String btLocator, String agentRequirementLocator) {
        //TODO: implement
        return null;
    }


    public Response setParameterValue(String btLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response getParameterValue(String btLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response getParameter(String btLocator, String name) {
        //TODO: implement
        return null;
    }


    public void deleteBuildTypeParameter(String btLocator, String name) {
        //TODO: implement
    }


    public Response getTriggers(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addTrigger(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceTriggers(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addStep(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getSteps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceSteps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getInvestigations(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getVcsRootEntries(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceVcsRootEntries(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addVcsRootEntry(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getStep(String btLocator, String stepId) {
        //TODO: implement
        return null;
    }


    public void deleteStep(String btLocator, String stepId) {
        //TODO: implement
    }


    public Response replaceStep(String btLocator, String stepId) {
        //TODO: implement
        return null;
    }


    public Response getStepParameters(String btLocator, String stepId) {
        //TODO: implement
        return null;
    }


    public Response replaceStepParameters(String btLocator, String stepId) {
        //TODO: implement
        return null;
    }


    public Response getStepParameter(String btLocator, String stepId, String parameterName) {
        //TODO: implement
        return null;
    }


    public Response addStepParameter(String btLocator, String stepId, String parameterName) {
        //TODO: implement
        return null;
    }


    public Response getStepSetting(String btLocator, String fieldName, String stepId) {
        //TODO: implement
        return null;
    }


    public Response changeStepSetting(String btLocator, String fieldName, String stepId) {
        //TODO: implement
        return null;
    }


    public void deleteFeature(String btLocator, String featureId) {
        //TODO: implement
    }


    public Response replaceFeature(String btLocator, String featureId) {
        //TODO: implement
        return null;
    }


    public Response getFeature(String btLocator, String featureId) {
        //TODO: implement
        return null;
    }


    public Response getFeatureParameters(String btLocator, String featureId) {
        //TODO: implement
        return null;
    }


    public Response replaceFeatureParameters(String btLocator, String featureId) {
        //TODO: implement
        return null;
    }


    public Response getFeatureParameter(String btLocator, String featureId, String parameterName) {
        //TODO: implement
        return null;
    }


    public Response addFeatureParameter(String btLocator, String featureId, String parameterName) {
        //TODO: implement
        return null;
    }


    public Response getFeatureSetting(String btLocator, String name, String featureId) {
        //TODO: implement
        return null;
    }


    public Response changeFeatureSetting(String btLocator, String name, String featureId) {
        //TODO: implement
        return null;
    }


    public Response getArtifactDeps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceArtifactDeps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addArtifactDep(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getSnapshotDeps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceSnapshotDeps(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response addSnapshotDep(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getTriggerSetting(String btLocator, String triggerLocator, String fieldName) {
        //TODO: implement
        return null;
    }


    public Response changeTriggerSetting(String btLocator, String triggerLocator, String fieldName) {
        //TODO: implement
        return null;
    }


    public Response getVCSLabelingOptions(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response setVCSLabelingOptions(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getVcsFileContent(String btLocator, String path, Boolean resolveParameters) {
        //TODO: implement
        return null;
    }


    public Response getVcsFileListing(String btLocator, String path, Boolean resolveParameters) {
        //TODO: implement
        return null;
    }


    public Response getVcsFile(String btLocator, String path, Boolean resolveParameters) {
        //TODO: implement
        return null;
    }


    public Response getExampleNewProjectDescriptionCompatibilityVersion1(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getExampleNewProjectDescription(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response getCurrentVcsInstances(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuilds(String btLocator, String status, String triggeredByUser, Boolean includePersonal, 
                Boolean includeCanceled, Boolean onlyPinned, String tag, String agentName, 
                String sinceBuild, String sinceDate, Long start, Integer count, 
                String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildWithProject(String btLocator, String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildField(String field, String btLocator, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBranches(String btLocator, String locator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeXML(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteBuildType(String btLocator) {
        //TODO: implement
    }


    public Response serveBuildTypeField(String field, String btLocator) {
        //TODO: implement
        return null;
    }


    public Response setBuildTypeField(String field, String btLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeBuildsTags(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeParameters(String btLocator, String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response changeBuildTypeParameters(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteAllBuildTypeParameters(String btLocator) {
        //TODO: implement
    }


    public Response setParameter(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeSettings(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceBuildTypeSettings(String btLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeSettings(String btLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response putBuildTypeSetting(String btLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeTemplate(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getTemplateAssociation(String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteTemplateAssociation(String btLocator) {
        //TODO: implement
    }


    public Response getVcsRootEntryCheckoutRules(String id, String btLocator) {
        //TODO: implement
        return null;
    }


    public Response updateVcsRootEntryCheckoutRules(String id, String btLocator) {
        //TODO: implement
        return null;
    }

}
