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
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getArtifactMetadata(String path, String buildLocator, Boolean resolveParameters, String locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void pinBuild(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getPinned(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void unpinBuild(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteBuild(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response cancelBuild(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuild(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response addTag(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response replaceTags(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void addTags(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveTags(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getProblems(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getArtifacts(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getCanceledInfo(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getTests(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response cancelBuild(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildStatisticValues(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildStatisticValue(String name, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void replaceComment(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteComment(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildStatusIcon(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParameter(String propertyName, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildFieldByBuildOnly(String field, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildActualParameters(String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getArtifactChildren(String path, String buildLocator, Boolean resolveParameters, String locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getArtifactContent(String path, String buildLocator, Boolean resolveParameters, Boolean logBuildUsage) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getArtifactFilesContent(String path, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveSourceFile(String fileName, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildRelatedIssuesOld(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildRelatedIssues(String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }

}
