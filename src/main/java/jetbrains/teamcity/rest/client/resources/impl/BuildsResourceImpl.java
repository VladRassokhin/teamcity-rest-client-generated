/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.BuildsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class BuildsResourceImpl extends ResourceImpl implements BuildsResource {

    public BuildsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveAllBuilds(String buildType, String status, String triggeredByUser, Boolean includePersonal,
                Boolean includeCanceled, Boolean onlyPinned, String tag, String agentName, 
                String sinceBuild, String sinceDate, Long start, Integer count, 
                String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getArtifactMetadata(String path, String buildLocator, Boolean resolveParameters, String locator) {
        //TODO: implement
        return null;
    }


    public void pinBuild(String buildLocator) {
        //TODO: implement
    }


    public Response getPinned(String buildLocator) {
        //TODO: implement
        return null;
    }


    public void unpinBuild(String buildLocator) {
        //TODO: implement
    }


    public void deleteBuild(String buildLocator) {
        //TODO: implement
    }


    public Response cancelBuild(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuild(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response addTag(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response replaceTags(String buildLocator) {
        //TODO: implement
        return null;
    }


    public void addTags(String buildLocator) {
        //TODO: implement
    }


    public Response serveTags(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response getProblems(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getArtifacts(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response getCanceledInfo(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getTests(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response cancelBuild(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildStatisticValues(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildStatisticValue(String name, String buildLocator) {
        //TODO: implement
        return null;
    }


    public void replaceComment(String buildLocator) {
        //TODO: implement
    }


    public void deleteComment(String buildLocator) {
        //TODO: implement
    }


    public Response serveBuildStatusIcon(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response getParameter(String propertyName, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildFieldByBuildOnly(String field, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildActualParameters(String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response getArtifactChildren(String path, String buildLocator, Boolean resolveParameters, String locator) {
        //TODO: implement
        return null;
    }


    public Response getArtifactContent(String path, String buildLocator, Boolean resolveParameters, Boolean logBuildUsage) {
        //TODO: implement
        return null;
    }


    public Response getArtifactFilesContent(String path, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveSourceFile(String fileName, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildRelatedIssuesOld(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildRelatedIssues(String buildLocator, String fields) {
        //TODO: implement
        return null;
    }

}
