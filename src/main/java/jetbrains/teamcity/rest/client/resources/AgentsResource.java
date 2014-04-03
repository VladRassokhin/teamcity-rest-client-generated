/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/agents")
public interface AgentsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveAgents(@QueryParam("includeDisconnected") Boolean includeDisconnected, @QueryParam("includeUnauthorized") Boolean includeUnauthorized, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    Response getAgentPool(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    Response setAgentPool(@PathParam("agentLocator") String agentLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}")
    Response serveAgent(@PathParam("agentLocator") String agentLocator);

    @DELETE
    @Path("/{agentLocator}")
    void deleteAgent(@PathParam("agentLocator") String agentLocator);

    @GET
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response serveAgentField(@PathParam("field") String field, @PathParam("agentLocator") String agentLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response setAgentField(@PathParam("field") String field, @PathParam("agentLocator") String agentLocator);

}
