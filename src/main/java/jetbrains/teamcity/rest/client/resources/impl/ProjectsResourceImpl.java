/**
 * Created by Apache CXF WadlToJava code generator
 **/
package jetbrains.teamcity.rest.client.resources.impl;

import com.google.api.client.http.HttpResponse;
import jetbrains.teamcity.rest.client.model.Project;
import jetbrains.teamcity.rest.client.resources.Locator;
import jetbrains.teamcity.rest.client.resources.ProjectsResource;
import kotlin.Triple;
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


    public Response createBuildTypeTemplate(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveTemplatesInProject(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createEmptyBuildTypeTemplate(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveParameters(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response changeAllParameters(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteAllParameters(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setParameter(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response putParameter(Locator locator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParameterValue(Locator locator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParameter(Locator locator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void deleteParameter(Locator locator, String name) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypeFieldWithProject(String field, Locator locator, String btLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildFieldWithProject(String field, Locator locator, String btLocator, String buildLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setParentProject(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getParentProject(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getProjectAgentPools(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setProjectAgentPools(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public void getProjectAgentPools(Locator locator, String agentPoolLocator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response setProjectFiled(String field, Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveProjectField(String field, Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypesInProject(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createEmptyBuildType(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response createBuildType(Locator locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildType(Locator locator, String btLocator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildTypeTemplates(Locator locator, String btLocator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getExampleNewProjectDescriptionCompatibilityVersion1(Locator locator, String id) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response getExampleNewProjectDescription(Locator locator, String id) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Project getProject(Locator locator/*, String fields*/) {
      final Triple<Project, Exception, HttpResponse> pair = processor.getSafeAs("/projects/" + locator.toString(), Project.class);
      final int code = pair.getThird().getStatusCode();
      if (code != 200) {
        if (code == 404) {
          // Not found
          return null;
        }
        // Error.
        final Exception exception = pair.getSecond();
        if (exception != null) {
          throw new RuntimeException(exception);
        }
        return null;
      }
      return pair.getFirst();
    }


    public void deleteProject(Locator locator) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuilds(Locator plocator, String btLocator, String status, String triggeredByUser,
                                Boolean includePersonal, Boolean includeCanceled, Boolean onlyPinned, String tag,
                                String agentName, String sinceBuild, String sinceDate, Long start,
                                Integer count, String locator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }


    public Response serveBuildWithProject(Locator locator, String btLocator, String buildLocator/*, String fields*/) {
        throw new java.lang.UnsupportedOperationException();
    }

}
