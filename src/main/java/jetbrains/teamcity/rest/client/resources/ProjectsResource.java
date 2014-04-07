/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import jetbrains.teamcity.rest.client.model.Project;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/projects")
public interface ProjectsResource {

  @GET
  @Produces({"application/xml", "application/json"})
  Response serveProjects(@QueryParam("fields") String fields);

  @POST
  @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response createProject();

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    Response createEmptyProject();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    Response createBuildTypeTemplate(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/templates")
  Response serveTemplatesInProject(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @POST
  @Consumes("text/plain")
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/templates")
  Response createEmptyBuildTypeTemplate(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parameters")
  Response serveParameters(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @PUT
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parameters")
  Response changeAllParameters(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @DELETE
  @Path("/{projectLocator}/parameters")
  void deleteAllParameters(@PathParam("projectLocator") Locator locator);

  @POST
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parameters")
  Response setParameter(@PathParam("projectLocator") Locator locator);

  @PUT
  @Consumes("text/plain")
  @Produces("text/plain")
  @Path("/{projectLocator}/parameters/{name}")
  Response putParameter(@PathParam("projectLocator") Locator locator, @PathParam("name") String name);

  @GET
  @Produces("text/plain")
  @Path("/{projectLocator}/parameters/{name}")
  Response getParameterValue(@PathParam("projectLocator") Locator locator, @PathParam("name") String name);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parameters/{name}")
  Response getParameter(@PathParam("projectLocator") Locator locator, @PathParam("name") String name);

  @DELETE
  @Path("/{projectLocator}/parameters/{name}")
  void deleteParameter(@PathParam("projectLocator") Locator locator, @PathParam("name") String name);

  @GET
  @Produces("text/plain")
  @Path("/{projectLocator}/buildTypes/{btLocator}/{field}")
  Response serveBuildTypeFieldWithProject(@PathParam("field") String field, @PathParam("projectLocator") Locator locator, @PathParam("btLocator") String btLocator);

  @GET
  @Produces("text/plain")
  @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}")
  Response serveBuildFieldWithProject(@PathParam("field") String field, @PathParam("projectLocator") Locator locator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator);

  @PUT
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parentProject")
  Response setParentProject(@PathParam("projectLocator") Locator locator);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/parentProject")
  Response getParentProject(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/agentPools")
  Response getProjectAgentPools(@PathParam("projectLocator") Locator locator);

  @POST
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/agentPools")
  Response setProjectAgentPools(@PathParam("projectLocator") Locator locator);

  @DELETE
  @Path("/{projectLocator}/agentPools/{agentPoolLocator}")
  void getProjectAgentPools(@PathParam("projectLocator") Locator locator, @PathParam("agentPoolLocator") String agentPoolLocator);

  @PUT
  @Consumes("text/plain")
  @Produces("text/plain")
  @Path("/{projectLocator}/{field}")
  Response setProjectFiled(@PathParam("field") String field, @PathParam("projectLocator") Locator locator);

  @GET
  @Produces("text/plain")
  @Path("/{projectLocator}/{field}")
  Response serveProjectField(@PathParam("field") String field, @PathParam("projectLocator") Locator locator);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes")
  Response serveBuildTypesInProject(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @POST
  @Consumes("text/plain")
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes")
  Response createEmptyBuildType(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @POST
  @Consumes({"application/xml", "application/json"})
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes")
  Response createBuildType(@PathParam("projectLocator") Locator locator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes/{btLocator}")
  Response serveBuildType(@PathParam("projectLocator") Locator locator, @PathParam("btLocator") String btLocator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/templates/{btLocator}")
  Response serveBuildTypeTemplates(@PathParam("projectLocator") Locator locator, @PathParam("btLocator") String btLocator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/newProjectDescription")
  Response getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("projectLocator") Locator locator, @QueryParam("id") String id);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/example/newProjectDescription")
  Response getExampleNewProjectDescription(@PathParam("projectLocator") Locator locator, @QueryParam("id") String id);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{locator}")
  Project getProject(@PathParam("locator") Locator locator/*, @QueryParam("fields") String fields*/);

  @DELETE
  @Path("/{projectLocator}")
  void deleteProject(@PathParam("projectLocator") Locator locator);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes/{btLocator}/builds")
  Response serveBuilds(@PathParam("projectLocator") Locator plocator, @PathParam("btLocator") String btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser,
                       @QueryParam("includePersonal") Boolean includePersonal, @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag,
                       @QueryParam("agentName") String agentName, @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start,
                       @QueryParam("count") Integer count, @QueryParam("locator") String locator/*, @QueryParam("fields") String fields*/);

  @GET
  @Produces({"application/xml", "application/json"})
  @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}")
  Response serveBuildWithProject(@PathParam("projectLocator") Locator locator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator/*, @QueryParam("fields") String fields*/);

}
