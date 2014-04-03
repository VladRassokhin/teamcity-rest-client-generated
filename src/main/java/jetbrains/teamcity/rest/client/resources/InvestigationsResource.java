/**
 * Created by Apache CXF WadlToJava code generator
**/
package jetbrains.teamcity.rest.client.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/app/rest/investigations")
public interface InvestigationsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getInvestigations(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{investigationLocator}")
    Response serveInstance(@PathParam("investigationLocator") String investigationLocator, @QueryParam("fields") String fields);

}
