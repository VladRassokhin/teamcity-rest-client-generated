/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.BuildQueueResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class BuildQueueResourceImpl extends ResourceImpl implements BuildQueueResource {


    public BuildQueueResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response replaceBuilds(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response queueNewBuild() {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteBuildsExperimental(String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getBuilds(String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteBuild(String queuedBuildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response cancelBuild(String queuedBuildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getBuild(String queuedBuildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveCompatibleAgents(String queuedBuildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildFieldByBuildOnly(String field, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }

}
