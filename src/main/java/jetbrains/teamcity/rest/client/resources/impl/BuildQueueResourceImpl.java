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
        //TODO: implement
        return null;
    }


    public Response queueNewBuild() {
        //TODO: implement
        return null;
    }


    public void deleteBuildsExperimental(String locator, String fields) {
        //TODO: implement
    }


    public Response getBuilds(String locator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteBuild(String queuedBuildLocator) {
        //TODO: implement
    }


    public Response cancelBuild(String queuedBuildLocator) {
        //TODO: implement
        return null;
    }


    public Response getBuild(String queuedBuildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveCompatibleAgents(String queuedBuildLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildFieldByBuildOnly(String field, String buildLocator) {
        //TODO: implement
        return null;
    }

}
