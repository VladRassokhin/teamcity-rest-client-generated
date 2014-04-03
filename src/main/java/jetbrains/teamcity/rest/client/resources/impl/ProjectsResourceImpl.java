/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import jetbrains.teamcity.rest.client.resources.ProjectsResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.teamcity.rest.client.RequestsProcessor;

import javax.ws.rs.core.Response;

public class ProjectsResourceImpl extends ResourceImpl implements ProjectsResource {

    public ProjectsResourceImpl(@NotNull RequestsProcessor processor) {
        super(processor);
    }

    public Response serveProjects(String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createProject() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createEmptyProject() {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createBuildTypeTemplate(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveTemplatesInProject(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createEmptyBuildTypeTemplate(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveParameters(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response changeAllParameters(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteAllParameters(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setParameter(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response putParameter(String projectLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParameterValue(String projectLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParameter(String projectLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteParameter(String projectLocator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypeFieldWithProject(String field, String projectLocator, String btLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildFieldWithProject(String field, String projectLocator, String btLocator, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setParentProject(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParentProject(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getProjectAgentPools(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setProjectAgentPools(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void getProjectAgentPools(String projectLocator, String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setProjectFiled(String field, String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveProjectField(String field, String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypesInProject(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createEmptyBuildType(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createBuildType(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildType(String projectLocator, String btLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypeTemplates(String projectLocator, String btLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getExampleNewProjectDescriptionCompatibilityVersion1(String projectLocator, String id) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getExampleNewProjectDescription(String projectLocator, String id) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveProject(String projectLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteProject(String projectLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuilds(String projectLocator, String btLocator, String status, String triggeredByUser,
                                Boolean includePersonal, Boolean includeCanceled, Boolean onlyPinned, String tag,
                                String agentName, String sinceBuild, String sinceDate, Long start,
                                Integer count, String locator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildWithProject(String projectLocator, String btLocator, String buildLocator, String fields) {
        throw new java.lang.UnsupportedOperationException();
    }

}
