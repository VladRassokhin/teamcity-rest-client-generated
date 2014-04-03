/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ChangesResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class ChangesResourceImpl extends ResourceImpl implements ChangesResource {

    public ChangesResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveChanges(String project, String buildType, String build, String vcsRoot,
                                 String sinceChange, Long start, Integer count, String locator,
                                 String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeField(String field, String changeLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParentChanges(String changeLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeParentRevisions(String changeLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeVCSRoot(String changeLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeAttributes(String changeLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeDuplicates(String changeLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeIssue(String changeLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getRelatedBuildTypes(String changeLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getChangeFirstBuilds(String changeLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveChange(String changeLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }

}
