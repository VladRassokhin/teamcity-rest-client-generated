/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.VcsRootInstancesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class VcsRootInstancesResourceImpl extends ResourceImpl implements VcsRootInstancesResource {


    public VcsRootInstancesResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveInstances(String locator) {
        //TODO: implement
        return null;
    }


    public Response getRepositoryState(String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response setRepositoryState(String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response serveRootInstanceProperties(String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response serveInstanceField(String field, String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response setInstanceField(String field, String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response getRepositoryStateCreationDate(String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }


    public Response getVcsFileContent(String vcsRootInstanceLocator, String path) {
        //TODO: implement
        return null;
    }


    public Response getVcsFileListing(String vcsRootInstanceLocator, String path) {
        //TODO: implement
        return null;
    }


    public Response getVcsFile(String vcsRootInstanceLocator, String path) {
        //TODO: implement
        return null;
    }


    public Response serveInstance(String vcsRootInstanceLocator) {
        //TODO: implement
        return null;
    }

}
