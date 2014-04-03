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
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getRepositoryState(String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setRepositoryState(String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveRootInstanceProperties(String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveInstanceField(String field, String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setInstanceField(String field, String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getRepositoryStateCreationDate(String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getVcsFileContent(String vcsRootInstanceLocator, String path) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getVcsFileListing(String vcsRootInstanceLocator, String path) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getVcsFile(String vcsRootInstanceLocator, String path) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveInstance(String vcsRootInstanceLocator) {
        throw new java.lang.UnsupportedOperationException();
    }

}
