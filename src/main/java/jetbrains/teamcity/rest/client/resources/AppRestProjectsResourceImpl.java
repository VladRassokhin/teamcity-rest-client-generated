/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.core.Response;

public class AppRestProjectsResourceImpl implements AppRestProjectsResource {


    public Response serveProjects(String fields) {
        //TODO: implement
        return null;
    }


    public Response createProject() {
        //TODO: implement
        return null;
    }


    public Response createEmptyProject() {
        //TODO: implement
        return null;
    }


    public Response createBuildTypeTemplate(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveTemplatesInProject(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response createEmptyBuildTypeTemplate(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveParameters(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response changeAllParameters(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteAllParameters(String projectLocator) {
        //TODO: implement
    }


    public Response setParameter(String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response putParameter(String projectLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response getParameterValue(String projectLocator, String name) {
        //TODO: implement
        return null;
    }


    public Response getParameter(String projectLocator, String name) {
        //TODO: implement
        return null;
    }


    public void deleteParameter(String projectLocator, String name) {
        //TODO: implement
    }


    public Response serveBuildTypeFieldWithProject(String field, String projectLocator, String btLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildFieldWithProject(String field, String projectLocator, String btLocator, String buildLocator) {
        //TODO: implement
        return null;
    }


    public Response setParentProject(String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response getParentProject(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getProjectAgentPools(String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response setProjectAgentPools(String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response setProjectAgentPools(String projectLocator) {
        //TODO: implement
        return null;
    }


    public void getProjectAgentPools(String projectLocator, String agentPoolLocator) {
        //TODO: implement
    }


    public Response setProjectFiled(String field, String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response serveProjectField(String field, String projectLocator) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypesInProject(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response createEmptyBuildType(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response createBuildType(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildType(String projectLocator, String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildTypeTemplates(String projectLocator, String btLocator, String fields) {
        //TODO: implement
        return null;
    }


    public Response getExampleNewProjectDescriptionCompatibilityVersion1(String projectLocator, String id) {
        //TODO: implement
        return null;
    }


    public Response getExampleNewProjectDescription(String projectLocator, String id) {
        //TODO: implement
        return null;
    }


    public Response serveProject(String projectLocator, String fields) {
        //TODO: implement
        return null;
    }


    public void deleteProject(String projectLocator) {
        //TODO: implement
    }


    public Response serveBuilds(String projectLocator, String btLocator, String status, String triggeredByUser, 
                Boolean includePersonal, Boolean includeCanceled, Boolean onlyPinned, String tag, 
                String agentName, String sinceBuild, String sinceDate, Long start, 
                Integer count, String locator, String fields) {
        //TODO: implement
        return null;
    }


    public Response serveBuildWithProject(String projectLocator, String btLocator, String buildLocator, String fields) {
        //TODO: implement
        return null;
    }

}