/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/agentPools")
public interface AgentPoolsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getPools();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response setPools();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response addProject(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response getPoolProjects(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response replaceProjects(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Response getPoolAgents(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Response addAgent(@PathParam("agentPoolLocator") String agentPoolLocator);

    @DELETE
    @Path("/{agentPoolLocator}")
    void deletePool(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}")
    Response getPool(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    Response getPoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    void deletePoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator);

}
