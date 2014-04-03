/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/buildQueue")
public interface BuildQueueResource {

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response replaceBuilds(@QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response queueNewBuild();

    @DELETE
    void deleteBuildsExperimental(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    Response getBuilds(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{queuedBuildLocator}")
    void deleteBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Response cancelBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Response getBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}/compatibleAgents")
    Response serveCompatibleAgents(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/{field}")
    Response serveBuildFieldByBuildOnly(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator);

}
