/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ChangesResource;

import javax.ws.rs.core.Response;

public class ChangesResourceImpl implements ChangesResource {


    public Response serveChanges(String project, String buildType, String build, String vcsRoot, 
                String sinceChange, Long start, Integer count, String locator, 
                String fields) {
        //TODO: implement
        return null;
    }


    public Response getChangeField(String field, String changeLocator) {
        //TODO: implement
        return null;
    }


    public Response getParentChanges(String changeLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getChangeParentRevisions(String changeLocator) {
        //TODO: implement
        return null;
    }


    public Response getChangeVCSRoot(String changeLocator) {
        //TODO: implement
        return null;
    }


    public Response getChangeAttributes(String changeLocator) {
        //TODO: implement
        return null;
    }


    public Response getChangeDuplicates(String changeLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getChangeIssue(String changeLocator) {
        //TODO: implement
        return null;
    }


    public Response getRelatedBuildTypes(String changeLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getChangeFirstBuilds(String changeLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveChange(String changeLocator, String fields) {
        //TODO: implement
        return null;
    }

}
